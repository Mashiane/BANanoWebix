B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
End Sub

Sub getCenter As WixRow
	Dim formHolder As WixRow
	formHolder.Initialize("formholder")
	'	
	Dim acc As WixAccordion
	acc.Initialize("va").SetTypeLine(True).SetMulti(True).SetResponsive(True)
	'
	Dim div As UOENowHTML
	div.Initialize("previewit","div").SetStyle("width","100%").SetStyle("height","100%")
	'
	Dim pel As WixElement
	pel.Initialize("prex").SetTemplateHTML(div).SetScroll("y")
	'
	Dim cel As WixElement
	cel.Initialize("codeit").SetTemplate("Code").SetScroll("y")
	'	
	acc.AddItem("preview","Preview",div.html,False,False)
	acc.AddItem("code","Source Code",cel.item,False,False)
	'
	formHolder.AddRows(acc.Item)
	Return formHolder
End Sub