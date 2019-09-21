package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANanoObject _dollar = null;
public com.ab.banano.BANanoObject _webix = null;
public com.ab.banano.BANano _banano = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _page = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixbuttontypes _enumbuttontypes = null;
public b4j.Mashy.BANanoWebixDemo.wixlayouttypes _enumlayouttypes = null;
public anywheresoftware.b4a.objects.collections.Map _hints = null;
public String _unitefld = "";
public String _ulname = "";
public b4j.Mashy.BANanoWebixDemo.wixicons _enumwixicons = null;
public anywheresoftware.b4a.objects.collections.List _views = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public static class _wixselectedid{
public boolean IsInitialized;
public Object row;
public Object ID;
public Object column;
public void Initialize() {
IsInitialized = true;
row = new Object();
ID = new Object();
column = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _add(String _listid,anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
 //BA.debugLineNum = 1773;BA.debugLine="Sub Add(listID As String, record As Map)";
 //BA.debugLineNum = 1774;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1775;BA.debugLine="Dollar.Selector(listID).RunMethod(\"add\",Array(rec";
_dollar.Selector((Object)(_listid)).RunMethod("add",(Object)(new Object[]{(Object)(_record.getObject())}));
 //BA.debugLineNum = 1776;BA.debugLine="End Sub";
return "";
}
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 1578;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 1579;BA.debugLine="Page.AddColumns(itm)";
_page._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 1580;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnsresizer(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 1430;BA.debugLine="Sub AddColumnsResizer(s As String)   'ignore";
 //BA.debugLineNum = 1431;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 1432;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 1433;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1434;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnsspacer() throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _s = null;
 //BA.debugLineNum = 1444;BA.debugLine="Sub AddColumnsSpacer()";
 //BA.debugLineNum = 1445;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 1446;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spacer");
 //BA.debugLineNum = 1447;BA.debugLine="AddColumns(s.item)";
_addcolumns(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1448;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addcontext(b4j.Mashy.BANanoWebixDemo.wixcontext _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 2251;BA.debugLine="Sub AddContext(ctx As WixContext) As BANanoObject";
 //BA.debugLineNum = 2252;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2253;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 2254;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _addcontextmenu(b4j.Mashy.BANanoWebixDemo.wixcontextmenu _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 2257;BA.debugLine="Sub AddContextMenu(ctx As WixContextMenu) As BANan";
 //BA.debugLineNum = 2258;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2259;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 2260;BA.debugLine="End Sub";
return null;
}
public String  _addcss(String _eid,String _css2add) throws Exception{
com.ab.banano.BANanoObject _node = null;
 //BA.debugLineNum = 1288;BA.debugLine="Sub addCSS(eID As String, css2add As String)";
 //BA.debugLineNum = 1289;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1291;BA.debugLine="Dim node As BANanoObject = getNode(eID)";
_node = _getnode(_eid);
 //BA.debugLineNum = 1292;BA.debugLine="webix.GetField(\"html\").RunMethod(\"addCss\", Array(";
_webix.GetField("html").RunMethod("addCss",(Object)(new Object[]{(Object)(_node),(Object)(_css2add)}));
 //BA.debugLineNum = 1293;BA.debugLine="End Sub";
return "";
}
public String  _adddropzone(String _uploader,String _eid) throws Exception{
com.ab.banano.BANanoObject _iview = null;
 //BA.debugLineNum = 2091;BA.debugLine="Sub AddDropZone(uploader As String, eID As String)";
 //BA.debugLineNum = 2092;BA.debugLine="uploader = uploader.tolowercase";
_uploader = _uploader.toLowerCase();
 //BA.debugLineNum = 2093;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2094;BA.debugLine="Dim iView As BANanoObject = View(eID)";
_iview = _view(_eid);
 //BA.debugLineNum = 2095;BA.debugLine="Dollar.Selector(uploader).RunMethod(\"addDropZone\"";
_dollar.Selector((Object)(_uploader)).RunMethod("addDropZone",(Object)(new Object[]{(Object)(_iview)}));
 //BA.debugLineNum = 2096;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addmessagebox(b4j.Mashy.BANanoWebixDemo.wixmessagebox _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 2275;BA.debugLine="Sub AddMessageBox(ctx As WixMessageBox) As BANanoO";
 //BA.debugLineNum = 2276;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2277;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 2278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _addnode(String _treeid,String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target,boolean _mopen) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 781;BA.debugLine="Sub AddNode(treeID As String, parentID As String,";
 //BA.debugLineNum = 782;BA.debugLine="treeID = treeID.ToLowerCase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 783;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 784;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 785;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 786;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 787;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 788;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 789;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 790;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 791;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 792;BA.debugLine="mitem.Put(\"open\", mOpen)";
_mitem.Put((Object)("open"),(Object)(_mopen));
 //BA.debugLineNum = 793;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 794;BA.debugLine="If parentID = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 795;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"add\", Array(m";
_dollar.Selector((Object)(_treeid)).RunMethod("add",(Object)(new Object[]{(Object)(_mitem.getObject()),(Object)(1)}));
 }else {
 //BA.debugLineNum = 797;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"add\", Array(m";
_dollar.Selector((Object)(_treeid)).RunMethod("add",(Object)(new Object[]{(Object)(_mitem.getObject()),(Object)(-1),(Object)(_parentid)}));
 };
 //BA.debugLineNum = 799;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 800;BA.debugLine="End Sub";
return null;
}
public String  _addnotselected(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _q = "";
String _k1 = "";
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1200;BA.debugLine="Sub AddNotSelected(lst As List)";
 //BA.debugLineNum = 1201;BA.debugLine="Dim q As String = \"$\"";
_q = "$";
 //BA.debugLineNum = 1202;BA.debugLine="Dim k1 As String = q & \"empty\"";
_k1 = _q+"empty";
 //BA.debugLineNum = 1203;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1204;BA.debugLine="opt.Put(\"id\", k1)";
_opt.Put((Object)("id"),(Object)(_k1));
 //BA.debugLineNum = 1205;BA.debugLine="opt.Put(\"value\", \"-- Not selected --\")";
_opt.Put((Object)("value"),(Object)("-- Not selected --"));
 //BA.debugLineNum = 1206;BA.debugLine="opt.Put(k1, True)";
_opt.Put((Object)(_k1),(Object)(__c.True));
 //BA.debugLineNum = 1207;BA.debugLine="lst.InsertAt(0, opt)";
_lst.InsertAt((int) (0),(Object)(_opt.getObject()));
 //BA.debugLineNum = 1208;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addpopup(b4j.Mashy.BANanoWebixDemo.wixpopup _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 2263;BA.debugLine="Sub AddPopUp(ctx As WixPopUp) As BANanoObject";
 //BA.debugLineNum = 2264;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2265;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 2266;BA.debugLine="End Sub";
return null;
}
public String  _addresizertocolumns(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 1424;BA.debugLine="Sub AddResizerToColumns(s As String)   'ignore";
 //BA.debugLineNum = 1425;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 1426;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 1427;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1428;BA.debugLine="End Sub";
return "";
}
public String  _addrow(b4j.Mashy.BANanoWebixDemo.wixrow _r) throws Exception{
 //BA.debugLineNum = 1563;BA.debugLine="Sub AddRow(r As WixRow)";
 //BA.debugLineNum = 1564;BA.debugLine="Page.AddRow(r)";
_page._addrow /*String*/ (_r);
 //BA.debugLineNum = 1565;BA.debugLine="End Sub";
return "";
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 1556;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 1557;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 1558;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 1560;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 1568;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 1569;BA.debugLine="Page.AddRows(itm)";
_page._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 1570;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _addrowscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1023;BA.debugLine="Sub AddRowsCells(mCells As List) As WixPage";
 //BA.debugLineNum = 1024;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1025;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 1026;BA.debugLine="AddRows(opt)";
_addrows(_opt);
 //BA.debugLineNum = 1027;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1028;BA.debugLine="End Sub";
return null;
}
public String  _addrowsspacer() throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _s = null;
 //BA.debugLineNum = 1437;BA.debugLine="Sub AddRowsSpacer()";
 //BA.debugLineNum = 1438;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 1439;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spacer");
 //BA.debugLineNum = 1440;BA.debugLine="AddRows(s.item)";
_addrows(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1441;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addsidemenu(b4j.Mashy.BANanoWebixDemo.wixsidemenu _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 2282;BA.debugLine="Sub AddSideMenu(ctx As WixSideMenu) As BANanoObjec";
 //BA.debugLineNum = 2283;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2284;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 2285;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _addsuggestion(b4j.Mashy.BANanoWebixDemo.wixsuggest _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 2301;BA.debugLine="Sub AddSuggestion(ctx As WixSuggest) As BANanoObje";
 //BA.debugLineNum = 2302;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2303;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 2304;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 2317;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 2318;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 2319;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 2322;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 2323;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 2324;BA.debugLine="End Sub";
return "";
}
public String  _addtoolbar(b4j.Mashy.BANanoWebixDemo.wixtoolbar _tbl) throws Exception{
 //BA.debugLineNum = 2307;BA.debugLine="Sub AddToolBar(tbl As WixToolBar)";
 //BA.debugLineNum = 2308;BA.debugLine="Page.AddRows(tbl.item)";
_page._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tbl._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2309;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 2312;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 2313;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 2314;BA.debugLine="End Sub";
return "";
}
public String  _addtotree(String _treeid,b4j.Mashy.BANanoWebixDemo.wixelement _child) throws Exception{
 //BA.debugLineNum = 802;BA.debugLine="Sub AddToTree(treeID As String, child As WixElemen";
 //BA.debugLineNum = 803;BA.debugLine="If child.ParentID = \"\" Then";
if ((_child._parentid /*String*/ ).equals("")) { 
 //BA.debugLineNum = 804;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"add\", Array(c";
_dollar.Selector((Object)(_treeid)).RunMethod("add",(Object)(new Object[]{(Object)(_child),(Object)(1)}));
 }else {
 //BA.debugLineNum = 806;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"add\", Array(c";
_dollar.Selector((Object)(_treeid)).RunMethod("add",(Object)(new Object[]{(Object)(_child),(Object)(-1),(Object)(_child._parentid /*String*/ )}));
 };
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _adduploader(b4j.Mashy.BANanoWebixDemo.wixuploader _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 2295;BA.debugLine="Sub AddUploader(ctx As WixUploader) As BANanoObjec";
 //BA.debugLineNum = 2296;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2297;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 2298;BA.debugLine="End Sub";
return null;
}
public String  _addview(String _parentid,anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
com.ab.banano.BANanoObject _bo = null;
com.ab.banano.BANanoObject _prt = null;
 //BA.debugLineNum = 2042;BA.debugLine="Sub AddView(parentid As String, itm As Map)";
 //BA.debugLineNum = 2043;BA.debugLine="parentid = parentid.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 2044;BA.debugLine="Dim bo As BANanoObject = UX(itm)";
_bo = _ux(_itm);
 //BA.debugLineNum = 2045;BA.debugLine="Dim prt As BANanoObject = Dollar.Selector(parenti";
_prt = _dollar.Selector((Object)(_parentid));
 //BA.debugLineNum = 2046;BA.debugLine="prt.RunMethod(\"addView\",Array(bo))";
_prt.RunMethod("addView",(Object)(new Object[]{(Object)(_bo)}));
 //BA.debugLineNum = 2047;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addwindow(b4j.Mashy.BANanoWebixDemo.wixwindow _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 2269;BA.debugLine="Sub AddWindow(ctx As WixWindow) As BANanoObject";
 //BA.debugLineNum = 2270;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2271;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 2272;BA.debugLine="End Sub";
return null;
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrow _i = null;
 //BA.debugLineNum = 998;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 999;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.Mashy.BANanoWebixDemo.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 1000;BA.debugLine="AddRow(i)";
_addrow(_i);
 }
};
 //BA.debugLineNum = 1002;BA.debugLine="End Sub";
return "";
}
public String  _adjust(String _eid) throws Exception{
 //BA.debugLineNum = 2065;BA.debugLine="Sub Adjust(eID As String)";
 //BA.debugLineNum = 2066;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2067;BA.debugLine="Dollar.Selector(eID).RunMethod(\"adjust\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("adjust",__c.Null);
 //BA.debugLineNum = 2068;BA.debugLine="End Sub";
return "";
}
public String  _aftertodayrg(long _dvariance) throws Exception{
 //BA.debugLineNum = 2403;BA.debugLine="public Sub AfterTodayRG(dVariance As Long) As Stri";
 //BA.debugLineNum = 2404;BA.debugLine="If dVariance <= 0 Then";
if (_dvariance<=0) { 
 //BA.debugLineNum = 2405;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance>0) { 
 //BA.debugLineNum = 2407;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else {
 //BA.debugLineNum = 2409;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 2411;BA.debugLine="End Sub";
return "";
}
public int  _age(String _birthday) throws Exception{
String _tday = "";
String _cday = "";
int _adays = 0;
int _ayears = 0;
 //BA.debugLineNum = 234;BA.debugLine="Sub Age(birthDay As String) As Int";
 //BA.debugLineNum = 235;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 236;BA.debugLine="Dim tDay As String = DateTime.Date(DateTime.Now)";
_tday = __c.DateTime.Date(__c.DateTime.getNow());
 //BA.debugLineNum = 237;BA.debugLine="Dim cDay As String = DateTime.Date(DateTime.DateP";
_cday = __c.DateTime.Date(__c.DateTime.DateParse(_birthday));
 //BA.debugLineNum = 238;BA.debugLine="Dim aDays As Int = DateDiff(tDay, cDay)";
_adays = _datediff(_tday,_cday);
 //BA.debugLineNum = 239;BA.debugLine="Dim aYears As Int = aDays / 365.25";
_ayears = (int) (_adays/(double)365.25);
 //BA.debugLineNum = 240;BA.debugLine="Return BANano.parseInt(aYears)";
if (true) return _banano.parseInt((Object)(_ayears));
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return 0;
}
public String  _alert(Object _msg) throws Exception{
 //BA.debugLineNum = 1729;BA.debugLine="Sub Alert(Msg As Object)";
 //BA.debugLineNum = 1730;BA.debugLine="webix.RunMethod(\"alert\", Array(Msg))";
_webix.RunMethod("alert",(Object)(new Object[]{_msg}));
 //BA.debugLineNum = 1731;BA.debugLine="End Sub";
return "";
}
public String  _alpha(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 581;BA.debugLine="Public Sub Alpha(value As String) As String";
 //BA.debugLineNum = 582;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 583;BA.debugLine="Try";
try { //BA.debugLineNum = 584;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 585;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
 //BA.debugLineNum = 586;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 587;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 588;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 589;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 590;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 591;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 592;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (_instr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",_mout)!=-1) { 
 //BA.debugLineNum = 593;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 596;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 598;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return "";
}
public String  _back(String _nodeid) throws Exception{
 //BA.debugLineNum = 1210;BA.debugLine="Sub Back(nodeID As String)";
 //BA.debugLineNum = 1211;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 1212;BA.debugLine="Dollar.Selector(nodeID).RunMethod(\"back\", Null)";
_dollar.Selector((Object)(_nodeid)).RunMethod("back",__c.Null);
 //BA.debugLineNum = 1213;BA.debugLine="End Sub";
return "";
}
public String  _bind(String _frmid,String _dattableid) throws Exception{
 //BA.debugLineNum = 2107;BA.debugLine="Sub Bind(frmID As String, datTableID As String)";
 //BA.debugLineNum = 2108;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 2109;BA.debugLine="datTableID = datTableID.ToLowerCase";
_dattableid = _dattableid.toLowerCase();
 //BA.debugLineNum = 2110;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"bind\",Array(dat";
_dollar.Selector((Object)(_frmid)).RunMethod("bind",(Object)(new Object[]{(Object)(_dattableid)}));
 //BA.debugLineNum = 2111;BA.debugLine="End Sub";
return "";
}
public String  _bobind(String _frmid,String _dattableid) throws Exception{
com.ab.banano.BANanoObject _target = null;
 //BA.debugLineNum = 2113;BA.debugLine="Sub BOBind(frmID As String, datTableID As String)";
 //BA.debugLineNum = 2114;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 2115;BA.debugLine="datTableID = datTableID.tolowercase";
_dattableid = _dattableid.toLowerCase();
 //BA.debugLineNum = 2117;BA.debugLine="Dim target As BANanoObject = Dollar.Selector(datT";
_target = _dollar.Selector((Object)(_dattableid));
 //BA.debugLineNum = 2118;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"bind\",Array(tar";
_dollar.Selector((Object)(_frmid)).RunMethod("bind",(Object)(new Object[]{(Object)(_target)}));
 //BA.debugLineNum = 2119;BA.debugLine="End Sub";
return "";
}
public String  _boclose(com.ab.banano.BANanoObject _itm) throws Exception{
 //BA.debugLineNum = 2239;BA.debugLine="Sub BOClose(itm As BANanoObject)";
 //BA.debugLineNum = 2240;BA.debugLine="itm.RunMethod(\"close\", Null)";
_itm.RunMethod("close",__c.Null);
 //BA.debugLineNum = 2241;BA.debugLine="End Sub";
return "";
}
public String  _bohide(com.ab.banano.BANanoObject _itm) throws Exception{
 //BA.debugLineNum = 2234;BA.debugLine="Sub BOHide(itm As BANanoObject)";
 //BA.debugLineNum = 2235;BA.debugLine="itm.RunMethod(\"hide\", Null)";
_itm.RunMethod("hide",__c.Null);
 //BA.debugLineNum = 2236;BA.debugLine="End Sub";
return "";
}
public boolean  _boisvisible(com.ab.banano.BANanoObject _itm) throws Exception{
boolean _res = false;
 //BA.debugLineNum = 2244;BA.debugLine="Sub BOIsVisible(itm As BANanoObject) As Boolean";
 //BA.debugLineNum = 2245;BA.debugLine="Dim res As Boolean = itm.RunMethod(\"isVisible\", N";
_res = BA.ObjectToBoolean(_itm.RunMethod("isVisible",__c.Null).Result());
 //BA.debugLineNum = 2246;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 2247;BA.debugLine="End Sub";
return false;
}
public String  _boshow(com.ab.banano.BANanoObject _itm) throws Exception{
 //BA.debugLineNum = 2229;BA.debugLine="Sub BOShow(itm As BANanoObject)";
 //BA.debugLineNum = 2230;BA.debugLine="itm.RunMethod(\"show\", Null)";
_itm.RunMethod("show",__c.Null);
 //BA.debugLineNum = 2231;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _boui(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
com.ab.banano.BANanoObject _res = null;
 //BA.debugLineNum = 2217;BA.debugLine="Sub BOUI(m As Map) As BANanoObject";
 //BA.debugLineNum = 2218;BA.debugLine="Dim res As BANanoObject = webix.RunMethod(\"ui\", A";
_res = _webix.RunMethod("ui",(Object)(new Object[]{(Object)(_m.getObject())}));
 //BA.debugLineNum = 2219;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 2220;BA.debugLine="End Sub";
return null;
}
public String  _buildviews() throws Exception{
 //BA.debugLineNum = 910;BA.debugLine="Sub BuildViews";
 //BA.debugLineNum = 911;BA.debugLine="Views.Initialize";
_views.Initialize();
 //BA.debugLineNum = 912;BA.debugLine="Views.Add(\"\")";
_views.Add((Object)(""));
 //BA.debugLineNum = 913;BA.debugLine="Views.AddAll(Array(\"textarea\",\"spacer\",\"form\",\"wi";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("textarea"),(Object)("spacer"),(Object)("form"),(Object)("window"),(Object)("accordion"),(Object)("tabview"),(Object)("datatable"),(Object)("text"),(Object)("hint"),(Object)("property"),(Object)("toolbar")}));
 //BA.debugLineNum = 914;BA.debugLine="Views.AddAll(Array(\"icon\",\"button\",\"segmented\",\"t";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("icon"),(Object)("button"),(Object)("segmented"),(Object)("tree"),(Object)("fieldset"),(Object)("suggest"),(Object)("forminput"),(Object)("pager"),(Object)("sidebar"),(Object)("switch"),(Object)("checkbox")}));
 //BA.debugLineNum = 915;BA.debugLine="Views.AddAll(Array(\"list\",\"dataview\",\"layout\",\"ta";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("list"),(Object)("dataview"),(Object)("layout"),(Object)("tabbar"),(Object)("menu"),(Object)("carousel"),(Object)("sidemenu"),(Object)("comments"),(Object)("contextmenu"),(Object)("unitlist")}));
 //BA.debugLineNum = 916;BA.debugLine="Views.AddAll(Array(\"context\",\"chart\",\"multiview\",";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("context"),(Object)("chart"),(Object)("multiview"),(Object)("combo"),(Object)("radio"),(Object)("richselect"),(Object)("counter"),(Object)("colorpicker"),(Object)("datepicker"),(Object)("label")}));
 //BA.debugLineNum = 917;BA.debugLine="Views.AddAll(Array(\"resizer\",\"select\",\"search\",\"s";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("resizer"),(Object)("select"),(Object)("search"),(Object)("slider"),(Object)("richtext"),(Object)("dbllist"),(Object)("treetable"),(Object)("popup"),(Object)("iframe"),(Object)("grouplist")}));
 //BA.debugLineNum = 918;BA.debugLine="Views.AddAll(Array(\"google-map\",\"uploader\",\"video";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("google-map"),(Object)("uploader"),(Object)("video"),(Object)("template"),(Object)("scrollview"),(Object)("flexlayout"),(Object)("toggle"),(Object)("row"),(Object)("column")}));
 //BA.debugLineNum = 919;BA.debugLine="Views.AddAll(Array(\"geochart\",\"calendar\",\"image\")";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("geochart"),(Object)("calendar"),(Object)("image")}));
 //BA.debugLineNum = 920;BA.debugLine="Views.Sort(True)";
_views.Sort(__c.True);
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return "";
}
public String  _capitalize(String _t) throws Exception{
String _s = "";
String _r = "";
String _o = "";
 //BA.debugLineNum = 72;BA.debugLine="Sub Capitalize(t As String) As String";
 //BA.debugLineNum = 73;BA.debugLine="Dim s , r , o As String";
_s = "";
_r = "";
_o = "";
 //BA.debugLineNum = 74;BA.debugLine="s = t.SubString2(0,1)";
_s = _t.substring((int) (0),(int) (1));
 //BA.debugLineNum = 75;BA.debugLine="r = t.SubString2(1, t.Length)";
_r = _t.substring((int) (1),_t.length());
 //BA.debugLineNum = 76;BA.debugLine="o = s.ToUpperCase & r";
_o = _s.toUpperCase()+_r;
 //BA.debugLineNum = 77;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public double  _cdbl(String _value) throws Exception{
double _out = 0;
 //BA.debugLineNum = 362;BA.debugLine="Public Sub CDbl(value As String) As Double";
 //BA.debugLineNum = 363;BA.debugLine="Try";
try { //BA.debugLineNum = 364;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 365;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 366;BA.debugLine="value = value.Replace(\",\",\"\")";
_value = _value.replace(",","");
 //BA.debugLineNum = 367;BA.debugLine="Dim out As Double = NumberFormat2(value,0,2,2,Fa";
_out = (double)(Double.parseDouble(__c.NumberFormat2((double)(Double.parseDouble(_value)),(int) (0),(int) (2),(int) (2),__c.False)));
 //BA.debugLineNum = 368;BA.debugLine="Return out";
if (true) return _out;
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 370;BA.debugLine="Return value";
if (true) return (double)(Double.parseDouble(_value));
 };
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return 0;
}
public int  _cint(Object _o) throws Exception{
 //BA.debugLineNum = 2358;BA.debugLine="Sub CInt(o As Object) As Int";
 //BA.debugLineNum = 2359;BA.debugLine="Return Floor(o)";
if (true) return (int) (__c.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 2360;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Dollar As BANanoObject";
_dollar = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 4;BA.debugLine="Public webix As BANanoObject";
_webix = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 5;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="Public Page As WixElement";
_page = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 8;BA.debugLine="Public EnumButtonTypes As WixButtonTypes";
_enumbuttontypes = new b4j.Mashy.BANanoWebixDemo.wixbuttontypes();
 //BA.debugLineNum = 9;BA.debugLine="Public EnumLayoutTypes As WixLayoutTypes";
_enumlayouttypes = new b4j.Mashy.BANanoWebixDemo.wixlayouttypes();
 //BA.debugLineNum = 10;BA.debugLine="Private hints As Map";
_hints = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private uniteFld As String";
_unitefld = "";
 //BA.debugLineNum = 12;BA.debugLine="Private ulName As String";
_ulname = "";
 //BA.debugLineNum = 13;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 14;BA.debugLine="Public EnumWixIcons As WixIcons";
_enumwixicons = new b4j.Mashy.BANanoWebixDemo.wixicons();
 //BA.debugLineNum = 15;BA.debugLine="Public Views As List";
_views = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Type WixSelectedID(row As Object, ID As Object, c";
;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _clear(String _itm) throws Exception{
 //BA.debugLineNum = 1761;BA.debugLine="Sub Clear(itm As String)";
 //BA.debugLineNum = 1762;BA.debugLine="itm = itm.tolowercase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 1763;BA.debugLine="Dollar.Selector(itm).RunMethod(\"clear\",Null)";
_dollar.Selector((Object)(_itm)).RunMethod("clear",__c.Null);
 //BA.debugLineNum = 1764;BA.debugLine="End Sub";
return "";
}
public String  _clearall(String _eid) throws Exception{
 //BA.debugLineNum = 2077;BA.debugLine="Sub ClearAll(eID As String)";
 //BA.debugLineNum = 2078;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2079;BA.debugLine="Dollar.Selector(eID).RunMethod(\"clearAll\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("clearAll",__c.Null);
 //BA.debugLineNum = 2080;BA.debugLine="End Sub";
return "";
}
public String  _cleardatatable(int _d) throws Exception{
 //BA.debugLineNum = 1308;BA.debugLine="Sub ClearDataTable(d As Int)";
 //BA.debugLineNum = 1309;BA.debugLine="ClearAll(d)";
_clearall(BA.NumberToString(_d));
 //BA.debugLineNum = 1310;BA.debugLine="End Sub";
return "";
}
public String  _clearvalidation(String _elid) throws Exception{
 //BA.debugLineNum = 1767;BA.debugLine="Sub ClearValidation(elID As String)";
 //BA.debugLineNum = 1768;BA.debugLine="elID = elID.ToLowerCase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 1769;BA.debugLine="Dollar.Selector(elID).RunMethod(\"clearValidation\"";
_dollar.Selector((Object)(_elid)).RunMethod("clearValidation",__c.Null);
 //BA.debugLineNum = 1770;BA.debugLine="End Sub";
return "";
}
public long  _clng(Object _o) throws Exception{
 //BA.debugLineNum = 2354;BA.debugLine="Sub CLng(o As Object) As Long";
 //BA.debugLineNum = 2355;BA.debugLine="Return Floor(o)";
if (true) return (long) (__c.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 2356;BA.debugLine="End Sub";
return 0L;
}
public String  _close(String _treeid,String _nodeid) throws Exception{
 //BA.debugLineNum = 1223;BA.debugLine="Sub Close(treeID As String, nodeID As String)";
 //BA.debugLineNum = 1224;BA.debugLine="treeID = treeID.tolowercase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 1225;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 1226;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"close\", Array(";
_dollar.Selector((Object)(_treeid)).RunMethod("close",(Object)(new Object[]{(Object)(_nodeid)}));
 //BA.debugLineNum = 1227;BA.debugLine="End Sub";
return "";
}
public String  _closeall(String _treeid) throws Exception{
 //BA.debugLineNum = 1231;BA.debugLine="Sub CloseAll(treeID As String)";
 //BA.debugLineNum = 1232;BA.debugLine="treeID = treeID.tolowercase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 1233;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"closeAll\", Nul";
_dollar.Selector((Object)(_treeid)).RunMethod("closeAll",__c.Null);
 //BA.debugLineNum = 1234;BA.debugLine="End Sub";
return "";
}
public String  _collapse(String _nodeid) throws Exception{
 //BA.debugLineNum = 1182;BA.debugLine="Sub Collapse(nodeID As String)";
 //BA.debugLineNum = 1183;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 1184;BA.debugLine="Dollar.Selector(nodeID).RunMethod(\"collapse\", Nul";
_dollar.Selector((Object)(_nodeid)).RunMethod("collapse",__c.Null);
 //BA.debugLineNum = 1185;BA.debugLine="End Sub";
return "";
}
public String  _confirm(com.ab.banano.BANanoObject _callback,String _stitle,String _stext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1752;BA.debugLine="Sub Confirm(CallBack As BANanoObject, stitle As St";
 //BA.debugLineNum = 1753;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1754;BA.debugLine="opt.Put(\"title\", stitle)";
_opt.Put((Object)("title"),(Object)(_stitle));
 //BA.debugLineNum = 1755;BA.debugLine="opt.Put(\"text\", stext)";
_opt.Put((Object)("text"),(Object)(_stext));
 //BA.debugLineNum = 1756;BA.debugLine="opt.Put(\"callback\", CallBack)";
_opt.Put((Object)("callback"),(Object)(_callback));
 //BA.debugLineNum = 1757;BA.debugLine="webix.RunMethod(\"confirm\", opt)";
_webix.RunMethod("confirm",(Object)(_opt.getObject()));
 //BA.debugLineNum = 1758;BA.debugLine="End Sub";
return "";
}
public String  _confirm1(Object _msg) throws Exception{
 //BA.debugLineNum = 1734;BA.debugLine="Sub Confirm1(Msg As Object)";
 //BA.debugLineNum = 1735;BA.debugLine="webix.RunMethod(\"confirm\", Array(Msg))";
_webix.RunMethod("confirm",(Object)(new Object[]{_msg}));
 //BA.debugLineNum = 1736;BA.debugLine="End Sub";
return "";
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 1778;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 1779;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 1780;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _datasourcegetdata(com.ab.banano.BANanoObject _ds) throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 88;BA.debugLine="Sub DataSourceGetData(ds As BANanoObject) As List";
 //BA.debugLineNum = 89;BA.debugLine="Dim res As List = ds.GetField(\"pull\").Result";
_res = new anywheresoftware.b4a.objects.collections.List();
_res.setObject((java.util.List)(_ds.GetField("pull").Result()));
 //BA.debugLineNum = 90;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _datasourcegetitem(com.ab.banano.BANanoObject _ds,String _itemid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 113;BA.debugLine="Sub DataSourceGetItem(ds As BANanoObject, itemID A";
 //BA.debugLineNum = 114;BA.debugLine="Dim rec As Map = ds.RunMethod(\"getItem\", Array(it";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_ds.RunMethod("getItem",(Object)(new Object[]{(Object)(_itemid)})).Result()));
 //BA.debugLineNum = 115;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public Object  _datasourceserialize(com.ab.banano.BANanoObject _ds) throws Exception{
Object _res = null;
 //BA.debugLineNum = 81;BA.debugLine="Sub DataSourceSerialize(ds As BANanoObject) As Obj";
 //BA.debugLineNum = 82;BA.debugLine="Dim res As Object = ds.RunMethod(\"serialize\", Arr";
_res = _ds.RunMethod("serialize",(Object)(new Object[]{(Object)(__c.True)})).Result();
 //BA.debugLineNum = 83;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _datatablegetitem(com.ab.banano.BANanoObject _dt,anywheresoftware.b4a.objects.collections.Map _itemid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _gitem = null;
 //BA.debugLineNum = 107;BA.debugLine="Sub DataTableGetItem(dt As BANanoObject, itemID As";
 //BA.debugLineNum = 108;BA.debugLine="Dim gItem As Map = dt.RunMethod(\"getItem\", Array(";
_gitem = new anywheresoftware.b4a.objects.collections.Map();
_gitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dt.RunMethod("getItem",(Object)(new Object[]{(Object)(_itemid.getObject())})).Result()));
 //BA.debugLineNum = 109;BA.debugLine="Return gItem";
if (true) return _gitem;
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public String  _dateadd(String _mdate,int _howmanydays) throws Exception{
long _convertdate = 0L;
long _newdateday = 0L;
 //BA.debugLineNum = 227;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
 //BA.debugLineNum = 228;BA.debugLine="Dim ConvertDate, NewDateDay As Long";
_convertdate = 0L;
_newdateday = 0L;
 //BA.debugLineNum = 229;BA.debugLine="ConvertDate = DateTime.DateParse(mDate)";
_convertdate = __c.DateTime.DateParse(_mdate);
 //BA.debugLineNum = 230;BA.debugLine="NewDateDay = DateTime.Add(ConvertDate, 0, 0, H";
_newdateday = __c.DateTime.Add(_convertdate,(int) (0),(int) (0),_howmanydays);
 //BA.debugLineNum = 231;BA.debugLine="Return DateTime.Date(NewDateDay)";
if (true) return __c.DateTime.Date(_newdateday);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public int  _datediff(String _currentdate,String _otherdate) throws Exception{
long _currdate = 0L;
long _othdate = 0L;
 //BA.debugLineNum = 243;BA.debugLine="Sub DateDiff(CurrentDate As String, OtherDate As S";
 //BA.debugLineNum = 244;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 246;BA.debugLine="Dim CurrDate As Long";
_currdate = 0L;
 //BA.debugLineNum = 247;BA.debugLine="Dim OthDate As Long";
_othdate = 0L;
 //BA.debugLineNum = 248;BA.debugLine="CurrDate = DateTime.DateParse(CurrentDate)";
_currdate = __c.DateTime.DateParse(_currentdate);
 //BA.debugLineNum = 249;BA.debugLine="OthDate = DateTime.DateParse(OtherDate)";
_othdate = __c.DateTime.DateParse(_otherdate);
 //BA.debugLineNum = 251;BA.debugLine="Return (CurrDate-OthDate) / DateTime.TicksPerDay";
if (true) return (int) ((_currdate-_othdate)/(double)__c.DateTime.TicksPerDay);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return 0;
}
public String  _datetimenow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 218;BA.debugLine="Public Sub DateTimeNow() As String";
 //BA.debugLineNum = 219;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 220;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 221;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 222;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 223;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 224;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public Object  _datetostr(String _f) throws Exception{
com.ab.banano.BANanoObject _df = null;
Object _df1 = null;
 //BA.debugLineNum = 942;BA.debugLine="Sub DateToStr(f As String) As Object";
 //BA.debugLineNum = 943;BA.debugLine="Dim df As BANanoObject = webix.GetField(\"Date\")";
_df = _webix.GetField("Date");
 //BA.debugLineNum = 944;BA.debugLine="Dim df1 As Object = df.RunMethod(\"dateToStr\", Arr";
_df1 = _df.RunMethod("dateToStr",(Object)(new Object[]{(Object)(_f)})).Result();
 //BA.debugLineNum = 945;BA.debugLine="Return df1";
if (true) return _df1;
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return null;
}
public String  _define(String _eid,anywheresoftware.b4a.objects.collections.Map _properties) throws Exception{
 //BA.debugLineNum = 1080;BA.debugLine="Sub Define(eID As String, properties As Map)";
 //BA.debugLineNum = 1081;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1082;BA.debugLine="Dollar.Selector(eID).RunMethod(\"define\",Array(pro";
_dollar.Selector((Object)(_eid)).RunMethod("define",(Object)(new Object[]{(Object)(_properties.getObject())}));
 //BA.debugLineNum = 1083;BA.debugLine="End Sub";
return "";
}
public String  _delay(int _milliseconds,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 2327;BA.debugLine="Sub Delay(milliseconds As Int, cb As BANanoObject)";
 //BA.debugLineNum = 2328;BA.debugLine="webix.RunMethod(\"delay\",Array(cb,milliseconds))";
_webix.RunMethod("delay",(Object)(new Object[]{(Object)(_cb),(Object)(_milliseconds)}));
 //BA.debugLineNum = 2329;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _deprefix(anywheresoftware.b4a.objects.collections.Map _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _mk = "";
Object _mv = null;
String _mk1 = "";
 //BA.debugLineNum = 2331;BA.debugLine="Sub DePrefix(target As Map) As Map";
 //BA.debugLineNum = 2332;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2333;BA.debugLine="For Each mk As String In target.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _target.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2334;BA.debugLine="Dim mv As Object = target.Get(mk)";
_mv = _target.Get((Object)(_mk));
 //BA.debugLineNum = 2335;BA.debugLine="Dim mk1 As String = MvField(mk,2,\"_\")";
_mk1 = _mvfield(_mk,(int) (2),"_");
 //BA.debugLineNum = 2336;BA.debugLine="nm.Put(mk1,mv)";
_nm.Put((Object)(_mk1),_mv);
 }
};
 //BA.debugLineNum = 2338;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2339;BA.debugLine="End Sub";
return null;
}
public String  _disable(String _itmid) throws Exception{
 //BA.debugLineNum = 1657;BA.debugLine="Sub Disable(itmID As String)";
 //BA.debugLineNum = 1658;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 1659;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"disable\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("disable",(Object)(""));
 //BA.debugLineNum = 1660;BA.debugLine="End Sub";
return "";
}
public String  _disablemulti(anywheresoftware.b4a.objects.collections.List _m) throws Exception{
String _a = "";
 //BA.debugLineNum = 1788;BA.debugLine="Sub DisableMulti(m As List)";
 //BA.debugLineNum = 1789;BA.debugLine="For Each a As String In m";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_a = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1790;BA.debugLine="Disable(a)";
_disable(_a);
 }
};
 //BA.debugLineNum = 1792;BA.debugLine="End Sub";
return "";
}
public String  _editrow(String _dt,String _rowid) throws Exception{
 //BA.debugLineNum = 1187;BA.debugLine="Sub EditRow(dt As String, rowid As String)";
 //BA.debugLineNum = 1188;BA.debugLine="dt = dt.tolowercase";
_dt = _dt.toLowerCase();
 //BA.debugLineNum = 1189;BA.debugLine="rowid = CStr(rowid)";
_rowid = _cstr((Object)(_rowid));
 //BA.debugLineNum = 1190;BA.debugLine="Dollar.Selector(dt).RunMethod(\"editRow\", Array(ro";
_dollar.Selector((Object)(_dt)).RunMethod("editRow",(Object)(new Object[]{(Object)(_rowid)}));
 //BA.debugLineNum = 1191;BA.debugLine="End Sub";
return "";
}
public String  _enable(String _itmid) throws Exception{
 //BA.debugLineNum = 1651;BA.debugLine="Sub Enable(itmID As String)";
 //BA.debugLineNum = 1652;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 1653;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"enable\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("enable",(Object)(""));
 //BA.debugLineNum = 1654;BA.debugLine="End Sub";
return "";
}
public String  _enabledisable(String _itmid,boolean _bval) throws Exception{
 //BA.debugLineNum = 1663;BA.debugLine="Sub EnableDisable(itmID As String, bVal As Boolean";
 //BA.debugLineNum = 1664;BA.debugLine="If bVal Then";
if (_bval) { 
 //BA.debugLineNum = 1665;BA.debugLine="Enable(itmID)";
_enable(_itmid);
 }else {
 //BA.debugLineNum = 1667;BA.debugLine="Disable(itmID)";
_disable(_itmid);
 };
 //BA.debugLineNum = 1669;BA.debugLine="End Sub";
return "";
}
public String  _enablemulti(anywheresoftware.b4a.objects.collections.List _m) throws Exception{
String _a = "";
 //BA.debugLineNum = 1782;BA.debugLine="Sub EnableMulti(m As List)";
 //BA.debugLineNum = 1783;BA.debugLine="For Each a As String In m";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_a = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1784;BA.debugLine="Enable(a)";
_enable(_a);
 }
};
 //BA.debugLineNum = 1786;BA.debugLine="End Sub";
return "";
}
public String  _error(String _stitle,String _smessage) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixmessagebox _ae = null;
 //BA.debugLineNum = 690;BA.debugLine="Sub Error(sTitle As String, sMessage As String)";
 //BA.debugLineNum = 691;BA.debugLine="Dim ae As WixMessageBox";
_ae = new b4j.Mashy.BANanoWebixDemo.wixmessagebox();
 //BA.debugLineNum = 692;BA.debugLine="ae.Initialize(\"\").SetTypeAlertError(True).SetTitl";
_ae._initialize /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ (ba,"")._settypealerterror /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ (__c.True)._settitle /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ ((Object)(_stitle))._settext /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ ((Object)(_smessage));
 //BA.debugLineNum = 693;BA.debugLine="Alert(ae.Item)";
_alert((Object)(_ae._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 694;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _exec(Object _s) throws Exception{
Object _res = null;
 //BA.debugLineNum = 1946;BA.debugLine="Sub Exec(s As Object) As BANanoObject";
 //BA.debugLineNum = 1947;BA.debugLine="Dim res As Object = webix.RunMethod(\"exec\", Array";
_res = _webix.RunMethod("exec",(Object)(new Object[]{_s})).Result();
 //BA.debugLineNum = 1948;BA.debugLine="Return res";
if (true) return (com.ab.banano.BANanoObject)(_res);
 //BA.debugLineNum = 1949;BA.debugLine="End Sub";
return null;
}
public Object  _exists(String _listid,String _eid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 1974;BA.debugLine="Sub Exists(listID As String, eID As String) As Obj";
 //BA.debugLineNum = 1975;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1976;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1977;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("exists",(Object)(new Object[]{(Object)(_eid)})).Result());
 //BA.debugLineNum = 1978;BA.debugLine="Return recID";
if (true) return (Object)(_recid);
 //BA.debugLineNum = 1979;BA.debugLine="End Sub";
return null;
}
public String  _exitfullscreen() throws Exception{
 //BA.debugLineNum = 1695;BA.debugLine="Sub ExitFullScreen";
 //BA.debugLineNum = 1696;BA.debugLine="webix.GetField(\"fullscreen\").RunMethod(\"exit\",Nul";
_webix.GetField("fullscreen").RunMethod("exit",__c.Null);
 //BA.debugLineNum = 1697;BA.debugLine="End Sub";
return "";
}
public String  _expand(String _nodeid) throws Exception{
 //BA.debugLineNum = 1302;BA.debugLine="Sub Expand(nodeID As String)";
 //BA.debugLineNum = 1303;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 1304;BA.debugLine="Dollar.Selector(nodeID).RunMethod(\"expand\", Null)";
_dollar.Selector((Object)(_nodeid)).RunMethod("expand",__c.Null);
 //BA.debugLineNum = 1305;BA.debugLine="End Sub";
return "";
}
public String  _expectedrag(double _dvalue) throws Exception{
 //BA.debugLineNum = 2427;BA.debugLine="Public Sub ExpectedRAG(dValue As Double) As String";
 //BA.debugLineNum = 2428;BA.debugLine="If dValue = 0 Then";
if (_dvalue==0) { 
 //BA.debugLineNum = 2429;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else if(_dvalue>0) { 
 //BA.debugLineNum = 2431;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvalue<0) { 
 //BA.debugLineNum = 2433;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else {
 //BA.debugLineNum = 2435;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 };
 //BA.debugLineNum = 2437;BA.debugLine="End Sub";
return "";
}
public String  _expenditurerag(double _dvariance) throws Exception{
 //BA.debugLineNum = 2439;BA.debugLine="Public Sub ExpenditureRAG(dVariance As Double) As";
 //BA.debugLineNum = 2440;BA.debugLine="If dVariance > 0 Then";
if (_dvariance>0) { 
 //BA.debugLineNum = 2441;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance<0) { 
 //BA.debugLineNum = 2443;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvariance==0) { 
 //BA.debugLineNum = 2445;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
 //BA.debugLineNum = 2447;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 2449;BA.debugLine="End Sub";
return "";
}
public String  _export2csv(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 2198;BA.debugLine="Sub Export2CSV(eID As String)";
 //BA.debugLineNum = 2199;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2201;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 2203;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid)});
 //BA.debugLineNum = 2205;BA.debugLine="webix.RunMethod(\"toCSV\", Array(itm, opt))";
_webix.RunMethod("toCSV",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 2206;BA.debugLine="End Sub";
return "";
}
public String  _export2excel(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 2166;BA.debugLine="Sub Export2Excel(eID As String)";
 //BA.debugLineNum = 2167;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2169;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 2171;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid)});
 //BA.debugLineNum = 2173;BA.debugLine="webix.RunMethod(\"toExcel\", Array(itm, opt))";
_webix.RunMethod("toExcel",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 2174;BA.debugLine="End Sub";
return "";
}
public String  _export2exceloptions(String _eid,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
com.ab.banano.BANanoObject _itm = null;
 //BA.debugLineNum = 2177;BA.debugLine="Sub Export2ExcelOptions(eID As String, options As";
 //BA.debugLineNum = 2178;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2180;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 2182;BA.debugLine="webix.RunMethod(\"toExcel\", Array(itm, options))";
_webix.RunMethod("toExcel",(Object)(new Object[]{(Object)(_itm),(Object)(_options.getObject())}));
 //BA.debugLineNum = 2183;BA.debugLine="End Sub";
return "";
}
public String  _export2pdf(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 2187;BA.debugLine="Sub Export2PDF(eID As String)";
 //BA.debugLineNum = 2188;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2190;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 2192;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid)});
 //BA.debugLineNum = 2194;BA.debugLine="webix.RunMethod(\"toPDF\", Array(itm, opt))";
_webix.RunMethod("toPDF",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 2195;BA.debugLine="End Sub";
return "";
}
public String  _export2png(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 2155;BA.debugLine="Sub Export2PNG(eID As String)";
 //BA.debugLineNum = 2156;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2158;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 2160;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid)});
 //BA.debugLineNum = 2162;BA.debugLine="webix.RunMethod(\"toPNG\", Array(itm, opt))";
_webix.RunMethod("toPNG",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 2163;BA.debugLine="End Sub";
return "";
}
public String  _facedone(int _dvalue) throws Exception{
 //BA.debugLineNum = 2538;BA.debugLine="Public Sub FaceDone(dValue As Int) As String";
 //BA.debugLineNum = 2539;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
 //BA.debugLineNum = 2541;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2543;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2545;BA.debugLine="End Sub";
return "";
}
public String  _facerag(int _dvalue) throws Exception{
 //BA.debugLineNum = 2503;BA.debugLine="Public Sub FaceRAG(dValue As Int) As String";
 //BA.debugLineNum = 2504;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2506;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
 //BA.debugLineNum = 2508;BA.debugLine="Return \"./assets/neutralface.png\"";
if (true) return "./assets/neutralface.png";
 break; }
case 2: {
 //BA.debugLineNum = 2510;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2512;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2514;BA.debugLine="End Sub";
return "";
}
public String  _facerg(int _dvalue) throws Exception{
 //BA.debugLineNum = 2516;BA.debugLine="Public Sub FaceRG(dValue As Int) As String";
 //BA.debugLineNum = 2517;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2519;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
 //BA.debugLineNum = 2521;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2523;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2525;BA.debugLine="End Sub";
return "";
}
public String  _facerg1(int _dvalue) throws Exception{
 //BA.debugLineNum = 2527;BA.debugLine="Public Sub FaceRG1(dValue As Int) As String";
 //BA.debugLineNum = 2528;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 1: {
 //BA.debugLineNum = 2530;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 0: {
 //BA.debugLineNum = 2532;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2534;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2536;BA.debugLine="End Sub";
return "";
}
public String  _filedialog(String _frmid,anywheresoftware.b4a.objects.collections.Map _opt) throws Exception{
 //BA.debugLineNum = 2129;BA.debugLine="Sub FileDialog(frmID As String, opt As Map)";
 //BA.debugLineNum = 2130;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 2131;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"fileDialog\",Arr";
_dollar.Selector((Object)(_frmid)).RunMethod("fileDialog",(Object)(new Object[]{(Object)(_opt.getObject())}));
 //BA.debugLineNum = 2132;BA.debugLine="End Sub";
return "";
}
public String  _focus(String _nodeid) throws Exception{
 //BA.debugLineNum = 1283;BA.debugLine="Sub Focus(nodeID As String)";
 //BA.debugLineNum = 1284;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 1285;BA.debugLine="Dollar.Selector(nodeID).RunMethod(\"focus\", Null)";
_dollar.Selector((Object)(_nodeid)).RunMethod("focus",__c.Null);
 //BA.debugLineNum = 1286;BA.debugLine="End Sub";
return "";
}
public String  _focuseditor(String _dt,String _colid) throws Exception{
 //BA.debugLineNum = 1193;BA.debugLine="Sub FocusEditor(dt As String, colid As String)";
 //BA.debugLineNum = 1194;BA.debugLine="dt = dt.tolowercase";
_dt = _dt.toLowerCase();
 //BA.debugLineNum = 1195;BA.debugLine="colid = CStr(colid)";
_colid = _cstr((Object)(_colid));
 //BA.debugLineNum = 1196;BA.debugLine="colid = colid.tolowercase";
_colid = _colid.toLowerCase();
 //BA.debugLineNum = 1197;BA.debugLine="Dollar.Selector(dt).RunMethod(\"focusEditor\", Arra";
_dollar.Selector((Object)(_dt)).RunMethod("focusEditor",(Object)(new Object[]{(Object)(_colid)}));
 //BA.debugLineNum = 1198;BA.debugLine="End Sub";
return "";
}
public String  _formatfilesize(float _bytes) throws Exception{
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
 //BA.debugLineNum = 399;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
 //BA.debugLineNum = 400;BA.debugLine="Try";
try { //BA.debugLineNum = 401;BA.debugLine="Private Unit() As String = Array As String(\" Byt";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
 //BA.debugLineNum = 402;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
 //BA.debugLineNum = 403;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
 //BA.debugLineNum = 405;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
 //BA.debugLineNum = 406;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 407;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (__c.Abs(_bytes));
 //BA.debugLineNum = 408;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (__c.Floor(__c.Logarithm(_bytes,1024)));
 //BA.debugLineNum = 409;BA.debugLine="Po = Power(1024, I)";
_po = __c.Power(1024,_i);
 //BA.debugLineNum = 410;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
 //BA.debugLineNum = 411;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
if (true) return __c.NumberFormat(_si,(int) (1),(int) (3))+_unit[_i];
 };
 } 
       catch (Exception e15) {
			ba.setLastException(e15); //BA.debugLineNum = 414;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 };
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return "";
}
public String  _freezerow(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 1469;BA.debugLine="Sub FreezeRow(dtID As String, r As Int)";
 //BA.debugLineNum = 1470;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 1471;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"freezeRow\", Arra";
_dollar.Selector((Object)(_dtid)).RunMethod("freezeRow",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 1472;BA.debugLine="End Sub";
return "";
}
public String  _fullscreen(Object _i) throws Exception{
 //BA.debugLineNum = 1691;BA.debugLine="Sub FullScreen(i As Object)";
 //BA.debugLineNum = 1692;BA.debugLine="webix.GetField(\"fullscreen\").RunMethod(\"set\", Arr";
_webix.GetField("fullscreen").RunMethod("set",(Object)(new Object[]{_i}));
 //BA.debugLineNum = 1693;BA.debugLine="End Sub";
return "";
}
public String  _gar(int _dvalue) throws Exception{
 //BA.debugLineNum = 2477;BA.debugLine="Public Sub GAR(dValue As Int) As String";
 //BA.debugLineNum = 2478;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2480;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
 //BA.debugLineNum = 2482;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 2484;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
 //BA.debugLineNum = 2486;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 2488;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcleanvalues(String _frmid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 2028;BA.debugLine="Sub GetCleanValues(frmID As String) As Map";
 //BA.debugLineNum = 2029;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 2030;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2031;BA.debugLine="rec = Dollar.Selector(frmID).RunMethod(\"getCleanV";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_frmid)).RunMethod("getCleanValues",__c.Null).Result()));
 //BA.debugLineNum = 2032;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 2033;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getcolumnconfig(String _eid,String _colid) throws Exception{
com.ab.banano.BANanoObject _grd = null;
com.ab.banano.BANanoObject _coldef = null;
 //BA.debugLineNum = 1085;BA.debugLine="Sub GetColumnConfig(eID As String, colID As String";
 //BA.debugLineNum = 1086;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1087;BA.debugLine="colID = colID.tolowercase";
_colid = _colid.toLowerCase();
 //BA.debugLineNum = 1089;BA.debugLine="Dim grd As BANanoObject = Dollar.Selector(eID)";
_grd = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 1090;BA.debugLine="Dim colDef As BANanoObject = grd.RunMethod(\"getCo";
_coldef = _grd.RunMethod("getColumnConfig",(Object)(new Object[]{(Object)(_colid)}));
 //BA.debugLineNum = 1091;BA.debugLine="Return colDef";
if (true) return _coldef;
 //BA.debugLineNum = 1092;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getdatasource(String _elid) throws Exception{
com.ab.banano.BANanoObject _bo = null;
com.ab.banano.BANanoObject _data = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub GetDataSource(elID As String) As BANanoObject";
 //BA.debugLineNum = 128;BA.debugLine="Dim bo As BANanoObject = GetWixElement(elID)";
_bo = _getwixelement(_elid);
 //BA.debugLineNum = 129;BA.debugLine="Dim Data As BANanoObject = bo.GetField(\"data\")";
_data = _bo.GetField("data");
 //BA.debugLineNum = 130;BA.debugLine="Return Data";
if (true) return _data;
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdirtyvalues(String _frmid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 2020;BA.debugLine="Sub GetDirtyValues(frmID As String) As Map";
 //BA.debugLineNum = 2021;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 2022;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2023;BA.debugLine="rec = Dollar.Selector(frmID).RunMethod(\"getDirtyV";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_frmid)).RunMethod("getDirtyValues",__c.Null).Result()));
 //BA.debugLineNum = 2024;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 2025;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getelementbyid(String _eid) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 1110;BA.debugLine="Sub GetElementByID(eid As String) As BANanoObject";
 //BA.debugLineNum = 1111;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1112;BA.debugLine="Dim bo As BANanoObject = Dollar.Selector(eid)";
_bo = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 1113;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 1114;BA.debugLine="End Sub";
return null;
}
public String  _getfileext(String _fullpath) throws Exception{
 //BA.debugLineNum = 2382;BA.debugLine="Sub GetFileExt(FullPath As String) As String";
 //BA.debugLineNum = 2383;BA.debugLine="Return FullPath.SubString(FullPath.LastIndexOf(\".";
if (true) return _fullpath.substring((int) (_fullpath.lastIndexOf(".")+1));
 //BA.debugLineNum = 2384;BA.debugLine="End Sub";
return "";
}
public String  _getfileparentpath(String _path) throws Exception{
String _path1 = "";
int _l = 0;
 //BA.debugLineNum = 2362;BA.debugLine="Sub GetFileParentPath(Path As String) As String";
 //BA.debugLineNum = 2363;BA.debugLine="Dim Path1 As String";
_path1 = "";
 //BA.debugLineNum = 2364;BA.debugLine="Dim L As Int";
_l = 0;
 //BA.debugLineNum = 2365;BA.debugLine="If Path = \"/\" Then";
if ((_path).equals("/")) { 
 //BA.debugLineNum = 2366;BA.debugLine="Return \"/\"";
if (true) return "/";
 };
 //BA.debugLineNum = 2368;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
 //BA.debugLineNum = 2369;BA.debugLine="If L = Path.Length - 1 Then";
if (_l==_path.length()-1) { 
 //BA.debugLineNum = 2371;BA.debugLine="Path1 = Path.SubString2(0,L)";
_path1 = _path.substring((int) (0),_l);
 }else {
 //BA.debugLineNum = 2373;BA.debugLine="Path1 = Path";
_path1 = _path;
 };
 //BA.debugLineNum = 2375;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
 //BA.debugLineNum = 2376;BA.debugLine="If L = 0 Then";
if (_l==0) { 
 //BA.debugLineNum = 2377;BA.debugLine="L = 1";
_l = (int) (1);
 };
 //BA.debugLineNum = 2379;BA.debugLine="Return Path1.SubString2(0,L)";
if (true) return _path1.substring((int) (0),_l);
 //BA.debugLineNum = 2380;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getitem(String _listid,String _recordid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 1815;BA.debugLine="Sub GetItem(listID As String, recordID As String)";
 //BA.debugLineNum = 1816;BA.debugLine="listID = CStr(listID)";
_listid = _cstr((Object)(_listid));
 //BA.debugLineNum = 1817;BA.debugLine="recordID = CStr(recordID)";
_recordid = _cstr((Object)(_recordid));
 //BA.debugLineNum = 1818;BA.debugLine="listID = listID.ToLowerCase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1819;BA.debugLine="Dim values As Map = Dollar.Selector(listID).RunMe";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getItem",(Object)(new Object[]{(Object)(_recordid)})).Result()));
 //BA.debugLineNum = 1820;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 1821;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getmarker(String _listid,String _recordid) throws Exception{
String _mkey = "";
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 1824;BA.debugLine="Sub GetMarker(listID As String, recordID As String";
 //BA.debugLineNum = 1825;BA.debugLine="Dim mKey As String = \"$\" & \"marker\"";
_mkey = "$"+"marker";
 //BA.debugLineNum = 1826;BA.debugLine="listID = listID.ToLowerCase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1827;BA.debugLine="recordID = recordID.tolowercase";
_recordid = _recordid.toLowerCase();
 //BA.debugLineNum = 1828;BA.debugLine="Dim values As Map = Dollar.Selector(listID).RunMe";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getItem",(Object)(new Object[]{(Object)(_recordid)})).Result()));
 //BA.debugLineNum = 1829;BA.debugLine="values.Remove(mKey)";
_values.Remove((Object)(_mkey));
 //BA.debugLineNum = 1830;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 1831;BA.debugLine="End Sub";
return null;
}
public String  _getnextid(anywheresoftware.b4a.objects.collections.List _rsl) throws Exception{
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
 //BA.debugLineNum = 481;BA.debugLine="Sub GetNextID(rsl As List) As String";
 //BA.debugLineNum = 482;BA.debugLine="Dim nextid As Int";
_nextid = 0;
 //BA.debugLineNum = 483;BA.debugLine="Dim strid As String";
_strid = "";
 //BA.debugLineNum = 485;BA.debugLine="If rsl.Size = 0 Then";
if (_rsl.getSize()==0) { 
 //BA.debugLineNum = 486;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
 //BA.debugLineNum = 488;BA.debugLine="Dim nr As Map = rsl.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rsl.Get((int) (0))));
 //BA.debugLineNum = 489;BA.debugLine="Dim ni As String = nr.Getdefault(\"id\",\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)("id"),(Object)("0")));
 //BA.debugLineNum = 490;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = _banano.parseInt((Object)(_ni));
 };
 //BA.debugLineNum = 492;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
 //BA.debugLineNum = 493;BA.debugLine="strid = CStr(nextid)";
_strid = _cstr((Object)(_nextid));
 //BA.debugLineNum = 494;BA.debugLine="Return strid";
if (true) return _strid;
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _getnode(String _eid) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 1295;BA.debugLine="Sub getNode(eID As String) As BANanoObject";
 //BA.debugLineNum = 1296;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1297;BA.debugLine="Dim bo As BANanoObject = Dollar.Selector(eID).Run";
_bo = _dollar.Selector((Object)(_eid)).RunMethod("getNode",__c.Null);
 //BA.debugLineNum = 1298;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 1299;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getpivotdatatable(String _pivotname) throws Exception{
com.ab.banano.BANanoObject _dt = null;
 //BA.debugLineNum = 95;BA.debugLine="Sub GetPivotDataTable(pivotName As String) As BANa";
 //BA.debugLineNum = 96;BA.debugLine="Dim dt As BANanoObject = BANano.RunJavascriptMeth";
_dt = (com.ab.banano.BANanoObject)(_banano.RunJavascriptMethod("getPivotDataTable",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_pivotname)})));
 //BA.debugLineNum = 97;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public String  _getrowidfromcontext(com.ab.banano.BANanoObject _bo) throws Exception{
anywheresoftware.b4a.objects.collections.Map _context = null;
String _rowid = "";
 //BA.debugLineNum = 1855;BA.debugLine="Sub GetRowIDFromContext(bo As BANanoObject) As Str";
 //BA.debugLineNum = 1856;BA.debugLine="Dim context As Map = bo.GetField(\"context\").Resul";
_context = new anywheresoftware.b4a.objects.collections.Map();
_context.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bo.GetField("context").Result()));
 //BA.debugLineNum = 1857;BA.debugLine="Dim rowid As String = context.Get(\"rowid\")";
_rowid = BA.ObjectToString(_context.Get((Object)("rowid")));
 //BA.debugLineNum = 1858;BA.debugLine="rowid = CStr(rowid)";
_rowid = _cstr((Object)(_rowid));
 //BA.debugLineNum = 1859;BA.debugLine="Return rowid";
if (true) return _rowid;
 //BA.debugLineNum = 1860;BA.debugLine="End Sub";
return "";
}
public Object  _getselected(String _listid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 1959;BA.debugLine="Sub GetSelected(listID As String) As Object";
 //BA.debugLineNum = 1960;BA.debugLine="listID = CStr(listID)";
_listid = _cstr((Object)(_listid));
 //BA.debugLineNum = 1961;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1962;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("getSelected",__c.Null).Result());
 //BA.debugLineNum = 1963;BA.debugLine="Return recID";
if (true) return (Object)(_recid);
 //BA.debugLineNum = 1964;BA.debugLine="End Sub";
return null;
}
public Object  _getselecteddate(String _eid) throws Exception{
Object _res = null;
 //BA.debugLineNum = 2006;BA.debugLine="Sub GetSelectedDate(eid As String) As Object";
 //BA.debugLineNum = 2007;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2008;BA.debugLine="Dim res As Object = Dollar.Selector(eid).RunMetho";
_res = (Object)(_dollar.Selector((Object)(_eid)).RunMethod("getSelectedDate",__c.Null));
 //BA.debugLineNum = 2009;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 2010;BA.debugLine="End Sub";
return null;
}
public Object  _getselectedid(String _listid) throws Exception{
String _si = "";
 //BA.debugLineNum = 1952;BA.debugLine="Sub GetSelectedID(listID As String) As Object";
 //BA.debugLineNum = 1953;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1954;BA.debugLine="Dim si As String = Dollar.Selector(listID).RunMet";
_si = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("getSelectedId",__c.Null).Result());
 //BA.debugLineNum = 1955;BA.debugLine="Return si";
if (true) return (Object)(_si);
 //BA.debugLineNum = 1956;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getselecteditem(String _listid,boolean _bmulti) throws Exception{
anywheresoftware.b4a.objects.collections.List _recid = null;
 //BA.debugLineNum = 1967;BA.debugLine="Sub GetSelectedItem(listID As String, bMulti As Bo";
 //BA.debugLineNum = 1968;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1969;BA.debugLine="Dim recID As List = Dollar.Selector(listID).RunMe";
_recid = new anywheresoftware.b4a.objects.collections.List();
_recid.setObject((java.util.List)(_dollar.Selector((Object)(_listid)).RunMethod("getSelectedItem",(Object)(new Object[]{(Object)(_bmulti)})).Result()));
 //BA.debugLineNum = 1970;BA.debugLine="Return recID";
if (true) return _recid;
 //BA.debugLineNum = 1971;BA.debugLine="End Sub";
return null;
}
public int  _gettoolbarheight(String _itm) throws Exception{
String _hfld = "";
int _res = 0;
 //BA.debugLineNum = 1589;BA.debugLine="Sub GetToolBarHeight(itm As String) As Int";
 //BA.debugLineNum = 1590;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 1591;BA.debugLine="Dim hfld As String = \"$\" & \"height\"";
_hfld = "$"+"height";
 //BA.debugLineNum = 1592;BA.debugLine="Dim res As Int = Dollar.Selector(itm).GetField(hf";
_res = (int)(BA.ObjectToNumber(_dollar.Selector((Object)(_itm)).GetField(_hfld)));
 //BA.debugLineNum = 1593;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1594;BA.debugLine="End Sub";
return 0;
}
public String  _getvalue(String _itm) throws Exception{
String _res = "";
 //BA.debugLineNum = 1609;BA.debugLine="Sub GetValue(itm As String) As String";
 //BA.debugLineNum = 1610;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 1611;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 1612;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValue\",N";
_res = BA.ObjectToString(_dollar.Selector((Object)(_itm)).RunMethod("getValue",__c.Null).Result());
 //BA.debugLineNum = 1613;BA.debugLine="res = CStr(res)";
_res = _cstr((Object)(_res));
 //BA.debugLineNum = 1614;BA.debugLine="res = res.trim";
_res = _res.trim();
 //BA.debugLineNum = 1615;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1616;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getvalues(String _itm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _res = null;
String _mk = "";
String _mv = "";
 //BA.debugLineNum = 1625;BA.debugLine="Sub GetValues(itm As String) As Map";
 //BA.debugLineNum = 1626;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 1627;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1628;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValues\",";
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_itm)).RunMethod("getValues",__c.Null).Result()));
 //BA.debugLineNum = 1629;BA.debugLine="For Each mk As String In res.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _res.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mk = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 1630;BA.debugLine="Dim mv As String = res.GetDefault(mk,\"\")";
_mv = BA.ObjectToString(_res.GetDefault((Object)(_mk),(Object)("")));
 //BA.debugLineNum = 1631;BA.debugLine="mv = CStr(mv)";
_mv = _cstr((Object)(_mv));
 //BA.debugLineNum = 1632;BA.debugLine="mv = mv.trim";
_mv = _mv.trim();
 //BA.debugLineNum = 1633;BA.debugLine="res.Put(mk, mv)";
_res.Put((Object)(_mk),(Object)(_mv));
 }
};
 //BA.debugLineNum = 1635;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1636;BA.debugLine="End Sub";
return null;
}
public Object  _getvisibledate(String _eid) throws Exception{
Object _res = null;
 //BA.debugLineNum = 2012;BA.debugLine="Sub GetVisibleDate(eid As String) As Object";
 //BA.debugLineNum = 2013;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2014;BA.debugLine="Dim res As Object = Dollar.Selector(eid).RunMetho";
_res = (Object)(_dollar.Selector((Object)(_eid)).RunMethod("getVisibleDate",__c.Null));
 //BA.debugLineNum = 2015;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 2016;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getwebix() throws Exception{
 //BA.debugLineNum = 1146;BA.debugLine="Sub GetWebix As BANanoObject";
 //BA.debugLineNum = 1147;BA.debugLine="Return webix";
if (true) return _webix;
 //BA.debugLineNum = 1148;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getwixelement(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
 //BA.debugLineNum = 119;BA.debugLine="Sub GetWixElement(eID As String) As BANanoObject";
 //BA.debugLineNum = 120;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 122;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 123;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage._wixselectedid  _getwixselectedid(String _listid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _si = null;
b4j.Mashy.BANanoWebixDemo.wixpage._wixselectedid _sio = null;
 //BA.debugLineNum = 1927;BA.debugLine="private Sub GetWixSelectedID(listID As String) As";
 //BA.debugLineNum = 1928;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1929;BA.debugLine="Dim si As Map = Dollar.Selector(listID).RunMethod";
_si = new anywheresoftware.b4a.objects.collections.Map();
_si.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getSelectedId",__c.Null).Result()));
 //BA.debugLineNum = 1931;BA.debugLine="Dim sio As WixSelectedID";
_sio = new b4j.Mashy.BANanoWebixDemo.wixpage._wixselectedid();
 //BA.debugLineNum = 1932;BA.debugLine="sio.Initialize";
_sio.Initialize();
 //BA.debugLineNum = 1933;BA.debugLine="sio.column = si.Get(\"column\")";
_sio.column /*Object*/  = _si.Get((Object)("column"));
 //BA.debugLineNum = 1934;BA.debugLine="sio.row = si.Get(\"row\")";
_sio.row /*Object*/  = _si.Get((Object)("row"));
 //BA.debugLineNum = 1935;BA.debugLine="sio.id = si.Get(\"id\")";
_sio.ID /*Object*/  = _si.Get((Object)("id"));
 //BA.debugLineNum = 1936;BA.debugLine="Return sio";
if (true) return _sio;
 //BA.debugLineNum = 1937;BA.debugLine="End Sub";
return null;
}
public String  _hide(String _itmid) throws Exception{
 //BA.debugLineNum = 1639;BA.debugLine="Sub Hide(itmID As String)";
 //BA.debugLineNum = 1640;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 1641;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"hide\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("hide",(Object)(""));
 //BA.debugLineNum = 1642;BA.debugLine="End Sub";
return "";
}
public String  _hidemulti(anywheresoftware.b4a.objects.collections.List _m) throws Exception{
String _a = "";
 //BA.debugLineNum = 1794;BA.debugLine="Sub HideMulti(m As List)";
 //BA.debugLineNum = 1795;BA.debugLine="For Each a As String In m";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_a = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1796;BA.debugLine="Hide(a)";
_hide(_a);
 }
};
 //BA.debugLineNum = 1798;BA.debugLine="End Sub";
