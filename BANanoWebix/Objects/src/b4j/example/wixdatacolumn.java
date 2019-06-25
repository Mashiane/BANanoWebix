package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatacolumn extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdatacolumn", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdatacolumn.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _column = null;
public b4j.example.wixdatatable _dt = null;
public b4j.example.wixtreetable _tr = null;
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
public b4j.example.wixdatacolumn  _aligncenter() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub AlignCenter As WixDataColumn";
 //BA.debugLineNum = 71;BA.debugLine="Column.SetStyle(\"text-align\", \"center\")";
_column._setstyle /*b4j.example.wixelement*/ ("text-align","center");
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _alignright() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub AlignRight As WixDataColumn";
 //BA.debugLineNum = 65;BA.debugLine="Column.SetStyle(\"text-align\", \"right\")";
_column._setstyle /*b4j.example.wixelement*/ ("text-align","right");
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Column As WixElement";
_column = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private dt As WixDataTable";
_dt = new b4j.example.wixdatatable();
 //BA.debugLineNum = 6;BA.debugLine="Private tr As WixTreeTable";
_tr = new b4j.example.wixtreetable();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatacolumn  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.wixdatatable _datatable,String _cid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(dataTable As WixDataTable, c";
 //BA.debugLineNum = 11;BA.debugLine="ID = cID.tolowercase";
_id = _cid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Column.Initialize(ID)";
_column._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="dt = dataTable";
_dt = _datatable;
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _initialize1(b4j.example.wixtreetable _treetable,String _cid) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize1(treeTable As WixTreeTable,";
 //BA.debugLineNum = 19;BA.debugLine="ID = cID.tolowercase";
_id = _cid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="Column.Initialize(ID)";
_column._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 21;BA.debugLine="tr = treeTable";
_tr = _treetable;
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _initialize2(String _cid) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize2(cID As String) As WixDataCo";
 //BA.debugLineNum = 27;BA.debugLine="ID = cID.tolowercase";
_id = _cid.toLowerCase();
 //BA.debugLineNum = 28;BA.debugLine="Column.Initialize(ID)";
_column._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 186;BA.debugLine="Return Column.item";
if (true) return _column._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
anywheresoftware.b4a.objects.collections.List _columns = null;
 //BA.debugLineNum = 34;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 35;BA.debugLine="Dim Columns As List = dt.columns";
_columns = new anywheresoftware.b4a.objects.collections.List();
_columns = _dt._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
 //BA.debugLineNum = 36;BA.debugLine="Columns.Add(Item)";
_columns.Add((Object)(_item().getObject()));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _pop1() throws Exception{
anywheresoftware.b4a.objects.collections.List _columns = null;
 //BA.debugLineNum = 40;BA.debugLine="Sub Pop1";
 //BA.debugLineNum = 41;BA.debugLine="Dim columns As List = tr.columns";
_columns = new anywheresoftware.b4a.objects.collections.List();
_columns = _tr._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
 //BA.debugLineNum = 42;BA.debugLine="columns.add(Item)";
_columns.Add((Object)(_item().getObject()));
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatacolumn  _setadjust(Object _a) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetAdjust(a As Object) As WixDataColumn";
 //BA.debugLineNum = 77;BA.debugLine="Column.SetAttr(\"adjust\", a)";
_column._setattr /*b4j.example.wixelement*/ ("adjust",_a);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetBatch(b As Int) As WixDataColumn";
 //BA.debugLineNum = 53;BA.debugLine="Column.SetAttr(\"batch\", b)";
_column._setattr /*b4j.example.wixelement*/ ("batch",(Object)(_b));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditor(String _e) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetEditor(e As String) As WixDataColumn";
 //BA.debugLineNum = 95;BA.debugLine="Column.SetAttr(\"editor\", e)";
_column._setattr /*b4j.example.wixelement*/ ("editor",(Object)(_e));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorcheckbox(String _r) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetEditorCheckBox(r As String) As WixDataColum";
 //BA.debugLineNum = 156;BA.debugLine="SetEditor(\"checkbox\")";
_seteditor("checkbox");
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorcolor(String _r) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetEditorColor(r As String) As WixDataColumn";
 //BA.debugLineNum = 108;BA.debugLine="SetEditor(\"color\")";
_seteditor("color");
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorcombo(String _r) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetEditorCombo(r As String) As WixDataColumn";
 //BA.debugLineNum = 144;BA.debugLine="SetEditor(\"combo\")";
_seteditor("combo");
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditordate(String _r) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetEditorDate(r As String) As WixDataColumn";
 //BA.debugLineNum = 126;BA.debugLine="SetEditor(\"date\")";
_seteditor("date");
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorinlinecheckbox(String _r) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetEditorInlineCheckBox(r As String) As WixDat";
 //BA.debugLineNum = 162;BA.debugLine="SetEditor(\"inline-checkbox\")";
_seteditor("inline-checkbox");
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorinlinetext(String _r) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetEditorInlineText(r As String) As WixDataCol";
 //BA.debugLineNum = 132;BA.debugLine="SetEditor(\"inline-text\")";
_seteditor("inline-text");
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorpassword(String _r) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetEditorPassword(r As String) As WixDataColum";
 //BA.debugLineNum = 120;BA.debugLine="SetEditor(\"password\")";
_seteditor("password");
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorpopup(String _e) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetEditorPopUp(e As String) As WixDataColumn";
 //BA.debugLineNum = 101;BA.debugLine="SetEditor(\"popup\")";
_seteditor("popup");
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorrichselect(String _r) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetEditorRichSelect(r As String) As WixDataCol";
 //BA.debugLineNum = 150;BA.debugLine="SetEditor(\"richselect\")";
_seteditor("richselect");
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditorselect(String _r) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetEditorSelect(r As String) As WixDataColumn";
 //BA.debugLineNum = 138;BA.debugLine="SetEditor(\"select\")";
_seteditor("select");
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _seteditortext(String _r) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetEditorText(r As String) As WixDataColumn";
 //BA.debugLineNum = 114;BA.debugLine="SetEditor(\"text\")";
_seteditor("text");
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setfillspace(boolean _s) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetFillSpace(s As Boolean) As WixDataColumn";
 //BA.debugLineNum = 168;BA.debugLine="Column.SetAttr(\"fillspace\", s)";
_column._setattr /*b4j.example.wixelement*/ ("fillspace",(Object)(_s));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setheader(String _h) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetHeader(h As String) As WixDataColumn";
 //BA.debugLineNum = 83;BA.debugLine="Column.SetAttr(\"header\", h)";
_column._setattr /*b4j.example.wixelement*/ ("header",(Object)(_h));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _sethiddent(boolean _b) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetHiddent(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 59;BA.debugLine="Column.SetAttr(\"hidden\", b)";
_column._setattr /*b4j.example.wixelement*/ ("hidden",(Object)(_b));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setoptions(anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetOptions(options As List) As WixDataColumn";
 //BA.debugLineNum = 47;BA.debugLine="Column.SetAttr(\"options\", options)";
_column._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setsort(String _s) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetSort(s As String) As WixDataColumn";
 //BA.debugLineNum = 180;BA.debugLine="Column.SetAttr(\"sort\", s)";
_column._setattr /*b4j.example.wixelement*/ ("sort",(Object)(_s));
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetTemplate(t As Object) As WixDataColumn";
 //BA.debugLineNum = 174;BA.debugLine="Column.SetTemplate(t)";
_column._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacolumn  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetWidth(w As Int) As WixDataColumn";
 //BA.debugLineNum = 89;BA.debugLine="Column.SetAttr(\"width\", w)";
_column._setattr /*b4j.example.wixelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacolumn)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
