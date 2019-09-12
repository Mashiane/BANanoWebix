B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private Page As WixPage
	Private BANano As BANano  'ignore
End Sub

Sub AddPage(pg As WixPage, mv As WixMultiView)
	Page = pg
	'create a page
	Dim a As WixLayout
	a.Initialize("mv_welcome").SetTemplate("Welcome").SetTypeLine("")
	'add page to multiview
	mv.AddItem(a.Item)
End Sub

Sub ShowPage(pg As WixPage)
	Page = pg
	Page.Show("mv_welcome")
End Sub


