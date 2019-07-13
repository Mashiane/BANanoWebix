B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Public div As UOENowHTML
	Private code As UOENowHTML
End Sub

Sub getCenter As WixRow
	div = pgFormDesigner.div
	code = pgFormDesigner.code
	'form holder (property bag)
	Dim formHolder As WixRow
	formHolder.Initialize("formholder")
	'
	'Dim sg As WixSegmented
	'sg.Initialize("")
	'sg.Segmented.SetMultiView(True)
	' container to show elements
	div.Initialize("previewit","div").SetStyle("width","100%").SetStyle("height","100%")
	code.Initialize("codeit","div").SetStyle("width","100%").SetStyle("height","100%")
	'sg.AddOption("preview", "Preview", div.HTML)
	'sg.AddOption("code", "Source Code",code.html)
	'
	'formHolder.AddRows(sg.Item)
	'IMPORTANT
	'formHolder.AddRowsCells(sg.Cells)
	
	Dim acc As WixAccordion
	acc.Initialize("va").SetScroll(True)
	acc.SetMulti(True)
	acc.AddItem("preview","Preview",div.html,0,False)
	acc.AddItem("code","Source Code",code.html,0,False)
	'
	formHolder.AddRows(acc.Item)
	Return formHolder
End Sub