B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Chart As WixElement
End Sub

'initialize the input box
Public Sub Initialize(iID As String) As WixChart
	ID = iID.tolowercase
	Chart.Initialize(iID).SetView("chart")
	Return Me
End Sub

'set area
Sub SetTypeArea(r As String) As WixChart 'ignore
	Chart.SetType("area")
	Return Me
End Sub

'set area
Sub SetTypeBar(r As String) As WixChart 'ignore
	Chart.SetType("bar")
	Return Me
End Sub

'set pie
Sub SetTypePie(r As String) As WixChart 'ignore
	Chart.SetType("pie")
	Return Me
End Sub

'set line
Sub SetTypeLine(r As String) As WixChart 'ignore
	Chart.SetType("line")
	Return Me
End Sub

'set spline
Sub SetTypeSPLine(r As String) As WixChart 'ignore
	Chart.SetType("spline")
	Return Me
End Sub

'set stackedBarH
Sub SetStackedBarH(r As String) As WixChart 'ignore
	Chart.SetType("stackedBarH")
	Return Me
End Sub

'set stackedArea
Sub SetTypeStackedArea(r As String) As WixChart 'ignore
	Chart.SetType("stackedArea")
	Return Me
End Sub

'set pie3D
Sub SetTypePie3D(r As String) As WixChart 'ignore
	Chart.SetType("pie3D")
	Return Me
End Sub

'set line
Sub SetLine(LineColor As String, LineWidth As Int) As WixChart
	Dim l As Map = CreateMap("color": LineColor, "width" : LineWidth)
	Chart.SetProperty("line", l)
	Return Me
End Sub

'set legend
Sub SetLegend(width As Int, align As Int) As WixChart
	Dim l As Map = CreateMap("width": width, "align" : align)
	Chart.SetProperty("legend", l)
	Return Me
End Sub

'set bar width
Sub SetBarWidth(w As Int) As WixChart
	Chart.SetProperty("barWidth", w)
	Return Me
End Sub

'set type barH
Sub SetTypeBarH(r As String) As WixChart 'ignore
	Chart.SetType("barH")
	Return Me
End Sub

'set type donut
Sub SetTypeDonut(r As String) As WixChart 'ignore
	Chart.SetType("donut")
	Return Me
End Sub

'set color
Sub SetColor(c As String) As WixChart
	Chart.SetProperty("color", c)
	Return Me
End Sub

'set shadow
Sub SetShadow(s As Int) As WixChart
	Chart.SetProperty("shadow", s)
	Return Me
End Sub
	
'set padding
Sub SetPadding(r As Int) As WixChart
	Chart.setproperty("padding",r)
	Return Me
End Sub

'set the radius
Sub SetRadius(r As Int) As WixChart
	Chart.SetProperty("radius", r)
	Return Me
End Sub

'set the gradient
Sub SetGradient(g As String) As WixChart
	Chart.SetProperty("gradient", g)
	Return Me
End Sub

'add to form
Sub AddToForm(frm As WixForm)
	frm.AddItem(Item)
End Sub


'set tooltip
Sub SetTooltip(tt As String) As WixChart
	Chart.SetTooltip(tt)
	Return Me
End Sub


'return the item
Sub Item As Map
	Return Chart.item
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixChart
	Chart.SetStyle(prop,val)
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixChart
	Chart.SetHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(h As Int) As WixChart
	Chart.SetWidth(h)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixChart
	Chart.SetData(d)
	Return Me
End Sub

'set pieInnerText
Sub SetPieInnerText(txt As String) As WixChart
	Chart.SetProperty("pieInnerText", txt)
	Return Me
End Sub

'set value
Sub SetValue(v As String) As WixChart
	Chart.Value = v
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixChart
	Chart.Label.Text = l
	Return Me
End Sub

'set label align
Sub SetLabelAlign(a As String) As WixChart
	Chart.Label.Align = a
	Return Me
End Sub

'set label position
Sub SetLabelPosition(p As String) As WixChart
	Chart.Label.Position = p
	Return Me
End Sub

'set label width
Sub SetLabelWidth(w As Int) As WixChart
	Chart.Label.Width = w
	Return Me
End Sub

'set align right
Sub SetAlignRight(r As String) As WixChart 'ignore
	Chart.setAlignright("")
	Return Me
End Sub

'set align center
Sub SetAlignCenter(r As String) As WixChart 'ignore
	Chart.setAligncenter("")
	Return Me
End Sub

'set align left
Sub SetAlignLeft(r As String) As WixChart 'ignore
	Chart.SetAlignleft("")
	Return Me
End Sub