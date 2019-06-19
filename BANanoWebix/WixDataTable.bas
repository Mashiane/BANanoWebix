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
	Private AutoConfig As Boolean
End Sub

'Initializes the data table
Public Sub Initialize(tID As String) As WixDataTable
	ID = tID.ToLowerCase
	DataTable.Initialize(ID).SetView("datatable")
	AutoConfig = False
	Return Me
End Sub

'add header
Sub AddHeader(sid As String, sheader As String, iFillSpace As Int) As WixDataTable
	Dim col As Map = CreateMap()
	col.Put("id", sid)
	col.Put("header", sheader)
	If iFillSpace > 0 Then 
		col.Put("fillspace", iFillSpace)
	End If
	DataTable.AddColumns(col)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(tt As String) As WixDataTable
	DataTable.SetTooltip(tt)
	Return Me
End Sub

'return the data table context
Sub Item As Map
	DataTable.SetAttr("autoConfig", AutoConfig)
	Return DataTable.item
End Sub

'set autoConfig
Sub SetAutoConfig(a As Boolean) As WixDataTable
	AutoConfig = a
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixDataTable
	DataTable.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Int) As WixDataTable
	DataTable.SetWidth(h)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'set Data
Sub SetData(data As List) As WixDataTable
	DataTable.SetData(data)
	Return Me
End Sub