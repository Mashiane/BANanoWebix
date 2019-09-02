B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public AccordionItem As WixElement
	Public Parent As WixElement

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sid As String) As WixAccordionItem
	ID = sid.ToLowerCase
	AccordionItem.Initialize(ID).setview("accordionitem")
	Parent = Null
	Return Me
End Sub

'set the parent
Sub SetParent(p As WixElement) As WixAccordionItem
	Parent = p
	Return Me
End Sub


'set css
Sub SetStyle(prop As String, sval As String) As WixAccordionItem
	AccordionItem.SetStyle(prop,sval)
	Return Me
End Sub

'add tp columns of parent
Sub Pop
	Parent.AddColumns(Item)
End Sub

Sub SetTemplateHTML(h As UOENowHTML) As WixAccordionItem
	h.SetImportant(False)
	Dim os As String = h.HTML
	AccordionItem.SetTemplate(os)
	Return Me
End Sub

'set collapsed
Sub SetCollapsed(b As Object) As WixAccordionItem
	AccordionItem.SetAttr("collapsed", b)
	Return Me
End Sub

Sub SetBody(t As Object) As WixAccordionItem
	AccordionItem.SetBody(t)
	Return Me
End Sub

'set header
Sub SetHeader(T As String) As WixAccordionItem
	AccordionItem.SetHeader(t)
	Return Me
End Sub

Sub SetBorderless(b As Boolean) As WixAccordionItem
	AccordionItem.SetAttr("borderless", b)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return AccordionItem.item
End Sub

'set header height
Sub SetHeaderHeight(h As Object) As WixAccordionItem
	AccordionItem.SetAttr("headerHeight", h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixAccordionItem
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		AccordionItem.SetAttr(strKey, strVal)
	Next
	Return Me
End Sub
