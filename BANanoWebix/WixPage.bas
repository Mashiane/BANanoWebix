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
	Private uniteFld As String
	Private ulName As String
	Private BANano As BANano  'ignore
	Public EnumWixIcons As WixIcons
End Sub

'unflatten as list of map objects using id, parentid, data attributes
Sub Unflatten(data As List, childname As String) As List
	'id, parentid, data
	Dim tree As List
	Dim mappedArr As Map
	'
	tree.Initialize
	mappedArr.Initialize
	'
	'create a temp map to hold everything with 'children' as 'data'
	For Each arrElem As Map In data
		Dim dID As String = arrElem.Get("id")
		'
		Dim cdata As List
		cdata.Initialize
		arrElem.Put(childname, cdata)
		'
		mappedArr.Put(dID, arrElem)
	Next
	'
	For Each dID As String In mappedArr.Keys
		Dim mappedElem As Map = mappedArr.Get(dID)
		Dim parentid As String = mappedElem.Get("parentid")
		' If the element is at the root level, add it to first level elements list.
		If parentid = "" Then
			tree.Add(mappedElem)
		Else
			'If the element is not at the root level, add it to its parent list of children.
			Dim parentElem As Map = mappedArr.Get(parentid)
			Dim children As List = parentElem.Get(childname)
			children.Add(mappedElem)
			parentElem.Put(childname, children)
			mappedArr.Put(parentid, parentElem)
		End If
	Next
	Return tree
End Sub

'set uniteby should be an existing field
Sub SetUniteBy(ulID As String, fldName As String)
	ulID = ulID.tolowercase
	fldName = fldName.tolowercase
	uniteFld = fldName
	ulName = ulID
	'define unite by
	Dim obj As Map
	Dim cb As BANanoObject = BANano.CallBack(Me, "uniteby", Array(obj))
	Dim opt As Map = CreateMap()
	opt.Put("uniteBy", cb)
	Define(ulName, opt)
	Refresh(ulName)
End Sub

private Sub uniteby(obj As Map) As String
	Dim stitle As String = obj.Get(uniteFld)
	Dim ub As String = stitle.SubString2(0,1)
	Return ub
End Sub


'initialize the page and empty the page '#body' element
Public Sub Initialize(pgID As String) As WixPage
	hints.Initialize 
	Dollar.Initialize("$$")
	ID = pgID.tolowercase
	webix.Initialize("webix")
	Page.Initialize(ID)
	'init other stuff
	EnumButtonTypes.Initialize
	EnumLayoutTypes.Initialize  
	EnumWixIcons.Initialize
	SetContainer("body") 
	Return Me
End Sub

'set the container of the page
Sub SetContainer(contID As String) As WixPage
	contID = contID.tolowercase
	Dim sKey As String = "#" & contID
	Page.Container = contID
	BANano.GetElement(sKey).empty
	Return Me
End Sub

'define to update properties
Sub Define(eID As String, properties As Map)
	eID = eID.ToLowerCase
	Dollar.Selector(eID).RunMethod("define",Array(properties))
End Sub

'add a node to a tree
Sub AddNode(treeID As String, node As Map)
	treeID = treeID.ToLowerCase
	Dollar.Selector(treeID).RunMethod("add", Array(node,1))
End Sub

'add a node to a tree
Sub AddChildNode(treeID As String, parentID As String, node As Map)
	treeID = treeID.ToLowerCase
	parentID = parentID.tolowercase
	Dollar.Selector(treeID).RunMethod("add", Array(node,1,parentID))
End Sub

'select a node to a tree
Sub SelectItem(treeID As String, nodeID As String)
	treeID = treeID.ToLowerCase
	nodeID = nodeID.tolowercase
	Dollar.Selector(treeID).RunMethod("select", Array(nodeID))
End Sub

'set a hint for input element
Sub SetHint(eID As String, sHint As String)
	eID = eID.tolowercase
	hints.Put(eID,sHint)
End Sub

