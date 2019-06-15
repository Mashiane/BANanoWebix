B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public DataTable As WixElement
	Private Data As List
	Private AutoConfig As Boolean
End Sub

'Initializes the data table
Public Sub Initialize(tID As String) As WixDataTable
	ID = tID.ToLowerCase
	DataTable.Initialize(ID).SetView("datatable")
	AutoConfig = False
	Return Me
End Sub

'return the data table context
Sub Item As Map
	DataTable.SetAttr("autoConfig", AutoConfig)
	DataTable.SetAttr("data", Data)
	Return DataTable.item
End Sub

'set Data
Sub SetData(d As List) As WixDataTable
	Data = d
	Return Me
End Sub

'set autoConfig
Sub SetAutoConfig(a As Boolean) As WixDataTable
	AutoConfig = a
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
