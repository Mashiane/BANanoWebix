B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public GoogleMap As WixElement
	Public Markers As List
	Public CONST MAP_TYPE_ROADMAP As String = "ROADMAP"
	Public const MAP_TYPE_SATELLITE As String = "SATELLITE"
	Public const MAP_TYPE_HYBRID As String = "HYBRID"
	Public const MAP_TYPE_TERRAIN As String = "TERRAIN"
End Sub

'Initializes the Context
Public Sub Initialize(sid As String) As WixGoogleMap
	ID = sid.ToLowerCase
	GoogleMap.Initialize(ID).setview("google-map")
	Markers.Initialize
	Return Me
End Sub


'set name
Sub SetName(n As String) As WixGoogleMap
	GoogleMap.SetName(n)
	Return Me
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixGoogleMap
	GoogleMap.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixGoogleMap
	GoogleMap.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixGoogleMap
	GoogleMap.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixGoogleMap
	GoogleMap.SetMinHeight(h)
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixGoogleMap
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		GoogleMap.SetAttr(strKey,	strVal)
	Next
	Return Me
End Sub


'add marker
Sub AddMarker(mID As String, mLat As Double, mLng As Double, mTitle As String, mCanDrag As Boolean, mHidden As Boolean) As WixGoogleMap
	Dim Marker As Map = CreateMap()
	Marker.Put("id", mID)
	Marker.Put("lat", mLat)
	Marker.Put("lng", mLng)
	Marker.Put("title", mTitle)
	Marker.Put("label", mTitle)
	Marker.Put("draggable", mCanDrag)
	Marker.Put("hidden", mHidden)
	Markers.Add(Marker)
	Return Me
End Sub

'return the item
Sub Item As Map
	GoogleMap.SetData(Markers)
	Return GoogleMap.item
End Sub

'set style
Sub SetStyle(prop As String, val As String) As WixGoogleMap
	GoogleMap.SetStyle(prop,val)
	Return Me
End Sub


'set borderless
Sub SetBorderLess(b As Boolean) As WixGoogleMap
	GoogleMap.SetAttr("borderless", b)
	Return Me
End Sub

'set height
Sub SetHeight(h As Object) As WixGoogleMap
	GoogleMap.SetAttr("height", h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixGoogleMap
	GoogleMap.SetAttr("width", w)
	Return Me
End Sub

'set auto width
Sub SetAutoWidth(b As Boolean) As WixGoogleMap
	GoogleMap.SetAttr("autowidth", b)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixGoogleMap
	GoogleMap.SetAttr("template", t)
	Return Me
End Sub

'set data
Sub SetData(d As List) As WixGoogleMap
	Markers = d
	Return Me
End Sub

'set the map key
Sub SetKey(key As String) As WixGoogleMap
	GoogleMap.SetAttr("key", key)
	Return Me
End Sub

'set zoom
Sub SetZoom(z As Int) As WixGoogleMap
	GoogleMap.SetAttr("zoom", z)
	Return Me
End Sub

'set map type
Sub SetMapType(mt As String) As WixGoogleMap
	GoogleMap.SetAttr("mapType", mt)
	Return Me
End Sub

'set center
Sub SetCenter(lng As Double, lat As Double) As WixGoogleMap
	Dim center As List
	center.Initialize 
	center.Add(lng)
	center.Add(lat)
	GoogleMap.SetAttr("center", center)
	Return Me
End Sub


'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(P As WixElement)
	P.AddColumns(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub