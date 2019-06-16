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
Public Sub Init()
	pg.Initialize("forms")
	
	Dim R1 As WixRow
	R1.Initialize("R1")
	Dim hdr As WixHeader
	hdr.Initialize("hdr")
	hdr.Header.SetTemplate("Webix DataTable")
	R1.AddItem(hdr.Item)
	
	Dim btnB As WixButton
	btnB.Initialize("btnB").SetLabel("Back").SetClick(BANano.CallBack(Me,"backtomain",Null))
	R1.AddItem(btnB.Item)
	
	
	Dim filmset As List
	filmset.Initialize
	filmset.Add(CreateMap("id":1, "title":"The Shawshank Redemption", "year":1994))
	filmset.Add(CreateMap("id":2, "title":"The Godfather", "year":1972))
	filmset.Add(CreateMap("id":3, "title":"The Godfather: Part II", "year":1974))
	filmset.Add(CreateMap("id":4, "title":"The Good, the Bad and the Ugly", "year":1966))
	filmset.Add(CreateMap("id":5, "title":"My Fair Lady", "year":1964))
	filmset.Add(CreateMap("id":6, "title":"12 Angry Men", "year":1957))
	
	'define data table
	Dim dt As WixDataTable
	dt.Initialize("dt").SetAutoConfig(True).SetData(filmset)
	R1.AddItem(dt.Item)
	'
	pg.Page.AddRow(R1)
	'
	pg.UI
End Sub


Sub backtomain()
	pgIndex.Init
End Sub