return "";
}
public String  _hideoverlay(String _eid) throws Exception{
 //BA.debugLineNum = 1367;BA.debugLine="Sub HideOverlay(eid As String)";
 //BA.debugLineNum = 1368;BA.debugLine="eid = eid.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1369;BA.debugLine="Dollar.Selector(eid).RunMethod(\"hideOverlay\",Null";
_dollar.Selector((Object)(_eid)).RunMethod("hideOverlay",__c.Null);
 //BA.debugLineNum = 1370;BA.debugLine="End Sub";
return "";
}
public String  _iconv(anywheresoftware.b4a.objects.collections.Map _oldmap,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _lstv = "";
String _mv = "";
 //BA.debugLineNum = 551;BA.debugLine="Sub Iconv(oldMap As Map, lst As List)";
 //BA.debugLineNum = 552;BA.debugLine="For Each lstv As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lstv = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 553;BA.debugLine="Dim mv As String = oldMap.Get(lstv)";
_mv = BA.ObjectToString(_oldmap.Get((Object)(_lstv)));
 //BA.debugLineNum = 554;BA.debugLine="mv = Val(mv)";
_mv = _val(_mv);
 //BA.debugLineNum = 555;BA.debugLine="oldMap.Put(lstv, mv)";
_oldmap.Put((Object)(_lstv),(Object)(_mv));
 }
};
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return "";
}
public String  _inform(String _stitle,String _smessage) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixmessagebox _ae = null;
 //BA.debugLineNum = 704;BA.debugLine="Sub Inform(sTitle As String, sMessage As String)";
 //BA.debugLineNum = 705;BA.debugLine="Dim ae As WixMessageBox";
