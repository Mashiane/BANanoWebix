B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Accordion As WixElement
	Private Horizontal As Boolean
End Sub

'Initializes the accordion
Public Sub Initialize(sid As String) As WixAccordion
	ID = sid.tolowercase
	Accordion.Initialize(ID)
	Accordion.SetView("accordion")
	SetHorizontal(True)
	Return Me
End Sub

'set collapsed
Sub SetCollapsed(b As Boolean) As WixAccordion
	Accordion.SetProperty("collapsed", b)
	Return Me
End Sub

'set vertical
Sub SetHorizontal(b As Boolean) As WixAccordion
	Horizontal = b
	Return Me	
End Sub

'set multi
Sub SetMulti(b As Boolean) As WixAccordion
	Accordion.SetAttr("multi", b)
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Accordion.item
End Sub

'add an item
Sub AddItem(iID As String, header As String, body As String, width As Int, bCollapsed As Boolean) As WixElement
	iID = iID.tolowercase
	Dim h As WixElement
	h.Initialize(iID)
	h.SetHeader(header)
	h.SetBody(body)
	h.SetWidth(width)
	h.SetCollapsed(bCollapsed)
	If Horizontal = True Then
		Accordion.AddRows(h.Item)
	Else
		Accordion.AddColumns(h.Item)
	End If
	Return h
End Sub