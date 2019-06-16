B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private URL As String
	Private Options As Map
End Sub

'Initializes the dc
Public Sub Initialize() As WixDataCollection
	Options.Initialize 
	Return Me
End Sub

'set the url, could be php
Sub SetURL(u As String) As WixDataCollection
	URL = u
	Return Me
End Sub

'create the data collection
Sub DataCollection As BANanoObject
	'set the options
	Options.Put("url", URL)
	'define the dc
	Dim dc As BANanoObject
	dc.Initialize2("webix.DataCollection",Array(Options))
	Return dc
End Sub