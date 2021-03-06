﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
Sub Process_Globals
End Sub

Sub BuildBag(Page As WixPage, Bag As WixProperty)
	Bag.Clear
	Bag.AddTextBox("id","Id", "sidemenu1")
	Bag.AddTextBox("parentid","Parent", "")
	Bag.AddCombo("addingmethod","Adding Method","AddRows", pgFD.addingmethod)
	Bag.AddTextBox("tabindex", "Tab Index", "0")
	Bag.AddLabel("Details")
	Bag.AddCombo("view","View", "sidemenu", Page.Views)
	Bag.AddCheckBox("animate","Animate", "")
	Bag.AddCheckBox("autofit","Autofit", "")
	Bag.AddCheckBox("autofocus","Autofocus", "")
	Bag.AddTextBox("body","Body", "")
	Bag.AddCheckBox("borderless","Borderless", "")
	Bag.AddTextBox("container","Container", "")
	Bag.AddTextBox("css","Css", "")
	Bag.AddCheckBox("disabled","Disabled", "")
	Bag.AddTextBox("gravity","Gravity", "")
	Bag.AddTextBox("head","Head", "")
	Bag.AddTextBox("headHeight","HeadHeight", "")
	Bag.AddCheckBox("hidden","Hidden", "")
	Bag.AddTextBox("left","Left", "")
	Bag.AddTextBox("master","Master", "")
	Bag.AddCheckBox("modal","Modal", "")
	Bag.AddCheckBox("move","Move", "")
	Bag.AddCheckBox("point","Point", "")
	Bag.AddCombo("position", "Position", "", Array("","center","top","bottom","left","right"))
	Bag.AddCombo("relative", "Relative", "", Array("","left","right"))
	Bag.AddCheckBox("resize","Resize", "")
	Bag.AddTextBox("state","State", "")
	Bag.AddCheckBox("toFront","ToFront", "")
	Bag.AddTextBox("zIndex","ZIndex", "")
	Bag.addlabel("Sizes")
	Bag.AddTextBox("top","Top", "")
	Bag.AddTextBox("padding","Padding", "")
	Bag.AddTextBox("width","Width", "")
	Bag.AddTextBox("height","Height","")
	Bag.AddTextBox("maxHeight","MaxHeight", "")
	Bag.AddTextBox("maxWidth","MaxWidth", "")
	Bag.AddTextBox("minHeight","MinHeight", "")
	Bag.AddTextBox("minWidth","MinWidth", "")
	Bag.Refresh(Page)
End Sub

