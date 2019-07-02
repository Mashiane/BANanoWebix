B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private pg As WixPage
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Init(pgContainer As String)
	'initialize the page, we want it to be a layout and the type should be wide
	pg.Initialize("", pgContainer).SetTypeClean("").SetHeader("Lesson 2: Layouts")
	'different layouts
	'
	Dim l1 As WixElement
	l1.Initialize("l1").SetTemplate("line-1")
	Dim l2 As WixElement
	l2.Initialize("l2").SetTemplate("line-2")
	Dim l3 As WixElement
	l3.Initialize("l3").SetTemplate("line-3") 
	
	Dim line As WixLayout
	line.Initialize("linel")
	line.Layout.setTypeline("")
	'add each of the elements to the line layout
	line.Layout.AddColumns(l1.item)
	line.Layout.AddColumns(l2.item)
	line.Layout.AddColumns(l3.item)
	'add line layout to the rows collection of the page element
	line.Layout.AddToRows(pg.Page)
	
	'create a wide layout 
	Dim wide As WixLayout
	wide.Initialize("widel")
	wide.Layout.SetTypeWide("")
	'create contents and add to columns collection
	Dim w1 As WixElement
	w1.Initialize("w1").SetTemplate("wide-1").AddToColumns(wide.Layout)
	Dim w2 As WixElement
	w2.Initialize("w2").SetTemplate("wide-2").AddToColumns(wide.Layout)
	Dim w3 As WixElement
	w3.Initialize("w3").SetTemplate("wide-3").AddToColumns(wide.Layout)
	wide.Layout.AddToRows(pg.Page)
	 
	Dim space As WixLayout
	space.Initialize("spacel")
	space.Layout.SetTypeSpace("")
	Dim s1 As WixElement
	s1.Initialize("s1").SetTemplate("space-1")
	Dim s2 As WixElement
	s2.Initialize("s2").SetTemplate("space-2")
	Dim s3 As WixElement
	s3.Initialize("s3").SetTemplate("space-3")
	'
	space.Layout.AddColumns(s1.item)
	space.Layout.AddColumns(s2.item)
	space.Layout.AddColumns(s3.item)
	'
	space.Layout.AddToRows(pg.Page)
	
	Dim head As WixLayout
	head.Initialize("headl")
	head.Layout.setTypehead("")
	Dim h1 As WixElement
	h1.Initialize("h1").SetTemplate("head-1")
	Dim h2 As WixElement
	h2.Initialize("h2").SetTemplate("head-2")
	Dim h3 As WixElement
	h3.Initialize("h3").SetTemplate("head-3")
	'
	head.Layout.AddColumns(h1.item)
	head.Layout.AddColumns(h2.item)
	head.Layout.AddColumns(h3.item)
	head.Layout.AddToRows(pg.Page)
	'
	Dim form As WixLayout
	form.Initialize("forml")
	form.Layout.setTypeform("")
	Dim f1 As WixElement
	f1.Initialize("f1").SetTemplate("form-1").AddToColumns(form.Layout)
	Dim f2 As WixElement
	f2.Initialize("f2").SetTemplate("form-2").AddToColumns(form.Layout)
	Dim f3 As WixElement
	f3.Initialize("f3").SetTemplate("form-3").AddToColumns(form.Layout)
	form.Layout.AddToRows(pg.Page)
	
	pg.ui
End Sub