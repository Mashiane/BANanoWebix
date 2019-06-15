package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixelement extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixelement", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixelement.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public String _template = "";
public anywheresoftware.b4a.objects.collections.List _columns = null;
public int _width = 0;
public int _height = 0;
public anywheresoftware.b4a.objects.collections.List _rows = null;
public anywheresoftware.b4a.objects.collections.Map _element = null;
public Object _value = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public String _name = "";
public anywheresoftware.b4a.objects.collections.Map _attributes = null;
public String _typeof = "";
public String _container = "";
public String _placeholder = "";
public String _align = "";
public b4j.example.wixelement._labeltype _label = null;
public int _inputwidth = 0;
public anywheresoftware.b4a.objects.collections.Map _htmlattributes = null;
public String _view = "";
public int _gravity = 0;
public String _css = "";
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public static class _labeltype{
public boolean IsInitialized;
public String Text;
public int Width;
public String Position;
public String Align;
public void Initialize() {
IsInitialized = true;
Text = "";
Width = 0;
Position = "";
Align = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addcolumn(b4j.example.wixcolumn _wxel) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub AddColumn(wxEL As WixColumn)";
 //BA.debugLineNum = 203;BA.debugLine="AddColumns(wxEL.Item)";
_addcolumns(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 173;BA.debugLine="Columns.Add(itm)";
_columns.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub AddItem(itm As Map)";
 //BA.debugLineNum = 183;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addresizertocolumns() throws Exception{
b4j.example.wixresizer _r = null;
 //BA.debugLineNum = 158;BA.debugLine="Sub AddResizerToColumns As WixElement";
 //BA.debugLineNum = 159;BA.debugLine="Dim r As WixResizer";
_r = new b4j.example.wixresizer();
 //BA.debugLineNum = 160;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.example.wixresizer*/ (ba,"");
 //BA.debugLineNum = 161;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public String  _addrow(b4j.example.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub AddRow(wxEL As WixRow)";
 //BA.debugLineNum = 188;BA.debugLine="AddRows(wxEL.Item)";
_addrows(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 178;BA.debugLine="Rows.Add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub AddToColumns(prt As WixElement)";
 //BA.debugLineNum = 198;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*String*/ (_item());
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub AddToRows(prt As WixElement)";
 //BA.debugLineNum = 193;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*String*/ (_item());
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Template As String";
_template = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Width As Int";
_width = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public Height As Int";
_height = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public Rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="Private Element As Map";
_element = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Public Value As Object";
_value = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Public Elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Public Name As String";
_name = "";
 //BA.debugLineNum = 13;BA.debugLine="Private Attributes As Map";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Public TypeOf As String";
_typeof = "";
 //BA.debugLineNum = 15;BA.debugLine="Public Container As String";
_container = "";
 //BA.debugLineNum = 16;BA.debugLine="Public PlaceHolder As String";
_placeholder = "";
 //BA.debugLineNum = 17;BA.debugLine="Public Align As String";
_align = "";
 //BA.debugLineNum = 18;BA.debugLine="Type LabelType(Text As String, Width As Int, Posi";
;
 //BA.debugLineNum = 19;BA.debugLine="Public Label As LabelType";
_label = new b4j.example.wixelement._labeltype();
 //BA.debugLineNum = 20;BA.debugLine="Public inputWidth As Int";
_inputwidth = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private HTMLAttributes As Map";
_htmlattributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 22;BA.debugLine="Public View As String";
_view = "";
 //BA.debugLineNum = 23;BA.debugLine="Public Gravity As Int";
_gravity = 0;
 //BA.debugLineNum = 24;BA.debugLine="Public CSS As String";
_css = "";
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize(sID As String) As WixElement";
 //BA.debugLineNum = 29;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 30;BA.debugLine="Template = \"\"";
_template = "";
 //BA.debugLineNum = 31;BA.debugLine="Width = 0";
_width = (int) (0);
 //BA.debugLineNum = 32;BA.debugLine="Height = 0";
_height = (int) (0);
 //BA.debugLineNum = 33;BA.debugLine="Element = CreateMap(\"id\":ID)";
_element = __c.createMap(new Object[] {(Object)("id"),(Object)(_id)});
 //BA.debugLineNum = 34;BA.debugLine="Value = \"\"";
_value = (Object)("");
 //BA.debugLineNum = 35;BA.debugLine="Name = ID";
_name = _id;
 //BA.debugLineNum = 36;BA.debugLine="Container = \"\"";
_container = "";
 //BA.debugLineNum = 37;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 38;BA.debugLine="Elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 39;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 40;BA.debugLine="Attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="PlaceHolder = \"\"";
_placeholder = "";
 //BA.debugLineNum = 42;BA.debugLine="Align = \"\"";
_align = "";
 //BA.debugLineNum = 43;BA.debugLine="TypeOf = \"\"";
_typeof = "";
 //BA.debugLineNum = 44;BA.debugLine="Container = \"\"";
_container = "";
 //BA.debugLineNum = 45;BA.debugLine="Label.Initialize";
_label.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="Label.Text = \"\"";
_label.Text /*String*/  = "";
 //BA.debugLineNum = 47;BA.debugLine="Label.Width = 0";
_label.Width /*int*/  = (int) (0);
 //BA.debugLineNum = 48;BA.debugLine="inputWidth = 0";
_inputwidth = (int) (0);
 //BA.debugLineNum = 49;BA.debugLine="Gravity = 0";
_gravity = (int) (0);
 //BA.debugLineNum = 50;BA.debugLine="Label.Align = \"\"";
_label.Align /*String*/  = "";
 //BA.debugLineNum = 51;BA.debugLine="Label.Position = \"\"";
_label.Position /*String*/  = "";
 //BA.debugLineNum = 52;BA.debugLine="CSS = \"\"";
_css = "";
 //BA.debugLineNum = 53;BA.debugLine="HTMLAttributes.Initialize";
_htmlattributes.Initialize();
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
String _attr = "";
Object _strval = null;
int _hsize = 0;
 //BA.debugLineNum = 106;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 107;BA.debugLine="SetOnCondition(Height,\"height\",Height)";
_setoncondition(_height,"height",(Object)(_height));
 //BA.debugLineNum = 108;BA.debugLine="SetOnCondition(Width, \"width\", Width)";
_setoncondition(_width,"width",(Object)(_width));
 //BA.debugLineNum = 109;BA.debugLine="SetOnContent(\"container\", Container)";
_setoncontent("container",_container);
 //BA.debugLineNum = 110;BA.debugLine="SetOnContent(\"type\", TypeOf)";
_setoncontent("type",_typeof);
 //BA.debugLineNum = 111;BA.debugLine="SetOnContent(\"view\", View)";
_setoncontent("view",_view);
 //BA.debugLineNum = 112;BA.debugLine="SetOnContent(\"name\", Name)";
_setoncontent("name",_name);
 //BA.debugLineNum = 113;BA.debugLine="SetOnContent(\"css\", CSS)";
_setoncontent("css",_css);
 //BA.debugLineNum = 114;BA.debugLine="SetOnContent(\"value\", Value)";
_setoncontent("value",BA.ObjectToString(_value));
 //BA.debugLineNum = 115;BA.debugLine="SetOnContent(\"align\", Align)";
_setoncontent("align",_align);
 //BA.debugLineNum = 116;BA.debugLine="SetOnContent(\"template\", Template)";
_setoncontent("template",_template);
 //BA.debugLineNum = 117;BA.debugLine="SetOnContent(\"label\", Label.Text)";
_setoncontent("label",_label.Text /*String*/ );
 //BA.debugLineNum = 118;BA.debugLine="SetOnContent(\"placeholder\", PlaceHolder)";
_setoncontent("placeholder",_placeholder);
 //BA.debugLineNum = 119;BA.debugLine="SetOnContent(\"labelPosition\", Label.Position)";
_setoncontent("labelPosition",_label.Position /*String*/ );
 //BA.debugLineNum = 120;BA.debugLine="SetOnContent(\"labelAlign\", Label.Align)";
_setoncontent("labelAlign",_label.Align /*String*/ );
 //BA.debugLineNum = 121;BA.debugLine="SetOnCondition(Gravity,\"gravity\", Gravity)";
_setoncondition(_gravity,"gravity",(Object)(_gravity));
 //BA.debugLineNum = 122;BA.debugLine="SetOnCondition(Label.Width,\"labelWidth\", Label.Wi";
_setoncondition(_label.Width /*int*/ ,"labelWidth",(Object)(_label.Width /*int*/ ));
 //BA.debugLineNum = 123;BA.debugLine="SetOnCondition(Columns.Size,\"cols\", Columns)";
_setoncondition(_columns.getSize(),"cols",(Object)(_columns.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="SetOnCondition(Rows.Size, \"rows\", Rows)";
_setoncondition(_rows.getSize(),"rows",(Object)(_rows.getObject()));
 //BA.debugLineNum = 125;BA.debugLine="SetOnCondition(Elements.Size, \"elements\", Element";
_setoncondition(_elements.getSize(),"elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 126;BA.debugLine="SetOnCondition(inputWidth,\"inputWidth\",inputWidth";
_setoncondition(_inputwidth,"inputWidth",(Object)(_inputwidth));
 //BA.debugLineNum = 127;BA.debugLine="For Each attr As String In Attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = _attributes.Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_attr = BA.ObjectToString(group21.Get(index21));
 //BA.debugLineNum = 128;BA.debugLine="Dim strVal As Object = Attributes.Get(attr)";
_strval = _attributes.Get((Object)(_attr));
 //BA.debugLineNum = 129;BA.debugLine="Element.Put(attr,strVal)";
_element.Put((Object)(_attr),_strval);
 }
};
 //BA.debugLineNum = 132;BA.debugLine="Dim hSize As Int = HTMLAttributes.Size - 1";
_hsize = (int) (_htmlattributes.getSize()-1);
 //BA.debugLineNum = 133;BA.debugLine="If hSize <> -1 Then";
if (_hsize!=-1) { 
 //BA.debugLineNum = 134;BA.debugLine="Element.Put(\"attributes\", HTMLAttributes)";
_element.Put((Object)("attributes"),(Object)(_htmlattributes.getObject()));
 };
 //BA.debugLineNum = 136;BA.debugLine="Return Element";
if (true) return _element;
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetAttr(attrName As String, attrValue As Objec";
 //BA.debugLineNum = 95;BA.debugLine="SetOnContent(attrName,attrValue)";
_setoncontent(_attrname,BA.ObjectToString(_attrvalue));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setclick(com.ab.banano.BANanoObject _c) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetClick(c As BANanoObject) As WixElement";
 //BA.debugLineNum = 153;BA.debugLine="Element.Put(\"click\", c)";
_element.Put((Object)("click"),(Object)(_c));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcss(String _cs) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetCSS(cs As String) As WixElement";
 //BA.debugLineNum = 89;BA.debugLine="CSS = cs";
_css = _cs;
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setgravity(int _g) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetGravity(g As Int) As WixElement";
 //BA.debugLineNum = 59;BA.debugLine="Gravity = g";
_gravity = _g;
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetHeight(h As Int) As WixElement";
 //BA.debugLineNum = 77;BA.debugLine="Height = h";
_height = _h;
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _sethtmlattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetHTMLAttr(attrName As String, attrValue As O";
 //BA.debugLineNum = 101;BA.debugLine="HTMLAttributes.put(attrName,attrValue)";
_htmlattributes.Put((Object)(_attrname),_attrvalue);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetIcon(i As String) As WixElement";
 //BA.debugLineNum = 141;BA.debugLine="SetOnContent(\"icon\", i)";
_setoncontent("icon",_i);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetLabel(l As String) As WixElement";
 //BA.debugLineNum = 147;BA.debugLine="SetOnContent(\"label\", l)";
_setoncontent("label",_l);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public String  _setoncondition(int _condition,String _prop,Object _propvalue) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetOnCondition(Condition As Int, Prop As Strin";
 //BA.debugLineNum = 214;BA.debugLine="If Condition <= 0 Then Return";
if (_condition<=0) { 
if (true) return "";};
 //BA.debugLineNum = 215;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),_propvalue);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public String  _setoncontent(String _prop,String _propvalue) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetOnContent(Prop As String, PropValue As Stri";
 //BA.debugLineNum = 208;BA.debugLine="If PropValue = \"\" Then Return";
if ((_propvalue).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 209;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),(Object)(_propvalue));
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetTemplate(t As String) As WixElement";
 //BA.debugLineNum = 167;BA.debugLine="Template = t";
_template = _t;
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settype(String _t) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetType(t As String) As WixElement";
 //BA.debugLineNum = 71;BA.debugLine="TypeOf = t";
_typeof = _t;
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setview(String _v) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetView(v As String) As WixElement";
 //BA.debugLineNum = 65;BA.debugLine="View = v";
_view = _v;
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetWidth(w As Int) As WixElement";
 //BA.debugLineNum = 83;BA.debugLine="Width = w";
_width = _w;
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
