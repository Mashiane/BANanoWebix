B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
Sub Process_Globals
End Sub


Sub getSideBar As WixSideBar
	Dim sm As WixSideBar
	sm.Initialize("smp").SetCollapsed(False).SetActiveTitle(True).SetScroll(True).SetSelect(True)	
	'
	'sm.AddItem("", "dp", "Data Presentation","","mdi mdi-view-dashboard", "","")
	'sm.AddItem("dp", "datatable", "DataTable","","./assets/datatable.png", "", "")
'	sm.AddItem("dp", "dataview", "DataView","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "grouplist", "GroupList","","mdi mdi-view-dashboard", "","")
	'sm.AddItem("dp", "list", "List","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "propertysheet", "Property Sheet","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "tree", "Tree","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("dp", "treetable", "TreeTable","","mdi mdi-view-dashboard", "","")
	'sm.AddItem("dp", "unitlist", "UnitList","","mdi mdi-view-dashboard", "","")
'	'
'	sm.AddItem("", "vis", "Visualization","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "chart", "Chart","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "googlemap", "Google Map","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "iframe", "IFrame","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "template", "Template","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("vis", "video", "Video","","mdi mdi-view-dashboard", "","")
'	'
'	sm.AddItem("", "lay", "Layouts","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "accordion", "Accordion","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "carousel", "Carousel","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "comments", "Comments","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "form", "Form","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "layout", "Layout","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "multiview", "MultiView","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "scrollview", "ScrollView","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("lay", "tabview", "TabView","","mdi mdi-view-dashboard", "","")
'	'
'	sm.AddItem("", "nav", "Navigation","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "contextmenu", "ContextMenu","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "menu", "Menu","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "sidebar", "SideBar","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "sidemenu", "SideMenu","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("nav", "toolbar", "ToolBar","","mdi mdi-view-dashboard", "","")
'	'
'	sm.AddItem("", "win", "Windows & Popups","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("win", "context", "Context","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("win", "popup", "PopUp","","mdi mdi-view-dashboard", "","")
'	sm.AddItem("win", "window", "Window","","mdi mdi-view-dashboard", "","")
	'
	'add control elements
	sm.AddItem("", "con", "Controls","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "row", "Row","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "column", "Column","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "button", "Button","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "checkbox", "CheckBox","","mdi mdi-checkbox-marked", "","")
	sm.AddItem("con", "colorpicker", "ColorPicker","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "combo", "Combo","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "counter", "Counter","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "datepicker", "DatePicker","","mdi mdi-calendar-outline", "","")
	sm.AddItem("con", "icon", "Icon","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "label", "Label","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "radio", "Radio","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "richselect", "RichSelect","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "search", "Search","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "select", "Select","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "segmented", "Segmented","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "slider", "Slider","","fas fa-sliders-h", "","")
	sm.AddItem("con", "switch", "Switch","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "tabbar", "TabBar","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "text", "Text","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "textarea", "TextArea","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "toggle", "Toggle","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "uploader", "Uploader","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "dbllist", "DoubleList","","mdi mdi-view-dashboard", "","")
	sm.AddItem("con", "fieldset", "FieldSet","","mdi mdi-view-dashboard", "","")
	'
	sm.AddItem("", "hlp", "Helpers","","mdi mdi-view-dashboard", "","")
	sm.AddItem("hlp", "suggest", "Suggest","","mdi mdi-view-dashboard", "","")
	'sm.AddItem("con", "forminput", "FormInput","","mdi mdi-view-dashboard", "","")
	sm.AddItem("hlp", "pager", "Pager","","mdi mdi-view-dashboard", "","")
	Return sm
End Sub