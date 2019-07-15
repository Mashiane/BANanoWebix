B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
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