_ae = new b4j.Mashy.BANanoWebixDemo.wixmessagebox();
 //BA.debugLineNum = 706;BA.debugLine="ae.Initialize(\"\").SetTitle(sTitle).SetText(sMessa";
_ae._initialize /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ (ba,"")._settitle /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ ((Object)(_stitle))._settext /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ ((Object)(_smessage));
 //BA.debugLineNum = 707;BA.debugLine="Alert(ae.Item)";
_alert((Object)(_ae._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 708;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _initialize(anywheresoftware.b4a.BA _ba,String _pgid,String _pgcontainer) throws Exception{
innerInitialize(_ba);
Object _invalue = null;
 //BA.debugLineNum = 868;BA.debugLine="Public Sub Initialize(pgID As String, pgContainer";
 //BA.debugLineNum = 869;BA.debugLine="hints.Initialize";
_hints.Initialize();
 //BA.debugLineNum = 870;BA.debugLine="Dollar.Initialize(\"$$\")";
_dollar.Initialize((Object)("$$"));
 //BA.debugLineNum = 871;BA.debugLine="ID = pgID.tolowercase";
_id = _pgid.toLowerCase();
 //BA.debugLineNum = 872;BA.debugLine="webix.Initialize(\"webix\")";
_webix.Initialize((Object)("webix"));
 //BA.debugLineNum = 873;BA.debugLine="Page.Initialize(ID)";
_page._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 875;BA.debugLine="EnumButtonTypes.Initialize";
_enumbuttontypes._initialize /*String*/ (ba);
 //BA.debugLineNum = 876;BA.debugLine="EnumLayoutTypes.Initialize";
_enumlayouttypes._initialize /*String*/ (ba);
 //BA.debugLineNum = 877;BA.debugLine="EnumWixIcons.Initialize";
_enumwixicons._initialize /*String*/ (ba);
 //BA.debugLineNum = 878;BA.debugLine="SetContainer(pgContainer)";
_setcontainer(_pgcontainer);
 //BA.debugLineNum = 879;BA.debugLine="BuildViews";
_buildviews();
 //BA.debugLineNum = 881;BA.debugLine="Dim inValue As Object";
_invalue = new Object();
 //BA.debugLineNum = 882;BA.debugLine="webix.GetField(\"rules\").SetField(\"isNumberOrBlank";
_webix.GetField("rules").SetField("isNumberOrBlank",_banano.CallBack(this,"isNumberOrBlank",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_invalue})));
 //BA.debugLineNum = 883;BA.debugLine="webix.GetField(\"rules\").SetField(\"isEmailOrBlank\"";
_webix.GetField("rules").SetField("isEmailOrBlank",_banano.CallBack(this,"isEmailOrBlank",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_invalue})));
 //BA.debugLineNum = 884;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 885;BA.debugLine="End Sub";
return null;
}
public String  _inquotes(String _svalue) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Public Sub InQuotes(sValue As String) As String";
 //BA.debugLineNum = 339;BA.debugLine="Return QUOTE & sValue & QUOTE";
if (true) return __c.QUOTE+_svalue+__c.QUOTE;
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return "";
}
public int  _instr(String _text,String _sfind) throws Exception{
 //BA.debugLineNum = 547;BA.debugLine="Sub InStr(Text As String, sFind As String) As Int";
 //BA.debugLineNum = 548;BA.debugLine="Return Text.tolowercase.IndexOf(sFind.tolowercase";
if (true) return _text.toLowerCase().indexOf(_sfind.toLowerCase());
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return 0;
}
public long  _instrrev(String _value,String _search) throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Sub InStrRev(value As String, search As String) As";
 //BA.debugLineNum = 419;BA.debugLine="Return value.LastIndexOf(search) + 1";
if (true) return (long) (_value.lastIndexOf(_search)+1);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return 0L;
}
public boolean  _isemailorblank(Object _invalue) throws Exception{
boolean _bvalue = false;
 //BA.debugLineNum = 904;BA.debugLine="Sub isEmailOrBlank(inValue As Object) As Boolean";
 //BA.debugLineNum = 905;BA.debugLine="If inValue = \"\" Then Return True";
if ((_invalue).equals((Object)(""))) { 
if (true) return __c.True;};
 //BA.debugLineNum = 906;BA.debugLine="Dim bValue As Boolean = webix.GetField(\"rules\").R";
_bvalue = BA.ObjectToBoolean(_webix.GetField("rules").RunMethod("isEmail",(Object)(new Object[]{_invalue})));
 //BA.debugLineNum = 907;BA.debugLine="Return bValue";
if (true) return _bvalue;
 //BA.debugLineNum = 908;BA.debugLine="End Sub";
return false;
}
public boolean  _isnumberorblank(Object _invalue) throws Exception{
boolean _bvalue = false;
 //BA.debugLineNum = 898;BA.debugLine="Sub isNumberOrBlank(inValue As Object) As Boolean";
 //BA.debugLineNum = 899;BA.debugLine="If inValue = \"\" Then Return True";
if ((_invalue).equals((Object)(""))) { 
if (true) return __c.True;};
 //BA.debugLineNum = 900;BA.debugLine="Dim bValue As Boolean = webix.GetField(\"rules\").R";
_bvalue = BA.ObjectToBoolean(_webix.GetField("rules").RunMethod("isNumber",(Object)(new Object[]{_invalue})));
 //BA.debugLineNum = 901;BA.debugLine="Return bValue";
if (true) return _bvalue;
 //BA.debugLineNum = 902;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 1573;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 1574;BA.debugLine="Return Page.item";
if (true) return _page._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 1575;BA.debugLine="End Sub";
return null;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 134;BA.debugLine="Sub Join(delimiter As String, lst As List) As Stri";
 //BA.debugLineNum = 135;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 136;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 137;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 138;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 139;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 140;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 141;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 142;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 143;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 145;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _joinlists(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
Object _lo = null;
 //BA.debugLineNum = 161;BA.debugLine="Sub JoinLists(lst As List) As List";
 //BA.debugLineNum = 162;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 163;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 164;BA.debugLine="For Each lo As Object In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_lo = group3.Get(index3);
 //BA.debugLineNum = 165;BA.debugLine="nl.Add(lo)";
_nl.Add(_lo);
 }
};
 //BA.debugLineNum = 167;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _joinmaps(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.Map _mr = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 149;BA.debugLine="Sub JoinMaps(lst As List) As Map";
 //BA.debugLineNum = 150;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 151;BA.debugLine="For Each mr As Map In lst";
_mr = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
 //BA.debugLineNum = 152;BA.debugLine="For Each k As String In mr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mr.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 153;BA.debugLine="Dim v As Object = mr.Get(k)";
_v = _mr.Get((Object)(_k));
 //BA.debugLineNum = 154;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 }
};
 //BA.debugLineNum = 157;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public String  _joinnonblanks(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _str = "";
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 45;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
 //BA.debugLineNum = 47;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 48;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="For Each str As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_str = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 50;BA.debugLine="str = str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 51;BA.debugLine="If str.Length > 0 Then";
if (_str.length()>0) { 
 //BA.debugLineNum = 52;BA.debugLine="nl.Add(str)";
_nl.Add((Object)(_str));
 };
 }
};
 //BA.debugLineNum = 55;BA.debugLine="If nl.Size = 0 Then Return \"\"";
if (_nl.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 57;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 58;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 60;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 61;BA.debugLine="fld = nl.Get(0)";
_fld = BA.ObjectToString(_nl.Get((int) (0)));
 //BA.debugLineNum = 62;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 63;BA.debugLine="For i = 1 To nl.size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_nl.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 64;BA.debugLine="Dim fld As String = nl.Get(i)";
_fld = BA.ObjectToString(_nl.Get(_i));
 //BA.debugLineNum = 65;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 67;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
 //BA.debugLineNum = 851;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 852;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 853;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 854;BA.debugLine="lst.clear";
_lst.Clear();
 //BA.debugLineNum = 855;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
 //BA.debugLineNum = 856;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 858;BA.debugLine="Try";
try { //BA.debugLineNum = 859;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 860;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
 //BA.debugLineNum = 861;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 863;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 826;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 827;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 828;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 829;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 830;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 831;BA.debugLine="Try";
try { //BA.debugLineNum = 832;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 833;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 834;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 836;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 838;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return null;
}
public String  _jsonvalues2lowercase(String _sjson,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
anywheresoftware.b4a.objects.collections.Map _jmap = null;
String _njson = "";
 //BA.debugLineNum = 436;BA.debugLine="Sub JSONValues2LowerCase(sJSON As String, props As";
 //BA.debugLineNum = 438;BA.debugLine="Dim jmap As Map = Json2Map(sJSON)";
_jmap = new anywheresoftware.b4a.objects.collections.Map();
_jmap = _json2map(_sjson);
 //BA.debugLineNum = 439;BA.debugLine="MapValues2LowerCase(jmap, props)";
_mapvalues2lowercase(_jmap,_props);
 //BA.debugLineNum = 440;BA.debugLine="Dim nJSON As String = Map2Json(jmap)";
_njson = _map2json(_jmap);
 //BA.debugLineNum = 441;BA.debugLine="Return nJSON";
if (true) return _njson;
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return "";
}
public String  _lcase(String _text) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub LCase(Text As String) As String";
 //BA.debugLineNum = 327;BA.debugLine="Return Text.ToLowerCase";
if (true) return _text.toLowerCase();
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public String  _leftstring(String _text,long _llength) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub LeftString(Text As String, lLength As Long)As";
 //BA.debugLineNum = 290;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
 //BA.debugLineNum = 291;BA.debugLine="Return Text.SubString2(0, lLength)";
if (true) return _text.substring((int) (0),(int) (_llength));
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return "";
}
public int  _len(String _text) throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="Sub Len(Text As String) As Int";
 //BA.debugLineNum = 424;BA.debugLine="Return Text.Length";
if (true) return _text.length();
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return 0;
}
public String  _list2arrayvariable(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 625;BA.debugLine="Sub List2ArrayVariable(lst As List) As String";
 //BA.debugLineNum = 626;BA.debugLine="If lst.Size = 0 Then";
if (_lst.getSize()==0) { 
 //BA.debugLineNum = 627;BA.debugLine="Return $\"\"\"\"$";
if (true) return ("\"\"");
 };
 //BA.debugLineNum = 629;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 630;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 631;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 632;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 633;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 634;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",(Object)(_fld))+"\"");
 //BA.debugLineNum = 635;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 636;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 637;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 638;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",(Object)(_fld))+"\"");
 //BA.debugLineNum = 639;BA.debugLine="sb.Append(\",\").Append(fld)";
_sb.Append(",").Append(_fld);
 }
};
 //BA.debugLineNum = 641;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _list2idvalue(anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
String _mv1 = "";
String _mv2 = "";
anywheresoftware.b4a.objects.collections.List _nlst = null;
anywheresoftware.b4a.objects.collections.Map _dict = null;
String _mk = "";
String _mv = "";
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 609;BA.debugLine="Sub List2IDValue(lst As List, mapValues As List) A";
 //BA.debugLineNum = 610;BA.debugLine="Dim mv1 As String = mapValues.get(0)";
_mv1 = BA.ObjectToString(_mapvalues.Get((int) (0)));
 //BA.debugLineNum = 611;BA.debugLine="Dim mv2 As String = mapValues.get(1)";
_mv2 = BA.ObjectToString(_mapvalues.Get((int) (1)));
 //BA.debugLineNum = 612;BA.debugLine="Dim nlst As List";
_nlst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 613;BA.debugLine="nlst.initialize";
_nlst.Initialize();
 //BA.debugLineNum = 614;BA.debugLine="For Each dict As Map In lst";
_dict = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _lst;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_dict.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
 //BA.debugLineNum = 615;BA.debugLine="Dim mk As String = dict.get(mv1)";
_mk = BA.ObjectToString(_dict.Get((Object)(_mv1)));
 //BA.debugLineNum = 616;BA.debugLine="Dim mv As String = dict.get(mv2)";
_mv = BA.ObjectToString(_dict.Get((Object)(_mv2)));
 //BA.debugLineNum = 617;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 618;BA.debugLine="nm.Put(\"id\", mk)";
_nm.Put((Object)("id"),(Object)(_mk));
 //BA.debugLineNum = 619;BA.debugLine="nm.put(\"value\", mv)";
_nm.Put((Object)("value"),(Object)(_mv));
 //BA.debugLineNum = 620;BA.debugLine="nlst.Add(nm)";
_nlst.Add((Object)(_nm.getObject()));
 }
};
 //BA.debugLineNum = 622;BA.debugLine="Return nlst";
if (true) return _nlst;
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return null;
}
public String  _list2json(anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 844;BA.debugLine="Sub List2Json(mp As List) As String";
 //BA.debugLineNum = 845;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 846;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
 //BA.debugLineNum = 847;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 848;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _list2keyvalues(anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 604;BA.debugLine="Sub List2KeyValues(lst As List, mapvalues As List)";
 //BA.debugLineNum = 605;BA.debugLine="Return List2IDValue(lst, mapvalues)";
if (true) return _list2idvalue(_lst,_mapvalues);
 //BA.debugLineNum = 606;BA.debugLine="End Sub";
return null;
}
public String  _loaddatatable(String _d,boolean _autoconfig,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 1312;BA.debugLine="Sub LoadDataTable(d As String, autoConfig As Boole";
 //BA.debugLineNum = 1313;BA.debugLine="Define(d, CreateMap(\"autoConfig\":autoConfig,\"data";
_define(_d,__c.createMap(new Object[] {(Object)("autoConfig"),(Object)(_autoconfig),(Object)("data"),(Object)(_data.getObject())}));
 //BA.debugLineNum = 1314;BA.debugLine="Refresh(d)";
_refresh(_d);
 //BA.debugLineNum = 1315;BA.debugLine="End Sub";
return "";
}
public Object  _localelongdateformat() throws Exception{
Object _df = null;
 //BA.debugLineNum = 955;BA.debugLine="Sub LocaleLongDateFormat() As Object   'ignore";
 //BA.debugLineNum = 956;BA.debugLine="Dim df As Object = webix.GetField(\"i18n\").GetFiel";
_df = _webix.GetField("i18n").GetField("longDateFormatStr").Result();
 //BA.debugLineNum = 957;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return null;
}
public Object  _localenumberformat(boolean _r) throws Exception{
Object _df = null;
 //BA.debugLineNum = 961;BA.debugLine="Sub LocaleNumberFormat(r As Boolean) As Object   '";
 //BA.debugLineNum = 962;BA.debugLine="Dim df As Object = webix.GetField(\"i18n\").GetFiel";
_df = _webix.GetField("i18n").GetField("numberFormat").Result();
 //BA.debugLineNum = 963;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return null;
}
public Object  _locatedateformat() throws Exception{
Object _df = null;
 //BA.debugLineNum = 949;BA.debugLine="Sub LocateDateFormat() As Object   'ignore";
 //BA.debugLineNum = 950;BA.debugLine="Dim df As Object = webix.GetField(\"i18n\").GetFiel";
_df = _webix.GetField("i18n").GetField("dateFormatStr").Result();
 //BA.debugLineNum = 951;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 952;BA.debugLine="End Sub";
return null;
}
public String  _longdate(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 298;BA.debugLine="Sub LongDate(sDate As String) As String";
 //BA.debugLineNum = 299;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 300;BA.debugLine="Try";
try { //BA.debugLineNum = 301;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 302;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 303;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy");
 //BA.debugLineNum = 304;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 306;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public String  _longdatetime(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 310;BA.debugLine="Sub LongDateTime(sDate As String) As String";
 //BA.debugLineNum = 311;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 312;BA.debugLine="Try";
try { //BA.debugLineNum = 313;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 314;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 315;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy HH:mm\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy HH:mm");
 //BA.debugLineNum = 316;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 318;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return "";
}
public String  _longdatetimetoday() throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 2396;BA.debugLine="Sub LongDateTimeToday() As String";
 //BA.debugLineNum = 2397;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 2398;BA.debugLine="Dim dt As Long = DateTime.now";
_dt = __c.DateTime.getNow();
 //BA.debugLineNum = 2399;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy, HH:mm\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy, HH:mm");
 //BA.debugLineNum = 2400;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 //BA.debugLineNum = 2401;BA.debugLine="End Sub";
return "";
}
public Object  _longpriceformat(boolean _r) throws Exception{
Object _df = null;
 //BA.debugLineNum = 967;BA.debugLine="Sub LongPriceFormat(r As Boolean) As Object   'ign";
 //BA.debugLineNum = 968;BA.debugLine="Dim df As Object = webix.GetField(\"i18n\").GetFiel";
_df = _webix.GetField("i18n").GetField("priceFormat").Result();
 //BA.debugLineNum = 969;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 970;BA.debugLine="End Sub";
return null;
}
public String  _makemoney(String _svalue) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub MakeMoney(sValue As String) As String";
 //BA.debugLineNum = 255;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
if (_svalue.length()==0) { 
if (true) return "0.00";};
 //BA.debugLineNum = 256;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
if ((_svalue).equals("null")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 257;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
_svalue = _svalue.replace(",","");
 //BA.debugLineNum = 258;BA.debugLine="sValue = Val(sValue)";
_svalue = _val(_svalue);
 //BA.debugLineNum = 259;BA.debugLine="If sValue = \"0\" Then sValue = \"000\"";
if ((_svalue).equals("0")) { 
_svalue = "000";};
 //BA.debugLineNum = 260;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(__c.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
 //BA.debugLineNum = 261;BA.debugLine="Return NumberFormat2(sValue, 1, 2, 2, True)";
if (true) return __c.NumberFormat2((double)(Double.parseDouble(_svalue)),(int) (1),(int) (2),(int) (2),__c.True);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 812;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 813;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 814;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 815;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return "";
}
public String  _map2jsonpretty(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 818;BA.debugLine="Sub Map2JsonPretty(mp As Map) As String";
 //BA.debugLineNum = 819;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 820;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 821;BA.debugLine="Return JSON.ToPrettyString(4)";
if (true) return _json.ToPrettyString((int) (4));
 //BA.debugLineNum = 822;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _mapkeys2list(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
 //BA.debugLineNum = 172;BA.debugLine="Sub MapKeys2List(m As Map) As List";
 //BA.debugLineNum = 173;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 174;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 175;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 176;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 178;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapvalues2list(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
 //BA.debugLineNum = 182;BA.debugLine="Sub MapValues2List(m As Map) As List";
 //BA.debugLineNum = 183;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 184;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 185;BA.debugLine="For Each k As String In m.values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 186;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 188;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public String  _mapvalues2lowercase(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
String _prop = "";
String _v = "";
 //BA.debugLineNum = 445;BA.debugLine="Sub MapValues2LowerCase(m As Map, props As List)";
 //BA.debugLineNum = 446;BA.debugLine="For Each prop As String In props";
{
final anywheresoftware.b4a.BA.IterableList group1 = _props;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_prop = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 447;BA.debugLine="If m.ContainsKey(prop) Then";
if (_m.ContainsKey((Object)(_prop))) { 
 //BA.debugLineNum = 448;BA.debugLine="Dim v As String = m.GetDefault(prop,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_prop),(Object)("")));
 //BA.debugLineNum = 449;BA.debugLine="v = v.tolowercase";
_v = _v.toLowerCase();
 //BA.debugLineNum = 450;BA.debugLine="m.Put(prop,v)";
_m.Put((Object)(_prop),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return "";
}
public String  _message(String _msg) throws Exception{
 //BA.debugLineNum = 1700;BA.debugLine="Sub Message(msg As String)";
 //BA.debugLineNum = 1701;BA.debugLine="webix.RunMethod(\"message\", Array(msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg)}));
 //BA.debugLineNum = 1702;BA.debugLine="End Sub";
return "";
}
public String  _message_debug(String _msg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1721;BA.debugLine="Sub Message_Debug(Msg As String)";
 //BA.debugLineNum = 1722;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1723;BA.debugLine="opt.Put(\"text\", Msg)";
_opt.Put((Object)("text"),(Object)(_msg));
 //BA.debugLineNum = 1724;BA.debugLine="opt.Put(\"type\", \"debug\")";
_opt.Put((Object)("type"),(Object)("debug"));
 //BA.debugLineNum = 1725;BA.debugLine="webix.RunMethod(\"message\", Array(opt))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_opt.getObject())}));
 //BA.debugLineNum = 1726;BA.debugLine="End Sub";
return "";
}
public String  _message_error(String _msg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1705;BA.debugLine="Sub Message_Error(msg As String)";
 //BA.debugLineNum = 1706;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1707;BA.debugLine="opt.Put(\"text\", msg)";
_opt.Put((Object)("text"),(Object)(_msg));
 //BA.debugLineNum = 1708;BA.debugLine="opt.Put(\"type\", \"error\")";
_opt.Put((Object)("type"),(Object)("error"));
 //BA.debugLineNum = 1709;BA.debugLine="webix.RunMethod(\"message\", Array(opt))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_opt.getObject())}));
 //BA.debugLineNum = 1710;BA.debugLine="End Sub";
return "";
}
public String  _message_success(String _msg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1713;BA.debugLine="Sub Message_Success(msg As String)";
 //BA.debugLineNum = 1714;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1715;BA.debugLine="opt.Put(\"text\", msg)";
_opt.Put((Object)("text"),(Object)(_msg));
 //BA.debugLineNum = 1716;BA.debugLine="opt.Put(\"type\", \"success\")";
_opt.Put((Object)("type"),(Object)("success"));
 //BA.debugLineNum = 1717;BA.debugLine="webix.RunMethod(\"message\", Array(opt))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_opt.getObject())}));
 //BA.debugLineNum = 1718;BA.debugLine="End Sub";
return "";
}
public String  _midstring(String _text,int _start,int _llength) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub MidString(Text As String, Start As Int, lLengt";
 //BA.debugLineNum = 277;BA.debugLine="Return Text.SubString2(Start-1,Start+lLength-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_llength-1));
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public String  _midstring2(String _text,int _start) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub MidString2(Text As String, Start As Int) As St";
 //BA.debugLineNum = 281;BA.debugLine="Return Text.SubString(Start-1)";
if (true) return _text.substring((int) (_start-1));
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public String  _modalbox(anywheresoftware.b4a.objects.collections.Map _msg) throws Exception{
 //BA.debugLineNum = 1739;BA.debugLine="Sub ModalBox(Msg As Map)";
 //BA.debugLineNum = 1740;BA.debugLine="webix.RunMethod(\"modalbox\", Array(Msg))";
_webix.RunMethod("modalbox",(Object)(new Object[]{(Object)(_msg.getObject())}));
 //BA.debugLineNum = 1741;BA.debugLine="End Sub";
return "";
}
public String  _move(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 1487;BA.debugLine="Sub Move(dtID As String, r As Int)";
 //BA.debugLineNum = 1488;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 1489;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"move\", Array(r))";
_dollar.Selector((Object)(_dtid)).RunMethod("move",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 1490;BA.debugLine="End Sub";
return "";
}
public String  _movebottom(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 1475;BA.debugLine="Sub MoveBottom(dtID As String, r As Int)";
 //BA.debugLineNum = 1476;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 1477;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"moveBottom\", Arr";
_dollar.Selector((Object)(_dtid)).RunMethod("moveBottom",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 1478;BA.debugLine="End Sub";
return "";
}
public String  _movetop(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 1481;BA.debugLine="Sub MoveTop(dtID As String, r As Int)";
 //BA.debugLineNum = 1482;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 1483;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"moveTop\", Array(";
_dollar.Selector((Object)(_dtid)).RunMethod("moveTop",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 1484;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _msgbox(String _msgid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixmessagebox _msg = null;
 //BA.debugLineNum = 711;BA.debugLine="Sub MsgBox(msgid As String) As WixMessageBox";
 //BA.debugLineNum = 712;BA.debugLine="msgid = msgid.tolowercase";
_msgid = _msgid.toLowerCase();
 //BA.debugLineNum = 713;BA.debugLine="Dim msg As WixMessageBox";
_msg = new b4j.Mashy.BANanoWebixDemo.wixmessagebox();
 //BA.debugLineNum = 714;BA.debugLine="msg.Initialize(msgid)";
_msg._initialize /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ (ba,_msgid);
 //BA.debugLineNum = 715;BA.debugLine="Return msg";
if (true) return _msg;
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return null;
}
public int  _mvcount(String _strmv,String _delimiter) throws Exception{
String[] _spvalues = null;
 //BA.debugLineNum = 775;BA.debugLine="Sub MvCount(strMV As String, Delimiter As String)";
 //BA.debugLineNum = 776;BA.debugLine="Dim spValues() As String = BANano.Split(Delimiter";
_spvalues = _banano.Split(_delimiter,_strmv);
 //BA.debugLineNum = 777;BA.debugLine="Return spValues.Length";
if (true) return _spvalues.length;
 //BA.debugLineNum = 778;BA.debugLine="End Sub";
return 0;
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
int _xpos = 0;
String[] _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 728;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
 //BA.debugLineNum = 729;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 730;BA.debugLine="Dim xPos As Int";
_xpos = 0;
 //BA.debugLineNum = 731;BA.debugLine="xPos = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
 //BA.debugLineNum = 732;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
 //BA.debugLineNum = 733;BA.debugLine="Dim mValues() As String";
_mvalues = new String[(int) (0)];
java.util.Arrays.fill(_mvalues,"");
 //BA.debugLineNum = 734;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 735;BA.debugLine="If sValue.EndsWith(Delimiter) Then sValue = sValu";
if (_svalue.endsWith(_delimiter)) { 
_svalue = _svalue+" ";};
 //BA.debugLineNum = 736;BA.debugLine="mValues = BANano.Split(Delimiter, sValue)";
_mvalues = _banano.Split(_delimiter,_svalue);
 //BA.debugLineNum = 737;BA.debugLine="tValues = mValues.Length -1";
_tvalues = (int) (_mvalues.length-1);
 //BA.debugLineNum = 738;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
 //BA.debugLineNum = 740;BA.debugLine="Return mValues(tValues)";
if (true) return _mvalues[_tvalues];
 break; }
case 1: {
 //BA.debugLineNum = 742;BA.debugLine="Return mValues(tValues - 1)";
if (true) return _mvalues[(int) (_tvalues-1)];
 break; }
case 2: {
 //BA.debugLineNum = 744;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 745;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 746;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 747;BA.debugLine="For startcnt = 1 To tValues";
{
final int step19 = 1;
final int limit19 = _tvalues;
_startcnt = (int) (1) ;
for (;_startcnt <= limit19 ;_startcnt = _startcnt + step19 ) {
 //BA.debugLineNum = 748;BA.debugLine="sb.Append(mValues(startcnt)).append(Delimiter)";
_sb.Append(_mvalues[_startcnt]).Append(_delimiter);
 }
};
 //BA.debugLineNum = 750;BA.debugLine="sb.Remove(sb.Length-Delimiter.Length,sb.Length)";
_sb.Remove((int) (_sb.getLength()-_delimiter.length()),_sb.getLength());
 //BA.debugLineNum = 751;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
 //BA.debugLineNum = 753;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
 //BA.debugLineNum = 754;BA.debugLine="If iPosition <= -1 Then Return mValues(tValues)";
if (_iposition<=-1) { 
if (true) return _mvalues[_tvalues];};
 //BA.debugLineNum = 755;BA.debugLine="If iPosition > tValues Then Return \"\"";
if (_iposition>_tvalues) { 
if (true) return "";};
 //BA.debugLineNum = 756;BA.debugLine="Return mValues(iPosition)";
if (true) return _mvalues[_iposition];
 break; }
}
;
 //BA.debugLineNum = 758;BA.debugLine="End Sub";
return "";
}
public String  _numbersuffix(double _n) throws Exception{
String[] _suffix = null;
int _thousands = 0;
int _maxdecimalplaces = 0;
double _relativeerror = 0;
 //BA.debugLineNum = 455;BA.debugLine="Sub NumberSuffix(N As Double) As String";
 //BA.debugLineNum = 456;BA.debugLine="If N < 0 Then";
if (_n<0) { 
 //BA.debugLineNum = 457;BA.debugLine="Return \"-\" & NumberSuffix(-N)";
if (true) return "-"+_numbersuffix(-_n);
 };
 //BA.debugLineNum = 459;BA.debugLine="Dim Suffix() As String = Array As String(\"\", \"k\",";
_suffix = new String[]{"","k","M","B","T"};
 //BA.debugLineNum = 460;BA.debugLine="Dim Thousands As Int = 0";
_thousands = (int) (0);
 //BA.debugLineNum = 461;BA.debugLine="Do While N >= 1000 And Thousands < Suffix.Length";
while (_n>=1000 && _thousands<_suffix.length-1) {
 //BA.debugLineNum = 462;BA.debugLine="Thousands = Thousands + 1";
_thousands = (int) (_thousands+1);
 //BA.debugLineNum = 463;BA.debugLine="N = N / 1000";
_n = _n/(double)1000;
 }
;
 //BA.debugLineNum = 465;BA.debugLine="If Thousands = 0 Then";
if (_thousands==0) { 
 //BA.debugLineNum = 466;BA.debugLine="Return NumberFormat2(N, 1, 2, 2, False)";
if (true) return __c.NumberFormat2(_n,(int) (1),(int) (2),(int) (2),__c.False);
 };
 //BA.debugLineNum = 469;BA.debugLine="Dim MaxDecimalPlaces As Int = 0";
_maxdecimalplaces = (int) (0);
 //BA.debugLineNum = 470;BA.debugLine="Do While MaxDecimalPlaces < 5";
while (_maxdecimalplaces<5) {
 //BA.debugLineNum = 471;BA.debugLine="Dim RelativeError As Double = Abs(N - Round2(N,";
_relativeerror = __c.Abs(_n-__c.Round2(_n,_maxdecimalplaces))/(double)_n;
 //BA.debugLineNum = 472;BA.debugLine="If RelativeError < 0.007 Then";
if (_relativeerror<0.007) { 
 //BA.debugLineNum = 473;BA.debugLine="Exit";
if (true) break;
 };
 //BA.debugLineNum = 475;BA.debugLine="MaxDecimalPlaces = MaxDecimalPlaces + 1";
_maxdecimalplaces = (int) (_maxdecimalplaces+1);
 }
;
 //BA.debugLineNum = 477;BA.debugLine="Return NumberFormat2(N, 1, 0, MaxDecimalPlaces, F";
if (true) return __c.NumberFormat2(_n,(int) (1),(int) (0),_maxdecimalplaces,__c.False)+_suffix[_thousands];
 //BA.debugLineNum = 478;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _objectasarray(anywheresoftware.b4a.objects.collections.Map _inobject) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
String _skey = "";
Object _sval = null;
 //BA.debugLineNum = 888;BA.debugLine="Sub objectAsArray(inObject As Map) As List";
 //BA.debugLineNum = 889;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 890;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 891;BA.debugLine="For Each skey As String In inObject.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _inobject.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_skey = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 892;BA.debugLine="Dim sval As Object = inObject.Get(skey)";
_sval = _inobject.Get((Object)(_skey));
 //BA.debugLineNum = 893;BA.debugLine="lst.Add(sval)";
_lst.Add(_sval);
 }
};
 //BA.debugLineNum = 895;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 896;BA.debugLine="End Sub";
return null;
}
public String  _onaftereditstart(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1883;BA.debugLine="Sub OnAfterEditStart(eID As String, cb As BANanoOb";
 //BA.debugLineNum = 1884;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1885;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterEditStart"),(Object)(_cb)}));
 //BA.debugLineNum = 1886;BA.debugLine="End Sub";
return "";
}
public String  _onaftereditstop(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1888;BA.debugLine="Sub OnAfterEditStop(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 1889;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1890;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterEditStop"),(Object)(_cb)}));
 //BA.debugLineNum = 1891;BA.debugLine="End Sub";
return "";
}
public String  _onafterfileadd(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1833;BA.debugLine="Sub OnAfterFileAdd(eID As String, cb As BANanoObje";
 //BA.debugLineNum = 1834;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1835;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterFileAdd"),(Object)(_cb)}));
 //BA.debugLineNum = 1836;BA.debugLine="End Sub";
return "";
}
public String  _onafterload(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1349;BA.debugLine="Sub OnAfterLoad(eid As String, cb As BANanoObject)";
 //BA.debugLineNum = 1350;BA.debugLine="eid = eid.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1351;BA.debugLine="Dollar.Selector(eid).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterLoad"),(Object)(_cb)}));
 //BA.debugLineNum = 1352;BA.debugLine="End Sub";
return "";
}
public String  _onafterselect(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1868;BA.debugLine="Sub OnAfterSelect(eID As String, cb As BANanoObjec";
 //BA.debugLineNum = 1869;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1870;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterSelect"),(Object)(_cb)}));
 //BA.debugLineNum = 1871;BA.debugLine="End Sub";
return "";
}
public String  _onaftertabclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1404;BA.debugLine="Sub OnAfterTabClick(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 1405;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1406;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterTabClick"),(Object)(_cb)}));
 //BA.debugLineNum = 1407;BA.debugLine="End Sub";
return "";
}
public String  _onafterunselect(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1906;BA.debugLine="Sub OnAfterUnSelect(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 1907;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1908;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterUnSelect"),(Object)(_cb)}));
 //BA.debugLineNum = 1909;BA.debugLine="End Sub";
return "";
}
public String  _onbeforedrop(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1339;BA.debugLine="Sub onBeforeDrop(eid As String, cb As BANanoObject";
 //BA.debugLineNum = 1340;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1341;BA.debugLine="Dollar.Selector(eid).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onBeforeDrop"),(Object)(_cb)}));
 //BA.debugLineNum = 1342;BA.debugLine="End Sub";
return "";
}
public String  _onbeforefileadd(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1839;BA.debugLine="Sub OnBeforeFileAdd(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 1840;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1841;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onBeforeFileAdd"),(Object)(_cb)}));
 //BA.debugLineNum = 1842;BA.debugLine="End Sub";
return "";
}
public String  _onbeforeload(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1344;BA.debugLine="Sub OnBeforeLoad(eid As String, cb As BANanoObject";
 //BA.debugLineNum = 1345;BA.debugLine="eid = eid.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1346;BA.debugLine="Dollar.Selector(eid).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onBeforeLoad"),(Object)(_cb)}));
 //BA.debugLineNum = 1347;BA.debugLine="End Sub";
return "";
}
public String  _onchange(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1380;BA.debugLine="Sub OnChange(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 1381;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1382;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onChange"),(Object)(_cb)}));
 //BA.debugLineNum = 1383;BA.debugLine="End Sub";
return "";
}
public String  _oncheck(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1410;BA.debugLine="Sub OnCheck(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 1411;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1412;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onCheck"),(Object)(_cb)}));
 //BA.debugLineNum = 1413;BA.debugLine="End Sub";
return "";
}
public String  _onclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1894;BA.debugLine="Sub OnClick(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 1895;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1896;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onClick"),(Object)(_cb)}));
 //BA.debugLineNum = 1897;BA.debugLine="End Sub";
return "";
}
public String  _onenter(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1386;BA.debugLine="Sub OnEnter(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 1387;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1388;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onEnter"),(Object)(_cb)}));
 //BA.debugLineNum = 1389;BA.debugLine="End Sub";
return "";
}
public String  _onfileupload(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1862;BA.debugLine="Sub onFileUpload(eID As String, cb As BANanoObject";
 //BA.debugLineNum = 1863;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1864;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onFileUpload"),(Object)(_cb)}));
 //BA.debugLineNum = 1865;BA.debugLine="End Sub";
return "";
}
public String  _onfileuploaderror(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1850;BA.debugLine="Sub onFileUploadError(eID As String, cb As BANanoO";
 //BA.debugLineNum = 1851;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1852;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onFileUploadError"),(Object)(_cb)}));
 //BA.debugLineNum = 1853;BA.debugLine="End Sub";
return "";
}
public String  _onitemclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1873;BA.debugLine="Sub OnItemClick(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 1874;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1875;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onItemClick"),(Object)(_cb)}));
 //BA.debugLineNum = 1876;BA.debugLine="End Sub";
return "";
}
public String  _onitemclickbo(com.ab.banano.BANanoObject _bo,Object _module,String _methodname,anywheresoftware.b4a.objects.collections.List _params) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1878;BA.debugLine="Sub OnItemClickBO(bo As BANanoObject, module As Ob";
 //BA.debugLineNum = 1879;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(_module,_methodname,_params));
 //BA.debugLineNum = 1880;BA.debugLine="bo.RunMethod(\"attachEvent\",Array(\"onItemClick\",cb";
_bo.RunMethod("attachEvent",(Object)(new Object[]{(Object)("onItemClick"),(Object)(_cb)}));
 //BA.debugLineNum = 1881;BA.debugLine="End Sub";
return "";
}
public String  _onitemdblclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1323;BA.debugLine="Sub OnItemDblClick(eid As String, cb As BANanoObje";
 //BA.debugLineNum = 1324;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1325;BA.debugLine="Dollar.Selector(eid).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onItemDblClick"),(Object)(_cb)}));
 //BA.debugLineNum = 1326;BA.debugLine="End Sub";
return "";
}
public String  _onitemdblclickbo(com.ab.banano.BANanoObject _bo,Object _module,String _methodname,anywheresoftware.b4a.objects.collections.List _params) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1329;BA.debugLine="Sub OnItemDblClickBO(bo As BANanoObject, module As";
 //BA.debugLineNum = 1330;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(_module,_methodname,_params));
 //BA.debugLineNum = 1331;BA.debugLine="bo.RunMethod(\"attachEvent\",Array(\"onItemDblClick\"";
_bo.RunMethod("attachEvent",(Object)(new Object[]{(Object)("onItemDblClick"),(Object)(_cb)}));
 //BA.debugLineNum = 1332;BA.debugLine="End Sub";
return "";
}
public String  _onkeypress(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1334;BA.debugLine="Sub OnKeyPress(eid As String, cb As BANanoObject)";
 //BA.debugLineNum = 1335;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1336;BA.debugLine="Dollar.Selector(eid).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onKeyPress"),(Object)(_cb)}));
 //BA.debugLineNum = 1337;BA.debugLine="End Sub";
return "";
}
public String  _onliveedit(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1392;BA.debugLine="Sub OnLiveEdit(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 1393;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1394;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onLiveEdit"),(Object)(_cb)}));
 //BA.debugLineNum = 1395;BA.debugLine="End Sub";
return "";
}
public String  _onmenuitemclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1899;BA.debugLine="Sub OnMenuItemClick(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 1900;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1901;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onMenuItemClick"),(Object)(_cb)}));
 //BA.debugLineNum = 1902;BA.debugLine="End Sub";
return "";
}
public String  _onselectchange(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1417;BA.debugLine="Sub OnSelectChange(eID As String, cb As BANanoObje";
 //BA.debugLineNum = 1418;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1419;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onSelectChange"),(Object)(_cb)}));
 //BA.debugLineNum = 1420;BA.debugLine="End Sub";
return "";
}
public String  _ontimedkeypress(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1398;BA.debugLine="Sub OnTimedKeyPress(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 1399;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1400;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onTimedKeyPress"),(Object)(_cb)}));
 //BA.debugLineNum = 1401;BA.debugLine="End Sub";
return "";
}
public String  _onuploadcomplete(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 1845;BA.debugLine="Sub OnUploadComplete(eID As String, cb As BANanoOb";
 //BA.debugLineNum = 1846;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1847;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onUploadComplete"),(Object)(_cb)}));
 //BA.debugLineNum = 1848;BA.debugLine="End Sub";
return "";
}
public String  _open(String _treeid,String _nodeid) throws Exception{
 //BA.debugLineNum = 1216;BA.debugLine="Sub Open(treeID As String, nodeID As String)";
 //BA.debugLineNum = 1217;BA.debugLine="treeID = treeID.tolowercase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 1218;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 1219;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"open\", Array(n";
_dollar.Selector((Object)(_treeid)).RunMethod("open",(Object)(new Object[]{(Object)(_nodeid),(Object)(__c.True)}));
 //BA.debugLineNum = 1220;BA.debugLine="End Sub";
return "";
}
public String  _openall(String _treeid) throws Exception{
 //BA.debugLineNum = 1238;BA.debugLine="Sub OpenAll(treeID As String)";
 //BA.debugLineNum = 1239;BA.debugLine="treeID = treeID.tolowercase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 1240;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"openAll\", Null";
_dollar.Selector((Object)(_treeid)).RunMethod("openAll",__c.Null);
 //BA.debugLineNum = 1241;BA.debugLine="End Sub";
return "";
}
public String  _pad(String _value,int _maxlen,String _padchar,boolean _right) throws Exception{
int _intordnolen = 0;
int _i = 0;
 //BA.debugLineNum = 2341;BA.debugLine="Sub Pad(Value As String, MaxLen As Int, PadChar As";
 //BA.debugLineNum = 2342;BA.debugLine="Dim  intOrdNoLen As Int = Value.Length";
_intordnolen = _value.length();
 //BA.debugLineNum = 2343;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2344;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step3 = 1;
final int limit3 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 2345;BA.debugLine="If right Then";
if (_right) { 
 //BA.debugLineNum = 2346;BA.debugLine="Value =  Value & PadChar";
_value = _value+_padchar;
 }else {
 //BA.debugLineNum = 2348;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 };
 }
};
 //BA.debugLineNum = 2351;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 2352;BA.debugLine="End Sub";
return "";
}
public String  _padright(String _value,int _maxlen,String _padchar) throws Exception{
int _intordnolen = 0;
int _i = 0;
 //BA.debugLineNum = 427;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
 //BA.debugLineNum = 428;BA.debugLine="Dim intOrdNoLen As Int = Len(Value)";
_intordnolen = _len(_value);
 //BA.debugLineNum = 429;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 430;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step3 = 1;
final int limit3 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 431;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 }
};
 //BA.debugLineNum = 433;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return "";
}
public String  _parse(String _eid,anywheresoftware.b4a.objects.collections.List _data,String _typeof) throws Exception{
 //BA.debugLineNum = 2101;BA.debugLine="Sub Parse(eID As String, data As List, typeOf As S";
 //BA.debugLineNum = 2102;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2103;BA.debugLine="Dollar.Selector(eID).RunMethod(\"parse\",Array(data";
_dollar.Selector((Object)(_eid)).RunMethod("parse",(Object)(new Object[]{(Object)(_data.getObject()),(Object)(_typeof)}));
 //BA.debugLineNum = 2104;BA.debugLine="End Sub";
return "";
}
public String  _percentage(String _svalue) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub Percentage(sValue As String) As String";
 //BA.debugLineNum = 265;BA.debugLine="If sValue = \"\" Then sValue = \"0.00\"";
if ((_svalue).equals("")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 266;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
if (_svalue.length()==0) { 
if (true) return "0.00";};
 //BA.debugLineNum = 267;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
if ((_svalue).equals("null")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 268;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
_svalue = _svalue.replace(",","");
 //BA.debugLineNum = 269;BA.debugLine="sValue = Val(sValue)";
_svalue = _val(_svalue);
 //BA.debugLineNum = 270;BA.debugLine="If sValue = \"0\" Then sValue = \"0.00\"";
if ((_svalue).equals("0")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 271;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(__c.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
 //BA.debugLineNum = 272;BA.debugLine="sValue = sValue & \"%\"";
_svalue = _svalue+"%";
 //BA.debugLineNum = 273;BA.debugLine="Return sValue";
if (true) return _svalue;
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public String  _pivottablecloseall(String _pivotname) throws Exception{
com.ab.banano.BANanoObject _pvt = null;
 //BA.debugLineNum = 101;BA.debugLine="Sub PivotTableCloseAll(pivotName As String)";
 //BA.debugLineNum = 102;BA.debugLine="Dim pvt As BANanoObject = GetPivotDataTable(pivot";
_pvt = _getpivotdatatable(_pivotname);
 //BA.debugLineNum = 103;BA.debugLine="pvt.RunMethod(\"closeAll\", Null)";
_pvt.RunMethod("closeAll",__c.Null);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _print(String _eid,b4j.Mashy.BANanoWebixDemo.wixprint _options) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 1372;BA.debugLine="Sub Print(eid As String, options As WixPrint)";
 //BA.debugLineNum = 1373;BA.debugLine="eid = eid.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1374;BA.debugLine="Dim bo As BANanoObject = Dollar.Selector(eid)";
_bo = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 1375;BA.debugLine="webix.RunMethod(\"print\", Array(bo, options.Item))";
_webix.RunMethod("print",(Object)(new Object[]{(Object)(_bo),(Object)(_options._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject())}));
 //BA.debugLineNum = 1376;BA.debugLine="End Sub";
return "";
}
public String  _priorityrag(int _dvalue) throws Exception{
 //BA.debugLineNum = 2451;BA.debugLine="Public Sub PriorityRAG(dValue As Int) As String";
 //BA.debugLineNum = 2452;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2454;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
 //BA.debugLineNum = 2456;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 2458;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
 //BA.debugLineNum = 2460;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 2462;BA.debugLine="End Sub";
return "";
}
public String  _progressrag(double _dvariance) throws Exception{
 //BA.debugLineNum = 2414;BA.debugLine="Public Sub ProgressRAG(dVariance As Double) As Str";
 //BA.debugLineNum = 2415;BA.debugLine="If dVariance < 0 Then";
if (_dvariance<0) { 
 //BA.debugLineNum = 2416;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvariance>0) { 
 //BA.debugLineNum = 2418;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance==0) { 
 //BA.debugLineNum = 2420;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
 //BA.debugLineNum = 2422;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 2424;BA.debugLine="End Sub";
return "";
}
public int  _progressstatus(int _dvalue) throws Exception{
 //BA.debugLineNum = 2547;BA.debugLine="Public Sub ProgressStatus(dValue As Int) As Int";
 //BA.debugLineNum = 2548;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
 //BA.debugLineNum = 2550;BA.debugLine="Return 1";
if (true) return (int) (1);
 break; }
default: {
 //BA.debugLineNum = 2552;BA.debugLine="Return 0";
if (true) return (int) (0);
 break; }
}
;
 //BA.debugLineNum = 2554;BA.debugLine="End Sub";
return 0;
}
public String  _projectdate(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 387;BA.debugLine="Sub ProjectDate(sDate As String) As String";
 //BA.debugLineNum = 388;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 389;BA.debugLine="Try";
try { //BA.debugLineNum = 390;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 391;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 392;BA.debugLine="DateTime.DateFormat = \"dd-MMM-yyyy, EEE\"";
__c.DateTime.setDateFormat("dd-MMM-yyyy, EEE");
 //BA.debugLineNum = 393;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 395;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return "";
}
public String  _projectdays(String _sdays) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub ProjectDays(sDays As String) As String";
 //BA.debugLineNum = 376;BA.debugLine="Try";
try { //BA.debugLineNum = 377;BA.debugLine="sDays = sDays.trim";
_sdays = _sdays.trim();
 //BA.debugLineNum = 378;BA.debugLine="If sDays = \"\" Then sDays = \"0\"";
if ((_sdays).equals("")) { 
_sdays = "0";};
 //BA.debugLineNum = 379;BA.debugLine="sDays = sDays.Replace(\",\",\"\")";
_sdays = _sdays.replace(",","");
 //BA.debugLineNum = 380;BA.debugLine="sDays = NumberFormat2(sDays,0,0,0,True)";
_sdays = __c.NumberFormat2((double)(Double.parseDouble(_sdays)),(int) (0),(int) (0),(int) (0),__c.True);
 //BA.debugLineNum = 381;BA.debugLine="Return sDays & \" Dys\"";
if (true) return _sdays+" Dys";
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 383;BA.debugLine="Return \"0 Dys\"";
if (true) return "0 Dys";
 };
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return "";
}
public String  _propercase(String _mystr) throws Exception{
String _x = "";
int _j = 0;
int _k = 0;
 //BA.debugLineNum = 342;BA.debugLine="Sub ProperCase(myStr As String) As String";
 //BA.debugLineNum = 343;BA.debugLine="Try";
try { //BA.debugLineNum = 344;BA.debugLine="If myStr.trim.length = 0 Then Return \"\"";
if (_mystr.trim().length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 345;BA.debugLine="Dim x As String";
_x = "";
 //BA.debugLineNum = 346;BA.debugLine="Dim j, k As Int";
_j = 0;
_k = 0;
 //BA.debugLineNum = 347;BA.debugLine="myStr = myStr.tolowercase";
_mystr = _mystr.toLowerCase();
 //BA.debugLineNum = 348;BA.debugLine="x = myStr.ToUpperCase.CharAt(0)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (0)));
 //BA.debugLineNum = 349;BA.debugLine="myStr = x & myStr.SubString2(1, myStr.Length)";
_mystr = _x+_mystr.substring((int) (1),_mystr.length());
 //BA.debugLineNum = 350;BA.debugLine="For j = 1 To myStr.Length";
{
final int step8 = 1;
final int limit8 = _mystr.length();
_j = (int) (1) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
 //BA.debugLineNum = 351;BA.debugLine="k = myStr.IndexOf2(\" \", j + 1)";
_k = _mystr.indexOf(" ",(int) (_j+1));
 //BA.debugLineNum = 352;BA.debugLine="If k = -1 Then Exit";
if (_k==-1) { 
if (true) break;};
 //BA.debugLineNum = 353;BA.debugLine="x = myStr.ToUpperCase.CharAt(k + 1)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (_k+1)));
 //BA.debugLineNum = 354;BA.debugLine="myStr = myStr.SubString2(0, k + 1) & x & myStr.";
_mystr = _mystr.substring((int) (0),(int) (_k+1))+_x+_mystr.substring((int) (_k+2),_mystr.length());
 }
};
 //BA.debugLineNum = 356;BA.debugLine="Return myStr";
if (true) return _mystr;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 358;BA.debugLine="Return myStr";
if (true) return _mystr;
 };
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public String  _rag(int _dvalue) throws Exception{
 //BA.debugLineNum = 2464;BA.debugLine="Public Sub RAG(dValue As Int) As String";
 //BA.debugLineNum = 2465;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2467;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 2469;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 2471;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 2473;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 2475;BA.debugLine="End Sub";
return "";
}
public String  _refresh(String _eid) throws Exception{
 //BA.debugLineNum = 1451;BA.debugLine="Sub Refresh(eID As String)";
 //BA.debugLineNum = 1452;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1453;BA.debugLine="Dollar.Selector(eID).RunMethod(\"refresh\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("refresh",__c.Null);
 //BA.debugLineNum = 1454;BA.debugLine="End Sub";
return "";
}
public String  _refreshcolumns(String _nodeid) throws Exception{
 //BA.debugLineNum = 1277;BA.debugLine="Sub RefreshColumns(nodeID As String)";
 //BA.debugLineNum = 1278;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 1279;BA.debugLine="Dollar.Selector(nodeID).RunMethod(\"refreshColumns";
_dollar.Selector((Object)(_nodeid)).RunMethod("refreshColumns",__c.Null);
 //BA.debugLineNum = 1280;BA.debugLine="End Sub";
return "";
}
public String  _registertypepopup(String _eid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _p = null;
 //BA.debugLineNum = 1151;BA.debugLine="Sub RegisterTypePopUp(eID As String)";
 //BA.debugLineNum = 1152;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1153;BA.debugLine="Dim p As Map = CreateMap()";
_p = new anywheresoftware.b4a.objects.collections.Map();
_p = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1154;BA.debugLine="p.Put(\"editor\", \"popup\")";
_p.Put((Object)("editor"),(Object)("popup"));
 //BA.debugLineNum = 1155;BA.debugLine="Dollar.Selector(eID).RunMethod(\"registerType\",Arr";
_dollar.Selector((Object)(_eid)).RunMethod("registerType",(Object)(new Object[]{(Object)("popup"),(Object)(_p.getObject())}));
 //BA.debugLineNum = 1156;BA.debugLine="End Sub";
return "";
}
public String  _remdelim(String _svalue,String _delim) throws Exception{
boolean _sw = false;
int _ldelim = 0;
String _nvalue = "";
 //BA.debugLineNum = 646;BA.debugLine="Sub RemDelim(sValue As String, Delim As String) As";
 //BA.debugLineNum = 647;BA.debugLine="Dim sw As Boolean = sValue.EndsWith(Delim)";
_sw = _svalue.endsWith(_delim);
 //BA.debugLineNum = 648;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 649;BA.debugLine="Dim lDelim As Int = Delim.Length";
_ldelim = _delim.length();
 //BA.debugLineNum = 650;BA.debugLine="Dim nValue As String = sValue";
_nvalue = _svalue;
 //BA.debugLineNum = 651;BA.debugLine="sw = nValue.EndsWith(Delim)";
_sw = _nvalue.endsWith(_delim);
 //BA.debugLineNum = 652;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 653;BA.debugLine="nValue = nValue.SubString2(0, nValue.Length-lDe";
_nvalue = _nvalue.substring((int) (0),(int) (_nvalue.length()-_ldelim));
 };
 //BA.debugLineNum = 655;BA.debugLine="Return nValue";
if (true) return _nvalue;
 }else {
 //BA.debugLineNum = 657;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return "";
}
public String  _remove(String _listid,String _recid) throws Exception{
 //BA.debugLineNum = 1920;BA.debugLine="Sub Remove(listID As String, recID As String)";
 //BA.debugLineNum = 1921;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1922;BA.debugLine="If recID = \"\" Then Return";
if ((_recid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1923;BA.debugLine="Dollar.Selector(listID).RunMethod(\"remove\",Array(";
_dollar.Selector((Object)(_listid)).RunMethod("remove",(Object)(new Object[]{(Object)(_recid)}));
 //BA.debugLineNum = 1924;BA.debugLine="End Sub";
return "";
}
public String  _removeview(String _parentid,String _childid) throws Exception{
 //BA.debugLineNum = 2051;BA.debugLine="Sub RemoveView(parentid As String, childid As Stri";
 //BA.debugLineNum = 2052;BA.debugLine="parentid = parentid.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 2053;BA.debugLine="childid = childid.tolowercase";
_childid = _childid.toLowerCase();
 //BA.debugLineNum = 2054;BA.debugLine="Dollar.Selector(parentid).RunMethod(\"removeView\",";
_dollar.Selector((Object)(_parentid)).RunMethod("removeView",(Object)(new Object[]{(Object)(_childid)}));
 //BA.debugLineNum = 2055;BA.debugLine="End Sub";
return "";
}
public String  _replacestring(String _text,String _sfind,String _sreplacewith) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub ReplaceString(Text As String, sFind As String,";
 //BA.debugLineNum = 295;BA.debugLine="Return Text.Replace(sFind, sReplaceWith)";
if (true) return _text.replace(_sfind,_sreplacewith);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public String  _replaceview(anywheresoftware.b4a.objects.collections.Map _config,String _parentid,String _childid) throws Exception{
com.ab.banano.BANanoObject _parent = null;
com.ab.banano.BANanoObject _child = null;
 //BA.debugLineNum = 1457;BA.debugLine="Sub ReplaceView(config As Map, parentid As String,";
 //BA.debugLineNum = 1458;BA.debugLine="parentid = parentid.ToLowerCase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 1459;BA.debugLine="childid = childid.tolowercase";
_childid = _childid.toLowerCase();
 //BA.debugLineNum = 1461;BA.debugLine="Dim parent As BANanoObject = Dollar.Selector(pare";
_parent = _dollar.Selector((Object)(_parentid));
 //BA.debugLineNum = 1463;BA.debugLine="Dim child As BANanoObject = Dollar.Selector(child";
_child = _dollar.Selector((Object)(_childid));
 //BA.debugLineNum = 1465;BA.debugLine="webix.RunMethod(\"ui\", Array(config,parent,child))";
_webix.RunMethod("ui",(Object)(new Object[]{(Object)(_config.getObject()),(Object)(_parent),(Object)(_child)}));
 //BA.debugLineNum = 1466;BA.debugLine="End Sub";
return "";
}
public String  _resize(String _eid) throws Exception{
 //BA.debugLineNum = 2071;BA.debugLine="Sub Resize(eID As String)";
 //BA.debugLineNum = 2072;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2073;BA.debugLine="Dollar.Selector(eID).RunMethod(\"resize\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("resize",__c.Null);
 //BA.debugLineNum = 2074;BA.debugLine="End Sub";
return "";
}
public String  _rightstring(String _text,long _llength) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub RightString(Text As String, lLength As Long) A";
 //BA.debugLineNum = 285;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
 //BA.debugLineNum = 286;BA.debugLine="Return Text.SubString(Text.Length-lLength)";
if (true) return _text.substring((int) (_text.length()-_llength));
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return "";
}
public String  _rsaidnumber2dateofbirth(String _rsaid) throws Exception{
String _yymmdd = "";
String _yy = "";
String _mm = "";
String _dd = "";
 //BA.debugLineNum = 193;BA.debugLine="Sub RSAIDNumber2DateOfBirth(rsaID As String) As St";
 //BA.debugLineNum = 195;BA.debugLine="If rsaID.length = 13 Then";
if (_rsaid.length()==13) { 
 //BA.debugLineNum = 196;BA.debugLine="Dim yymmdd As String = LeftString(rsaID, 6)";
_yymmdd = _leftstring(_rsaid,(long) (6));
 //BA.debugLineNum = 197;BA.debugLine="Dim yy As String = LeftString(yymmdd,2)";
_yy = _leftstring(_yymmdd,(long) (2));
 //BA.debugLineNum = 198;BA.debugLine="Dim mm As String = MidString(yymmdd,3,2)";
_mm = _midstring(_yymmdd,(int) (3),(int) (2));
 //BA.debugLineNum = 199;BA.debugLine="Dim dd As String = RightString(yymmdd,2)";
_dd = _rightstring(_yymmdd,(long) (2));
 //BA.debugLineNum = 200;BA.debugLine="yymmdd = $\"19${yy}-${mm}-${dd}\"$";
_yymmdd = ("19"+__c.SmartStringFormatter("",(Object)(_yy))+"-"+__c.SmartStringFormatter("",(Object)(_mm))+"-"+__c.SmartStringFormatter("",(Object)(_dd))+"");
 //BA.debugLineNum = 201;BA.debugLine="Return yymmdd";
if (true) return _yymmdd;
 }else {
 //BA.debugLineNum = 203;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _save(String _frmid) throws Exception{
 //BA.debugLineNum = 2123;BA.debugLine="Sub Save(frmID As String)";
 //BA.debugLineNum = 2124;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 2125;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"save\",Null)";
_dollar.Selector((Object)(_frmid)).RunMethod("save",__c.Null);
 //BA.debugLineNum = 2126;BA.debugLine="End Sub";
return "";
}
public String  _savetext2file(String _content,String _filename) throws Exception{
anywheresoftware.b4a.objects.collections.List _fc = null;
com.ab.banano.BANanoObject _blob = null;
 //BA.debugLineNum = 719;BA.debugLine="Sub SaveText2File(content As String, fileName As S";
 //BA.debugLineNum = 720;BA.debugLine="Dim fc As List";
_fc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 721;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 722;BA.debugLine="fc.Add(content)";
_fc.Add((Object)(_content));
 //BA.debugLineNum = 723;BA.debugLine="Dim blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 724;BA.debugLine="blob.Initialize2(\"Blob\",Array(fc, CreateMap(\"type";
_blob.Initialize2("Blob",(Object)(new Object[]{(Object)(_fc.getObject()),(Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("text/plain;charset=utf-8")}).getObject())}));
 //BA.debugLineNum = 725;BA.debugLine="BANano.RunJavascriptMethod(\"saveAs\",Array(blob,fi";
_banano.RunJavascriptMethod("saveAs",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_blob),(Object)(_filename)}));
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return "";
}
public String  _selectdate(String _eid,String _edate,boolean _bshow) throws Exception{
 //BA.debugLineNum = 1995;BA.debugLine="Sub SelectDate(eid As String, eDate As String, bSh";
 //BA.debugLineNum = 1996;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1997;BA.debugLine="Dollar.Selector(eid).RunMethod(\"selectDate\",Array";
_dollar.Selector((Object)(_eid)).RunMethod("selectDate",(Object)(new Object[]{(Object)(_edate),(Object)(_bshow)}));
 //BA.debugLineNum = 1998;BA.debugLine="End Sub";
return "";
}
public String  _selectitem(String _treeid,String _nodeid) throws Exception{
 //BA.debugLineNum = 1175;BA.debugLine="Sub SelectItem(treeID As String, nodeID As String)";
 //BA.debugLineNum = 1176;BA.debugLine="treeID = treeID.ToLowerCase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 1177;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 1178;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"select\", Array";
_dollar.Selector((Object)(_treeid)).RunMethod("select",(Object)(new Object[]{(Object)(_nodeid)}));
 //BA.debugLineNum = 1179;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _serialize(String _eid) throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 1913;BA.debugLine="Sub Serialize(eID As String) As List";
 //BA.debugLineNum = 1914;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1915;BA.debugLine="Dim res As List = Dollar.Selector(eID).RunMethod(";
_res = new anywheresoftware.b4a.objects.collections.List();
_res.setObject((java.util.List)(_dollar.Selector((Object)(_eid)).RunMethod("serialize",(Object)(new Object[]{(Object)(__c.True)})).Result()));
 //BA.debugLineNum = 1916;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1917;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _setactual(anywheresoftware.b4a.objects.collections.Map _original,anywheresoftware.b4a.objects.collections.Map _actual) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nmap = null;
String _mk = "";
Object _mv = null;
String _ak = "";
 //BA.debugLineNum = 532;BA.debugLine="Sub SetActual(original As Map, actual As Map) As M";
 //BA.debugLineNum = 533;BA.debugLine="Dim nmap As Map = CreateMap()";
_nmap = new anywheresoftware.b4a.objects.collections.Map();
_nmap = __c.createMap(new Object[] {});
 //BA.debugLineNum = 534;BA.debugLine="For Each mk As String In original.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _original.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 535;BA.debugLine="Dim mv As Object = original.Get(mk)";
_mv = _original.Get((Object)(_mk));
 //BA.debugLineNum = 536;BA.debugLine="If actual.ContainsKey(mk) Then";
if (_actual.ContainsKey((Object)(_mk))) { 
 //BA.debugLineNum = 537;BA.debugLine="Dim ak As String = actual.Get(mk)";
_ak = BA.ObjectToString(_actual.Get((Object)(_mk)));
 //BA.debugLineNum = 538;BA.debugLine="nmap.Put(ak,mv)";
_nmap.Put((Object)(_ak),_mv);
 }else {
 //BA.debugLineNum = 540;BA.debugLine="nmap.Put(mk,mv)";
_nmap.Put((Object)(_mk),_mv);
 };
 }
};
 //BA.debugLineNum = 543;BA.debugLine="Return nmap";
if (true) return _nmap;
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setappname(String _aname) throws Exception{
String _extrafolder = "";
 //BA.debugLineNum = 762;BA.debugLine="Sub SetAppName(aName As String) As WixPage";
 //BA.debugLineNum = 763;BA.debugLine="Dim extraFolder As String = $\"http://localhost/${";
_extrafolder = ("http://localhost/"+__c.SmartStringFormatter("",(Object)(_aname))+"/extras");
 //BA.debugLineNum = 764;BA.debugLine="SetExtrasFolder(extraFolder)";
_setextrasfolder(_extrafolder);
 //BA.debugLineNum = 765;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 766;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetAttributes(m As Map) As WixPage";
 //BA.debugLineNum = 28;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 29;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 30;BA.debugLine="Page.SetAttr(k,v)";
_page._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public String  _setbadge(String _eid,Object _badge) throws Exception{
 //BA.debugLineNum = 1258;BA.debugLine="Sub SetBadge(eID As String, badge As Object)";
 //BA.debugLineNum = 1259;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1260;BA.debugLine="Define(eID, CreateMap(\"badge\":badge))";
_define(_eid,__c.createMap(new Object[] {(Object)("badge"),_badge}));
 //BA.debugLineNum = 1261;BA.debugLine="Refresh(eID)";
_refresh(_eid);
 //BA.debugLineNum = 1262;BA.debugLine="End Sub";
return "";
}
public String  _setbody(String _eid,Object _data) throws Exception{
 //BA.debugLineNum = 1251;BA.debugLine="Sub SetBody(eID As String, data As Object)";
 //BA.debugLineNum = 1252;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1253;BA.debugLine="Define(eID, CreateMap(\"body\":data))";
_define(_eid,__c.createMap(new Object[] {(Object)("body"),_data}));
 //BA.debugLineNum = 1254;BA.debugLine="Refresh(eID)";
_refresh(_eid);
 //BA.debugLineNum = 1255;BA.debugLine="End Sub";
return "";
}
public String  _setbottomtext(String _eid,String _etext) throws Exception{
 //BA.debugLineNum = 2036;BA.debugLine="Sub SetBottomText(eID As String, eText As String)";
 //BA.debugLineNum = 2037;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2038;BA.debugLine="Dollar.Selector(eID).RunMethod(\"setBottomText\",Ar";
_dollar.Selector((Object)(_eid)).RunMethod("setBottomText",(Object)(new Object[]{(Object)(_etext)}));
 //BA.debugLineNum = 2039;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setcontainer(String _contid) throws Exception{
String _skey = "";
 //BA.debugLineNum = 1071;BA.debugLine="Sub SetContainer(contID As String) As WixPage";
 //BA.debugLineNum = 1072;BA.debugLine="contID = contID.tolowercase";
_contid = _contid.toLowerCase();
 //BA.debugLineNum = 1073;BA.debugLine="Dim sKey As String = \"#\" & contID";
_skey = "#"+_contid;
 //BA.debugLineNum = 1074;BA.debugLine="Page.SetContainer(contID)";
_page._setcontainer /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_contid);
 //BA.debugLineNum = 1075;BA.debugLine="BANano.GetElement(sKey).empty";
_banano.GetElement(_skey).Empty();
 //BA.debugLineNum = 1076;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1077;BA.debugLine="End Sub";
return null;
}
public String  _setdata(String _eid,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 1245;BA.debugLine="Sub SetData(eID As String, data As List)";
 //BA.debugLineNum = 1246;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1247;BA.debugLine="Define(eID, CreateMap(\"data\":data))";
_define(_eid,__c.createMap(new Object[] {(Object)("data"),(Object)(_data.getObject())}));
 //BA.debugLineNum = 1248;BA.debugLine="Refresh(eID)";
_refresh(_eid);
 //BA.debugLineNum = 1249;BA.debugLine="End Sub";
return "";
}
public String  _setdatacolumn(String _grd,String _colid,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
com.ab.banano.BANanoObject _coldef = null;
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 1135;BA.debugLine="Sub SetDataColumn(grd As String, colid As String,";
 //BA.debugLineNum = 1136;BA.debugLine="grd = grd.ToLowerCase";
_grd = _grd.toLowerCase();
 //BA.debugLineNum = 1137;BA.debugLine="colid = colid.tolowercase";
_colid = _colid.toLowerCase();
 //BA.debugLineNum = 1138;BA.debugLine="Dim colDef As BANanoObject = GetColumnConfig(grd,";
_coldef = _getcolumnconfig(_grd,_colid);
 //BA.debugLineNum = 1139;BA.debugLine="For Each mk As String In props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _props.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mk = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 1140;BA.debugLine="Dim mv As Object = props.Get(mk)";
_mv = _props.Get((Object)(_mk));
 //BA.debugLineNum = 1141;BA.debugLine="colDef.SetField(mk, mv)";
_coldef.SetField(_mk,_mv);
 }
};
 //BA.debugLineNum = 1143;BA.debugLine="End Sub";
return "";
}
public String  _setdatacolumnheadertext(String _grd,String _colid,int _pos,String _text) throws Exception{
com.ab.banano.BANanoObject _bo = null;
anywheresoftware.b4a.objects.collections.List _headers = null;
anywheresoftware.b4a.objects.collections.Map _hdr1 = null;
 //BA.debugLineNum = 1117;BA.debugLine="Sub SetDataColumnHeaderText(grd As String, colid A";
 //BA.debugLineNum = 1119;BA.debugLine="Dim bo As BANanoObject = GetColumnConfig(grd, col";
_bo = _getcolumnconfig(_grd,_colid);
 //BA.debugLineNum = 1120;BA.debugLine="Dim headers As List = bo.GetField(\"header\").Resul";
_headers = new anywheresoftware.b4a.objects.collections.List();
_headers.setObject((java.util.List)(_bo.GetField("header").Result()));
 //BA.debugLineNum = 1121;BA.debugLine="Dim hdr1 As Map = headers.Get(pos)";
_hdr1 = new anywheresoftware.b4a.objects.collections.Map();
_hdr1.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_headers.Get(_pos)));
 //BA.debugLineNum = 1122;BA.debugLine="hdr1.Put(\"text\", text)";
_hdr1.Put((Object)("text"),(Object)(_text));
 //BA.debugLineNum = 1123;BA.debugLine="bo.SetField(\"header\", headers)";
_bo.SetField("header",(Object)(_headers.getObject()));
 //BA.debugLineNum = 1124;BA.debugLine="End Sub";
return "";
}
public String  _setdatacolumnheadertextmulti(String _grd,int _pos,anywheresoftware.b4a.objects.collections.Map _textmap) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1127;BA.debugLine="Sub SetDataColumnHeaderTextMulti(grd As String, po";
 //BA.debugLineNum = 1128;BA.debugLine="For Each k As String In textMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _textmap.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1129;BA.debugLine="Dim v As String = textMap.Get(k)";
_v = BA.ObjectToString(_textmap.Get((Object)(_k)));
 //BA.debugLineNum = 1130;BA.debugLine="SetDataColumnHeaderText(grd, k, pos, v)";
_setdatacolumnheadertext(_grd,_k,_pos,_v);
 }
};
 //BA.debugLineNum = 1132;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setextrasfolder(String _fld) throws Exception{
 //BA.debugLineNum = 924;BA.debugLine="Sub SetExtrasFolder(fld As String) As WixPage";
 //BA.debugLineNum = 926;BA.debugLine="webix.GetField(\"env\").SetField(\"cdn\", fld)";
_webix.GetField("env").SetField("cdn",(Object)(_fld));
 //BA.debugLineNum = 927;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 928;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setgravity(int _g) throws Exception{
 //BA.debugLineNum = 1011;BA.debugLine="Sub SetGravity(g As Int) As WixPage";
 //BA.debugLineNum = 1012;BA.debugLine="Page.SetGravity(g)";
_page._setgravity /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_g);
 //BA.debugLineNum = 1013;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1014;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setheader(String _stitle) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixheader _hdr = null;
 //BA.debugLineNum = 1493;BA.debugLine="Sub SetHeader(sTitle As String) As WixPage";
 //BA.debugLineNum = 1495;BA.debugLine="Dim hdr As WixHeader";
_hdr = new b4j.Mashy.BANanoWebixDemo.wixheader();
 //BA.debugLineNum = 1496;BA.debugLine="hdr.Initialize(\"hdr\")";
_hdr._initialize /*b4j.Mashy.BANanoWebixDemo.wixheader*/ (ba,"hdr");
 //BA.debugLineNum = 1497;BA.debugLine="hdr.Header.SetTemplate(sTitle)";
_hdr._header /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_stitle));
 //BA.debugLineNum = 1498;BA.debugLine="hdr.Header.AddToRows(Page)";
_hdr._header /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._addtorows /*String*/ (_page);
 //BA.debugLineNum = 1499;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1500;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 1053;BA.debugLine="Sub SetHeight(h As Object) As WixPage";
 //BA.debugLineNum = 1054;BA.debugLine="Page.setHeight(h)";
_page._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 1055;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1056;BA.debugLine="End Sub";
return null;
}
public String  _sethint(String _eid,String _shint) throws Exception{
 //BA.debugLineNum = 1318;BA.debugLine="Sub SetHint(eID As String, sHint As String)";
 //BA.debugLineNum = 1319;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1320;BA.debugLine="hints.Put(eID,sHint)";
_hints.Put((Object)(_eid),(Object)(_shint));
 //BA.debugLineNum = 1321;BA.debugLine="End Sub";
return "";
}
public String  _setlabel(String _elid,String _lbl) throws Exception{
 //BA.debugLineNum = 667;BA.debugLine="Sub SetLabel(elid As String, lbl As String)";
 //BA.debugLineNum = 668;BA.debugLine="elid = elid.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 669;BA.debugLine="Define(elid, CreateMap(\"label\":lbl))";
_define(_elid,__c.createMap(new Object[] {(Object)("label"),(Object)(_lbl)}));
 //BA.debugLineNum = 670;BA.debugLine="Refresh(elid)";
_refresh(_elid);
 //BA.debugLineNum = 671;BA.debugLine="End Sub";
return "";
}
public String  _setlabelmulti(anywheresoftware.b4a.objects.collections.Map _kv) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 674;BA.debugLine="Sub SetLabelMulti(kv As Map)";
 //BA.debugLineNum = 675;BA.debugLine="For Each k As String In kv.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _kv.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 676;BA.debugLine="Dim v As String = kv.Get(k)";
_v = BA.ObjectToString(_kv.Get((Object)(_k)));
 //BA.debugLineNum = 677;BA.debugLine="SetLabel(k,v)";
_setlabel(_k,_v);
 }
};
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setlocale(String _locale) throws Exception{
com.ab.banano.BANanoObject _i18n = null;
 //BA.debugLineNum = 931;BA.debugLine="Sub SetLocale(locale As String) As WixPage";
 //BA.debugLineNum = 932;BA.debugLine="Dim i18n As BANanoObject = webix.GetField(\"i18n\")";
_i18n = _webix.GetField("i18n");
 //BA.debugLineNum = 933;BA.debugLine="i18n.RunMethod(\"setLocale\", Array(locale))";
_i18n.RunMethod("setLocale",(Object)(new Object[]{(Object)(_locale)}));
 //BA.debugLineNum = 934;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 935;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 1546;BA.debugLine="Sub SetMap(m As Map) As WixPage";
 //BA.debugLineNum = 1547;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1548;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 1549;BA.debugLine="Page.SetAttr(strKey, strVal)";
_page._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 1551;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1552;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 992;BA.debugLine="Sub SetMinHeight(h As Int) As WixPage";
 //BA.debugLineNum = 993;BA.debugLine="Page.SetMinHeight(h)";
_page._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 994;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 995;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 986;BA.debugLine="Sub SetMinWidth(w As Int) As WixPage";
 //BA.debugLineNum = 987;BA.debugLine="Page.SetMinWidth(w)";
_page._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 988;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 989;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setname(String _n) throws Exception{
 //BA.debugLineNum = 2289;BA.debugLine="Sub SetName(n As String) As WixPage";
 //BA.debugLineNum = 2290;BA.debugLine="Page.SetName(n)";
_page._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 2291;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 2292;BA.debugLine="End Sub";
return null;
}
public String  _setoptions(String _eid,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 1264;BA.debugLine="Sub SetOptions(eID As String, data As List)";
 //BA.debugLineNum = 1265;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1266;BA.debugLine="Define(eID, CreateMap(\"options\":data))";
_define(_eid,__c.createMap(new Object[] {(Object)("options"),(Object)(_data.getObject())}));
 //BA.debugLineNum = 1267;BA.debugLine="Refresh(eID)";
_refresh(_eid);
 //BA.debugLineNum = 1268;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _setprefix(String _prefix,anywheresoftware.b4a.objects.collections.Map _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _mk = "";
Object _mv = null;
String _mk1 = "";
 //BA.debugLineNum = 2386;BA.debugLine="Sub SetPrefix(prefix As String, target As Map) As";
 //BA.debugLineNum = 2387;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2388;BA.debugLine="For Each mk As String In target.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _target.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2389;BA.debugLine="Dim mv As Object = target.Get(mk)";
_mv = _target.Get((Object)(_mk));
 //BA.debugLineNum = 2390;BA.debugLine="Dim mk1 As String = prefix & \"_\" & mk";
_mk1 = _prefix+"_"+_mk;
 //BA.debugLineNum = 2391;BA.debugLine="nm.Put(mk1,mv)";
_nm.Put((Object)(_mk1),_mv);
 }
};
 //BA.debugLineNum = 2393;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2394;BA.debugLine="End Sub";
return null;
}
public String  _setprogressbar(String _eid,b4j.Mashy.BANanoWebixDemo.wixprogressbar _pbdef) throws Exception{
com.ab.banano.BANanoObject _pb = null;
com.ab.banano.BANanoObject _itm = null;
 //BA.debugLineNum = 1095;BA.debugLine="Sub SetProgressBar(eid As String, pbdef As WixProg";
 //BA.debugLineNum = 1096;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1097;BA.debugLine="Dim pb As BANanoObject = webix.GetField(\"Progress";
_pb = _webix.GetField("ProgressBar");
 //BA.debugLineNum = 1098;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eid)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 1099;BA.debugLine="webix.RunMethod(\"extend\", Array(itm, pb))'";
_webix.RunMethod("extend",(Object)(new Object[]{(Object)(_itm),(Object)(_pb)}));
 //BA.debugLineNum = 1100;BA.debugLine="itm.RunMethod(\"showProgress\", pbdef.Item)";
_itm.RunMethod("showProgress",(Object)(_pbdef._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 1101;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 973;BA.debugLine="Sub SetResponsive(b As Object) As WixPage";
 //BA.debugLineNum = 974;BA.debugLine="Page.SetResponsive(b)";
_page._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 975;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 976;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 979;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixPage";
 //BA.debugLineNum = 980;BA.debugLine="Page.SetResponsiveCell(b)";
_page._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 981;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 982;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 1005;BA.debugLine="Sub SetScroll(b As Object) As WixPage";
 //BA.debugLineNum = 1006;BA.debugLine="Page.SetAttr(\"scroll\", b)";
_page._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 1007;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1008;BA.debugLine="End Sub";
return null;
}
public String  _setsidemenustate(String _toolbar,String _sidemenu) throws Exception{
int _th = 0;
com.ab.banano.BANanoObject _state = null;
int _sh = 0;
 //BA.debugLineNum = 1596;BA.debugLine="Sub SetSideMenuState(toolbar As String, sidemenu A";
 //BA.debugLineNum = 1597;BA.debugLine="toolbar = toolbar.tolowercase";
_toolbar = _toolbar.toLowerCase();
 //BA.debugLineNum = 1598;BA.debugLine="sidemenu = sidemenu.tolowercase";
_sidemenu = _sidemenu.toLowerCase();
 //BA.debugLineNum = 1599;BA.debugLine="Dim th As Int = GetToolBarHeight(toolbar)";
_th = _gettoolbarheight(_toolbar);
 //BA.debugLineNum = 1600;BA.debugLine="Dim state As BANanoObject = Dollar.Selector(sidem";
_state = _dollar.Selector((Object)(_sidemenu)).GetField("state");
 //BA.debugLineNum = 1602;BA.debugLine="Dim sh As Int = state.GetField(\"height\")";
_sh = (int)(BA.ObjectToNumber(_state.GetField("height")));
 //BA.debugLineNum = 1603;BA.debugLine="sh = sh - th";
_sh = (int) (_sh-_th);
 //BA.debugLineNum = 1604;BA.debugLine="state.SetField(\"top\", th)";
_state.SetField("top",(Object)(_th));
 //BA.debugLineNum = 1605;BA.debugLine="state.setfield(\"height\", sh)";
_state.SetField("height",(Object)(_sh));
 //BA.debugLineNum = 1606;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 1065;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 1066;BA.debugLine="Page.SetStyle(prop,sval)";
_page._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 1067;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1068;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetStyles(m As Map) As WixPage";
 //BA.debugLineNum = 36;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 37;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 38;BA.debugLine="Page.SetStyle(k,v)";
_page._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public String  _setsuggest(String _eid,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 1270;BA.debugLine="Sub SetSuggest(eID As String, data As List)";
 //BA.debugLineNum = 1271;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1272;BA.debugLine="Define(eID, CreateMap(\"suggest\":data))";
_define(_eid,__c.createMap(new Object[] {(Object)("suggest"),(Object)(_data.getObject())}));
 //BA.debugLineNum = 1273;BA.debugLine="Refresh(eID)";
_refresh(_eid);
 //BA.debugLineNum = 1274;BA.debugLine="End Sub";
return "";
}
public String  _settemplate(String _elid,String _lbl) throws Exception{
 //BA.debugLineNum = 661;BA.debugLine="Sub SetTemplate(elid As String, lbl As String)";
 //BA.debugLineNum = 662;BA.debugLine="elid = elid.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 663;BA.debugLine="Define(elid, CreateMap(\"template\":lbl))";
_define(_elid,__c.createMap(new Object[] {(Object)("template"),(Object)(_lbl)}));
 //BA.debugLineNum = 664;BA.debugLine="Refresh(elid)";
_refresh(_elid);
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _settype(String _t) throws Exception{
 //BA.debugLineNum = 1503;BA.debugLine="Sub SetType(t As String) As WixPage";
 //BA.debugLineNum = 1504;BA.debugLine="Page.SetType(t)";
_page._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 1505;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1506;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 1510;BA.debugLine="Sub SetTypeClean(a As String) As WixPage  'ignore";
 //BA.debugLineNum = 1511;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 1512;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1513;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 1540;BA.debugLine="Sub SetTypeForm(a As String) As WixPage  'ignore";
 //BA.debugLineNum = 1541;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 1542;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1543;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 1534;BA.debugLine="Sub SetTypeHead(a As String) As WixPage   'ignore";
 //BA.debugLineNum = 1535;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 1536;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1537;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 1516;BA.debugLine="Sub SetTypeLine(a As String) As WixPage   'ignore";
 //BA.debugLineNum = 1517;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 1518;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1519;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 1528;BA.debugLine="Sub SetTypeSpace(a As String) As WixPage   'ignore";
 //BA.debugLineNum = 1529;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 1530;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1531;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 1522;BA.debugLine="Sub SetTypeWide(a As String) As WixPage   'ignore";
 //BA.debugLineNum = 1523;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 1524;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1525;BA.debugLine="End Sub";
return null;
}
public String  _setuniteby(String _ulid,String _fldname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _obj = null;
com.ab.banano.BANanoObject _cb = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1031;BA.debugLine="Sub SetUniteBy(ulID As String, fldName As String)";
 //BA.debugLineNum = 1032;BA.debugLine="ulID = ulID.tolowercase";
_ulid = _ulid.toLowerCase();
 //BA.debugLineNum = 1033;BA.debugLine="fldName = fldName.tolowercase";
_fldname = _fldname.toLowerCase();
 //BA.debugLineNum = 1034;BA.debugLine="uniteFld = fldName";
_unitefld = _fldname;
 //BA.debugLineNum = 1035;BA.debugLine="ulName = ulID";
_ulname = _ulid;
 //BA.debugLineNum = 1037;BA.debugLine="Dim obj As Map";
_obj = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1038;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"uni";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(this,"uniteby",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_obj.getObject())})));
 //BA.debugLineNum = 1039;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1040;BA.debugLine="opt.Put(\"uniteBy\", cb)";
_opt.Put((Object)("uniteBy"),(Object)(_cb));
 //BA.debugLineNum = 1041;BA.debugLine="Define(ulName, opt)";
_define(_ulname,_opt);
 //BA.debugLineNum = 1042;BA.debugLine="Refresh(ulName)";
_refresh(_ulname);
 //BA.debugLineNum = 1043;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(String _itm,String _value) throws Exception{
 //BA.debugLineNum = 1583;BA.debugLine="Sub SetValue(itm As String, value As String)";
 //BA.debugLineNum = 1584;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 1585;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValue\",Array(v";
_dollar.Selector((Object)(_itm)).RunMethod("setValue",(Object)(new Object[]{(Object)(_value)}));
 //BA.debugLineNum = 1586;BA.debugLine="End Sub";
return "";
}
public String  _setvaluemulti(anywheresoftware.b4a.objects.collections.Map _kv) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 682;BA.debugLine="Sub SetValueMulti(kv As Map)";
 //BA.debugLineNum = 683;BA.debugLine="For Each k As String In kv.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _kv.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 684;BA.debugLine="Dim v As String = kv.Get(k)";
