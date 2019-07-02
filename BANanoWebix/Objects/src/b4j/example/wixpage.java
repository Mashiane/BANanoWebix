package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANanoObject _dollar = null;
public com.ab.banano.BANanoObject _webix = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.wixelement _page = null;
public String _id = "";
public b4j.example.wixbuttontypes _enumbuttontypes = null;
public b4j.example.wixlayouttypes _enumlayouttypes = null;
public anywheresoftware.b4a.objects.collections.Map _hints = null;
public String _unitefld = "";
public String _ulname = "";
public b4j.example.wixicons _enumwixicons = null;
public b4j.example.main _main = null;
public b4j.example.pgvideo _pgvideo = null;
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
public String  _add(String _listid,anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub Add(listID As String, record As Map)";
 //BA.debugLineNum = 325;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 326;BA.debugLine="Dollar.Selector(listID).RunMethod(\"add\",Array(rec";
_dollar.Selector((Object)(_listid)).RunMethod("add",(Object)(new Object[]{(Object)(_record.getObject())}));
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public String  _addchildnode(String _treeid,String _parentid,anywheresoftware.b4a.objects.collections.Map _node) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub AddChildNode(treeID As String, parentID As Str";
 //BA.debugLineNum = 115;BA.debugLine="treeID = treeID.ToLowerCase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 116;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 117;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"add\", Array(no";
_dollar.Selector((Object)(_treeid)).RunMethod("add",(Object)(new Object[]{(Object)(_node.getObject()),(Object)(1),(Object)(_parentid)}));
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addcontext(b4j.example.wixcontext _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 641;BA.debugLine="Sub AddContext(ctx As WixContext) As BANanoObject";
 //BA.debugLineNum = 642;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 643;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 644;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _addcontextmenu(b4j.example.wixcontextmenu _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 647;BA.debugLine="Sub AddContextMenu(ctx As WixContextMenu) As BANan";
 //BA.debugLineNum = 648;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 649;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
return null;
}
public String  _adddropzone(String _uploader,String _eid) throws Exception{
com.ab.banano.BANanoObject _iview = null;
 //BA.debugLineNum = 505;BA.debugLine="Sub addDropZone(uploader As String, eID As String)";
 //BA.debugLineNum = 506;BA.debugLine="uploader = uploader.tolowercase";
_uploader = _uploader.toLowerCase();
 //BA.debugLineNum = 507;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 508;BA.debugLine="Dim iView As BANanoObject = View(eID)";
_iview = _view(_eid);
 //BA.debugLineNum = 509;BA.debugLine="Dollar.Selector(uploader).RunMethod(\"addDropZone\"";
_dollar.Selector((Object)(_uploader)).RunMethod("addDropZone",(Object)(new Object[]{(Object)(_iview)}));
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return "";
}
public String  _addnode(String _treeid,anywheresoftware.b4a.objects.collections.Map _node) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub AddNode(treeID As String, node As Map)";
 //BA.debugLineNum = 109;BA.debugLine="treeID = treeID.ToLowerCase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 110;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"add\", Array(no";
_dollar.Selector((Object)(_treeid)).RunMethod("add",(Object)(new Object[]{(Object)(_node.getObject()),(Object)(1)}));
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _addrow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub AddRow(r As WixRow)";
 //BA.debugLineNum = 219;BA.debugLine="Page.AddRow(r)";
_page._addrow /*String*/ (_r);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addsidemenu(b4j.example.wixsidemenu _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 659;BA.debugLine="Sub AddSideMenu(ctx As WixSideMenu) As BANanoObjec";
 //BA.debugLineNum = 660;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 661;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 662;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _adduploader(b4j.example.wixuploader _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 666;BA.debugLine="Sub AddUploader(ctx As WixUploader) As BANanoObjec";
 //BA.debugLineNum = 667;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 668;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 669;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _addwindow(b4j.example.wixwindow _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 653;BA.debugLine="Sub AddWindow(ctx As WixWindow) As BANanoObject";
 //BA.debugLineNum = 654;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 655;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return null;
}
public String  _adjust(String _eid) throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub Adjust(eID As String)";
 //BA.debugLineNum = 480;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 481;BA.debugLine="Dollar.Selector(eID).RunMethod(\"adjust\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("adjust",__c.Null);
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return "";
}
public String  _alert(String _msg) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub Alert(msg As String)";
 //BA.debugLineNum = 297;BA.debugLine="webix.RunMethod(\"alert\", Array(msg))";
_webix.RunMethod("alert",(Object)(new Object[]{(Object)(_msg)}));
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public String  _bind(String _frmid,String _dattableid) throws Exception{
 //BA.debugLineNum = 521;BA.debugLine="Sub Bind(frmID As String, datTableID As String)";
 //BA.debugLineNum = 522;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 523;BA.debugLine="datTableID = datTableID.ToLowerCase";
_dattableid = _dattableid.toLowerCase();
 //BA.debugLineNum = 524;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"bind\",Array(dat";
_dollar.Selector((Object)(_frmid)).RunMethod("bind",(Object)(new Object[]{(Object)(_dattableid)}));
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return "";
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
_page = new b4j.example.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 8;BA.debugLine="Public EnumButtonTypes As WixButtonTypes";
_enumbuttontypes = new b4j.example.wixbuttontypes();
 //BA.debugLineNum = 9;BA.debugLine="Public EnumLayoutTypes As WixLayoutTypes";
_enumlayouttypes = new b4j.example.wixlayouttypes();
 //BA.debugLineNum = 10;BA.debugLine="Private hints As Map";
_hints = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private uniteFld As String";
_unitefld = "";
 //BA.debugLineNum = 12;BA.debugLine="Private ulName As String";
_ulname = "";
 //BA.debugLineNum = 13;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 14;BA.debugLine="Public EnumWixIcons As WixIcons";
_enumwixicons = new b4j.example.wixicons();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _clear(String _itm) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub Clear(itm As String)";
 //BA.debugLineNum = 319;BA.debugLine="itm = itm.tolowercase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 320;BA.debugLine="Dollar.Selector(itm).RunMethod(\"clear\",Null)";
_dollar.Selector((Object)(_itm)).RunMethod("clear",__c.Null);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return "";
}
public String  _clearall(String _eid) throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Sub ClearAll(eID As String)";
 //BA.debugLineNum = 492;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 493;BA.debugLine="Dollar.Selector(eID).RunMethod(\"clearAll\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("clearAll",__c.Null);
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return "";
}
public String  _close(com.ab.banano.BANanoObject _itm) throws Exception{
 //BA.debugLineNum = 629;BA.debugLine="Sub Close(itm As BANanoObject)";
 //BA.debugLineNum = 630;BA.debugLine="itm.RunMethod(\"close\", Null)";
_itm.RunMethod("close",__c.Null);
 //BA.debugLineNum = 631;BA.debugLine="End Sub";
return "";
}
public String  _confirm(com.ab.banano.BANanoObject _callback,String _stitle,String _stext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 309;BA.debugLine="Sub Confirm(CallBack As BANanoObject, stitle As St";
 //BA.debugLineNum = 310;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 311;BA.debugLine="opt.Put(\"title\", stitle)";
_opt.Put((Object)("title"),(Object)(_stitle));
 //BA.debugLineNum = 312;BA.debugLine="opt.Put(\"text\", stext)";
_opt.Put((Object)("text"),(Object)(_stext));
 //BA.debugLineNum = 313;BA.debugLine="opt.Put(\"callback\", CallBack)";
_opt.Put((Object)("callback"),(Object)(_callback));
 //BA.debugLineNum = 314;BA.debugLine="webix.RunMethod(\"confirm\", opt)";
_webix.RunMethod("confirm",(Object)(_opt.getObject()));
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 330;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public String  _define(String _eid,anywheresoftware.b4a.objects.collections.Map _properties) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub Define(eID As String, properties As Map)";
 //BA.debugLineNum = 103;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 104;BA.debugLine="Dollar.Selector(eID).RunMethod(\"define\",Array(pro";
_dollar.Selector((Object)(_eid)).RunMethod("define",(Object)(new Object[]{(Object)(_properties.getObject())}));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _disableit(String _itmid) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub DisableIT(itmID As String)";
 //BA.debugLineNum = 270;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 271;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"disable\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("disable",(Object)(""));
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return "";
}
public String  _enableit(String _itmid) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub EnableIT(itmID As String)";
 //BA.debugLineNum = 264;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 265;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"enable\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("enable",(Object)(""));
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public Object  _exists(String _listid,String _eid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 444;BA.debugLine="Sub Exists(listID As String, eID As String) As Obj";
 //BA.debugLineNum = 445;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 446;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("exists",(Object)(new Object[]{(Object)(_eid)})).Result());
 //BA.debugLineNum = 447;BA.debugLine="Return recID";
if (true) return (Object)(_recid);
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return null;
}
public String  _export2csv(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 586;BA.debugLine="Sub Export2CSV(eID As String)";
 //BA.debugLineNum = 587;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 589;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 591;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID & \".pn";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid+".png")});
 //BA.debugLineNum = 593;BA.debugLine="webix.RunMethod(\"toCSV\", Array(itm, opt))";
_webix.RunMethod("toCSV",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return "";
}
public String  _export2excel(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 564;BA.debugLine="Sub Export2Excel(eID As String)";
 //BA.debugLineNum = 565;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 567;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 569;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID & \".pn";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid+".png")});
 //BA.debugLineNum = 571;BA.debugLine="webix.RunMethod(\"toExcel\", Array(itm, opt))";
_webix.RunMethod("toExcel",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 572;BA.debugLine="End Sub";
return "";
}
public String  _export2pdf(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 575;BA.debugLine="Sub Export2PDF(eID As String)";
 //BA.debugLineNum = 576;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 578;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 580;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID & \".pn";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid+".png")});
 //BA.debugLineNum = 582;BA.debugLine="webix.RunMethod(\"toPDF\", Array(itm, opt))";
_webix.RunMethod("toPDF",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 583;BA.debugLine="End Sub";
return "";
}
public String  _export2png(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 553;BA.debugLine="Sub Export2PNG(eID As String)";
 //BA.debugLineNum = 554;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 556;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 558;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID & \".pn";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid+".png")});
 //BA.debugLineNum = 560;BA.debugLine="webix.RunMethod(\"toPNG\", Array(itm, opt))";
_webix.RunMethod("toPNG",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return "";
}
public String  _filedialog(String _frmid,anywheresoftware.b4a.objects.collections.Map _opt) throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Sub FileDialog(frmID As String, opt As Map)";
 //BA.debugLineNum = 535;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 536;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"fileDialog\",Arr";
_dollar.Selector((Object)(_frmid)).RunMethod("fileDialog",(Object)(new Object[]{(Object)(_opt.getObject())}));
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return "";
}
public String  _freezerow(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub FreezeRow(dtID As String, r As Int)";
 //BA.debugLineNum = 185;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 186;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"freezeRow\", Arra";
_dollar.Selector((Object)(_dtid)).RunMethod("freezeRow",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _fullscreen() throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub FullScreen";
 //BA.debugLineNum = 286;BA.debugLine="webix.RunMethod(\"ui\", Array(\"fullScreen\"))";
_webix.RunMethod("ui",(Object)(new Object[]{(Object)("fullScreen")}));
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcleanvalues(String _frmid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 465;BA.debugLine="Sub GetCleanValues(frmID As String) As Map";
 //BA.debugLineNum = 466;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 467;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 468;BA.debugLine="rec = Dollar.Selector(frmID).RunMethod(\"getCleanV";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_frmid)).RunMethod("getCleanValues",__c.Null).Result()));
 //BA.debugLineNum = 469;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdirtyvalues(String _frmid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 457;BA.debugLine="Sub GetDirtyValues(frmID As String) As Map";
 //BA.debugLineNum = 458;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 459;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 460;BA.debugLine="rec = Dollar.Selector(frmID).RunMethod(\"getDirtyV";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_frmid)).RunMethod("getDirtyValues",__c.Null).Result()));
 //BA.debugLineNum = 461;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getitem(String _listid,String _recordid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 341;BA.debugLine="Sub GetItem(listID As String, recordID As String)";
 //BA.debugLineNum = 342;BA.debugLine="listID = listID.ToLowerCase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 343;BA.debugLine="recordID = recordID.tolowercase";
_recordid = _recordid.toLowerCase();
 //BA.debugLineNum = 344;BA.debugLine="Dim values As Map = Dollar.Selector(listID).RunMe";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getItem",(Object)(new Object[]{(Object)(_recordid)})).Result()));
 //BA.debugLineNum = 345;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getmarker(String _listid,String _recordid) throws Exception{
String _mkey = "";
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 349;BA.debugLine="Sub GetMarker(listID As String, recordID As String";
 //BA.debugLineNum = 350;BA.debugLine="Dim mKey As String = \"$\" & \"marker\"";
_mkey = "$"+"marker";
 //BA.debugLineNum = 351;BA.debugLine="listID = listID.ToLowerCase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 352;BA.debugLine="recordID = recordID.tolowercase";
_recordid = _recordid.toLowerCase();
 //BA.debugLineNum = 353;BA.debugLine="Dim values As Map = Dollar.Selector(listID).RunMe";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getItem",(Object)(new Object[]{(Object)(_recordid)})).Result()));
 //BA.debugLineNum = 354;BA.debugLine="values.Remove(mKey)";
_values.Remove((Object)(_mkey));
 //BA.debugLineNum = 355;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public String  _getrowidfromcontext(com.ab.banano.BANanoObject _bo) throws Exception{
anywheresoftware.b4a.objects.collections.Map _context = null;
String _rowid = "";
 //BA.debugLineNum = 368;BA.debugLine="Sub GetRowIDFromContext(bo As BANanoObject) As Str";
 //BA.debugLineNum = 369;BA.debugLine="Dim context As Map = bo.GetField(\"context\").Resul";
_context = new anywheresoftware.b4a.objects.collections.Map();
_context.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bo.GetField("context").Result()));
 //BA.debugLineNum = 370;BA.debugLine="Dim rowid As String = context.Get(\"rowid\")";
_rowid = BA.ObjectToString(_context.Get((Object)("rowid")));
 //BA.debugLineNum = 371;BA.debugLine="rowid = CStr(rowid)";
_rowid = _cstr((Object)(_rowid));
 //BA.debugLineNum = 372;BA.debugLine="Return rowid";
if (true) return _rowid;
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return "";
}
public Object  _getselected(String _listid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 430;BA.debugLine="Sub GetSelected(listID As String) As Object";
 //BA.debugLineNum = 431;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 432;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("getSelected",__c.Null).Result());
 //BA.debugLineNum = 433;BA.debugLine="Return recID";
if (true) return (Object)(_recid);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public String  _getselectedid(String _listid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 423;BA.debugLine="Sub GetSelectedID(listID As String) As String";
 //BA.debugLineNum = 424;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 425;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("getSelectedId",__c.Null).Result());
 //BA.debugLineNum = 426;BA.debugLine="Return recID";
if (true) return _recid;
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getselecteditem(String _listid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _recid = null;
 //BA.debugLineNum = 437;BA.debugLine="Sub GetSelectedItem(listID As String) As Map";
 //BA.debugLineNum = 438;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 439;BA.debugLine="Dim recID As Map = Dollar.Selector(listID).RunMet";
_recid = new anywheresoftware.b4a.objects.collections.Map();
_recid.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getSelectedItem",__c.Null).Result()));
 //BA.debugLineNum = 440;BA.debugLine="Return recID";
if (true) return _recid;
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public String  _getvalue(String _itm) throws Exception{
String _res = "";
 //BA.debugLineNum = 229;BA.debugLine="Sub GetValue(itm As String) As String";
 //BA.debugLineNum = 230;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 231;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 232;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValue\",N";
_res = BA.ObjectToString(_dollar.Selector((Object)(_itm)).RunMethod("getValue",__c.Null).Result());
 //BA.debugLineNum = 233;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getvalues(String _itm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _res = null;
 //BA.debugLineNum = 243;BA.debugLine="Sub GetValues(itm As String) As Map";
 //BA.debugLineNum = 244;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 245;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 246;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValues\",";
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_itm)).RunMethod("getValues",__c.Null).Result()));
 //BA.debugLineNum = 247;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public String  _hide(com.ab.banano.BANanoObject _itm) throws Exception{
 //BA.debugLineNum = 623;BA.debugLine="Sub Hide(itm As BANanoObject)";
 //BA.debugLineNum = 624;BA.debugLine="itm.RunMethod(\"hide\", Null)";
_itm.RunMethod("hide",__c.Null);
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return "";
}
public String  _hideit(String _itmid) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub HideIT(itmID As String)";
 //BA.debugLineNum = 252;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 253;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"hide\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("hide",(Object)(""));
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _initialize(anywheresoftware.b4a.BA _ba,String _pgid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 78;BA.debugLine="Public Sub Initialize(pgID As String) As WixPage";
 //BA.debugLineNum = 79;BA.debugLine="hints.Initialize";
_hints.Initialize();
 //BA.debugLineNum = 80;BA.debugLine="Dollar.Initialize(\"$$\")";
_dollar.Initialize((Object)("$$"));
 //BA.debugLineNum = 81;BA.debugLine="ID = pgID.tolowercase";
_id = _pgid.toLowerCase();
 //BA.debugLineNum = 82;BA.debugLine="webix.Initialize(\"webix\")";
_webix.Initialize((Object)("webix"));
 //BA.debugLineNum = 83;BA.debugLine="Page.Initialize(ID)";
_page._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 85;BA.debugLine="EnumButtonTypes.Initialize";
_enumbuttontypes._initialize /*String*/ (ba);
 //BA.debugLineNum = 86;BA.debugLine="EnumLayoutTypes.Initialize";
_enumlayouttypes._initialize /*String*/ (ba);
 //BA.debugLineNum = 87;BA.debugLine="EnumWixIcons.Initialize";
_enumwixicons._initialize /*String*/ (ba);
 //BA.debugLineNum = 88;BA.debugLine="SetContainer(\"body\")";
_setcontainer("body");
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public boolean  _isvisible(com.ab.banano.BANanoObject _itm) throws Exception{
boolean _res = false;
 //BA.debugLineNum = 635;BA.debugLine="Sub IsVisible(itm As BANanoObject) As Boolean";
 //BA.debugLineNum = 636;BA.debugLine="Dim res As Boolean = itm.RunMethod(\"isVisible\", N";
_res = BA.ObjectToBoolean(_itm.RunMethod("isVisible",__c.Null).Result());
 //BA.debugLineNum = 637;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 638;BA.debugLine="End Sub";
return false;
}
public String  _message(String _msg) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub Message(msg As String)";
 //BA.debugLineNum = 291;BA.debugLine="webix.RunMethod(\"message\", Array(msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg)}));
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return "";
}
public String  _move(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub Move(dtID As String, r As Int)";
 //BA.debugLineNum = 203;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 204;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"move\", Array(r))";
_dollar.Selector((Object)(_dtid)).RunMethod("move",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _movebottom(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub MoveBottom(dtID As String, r As Int)";
 //BA.debugLineNum = 191;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 192;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"moveBottom\", Arr";
_dollar.Selector((Object)(_dtid)).RunMethod("moveBottom",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _movetop(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub MoveTop(dtID As String, r As Int)";
 //BA.debugLineNum = 197;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 198;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"moveTop\", Array(";
_dollar.Selector((Object)(_dtid)).RunMethod("moveTop",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _onafterselect(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub OnAfterSelect(eID As String, cb As BANanoObjec";
 //BA.debugLineNum = 382;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 383;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterSelect"),(Object)(_cb)}));
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public String  _onaftertabclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub OnAfterTabClick(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 159;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 160;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterTabClick"),(Object)(_cb)}));
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _onafterunselect(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub OnAfterUnSelect(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 404;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 405;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterUnSelect"),(Object)(_cb)}));
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return "";
}
public String  _onchange(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub OnChange(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 135;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 136;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onChange"),(Object)(_cb)}));
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _oncheck(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub OnCheck(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 165;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 166;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onCheck"),(Object)(_cb)}));
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public String  _onclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub OnClick(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 392;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 393;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onClick"),(Object)(_cb)}));
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return "";
}
public String  _onenter(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub OnEnter(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 141;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 142;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onEnter"),(Object)(_cb)}));
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _onfileupload(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub onFileUpload(eID As String, cb As BANanoObject";
 //BA.debugLineNum = 376;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 377;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onFileUpload"),(Object)(_cb)}));
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return "";
}
public String  _onfileuploaderror(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub onFileUploadError(eID As String, cb As BANanoO";
 //BA.debugLineNum = 364;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 365;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onFileUploadError"),(Object)(_cb)}));
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return "";
}
public String  _onitemclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub OnItemClick(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 387;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 388;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onItemClick"),(Object)(_cb)}));
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public String  _onliveedit(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub OnLiveEdit(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 147;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 148;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onLiveEdit"),(Object)(_cb)}));
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _onmenuitemclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub OnMenuItemClick(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 397;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 398;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onMenuItemClick"),(Object)(_cb)}));
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return "";
}
public String  _onselectchange(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub OnSelectChange(eID As String, cb As BANanoObje";
 //BA.debugLineNum = 172;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 173;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onSelectChange"),(Object)(_cb)}));
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _ontimedkeypress(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub OnTimedKeyPress(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 153;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 154;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onTimedKeyPress"),(Object)(_cb)}));
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _onuploadcomplete(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub OnUploadComplete(eID As String, cb As BANanoOb";
 //BA.debugLineNum = 359;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 360;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onUploadComplete"),(Object)(_cb)}));
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return "";
}
public String  _parse(String _eid,anywheresoftware.b4a.objects.collections.List _data,String _typeof) throws Exception{
 //BA.debugLineNum = 515;BA.debugLine="Sub Parse(eID As String, data As List, typeOf As S";
 //BA.debugLineNum = 516;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 517;BA.debugLine="Dollar.Selector(eID).RunMethod(\"parse\",Array(data";
_dollar.Selector((Object)(_eid)).RunMethod("parse",(Object)(new Object[]{(Object)(_data.getObject()),(Object)(_typeof)}));
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return "";
}
public String  _refresh(String _eid) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub Refresh(eID As String)";
 //BA.debugLineNum = 179;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 180;BA.debugLine="Dollar.Selector(eID).RunMethod(\"refresh\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("refresh",__c.Null);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _remove(String _listid,String _recid) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub Remove(listID As String, recID As String)";
 //BA.debugLineNum = 417;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 418;BA.debugLine="If recID = \"\" Then Return";
if ((_recid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 419;BA.debugLine="Dollar.Selector(listID).RunMethod(\"remove\",Array(";
_dollar.Selector((Object)(_listid)).RunMethod("remove",(Object)(new Object[]{(Object)(_recid)}));
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return "";
}
public String  _resize(String _eid) throws Exception{
 //BA.debugLineNum = 485;BA.debugLine="Sub Resize(eID As String)";
 //BA.debugLineNum = 486;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 487;BA.debugLine="Dollar.Selector(eID).RunMethod(\"resize\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("resize",__c.Null);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return "";
}
public String  _save(String _frmid) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Sub Save(frmID As String)";
 //BA.debugLineNum = 529;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 530;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"save\",Null)";
_dollar.Selector((Object)(_frmid)).RunMethod("save",__c.Null);
 //BA.debugLineNum = 531;BA.debugLine="End Sub";
return "";
}
public String  _selectitem(String _treeid,String _nodeid) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SelectItem(treeID As String, nodeID As String)";
 //BA.debugLineNum = 122;BA.debugLine="treeID = treeID.ToLowerCase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 123;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 124;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"select\", Array";
_dollar.Selector((Object)(_treeid)).RunMethod("select",(Object)(new Object[]{(Object)(_nodeid)}));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _serialize(String _eid,boolean _ball) throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 409;BA.debugLine="Sub Serialize(eID As String, bAll As Boolean) As L";
 //BA.debugLineNum = 410;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 411;BA.debugLine="Dim res As List = Dollar.Selector(eID).RunMethod(";
_res = new anywheresoftware.b4a.objects.collections.List();
_res.setObject((java.util.List)(_dollar.Selector((Object)(_eid)).RunMethod("serialize",(Object)(new Object[]{(Object)(_ball)})).Result()));
 //BA.debugLineNum = 412;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public String  _setbottomtext(String _eid,String _etext) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Sub SetBottomText(eID As String, eText As String)";
 //BA.debugLineNum = 474;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 475;BA.debugLine="Dollar.Selector(eID).RunMethod(\"setBottomText\",Ar";
_dollar.Selector((Object)(_eid)).RunMethod("setBottomText",(Object)(new Object[]{(Object)(_etext)}));
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _setcontainer(String _contid) throws Exception{
String _skey = "";
 //BA.debugLineNum = 93;BA.debugLine="Sub SetContainer(contID As String) As WixPage";
 //BA.debugLineNum = 94;BA.debugLine="contID = contID.tolowercase";
_contid = _contid.toLowerCase();
 //BA.debugLineNum = 95;BA.debugLine="Dim sKey As String = \"#\" & contID";
_skey = "#"+_contid;
 //BA.debugLineNum = 96;BA.debugLine="Page.Container = contID";
_page._container /*String*/  = _contid;
 //BA.debugLineNum = 97;BA.debugLine="BANano.GetElement(sKey).empty";
_banano.GetElement(_skey).Empty();
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setheader(String _stitle) throws Exception{
b4j.example.wixheader _hdr = null;
 //BA.debugLineNum = 208;BA.debugLine="Sub SetHeader(sTitle As String) As WixPage";
 //BA.debugLineNum = 210;BA.debugLine="Dim hdr As WixHeader";
_hdr = new b4j.example.wixheader();
 //BA.debugLineNum = 211;BA.debugLine="hdr.Initialize(\"hdr\")";
_hdr._initialize /*b4j.example.wixheader*/ (ba,"hdr");
 //BA.debugLineNum = 212;BA.debugLine="hdr.Header.SetTemplate(sTitle)";
_hdr._header /*b4j.example.wixelement*/ ._settemplate /*b4j.example.wixelement*/ ((Object)(_stitle));
 //BA.debugLineNum = 213;BA.debugLine="hdr.Header.AddToRows(Page)";
_hdr._header /*b4j.example.wixelement*/ ._addtorows /*String*/ (_page);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public String  _sethint(String _eid,String _shint) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetHint(eID As String, sHint As String)";
 //BA.debugLineNum = 129;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 130;BA.debugLine="hints.Put(eID,sHint)";
_hints.Put((Object)(_eid),(Object)(_shint));
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _setuniteby(String _ulid,String _fldname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _obj = null;
com.ab.banano.BANanoObject _cb = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 56;BA.debugLine="Sub SetUniteBy(ulID As String, fldName As String)";
 //BA.debugLineNum = 57;BA.debugLine="ulID = ulID.tolowercase";
_ulid = _ulid.toLowerCase();
 //BA.debugLineNum = 58;BA.debugLine="fldName = fldName.tolowercase";
_fldname = _fldname.toLowerCase();
 //BA.debugLineNum = 59;BA.debugLine="uniteFld = fldName";
_unitefld = _fldname;
 //BA.debugLineNum = 60;BA.debugLine="ulName = ulID";
_ulname = _ulid;
 //BA.debugLineNum = 62;BA.debugLine="Dim obj As Map";
_obj = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 63;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"uni";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(this,"uniteby",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_obj.getObject())})));
 //BA.debugLineNum = 64;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 65;BA.debugLine="opt.Put(\"uniteBy\", cb)";
_opt.Put((Object)("uniteBy"),(Object)(_cb));
 //BA.debugLineNum = 66;BA.debugLine="Define(ulName, opt)";
_define(_ulname,_opt);
 //BA.debugLineNum = 67;BA.debugLine="Refresh(ulName)";
_refresh(_ulname);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(String _itm,String _value) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetValue(itm As String, value As String)";
 //BA.debugLineNum = 224;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 225;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValue\",Array(v";
_dollar.Selector((Object)(_itm)).RunMethod("setValue",(Object)(new Object[]{(Object)(_value)}));
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _setvalues(String _itm,anywheresoftware.b4a.objects.collections.Map _values) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetValues(itm As String, values As Map)";
 //BA.debugLineNum = 238;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 239;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValues\",Array(";
_dollar.Selector((Object)(_itm)).RunMethod("setValues",(Object)(new Object[]{(Object)(_values.getObject())}));
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _show(com.ab.banano.BANanoObject _itm) throws Exception{
 //BA.debugLineNum = 617;BA.debugLine="Sub Show(itm As BANanoObject)";
 //BA.debugLineNum = 618;BA.debugLine="itm.RunMethod(\"show\", Null)";
_itm.RunMethod("show",__c.Null);
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return "";
}
public String  _showit(String _itmid) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub ShowIT(itmID As String)";
 //BA.debugLineNum = 258;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 259;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"show\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("show",(Object)(""));
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public String  _showitem(String _listid,String _eid) throws Exception{
 //BA.debugLineNum = 451;BA.debugLine="Sub ShowItem(listID As String, eID As String)";
 //BA.debugLineNum = 452;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 453;BA.debugLine="Dollar.Selector(listID).RunMethod(\"showItem\",Arra";
_dollar.Selector((Object)(_listid)).RunMethod("showItem",(Object)(new Object[]{(Object)(_eid)}));
 //BA.debugLineNum = 454;BA.debugLine="End Sub";
return "";
}
public String  _showpopup(String _stemplate,int _height,int _width,String _position) throws Exception{
b4j.example.wixpopup _p = null;
com.ab.banano.BANanoObject _pp = null;
 //BA.debugLineNum = 597;BA.debugLine="Sub ShowPopUp(sTemplate As String, height As Int,";
 //BA.debugLineNum = 598;BA.debugLine="Dim p As WixPopUp";
_p = new b4j.example.wixpopup();
 //BA.debugLineNum = 599;BA.debugLine="p.Initialize(\"popupi\").SetHeight(height).SetWidth";
_p._initialize /*b4j.example.wixpopup*/ (ba,"popupi")._setheight /*b4j.example.wixpopup*/ (_height)._setwidth /*b4j.example.wixpopup*/ (_width)._setposition /*b4j.example.wixpopup*/ (_position)._settemplate /*b4j.example.wixpopup*/ (_stemplate);
 //BA.debugLineNum = 600;BA.debugLine="Dim pp As BANanoObject = webix.RunMethod(\"ui\",p.i";
_pp = _webix.RunMethod("ui",(Object)(_p._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 601;BA.debugLine="pp.RunMethod(\"show\", Null)";
_pp.RunMethod("show",__c.Null);
 //BA.debugLineNum = 602;BA.debugLine="End Sub";
return "";
}
public String  _toasterror(String _text) throws Exception{
anywheresoftware.b4a.objects.collections.Map _msg = null;
 //BA.debugLineNum = 301;BA.debugLine="Sub ToastError(Text As String)";
 //BA.debugLineNum = 302;BA.debugLine="Dim msg As Map = CreateMap()";
_msg = new anywheresoftware.b4a.objects.collections.Map();
_msg = __c.createMap(new Object[] {});
 //BA.debugLineNum = 303;BA.debugLine="msg.put(\"type\",\"error\")";
_msg.Put((Object)("type"),(Object)("error"));
 //BA.debugLineNum = 304;BA.debugLine="msg.put(\"text\", Text)";
_msg.Put((Object)("text"),(Object)(_text));
 //BA.debugLineNum = 305;BA.debugLine="webix.RunMethod(\"message\", Array(msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg.getObject())}));
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return "";
}
public String  _toggle(String _sbid) throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub Toggle(sbID As String)";
 //BA.debugLineNum = 541;BA.debugLine="sbID = sbID.tolowercase";
_sbid = _sbid.toLowerCase();
 //BA.debugLineNum = 542;BA.debugLine="Dollar.Selector(sbID).RunMethod(\"toggle\",Null)";
_dollar.Selector((Object)(_sbid)).RunMethod("toggle",__c.Null);
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return "";
}
public String  _ui() throws Exception{
String _shint = "";
String _svalue = "";
 //BA.debugLineNum = 275;BA.debugLine="Sub UI()";
 //BA.debugLineNum = 276;BA.debugLine="webix.RunMethod(\"ui\",Array(Page.item))";
_webix.RunMethod("ui",(Object)(new Object[]{(Object)(_page._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject())}));
 //BA.debugLineNum = 278;BA.debugLine="For Each sHint As String In hints.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _hints.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_shint = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 279;BA.debugLine="Dim sValue As String = hints.Get(sHint)";
_svalue = BA.ObjectToString(_hints.Get((Object)(_shint)));
 //BA.debugLineNum = 280;BA.debugLine="SetBottomText(sHint, sValue)";
_setbottomtext(_shint,_svalue);
 }
};
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _uiobject(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
com.ab.banano.BANanoObject _res = null;
 //BA.debugLineNum = 605;BA.debugLine="Sub UIObject(m As Map) As BANanoObject";
 //BA.debugLineNum = 606;BA.debugLine="Dim res As BANanoObject = webix.RunMethod(\"ui\", A";
_res = _webix.RunMethod("ui",(Object)(new Object[]{(Object)(_m.getObject())}));
 //BA.debugLineNum = 607;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 608;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _unflatten(anywheresoftware.b4a.objects.collections.List _data,String _childname) throws Exception{
anywheresoftware.b4a.objects.collections.List _tree = null;
anywheresoftware.b4a.objects.collections.Map _mappedarr = null;
anywheresoftware.b4a.objects.collections.Map _arrelem = null;
String _did = "";
anywheresoftware.b4a.objects.collections.List _cdata = null;
anywheresoftware.b4a.objects.collections.Map _mappedelem = null;
String _parentid = "";
anywheresoftware.b4a.objects.collections.Map _parentelem = null;
anywheresoftware.b4a.objects.collections.List _children = null;
 //BA.debugLineNum = 18;BA.debugLine="Sub Unflatten(data As List, childname As String) A";
 //BA.debugLineNum = 20;BA.debugLine="Dim tree As List";
_tree = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 21;BA.debugLine="Dim mappedArr As Map";
_mappedarr = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 23;BA.debugLine="tree.Initialize";
_tree.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="mappedArr.Initialize";
_mappedarr.Initialize();
 //BA.debugLineNum = 27;BA.debugLine="For Each arrElem As Map In data";
_arrelem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _data;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_arrelem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
 //BA.debugLineNum = 28;BA.debugLine="Dim dID As String = arrElem.Get(\"id\")";
_did = BA.ObjectToString(_arrelem.Get((Object)("id")));
 //BA.debugLineNum = 30;BA.debugLine="Dim cdata As List";
_cdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 31;BA.debugLine="cdata.Initialize";
_cdata.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="arrElem.Put(childname, cdata)";
_arrelem.Put((Object)(_childname),(Object)(_cdata.getObject()));
 //BA.debugLineNum = 34;BA.debugLine="mappedArr.Put(dID, arrElem)";
_mappedarr.Put((Object)(_did),(Object)(_arrelem.getObject()));
 }
};
 //BA.debugLineNum = 37;BA.debugLine="For Each dID As String In mappedArr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group12 = _mappedarr.Keys();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_did = BA.ObjectToString(group12.Get(index12));
 //BA.debugLineNum = 38;BA.debugLine="Dim mappedElem As Map = mappedArr.Get(dID)";
_mappedelem = new anywheresoftware.b4a.objects.collections.Map();
_mappedelem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_did))));
 //BA.debugLineNum = 39;BA.debugLine="Dim parentid As String = mappedElem.Get(\"parenti";
_parentid = BA.ObjectToString(_mappedelem.Get((Object)("parentid")));
 //BA.debugLineNum = 41;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 42;BA.debugLine="tree.Add(mappedElem)";
_tree.Add((Object)(_mappedelem.getObject()));
 }else {
 //BA.debugLineNum = 45;BA.debugLine="Dim parentElem As Map = mappedArr.Get(parentid)";
_parentelem = new anywheresoftware.b4a.objects.collections.Map();
_parentelem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_parentid))));
 //BA.debugLineNum = 46;BA.debugLine="Dim children As List = parentElem.Get(childname";
_children = new anywheresoftware.b4a.objects.collections.List();
_children.setObject((java.util.List)(_parentelem.Get((Object)(_childname))));
 //BA.debugLineNum = 47;BA.debugLine="children.Add(mappedElem)";
_children.Add((Object)(_mappedelem.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="parentElem.Put(childname, children)";
_parentelem.Put((Object)(_childname),(Object)(_children.getObject()));
 //BA.debugLineNum = 49;BA.debugLine="mappedArr.Put(parentid, parentElem)";
_mappedarr.Put((Object)(_parentid),(Object)(_parentelem.getObject()));
 };
 }
};
 //BA.debugLineNum = 52;BA.debugLine="Return tree";
if (true) return _tree;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _uniteby(anywheresoftware.b4a.objects.collections.Map _obj) throws Exception{
String _stitle = "";
String _ub = "";
 //BA.debugLineNum = 70;BA.debugLine="private Sub uniteby(obj As Map) As String";
 //BA.debugLineNum = 71;BA.debugLine="Dim stitle As String = obj.Get(uniteFld)";
_stitle = BA.ObjectToString(_obj.Get((Object)(_unitefld)));
 //BA.debugLineNum = 72;BA.debugLine="Dim ub As String = stitle.SubString2(0,1)";
_ub = _stitle.substring((int) (0),(int) (1));
 //BA.debugLineNum = 73;BA.debugLine="Return ub";
if (true) return _ub;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _updateitem(String _ownerid,String _recid,anywheresoftware.b4a.objects.collections.Map _recdata) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub UpdateItem(ownerID As String, recID As String,";
 //BA.debugLineNum = 335;BA.debugLine="ownerID = ownerID.ToLowerCase";
_ownerid = _ownerid.toLowerCase();
 //BA.debugLineNum = 336;BA.debugLine="recID = recID.tolowercase";
_recid = _recid.toLowerCase();
 //BA.debugLineNum = 337;BA.debugLine="Dollar.Selector(ownerID).RunMethod(\"updateItem\",A";
_dollar.Selector((Object)(_ownerid)).RunMethod("updateItem",(Object)(new Object[]{(Object)(_recid),(Object)(_recdata.getObject())}));
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _ux(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
com.ab.banano.BANanoObject _res = null;
 //BA.debugLineNum = 611;BA.debugLine="Sub UX(m As Map) As BANanoObject";
 //BA.debugLineNum = 612;BA.debugLine="Dim res As BANanoObject = webix.RunMethod(\"ui\", A";
_res = _webix.RunMethod("ui",(Object)(new Object[]{(Object)(_m.getObject())}));
 //BA.debugLineNum = 613;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 614;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _view(String _eid) throws Exception{
String _v = "";
com.ab.banano.BANanoObject _res = null;
 //BA.debugLineNum = 497;BA.debugLine="Sub View(eID As String) As BANanoObject";
 //BA.debugLineNum = 498;BA.debugLine="Dim v As String = \"$\" & \"view\"";
_v = "$"+"view";
 //BA.debugLineNum = 499;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 500;BA.debugLine="Dim res As BANanoObject = Dollar.Selector(eID).Ge";
_res = _dollar.Selector((Object)(_eid)).GetField(_v);
 //BA.debugLineNum = 501;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public String  _windowfullscreen(String _wid) throws Exception{
 //BA.debugLineNum = 546;BA.debugLine="Sub WindowFullScreen(wID As String)";
 //BA.debugLineNum = 547;BA.debugLine="wID = wID.ToLowerCase";
_wid = _wid.toLowerCase();
 //BA.debugLineNum = 548;BA.debugLine="Define(wID, CreateMap(\"fullscreen\":True,\"top\":0,\"";
_define(_wid,__c.createMap(new Object[] {(Object)("fullscreen"),(Object)(__c.True),(Object)("top"),(Object)(0),(Object)("left"),(Object)(0)}));
 //BA.debugLineNum = 549;BA.debugLine="Resize(wID)";
_resize(_wid);
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
