B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
End Sub

Sub GetElementsMenu As WixMenu
	Dim mymenu As WixMenu
	mymenu.Initialize("mymenu")
	mymenu.AddItem("","con","Controls 1","","","","")
	mymenu.AddItem("con", "row", "Row","","", "","")
	mymenu.AddItem("con", "column", "Column","","", "","")
	mymenu.AddItem("con", "button", "Button","","", "","")
	mymenu.AddItem("con", "checkbox", "CheckBox","","", "","")
	mymenu.AddItem("con", "colorpicker", "ColorPicker","","", "","")
	mymenu.AddItem("con", "combo", "Combo","","", "","")
	mymenu.AddItem("con", "counter", "Counter","","", "","")
	mymenu.AddItem("con", "datepicker", "DatePicker","","", "","")
	mymenu.AddItem("con", "icon", "Icon","","", "","")
	mymenu.AddItem("con", "label", "Label","","", "","")
	'
	mymenu.AddItem("","con2","Controls 2","","","","")
	mymenu.AddItem("con2", "radio", "Radio","","", "","")
	mymenu.AddItem("con2", "richselect", "RichSelect","","", "","")
	mymenu.AddItem("con2", "search", "Search","","", "","")
	mymenu.AddItem("con2", "select", "Select","","", "","")
	mymenu.AddItem("con2", "segmented", "Segmented","","", "","")
	mymenu.AddItem("con2", "slider", "Slider","","", "","")
	mymenu.AddItem("con2", "switch", "Switch","","", "","")
	mymenu.AddItem("con2", "tabbar", "TabBar","","", "","")
	mymenu.AddItem("con2", "text", "Text","","", "","")
	'
	mymenu.AddItem("","con3","Controls 3","","","","")
	mymenu.AddItem("con3", "textarea", "TextArea","","", "","")
	mymenu.AddItem("con3", "toggle", "Toggle","","", "","")
	mymenu.AddItem("con3", "uploader", "Uploader","","", "","")
	mymenu.AddItem("con3", "dbllist", "DoubleList","","", "","")
	mymenu.AddItem("con3", "fieldset", "FieldSet","","", "","")
	'
	mymenu.AddItem("", "hlp", "Helpers","","", "","")
	mymenu.AddItem("hlp", "suggest", "Suggest","","", "","")
	'mymenu.AddItem("con", "forminput", "FormInput","","", "","")
	mymenu.AddItem("hlp", "pager", "Pager","","", "","")
	Return mymenu
End Sub