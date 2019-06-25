B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Dollar As BANanoObject
	Public webix As BANanoObject
	Private BANano As BANano  'ignore
	Public Page As WixElement
	Public ID As String
	Public EnumButtonTypes As WixButtonTypes
	Public EnumLayoutTypes As WixLayoutTypes
	Private hints As Map
End Sub

'initialize the page
Public Sub Initialize(pgID As String) As WixPage
	hints.Initialize 
	Dollar.Initialize("$$")
	ID = pgID.tolowercase
	webix.Initialize("webix")
	Page.Initialize(ID)
	Page.Container = "body" 
	'empty the body
	BANano.GetElement("#body").empty
	'init other stuff
	EnumButtonTypes.Initialize
	EnumLayoutTypes.Initialize  
	Return Me
End Sub

'define to update properties
Sub Define(eID As String, properties As Map)
	eID = eID.ToLowerCase
	Dollar.Selector(eID).RunMethod("define",Array(properties))
End Sub

'set a hint for input element
Sub SetHint(eID As String, sHint As String)
	eID = eID.tolowercase
	hints.Put(eID,sHint)
End Sub

'attach events after page is created
Sub AttachOnChangeEvent(eID As String, onChange As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onChange",onChange))
End Sub


'Refresh
Sub Refresh(eID As String)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("refresh",Null)
End Sub

'freeze row
Sub FreezeRow(dtID As String, r As Int)
	dtID = dtID.ToLowerCase
	Dollar.Selector(dtID).RunMethod("freezeRow", Array(r))
End Sub

'moveBottom
Sub MoveBottom(dtID As String, r As Int)
	dtID = dtID.ToLowerCase
	Dollar.Selector(dtID).RunMethod("moveBottom", Array(r))
End Sub

'moveTop
Sub MoveTop(dtID As String, r As Int)
	dtID = dtID.ToLowerCase
	Dollar.Selector(dtID).RunMethod("moveTop", Array(r))
End Sub

'move
Sub Move(dtID As String, r As Int)
	dtID = dtID.ToLowerCase
	Dollar.Selector(dtID).RunMethod("move", Array(r))
End Sub

'set header title of the page
Sub SetHeader(sTitle As String) As WixPage
	'create a header to add to the page
	Dim hdr As WixHeader
	hdr.Initialize("hdr")
	hdr.Header.SetTemplate(sTitle)
	hdr.Header.AddToRows(Page)
	Return Me
End Sub

'set the item value
Sub SetValue(itm As String, value As String)
	itm = itm.ToLowerCase
	Dollar.Selector(itm).RunMethod("setValue",Array(value))
End Sub

'get an item value
Sub GetValue(itm As String) As String
	itm = itm.ToLowerCase
	Dim res As String
	res = Dollar.Selector(itm).RunMethod("getValue",Null).result
	Return res
End Sub

'set the form values
Sub SetValues(itm As String, values As Map)
	itm = itm.ToLowerCase
	Dollar.Selector(itm).RunMethod("setValues",Array(values))
End Sub

'get the form values
Sub GetValues(itm As String) As Map
	itm = itm.ToLowerCase
	Dim res As Map
	res = Dollar.Selector(itm).RunMethod("getValues",Null).result
	Return res
End Sub

'hide an element
Sub HideIT(itmID As String)
	itmID = itmID.ToLowerCase
	Dollar.Selector(itmID).RunMethod("hide","")
End Sub

'show an element
Sub ShowIT(itmID As String)
	itmID = itmID.ToLowerCase
	Dollar.Selector(itmID).RunMethod("show","")
End Sub

'enable an element
Sub EnableIT(itmID As String)
	itmID = itmID.ToLowerCase
	Dollar.Selector(itmID).RunMethod("enable","")
End Sub

'disable an element
Sub DisableIT(itmID As String)
	itmID = itmID.ToLowerCase
	Dollar.Selector(itmID).RunMethod("disable","")
End Sub

'render the page UX
Sub UI
	webix.RunMethod("ui",Page.item)
	'add hints
	For Each sHint As String In hints.Keys
		Dim sValue As String = hints.Get(sHint)
		SetBottomText(sHint, sValue)
	Next
End Sub

'message user
Sub Message(msg As String)
	webix.RunMethod("message", Array(msg))
End Sub

'show an error message
Sub ToastError(Text As String)
	Dim msg As Map = CreateMap()
	msg.put("type","error")
	msg.put("text", Text)
	webix.RunMethod("message", Array(msg))
End Sub

'confirm dialog
Sub Confirm(CallBack As BANanoObject, stitle As String, stext As String)
	Dim opt As Map = CreateMap()
	opt.Put("title", stitle)
	opt.Put("text", stext)
	opt.Put("callback", CallBack)
	webix.RunMethod("confirm", opt)
End Sub

'clear the form
Sub Clear(itm As String)
	itm = itm.tolowercase
	Dollar.Selector(itm).RunMethod("clear",Null)
End Sub

'add a record to the list
Sub Add(listID As String, record As Map)
	listID = listID.tolowercase
	Dollar.Selector(listID).RunMethod("add",Array(record))
End Sub

Sub CStr(o As Object) As String
	Return "" & o
End Sub

'update item
Sub UpdateItem(ownerID As String, recID As String, recData As Map)
	ownerID = ownerID.ToLowerCase
	recID = recID.tolowercase
	Dollar.Selector(ownerID).RunMethod("updateItem",Array(recID, recData))
End Sub

'get an item
Sub GetItem(listID As String, recordID As String) As Map
	listID = listID.ToLowerCase
	recordID = recordID.tolowercase
	Dim values As Map = Dollar.Selector(listID).RunMethod("getItem",Array(recordID)).Result
	Return values
End Sub

'on after select event
Sub OnAfterSelect(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterSelect",cb))
End Sub

Sub OnItemClick(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onItemClick",cb))
End Sub


'on after unselect event
Sub OnAfterUnSelect(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterUnSelect",cb))
End Sub

'on after unselect event
Sub OnSelectChange(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onSelectChange",cb))
End Sub

'serialize all data
Sub Serialize(eID As String, bAll As Boolean) As List
	eID = eID.ToLowerCase
	Dim res As List = Dollar.Selector(eID).RunMethod("serialize",Array(bAll)).result
	Return res
End Sub

'remove an item from a list
Sub Remove(listID As String, recID As String)
	listID = listID.tolowercase
	If recID = "" Then Return
	Dollar.Selector(listID).RunMethod("remove",Array(recID))
End Sub

'get the selected item id
Sub GetSelectedID(listID As String) As String
	listID = listID.tolowercase
	Dim recID As String = Dollar.Selector(listID).RunMethod("getSelectedId",Null).Result
	Return recID
End Sub

'get the selected item
Sub GetSelected(listID As String) As Object
	listID = listID.tolowercase
	Dim recID As String = Dollar.Selector(listID).RunMethod("getSelected",Null).Result
	Return recID
End Sub

'get the selected item
Sub GetSelectedItem(listID As String) As Map
	listID = listID.tolowercase
	Dim recID As Map = Dollar.Selector(listID).RunMethod("getSelectedItem",Null).Result
	Return recID
End Sub

'get the selected item
Sub Exists(listID As String, eID As String) As Object
	listID = listID.tolowercase
	Dim recID As String = Dollar.Selector(listID).RunMethod("exists",Array(eID)).Result
	Return recID
End Sub

'show an item
Sub ShowItem(listID As String, eID As String)
	listID = listID.tolowercase
	Dollar.Selector(listID).RunMethod("showItem",Array(eID))
End Sub

'get dirty values
Sub GetDirtyValues(frmID As String) As Map
	frmID = frmID.ToLowerCase
	Dim rec As Map = CreateMap()
	rec = Dollar.Selector(frmID).RunMethod("getDirtyValues",Null).Result
	Return rec
End Sub

'get clean values
Sub GetCleanValues(frmID As String) As Map
	frmID = frmID.ToLowerCase
	Dim rec As Map = CreateMap()
	rec = Dollar.Selector(frmID).RunMethod("getCleanValues",Null).Result
	Return rec
End Sub

'set hint
Sub SetBottomText(eID As String, eText As String)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("setBottomText",Array(eText))
End Sub

'adjust
Sub Adjust(eID As String)
	eID = eID.ToLowerCase
	Dollar.Selector(eID).RunMethod("adjust",Null)
End Sub

'resize
Sub Resize(eID As String)
	eID = eID.ToLowerCase
	Dollar.Selector(eID).RunMethod("resize",Null)
End Sub

'clear all
Sub ClearAll(eID As String)
	eID = eID.ToLowerCase
	Dollar.Selector(eID).RunMethod("clearAll",Null)
End Sub

'parse data, typeOf 'json' (default), 'xml', 'csv', 'jsarray'
Sub Parse(eID As String, data As List, typeOf As String)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("parse",Array(data, typeOf))
End Sub

'bind a form to a datatable
Sub Bind(frmID As String, datTableID As String)
	frmID = frmID.ToLowerCase
	datTableID = datTableID.ToLowerCase
	Dollar.Selector(frmID).RunMethod("bind",Array(datTableID))
End Sub

'save the form when a form is bound
Sub Save(frmID As String)
	frmID = frmID.tolowercase
	Dollar.Selector(frmID).RunMethod("save",Null)
End Sub

'export element to png
Sub Export2PNG(eID As String)
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	'set options
	Dim opt As Map = CreateMap("filename": eID & ".png")
	'execute the stuff
	webix.RunMethod("toPNG", Array(itm, opt))
End Sub

'export element to excel
Sub Export2Excel(eID As String)
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	'set options
	Dim opt As Map = CreateMap("filename": eID & ".png")
	'execute the stuff
	webix.RunMethod("toExcel", Array(itm, opt))
End Sub

'export element to pdf
Sub Export2PDF(eID As String)
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	'set options
	Dim opt As Map = CreateMap("filename": eID & ".png")
	'execute the stuff
	webix.RunMethod("toPDF", Array(itm, opt))
End Sub

'export element to csv
Sub Export2CSV(eID As String)
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	'set options
	Dim opt As Map = CreateMap("filename": eID & ".png")
	'execute the stuff
	webix.RunMethod("toCSV", Array(itm, opt))
End Sub
