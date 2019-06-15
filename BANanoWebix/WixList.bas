B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public List As WixElement
	Public ID As String
	Private EnableSelect As Boolean
	Private Data As List
	Private Dollar As BANanoObject
	Private onAfterSelect As BANanoObject
End Sub

'Initializes list object
Public Sub Initialize(pg As WixPage, lID As String) As WixList
	ID = lID.tolowercase
	List.Initialize(ID).SetView("list")
	Dollar = pg.Dollar
	Return Me
End Sub

'add to column
Sub AddToColumn(c As WixColumn)
	c.AddItem(Item)
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub

'add to toolbar
Sub AddToToolbar(tblB As WixToolBar)
	tblB.AddItem(Item)
End Sub

'set height
Sub SetHeight(h As Int) As WixList
	List.Height = h
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixList
	List.Width = w
	Return Me
End Sub

'set enableselect
Sub SetEnableSelect(b As Boolean) As WixList
	EnableSelect = b
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixList
	Data = d
	Return Me
End Sub

'set on after select
Sub SetOnAfterSelect(b As BANanoObject) As WixList
	onAfterSelect = b
	Return Me
End Sub

'return the object
Sub Item As Map
	List.SetAttr("select", EnableSelect)
	List.SetAttr("data", Data)
	Return List.item
End Sub

'add a record to the list
Sub Add(record As Map)
	Dollar.Selector(ID).RunMethod("add",Array(record))
End Sub

'update an existing record
Sub Update(recordID As String, record As Map)
	Dollar.Selector(ID).RunMethod("updateItem",Array(recordID,record))
End Sub

'get an item
Sub GetItem(recordID As String) As Map
	Dim values As Map = Dollar.Selector(ID).RunMethod("getItem",Array(recordID)).Result
	Return values
End Sub

'attach events after page is created
Sub AttachAfterSelectEvent()
	Dollar.Selector(ID).RunMethod("attachEvent",Array("onAfterSelect",onAfterSelect))
End Sub

'remove an item
Sub Remove(recID As String)
	If recID = "" Then Return
	Dollar.Selector(ID).RunMethod("remove",Array(recID))
End Sub

'get the selected item id
Sub GetSelectedID As String
	Dim recID As String = Dollar.Selector(ID).RunMethod("getSelectedId",Null).Result
	Return recID
End Sub

'set template
Sub SetTemplate(t As String) As WixList
	List.Template = t
	Return Me
End Sub