B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public BANano As BANano
End Sub

Sub Init(pgContainer As String)
	pg.Initialize("index", pgContainer).SetResponsive(True).SetHeader("Hello BANanoWebix")
	Dim R1 As WixRow
	R1.Initialize("R1").SetTemplate("R1")
	
	Dim R2 As WixRow
	R2.Initialize("R2").SetTemplate("R2")
	'
	Dim R2C1 As WixColumn
	R2C1.Initialize("R2C1").SetTemplate("R2C1")
	'
	Dim R2C2 As WixColumn
	R2C2.Initialize("R2C2").SetTemplate("R2C2")
	
	'
	R2.AddColumn(R2C1)
	R2.AddColumn(R2C2)
	'
	pg.AddRow(R1)
	pg.AddRow(R2)
	'
	pg.UI

End Sub
