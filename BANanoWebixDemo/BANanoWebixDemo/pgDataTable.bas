B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public myForm As WixForm
	Public BANano As BANano
End Sub

'lets set a hover class
#if css
	.dthover {background: #F0DCB6;}
#End If

'Initializes the object. You can add parameters to this method if needed.
Public Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetResponsive("master")
	pg.SetHeader("Lesson 8.1: DataTable")
	
	Dim R1 As WixRow
	R1.Initialize("R1")
	
	'create the datasource	
	Dim filmset As List
	filmset.Initialize
	filmset.Add(CreateMap("title" : "Star Trek: TOS", "network" : "CBS",	"seasons" : 3))
	filmset.Add(CreateMap("title" : "Firefly", "network" : "Fox", "seasons" :"TOO FEW!!"))
	filmset.Add(CreateMap("title" : "Cheers", "network" : "NBC", "seasons" : 11))
	filmset.Add(CreateMap("title" : "Suits", "network" : "USA", "seasons" : "7 (And counting)"))
	filmset.Add(CreateMap("title" : "Babylon 5", "network" : "PTN",	"seasons" : "5"))
	
	'define data table
	Dim dt As WixDataTable
	dt.Initialize("dt")
	dt.SetColumnWidth(200)		
	dt.SetSelect(dt.DT_SELECT_ROW)	
	'dt.SetAutoWidth(True)  
	dt.SetData(filmset)		
	dt.SetAutoConfig(True)
	dt.SetHover("dthover")		
	dt.SetResizeColumn(True)	
	'
	R1.AddItem(dt.Item)
'	'
	pg.AddRow(R1)
	'
	pg.UI
	'attach the select event
	Dim row As Map
	Dim cb As BANanoObject = BANano.CallBack(Me,"record_selected",Array(row))
	pg.OnAfterSelect("dt", cb)
End Sub

Sub record_selected(row As Map)
	'get the row
	Dim rowid As String = row.Get("row")
	'convert to string
	rowid = pg.CStr(rowid)
	'get the column selected
	Dim cID As String = row.Get("column")
	'get the item
	Dim record As Map = pg.GetItem("dt", rowid)
	'
	pg.Message(BANano.ToJson(record))
End Sub