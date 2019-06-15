﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Row As WixElement
	Public ID As String
End Sub

'Initializes the row.
Public Sub Initialize(rID As String) As WixRow
	ID = rID.tolowercase
	Row.Initialize(ID)
	Return Me 
End Sub

'return the item
Sub Item As Map
	Return Row.item
End Sub

'add an item
Sub AddItem(wxEL As Map) As WixRow
	Row.AddRows(wxEL)
	Return Me
End Sub

'add column to a row
Sub AddColumn(wxEL As WixColumn) As WixRow
	Row.AddColumns(wxEL.Item)
	Return Me
End Sub


'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.AddItem(Item)
End Sub

'add to page
Sub AddToPage(p As WixPage)
	p.Page.AddRows(Item)
End Sub