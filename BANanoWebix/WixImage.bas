B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Image As WixElement
	Private img As UOENowHTML
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixImage
	ID = sid.ToLowerCase
	Image.Initialize(ID).SetView("template") 
	img.Initialize("","img")
	img.SetStyle("width","100%")
	img.SetStyle("height","100%")
	Image.SetCSS("form_photo")
	Return Me
End Sub

Sub SetValue(s As Object) As WixImage   'ignore
	img.SetSRC(s,True)
	Return Me	
End Sub	

Sub SetImageStyle(p As String, v As String) As WixImage    'ignore
	img.SetStyle(p, v)
	Return Me
End Sub

Sub AddImageClass(lst As List) As WixImage     'ignore
	For Each lv As String In lst
		img.AddClass(lv)	
	Next
	Return Me
End Sub

Sub SetImageAttr(p As String, v As String) As WixImage     'ignore
	img.SetAttr(p,v)
	Return Me
End Sub

Sub Item As Map
	Image.SetTemplateHTML(img)
	Return Image.Item
End Sub
 
private Sub GetTemplate() As String
 	Return img.html
End Sub

'set height
Sub SetHeight(h As Object) As WixImage
	Image.setHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixImage
	Image.SetWidth(w)
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, val As String) As WixImage
	Image.SetStyle(prop,val)
	Return Me
End Sub

Sub SetBorderLess(b As Object) As WixImage
	Image.SetBorderLess(b)
	Return Me
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(P As WixElement)
	P.AddColumns(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub

Sub Refresh(pg As WixPage)
	Dim t As String = GetTemplate
	Dim opt As Map = CreateMap()
	opt.Put("template", t)
	pg.Define(ID, opt)
	pg.Refresh(ID)
End Sub
