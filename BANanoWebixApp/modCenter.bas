B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
End Sub

Sub getCenter As WixAccordion
	Dim acc As WixAccordion
	acc.Initialize("va").SetTypeLine(True).SetMulti(True).SetResponsive(True)
	'
	Dim div As UOENowHTML
	div.Initialize("previewit","div").SetStyle("width","100%").SetStyle("height","100%")
	'
	Dim cel As WixElement
	cel.Initialize("codeit").SetTemplate("No Code").SetScroll("y").SetView("template")
	'	
	acc.AddItem("preview","Preview",div.html,False,False)
	acc.AddItem("code","Source Code",cel.item,False,False)
	Return acc
End Sub