B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Private BANano As BANano  'ignore
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 19: Context Menus").SetResponsive("master")
	'
	Dim R1 As WixRow
	R1.Initialize("R1") 
	'
	'the body of the page is empty, lets create a div
	Dim div1 As UOENowHTML
	div1.Initialize("div1", "div").SetStyle("background-color", "#ff0000")
	div1.SetStyle("width", "200px").SetStyle("height", "200px")
	'
	Dim div2 As UOENowHTML
	div2.Initialize("div2", "div").SetStyle("background-color", "#00ff00")
	div2.SetStyle("width", "200px").SetStyle("height", "200px")
	'
	'get the body element
	Dim sb As StringBuilder
	sb.Initialize 
	sb.Append(div1.HTML)
	sb.Append("<br>")
	sb.Append(div2.html)
	'
	R1.SetTemplate(sb.ToString)
	'
	'add row to the page
	pg.AddRow(R1)
	'build the page
	pg.ui
	'context & contextmenu to be added after page is built
	'
	Dim context As WixContext '(popup)
	context.Initialize("context").SetMaster("div1").SetWidth(250).SetHeight(150)
	context.SetTemplate("Exterminate the Doctor! Exterminate! Exterminate!")
	'
	pg.AddContext(context)
	'
	Dim contextmenu As WixContextMenu
	contextmenu.Initialize("contextmenu").SetMaster("div2").SetSelect(True)
	contextmenu.AddItem("","sendto","Send To...","","","","")
	contextmenu.AddItem("sendto", "clara", "Clara","","","","")
	contextmenu.AddItem("sendto", "billie", "Billie","","","","")
	contextmenu.AddItem("sendto", "rose", "Rose","","","","")
	contextmenu.AddItem("","addcompanion","Add Companion","","","","")
	'
	pg.AddContextMenu(contextmenu)
	'
	Dim meID As Map
	pg.onMenuItemClick("contextmenu", BANano.CallBack(Me, "itemClick", Array(meID)))
End Sub


Sub itemClick(meid As String)
	pg.Message(meid)
End Sub