﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Header As WixElement
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixHeader
	Header.SetTooltip(tt)
	Return Me
End Sub

'initialize the header
Public Sub Initialize(sID As String) As WixHeader
	ID = sID.tolowercase
	Header.Initialize(ID).SetView("template")
	Header.TypeOf = "header"
	Return Me
End Sub

'return the item
Sub Item As Map
	Return Header.item
End Sub

'use a map object
Sub SetMap(m As Map) As WixHeader
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Header.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub
