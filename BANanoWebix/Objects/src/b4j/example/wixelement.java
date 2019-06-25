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
public Object _body = null;
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public anywheresoftware.b4a.objects.collections.List _cells = null;
public anywheresoftware.b4a.objects.collections.Map _elementsconfig = null;
public b4j.example.main _main = null;
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pgdatatable1 _pgdatatable1 = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pgcharts _pgcharts = null;
public b4j.example.pgdataentry _pgdataentry = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgtoolbar _pgtoolbar = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
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
public b4j.example.wixelement  _addcells(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub AddCells(itm As Map) As WixElement";
 //BA.debugLineNum = 388;BA.debugLine="Cells.Add(itm)";
_cells.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public String  _addcolumn(b4j.example.wixcolumn _wxel) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub AddColumn(wxEL As WixColumn)";
 //BA.debugLineNum = 483;BA.debugLine="AddColumns(wxEL.Item)";
_addcolumns(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub AddColumns(itm As Map) As WixElement";
 //BA.debugLineNum = 382;BA.debugLine="Columns.Add(itm)";
_columns.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addcolumnscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 402;BA.debugLine="Sub AddColumnsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 403;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 404;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 405;BA.debugLine="AddColumns(opt)";
_addcolumns(_opt);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public String  _addcolumnsspacer() throws Exception{
b4j.example.wixelement _s = null;
 //BA.debugLineNum = 445;BA.debugLine="Sub AddColumnsSpacer()";
 //BA.debugLineNum = 446;BA.debugLine="Dim s As WixElement";
_s = new b4j.example.wixelement();
 //BA.debugLineNum = 447;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.example.wixelement*/ (ba,"")._setview /*b4j.example.wixelement*/ ("spacer");
 //BA.debugLineNum = 448;BA.debugLine="AddColumns(s.item)";
_addcolumns(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addelements(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Sub AddElements(itm As Map) As WixElement";
 //BA.debugLineNum = 411;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub AddItem(itm As Map) As WixElement";
 //BA.debugLineNum = 423;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addresizertocolumns() throws Exception{
b4j.example.wixresizer _r = null;
 //BA.debugLineNum = 367;BA.debugLine="Sub AddResizerToColumns As WixElement";
 //BA.debugLineNum = 368;BA.debugLine="Dim r As WixResizer";
_r = new b4j.example.wixresizer();
 //BA.debugLineNum = 369;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.example.wixresizer*/ (ba,"");
 //BA.debugLineNum = 370;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public String  _addrow(b4j.example.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub AddRow(wxEL As WixRow)";
 //BA.debugLineNum = 429;BA.debugLine="AddRows(wxEL.Item)";
_addrows(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub AddRows(itm As Map) As WixElement";
 //BA.debugLineNum = 417;BA.debugLine="Rows.Add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addrowscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 393;BA.debugLine="Sub AddRowsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 394;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 395;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 396;BA.debugLine="AddRows(opt)";
_addrows(_opt);
 //BA.debugLineNum = 397;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return null;
}
public String  _addrowsspacer() throws Exception{
b4j.example.wixelement _s = null;
 //BA.debugLineNum = 438;BA.debugLine="Sub AddRowsSpacer()";
 //BA.debugLineNum = 439;BA.debugLine="Dim s As WixElement";
_s = new b4j.example.wixelement();
 //BA.debugLineNum = 440;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.example.wixelement*/ (ba,"")._setview /*b4j.example.wixelement*/ ("spacer");
 //BA.debugLineNum = 441;BA.debugLine="AddRows(s.item)";
_addrows(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _addtocolumns(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 452;BA.debugLine="Sub AddToColumns(prt As WixElement) As WixElement";
 //BA.debugLineNum = 453;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _addtoelements(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub AddToElements(prt As WixElement) As WixElement";
 //BA.debugLineNum = 477;BA.debugLine="prt.AddElements(Item)";
_prt._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public String  _addtorow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 544;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 545;BA.debugLine="r.AddItem(Item)";
_r._additem /*b4j.example.wixrow*/ (_item());
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Sub AddToRows(prt As WixElement)";
 //BA.debugLineNum = 434;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 5;BA.debugLine="Public Width As Int";
_width = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public Height As Int";
_height = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public Rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private Element As Map";
_element = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public Value As Object";
_value = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Public Elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Public Name As String";
_name = "";
 //BA.debugLineNum = 12;BA.debugLine="Private Attributes As Map";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Public TypeOf As String";
_typeof = "";
 //BA.debugLineNum = 14;BA.debugLine="Public Container As String";
_container = "";
 //BA.debugLineNum = 15;BA.debugLine="Public PlaceHolder As String";
_placeholder = "";
 //BA.debugLineNum = 16;BA.debugLine="Public Align As String";
_align = "";
 //BA.debugLineNum = 17;BA.debugLine="Type LabelType(Text As String, Width As Int, Posi";
;
 //BA.debugLineNum = 18;BA.debugLine="Public Label As LabelType";
_label = new b4j.example.wixelement._labeltype();
 //BA.debugLineNum = 19;BA.debugLine="Public inputWidth As Int";
_inputwidth = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private HTMLAttributes As Map";
_htmlattributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 21;BA.debugLine="Public View As String";
_view = "";
 //BA.debugLineNum = 22;BA.debugLine="Public Gravity As Int";
_gravity = 0;
 //BA.debugLineNum = 23;BA.debugLine="Public CSS As String";
_css = "";
 //BA.debugLineNum = 24;BA.debugLine="Public Header As String";
_header = "";
 //BA.debugLineNum = 25;BA.debugLine="Public Body As Object";
_body = new Object();
 //BA.debugLineNum = 26;BA.debugLine="Private Styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 27;BA.debugLine="Private Cells As List";
_cells = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="Private elementsConfig As Map";
_elementsconfig = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 70;BA.debugLine="Public Sub Initialize(sID As String) As WixElement";
 //BA.debugLineNum = 71;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 72;BA.debugLine="Width = 0";
_width = (int) (0);
 //BA.debugLineNum = 73;BA.debugLine="Cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="elementsConfig.Initialize";
_elementsconfig.Initialize();
 //BA.debugLineNum = 75;BA.debugLine="Height = 0";
_height = (int) (0);
 //BA.debugLineNum = 76;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 77;BA.debugLine="Element = CreateMap(\"id\":ID)";
_element = __c.createMap(new Object[] {(Object)("id"),(Object)(_id)});
 //BA.debugLineNum = 78;BA.debugLine="Value = \"\"";
_value = (Object)("");
 //BA.debugLineNum = 79;BA.debugLine="Name = ID";
_name = _id;
 //BA.debugLineNum = 80;BA.debugLine="Container = \"\"";
_container = "";
 //BA.debugLineNum = 81;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 82;BA.debugLine="Elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 83;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="Attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 85;BA.debugLine="PlaceHolder = \"\"";
_placeholder = "";
 //BA.debugLineNum = 86;BA.debugLine="Align = \"\"";
_align = "";
 //BA.debugLineNum = 87;BA.debugLine="TypeOf = \"\"";
_typeof = "";
 //BA.debugLineNum = 88;BA.debugLine="Container = \"\"";
_container = "";
 //BA.debugLineNum = 89;BA.debugLine="Label.Initialize";
_label.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="Label.Text = \"\"";
_label.Text /*String*/  = "";
 //BA.debugLineNum = 91;BA.debugLine="Label.Width = 0";
_label.Width /*int*/  = (int) (0);
 //BA.debugLineNum = 92;BA.debugLine="inputWidth = 0";
_inputwidth = (int) (0);
 //BA.debugLineNum = 93;BA.debugLine="Gravity = 0";
_gravity = (int) (0);
 //BA.debugLineNum = 94;BA.debugLine="Label.Align = \"\"";
_label.Align /*String*/  = "";
 //BA.debugLineNum = 95;BA.debugLine="Label.Position = \"\"";
_label.Position /*String*/  = "";
 //BA.debugLineNum = 96;BA.debugLine="CSS = \"\"";
_css = "";
 //BA.debugLineNum = 97;BA.debugLine="Header = \"\"";
_header = "";
 //BA.debugLineNum = 98;BA.debugLine="Body = \"\"";
_body = (Object)("");
 //BA.debugLineNum = 99;BA.debugLine="HTMLAttributes.Initialize";
_htmlattributes.Initialize();
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
String _attr = "";
Object _strval = null;
 //BA.debugLineNum = 309;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 310;BA.debugLine="For Each attr As String In Attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attributes.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_attr = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 311;BA.debugLine="Dim strVal As Object = Attributes.Get(attr)";
_strval = _attributes.Get((Object)(_attr));
 //BA.debugLineNum = 312;BA.debugLine="Element.Put(attr,strVal)";
_element.Put((Object)(_attr),_strval);
 }
};
 //BA.debugLineNum = 314;BA.debugLine="SetOnCondition(Height,\"height\",Height)";
_setoncondition(_height,"height",(Object)(_height));
 //BA.debugLineNum = 315;BA.debugLine="SetOnCondition(Width, \"width\", Width)";
_setoncondition(_width,"width",(Object)(_width));
 //BA.debugLineNum = 316;BA.debugLine="SetOnContent(\"body\", Body)";
_setoncontent("body",BA.ObjectToString(_body));
 //BA.debugLineNum = 317;BA.debugLine="SetOnContent(\"header\", Header)";
_setoncontent("header",_header);
 //BA.debugLineNum = 318;BA.debugLine="SetOnContent(\"container\", Container)";
_setoncontent("container",_container);
 //BA.debugLineNum = 319;BA.debugLine="SetOnContent(\"type\", TypeOf)";
_setoncontent("type",_typeof);
 //BA.debugLineNum = 320;BA.debugLine="SetOnContent(\"view\", View)";
_setoncontent("view",_view);
 //BA.debugLineNum = 321;BA.debugLine="SetOnContent(\"name\", Name)";
_setoncontent("name",_name);
 //BA.debugLineNum = 322;BA.debugLine="SetOnContent(\"css\", CSS)";
_setoncontent("css",_css);
 //BA.debugLineNum = 323;BA.debugLine="SetOnContent(\"value\", Value)";
_setoncontent("value",BA.ObjectToString(_value));
 //BA.debugLineNum = 324;BA.debugLine="SetOnContent(\"align\", Align)";
_setoncontent("align",_align);
 //BA.debugLineNum = 325;BA.debugLine="SetOnContent(\"label\", Label.Text)";
_setoncontent("label",_label.Text /*String*/ );
 //BA.debugLineNum = 326;BA.debugLine="SetOnContent(\"placeholder\", PlaceHolder)";
_setoncontent("placeholder",_placeholder);
 //BA.debugLineNum = 327;BA.debugLine="SetOnContent(\"labelPosition\", Label.Position)";
_setoncontent("labelPosition",_label.Position /*String*/ );
 //BA.debugLineNum = 328;BA.debugLine="SetOnContent(\"labelAlign\", Label.Align)";
_setoncontent("labelAlign",_label.Align /*String*/ );
 //BA.debugLineNum = 329;BA.debugLine="SetOnCondition(Gravity,\"gravity\", Gravity)";
_setoncondition(_gravity,"gravity",(Object)(_gravity));
 //BA.debugLineNum = 330;BA.debugLine="SetOnCondition(Label.Width,\"labelWidth\", Label.Wi";
_setoncondition(_label.Width /*int*/ ,"labelWidth",(Object)(_label.Width /*int*/ ));
 //BA.debugLineNum = 331;BA.debugLine="SetOnCondition(Columns.Size,\"cols\", Columns)";
_setoncondition(_columns.getSize(),"cols",(Object)(_columns.getObject()));
 //BA.debugLineNum = 332;BA.debugLine="SetOnCondition(Rows.Size, \"rows\", Rows)";
_setoncondition(_rows.getSize(),"rows",(Object)(_rows.getObject()));
 //BA.debugLineNum = 333;BA.debugLine="SetOnCondition(Elements.Size, \"elements\", Element";
_setoncondition(_elements.getSize(),"elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 334;BA.debugLine="SetOnCondition(Cells.Size, \"cells\", Cells)";
_setoncondition(_cells.getSize(),"cells",(Object)(_cells.getObject()));
 //BA.debugLineNum = 335;BA.debugLine="SetOnCondition(inputWidth,\"inputWidth\",inputWidth";
_setoncondition(_inputwidth,"inputWidth",(Object)(_inputwidth));
 //BA.debugLineNum = 336;BA.debugLine="SetOnCondition(HTMLAttributes.Size, \"attributes\",";
_setoncondition(_htmlattributes.getSize(),"attributes",(Object)(_htmlattributes.getObject()));
 //BA.debugLineNum = 337;BA.debugLine="SetOnCondition(elementsConfig.Size, \"elementsConf";
_setoncondition(_elementsconfig.getSize(),"elementsConfig",(Object)(_elementsconfig.getObject()));
 //BA.debugLineNum = 338;BA.debugLine="SetOnCondition(Styles.Size, \"css\", Styles)";
_setoncondition(_styles.getSize(),"css",(Object)(_styles.getObject()));
 //BA.debugLineNum = 339;BA.debugLine="Return Element";
if (true) return _element;
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 464;BA.debugLine="Sub SetAlignCenter(r As String) As WixElement 'ign";
 //BA.debugLineNum = 465;BA.debugLine="Align = \"center\"";
_align = "center";
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 470;BA.debugLine="Sub SetAlignLeft(r As String) As WixElement 'ignor";
 //BA.debugLineNum = 471;BA.debugLine="Align = \"left\"";
_align = "left";
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 458;BA.debugLine="Sub SetAlignRight(r As String) As WixElement 'igno";
 //BA.debugLineNum = 459;BA.debugLine="Align = \"right\"";
_align = "right";
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetAnimate(b As Boolean) As WixElement";
 //BA.debugLineNum = 166;BA.debugLine="SetProperty(\"animate\",b)";
_setproperty("animate",(Object)(_b));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub SetAttr(attrName As String, attrValue As Objec";
 //BA.debugLineNum = 298;BA.debugLine="SetOnContent(attrName,attrValue)";
_setoncontent(_attrname,BA.ObjectToString(_attrvalue));
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetBatch(b As Int) As WixElement";
 //BA.debugLineNum = 160;BA.debugLine="SetProperty(\"batch\",b)";
_setproperty("batch",(Object)(_b));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setbody(Object _b) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetBody(b As Object) As WixElement";
 //BA.debugLineNum = 250;BA.debugLine="Body = b";
_body = _b;
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixElement";
 //BA.debugLineNum = 47;BA.debugLine="SetProperty(\"borderless\", b)";
_setproperty("borderless",(Object)(_b));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setclick(com.ab.banano.BANanoObject _c) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetClick(c As BANanoObject) As WixElement";
 //BA.debugLineNum = 362;BA.debugLine="Element.Put(\"click\", c)";
_element.Put((Object)("click"),(Object)(_c));
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcollapsed(boolean _c) throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Sub SetCollapsed(c As Boolean) As WixElement";
 //BA.debugLineNum = 550;BA.debugLine="SetProperty(\"collapsed\", c)";
_setproperty("collapsed",(Object)(_c));
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetContainer(c As String) As WixElement";
 //BA.debugLineNum = 41;BA.debugLine="SetAttr(\"container\", c)";
_setattr("container",(Object)(_c));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setcss(String _cs) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetCSS(cs As String) As WixElement";
 //BA.debugLineNum = 292;BA.debugLine="CSS = cs";
_css = _cs;
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetData(d As List) As WixElement";
 //BA.debugLineNum = 238;BA.debugLine="Element.Put(\"data\", d)";
_element.Put((Object)("data"),(Object)(_d.getObject()));
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultalign(String _a) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetDefaultAlign(a As String) As WixElement";
 //BA.debugLineNum = 142;BA.debugLine="elementsConfig.Put(\"align\", a)";
_elementsconfig.Put((Object)("align"),(Object)(_a));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetDefaultLabelAlign(a As String) As WixElemen";
 //BA.debugLineNum = 123;BA.debugLine="elementsConfig.Put(\"labelAlign\", a)";
_elementsconfig.Put((Object)("labelAlign"),(Object)(_a));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetDefaultLabelPosition(p As String) As WixEle";
 //BA.debugLineNum = 136;BA.debugLine="elementsConfig.Put(\"labelPosition\", p)";
_elementsconfig.Put((Object)("labelPosition"),(Object)(_p));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetDefaultLabelWidth(a As Int) As WixElement";
 //BA.debugLineNum = 129;BA.debugLine="elementsConfig.Put(\"labelWidth\", a)";
_elementsconfig.Put((Object)("labelWidth"),(Object)(_a));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttype(String _a) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetDefaultType(a As String) As WixElement";
 //BA.debugLineNum = 117;BA.debugLine="elementsConfig.Put(\"type\", a)";
_elementsconfig.Put((Object)("type"),(Object)(_a));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeicon(String _r) throws Exception{
 //BA.debugLineNum = 573;BA.debugLine="Sub SetDefaultTypeIcon(r As String) As WixElement";
 //BA.debugLineNum = 574;BA.debugLine="TypeOf = \"icon\"";
_typeof = "icon";
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeiconbutton() throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub SetDefaultTypeIconButton() As WixElement";
 //BA.debugLineNum = 556;BA.debugLine="TypeOf = \"iconButton\"";
_typeof = "iconButton";
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeiconbuttontop(String _r) throws Exception{
 //BA.debugLineNum = 579;BA.debugLine="Sub SetDefaultTypeIconButtonTop(r As String) As Wi";
 //BA.debugLineNum = 580;BA.debugLine="TypeOf = \"iconButtonTop\"";
_typeof = "iconButtonTop";
 //BA.debugLineNum = 581;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeimage(String _r) throws Exception{
 //BA.debugLineNum = 567;BA.debugLine="Sub SetDefaultTypeImage(r As String) As WixElement";
 //BA.debugLineNum = 568;BA.debugLine="TypeOf = \"image\"";
_typeof = "image";
 //BA.debugLineNum = 569;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaulttypeimagebutton(String _r) throws Exception{
 //BA.debugLineNum = 561;BA.debugLine="Sub SetDefaultTypeImageButton(r As String) As WixE";
 //BA.debugLineNum = 562;BA.debugLine="TypeOf =  \"imageButton\"";
_typeof = "imageButton";
 //BA.debugLineNum = 563;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultview(String _a) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetDefaultView(a As String) As WixElement";
 //BA.debugLineNum = 111;BA.debugLine="elementsConfig.Put(\"view\", a)";
_elementsconfig.Put((Object)("view"),(Object)(_a));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setdefaultwidth(int _w) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetDefaultWidth(w As Int) As WixElement";
 //BA.debugLineNum = 148;BA.debugLine="elementsConfig.Put(\"width\", w)";
_elementsconfig.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setgravity(int _g) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetGravity(g As Int) As WixElement";
 //BA.debugLineNum = 256;BA.debugLine="Gravity = g";
_gravity = _g;
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setheader(String _h) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetHeader(h As String) As WixElement";
 //BA.debugLineNum = 244;BA.debugLine="Header = h";
_header = _h;
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetHeight(h As Int) As WixElement";
 //BA.debugLineNum = 280;BA.debugLine="Height = h";
_height = _h;
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _sethtmlattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetHTMLAttr(attrName As String, attrValue As O";
 //BA.debugLineNum = 304;BA.debugLine="HTMLAttributes.put(attrName,attrValue)";
_htmlattributes.Put((Object)(_attrname),_attrvalue);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetIcon(i As String) As WixElement";
 //BA.debugLineNum = 350;BA.debugLine="SetOnContent(\"icon\", i)";
_setoncontent("icon",_i);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetInputWidth(w As Int) As WixElement";
 //BA.debugLineNum = 208;BA.debugLine="SetProperty(\"inputWidth\", w)";
_setproperty("inputWidth",(Object)(_w));
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetLabel(l As String) As WixElement";
 //BA.debugLineNum = 356;BA.debugLine="SetOnContent(\"label\", l)";
_setoncontent("label",_l);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setlabelheight(int _h) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetLabelHeight(h As Int) As WixElement";
 //BA.debugLineNum = 59;BA.debugLine="SetProperty(\"labelHeight\", h)";
_setproperty("labelHeight",(Object)(_h));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmargin(String _margin) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetMargin(margin As String) As WixElement";
 //BA.debugLineNum = 202;BA.debugLine="Element.Put(\"margin\", margin)";
_element.Put((Object)("margin"),(Object)(_margin));
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmaxheight(int _h) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetMaxHeight(h As Int) As WixElement";
 //BA.debugLineNum = 196;BA.debugLine="Element.Put(\"maxHeight\", h)";
_element.Put((Object)("maxHeight"),(Object)(_h));
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmaxwidth(int _w) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetMaxWidth(w As Int) As WixElement";
 //BA.debugLineNum = 190;BA.debugLine="Element.Put(\"maxWidth\", w)";
_element.Put((Object)("maxWidth"),(Object)(_w));
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetMinHeight(h As Int) As WixElement";
 //BA.debugLineNum = 184;BA.debugLine="Element.Put(\"minHeight\", h)";
_element.Put((Object)("minHeight"),(Object)(_h));
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetMinWidth(w As Int) As WixElement";
 //BA.debugLineNum = 178;BA.debugLine="Element.put(\"minwidth\",w)";
_element.Put((Object)("minwidth"),(Object)(_w));
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetMultiView(b As Boolean) As WixElement";
 //BA.debugLineNum = 344;BA.debugLine="SetProperty(\"multiview\", b)";
_setproperty("multiview",(Object)(_b));
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setoncondition(int _condition,String _prop,Object _propvalue) throws Exception{
 //BA.debugLineNum = 494;BA.debugLine="Sub SetOnCondition(Condition As Int, Prop As Strin";
 //BA.debugLineNum = 495;BA.debugLine="If Condition <= 0 Then Return Me";
if (_condition<=0) { 
if (true) return (b4j.example.wixelement)(this);};
 //BA.debugLineNum = 496;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),_propvalue);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setoncontent(String _prop,String _propvalue) throws Exception{
 //BA.debugLineNum = 487;BA.debugLine="Sub SetOnContent(Prop As String, PropValue As Stri";
 //BA.debugLineNum = 488;BA.debugLine="If PropValue = \"\" Then Return Me";
if ((_propvalue).equals("")) { 
if (true) return (b4j.example.wixelement)(this);};
 //BA.debugLineNum = 489;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),(Object)(_propvalue));
 //BA.debugLineNum = 490;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpadding(String _padding) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetPadding(padding As String) As WixElement";
 //BA.debugLineNum = 214;BA.debugLine="Element.Put(\"padding\", padding)";
_element.Put((Object)("padding"),(Object)(_padding));
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpaddingx(String _x) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetPaddingX(x As String) As WixElement";
 //BA.debugLineNum = 220;BA.debugLine="Element.Put(\"paddingX\", x)";
_element.Put((Object)("paddingX"),(Object)(_x));
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setpaddingy(String _y) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetPaddingY(y As String) As WixElement";
 //BA.debugLineNum = 226;BA.debugLine="Element.Put(\"paddingY\",y)";
_element.Put((Object)("paddingY"),(Object)(_y));
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setproperty(String _p,Object _v) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetProperty(p As String, v As Object) As WixEl";
 //BA.debugLineNum = 232;BA.debugLine="Element.Put(p,v)";
_element.Put((Object)(_p),_v);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetRequired(b As Boolean) As WixElement";
 //BA.debugLineNum = 105;BA.debugLine="SetProperty(\"required\", b)";
_setproperty("required",(Object)(_b));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setscroll(boolean _c) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetScroll(c As Boolean) As WixElement";
 //BA.debugLineNum = 34;BA.debugLine="SetAttr(\"scroll\", c)";
_setattr("scroll",(Object)(_c));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetSelect(b As Boolean) As WixElement";
 //BA.debugLineNum = 53;BA.debugLine="SetProperty(\"select\", b)";
_setproperty("select",(Object)(_b));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 172;BA.debugLine="Styles.Put(prop,val)";
_styles.Put((Object)(_prop),(Object)(_val));
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub SetTemplate(t As Object) As WixElement";
 //BA.debugLineNum = 376;BA.debugLine="Element.Put(\"template\", t)";
_element.Put((Object)("template"),_t);
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetTooltip(tt As String) As WixElement";
 //BA.debugLineNum = 65;BA.debugLine="SetProperty(\"tooltip\", tt)";
_setproperty("tooltip",(Object)(_tt));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settype(String _t) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetType(t As String) As WixElement";
 //BA.debugLineNum = 274;BA.debugLine="TypeOf = t";
_typeof = _t;
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypeclean() throws Exception{
 //BA.debugLineNum = 501;BA.debugLine="Sub SetTypeClean As WixElement";
 //BA.debugLineNum = 502;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 503;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypeform() throws Exception{
 //BA.debugLineNum = 531;BA.debugLine="Sub SetTypeForm As WixElement";
 //BA.debugLineNum = 532;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 533;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypehead() throws Exception{
 //BA.debugLineNum = 525;BA.debugLine="Sub SetTypeHead As WixElement";
 //BA.debugLineNum = 526;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 527;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypeline() throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Sub SetTypeLine As WixElement";
 //BA.debugLineNum = 508;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypespace() throws Exception{
 //BA.debugLineNum = 519;BA.debugLine="Sub SetTypeSpace As WixElement";
 //BA.debugLineNum = 520;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 521;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _settypewide() throws Exception{
 //BA.debugLineNum = 513;BA.debugLine="Sub SetTypeWide As WixElement";
 //BA.debugLineNum = 514;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 515;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetValue(v As String) As WixElement";
 //BA.debugLineNum = 268;BA.debugLine="Value = v";
_value = (Object)(_v);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setview(String _v) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetView(v As String) As WixElement";
 //BA.debugLineNum = 262;BA.debugLine="View = v";
_view = _v;
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setviewheaderlayout() throws Exception{
 //BA.debugLineNum = 538;BA.debugLine="Sub SetViewHeaderLayout As WixElement";
 //BA.debugLineNum = 539;BA.debugLine="SetView(\"headerlayout\")";
_setview("headerlayout");
 //BA.debugLineNum = 540;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setvisiblebatch(int _b) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetVisibleBatch(b As Int) As WixElement";
 //BA.debugLineNum = 154;BA.debugLine="SetProperty(\"visibleBatch\", b)";
_setproperty("visibleBatch",(Object)(_b));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixelement  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetWidth(w As Int) As WixElement";
 //BA.debugLineNum = 286;BA.debugLine="Width = w";
_width = _w;
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.wixelement)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
