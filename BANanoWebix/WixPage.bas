﻿B4J=true
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
End Sub

'initialize the page
Public Sub Initialize(pgID As String) As WixPage
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

'render the page UX
Sub UI
	webix.RunMethod("ui",Page.item)
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