_v = BA.ObjectToString(_kv.Get((Object)(_k)));
 //BA.debugLineNum = 685;BA.debugLine="SetValue(k,v)";
_setvalue(_k,_v);
 }
};
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return "";
}
public String  _setvalues(String _itm,anywheresoftware.b4a.objects.collections.Map _values) throws Exception{
 //BA.debugLineNum = 1619;BA.debugLine="Sub SetValues(itm As String, values As Map)";
 //BA.debugLineNum = 1620;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 1621;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValues\",Array(";
_dollar.Selector((Object)(_itm)).RunMethod("setValues",(Object)(new Object[]{(Object)(_values.getObject())}));
 //BA.debugLineNum = 1622;BA.debugLine="End Sub";
return "";
}
public String  _setvaluesjson(String _t,String _j) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mm = null;
 //BA.debugLineNum = 769;BA.debugLine="Sub SetValuesJSON(t As String, j As String)";
 //BA.debugLineNum = 770;BA.debugLine="t = t.ToLowerCase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 771;BA.debugLine="Dim mm As Map = Json2Map(j)";
_mm = new anywheresoftware.b4a.objects.collections.Map();
_mm = _json2map(_j);
 //BA.debugLineNum = 772;BA.debugLine="SetValues(t,mm)";
_setvalues(_t,_mm);
 //BA.debugLineNum = 773;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setview(String _v) throws Exception{
 //BA.debugLineNum = 1017;BA.debugLine="Sub SetView(v As String) As WixPage";
 //BA.debugLineNum = 1018;BA.debugLine="Page.SetView(v)";
_page._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 1019;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1020;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpage  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 1059;BA.debugLine="Sub SetWidth(w As Object) As WixPage";
 //BA.debugLineNum = 1060;BA.debugLine="Page.SetWidth(w)";
_page._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 1061;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpage)(this);
 //BA.debugLineNum = 1062;BA.debugLine="End Sub";
return null;
}
public String  _show(String _itmid) throws Exception{
 //BA.debugLineNum = 1645;BA.debugLine="Sub Show(itmID As String)";
 //BA.debugLineNum = 1646;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 1647;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"show\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("show",(Object)(""));
 //BA.debugLineNum = 1648;BA.debugLine="End Sub";
return "";
}
public String  _showbatch(String _listid,boolean _b) throws Exception{
 //BA.debugLineNum = 1990;BA.debugLine="Sub ShowBatch(listID As String, b As Boolean)";
 //BA.debugLineNum = 1991;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1992;BA.debugLine="Dollar.Selector(listID).RunMethod(\"showBatch\",Arr";
_dollar.Selector((Object)(_listid)).RunMethod("showBatch",(Object)(new Object[]{(Object)(_b)}));
 //BA.debugLineNum = 1993;BA.debugLine="End Sub";
return "";
}
public String  _showcalendar(String _eid,String _edate) throws Exception{
 //BA.debugLineNum = 2001;BA.debugLine="Sub ShowCalendar(eid As String, eDate As String)";
 //BA.debugLineNum = 2002;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2003;BA.debugLine="Dollar.Selector(eid).RunMethod(\"showCalendar\",Arr";
_dollar.Selector((Object)(_eid)).RunMethod("showCalendar",(Object)(new Object[]{(Object)(_edate)}));
 //BA.debugLineNum = 2004;BA.debugLine="End Sub";
return "";
}
public String  _showitem(String _listid,String _eid) throws Exception{
 //BA.debugLineNum = 1982;BA.debugLine="Sub ShowItem(listID As String, eID As String)";
 //BA.debugLineNum = 1983;BA.debugLine="eID = CStr(eID)";
_eid = _cstr((Object)(_eid));
 //BA.debugLineNum = 1984;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 1985;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1986;BA.debugLine="Dollar.Selector(listID).RunMethod(\"showItem\",Arra";
_dollar.Selector((Object)(_listid)).RunMethod("showItem",(Object)(new Object[]{(Object)(_eid)}));
 //BA.debugLineNum = 1987;BA.debugLine="End Sub";
return "";
}
public String  _showmulti(anywheresoftware.b4a.objects.collections.List _m) throws Exception{
String _a = "";
 //BA.debugLineNum = 1800;BA.debugLine="Sub ShowMulti(m As List)";
 //BA.debugLineNum = 1801;BA.debugLine="For Each a As String In m";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_a = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1802;BA.debugLine="Show(a)";
_show(_a);
 }
};
 //BA.debugLineNum = 1804;BA.debugLine="End Sub";
return "";
}
public String  _showoverlay(String _eid,Object _msg) throws Exception{
 //BA.debugLineNum = 1362;BA.debugLine="Sub ShowOverlay(eid As String, msg As Object)";
 //BA.debugLineNum = 1363;BA.debugLine="eid = eid.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1364;BA.debugLine="Dollar.Selector(eid).RunMethod(\"showOverlay\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("showOverlay",(Object)(new Object[]{_msg}));
 //BA.debugLineNum = 1365;BA.debugLine="End Sub";
return "";
}
public String  _showpopup(String _stemplate,int _height,int _width,String _position) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixpopup _p = null;
com.ab.banano.BANanoObject _pp = null;
 //BA.debugLineNum = 2209;BA.debugLine="Sub ShowPopUp(sTemplate As String, height As Int,";
 //BA.debugLineNum = 2210;BA.debugLine="Dim p As WixPopUp";
_p = new b4j.Mashy.BANanoWebixDemo.wixpopup();
 //BA.debugLineNum = 2211;BA.debugLine="p.Initialize(\"popupi\").SetHeight(height).SetWidth";
_p._initialize /*b4j.Mashy.BANanoWebixDemo.wixpopup*/ (ba,"popupi")._setheight /*b4j.Mashy.BANanoWebixDemo.wixpopup*/ ((Object)(_height))._setwidth /*b4j.Mashy.BANanoWebixDemo.wixpopup*/ ((Object)(_width))._setposition /*b4j.Mashy.BANanoWebixDemo.wixpopup*/ (_position)._settemplate /*b4j.Mashy.BANanoWebixDemo.wixpopup*/ ((Object)(_stemplate));
 //BA.debugLineNum = 2212;BA.debugLine="Dim pp As BANanoObject = webix.RunMethod(\"ui\",p.i";
_pp = _webix.RunMethod("ui",(Object)(_p._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 2213;BA.debugLine="pp.RunMethod(\"show\", Null)";
_pp.RunMethod("show",__c.Null);
 //BA.debugLineNum = 2214;BA.debugLine="End Sub";
return "";
}
public String  _space(int _hm) throws Exception{
String _rs = "";
 //BA.debugLineNum = 330;BA.debugLine="Sub Space(HM As Int) As String";
 //BA.debugLineNum = 331;BA.debugLine="Dim RS As String = \"\"";
_rs = "";
 //BA.debugLineNum = 332;BA.debugLine="Do While Len(RS) < HM";
while (_len(_rs)<_hm) {
 //BA.debugLineNum = 333;BA.debugLine="RS = RS & \" \"";
_rs = _rs+" ";
 }
;
 //BA.debugLineNum = 335;BA.debugLine="Return RS";
if (true) return _rs;
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return "";
}
public String  _starthint(b4j.Mashy.BANanoWebixDemo.wixhint _h) throws Exception{
com.ab.banano.BANanoObject _oh = null;
 //BA.debugLineNum = 2058;BA.debugLine="Sub StartHint(h As WixHint)";
 //BA.debugLineNum = 2060;BA.debugLine="Dim oh As BANanoObject = UX(h.Item)";
_oh = _ux(_h._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 2061;BA.debugLine="oh.RunMethod(\"start\", Null)";
_oh.RunMethod("start",__c.Null);
 //BA.debugLineNum = 2062;BA.debugLine="End Sub";
return "";
}
public String  _statusrag(int _dvalue) throws Exception{
 //BA.debugLineNum = 2490;BA.debugLine="Public Sub StatusRAG(dValue As Int) As String";
 //BA.debugLineNum = 2491;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2493;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 2495;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 2497;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 2499;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 2501;BA.debugLine="End Sub";
return "";
}
public String  _statusrg(int _dvalue) throws Exception{
 //BA.debugLineNum = 2556;BA.debugLine="Public Sub StatusRG(dValue As Int) As String";
 //BA.debugLineNum = 2557;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2559;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 2561;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 2563;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
}
;
 //BA.debugLineNum = 2565;BA.debugLine="End Sub";
return "";
}
public Object  _stringify(Object _o) throws Exception{
Object _res = null;
 //BA.debugLineNum = 1940;BA.debugLine="Sub Stringify(o As Object) As Object";
 //BA.debugLineNum = 1941;BA.debugLine="Dim res As Object = webix.RunMethod(\"stringify\",";
_res = _webix.RunMethod("stringify",(Object)(new Object[]{_o})).Result();
 //BA.debugLineNum = 1942;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1943;BA.debugLine="End Sub";
return null;
}
public double  _sumlistofmapsproperty(anywheresoftware.b4a.objects.collections.List _lst,String _prop) throws Exception{
double _tsum = 0;
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _propv = "";
 //BA.debugLineNum = 498;BA.debugLine="Sub SumListOfMapsProperty(lst As List, prop As Str";
 //BA.debugLineNum = 499;BA.debugLine="Dim tsum As Double = 0";
_tsum = 0;
 //BA.debugLineNum = 500;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
 //BA.debugLineNum = 501;BA.debugLine="Dim propv As String = rec.GetDefault(prop,\"0\")";
_propv = BA.ObjectToString(_rec.GetDefault((Object)(_prop),(Object)("0")));
 //BA.debugLineNum = 502;BA.debugLine="tsum = tsum + BANano.parseFloat(propv)";
_tsum = _tsum+_banano.parseFloat((Object)(_propv));
 }
};
 //BA.debugLineNum = 504;BA.debugLine="Return tsum";
if (true) return _tsum;
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return 0;
}
public String  _toasterror(String _text) throws Exception{
anywheresoftware.b4a.objects.collections.Map _msg = null;
 //BA.debugLineNum = 1744;BA.debugLine="Sub ToastError(Text As String)";
 //BA.debugLineNum = 1745;BA.debugLine="Dim Msg As Map = CreateMap()";
_msg = new anywheresoftware.b4a.objects.collections.Map();
_msg = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1746;BA.debugLine="Msg.put(\"type\",\"error\")";
_msg.Put((Object)("type"),(Object)("error"));
 //BA.debugLineNum = 1747;BA.debugLine="Msg.put(\"text\", Text)";
_msg.Put((Object)("text"),(Object)(_text));
 //BA.debugLineNum = 1748;BA.debugLine="webix.RunMethod(\"message\", Array(Msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg.getObject())}));
 //BA.debugLineNum = 1749;BA.debugLine="End Sub";
return "";
}
public String  _toggle(String _sbid) throws Exception{
 //BA.debugLineNum = 2135;BA.debugLine="Sub Toggle(sbID As String)";
 //BA.debugLineNum = 2136;BA.debugLine="sbID = sbID.tolowercase";
_sbid = _sbid.toLowerCase();
 //BA.debugLineNum = 2137;BA.debugLine="Dollar.Selector(sbID).RunMethod(\"toggle\",Null)";
_dollar.Selector((Object)(_sbid)).RunMethod("toggle",__c.Null);
 //BA.debugLineNum = 2138;BA.debugLine="End Sub";
return "";
}
public String  _trimstring(String _strvalue) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="private Sub TrimString(strValue As String) As Stri";
 //BA.debugLineNum = 323;BA.debugLine="Return strValue.trim";
if (true) return _strvalue.trim();
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return "";
}
public String  _ui() throws Exception{
String _shint = "";
String _svalue = "";
 //BA.debugLineNum = 1672;BA.debugLine="Sub UI()";
 //BA.debugLineNum = 1673;BA.debugLine="webix.RunMethod(\"ui\",Array(Page.item))";
_webix.RunMethod("ui",(Object)(new Object[]{(Object)(_page._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject())}));
 //BA.debugLineNum = 1675;BA.debugLine="For Each sHint As String In hints.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _hints.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_shint = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1676;BA.debugLine="Dim sValue As String = hints.Get(sHint)";
_svalue = BA.ObjectToString(_hints.Get((Object)(_shint)));
 //BA.debugLineNum = 1677;BA.debugLine="SetBottomText(sHint, sValue)";
_setbottomtext(_shint,_svalue);
 }
};
 //BA.debugLineNum = 1679;BA.debugLine="End Sub";
return "";
}
public String  _uifullscreen() throws Exception{
 //BA.debugLineNum = 1681;BA.debugLine="Sub UIFullScreen";
 //BA.debugLineNum = 1682;BA.debugLine="webix.GetField(\"ui\").RunMethod(\"fullScreen\",Null)";
_webix.GetField("ui").RunMethod("fullScreen",__c.Null);
 //BA.debugLineNum = 1683;BA.debugLine="End Sub";
return "";
}
public String  _uiresize() throws Exception{
 //BA.debugLineNum = 1686;BA.debugLine="Sub UIResize";
 //BA.debugLineNum = 1687;BA.debugLine="webix.GetField(\"ui\").RunMethod(\"resize\", Null)";
_webix.GetField("ui").RunMethod("resize",__c.Null);
 //BA.debugLineNum = 1688;BA.debugLine="End Sub";
return "";
}
public String  _uniteby(anywheresoftware.b4a.objects.collections.Map _obj) throws Exception{
String _stitle = "";
String _ub = "";
 //BA.debugLineNum = 1045;BA.debugLine="private Sub uniteby(obj As Map) As String";
 //BA.debugLineNum = 1046;BA.debugLine="Dim stitle As String = obj.Get(uniteFld)";
_stitle = BA.ObjectToString(_obj.Get((Object)(_unitefld)));
 //BA.debugLineNum = 1047;BA.debugLine="Dim ub As String = stitle.SubString2(0,1)";
_ub = _stitle.substring((int) (0),(int) (1));
 //BA.debugLineNum = 1048;BA.debugLine="Return ub";
if (true) return _ub;
 //BA.debugLineNum = 1049;BA.debugLine="End Sub";
return "";
}
public String  _unsetprogressbar(String _eid) throws Exception{
 //BA.debugLineNum = 1104;BA.debugLine="Sub UnsetProgressBar(eid As String)";
 //BA.debugLineNum = 1105;BA.debugLine="eid = eid.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1106;BA.debugLine="Dollar.Selector(eid).RunMethod(\"hideProgress\",Nul";
_dollar.Selector((Object)(_eid)).RunMethod("hideProgress",__c.Null);
 //BA.debugLineNum = 1107;BA.debugLine="End Sub";
return "";
}
public String  _update(String _eid,anywheresoftware.b4a.objects.collections.Map _propertymap) throws Exception{
 //BA.debugLineNum = 1159;BA.debugLine="Sub Update(eid As String, propertyMap As Map)";
 //BA.debugLineNum = 1160;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1161;BA.debugLine="Define(eid, propertyMap)";
_define(_eid,_propertymap);
 //BA.debugLineNum = 1162;BA.debugLine="Refresh(eid)";
_refresh(_eid);
 //BA.debugLineNum = 1163;BA.debugLine="End Sub";
return "";
}
public String  _updateitem(String _ownerid,String _recid,anywheresoftware.b4a.objects.collections.Map _recdata) throws Exception{
 //BA.debugLineNum = 1807;BA.debugLine="Sub UpdateItem(ownerID As String, recID As String,";
 //BA.debugLineNum = 1808;BA.debugLine="ownerID = CStr(ownerID)";
_ownerid = _cstr((Object)(_ownerid));
 //BA.debugLineNum = 1809;BA.debugLine="recID = CStr(recID)";
_recid = _cstr((Object)(_recid));
 //BA.debugLineNum = 1810;BA.debugLine="ownerID = ownerID.ToLowerCase";
_ownerid = _ownerid.toLowerCase();
 //BA.debugLineNum = 1811;BA.debugLine="Dollar.Selector(ownerID).RunMethod(\"updateItem\",A";
_dollar.Selector((Object)(_ownerid)).RunMethod("updateItem",(Object)(new Object[]{(Object)(_recid),(Object)(_recdata.getObject())}));
 //BA.debugLineNum = 1812;BA.debugLine="End Sub";
return "";
}
public String  _updateproperty(String _eid,String _prop,String _sval) throws Exception{
anywheresoftware.b4a.objects.collections.Map _pv = null;
 //BA.debugLineNum = 1166;BA.debugLine="Sub UpdateProperty(eID As String, prop As String,";
 //BA.debugLineNum = 1167;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1168;BA.debugLine="Dim pv As Map = CreateMap()";
_pv = new anywheresoftware.b4a.objects.collections.Map();
_pv = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1169;BA.debugLine="pv.Put(prop, sval)";
_pv.Put((Object)(_prop),(Object)(_sval));
 //BA.debugLineNum = 1170;BA.debugLine="Define(eID, pv)";
_define(_eid,_pv);
 //BA.debugLineNum = 1171;BA.debugLine="Refresh(eID)";
_refresh(_eid);
 //BA.debugLineNum = 1172;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _ux(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
com.ab.banano.BANanoObject _res = null;
 //BA.debugLineNum = 2223;BA.debugLine="Sub UX(m As Map) As BANanoObject";
 //BA.debugLineNum = 2224;BA.debugLine="Dim res As BANanoObject = webix.RunMethod(\"ui\", A";
_res = _webix.RunMethod("ui",(Object)(new Object[]{(Object)(_m.getObject())}));
 //BA.debugLineNum = 2225;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 2226;BA.debugLine="End Sub";
return null;
}
public String  _val(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 560;BA.debugLine="Public Sub Val(value As String) As String";
 //BA.debugLineNum = 561;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 562;BA.debugLine="Try";
try { //BA.debugLineNum = 563;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 564;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 565;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 566;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 567;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 568;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 569;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 570;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 571;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
if (_instr("0123456789.-",_mout)!=-1) { 
 //BA.debugLineNum = 572;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 575;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 577;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 579;BA.debugLine="End Sub";
return "";
}
public boolean  _validate(String _sbid) throws Exception{
boolean _res = false;
 //BA.debugLineNum = 2141;BA.debugLine="Sub Validate(sbID As String) As Boolean";
 //BA.debugLineNum = 2142;BA.debugLine="sbID = sbID.tolowercase";
_sbid = _sbid.toLowerCase();
 //BA.debugLineNum = 2143;BA.debugLine="Dim res As Boolean = Dollar.Selector(sbID).RunMet";
_res = BA.ObjectToBoolean(_dollar.Selector((Object)(_sbid)).RunMethod("validate",__c.Null).Result());
 //BA.debugLineNum = 2144;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 2145;BA.debugLine="End Sub";
return false;
}
public com.ab.banano.BANanoObject  _view(String _eid) throws Exception{
String _v = "";
com.ab.banano.BANanoObject _res = null;
 //BA.debugLineNum = 2083;BA.debugLine="Sub View(eID As String) As BANanoObject";
 //BA.debugLineNum = 2084;BA.debugLine="Dim v As String = \"$\" & \"view\"";
_v = "$"+"view";
 //BA.debugLineNum = 2085;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 2086;BA.debugLine="Dim res As BANanoObject = Dollar.Selector(eID).Ge";
_res = _dollar.Selector((Object)(_eid)).GetField(_v);
 //BA.debugLineNum = 2087;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 2088;BA.debugLine="End Sub";
return null;
}
public boolean  _viewexists(String _eid) throws Exception{
boolean _bhas = false;
 //BA.debugLineNum = 1355;BA.debugLine="Sub ViewExists(eid As String) As Boolean";
 //BA.debugLineNum = 1356;BA.debugLine="eid = eid.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1357;BA.debugLine="Dim bHas As Boolean = Dollar.Selector(eid).RunMet";
_bhas = BA.ObjectToBoolean(_dollar.Selector((Object)(_eid)).RunMethod("exists",__c.Null).Result());
 //BA.debugLineNum = 1358;BA.debugLine="Return bHas";
if (true) return _bhas;
 //BA.debugLineNum = 1359;BA.debugLine="End Sub";
return false;
}
public String  _warn(String _stitle,String _smessage) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixmessagebox _ae = null;
 //BA.debugLineNum = 697;BA.debugLine="Sub Warn(sTitle As String, sMessage As String)";
 //BA.debugLineNum = 698;BA.debugLine="Dim ae As WixMessageBox";
_ae = new b4j.Mashy.BANanoWebixDemo.wixmessagebox();
 //BA.debugLineNum = 699;BA.debugLine="ae.Initialize(\"\").SetTypeAlertWarning(True).SetTi";
_ae._initialize /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ (ba,"")._settypealertwarning /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ (__c.True)._settitle /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ ((Object)(_stitle))._settext /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ ((Object)(_smessage));
 //BA.debugLineNum = 700;BA.debugLine="Alert(ae.Item)";
_alert((Object)(_ae._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 701;BA.debugLine="End Sub";
return "";
}
public String  _windowfullscreen(String _wid) throws Exception{
 //BA.debugLineNum = 2148;BA.debugLine="Sub WindowFullScreen(wID As String)";
 //BA.debugLineNum = 2149;BA.debugLine="wID = wID.ToLowerCase";
_wid = _wid.toLowerCase();
 //BA.debugLineNum = 2150;BA.debugLine="Define(wID, CreateMap(\"fullscreen\":True,\"top\":0,\"";
_define(_wid,__c.createMap(new Object[] {(Object)("fullscreen"),(Object)(__c.True),(Object)("top"),(Object)(0),(Object)("left"),(Object)(0)}));
 //BA.debugLineNum = 2151;BA.debugLine="Resize(wID)";
_resize(_wid);
 //BA.debugLineNum = 2152;BA.debugLine="End Sub";
return "";
}
public String  _yearnow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 207;BA.debugLine="Public Sub YearNow() As String";
 //BA.debugLineNum = 208;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 209;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 210;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 211;BA.debugLine="DateTime.DateFormat = \"yyyy\"";
__c.DateTime.setDateFormat("yyyy");
 //BA.debugLineNum = 212;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 213;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
