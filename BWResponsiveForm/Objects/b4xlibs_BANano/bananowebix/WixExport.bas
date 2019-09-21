B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.78
@EndOfDesignText@
#ignorewarnings: 12 
Sub Class_Globals
	Public filename As String
	Public name As String
	Public filterHTML As Boolean
	Private columns As List
	Private ignore As List
	Private wix As BANanoObject
	Public rawValues As Boolean
	Public spans As Boolean
	Public download As Boolean
	Public styles As Boolean
	Public heights As Object
	Public header As Boolean
	Public footer As Boolean
End Sub

'set columns to ignore
Sub SetIgnore(ig As List) As WixExport
	For Each col As String In ig
		ignore.Add(col)
	Next
	Return Me
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Page As WixPage)
	wix = Page.webix
	columns.Initialize
	ignore.Initialize 
	download = True
	heights = False
	header = True
	footer = True
End Sub

'add a column to export, exporttype (number, string, boolean, date)
Sub AddColumn(colid As String, colheader As String, colwidth As Int, exportFormat As String, template As String, exportType As String)
	Dim col As Map = CreateMap()
	col.Put("id", colid)
	col.Put("header", colheader)
	If colwidth > 0 Then col.Put("width", colwidth)
	If template.Length > 0 Then 
		Dim tmp As BANanoObject = wix.RunMethod("template", template)
		col.Put("template", tmp)
	End If
	If exportType.Length > 0 Then col.put("exportType", exportType)
	If exportFormat.Length > 0 Then
		col.put("exportFormat", exportFormat)
	End If
	columns.Add(col)
End Sub

'get the export options
Sub ExportOptions As Map
	Dim ignoreMap As Map = CreateMap()
	For Each col As String In ignore
		ignoreMap.Put(col, True)
	Next
	'
	Dim opt As Map = CreateMap()
	opt.Put("filename", filename)
	opt.Put("name", name)
	If filterHTML = True Then opt.Put("filterHTML", filterHTML)
	'set options
	If columns.Size > 0 Then opt.Put("columns", columns)
	If rawValues Then opt.Put("rawValues", rawValues)
	If spans = True Then opt.Put("spans", spans)
	If ignoreMap.Size > 0 Then opt.Put("ignore", ignoreMap)
	If columns.Size > 0 Then opt.Put("columns", columns)
	opt.Put("download", download)
	If styles = True Then opt.Put("styles", styles)
	If heights = True Then opt.Put("heights", heights)
	If header = False Then opt.Put("header", header)
	If footer = False Then opt.Put("footer", footer)
	Return opt
End Sub