'attach events after page is created
Sub OnChange(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onChange",cb))
End Sub

'attach events after page is created
Sub OnEnter(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onEnter",cb))
End Sub

'attach events after page is created
Sub OnLiveEdit(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onLiveEdit",cb))
End Sub

'attach events after page is created
Sub OnTimedKeyPress(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onTimedKeyPress",cb))
End Sub

'attach event onAfterTabClick for segment button
Sub OnAfterTabClick(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterTabClick",cb))
End Sub

'attach events after page is created
Sub OnCheck(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onCheck",cb))
End Sub


'attach events after page is created
Sub OnSelectChange(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onSelectChange",cb))
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

'add a row
Sub AddRow(r As WixRow)
	Page.AddRow(r)
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
Sub UI()
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


'aler user
Sub Alert(msg As String)
	webix.RunMethod("alert", Array(msg))
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

'get an item
Sub GetMarker(listID As String, recordID As String) As Map
	Dim mKey As String = "$" & "marker"
	listID = listID.ToLowerCase
	recordID = recordID.tolowercase
	Dim values As Map = Dollar.Selector(listID).RunMethod("getItem",Array(recordID)).Result
	values.Remove(mKey)
	Return values
End Sub

Sub OnUploadComplete(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onUploadComplete",cb))
End Sub

Sub onFileUploadError(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onFileUploadError",cb))
End Sub

Sub GetRowIDFromContext(bo As BANanoObject) As String
	Dim context As Map = bo.GetField("context").Result
	Dim rowid As String = context.Get("rowid")
	rowid = CStr(rowid)
	Return rowid
End Sub

Sub onFileUpload(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onFileUpload",cb))
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

Sub OnClick(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onClick",cb))
End Sub

Sub OnMenuItemClick(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onMenuItemClick",cb))
End Sub


'on after unselect event
Sub OnAfterUnSelect(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterUnSelect",cb))
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

'show an item by scrolling to it
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

'get view from element
Sub View(eID As String) As BANanoObject
	Dim v As String = "$" & "view"
	eID = eID.ToLowerCase
	Dim res As BANanoObject = Dollar.Selector(eID).GetField(v)
	Return res
End Sub

'add a drop zone
Sub addDropZone(uploader As String, eID As String)
	uploader = uploader.tolowercase
	eID = eID.ToLowerCase
	Dim iView As BANanoObject = View(eID)
	Dollar.Selector(uploader).RunMethod("addDropZone",Array(iView))
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

'open the file dialog
Sub FileDialog(frmID As String, opt As Map)
	frmID = frmID.tolowercase
	Dollar.Selector(frmID).RunMethod("fileDialog",Array(opt))
End Sub

'toggle
Sub Toggle(sbID As String)
	sbID = sbID.tolowercase
	Dollar.Selector(sbID).RunMethod("toggle",Null)
End Sub

'set full screen
Sub WindowFullScreen(wID As String)
	wID = wID.ToLowerCase
	Define(wID, CreateMap("fullscreen":True,"top":0,"left":0))
	Resize(wID)
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

'set popup
Sub ShowPopUp(sTemplate As String, height As Int, width As Int, position As String)
	Dim p As WixPopUp
	p.Initialize("popupi").SetHeight(height).SetWidth(width).SetPosition(position).SetTemplate(sTemplate)
	Dim pp As BANanoObject = webix.RunMethod("ui",p.item)
	pp.RunMethod("show", Null) 
End Sub

'return ui element from map
Sub UIObject(m As Map) As BANanoObject
	Dim res As BANanoObject = webix.RunMethod("ui", m)
	Return res
End Sub

'return ui element from map
Sub UX(m As Map) As BANanoObject
	Dim res As BANanoObject = webix.RunMethod("ui", m)
	Return res
End Sub

'show an element
Sub Show(itm As BANanoObject)
	itm.RunMethod("show", Null)
End Sub


'show an element
Sub Hide(itm As BANanoObject)
	itm.RunMethod("hide", Null)
End Sub


'Close an element
Sub Close(itm As BANanoObject)
	itm.RunMethod("close", Null)
End Sub


'is visible
Sub IsVisible(itm As BANanoObject) As Boolean
	Dim res As Boolean = itm.RunMethod("isVisible", Null).result
	Return res
End Sub

'add context
Sub AddContext(ctx As WixContext) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub

'add context menu
Sub AddContextMenu(ctx As WixContextMenu) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub

'add a window
Sub AddWindow(ctx As WixWindow) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub

'add a side menu
Sub AddSideMenu(ctx As WixSideMenu) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub


'add uploader
Sub AddUploader(ctx As WixUploader) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub
