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
public String _header = "";
public String _body = "";
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pglayouts _pglayouts = null;
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
 //BA.debugLineNum = 296;BA.debugLine="Sub AddColumn(wxEL As WixColumn)";
 //BA.debugLineNum = 297;BA.debugLine="AddColumns(wxEL.Item)";
_addcolumns(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub AddColumns(itm As Map) As WixElement";
 //BA.debugLineNum = 251;BA.debugLine="Columns.Add(itm)";
_columns.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addelements(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub AddElements(itm As Map) As WixElement";
 //BA.debugLineNum = 257;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub AddItem(itm As Map) As WixElement";
 //BA.debugLineNum = 269;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addresizertocolumns() throws Exception{
b4j.example.wixresizer _r = null;
 //BA.debugLineNum = 236;BA.debugLine="Sub AddResizerToColumns As WixElement";
 //BA.debugLineNum = 237;BA.debugLine="Dim r As WixResizer";
_r = new b4j.example.wixresizer();
 //BA.debugLineNum = 238;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.example.wixresizer*/ (ba,"");
 //BA.debugLineNum = 239;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public String  _addrow(b4j.example.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub AddRow(wxEL As WixRow)";
 //BA.debugLineNum = 275;BA.debugLine="AddRows(wxEL.Item)";
_addrows(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub AddRows(itm As Map) As WixElement";
 //BA.debugLineNum = 263;BA.debugLine="Rows.Add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addtocolumns(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub AddToColumns(prt As WixElement) As WixElement";
 //BA.debugLineNum = 285;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addtoelements(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub AddToElements(prt As WixElement) As WixElement";
 //BA.debugLineNum = 291;BA.debugLine="prt.AddElements(Item)";
_prt._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public String  _addtorows(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub AddToRows(prt As WixElement)";
 //BA.debugLineNum = 280;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 25;BA.debugLine="Public Header As String";
_header = "";
 //BA.debugLineNum = 26;BA.debugLine="Public Body As String";
_body = "";
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize(sID As String) As WixElement";
 //BA.debugLineNum = 31;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 32;BA.debugLine="Template = \"\"";
_template = "";
 //BA.debugLineNum = 33;BA.debugLine="Width = 0";
_width = (int) (0);
 //BA.debugLineNum = 34;BA.debugLine="Height = 0";
_height = (int) (0);
 //BA.debugLineNum = 35;BA.debugLine="Element = CreateMap(\"id\":ID)";
_element = __c.createMap(new Object[] {(Object)("id"),(Object)(_id)});
 //BA.debugLineNum = 36;BA.debugLine="Value = \"\"";
_value = (Object)("");
 //BA.debugLineNum = 37;BA.debugLine="Name = ID";
_name = _id;
 //BA.debugLineNum = 38;BA.debugLine="Container = \"\"";
_container = "";
 //BA.debugLineNum = 39;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 40;BA.debugLine="Elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="Attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="PlaceHolder = \"\"";
_placeholder = "";
 //BA.debugLineNum = 44;BA.debugLine="Align = \"\"";
_align = "";
 //BA.debugLineNum = 45;BA.debugLine="TypeOf = \"\"";
_typeof = "";
 //BA.debugLineNum = 46;BA.debugLine="Container = \"\"";
_container = "";
 //BA.debugLineNum = 47;BA.debugLine="Label.Initialize";
_label.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="Label.Text = \"\"";
_label.Text /*String*/  = "";
 //BA.debugLineNum = 49;BA.debugLine="Label.Width = 0";
_label.Width /*int*/  = (int) (0);
 //BA.debugLineNum = 50;BA.debugLine="inputWidth = 0";
_inputwidth = (int) (0);
 //BA.debugLineNum = 51;BA.debugLine="Gravity = 0";
_gravity = (int) (0);
 //BA.debugLineNum = 52;BA.debugLine="Label.Align = \"\"";
_label.Align /*String*/  = "";
 //BA.debugLineNum = 53;BA.debugLine="Label.Position = \"\"";
_label.Position /*String*/  = "";
 //BA.debugLineNum = 54;BA.debugLine="CSS = \"\"";
_css = "";
 //BA.debugLineNum = 55;BA.debugLine="Header = \"\"";
_header = "";
 //BA.debugLineNum = 56;BA.debugLine="Body = \"\"";
_body = "";
 //BA.debugLineNum = 57;BA.debugLine="HTMLAttributes.Initialize";
_htmlattributes.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
String _attr = "";
Object _strval = null;
int _hsize = 0;
 //BA.debugLineNum = 182;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 183;BA.debugLine="SetOnCondition(Height,\"height\",Height)";
_setoncondition(_height,"height",(Object)(_height));
 //BA.debugLineNum = 184;BA.debugLine="SetOnCondition(Width, \"width\", Width)";
_setoncondition(_width,"width",(Object)(_width));
 //BA.debugLineNum = 185;BA.debugLine="SetOnContent(\"body\", Body)";
_setoncontent("body",_body);
 //BA.debugLineNum = 186;BA.debugLine="SetOnContent(\"header\", Header)";
_setoncontent("header",_header);
 //BA.debugLineNum = 187;BA.debugLine="SetOnContent(\"container\", Container)";
_setoncontent("container",_container);
 //BA.debugLineNum = 188;BA.debugLine="SetOnContent(\"type\", TypeOf)";
_setoncontent("type",_typeof);
 //BA.debugLineNum = 189;BA.debugLine="SetOnContent(\"view\", View)";
_setoncontent("view",_view);
 //BA.debugLineNum = 190;BA.debugLine="SetOnContent(\"name\", Name)";
_setoncontent("name",_name);
 //BA.debugLineNum = 191;BA.debugLine="SetOnContent(\"css\", CSS)";
_setoncontent("css",_css);
 //BA.debugLineNum = 192;BA.debugLine="SetOnContent(\"value\", Value)";
_setoncontent("value",BA.ObjectToString(_value));
 //BA.debugLineNum = 193;BA.debugLine="SetOnContent(\"align\", Align)";
_setoncontent("align",_align);
 //BA.debugLineNum = 194;BA.debugLine="SetOnContent(\"template\", Template)";
_setoncontent("template",_template);
 //BA.debugLineNum = 195;BA.debugLine="SetOnContent(\"label\", Label.Text)";
_setoncontent("label",_label.Text /*String*/ );
 //BA.debugLineNum = 196;BA.debugLine="SetOnContent(\"placeholder\", PlaceHolder)";
_setoncontent("placeholder",_placeholder);
 //BA.debugLineNum = 197;BA.debugLine="SetOnContent(\"labelPosition\", Label.Position)";
_setoncontent("labelPosition",_label.Position /*String*/ );
 //BA.debugLineNum = 198;BA.debugLine="SetOnContent(\"labelAlign\", Label.Align)";
_setoncontent("labelAlign",_label.Align /*String*/ );
 //BA.debugLineNum = 199;BA.debugLine="SetOnCondition(Gravity,\"gravity\", Gravity)";
_setoncondition(_gravity,"gravity",(Object)(_gravity));
 //BA.debugLineNum = 200;BA.debugLine="SetOnCondition(Label.Width,\"labelWidth\", Label.Wi";
_setoncondition(_label.Width /*int*/ ,"labelWidth",(Object)(_label.Width /*int*/ ));
 //BA.debugLineNum = 201;BA.debugLine="SetOnCondition(Columns.Size,\"cols\", Columns)";
_setoncondition(_columns.getSize(),"cols",(Object)(_columns.getObject()));
 //BA.debugLineNum = 202;BA.debugLine="SetOnCondition(Rows.Size, \"rows\", Rows)";
_setoncondition(_rows.getSize(),"rows",(Object)(_rows.getObject()));
 //BA.debugLineNum = 203;BA.debugLine="SetOnCondition(Elements.Size, \"elements\", Element";
_setoncondition(_elements.getSize(),"elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 204;BA.debugLine="SetOnCondition(inputWidth,\"inputWidth\",inputWidth";
_setoncondition(_inputwidth,"inputWidth",(Object)(_inputwidth));
 //BA.debugLineNum = 205;BA.debugLine="For Each attr As String In Attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group23 = _attributes.Keys();
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_attr = BA.ObjectToString(group23.Get(index23));
 //BA.debugLineNum = 206;BA.debugLine="Dim strVal As Object = Attributes.Get(attr)";
_strval = _attributes.Get((Object)(_attr));
 //BA.debugLineNum = 207;BA.debugLine="Element.Put(attr,strVal)";
_element.Put((Object)(_attr),_strval);
 }
};
 //BA.debugLineNum = 210;BA.debugLine="Dim hSize As Int = HTMLAttributes.Size - 1";
_hsize = (int) (_htmlattributes.getSize()-1);
 //BA.debugLineNum = 211;BA.debugLine="If hSize <> -1 Then";
if (_hsize!=-1) { 
 //BA.debugLineNum = 212;BA.debugLine="Element.Put(\"attributes\", HTMLAttributes)";
_element.Put((Object)("attributes"),(Object)(_htmlattributes.getObject()));
 };
 //BA.debugLineNum = 214;BA.debugLine="Return Element";
if (true) return _element;
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetAttr(attrName As String, attrValue As Objec";
 //BA.debugLineNum = 171;BA.debugLine="SetOnContent(attrName,attrValue)";
_setoncontent(_attrname,BA.ObjectToString(_attrvalue));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setbody(String _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetBody(b As String) As WixElement";
 //BA.debugLineNum = 129;BA.debugLine="Body = b";
_body = _b;
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setclick(com.ab.banano.BANanoObject _c) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetClick(c As BANanoObject) As WixElement";
 //BA.debugLineNum = 231;BA.debugLine="Element.Put(\"click\", c)";
_element.Put((Object)("click"),(Object)(_c));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcss(String _cs) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetCSS(cs As String) As WixElement";
 //BA.debugLineNum = 165;BA.debugLine="CSS = cs";
_css = _cs;
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetData(d As List) As WixElement";
 //BA.debugLineNum = 117;BA.debugLine="Element.Put(\"data\", d)";
_element.Put((Object)("data"),(Object)(_d.getObject()));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setgravity(int _g) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetGravity(g As Int) As WixElement";
 //BA.debugLineNum = 135;BA.debugLine="Gravity = g";
_gravity = _g;
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setheader(String _h) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetHeader(h As String) As WixElement";
 //BA.debugLineNum = 123;BA.debugLine="Header = h";
_header = _h;
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetHeight(h As Int) As WixElement";
 //BA.debugLineNum = 153;BA.debugLine="Height = h";
_height = _h;
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _sethtmlattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetHTMLAttr(attrName As String, attrValue As O";
 //BA.debugLineNum = 177;BA.debugLine="HTMLAttributes.put(attrName,attrValue)";
_htmlattributes.Put((Object)(_attrname),_attrvalue);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetIcon(i As String) As WixElement";
 //BA.debugLineNum = 219;BA.debugLine="SetOnContent(\"icon\", i)";
_setoncontent("icon",_i);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetLabel(l As String) As WixElement";
 //BA.debugLineNum = 225;BA.debugLine="SetOnContent(\"label\", l)";
_setoncontent("label",_l);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmargin(String _margin) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetMargin(margin As String) As WixElement";
 //BA.debugLineNum = 87;BA.debugLine="Element.Put(\"margin\", margin)";
_element.Put((Object)("margin"),(Object)(_margin));
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmaxheight(int _h) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetMaxHeight(h As Int) As WixElement";
 //BA.debugLineNum = 81;BA.debugLine="Element.Put(\"maxHeight\", h)";
_element.Put((Object)("maxHeight"),(Object)(_h));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmaxwidth(int _w) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetMaxWidth(w As Int) As WixElement";
 //BA.debugLineNum = 75;BA.debugLine="Element.Put(\"maxWidth\", w)";
_element.Put((Object)("maxWidth"),(Object)(_w));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetMinHeight(h As Int) As WixElement";
 //BA.debugLineNum = 69;BA.debugLine="Element.Put(\"minHeight\", h)";
_element.Put((Object)("minHeight"),(Object)(_h));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetMinWidth(w As Int) As WixElement";
 //BA.debugLineNum = 63;BA.debugLine="Element.put(\"minwidth\",w)";
_element.Put((Object)("minwidth"),(Object)(_w));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setoncondition(int _condition,String _prop,Object _propvalue) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetOnCondition(Condition As Int, Prop As Strin";
 //BA.debugLineNum = 309;BA.debugLine="If Condition <= 0 Then Return Me";
if (_condition<=0) { 
if (true) return (b4j.example.wixelement)(this);};
 //BA.debugLineNum = 310;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),_propvalue);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setoncontent(String _prop,String _propvalue) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetOnContent(Prop As String, PropValue As Stri";
 //BA.debugLineNum = 302;BA.debugLine="If PropValue = \"\" Then Return Me";
if ((_propvalue).equals("")) { 
if (true) return (b4j.example.wixelement)(this);};
 //BA.debugLineNum = 303;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),(Object)(_propvalue));
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpadding(String _padding) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetPadding(padding As String) As WixElement";
 //BA.debugLineNum = 93;BA.debugLine="Element.Put(\"padding\", padding)";
_element.Put((Object)("padding"),(Object)(_padding));
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpaddingx(String _x) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetPaddingX(x As String) As WixElement";
 //BA.debugLineNum = 99;BA.debugLine="Element.Put(\"paddingX\", x)";
_element.Put((Object)("paddingX"),(Object)(_x));
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpaddingy(String _y) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetPaddingY(y As String) As WixElement";
 //BA.debugLineNum = 105;BA.debugLine="Element.Put(\"paddingY\",y)";
_element.Put((Object)("paddingY"),(Object)(_y));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setproperty(String _p,Object _v) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetProperty(p As String, v As Object) As WixEl";
 //BA.debugLineNum = 111;BA.debugLine="Element.Put(p,v)";
_element.Put((Object)(_p),_v);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetTemplate(t As String) As WixElement";
 //BA.debugLineNum = 245;BA.debugLine="Template = t";
_template = _t;
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settype(String _t) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetType(t As String) As WixElement";
 //BA.debugLineNum = 147;BA.debugLine="TypeOf = t";
_typeof = _t;
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setview(String _v) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetView(v As String) As WixElement";
 //BA.debugLineNum = 141;BA.debugLine="View = v";
_view = _v;
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetWidth(w As Int) As WixElement";
 //BA.debugLineNum = 159;BA.debugLine="Width = w";
_width = _w;
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
