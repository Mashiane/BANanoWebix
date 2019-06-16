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
Public Sub Init
	'initialize the page, we want it to be a layout and the type should be wide
	pg.Initialize("").SetClean
	'different layouts
	'
	Dim l1 As WixElement
	l1.Initialize("l1").SetTemplate("line-1")
	Dim l2 As WixElement
	l2.Initialize("l2").SetTemplate("line-2")
	Dim l3 As WixElement
	l3.Initialize("l3").SetTemplate("line-3") 
	
	Dim line As WixLayout
	line.Initialize("linel").setline
	'add each of the elements to the line layout
	line.AddColumns(l1.item)
	line.AddColumns(l2.item)
	line.AddColumns(l3.item)
	'add line layout to the rows collection of the page element
	line.AddToRows(pg.Page)
	
	'create a wide layout 
	Dim wide As WixLayout
	wide.Initialize("widel").SetWide
	'create contents and add to columns collection
	Dim w1 As WixElement
	w1.Initialize("w1").SetTemplate("wide-1").AddToColumns(wide.Layout)
	Dim w2 As WixElement
	w2.Initialize("w2").SetTemplate("wide-2").AddToColumns(wide.Layout)
	Dim w3 As WixElement
	w3.Initialize("w3").SetTemplate("wide-3").AddToColumns(wide.Layout)
	wide.AddToRows(pg.Page)
	 
	Dim space As WixLayout
	space.Initialize("spacel").SetSpace
	Dim s1 As WixElement
	s1.Initialize("s1").SetTemplate("space-1")
	Dim s2 As WixElement
	s2.Initialize("s2").SetTemplate("space-2")
	Dim s3 As WixElement
	s3.Initialize("s3").SetTemplate("space-3")
	'
	space.AddColumns(s1.item)
	space.AddColumns(s2.item)
	space.AddColumns(s3.item)
	'
	space.AddToRows(pg.Page)
	
	Dim head As WixLayout
	head.Initialize("headl").sethead
	Dim h1 As WixElement
	h1.Initialize("h1").SetTemplate("head-1")
	Dim h2 As WixElement
	h2.Initialize("h2").SetTemplate("head-2")
	Dim h3 As WixElement
	h3.Initialize("h3").SetTemplate("head-3")
	'
	head.AddColumns(h1.item)
	head.AddColumns(h2.item)
	head.AddColumns(h3.item)
	head.AddToRows(pg.Page)
	'
	Dim form As WixLayout
	form.Initialize("forml").setform
	Dim f1 As WixElement
	f1.Initialize("f1").SetTemplate("form-1").AddToColumns(form.Layout)
	Dim f2 As WixElement
	f2.Initialize("f2").SetTemplate("form-2").AddToColumns(form.Layout)
	Dim f3 As WixElement
	f3.Initialize("f3").SetTemplate("form-3").AddToColumns(form.Layout)
	form.AddToRows(pg.Page)
	
	pg.ui
End Sub