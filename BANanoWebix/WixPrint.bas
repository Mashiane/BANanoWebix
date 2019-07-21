B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Print As WixElement
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize As WixPrint
	Print.Initialize("") 
	Return Me
End Sub

Sub SetPaper(p As Object) As WixPrint
	Print.SetAttr("paper", p)
	Return Me
End Sub

Sub SetPaperA3(b As Boolean) As WixPrint   'ignore
	SetPaper("a3")
	Return Me
End Sub

Sub SetPaperA4(b As Boolean) As WixPrint   'ignore
	SetPaper("a4")
	Return Me
End Sub

Sub SetPaperLetter(b As Boolean) As WixPrint    'ignore
	SetPaper("letter")
	Return Me
End Sub

Sub SetMode(m As Object) As WixPrint
	Print.SetAttr("mode", m)
	Return Me
End Sub

Sub SetModePortrait(b As Boolean) As WixPrint   'ignore
	SetMode("portrait")
	Return Me
End Sub

Sub SetModeLandScape(b As Boolean) As WixPrint   'ignore
	SetMode("landscape")
	Return Me
End Sub

Sub SetDocHeader(d As Object) As WixPrint
	Print.SetAttr("docHeader", d)
	Return Me
End Sub

Sub SetDocFooter(d As Object) As WixPrint
	Print.SetAttr("docFooter", d)
	Return Me
End Sub

Sub SetScroll(s As Boolean) As WixPrint
	Print.SetAttr("scroll", s)
	Return Me
End Sub

Sub SetFit(f As Object) As WixPrint
	Print.SetAttr("fit", f)
	Return Me
End Sub

Sub SetFitPage(b As Boolean) As WixPrint    'ignore
	SetFit("page")
	Return Me
End Sub

Sub SetFitData(b As Boolean) As WixPrint    'ignore
	SetFit("data")
	Return Me
End Sub

Sub SetHeader(b As Boolean) As WixPrint
	Print.SetAttr("header", b)
	Return Me
End Sub

Sub SetSkipRows(b As Boolean) As WixPrint
	Print.SetAttr("skiprows", b)
	Return Me
End Sub

Sub SetBorderLess(b As Boolean) As WixPrint
	Print.SetAttr("skiprows", b)
	Return Me
End Sub

Sub SetTrim(b As Boolean) As WixPrint
	Print.SetAttr("trim", b)
	Return Me
End Sub

Sub SetFooter(b As Boolean) As WixPrint
	Print.SetAttr("footer", b)
	Return Me
End Sub

Sub SetData(d As String) As WixPrint
	Print.SetAttr("data", d)
	Return Me
End Sub

Sub SetDataAll(b As Boolean) As WixPrint  'ignore
	SetData("all")
	Return Me
End Sub

Sub SetDataCurrent(b As Object) As WixPrint  'ignore
	SetData("current")
	Return Me
End Sub

Sub SetDataSelection(b As Object) As WixPrint  'ignore
	SetData("selection")
	Return Me
End Sub

Sub SetSheetNames(b As Boolean) As WixPrint
	Print.SetAttr("sheetnames", b)
	Return Me
End Sub

Sub Item As Map
	Return Print.item
End Sub