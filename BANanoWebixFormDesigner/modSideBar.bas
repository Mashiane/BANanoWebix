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
	Dim sPhoto As String
	'Dim img As UOENowHTML
	'create the template to show the image
	'img.Initialize("img", "img").SetSRC("./assets/#icon#",True).AddContent(" #value#")
	'img.AddClass("webix_selected").SetStyle("height","1em").SetStyle("background-position","center center")
	'img.SetStyle("background-size","contain").SetStyle("background-repeat","no-repeat").SetStyle("background-origin","content-box")
	'sPhoto = img.HTML
	
	Dim sm As WixSideBar
	sm.Initialize("smp").SetCollapsed(False).SetActiveTitle(True).SetScroll(True).SetSelect(True)
	'sm.SetTemplate(sPhoto)
		
	'
	'sm.AddItem("","downloads","Downloads","","","","")
	'sm.AddItem("downloads", "b4xlib","B4X Lib","https://github.com/Mashiane/BANanoWebix/raw/master/BANanoWebix.b4xlib","mdi mdi-cloud-download-outline","","_blank")
	'sm.AddItem("downloads", "skeletonapp", "Skeleton App", "./assets/app.zip","mdi mdi-apps", "", "_blank")
	'
	sm.AddItem("","db","Database","","","","")
	sm.AddItem("db", "dbhelp", "Help","","mdi mdi-help-circle-outline","","")
	sm.AddItem("db", "table","Table","","mdi mdi-selection-ellipse","","")
	sm.AddItem("db", "field","Field","","mdi mdi-selection-ellipse","","")
	
	sm.AddItem("", "dp", "Data Presentation","","", "","")
	sm.AddItem("dp", "datatable", "Data Table","","mdi mdi-selection-ellipse", "", "")
	sm.AddItem("datatable", "datacolumn", "Data Column","","mdi mdi-selection-ellipse", "","")
	'sm.AddItem("dp", "dataview", "DataView","","", "","")
'	sm.AddItem("dp", "grouplist", "GroupList","","", "","")
	'sm.AddItem("dp", "list", "List","","", "","")
'	sm.AddItem("dp", "propertysheet", "Property Sheet","","", "","")
'	sm.AddItem("dp", "tree", "Tree","","", "","")
'	sm.AddItem("dp", "treetable", "TreeTable","","", "","")
	'sm.AddItem("dp", "unitlist", "UnitList","","", "","")
'	'
	sm.AddItem("", "vis", "Visualization","","", "","")
'	sm.AddItem("vis", "chart", "Chart","","", "","")
'	sm.AddItem("vis", "googlemap", "Google Map","","", "","")
'	sm.AddItem("vis", "iframe", "IFrame","","", "","")
'	sm.AddItem("vis", "template", "Template","","", "","")
	'sm.AddItem("vis", "video", "Video","","", "","")
	sm.AddItem("vis", "image", "Image","","mdi mdi-selection-ellipse", "","")
'	'
	sm.AddItem("", "lay", "Layouts","","", "","")
'	sm.AddItem("lay", "accordion", "Accordion","","", "","")
'	sm.AddItem("lay", "carousel", "Carousel","","", "","")
'	sm.AddItem("lay", "comments", "Comments","","", "","")
	sm.AddItem("lay", "form", "Form","","mdi mdi-group", "","")
	sm.AddItem("lay", "layout", "Layout","","mdi mdi-selection-ellipse", "","")
'	sm.AddItem("lay", "multiview", "MultiView","","", "","")
'	sm.AddItem("lay", "scrollview", "ScrollView","","", "","")
'	sm.AddItem("lay", "tabview", "TabView","","", "","")
	'sm.AddItem("lay", "fieldset", "FieldSet","","", "","")
	'sm.AddItem("con", "tabbar", "TabBar","","", "","")
	
'	'
	sm.AddItem("", "nav", "Navigation","","", "","")
'	sm.AddItem("nav", "contextmenu", "ContextMenu","","", "","")
'	sm.AddItem("nav", "menu", "Menu","","", "","")
'	sm.AddItem("nav", "sidebar", "SideBar","","", "","")
'	sm.AddItem("nav", "sidemenu", "SideMenu","","", "","")
	sm.AddItem("nav", "toolbar", "ToolBar","","", "","")
'	'
'	sm.AddItem("", "win", "Windows & Popups","","", "","")
'	sm.AddItem("win", "context", "Context","","", "","")
'	sm.AddItem("win", "popup", "PopUp","","", "","")
'	sm.AddItem("win", "window", "Window","","", "","")
	'
	'add control elements
	sm.AddItem("", "con", "Controls","","", "","")
	sm.AddItem("con", "grid", "Grid","","mdi mdi-grid", "","")
	sm.AddItem("grid", "row", "Row","","mdi mdi-table-row-plus-after", "","")
	sm.AddItem("grid", "column", "Column","","mdi mdi-table-column-plus-after", "","")
	
	'buttons
	sm.AddItem("con", "buttons", "Buttons","","mdi mdi-pin", "","")
	sm.AddItem("buttons", "button", "Button","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("buttons", "segmented", "Segmented","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("buttons", "toggle", "Toggle","","mdi mdi-toggle-switch-outline", "","")
	'text fields
	sm.AddItem("con", "txts", "Text Fields","","mdi mdi-cursor-text", "","")
	sm.AddItem("txts", "text", "Text","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("txts", "textarea", "TextArea","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("txts", "richtext", "RichText","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("txts", "search", "Search","","mdi mdi-folder-search-outline", "","")
	'selectors
	sm.AddItem("con", "sels", "Selectors","","mdi mdi-arrow-down-drop-circle-outline", "","")
	sm.AddItem("sels", "combo", "Combo","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("sels", "richselect", "RichSelect","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("sels", "select", "Select","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("sels", "dbllist", "DoubleList","","mdi mdi-selection-ellipse", "","")
	'choices
	sm.AddItem("con", "choices", "Choices","","mdi mdi-check-box-outline", "","")
	sm.AddItem("choices", "checkbox", "CheckBox","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("choices", "radio", "Radio","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("choices", "switch", "Switch","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("choices", "slider", "Slider","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("choices", "counter", "Counter","","mdi mdi-selection-ellipse", "","")
	'pickers
	sm.AddItem("con", "pickers", "Pickers","","mdi mdi-calendar-outline", "","")
	sm.AddItem("pickers", "colorpicker", "ColorPicker","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("pickers", "datepicker", "DatePicker","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("pickers", "calendar", "Calendar","","mdi mdi-selection-ellipse", "","")
	'others
	sm.AddItem("con", "others", "Others","","mdi mdi-cards-outline", "","")
	sm.AddItem("others", "icon", "Icon","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("others", "label", "Label","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("others", "uploader", "Uploader","","mdi mdi-selection-ellipse", "","")
	'
	sm.AddItem("", "hlp", "Helpers","","", "","")
	sm.AddItem("hlp", "suggest", "Suggest","","mdi mdi-selection-ellipse", "","")
	'sm.AddItem("con", "forminput", "FormInput","","", "","")
	sm.AddItem("hlp", "pager", "Pager","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("hlp", "wixsomething", "Wix Something","","mdi mdi-selection-ellipse", "","")
	sm.AddItem("wixsomething", "property", "Property","","mdi mdi-selection-ellipse", "","")
	Return sm
End Sub