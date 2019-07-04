B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
End Sub

#if css
	.col1 { background-color:#ffc0c0; }
	.col2 { background-color:#c0ffc0; }
	.col3 { background-color:#ffffc0; }
#End If

'Initializes the pagae
Public Sub Init(pgContainer As String)
	Dim e As BANanoEvent
	'initialize the page, we want it to be a layout and the type should be wide
	pg.Initialize("wp", pgContainer).SetTypeWide("").SetHeader("Lesson 1: Layouts").SetView("layout").SetResponsive("master")
	'row 1, make it a header with Hello content and add it to the rows collection of the page
	Dim R1 As WixElement
	R1.Initialize("R1").SetType("header").SetTemplate("R1: Hello").AddToRows(pg.Page)
	'
	Dim R2 As WixElement
	R2.Initialize("R2").SetTemplate("R2: Greetings, human!").AddToRows(pg.Page) 
	'
	Dim R3 As WixElement
	R3.Initialize("R3").SetGravity(2)
	' create a column and add it to R3
	Dim R3C1 As WixElement
	R3C1.Initialize("R3C1").SetCSS("col1").SetTemplate("R3C1: Webix").AddToColumns(R3)
	'
	R3.AddResizerToColumns("")
	'
	Dim R3C2 As WixElement
	R3C2.Initialize("R3C2").SetCSS("col2").SetTemplate("R3C2: Is").AddToColumns(R3)
	'
	R3.AddResizerToColumns("")
	'
	Dim R3C3 As WixElement
	R3C3.Initialize("R3C3").SetCSS("col3").SetTemplate("R3C3: Cool").AddToColumns(R3)
	'
	R3.AddToRows(pg.Page)
	'
	Dim R4 As WixElement
	R4.Initialize("R4").SetType("header").SetTemplate("R4: Goodbye").AddToRows(pg.Page)
	'
	Dim r5 As WixElement
	r5.Initialize("R5").SetHeight(50)
	'
	Dim R5C1 As WixElement
	R5C1.Initialize("R5C1").SetTemplate("Fare thee well!").AddToColumns(r5)
	'
	Dim r5c2 As WixElement
	r5c2.Initialize("R5C2").SetView("button").SetWidth(150).SetType("iconButton").SetIcon("users").SetLabel("Click for fun")
	r5c2.SetClick(BANano.CallBack(Me,"r5c2_click",e))
	r5c2.AddToColumns(r5)
	'
	r5.AddToRows(pg.Page)
	 
	'render the page
	pg.ui
End Sub

Sub r5c2_click(e As BANanoEvent)
	pg.ToastError("See?<br><br>Wasn't that fun?!")
End Sub
