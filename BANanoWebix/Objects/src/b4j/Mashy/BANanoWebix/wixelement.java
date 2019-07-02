package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixelement extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixelement", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixelement.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.List _columns = null;
public Object _width = null;
public Object _height = null;
public anywheresoftware.b4a.objects.collections.List _rows = null;
public anywheresoftware.b4a.objects.collections.Map _element = null;
public Object _value = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public anywheresoftware.b4a.objects.collections.Map _attributes = null;
public String _typeof = "";
public String _container = "";
public String _placeholder = "";
public String _align = "";
public b4j.Mashy.BANanoWebix.wixelement._labeltype _label = null;
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
public b4j.Mashy.BANanoWebix.main _main = null;
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
public b4j.Mashy.BANanoWebix.wixelement  _addcells(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub AddCells(itm As Map) As WixElement";
 //BA.debugLineNum = 404;BA.debugLine="Cells.Add(itm)";
_cells.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public String  _addcolumn(b4j.Mashy.BANanoWebix.wixcolumn _wxel) throws Exception{
 //BA.debugLineNum = 498;BA.debugLine="Sub AddColumn(wxEL As WixColumn)";
 //BA.debugLineNum = 499;BA.debugLine="AddColumns(wxEL.Item)";
_addcolumns(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixelement  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub AddColumns(itm As Map) As WixElement";
 //BA.debugLineNum = 398;BA.debugLine="Columns.Add(itm)";
_columns.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _addcolumnscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 418;BA.debugLine="Sub AddColumnsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 419;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 420;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 421;BA.debugLine="AddColumns(opt)";
_addcolumns(_opt);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public String  _addcolumnsspacer() throws Exception{
b4j.Mashy.BANanoWebix.wixelement _s = null;
 //BA.debugLineNum = 461;BA.debugLine="Sub AddColumnsSpacer()";
 //BA.debugLineNum = 462;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 463;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("spacer");
 //BA.debugLineNum = 464;BA.debugLine="AddColumns(s.item)";
_addcolumns(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixelement  _addelements(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub AddElements(itm As Map) As WixElement";
 //BA.debugLineNum = 427;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 438;BA.debugLine="Sub AddItem(itm As Map) As WixElement";
 //BA.debugLineNum = 439;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _addresizertocolumns(String _s) throws Exception{
b4j.Mashy.BANanoWebix.wixresizer _r = null;
 //BA.debugLineNum = 383;BA.debugLine="Sub AddResizerToColumns(s As String) As WixElement";
 //BA.debugLineNum = 384;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebix.wixresizer();
 //BA.debugLineNum = 385;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebix.wixresizer*/ (ba,"");
 //BA.debugLineNum = 386;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public String  _addrow(b4j.Mashy.BANanoWebix.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub AddRow(wxEL As WixRow)";
 //BA.debugLineNum = 445;BA.debugLine="AddRows(wxEL.Item)";
_addrows(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixelement  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Sub AddRows(itm As Map) As WixElement";
 //BA.debugLineNum = 433;BA.debugLine="Rows.Add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _addrowscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 409;BA.debugLine="Sub AddRowsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 410;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 411;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 412;BA.debugLine="AddRows(opt)";
_addrows(_opt);
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public String  _addrowsspacer() throws Exception{
b4j.Mashy.BANanoWebix.wixelement _s = null;
 //BA.debugLineNum = 454;BA.debugLine="Sub AddRowsSpacer()";
 //BA.debugLineNum = 455;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 456;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("spacer");
 //BA.debugLineNum = 457;BA.debugLine="AddRows(s.item)";
_addrows(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixelement  _addtocolumns(b4j.Mashy.BANanoWebix.wixelement _prt) throws Exception{
 //BA.debugLineNum = 468;BA.debugLine="Sub AddToColumns(prt As WixElement) As WixElement";
 //BA.debugLineNum = 469;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_item());
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _addtoelements(b4j.Mashy.BANanoWebix.wixelement _prt) throws Exception{
 //BA.debugLineNum = 492;BA.debugLine="Sub AddToElements(prt As WixElement) As WixElement";
 //BA.debugLineNum = 493;BA.debugLine="prt.AddElements(Item)";
_prt._addelements /*b4j.Mashy.BANanoWebix.wixelement*/ (_item());
 //BA.debugLineNum = 494;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public String  _addtorow(b4j.Mashy.BANanoWebix.wixrow _r) throws Exception{
 //BA.debugLineNum = 560;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 561;BA.debugLine="r.AddItem(Item)";
_r._additem /*b4j.Mashy.BANanoWebix.wixrow*/ (_item());
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebix.wixelement _prt) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub AddToRows(prt As WixElement)";
 //BA.debugLineNum = 450;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*b4j.Mashy.BANanoWebix.wixelement*/ (_item());
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 5;BA.debugLine="Public Width As Object";
_width = new Object();
 //BA.debugLineNum = 6;BA.debugLine="Public Height As Object";
_height = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Public Rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private Element As Map";
_element = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public Value As Object";
_value = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Public Elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Private Attributes As Map";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Public TypeOf As String";
_typeof = "";
 //BA.debugLineNum = 13;BA.debugLine="Public Container As String";
_container = "";
 //BA.debugLineNum = 14;BA.debugLine="Public PlaceHolder As String";
_placeholder = "";
 //BA.debugLineNum = 15;BA.debugLine="Public Align As String";
_align = "";
 //BA.debugLineNum = 16;BA.debugLine="Type LabelType(Text As String, Width As Int, Posi";
;
 //BA.debugLineNum = 17;BA.debugLine="Public Label As LabelType";
_label = new b4j.Mashy.BANanoWebix.wixelement._labeltype();
 //BA.debugLineNum = 18;BA.debugLine="Public inputWidth As Int";
_inputwidth = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private HTMLAttributes As Map";
_htmlattributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 20;BA.debugLine="Public View As String";
_view = "";
 //BA.debugLineNum = 21;BA.debugLine="Public Gravity As Int";
_gravity = 0;
 //BA.debugLineNum = 22;BA.debugLine="Public CSS As String";
_css = "";
 //BA.debugLineNum = 23;BA.debugLine="Public Header As String";
_header = "";
 //BA.debugLineNum = 24;BA.debugLine="Public Body As Object";
_body = new Object();
 //BA.debugLineNum = 25;BA.debugLine="Private Styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 26;BA.debugLine="Private Cells As List";
_cells = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 27;BA.debugLine="Private elementsConfig As Map";
_elementsconfig = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixelement  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 81;BA.debugLine="Public Sub Initialize(sID As String) As WixElement";
 //BA.debugLineNum = 82;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 83;BA.debugLine="Width = 0";
_width = (Object)(0);
 //BA.debugLineNum = 84;BA.debugLine="Cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 85;BA.debugLine="elementsConfig.Initialize";
_elementsconfig.Initialize();
 //BA.debugLineNum = 86;BA.debugLine="Height = 0";
_height = (Object)(0);
 //BA.debugLineNum = 87;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="Element = CreateMap(\"id\":ID)";
_element = __c.createMap(new Object[] {(Object)("id"),(Object)(_id)});
 //BA.debugLineNum = 89;BA.debugLine="Value = \"\"";
_value = (Object)("");
 //BA.debugLineNum = 90;BA.debugLine="Container = \"\"";
_container = "";
 //BA.debugLineNum = 91;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 92;BA.debugLine="Elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 94;BA.debugLine="Attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 95;BA.debugLine="PlaceHolder = \"\"";
_placeholder = "";
 //BA.debugLineNum = 96;BA.debugLine="Align = \"\"";
_align = "";
 //BA.debugLineNum = 97;BA.debugLine="TypeOf = \"\"";
_typeof = "";
 //BA.debugLineNum = 98;BA.debugLine="Container = \"\"";
_container = "";
 //BA.debugLineNum = 99;BA.debugLine="Label.Initialize";
_label.Initialize();
 //BA.debugLineNum = 100;BA.debugLine="Label.Text = \"\"";
_label.Text /*String*/  = "";
 //BA.debugLineNum = 101;BA.debugLine="Label.Width = 0";
_label.Width /*int*/  = (int) (0);
 //BA.debugLineNum = 102;BA.debugLine="inputWidth = 0";
_inputwidth = (int) (0);
 //BA.debugLineNum = 103;BA.debugLine="Gravity = 0";
_gravity = (int) (0);
 //BA.debugLineNum = 104;BA.debugLine="Label.Align = \"\"";
_label.Align /*String*/  = "";
 //BA.debugLineNum = 105;BA.debugLine="Label.Position = \"\"";
_label.Position /*String*/  = "";
 //BA.debugLineNum = 106;BA.debugLine="CSS = \"\"";
_css = "";
 //BA.debugLineNum = 107;BA.debugLine="Header = \"\"";
_header = "";
 //BA.debugLineNum = 108;BA.debugLine="Body = \"\"";
_body = (Object)("");
 //BA.debugLineNum = 109;BA.debugLine="HTMLAttributes.Initialize";
_htmlattributes.Initialize();
 //BA.debugLineNum = 110;BA.debugLine="SetName(ID)";
_setname(_id);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
String _attr = "";
Object _strval = null;
 //BA.debugLineNum = 326;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 327;BA.debugLine="For Each attr As String In Attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attributes.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_attr = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 328;BA.debugLine="Dim strVal As Object = Attributes.Get(attr)";
_strval = _attributes.Get((Object)(_attr));
 //BA.debugLineNum = 329;BA.debugLine="Element.Put(attr,strVal)";
_element.Put((Object)(_attr),_strval);
 }
};
 //BA.debugLineNum = 331;BA.debugLine="SetOnCondition(Height,\"height\",Height)";
_setoncondition((int)(BA.ObjectToNumber(_height)),"height",_height);
 //BA.debugLineNum = 332;BA.debugLine="SetOnCondition(Width, \"width\", Width)";
_setoncondition((int)(BA.ObjectToNumber(_width)),"width",_width);
 //BA.debugLineNum = 333;BA.debugLine="SetOnContent(\"body\", Body)";
_setoncontent("body",BA.ObjectToString(_body));
 //BA.debugLineNum = 334;BA.debugLine="SetOnContent(\"header\", Header)";
_setoncontent("header",_header);
 //BA.debugLineNum = 335;BA.debugLine="SetOnContent(\"container\", Container)";
_setoncontent("container",_container);
 //BA.debugLineNum = 336;BA.debugLine="SetOnContent(\"type\", TypeOf)";
_setoncontent("type",_typeof);
 //BA.debugLineNum = 337;BA.debugLine="SetOnContent(\"view\", View)";
_setoncontent("view",_view);
 //BA.debugLineNum = 338;BA.debugLine="SetOnContent(\"css\", CSS)";
_setoncontent("css",_css);
 //BA.debugLineNum = 339;BA.debugLine="SetOnContent(\"value\", Value)";
_setoncontent("value",BA.ObjectToString(_value));
 //BA.debugLineNum = 340;BA.debugLine="SetOnContent(\"align\", Align)";
_setoncontent("align",_align);
 //BA.debugLineNum = 341;BA.debugLine="SetOnContent(\"label\", Label.Text)";
_setoncontent("label",_label.Text /*String*/ );
 //BA.debugLineNum = 342;BA.debugLine="SetOnContent(\"placeholder\", PlaceHolder)";
_setoncontent("placeholder",_placeholder);
 //BA.debugLineNum = 343;BA.debugLine="SetOnContent(\"labelPosition\", Label.Position)";
_setoncontent("labelPosition",_label.Position /*String*/ );
 //BA.debugLineNum = 344;BA.debugLine="SetOnContent(\"labelAlign\", Label.Align)";
_setoncontent("labelAlign",_label.Align /*String*/ );
 //BA.debugLineNum = 345;BA.debugLine="SetOnCondition(Gravity,\"gravity\", Gravity)";
_setoncondition(_gravity,"gravity",(Object)(_gravity));
 //BA.debugLineNum = 346;BA.debugLine="SetOnCondition(Label.Width,\"labelWidth\", Label.Wi";
_setoncondition(_label.Width /*int*/ ,"labelWidth",(Object)(_label.Width /*int*/ ));
 //BA.debugLineNum = 347;BA.debugLine="SetOnCondition(Columns.Size,\"cols\", Columns)";
_setoncondition(_columns.getSize(),"cols",(Object)(_columns.getObject()));
 //BA.debugLineNum = 348;BA.debugLine="SetOnCondition(Rows.Size, \"rows\", Rows)";
_setoncondition(_rows.getSize(),"rows",(Object)(_rows.getObject()));
 //BA.debugLineNum = 349;BA.debugLine="SetOnCondition(Elements.Size, \"elements\", Element";
_setoncondition(_elements.getSize(),"elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 350;BA.debugLine="SetOnCondition(Cells.Size, \"cells\", Cells)";
_setoncondition(_cells.getSize(),"cells",(Object)(_cells.getObject()));
 //BA.debugLineNum = 351;BA.debugLine="SetOnCondition(inputWidth,\"inputWidth\",inputWidth";
_setoncondition(_inputwidth,"inputWidth",(Object)(_inputwidth));
 //BA.debugLineNum = 352;BA.debugLine="SetOnCondition(HTMLAttributes.Size, \"attributes\",";
_setoncondition(_htmlattributes.getSize(),"attributes",(Object)(_htmlattributes.getObject()));
 //BA.debugLineNum = 353;BA.debugLine="SetOnCondition(elementsConfig.Size, \"elementsConf";
_setoncondition(_elementsconfig.getSize(),"elementsConfig",(Object)(_elementsconfig.getObject()));
 //BA.debugLineNum = 354;BA.debugLine="SetOnCondition(Styles.Size, \"css\", Styles)";
_setoncondition(_styles.getSize(),"css",(Object)(_styles.getObject()));
 //BA.debugLineNum = 355;BA.debugLine="Return Element";
if (true) return _element;
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 480;BA.debugLine="Sub SetAlignCenter(r As String) As WixElement 'ign";
 //BA.debugLineNum = 481;BA.debugLine="Align = \"center\"";
_align = "center";
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 486;BA.debugLine="Sub SetAlignLeft(r As String) As WixElement 'ignor";
 //BA.debugLineNum = 487;BA.debugLine="Align = \"left\"";
_align = "left";
 //BA.debugLineNum = 488;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 474;BA.debugLine="Sub SetAlignRight(r As String) As WixElement 'igno";
 //BA.debugLineNum = 475;BA.debugLine="Align = \"right\"";
_align = "right";
 //BA.debugLineNum = 476;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetAnimate(b As Boolean) As WixElement";
 //BA.debugLineNum = 183;BA.debugLine="SetProperty(\"animate\",b)";
_setproperty("animate",(Object)(_b));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetAttr(attrName As String, attrValue As Objec";
 //BA.debugLineNum = 315;BA.debugLine="SetOnContent(attrName,attrValue)";
_setoncontent(_attrname,BA.ObjectToString(_attrvalue));
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixElement";
 //BA.debugLineNum = 32;BA.debugLine="SetAttr(\"autoheight\", b)";
_setattr("autoheight",(Object)(_b));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixElement";
 //BA.debugLineNum = 38;BA.debugLine="SetAttr(\"autowidth\", b)";
_setattr("autowidth",(Object)(_b));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetBatch(b As Int) As WixElement";
 //BA.debugLineNum = 177;BA.debugLine="SetProperty(\"batch\",b)";
_setproperty("batch",(Object)(_b));
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setbody(Object _b) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetBody(b As Object) As WixElement";
 //BA.debugLineNum = 267;BA.debugLine="Body = b";
_body = _b;
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixElement";
 //BA.debugLineNum = 58;BA.debugLine="SetProperty(\"borderless\", b)";
_setproperty("borderless",(Object)(_b));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setclick(com.ab.banano.BANanoObject _c) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetClick(c As BANanoObject) As WixElement";
 //BA.debugLineNum = 378;BA.debugLine="Element.Put(\"click\", c)";
_element.Put((Object)("click"),(Object)(_c));
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setcollapsed(boolean _c) throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Sub SetCollapsed(c As Boolean) As WixElement";
 //BA.debugLineNum = 566;BA.debugLine="SetProperty(\"collapsed\", c)";
_setproperty("collapsed",(Object)(_c));
 //BA.debugLineNum = 567;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetContainer(c As String) As WixElement";
 //BA.debugLineNum = 52;BA.debugLine="SetAttr(\"container\", c)";
_setattr("container",(Object)(_c));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setcss(String _cs) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetCSS(cs As String) As WixElement";
 //BA.debugLineNum = 309;BA.debugLine="CSS = cs";
_css = _cs;
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetData(d As List) As WixElement";
 //BA.debugLineNum = 255;BA.debugLine="Element.Put(\"data\", d)";
_element.Put((Object)("data"),(Object)(_d.getObject()));
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaultalign(String _a) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetDefaultAlign(a As String) As WixElement";
 //BA.debugLineNum = 159;BA.debugLine="elementsConfig.Put(\"align\", a)";
_elementsconfig.Put((Object)("align"),(Object)(_a));
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaultlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetDefaultLabelAlign(a As String) As WixElemen";
 //BA.debugLineNum = 140;BA.debugLine="elementsConfig.Put(\"labelAlign\", a)";
_elementsconfig.Put((Object)("labelAlign"),(Object)(_a));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaultlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetDefaultLabelPosition(p As String) As WixEle";
 //BA.debugLineNum = 153;BA.debugLine="elementsConfig.Put(\"labelPosition\", p)";
_elementsconfig.Put((Object)("labelPosition"),(Object)(_p));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaultlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetDefaultLabelWidth(a As Int) As WixElement";
 //BA.debugLineNum = 146;BA.debugLine="elementsConfig.Put(\"labelWidth\", a)";
_elementsconfig.Put((Object)("labelWidth"),(Object)(_a));
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaulttype(String _a) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetDefaultType(a As String) As WixElement";
 //BA.debugLineNum = 134;BA.debugLine="elementsConfig.Put(\"type\", a)";
_elementsconfig.Put((Object)("type"),(Object)(_a));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaulttypeicon(String _r) throws Exception{
 //BA.debugLineNum = 589;BA.debugLine="Sub SetDefaultTypeIcon(r As String) As WixElement";
 //BA.debugLineNum = 590;BA.debugLine="TypeOf = \"icon\"";
_typeof = "icon";
 //BA.debugLineNum = 591;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaulttypeiconbutton(String _r) throws Exception{
 //BA.debugLineNum = 571;BA.debugLine="Sub SetDefaultTypeIconButton(r As String) As WixEl";
 //BA.debugLineNum = 572;BA.debugLine="TypeOf = \"iconButton\"";
_typeof = "iconButton";
 //BA.debugLineNum = 573;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 574;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaulttypeiconbuttontop(String _r) throws Exception{
 //BA.debugLineNum = 595;BA.debugLine="Sub SetDefaultTypeIconButtonTop(r As String) As Wi";
 //BA.debugLineNum = 596;BA.debugLine="TypeOf = \"iconButtonTop\"";
_typeof = "iconButtonTop";
 //BA.debugLineNum = 597;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 598;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaulttypeimage(String _r) throws Exception{
 //BA.debugLineNum = 583;BA.debugLine="Sub SetDefaultTypeImage(r As String) As WixElement";
 //BA.debugLineNum = 584;BA.debugLine="TypeOf = \"image\"";
_typeof = "image";
 //BA.debugLineNum = 585;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaulttypeimagebutton(String _r) throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="Sub SetDefaultTypeImageButton(r As String) As WixE";
 //BA.debugLineNum = 578;BA.debugLine="TypeOf =  \"imageButton\"";
_typeof = "imageButton";
 //BA.debugLineNum = 579;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaultview(String _a) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetDefaultView(a As String) As WixElement";
 //BA.debugLineNum = 128;BA.debugLine="elementsConfig.Put(\"view\", a)";
_elementsconfig.Put((Object)("view"),(Object)(_a));
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setdefaultwidth(int _w) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetDefaultWidth(w As Int) As WixElement";
 //BA.debugLineNum = 165;BA.debugLine="elementsConfig.Put(\"width\", w)";
_elementsconfig.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setgravity(int _g) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetGravity(g As Int) As WixElement";
 //BA.debugLineNum = 273;BA.debugLine="Gravity = g";
_gravity = _g;
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setheader(String _h) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetHeader(h As String) As WixElement";
 //BA.debugLineNum = 261;BA.debugLine="Header = h";
_header = _h;
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetHeight(h As Object) As WixElement";
 //BA.debugLineNum = 297;BA.debugLine="Height = h";
_height = _h;
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _sethtmlattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetHTMLAttr(attrName As String, attrValue As O";
 //BA.debugLineNum = 321;BA.debugLine="HTMLAttributes.put(attrName,attrValue)";
_htmlattributes.Put((Object)(_attrname),_attrvalue);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub SetIcon(i As String) As WixElement";
 //BA.debugLineNum = 366;BA.debugLine="SetOnContent(\"icon\", i)";
_setoncontent("icon",_i);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetInputWidth(w As Int) As WixElement";
 //BA.debugLineNum = 225;BA.debugLine="SetProperty(\"inputWidth\", w)";
_setproperty("inputWidth",(Object)(_w));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetLabel(l As String) As WixElement";
 //BA.debugLineNum = 372;BA.debugLine="SetOnContent(\"label\", l)";
_setoncontent("label",_l);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setlabelheight(int _h) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetLabelHeight(h As Int) As WixElement";
 //BA.debugLineNum = 70;BA.debugLine="SetProperty(\"labelHeight\", h)";
_setproperty("labelHeight",(Object)(_h));
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setmargin(String _margin) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetMargin(margin As String) As WixElement";
 //BA.debugLineNum = 219;BA.debugLine="Element.Put(\"margin\", margin)";
_element.Put((Object)("margin"),(Object)(_margin));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setmaxheight(int _h) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetMaxHeight(h As Int) As WixElement";
 //BA.debugLineNum = 213;BA.debugLine="Element.Put(\"maxHeight\", h)";
_element.Put((Object)("maxHeight"),(Object)(_h));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setmaxwidth(int _w) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetMaxWidth(w As Int) As WixElement";
 //BA.debugLineNum = 207;BA.debugLine="Element.Put(\"maxWidth\", w)";
_element.Put((Object)("maxWidth"),(Object)(_w));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetMinHeight(h As Int) As WixElement";
 //BA.debugLineNum = 201;BA.debugLine="Element.Put(\"minHeight\", h)";
_element.Put((Object)("minHeight"),(Object)(_h));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetMinWidth(w As Int) As WixElement";
 //BA.debugLineNum = 195;BA.debugLine="Element.put(\"minwidth\",w)";
_element.Put((Object)("minwidth"),(Object)(_w));
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetMultiView(b As Boolean) As WixElement";
 //BA.debugLineNum = 360;BA.debugLine="SetProperty(\"multiview\", b)";
_setproperty("multiview",(Object)(_b));
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setname(String _n) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetName(n As String) As WixElement";
 //BA.debugLineNum = 116;BA.debugLine="SetProperty(\"name\", n)";
_setproperty("name",(Object)(_n));
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setoncondition(int _condition,String _prop,Object _propvalue) throws Exception{
 //BA.debugLineNum = 510;BA.debugLine="Sub SetOnCondition(Condition As Int, Prop As Strin";
 //BA.debugLineNum = 511;BA.debugLine="If Condition <= 0 Then Return Me";
if (_condition<=0) { 
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);};
 //BA.debugLineNum = 512;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),_propvalue);
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setoncontent(String _prop,String _propvalue) throws Exception{
 //BA.debugLineNum = 503;BA.debugLine="Sub SetOnContent(Prop As String, PropValue As Stri";
 //BA.debugLineNum = 504;BA.debugLine="If PropValue = \"\" Then Return Me";
if ((_propvalue).equals("")) { 
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);};
 //BA.debugLineNum = 505;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),(Object)(_propvalue));
 //BA.debugLineNum = 506;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 507;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setpadding(String _padding) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetPadding(padding As String) As WixElement";
 //BA.debugLineNum = 231;BA.debugLine="Element.Put(\"padding\", padding)";
_element.Put((Object)("padding"),(Object)(_padding));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setpaddingx(String _x) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetPaddingX(x As String) As WixElement";
 //BA.debugLineNum = 237;BA.debugLine="Element.Put(\"paddingX\", x)";
_element.Put((Object)("paddingX"),(Object)(_x));
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setpaddingy(String _y) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetPaddingY(y As String) As WixElement";
 //BA.debugLineNum = 243;BA.debugLine="Element.Put(\"paddingY\",y)";
_element.Put((Object)("paddingY"),(Object)(_y));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setproperty(String _p,Object _v) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetProperty(p As String, v As Object) As WixEl";
 //BA.debugLineNum = 249;BA.debugLine="Element.Put(p,v)";
_element.Put((Object)(_p),_v);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetRequired(b As Boolean) As WixElement";
 //BA.debugLineNum = 122;BA.debugLine="SetProperty(\"required\", b)";
_setproperty("required",(Object)(_b));
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setscroll(boolean _c) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetScroll(c As Boolean) As WixElement";
 //BA.debugLineNum = 45;BA.debugLine="SetAttr(\"scroll\", c)";
_setattr("scroll",(Object)(_c));
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetSelect(b As Boolean) As WixElement";
 //BA.debugLineNum = 64;BA.debugLine="SetProperty(\"select\", b)";
_setproperty("select",(Object)(_b));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 189;BA.debugLine="Styles.Put(prop,val)";
_styles.Put((Object)(_prop),(Object)(_val));
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetTemplate(t As Object) As WixElement";
 //BA.debugLineNum = 392;BA.debugLine="Element.Put(\"template\", t)";
_element.Put((Object)("template"),_t);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetTooltip(tt As String) As WixElement";
 //BA.debugLineNum = 76;BA.debugLine="SetProperty(\"tooltip\", tt)";
_setproperty("tooltip",(Object)(_tt));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _settype(String _t) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetType(t As String) As WixElement";
 //BA.debugLineNum = 291;BA.debugLine="TypeOf = t";
_typeof = _t;
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _settypeclean(String _r) throws Exception{
 //BA.debugLineNum = 517;BA.debugLine="Sub SetTypeClean(r As String) As WixElement  'igno";
 //BA.debugLineNum = 518;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _settypeform(String _r) throws Exception{
 //BA.debugLineNum = 547;BA.debugLine="Sub SetTypeForm(r As String) As WixElement		'ignor";
 //BA.debugLineNum = 548;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 549;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _settypehead(String _r) throws Exception{
 //BA.debugLineNum = 541;BA.debugLine="Sub SetTypeHead(r As String) As WixElement		'ignor";
 //BA.debugLineNum = 542;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 543;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _settypeline(String _r) throws Exception{
 //BA.debugLineNum = 523;BA.debugLine="Sub SetTypeLine(r As String) As WixElement   'igno";
 //BA.debugLineNum = 524;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 525;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _settypespace(String _r) throws Exception{
 //BA.debugLineNum = 535;BA.debugLine="Sub SetTypeSpace(r As String) As WixElement   'ign";
 //BA.debugLineNum = 536;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _settypewide(String _r) throws Exception{
 //BA.debugLineNum = 529;BA.debugLine="Sub SetTypeWide(r As String) As WixElement   'igno";
 //BA.debugLineNum = 530;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 531;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetValue(v As String) As WixElement";
 //BA.debugLineNum = 285;BA.debugLine="Value = v";
_value = (Object)(_v);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setview(String _v) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetView(v As String) As WixElement";
 //BA.debugLineNum = 279;BA.debugLine="View = v";
_view = _v;
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setviewheaderlayout(String _r) throws Exception{
 //BA.debugLineNum = 554;BA.debugLine="Sub SetViewHeaderLayout(r As String) As WixElement";
 //BA.debugLineNum = 555;BA.debugLine="SetView(\"headerlayout\")";
_setview("headerlayout");
 //BA.debugLineNum = 556;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setvisiblebatch(int _b) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetVisibleBatch(b As Int) As WixElement";
 //BA.debugLineNum = 171;BA.debugLine="SetProperty(\"visibleBatch\", b)";
_setproperty("visibleBatch",(Object)(_b));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixelement  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetWidth(w As object) As WixElement";
 //BA.debugLineNum = 303;BA.debugLine="Width = w";
_width = _w;
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixelement)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
