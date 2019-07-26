﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Bag.Clear
	Bag.AddTextBox("id","Id", "video1")
	Bag.AddTextBox("parentid","Parent", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "video", Page.Views)
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddCheckBox("controls","Controls", "")
	Bag.AddTextBox("src","Src", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("height","Height", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.AddTextBox("width","Width", "")
	Bag.Refresh(Page)
End Sub
