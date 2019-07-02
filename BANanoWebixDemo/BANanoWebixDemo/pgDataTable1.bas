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

'Initializes the object. You can add parameters to this method if needed.
Public Sub Init(pgContainer As String)
	pg.Initialize("forms", pgContainer).SetHeader("Lesson 8.2: DataTable")
	'
	Dim R1 As WixRow
	R1.Initialize("R1")
	
	Dim filmset As List
	filmset.Initialize
	filmset.Add(CreateMap("marker" : "#ff0000", "title" : "Star Trek: TOS", "network" : "CBS",	"seasons" : 3))
	filmset.Add(CreateMap("marker" : "#00ff00", "title" : "Firefly", "network" : "Fox", "seasons" :"TOO FEW!!"))
	filmset.Add(CreateMap("marker" : "#0000ff", "title" : "Cheers", "network" : "NBC", "seasons" : 11))
	filmset.Add(CreateMap("marker" : "#ffff00", "title" : "Suits", "network" : "USA", "seasons" : "7 (And counting)"))
	filmset.Add(CreateMap("marker" : "#ff00ff", "title" : "Babylon 5", "network" : "PTN",	"seasons" : "5"))
	'
	Dim dt1 As WixDataTable
	dt1.Initialize("dt1").Seteditable(True)
	dt1.SetSelect(dt1.DT_SELECT_ROW)	' set selection to be by row
	dt1.SetAutoWidth(True)  'adjust width of columns automatically
	dt1.SetStyle("margin", "10px").SetBorderLess(False)
	'
	Dim c1 As WixDataColumn
	Dim t As String = MarkerColor
	c1.Initialize(dt1, "marker").SetHeader(" ").SetWidth(38).SetTemplate(t).SetEditor("color").Pop
	'
	Dim c2 As WixDataColumn
	c2.Initialize(dt1, "title").Setheader("Show title").SetWidth(140).SetSort("string").Pop
	'
	Dim c3 As WixDataColumn
	c3.Initialize(dt1, "network").SetHeader("Network").SetWidth(100).SetEditor("text").Pop
	'
	Dim c4 As WixDataColumn
	c4.Initialize(dt1, "seasons").SetHeader("Seasons").SetFillSpace(True).Pop
	'
	dt1.AddEditTrash
	
	dt1.SetData(filmset)
	'
	R1.AddItem(dt1.Item)
'	'
	pg.AddRow(R1)
	'
	pg.UI
	'
	Dim row As Map
	pg.OnItemClick("dt1", BANano.CallBack(Me, "itemClick", Array(row)))
End Sub

Sub itemClick(row As Map)
	'get the row
	Dim rowid As String = row.Get("row")
	rowid = pg.CStr(rowid)
	'get the column selected
	Dim cID As String = row.Get("column")
	'get the item
	Dim record As Map = pg.GetItem("dt1", rowid)
	Select Case cID
	Case "edit"
		'display a message
		pg.Message(BANano.ToJson(record))
	Case "delete"
		'prompt to confirm
		Dim resp As Boolean = BANano.Window.Confirm("Are you sure you want to delete this record?")
		If resp Then
			pg.Remove("dt1", rowid)
		End If
	End Select
	'
End Sub

'template for color
Sub MarkerColor As String
	Dim sout As UOENowHTML
	sout.Initialize("","span")
	sout.IsImportant = False
	sout.AddStyle("background-color", "#marker#")
	sout.AddStyle("border-radius", "20px")
	sout.AddStyle("padding-right", "10px")
	sout.AddContent("&nbsp&nbsp")
	Return sout.html
End Sub
