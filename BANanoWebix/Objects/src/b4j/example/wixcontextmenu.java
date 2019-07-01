package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcontextmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcontextmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcontextmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _contextmenu = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public int _sepcount = 0;
public b4j.example.main _main = null;
public b4j.example.pgtabbar _pgtabbar = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pglist _pglist = null;
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
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.pggrouplist _pggrouplist = null;
public b4j.example.pgcontext _pgcontext = null;
public b4j.example.pggooglemap _pggooglemap = null;
public b4j.example.pguploader1 _pguploader1 = null;
public b4j.example.pguploader2 _pguploader2 = null;
public b4j.example.pguploader3 _pguploader3 = null;
public b4j.example.wixcontextmenu  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 69;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 70;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 71;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 72;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 73;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 74;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 75;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 76;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 77;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 78;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 79;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _addseparator(String _parentid) throws Exception{
String _meid = "";
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 83;BA.debugLine="Sub AddSeparator(parentID As String) As WixContext";
 //BA.debugLineNum = 84;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 85;BA.debugLine="sepCount = sepCount + 1";
_sepcount = (int) (_sepcount+1);
 //BA.debugLineNum = 86;BA.debugLine="sepCount = sepCount & \"\"";
_sepcount = (int)(Double.parseDouble(BA.NumberToString(_sepcount)+""));
 //BA.debugLineNum = 87;BA.debugLine="Dim meID As String = \"sep\" & sepCount";
_meid = "sep"+BA.NumberToString(_sepcount);
 //BA.debugLineNum = 88;BA.debugLine="Dim mItem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 89;BA.debugLine="mItem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 90;BA.debugLine="mItem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 91;BA.debugLine="mItem.Put(\"$template\", \"Separator\")";
_mitem.Put((Object)("$template"),(Object)("Separator"));
 //BA.debugLineNum = 92;BA.debugLine="Items.Add(mItem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public ContextMenu As WixElement";
_contextmenu = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private sepCount As Int";
_sepcount = 0;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcontextmenu  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixContext";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="ContextMenu.Initialize(ID).setview(\"contextmenu\")";
_contextmenu._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("contextmenu");
 //BA.debugLineNum = 13;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="sepCount = 0";
_sepcount = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 26;BA.debugLine="Return ContextMenu.item";
if (true) return _contextmenu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixContextMenu";
 //BA.debugLineNum = 57;BA.debugLine="ContextMenu.SetAttr(\"autowidth\", b)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetData(d As List) As WixContextMenu";
 //BA.debugLineNum = 98;BA.debugLine="ContextMenu.SetAttr(\"data\", d)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("data",(Object)(_d.getObject()));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetHeight(h As Int) As WixContextMenu";
 //BA.debugLineNum = 39;BA.debugLine="ContextMenu.SetAttr(\"height\", h)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setlayouty(String _r) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetLayoutY(r As String) As WixContextMenu  'ig";
 //BA.debugLineNum = 51;BA.debugLine="ContextMenu.SetAttr(\"layout\", \"y\")";
_contextmenu._setattr /*b4j.example.wixelement*/ ("layout",(Object)("y"));
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setmaster(String _pid) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetMaster(pID As String) As WixContextMenu";
 //BA.debugLineNum = 20;BA.debugLine="ContextMenu.SetAttr(\"master\", pID)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("master",(Object)(_pid));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetSelect(b As Boolean) As WixContextMenu";
 //BA.debugLineNum = 104;BA.debugLine="ContextMenu.SetProperty(\"select\", b)";
_contextmenu._setproperty /*b4j.example.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setsubmenuposright(String _r) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetSubMenuPosRight(r As String) As WixContextM";
 //BA.debugLineNum = 32;BA.debugLine="ContextMenu.SetAttr(\"subMenuPos\", \"right\")";
_contextmenu._setattr /*b4j.example.wixelement*/ ("subMenuPos",(Object)("right"));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetTemplate(t As String) As WixContextMenu";
 //BA.debugLineNum = 63;BA.debugLine="ContextMenu.SetAttr(\"template\", t)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("template",(Object)(_t));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontextmenu  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetWidth(w As Int) As WixContextMenu";
 //BA.debugLineNum = 45;BA.debugLine="ContextMenu.SetAttr(\"width\", w)";
_contextmenu._setattr /*b4j.example.wixelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontextmenu)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
