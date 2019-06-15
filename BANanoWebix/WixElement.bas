B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public Template As String
	Public Columns As List
	Public Width As Int
	Public Height As Int
	Public Rows As List
	Private Element As Map
	Public Value As Object
	Public Elements As List
	Public Name As String
	Private Attributes As Map
	Public TypeOf As String
	Public Container As String
	Public PlaceHolder As String
	Public Align As String
	Type LabelType(Text As String, Width As Int, Position As String, Align As String)
	Public Label As LabelType
	Public inputWidth As Int
	Private HTMLAttributes As Map 
	Public View As String
	Public Gravity As Int
	Public CSS As String
End Sub

'initialize the element
Public Sub Initialize(sID As String) As WixElement
	ID = sID.ToLowerCase
	Template = ""
	Width = 0
	Height = 0
	Element = CreateMap("id":ID)
	Value = ""
	Name = ID
	Container = ""
	Rows.Initialize
	Elements.Initialize
	Columns.Initialize
	Attributes.Initialize
	PlaceHolder = ""
	Align = ""
	TypeOf = ""
	Container = ""
	Label.Initialize 
	Label.Text = ""
	Label.Width = 0
	inputWidth = 0
	Gravity = 0
	Label.Align = ""
	Label.Position = ""
	CSS = ""
	HTMLAttributes.Initialize 
	Return Me
End Sub

'set gravity
Sub SetGravity(g As Int) As WixElement
	Gravity = g
	Return Me
End Sub

'set view
Sub SetView(v As String) As WixElement
	View = v
	Return Me
End Sub

'set type
Sub SetType(t As String) As WixElement
	TypeOf = t
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As WixElement
	Height = h
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As WixElement
	Width = w
	Return Me
End Sub

'set width
Sub SetCSS(cs As String) As WixElement
	CSS = cs
	Return Me
End Sub

'set an attribute
Sub SetAttr(attrName As String, attrValue As Object) As WixElement
	SetOnContent(attrName,attrValue)
	Return Me
End Sub

'set a html attribute
Sub SetHTMLAttr(attrName As String, attrValue As Object) As WixElement
	HTMLAttributes.put(attrName,attrValue)
	Return Me
End Sub

'return the object
Sub Item As Map
	SetOnCondition(Height,"height",Height)
	SetOnCondition(Width, "width", Width)
	SetOnContent("container", Container)
	SetOnContent("type", TypeOf)
	SetOnContent("view", View)
	SetOnContent("name", Name)
	SetOnContent("css", CSS)
	SetOnContent("value", Value)
	SetOnContent("align", Align)
	SetOnContent("template", Template)
	SetOnContent("label", Label.Text)
	SetOnContent("placeholder", PlaceHolder)
	SetOnContent("labelPosition", Label.Position)
	SetOnContent("labelAlign", Label.Align)
	SetOnCondition(Gravity,"gravity", Gravity)
	SetOnCondition(Label.Width,"labelWidth", Label.Width)
	SetOnCondition(Columns.Size,"cols", Columns)
	SetOnCondition(Rows.Size, "rows", Rows)
	SetOnCondition(Elements.Size, "elements", Elements)
	SetOnCondition(inputWidth,"inputWidth",inputWidth)
	For Each attr As String In Attributes.Keys
		Dim strVal As Object = Attributes.Get(attr)
		Element.Put(attr,strVal)
	Next
	'do we have HTMLAttributes
	Dim hSize As Int = HTMLAttributes.Size - 1
	If hSize <> -1 Then
		Element.Put("attributes", HTMLAttributes)
	End If
	Return Element
End Sub

'set icon
Sub SetIcon(i As String) As WixElement
	SetOnContent("icon", i)
	Return Me
End Sub

'set label
Sub SetLabel(l As String) As WixElement
	SetOnContent("label", l)
	Return Me
End Sub

'set click
Sub SetClick(c As BANanoObject) As WixElement
	Element.Put("click", c)
	Return Me
End Sub

'add resizer
Sub AddResizerToColumns As WixElement
	Dim r As WixResizer
	r.Initialize("")
	AddColumns(r.Item)
	Return Me
End Sub

'set template
Sub SetTemplate(t As String) As WixElement
	Template = t
	Return Me
End Sub

'add item to a column
Sub AddColumns(itm As Map)
	Columns.Add(itm)
End Sub

'add item to a row
Sub AddRows(itm As Map)
	Rows.Add(itm)
End Sub

'add on elements
Sub AddItem(itm As Map)
	Elements.Add(itm)
End Sub

'add a row
Sub AddRow(wxEL As WixRow)
	AddRows(wxEL.Item)
End Sub

'add to rows of parent
Sub AddToRows(prt As WixElement)
	prt.AddRows(Item)
End Sub

'add to columns of parent
Sub AddToColumns(prt As WixElement)
	prt.AddColumns(Item)
End Sub

'add a column
Sub AddColumn(wxEL As WixColumn)
	AddColumns(wxEL.Item)
End Sub

'update property when not blank
Sub SetOnContent(Prop As String, PropValue As String)
	If PropValue = "" Then Return
	Element.put(Prop,PropValue)
End Sub

'update property when size > 0
Sub SetOnCondition(Condition As Int, Prop As String, PropValue As Object)
	If Condition <= 0 Then Return
	Element.put(Prop,PropValue)
End Sub
