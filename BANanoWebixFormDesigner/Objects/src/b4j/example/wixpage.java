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
public anywheresoftware.b4a.objects.collections.List _views = null;
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.dbutton _dbutton = null;
public b4j.example.modcenter _modcenter = null;
public b4j.example.modsidebar _modsidebar = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.drow _drow = null;
public b4j.example.dpager _dpager = null;
public b4j.example.ddbllist _ddbllist = null;
public b4j.example.dform _dform = null;
public b4j.example.dcheckbox _dcheckbox = null;
public b4j.example.dcolorpicker _dcolorpicker = null;
public b4j.example.dcombo _dcombo = null;
public b4j.example.dcounter _dcounter = null;
public b4j.example.ddatepicker _ddatepicker = null;
public b4j.example.dicon _dicon = null;
public b4j.example.dlabel _dlabel = null;
public b4j.example.dradio _dradio = null;
public b4j.example.drichselect _drichselect = null;
public b4j.example.dsearch _dsearch = null;
public b4j.example.dselect _dselect = null;
public b4j.example.dsegmented _dsegmented = null;
public b4j.example.dslider _dslider = null;
public b4j.example.dswitch _dswitch = null;
public b4j.example.dtabbar _dtabbar = null;
public b4j.example.dtext _dtext = null;
public b4j.example.dtextarea _dtextarea = null;
public b4j.example.dtoggle _dtoggle = null;
public b4j.example.duploader _duploader = null;
public b4j.example.dfieldset _dfieldset = null;
public b4j.example.dsuggest _dsuggest = null;
public b4j.example.dcolumn _dcolumn = null;
public b4j.example.modpropertybag _modpropertybag = null;
public b4j.example.ddesignerproperty _ddesignerproperty = null;
public b4j.example.dconnection _dconnection = null;
public b4j.example.dtable _dtable = null;
public b4j.example.dfield _dfield = null;
public b4j.example.modwebix _modwebix = null;
public String  _add(String _listid,anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
 //BA.debugLineNum = 716;BA.debugLine="Sub Add(listID As String, record As Map)";
 //BA.debugLineNum = 717;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 718;BA.debugLine="Dollar.Selector(listID).RunMethod(\"add\",Array(rec";
_dollar.Selector((Object)(_listid)).RunMethod("add",(Object)(new Object[]{(Object)(_record.getObject())}));
 //BA.debugLineNum = 719;BA.debugLine="End Sub";
return "";
}
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 571;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 572;BA.debugLine="Page.AddColumns(itm)";
_page._addcolumns /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnsspacer() throws Exception{
b4j.example.wixelement _s = null;
 //BA.debugLineNum = 437;BA.debugLine="Sub AddColumnsSpacer()";
 //BA.debugLineNum = 438;BA.debugLine="Dim s As WixElement";
_s = new b4j.example.wixelement();
 //BA.debugLineNum = 439;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.example.wixelement*/ (ba,"")._setview /*b4j.example.wixelement*/ ("spacer");
 //BA.debugLineNum = 440;BA.debugLine="AddColumns(s.item)";
_addcolumns(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addcontext(b4j.example.wixcontext _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 1072;BA.debugLine="Sub AddContext(ctx As WixContext) As BANanoObject";
 //BA.debugLineNum = 1073;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1074;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 1075;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _addcontextmenu(b4j.example.wixcontextmenu _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 1078;BA.debugLine="Sub AddContextMenu(ctx As WixContextMenu) As BANan";
 //BA.debugLineNum = 1079;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1080;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 1081;BA.debugLine="End Sub";
return null;
}
public String  _adddropzone(String _uploader,String _eid) throws Exception{
com.ab.banano.BANanoObject _iview = null;
 //BA.debugLineNum = 931;BA.debugLine="Sub AddDropZone(uploader As String, eID As String)";
 //BA.debugLineNum = 932;BA.debugLine="uploader = uploader.tolowercase";
_uploader = _uploader.toLowerCase();
 //BA.debugLineNum = 933;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 934;BA.debugLine="Dim iView As BANanoObject = View(eID)";
_iview = _view(_eid);
 //BA.debugLineNum = 935;BA.debugLine="Dollar.Selector(uploader).RunMethod(\"addDropZone\"";
_dollar.Selector((Object)(_uploader)).RunMethod("addDropZone",(Object)(new Object[]{(Object)(_iview)}));
 //BA.debugLineNum = 936;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addmessagebox(b4j.example.wixmessagebox _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 1090;BA.debugLine="Sub AddMessageBox(ctx As WixMessageBox) As BANanoO";
 //BA.debugLineNum = 1091;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1092;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 1093;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _addnode(String _treeid,String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target,boolean _mopen) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub AddNode(treeID As String, parentID As String,";
 //BA.debugLineNum = 71;BA.debugLine="treeID = treeID.ToLowerCase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 72;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 73;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 74;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 75;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 76;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 77;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 78;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 79;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 80;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 81;BA.debugLine="mitem.Put(\"open\", mOpen)";
_mitem.Put((Object)("open"),(Object)(_mopen));
 //BA.debugLineNum = 82;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 83;BA.debugLine="If parentID = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 84;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"add\", Array(m";
_dollar.Selector((Object)(_treeid)).RunMethod("add",(Object)(new Object[]{(Object)(_mitem.getObject()),(Object)(1)}));
 }else {
 //BA.debugLineNum = 86;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"add\", Array(m";
_dollar.Selector((Object)(_treeid)).RunMethod("add",(Object)(new Object[]{(Object)(_mitem.getObject()),(Object)(-1),(Object)(_parentid)}));
 };
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public String  _addrow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 556;BA.debugLine="Sub AddRow(r As WixRow)";
 //BA.debugLineNum = 557;BA.debugLine="Page.AddRow(r)";
_page._addrow /*String*/ (_r);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return "";
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 549;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 550;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 551;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 561;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 562;BA.debugLine="Page.AddRows(itm)";
_page._addrows /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _addrowscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 277;BA.debugLine="Sub AddRowsCells(mCells As List) As WixPage";
 //BA.debugLineNum = 278;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 279;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 280;BA.debugLine="AddRows(opt)";
_addrows(_opt);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public String  _addrowsspacer() throws Exception{
b4j.example.wixelement _s = null;
 //BA.debugLineNum = 430;BA.debugLine="Sub AddRowsSpacer()";
 //BA.debugLineNum = 431;BA.debugLine="Dim s As WixElement";
_s = new b4j.example.wixelement();
 //BA.debugLineNum = 432;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.example.wixelement*/ (ba,"")._setview /*b4j.example.wixelement*/ ("spacer");
 //BA.debugLineNum = 433;BA.debugLine="AddRows(s.item)";
_addrows(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addsidemenu(b4j.example.wixsidemenu _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 1097;BA.debugLine="Sub AddSideMenu(ctx As WixSideMenu) As BANanoObjec";
 //BA.debugLineNum = 1098;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1099;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 1100;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _addsuggestion(b4j.example.wixsuggest _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 1116;BA.debugLine="Sub AddSuggestion(ctx As WixSuggest) As BANanoObje";
 //BA.debugLineNum = 1117;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1118;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 1119;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 1132;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 1133;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 1134;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 1137;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 1138;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 1139;BA.debugLine="End Sub";
return "";
}
public String  _addtoolbar(b4j.example.wixtoolbar _tbl) throws Exception{
 //BA.debugLineNum = 1122;BA.debugLine="Sub AddToolBar(tbl As WixToolBar)";
 //BA.debugLineNum = 1123;BA.debugLine="Page.AddRows(tbl.item)";
_page._addrows /*b4j.example.wixelement*/ (_tbl._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1124;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 1127;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 1128;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 1129;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _adduploader(b4j.example.wixuploader _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 1110;BA.debugLine="Sub AddUploader(ctx As WixUploader) As BANanoObjec";
 //BA.debugLineNum = 1111;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1112;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 1113;BA.debugLine="End Sub";
return null;
}
public String  _addview(String _parentid,anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
com.ab.banano.BANanoObject _bo = null;
com.ab.banano.BANanoObject _prt = null;
 //BA.debugLineNum = 882;BA.debugLine="Sub AddView(parentid As String, itm As Map)";
 //BA.debugLineNum = 883;BA.debugLine="parentid = parentid.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 884;BA.debugLine="Dim bo As BANanoObject = UX(itm)";
_bo = _ux(_itm);
 //BA.debugLineNum = 885;BA.debugLine="Dim prt As BANanoObject = Dollar.Selector(parenti";
_prt = _dollar.Selector((Object)(_parentid));
 //BA.debugLineNum = 886;BA.debugLine="prt.RunMethod(\"addView\",Array(bo))";
_prt.RunMethod("addView",(Object)(new Object[]{(Object)(_bo)}));
 //BA.debugLineNum = 887;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _addwindow(b4j.example.wixwindow _ctx) throws Exception{
com.ab.banano.BANanoObject _ctxux = null;
 //BA.debugLineNum = 1084;BA.debugLine="Sub AddWindow(ctx As WixWindow) As BANanoObject";
 //BA.debugLineNum = 1085;BA.debugLine="Dim ctxUX As BANanoObject = UX(ctx.Item)";
_ctxux = _ux(_ctx._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1086;BA.debugLine="Return ctxUX";
if (true) return _ctxux;
 //BA.debugLineNum = 1087;BA.debugLine="End Sub";
return null;
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.wixrow _i = null;
 //BA.debugLineNum = 252;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 253;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.example.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 254;BA.debugLine="AddRow(i)";
_addrow(_i);
 }
};
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public String  _adjust(String _eid) throws Exception{
 //BA.debugLineNum = 905;BA.debugLine="Sub Adjust(eID As String)";
 //BA.debugLineNum = 906;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 907;BA.debugLine="Dollar.Selector(eID).RunMethod(\"adjust\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("adjust",__c.Null);
 //BA.debugLineNum = 908;BA.debugLine="End Sub";
return "";
}
public String  _alert(Object _msg) throws Exception{
 //BA.debugLineNum = 673;BA.debugLine="Sub Alert(msg As Object)";
 //BA.debugLineNum = 674;BA.debugLine="webix.RunMethod(\"alert\", Array(msg))";
_webix.RunMethod("alert",(Object)(new Object[]{_msg}));
 //BA.debugLineNum = 675;BA.debugLine="End Sub";
return "";
}
public String  _bind(String _frmid,String _dattableid) throws Exception{
 //BA.debugLineNum = 947;BA.debugLine="Sub Bind(frmID As String, datTableID As String)";
 //BA.debugLineNum = 948;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 949;BA.debugLine="datTableID = datTableID.ToLowerCase";
_dattableid = _dattableid.toLowerCase();
 //BA.debugLineNum = 950;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"bind\",Array(dat";
_dollar.Selector((Object)(_frmid)).RunMethod("bind",(Object)(new Object[]{(Object)(_dattableid)}));
 //BA.debugLineNum = 951;BA.debugLine="End Sub";
return "";
}
public String  _boclose(com.ab.banano.BANanoObject _itm) throws Exception{
 //BA.debugLineNum = 1060;BA.debugLine="Sub BOClose(itm As BANanoObject)";
 //BA.debugLineNum = 1061;BA.debugLine="itm.RunMethod(\"close\", Null)";
_itm.RunMethod("close",__c.Null);
 //BA.debugLineNum = 1062;BA.debugLine="End Sub";
return "";
}
public String  _bohide(com.ab.banano.BANanoObject _itm) throws Exception{
 //BA.debugLineNum = 1055;BA.debugLine="Sub BOHide(itm As BANanoObject)";
 //BA.debugLineNum = 1056;BA.debugLine="itm.RunMethod(\"hide\", Null)";
_itm.RunMethod("hide",__c.Null);
 //BA.debugLineNum = 1057;BA.debugLine="End Sub";
return "";
}
public boolean  _boisvisible(com.ab.banano.BANanoObject _itm) throws Exception{
boolean _res = false;
 //BA.debugLineNum = 1065;BA.debugLine="Sub BOIsVisible(itm As BANanoObject) As Boolean";
 //BA.debugLineNum = 1066;BA.debugLine="Dim res As Boolean = itm.RunMethod(\"isVisible\", N";
_res = BA.ObjectToBoolean(_itm.RunMethod("isVisible",__c.Null).Result());
 //BA.debugLineNum = 1067;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1068;BA.debugLine="End Sub";
return false;
}
public String  _boshow(com.ab.banano.BANanoObject _itm) throws Exception{
 //BA.debugLineNum = 1050;BA.debugLine="Sub BOShow(itm As BANanoObject)";
 //BA.debugLineNum = 1051;BA.debugLine="itm.RunMethod(\"show\", Null)";
_itm.RunMethod("show",__c.Null);
 //BA.debugLineNum = 1052;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _boui(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
com.ab.banano.BANanoObject _res = null;
 //BA.debugLineNum = 1038;BA.debugLine="Sub BOUI(m As Map) As BANanoObject";
 //BA.debugLineNum = 1039;BA.debugLine="Dim res As BANanoObject = webix.RunMethod(\"ui\", A";
_res = _webix.RunMethod("ui",(Object)(new Object[]{(Object)(_m.getObject())}));
 //BA.debugLineNum = 1040;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1041;BA.debugLine="End Sub";
return null;
}
public String  _buildviews() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub BuildViews";
 //BA.debugLineNum = 166;BA.debugLine="Views.Initialize";
_views.Initialize();
 //BA.debugLineNum = 167;BA.debugLine="Views.Add(\"\")";
_views.Add((Object)(""));
 //BA.debugLineNum = 168;BA.debugLine="Views.AddAll(Array(\"textarea\",\"spacer\",\"form\",\"wi";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("textarea"),(Object)("spacer"),(Object)("form"),(Object)("window"),(Object)("accordion"),(Object)("tabview"),(Object)("datatable"),(Object)("text"),(Object)("hint"),(Object)("property"),(Object)("toolbar")}));
 //BA.debugLineNum = 169;BA.debugLine="Views.AddAll(Array(\"icon\",\"button\",\"segmented\",\"t";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("icon"),(Object)("button"),(Object)("segmented"),(Object)("tree"),(Object)("fieldset"),(Object)("suggest"),(Object)("forminput"),(Object)("pager"),(Object)("sidebar"),(Object)("switch"),(Object)("checkbox")}));
 //BA.debugLineNum = 170;BA.debugLine="Views.AddAll(Array(\"list\",\"dataview\",\"layout\",\"ta";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("list"),(Object)("dataview"),(Object)("layout"),(Object)("tabbar"),(Object)("menu"),(Object)("carousel"),(Object)("sidemenu"),(Object)("comments"),(Object)("contextmenu"),(Object)("unitlist")}));
 //BA.debugLineNum = 171;BA.debugLine="Views.AddAll(Array(\"context\",\"chart\",\"multiview\",";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("context"),(Object)("chart"),(Object)("multiview"),(Object)("combo"),(Object)("radio"),(Object)("richselect"),(Object)("counter"),(Object)("colorpicker"),(Object)("datepicker"),(Object)("label")}));
 //BA.debugLineNum = 172;BA.debugLine="Views.AddAll(Array(\"resizer\",\"select\",\"search\",\"s";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("resizer"),(Object)("select"),(Object)("search"),(Object)("slider"),(Object)("richtext"),(Object)("dbllist"),(Object)("treetable"),(Object)("popup"),(Object)("iframe"),(Object)("grouplist")}));
 //BA.debugLineNum = 173;BA.debugLine="Views.AddAll(Array(\"google-map\",\"uploader\",\"video";
_views.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("google-map"),(Object)("uploader"),(Object)("video"),(Object)("template"),(Object)("scrollview"),(Object)("flexlayout"),(Object)("toggle"),(Object)("row"),(Object)("column")}));
 //BA.debugLineNum = 174;BA.debugLine="Views.Sort(True)";
_views.Sort(__c.True);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Public Views As List";
_views = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _clear(String _itm) throws Exception{
 //BA.debugLineNum = 704;BA.debugLine="Sub Clear(itm As String)";
 //BA.debugLineNum = 705;BA.debugLine="itm = itm.tolowercase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 706;BA.debugLine="Dollar.Selector(itm).RunMethod(\"clear\",Null)";
_dollar.Selector((Object)(_itm)).RunMethod("clear",__c.Null);
 //BA.debugLineNum = 707;BA.debugLine="End Sub";
return "";
}
public String  _clearall(String _eid) throws Exception{
 //BA.debugLineNum = 917;BA.debugLine="Sub ClearAll(eID As String)";
 //BA.debugLineNum = 918;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 919;BA.debugLine="Dollar.Selector(eID).RunMethod(\"clearAll\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("clearAll",__c.Null);
 //BA.debugLineNum = 920;BA.debugLine="End Sub";
return "";
}
public String  _clearvalidation(String _elid) throws Exception{
 //BA.debugLineNum = 710;BA.debugLine="Sub ClearValidation(elID As String)";
 //BA.debugLineNum = 711;BA.debugLine="elID = elID.ToLowerCase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 712;BA.debugLine="Dollar.Selector(elID).RunMethod(\"clearValidation\"";
_dollar.Selector((Object)(_elid)).RunMethod("clearValidation",__c.Null);
 //BA.debugLineNum = 713;BA.debugLine="End Sub";
return "";
}
public String  _collapse(String _nodeid) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub Collapse(nodeID As String)";
 //BA.debugLineNum = 364;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 365;BA.debugLine="Dollar.Selector(nodeID).RunMethod(\"collapse\", Nul";
_dollar.Selector((Object)(_nodeid)).RunMethod("collapse",__c.Null);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return "";
}
public String  _confirm(com.ab.banano.BANanoObject _callback,String _stitle,String _stext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 695;BA.debugLine="Sub Confirm(CallBack As BANanoObject, stitle As St";
 //BA.debugLineNum = 696;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 697;BA.debugLine="opt.Put(\"title\", stitle)";
_opt.Put((Object)("title"),(Object)(_stitle));
 //BA.debugLineNum = 698;BA.debugLine="opt.Put(\"text\", stext)";
_opt.Put((Object)("text"),(Object)(_stext));
 //BA.debugLineNum = 699;BA.debugLine="opt.Put(\"callback\", CallBack)";
_opt.Put((Object)("callback"),(Object)(_callback));
 //BA.debugLineNum = 700;BA.debugLine="webix.RunMethod(\"confirm\", opt)";
_webix.RunMethod("confirm",(Object)(_opt.getObject()));
 //BA.debugLineNum = 701;BA.debugLine="End Sub";
return "";
}
public String  _confirm1(Object _msg) throws Exception{
 //BA.debugLineNum = 677;BA.debugLine="Sub Confirm1(msg As Object)";
 //BA.debugLineNum = 678;BA.debugLine="webix.RunMethod(\"confirm\", Array(msg))";
_webix.RunMethod("confirm",(Object)(new Object[]{_msg}));
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return "";
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 721;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 722;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 723;BA.debugLine="End Sub";
return "";
}
public Object  _datetostr(String _f) throws Exception{
com.ab.banano.BANanoObject _df = null;
Object _df1 = null;
 //BA.debugLineNum = 196;BA.debugLine="Sub DateToStr(f As String) As Object";
 //BA.debugLineNum = 197;BA.debugLine="Dim df As BANanoObject = webix.GetField(\"Date\")";
_df = _webix.GetField("Date");
 //BA.debugLineNum = 198;BA.debugLine="Dim df1 As Object = df.RunMethod(\"dateToStr\", Arr";
_df1 = _df.RunMethod("dateToStr",(Object)(new Object[]{(Object)(_f)})).Result();
 //BA.debugLineNum = 199;BA.debugLine="Return df1";
if (true) return _df1;
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public String  _define(String _eid,anywheresoftware.b4a.objects.collections.Map _properties) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub Define(eID As String, properties As Map)";
 //BA.debugLineNum = 335;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 336;BA.debugLine="Dollar.Selector(eID).RunMethod(\"define\",Array(pro";
_dollar.Selector((Object)(_eid)).RunMethod("define",(Object)(new Object[]{(Object)(_properties.getObject())}));
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return "";
}
public String  _disable(String _itmid) throws Exception{
 //BA.debugLineNum = 622;BA.debugLine="Sub Disable(itmID As String)";
 //BA.debugLineNum = 623;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 624;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"disable\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("disable",(Object)(""));
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return "";
}
public String  _enable(String _itmid) throws Exception{
 //BA.debugLineNum = 616;BA.debugLine="Sub Enable(itmID As String)";
 //BA.debugLineNum = 617;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 618;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"enable\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("enable",(Object)(""));
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return "";
}
public Object  _exists(String _listid,String _eid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 847;BA.debugLine="Sub Exists(listID As String, eID As String) As Obj";
 //BA.debugLineNum = 848;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 849;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("exists",(Object)(new Object[]{(Object)(_eid)})).Result());
 //BA.debugLineNum = 850;BA.debugLine="Return recID";
if (true) return (Object)(_recid);
 //BA.debugLineNum = 851;BA.debugLine="End Sub";
return null;
}
public String  _expand(String _nodeid) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub Expand(nodeID As String)";
 //BA.debugLineNum = 370;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 371;BA.debugLine="Dollar.Selector(nodeID).RunMethod(\"expand\", Null)";
_dollar.Selector((Object)(_nodeid)).RunMethod("expand",__c.Null);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return "";
}
public String  _export2csv(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1019;BA.debugLine="Sub Export2CSV(eID As String)";
 //BA.debugLineNum = 1020;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1022;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 1024;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid)});
 //BA.debugLineNum = 1026;BA.debugLine="webix.RunMethod(\"toCSV\", Array(itm, opt))";
_webix.RunMethod("toCSV",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 1027;BA.debugLine="End Sub";
return "";
}
public String  _export2excel(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 997;BA.debugLine="Sub Export2Excel(eID As String)";
 //BA.debugLineNum = 998;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1000;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 1002;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid)});
 //BA.debugLineNum = 1004;BA.debugLine="webix.RunMethod(\"toExcel\", Array(itm, opt))";
_webix.RunMethod("toExcel",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 1005;BA.debugLine="End Sub";
return "";
}
public String  _export2pdf(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1008;BA.debugLine="Sub Export2PDF(eID As String)";
 //BA.debugLineNum = 1009;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 1011;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 1013;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid)});
 //BA.debugLineNum = 1015;BA.debugLine="webix.RunMethod(\"toPDF\", Array(itm, opt))";
_webix.RunMethod("toPDF",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 1016;BA.debugLine="End Sub";
return "";
}
public String  _export2png(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 986;BA.debugLine="Sub Export2PNG(eID As String)";
 //BA.debugLineNum = 987;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 989;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 991;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID)";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid)});
 //BA.debugLineNum = 993;BA.debugLine="webix.RunMethod(\"toPNG\", Array(itm, opt))";
_webix.RunMethod("toPNG",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 994;BA.debugLine="End Sub";
return "";
}
public String  _filedialog(String _frmid,anywheresoftware.b4a.objects.collections.Map _opt) throws Exception{
 //BA.debugLineNum = 960;BA.debugLine="Sub FileDialog(frmID As String, opt As Map)";
 //BA.debugLineNum = 961;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 962;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"fileDialog\",Arr";
_dollar.Selector((Object)(_frmid)).RunMethod("fileDialog",(Object)(new Object[]{(Object)(_opt.getObject())}));
 //BA.debugLineNum = 963;BA.debugLine="End Sub";
return "";
}
public String  _freezerow(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Sub FreezeRow(dtID As String, r As Int)";
 //BA.debugLineNum = 463;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 464;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"freezeRow\", Arra";
_dollar.Selector((Object)(_dtid)).RunMethod("freezeRow",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcleanvalues(String _frmid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 868;BA.debugLine="Sub GetCleanValues(frmID As String) As Map";
 //BA.debugLineNum = 869;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 870;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 871;BA.debugLine="rec = Dollar.Selector(frmID).RunMethod(\"getCleanV";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_frmid)).RunMethod("getCleanValues",__c.Null).Result()));
 //BA.debugLineNum = 872;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdirtyvalues(String _frmid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 860;BA.debugLine="Sub GetDirtyValues(frmID As String) As Map";
 //BA.debugLineNum = 861;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 862;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 863;BA.debugLine="rec = Dollar.Selector(frmID).RunMethod(\"getDirtyV";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_frmid)).RunMethod("getDirtyValues",__c.Null).Result()));
 //BA.debugLineNum = 864;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getitem(String _listid,String _recordid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 733;BA.debugLine="Sub GetItem(listID As String, recordID As String)";
 //BA.debugLineNum = 734;BA.debugLine="listID = listID.ToLowerCase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 735;BA.debugLine="recordID = recordID.tolowercase";
_recordid = _recordid.toLowerCase();
 //BA.debugLineNum = 736;BA.debugLine="Dim values As Map = Dollar.Selector(listID).RunMe";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getItem",(Object)(new Object[]{(Object)(_recordid)})).Result()));
 //BA.debugLineNum = 737;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getmarker(String _listid,String _recordid) throws Exception{
String _mkey = "";
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 741;BA.debugLine="Sub GetMarker(listID As String, recordID As String";
 //BA.debugLineNum = 742;BA.debugLine="Dim mKey As String = \"$\" & \"marker\"";
_mkey = "$"+"marker";
 //BA.debugLineNum = 743;BA.debugLine="listID = listID.ToLowerCase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 744;BA.debugLine="recordID = recordID.tolowercase";
_recordid = _recordid.toLowerCase();
 //BA.debugLineNum = 745;BA.debugLine="Dim values As Map = Dollar.Selector(listID).RunMe";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getItem",(Object)(new Object[]{(Object)(_recordid)})).Result()));
 //BA.debugLineNum = 746;BA.debugLine="values.Remove(mKey)";
_values.Remove((Object)(_mkey));
 //BA.debugLineNum = 747;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 748;BA.debugLine="End Sub";
return null;
}
public String  _getrowidfromcontext(com.ab.banano.BANanoObject _bo) throws Exception{
anywheresoftware.b4a.objects.collections.Map _context = null;
String _rowid = "";
 //BA.debugLineNum = 760;BA.debugLine="Sub GetRowIDFromContext(bo As BANanoObject) As Str";
 //BA.debugLineNum = 761;BA.debugLine="Dim context As Map = bo.GetField(\"context\").Resul";
_context = new anywheresoftware.b4a.objects.collections.Map();
_context.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bo.GetField("context").Result()));
 //BA.debugLineNum = 762;BA.debugLine="Dim rowid As String = context.Get(\"rowid\")";
_rowid = BA.ObjectToString(_context.Get((Object)("rowid")));
 //BA.debugLineNum = 763;BA.debugLine="rowid = CStr(rowid)";
_rowid = _cstr((Object)(_rowid));
 //BA.debugLineNum = 764;BA.debugLine="Return rowid";
if (true) return _rowid;
 //BA.debugLineNum = 765;BA.debugLine="End Sub";
return "";
}
public Object  _getselected(String _listid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 833;BA.debugLine="Sub GetSelected(listID As String) As Object";
 //BA.debugLineNum = 834;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 835;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("getSelected",__c.Null).Result());
 //BA.debugLineNum = 836;BA.debugLine="Return recID";
if (true) return (Object)(_recid);
 //BA.debugLineNum = 837;BA.debugLine="End Sub";
return null;
}
public String  _getselectedid(String _listid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 826;BA.debugLine="Sub GetSelectedID(listID As String) As String";
 //BA.debugLineNum = 827;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 828;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("getSelectedId",__c.Null).Result());
 //BA.debugLineNum = 829;BA.debugLine="Return recID";
if (true) return _recid;
 //BA.debugLineNum = 830;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getselecteditem(String _listid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _recid = null;
 //BA.debugLineNum = 840;BA.debugLine="Sub GetSelectedItem(listID As String) As Map";
 //BA.debugLineNum = 841;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 842;BA.debugLine="Dim recID As Map = Dollar.Selector(listID).RunMet";
_recid = new anywheresoftware.b4a.objects.collections.Map();
_recid.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getSelectedItem",__c.Null).Result()));
 //BA.debugLineNum = 843;BA.debugLine="Return recID";
if (true) return _recid;
 //BA.debugLineNum = 844;BA.debugLine="End Sub";
return null;
}
public String  _getvalue(String _itm) throws Exception{
String _res = "";
 //BA.debugLineNum = 582;BA.debugLine="Sub GetValue(itm As String) As String";
 //BA.debugLineNum = 583;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 584;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 585;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValue\",N";
_res = BA.ObjectToString(_dollar.Selector((Object)(_itm)).RunMethod("getValue",__c.Null).Result());
 //BA.debugLineNum = 586;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getvalues(String _itm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _res = null;
 //BA.debugLineNum = 596;BA.debugLine="Sub GetValues(itm As String) As Map";
 //BA.debugLineNum = 597;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 598;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 599;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValues\",";
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_itm)).RunMethod("getValues",__c.Null).Result()));
 //BA.debugLineNum = 600;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return null;
}
public String  _hide(String _itmid) throws Exception{
 //BA.debugLineNum = 604;BA.debugLine="Sub Hide(itmID As String)";
 //BA.debugLineNum = 605;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 606;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"hide\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("hide",(Object)(""));
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _initialize(anywheresoftware.b4a.BA _ba,String _pgid,String _pgcontainer) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 150;BA.debugLine="Public Sub Initialize(pgID As String, pgContainer";
 //BA.debugLineNum = 151;BA.debugLine="hints.Initialize";
_hints.Initialize();
 //BA.debugLineNum = 152;BA.debugLine="Dollar.Initialize(\"$$\")";
_dollar.Initialize((Object)("$$"));
 //BA.debugLineNum = 153;BA.debugLine="ID = pgID.tolowercase";
_id = _pgid.toLowerCase();
 //BA.debugLineNum = 154;BA.debugLine="webix.Initialize(\"webix\")";
_webix.Initialize((Object)("webix"));
 //BA.debugLineNum = 155;BA.debugLine="Page.Initialize(ID)";
_page._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 157;BA.debugLine="EnumButtonTypes.Initialize";
_enumbuttontypes._initialize /*String*/ (ba);
 //BA.debugLineNum = 158;BA.debugLine="EnumLayoutTypes.Initialize";
_enumlayouttypes._initialize /*String*/ (ba);
 //BA.debugLineNum = 159;BA.debugLine="EnumWixIcons.Initialize";
_enumwixicons._initialize /*String*/ (ba);
 //BA.debugLineNum = 160;BA.debugLine="SetContainer(pgContainer)";
_setcontainer(_pgcontainer);
 //BA.debugLineNum = 161;BA.debugLine="BuildViews";
_buildviews();
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 566;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 567;BA.debugLine="Return Page.item";
if (true) return _page._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
 //BA.debugLineNum = 131;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 132;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 133;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 134;BA.debugLine="lst.clear";
_lst.Clear();
 //BA.debugLineNum = 135;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
 //BA.debugLineNum = 136;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 138;BA.debugLine="Try";
try { //BA.debugLineNum = 139;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 140;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
 //BA.debugLineNum = 141;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 143;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 106;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 107;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 108;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 109;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 110;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 111;BA.debugLine="Try";
try { //BA.debugLineNum = 112;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 113;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 114;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 116;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 118;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public String  _list2json(anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 124;BA.debugLine="Sub List2Json(mp As List) As String";
 //BA.debugLineNum = 125;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 126;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
 //BA.debugLineNum = 127;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public Object  _localelongdateformat() throws Exception{
Object _df = null;
 //BA.debugLineNum = 209;BA.debugLine="Sub LocaleLongDateFormat() As Object   'ignore";
 //BA.debugLineNum = 210;BA.debugLine="Dim df As Object = webix.GetField(\"i18n\").GetFiel";
_df = _webix.GetField("i18n").GetField("longDateFormatStr").Result();
 //BA.debugLineNum = 211;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public Object  _localenumberformat(boolean _r) throws Exception{
Object _df = null;
 //BA.debugLineNum = 215;BA.debugLine="Sub LocaleNumberFormat(r As Boolean) As Object   '";
 //BA.debugLineNum = 216;BA.debugLine="Dim df As Object = webix.GetField(\"i18n\").GetFiel";
_df = _webix.GetField("i18n").GetField("numberFormat").Result();
 //BA.debugLineNum = 217;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public Object  _locatedateformat() throws Exception{
Object _df = null;
 //BA.debugLineNum = 203;BA.debugLine="Sub LocateDateFormat() As Object   'ignore";
 //BA.debugLineNum = 204;BA.debugLine="Dim df As Object = webix.GetField(\"i18n\").GetFiel";
_df = _webix.GetField("i18n").GetField("dateFormatStr").Result();
 //BA.debugLineNum = 205;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public Object  _longpriceformat(boolean _r) throws Exception{
Object _df = null;
 //BA.debugLineNum = 221;BA.debugLine="Sub LongPriceFormat(r As Boolean) As Object   'ign";
 //BA.debugLineNum = 222;BA.debugLine="Dim df As Object = webix.GetField(\"i18n\").GetFiel";
_df = _webix.GetField("i18n").GetField("priceFormat").Result();
 //BA.debugLineNum = 223;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 92;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 93;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 94;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 95;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _map2jsonpretty(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 98;BA.debugLine="Sub Map2JsonPretty(mp As Map) As String";
 //BA.debugLineNum = 99;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 100;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 101;BA.debugLine="Return JSON.ToPrettyString(4)";
if (true) return _json.ToPrettyString((int) (4));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _message(String _msg) throws Exception{
 //BA.debugLineNum = 644;BA.debugLine="Sub Message(msg As String)";
 //BA.debugLineNum = 645;BA.debugLine="webix.RunMethod(\"message\", Array(msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg)}));
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return "";
}
public String  _message_debug(String _msg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 665;BA.debugLine="Sub Message_Debug(msg As String)";
 //BA.debugLineNum = 666;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 667;BA.debugLine="opt.Put(\"text\", msg)";
_opt.Put((Object)("text"),(Object)(_msg));
 //BA.debugLineNum = 668;BA.debugLine="opt.Put(\"type\", \"debug\")";
_opt.Put((Object)("type"),(Object)("debug"));
 //BA.debugLineNum = 669;BA.debugLine="webix.RunMethod(\"message\", Array(opt))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_opt.getObject())}));
 //BA.debugLineNum = 670;BA.debugLine="End Sub";
return "";
}
public String  _message_error(String _msg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 649;BA.debugLine="Sub Message_Error(msg As String)";
 //BA.debugLineNum = 650;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 651;BA.debugLine="opt.Put(\"text\", msg)";
_opt.Put((Object)("text"),(Object)(_msg));
 //BA.debugLineNum = 652;BA.debugLine="opt.Put(\"type\", \"error\")";
_opt.Put((Object)("type"),(Object)("error"));
 //BA.debugLineNum = 653;BA.debugLine="webix.RunMethod(\"message\", Array(opt))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_opt.getObject())}));
 //BA.debugLineNum = 654;BA.debugLine="End Sub";
return "";
}
public String  _message_success(String _msg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 657;BA.debugLine="Sub Message_Success(msg As String)";
 //BA.debugLineNum = 658;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 659;BA.debugLine="opt.Put(\"text\", msg)";
_opt.Put((Object)("text"),(Object)(_msg));
 //BA.debugLineNum = 660;BA.debugLine="opt.Put(\"type\", \"success\")";
_opt.Put((Object)("type"),(Object)("success"));
 //BA.debugLineNum = 661;BA.debugLine="webix.RunMethod(\"message\", Array(opt))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_opt.getObject())}));
 //BA.debugLineNum = 662;BA.debugLine="End Sub";
return "";
}
public String  _modalbox(Object _msg) throws Exception{
 //BA.debugLineNum = 681;BA.debugLine="Sub ModalBox(msg As Object)";
 //BA.debugLineNum = 682;BA.debugLine="webix.RunMethod(\"modalbox\", Array(msg))";
_webix.RunMethod("modalbox",(Object)(new Object[]{_msg}));
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return "";
}
public String  _move(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 480;BA.debugLine="Sub Move(dtID As String, r As Int)";
 //BA.debugLineNum = 481;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 482;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"move\", Array(r))";
_dollar.Selector((Object)(_dtid)).RunMethod("move",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return "";
}
public String  _movebottom(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 468;BA.debugLine="Sub MoveBottom(dtID As String, r As Int)";
 //BA.debugLineNum = 469;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 470;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"moveBottom\", Arr";
_dollar.Selector((Object)(_dtid)).RunMethod("moveBottom",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return "";
}
public String  _movetop(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 474;BA.debugLine="Sub MoveTop(dtID As String, r As Int)";
 //BA.debugLineNum = 475;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 476;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"moveTop\", Array(";
_dollar.Selector((Object)(_dtid)).RunMethod("moveTop",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return "";
}
public int  _mvcount(String _strmv,String _delimiter) throws Exception{
String[] _spvalues = null;
 //BA.debugLineNum = 64;BA.debugLine="Sub MvCount(strMV As String, Delimiter As String)";
 //BA.debugLineNum = 65;BA.debugLine="Dim spValues() As String = BANano.Split(Delimiter";
_spvalues = _banano.Split(_delimiter,_strmv);
 //BA.debugLineNum = 66;BA.debugLine="Return spValues.Length";
if (true) return _spvalues.length;
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return 0;
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
int _xpos = 0;
String[] _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 18;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
 //BA.debugLineNum = 19;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 20;BA.debugLine="Dim xPos As Int: xPos = sValue.IndexOf(Delimiter)";
_xpos = 0;
 //BA.debugLineNum = 20;BA.debugLine="Dim xPos As Int: xPos = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
 //BA.debugLineNum = 21;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
 //BA.debugLineNum = 22;BA.debugLine="Dim mValues() As String";
_mvalues = new String[(int) (0)];
java.util.Arrays.fill(_mvalues,"");
 //BA.debugLineNum = 23;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 24;BA.debugLine="If sValue.EndsWith(Delimiter) Then sValue = sValu";
if (_svalue.endsWith(_delimiter)) { 
_svalue = _svalue+" ";};
 //BA.debugLineNum = 25;BA.debugLine="mValues = BANano.Split(Delimiter, sValue)";
_mvalues = _banano.Split(_delimiter,_svalue);
 //BA.debugLineNum = 26;BA.debugLine="tValues = mValues.Length -1";
_tvalues = (int) (_mvalues.length-1);
 //BA.debugLineNum = 27;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
 //BA.debugLineNum = 29;BA.debugLine="Return mValues(tValues)";
if (true) return _mvalues[_tvalues];
 break; }
case 1: {
 //BA.debugLineNum = 31;BA.debugLine="Return mValues(tValues - 1)";
if (true) return _mvalues[(int) (_tvalues-1)];
 break; }
case 2: {
 //BA.debugLineNum = 33;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 34;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 36;BA.debugLine="For startcnt = 1 To tValues";
{
final int step19 = 1;
final int limit19 = _tvalues;
_startcnt = (int) (1) ;
for (;_startcnt <= limit19 ;_startcnt = _startcnt + step19 ) {
 //BA.debugLineNum = 37;BA.debugLine="sb.Append(mValues(startcnt)).append(Delimiter)";
_sb.Append(_mvalues[_startcnt]).Append(_delimiter);
 }
};
 //BA.debugLineNum = 39;BA.debugLine="sb.Remove(sb.Length-Delimiter.Length,sb.Length)";
_sb.Remove((int) (_sb.getLength()-_delimiter.length()),_sb.getLength());
 //BA.debugLineNum = 40;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
 //BA.debugLineNum = 42;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
 //BA.debugLineNum = 43;BA.debugLine="If iPosition <= -1 Then Return mValues(tValues)";
if (_iposition<=-1) { 
if (true) return _mvalues[_tvalues];};
 //BA.debugLineNum = 44;BA.debugLine="If iPosition > tValues Then Return \"\"";
if (_iposition>_tvalues) { 
if (true) return "";};
 //BA.debugLineNum = 45;BA.debugLine="Return mValues(iPosition)";
if (true) return _mvalues[_iposition];
 break; }
}
;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _onaftereditstart(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 783;BA.debugLine="Sub OnAfterEditStart(eID As String, cb As BANanoOb";
 //BA.debugLineNum = 784;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 785;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterEditStart"),(Object)(_cb)}));
 //BA.debugLineNum = 786;BA.debugLine="End Sub";
return "";
}
public String  _onaftereditstop(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 788;BA.debugLine="Sub OnAfterEditStop(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 789;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 790;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterEditStop"),(Object)(_cb)}));
 //BA.debugLineNum = 791;BA.debugLine="End Sub";
return "";
}
public String  _onafterselect(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 773;BA.debugLine="Sub OnAfterSelect(eID As String, cb As BANanoObjec";
 //BA.debugLineNum = 774;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 775;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterSelect"),(Object)(_cb)}));
 //BA.debugLineNum = 776;BA.debugLine="End Sub";
return "";
}
public String  _onaftertabclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Sub OnAfterTabClick(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 411;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 412;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterTabClick"),(Object)(_cb)}));
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return "";
}
public String  _onafterunselect(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 806;BA.debugLine="Sub OnAfterUnSelect(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 807;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 808;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterUnSelect"),(Object)(_cb)}));
 //BA.debugLineNum = 809;BA.debugLine="End Sub";
return "";
}
public String  _onchange(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub OnChange(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 387;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 388;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onChange"),(Object)(_cb)}));
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public String  _oncheck(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub OnCheck(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 417;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 418;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onCheck"),(Object)(_cb)}));
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return "";
}
public String  _onclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 794;BA.debugLine="Sub OnClick(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 795;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 796;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onClick"),(Object)(_cb)}));
 //BA.debugLineNum = 797;BA.debugLine="End Sub";
return "";
}
public String  _onenter(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub OnEnter(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 393;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 394;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onEnter"),(Object)(_cb)}));
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return "";
}
public String  _onfileupload(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 767;BA.debugLine="Sub onFileUpload(eID As String, cb As BANanoObject";
 //BA.debugLineNum = 768;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 769;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onFileUpload"),(Object)(_cb)}));
 //BA.debugLineNum = 770;BA.debugLine="End Sub";
return "";
}
public String  _onfileuploaderror(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 755;BA.debugLine="Sub onFileUploadError(eID As String, cb As BANanoO";
 //BA.debugLineNum = 756;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 757;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onFileUploadError"),(Object)(_cb)}));
 //BA.debugLineNum = 758;BA.debugLine="End Sub";
return "";
}
public String  _onitemclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 778;BA.debugLine="Sub OnItemClick(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 779;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 780;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onItemClick"),(Object)(_cb)}));
 //BA.debugLineNum = 781;BA.debugLine="End Sub";
return "";
}
public String  _onkeypress(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Sub OnKeyPress(eid As String, cb As BANanoObject)";
 //BA.debugLineNum = 381;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 382;BA.debugLine="Dollar.Selector(eid).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onKeyPress"),(Object)(_cb)}));
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public String  _onliveedit(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub OnLiveEdit(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 399;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 400;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onLiveEdit"),(Object)(_cb)}));
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return "";
}
public String  _onmenuitemclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 799;BA.debugLine="Sub OnMenuItemClick(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 800;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 801;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onMenuItemClick"),(Object)(_cb)}));
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return "";
}
public String  _onselectchange(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="Sub OnSelectChange(eID As String, cb As BANanoObje";
 //BA.debugLineNum = 424;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 425;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onSelectChange"),(Object)(_cb)}));
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return "";
}
public String  _ontimedkeypress(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub OnTimedKeyPress(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 405;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 406;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onTimedKeyPress"),(Object)(_cb)}));
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return "";
}
public String  _onuploadcomplete(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 750;BA.debugLine="Sub OnUploadComplete(eID As String, cb As BANanoOb";
 //BA.debugLineNum = 751;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 752;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onUploadComplete"),(Object)(_cb)}));
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return "";
}
public String  _parse(String _eid,anywheresoftware.b4a.objects.collections.List _data,String _typeof) throws Exception{
 //BA.debugLineNum = 941;BA.debugLine="Sub Parse(eID As String, data As List, typeOf As S";
 //BA.debugLineNum = 942;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 943;BA.debugLine="Dollar.Selector(eID).RunMethod(\"parse\",Array(data";
_dollar.Selector((Object)(_eid)).RunMethod("parse",(Object)(new Object[]{(Object)(_data.getObject()),(Object)(_typeof)}));
 //BA.debugLineNum = 944;BA.debugLine="End Sub";
return "";
}
public String  _refresh(String _eid) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub Refresh(eID As String)";
 //BA.debugLineNum = 445;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 446;BA.debugLine="Dollar.Selector(eID).RunMethod(\"refresh\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("refresh",__c.Null);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return "";
}
public String  _remove(String _listid,String _recid) throws Exception{
 //BA.debugLineNum = 819;BA.debugLine="Sub Remove(listID As String, recID As String)";
 //BA.debugLineNum = 820;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 821;BA.debugLine="If recID = \"\" Then Return";
if ((_recid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 822;BA.debugLine="Dollar.Selector(listID).RunMethod(\"remove\",Array(";
_dollar.Selector((Object)(_listid)).RunMethod("remove",(Object)(new Object[]{(Object)(_recid)}));
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return "";
}
public String  _removeview(String _parentid,String _childid) throws Exception{
 //BA.debugLineNum = 891;BA.debugLine="Sub RemoveView(parentid As String, childid As Stri";
 //BA.debugLineNum = 892;BA.debugLine="parentid = parentid.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 893;BA.debugLine="childid = childid.tolowercase";
_childid = _childid.toLowerCase();
 //BA.debugLineNum = 894;BA.debugLine="Dollar.Selector(parentid).RunMethod(\"removeView\",";
_dollar.Selector((Object)(_parentid)).RunMethod("removeView",(Object)(new Object[]{(Object)(_childid)}));
 //BA.debugLineNum = 895;BA.debugLine="End Sub";
return "";
}
public String  _replaceview(anywheresoftware.b4a.objects.collections.Map _config,String _parentid,String _childid) throws Exception{
com.ab.banano.BANanoObject _parent = null;
com.ab.banano.BANanoObject _child = null;
 //BA.debugLineNum = 450;BA.debugLine="Sub ReplaceView(config As Map, parentid As String,";
 //BA.debugLineNum = 451;BA.debugLine="parentid = parentid.ToLowerCase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 452;BA.debugLine="childid = childid.tolowercase";
_childid = _childid.toLowerCase();
 //BA.debugLineNum = 454;BA.debugLine="Dim parent As BANanoObject = Dollar.Selector(pare";
_parent = _dollar.Selector((Object)(_parentid));
 //BA.debugLineNum = 456;BA.debugLine="Dim child As BANanoObject = Dollar.Selector(child";
_child = _dollar.Selector((Object)(_childid));
 //BA.debugLineNum = 458;BA.debugLine="webix.RunMethod(\"ui\", Array(parent,child))";
_webix.RunMethod("ui",(Object)(new Object[]{(Object)(_parent),(Object)(_child)}));
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return "";
}
public String  _resize(String _eid) throws Exception{
 //BA.debugLineNum = 911;BA.debugLine="Sub Resize(eID As String)";
 //BA.debugLineNum = 912;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 913;BA.debugLine="Dollar.Selector(eID).RunMethod(\"resize\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("resize",__c.Null);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return "";
}
public String  _save(String _frmid) throws Exception{
 //BA.debugLineNum = 954;BA.debugLine="Sub Save(frmID As String)";
 //BA.debugLineNum = 955;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 956;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"save\",Null)";
_dollar.Selector((Object)(_frmid)).RunMethod("save",__c.Null);
 //BA.debugLineNum = 957;BA.debugLine="End Sub";
return "";
}
public String  _selectitem(String _treeid,String _nodeid) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub SelectItem(treeID As String, nodeID As String)";
 //BA.debugLineNum = 357;BA.debugLine="treeID = treeID.ToLowerCase";
_treeid = _treeid.toLowerCase();
 //BA.debugLineNum = 358;BA.debugLine="nodeID = nodeID.tolowercase";
_nodeid = _nodeid.toLowerCase();
 //BA.debugLineNum = 359;BA.debugLine="Dollar.Selector(treeID).RunMethod(\"select\", Array";
_dollar.Selector((Object)(_treeid)).RunMethod("select",(Object)(new Object[]{(Object)(_nodeid)}));
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _serialize(String _eid) throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 812;BA.debugLine="Sub Serialize(eID As String) As List";
 //BA.debugLineNum = 813;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 814;BA.debugLine="Dim res As List = Dollar.Selector(eID).RunMethod(";
_res = new anywheresoftware.b4a.objects.collections.List();
_res.setObject((java.util.List)(_dollar.Selector((Object)(_eid)).RunMethod("serialize",(Object)(new Object[]{__c.Null,(Object)(__c.True)}))));
 //BA.debugLineNum = 815;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setappname(String _aname) throws Exception{
String _extrafolder = "";
 //BA.debugLineNum = 51;BA.debugLine="Sub SetAppName(aName As String) As WixPage";
 //BA.debugLineNum = 52;BA.debugLine="Dim extraFolder As String = $\"http://localhost/${";
_extrafolder = ("http://localhost/"+__c.SmartStringFormatter("",(Object)(_aname))+"/extras");
 //BA.debugLineNum = 53;BA.debugLine="SetExtrasFolder(extraFolder)";
_setextrasfolder(_extrafolder);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public String  _setbottomtext(String _eid,String _etext) throws Exception{
 //BA.debugLineNum = 876;BA.debugLine="Sub SetBottomText(eID As String, eText As String)";
 //BA.debugLineNum = 877;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 878;BA.debugLine="Dollar.Selector(eID).RunMethod(\"setBottomText\",Ar";
_dollar.Selector((Object)(_eid)).RunMethod("setBottomText",(Object)(new Object[]{(Object)(_etext)}));
 //BA.debugLineNum = 879;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _setcontainer(String _contid) throws Exception{
String _skey = "";
 //BA.debugLineNum = 325;BA.debugLine="Sub SetContainer(contID As String) As WixPage";
 //BA.debugLineNum = 326;BA.debugLine="contID = contID.tolowercase";
_contid = _contid.toLowerCase();
 //BA.debugLineNum = 327;BA.debugLine="Dim sKey As String = \"#\" & contID";
_skey = "#"+_contid;
 //BA.debugLineNum = 328;BA.debugLine="Page.SetContainer(contID)";
_page._setcontainer /*b4j.example.wixelement*/ (_contid);
 //BA.debugLineNum = 329;BA.debugLine="BANano.GetElement(sKey).empty";
_banano.GetElement(_skey).Empty();
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setextrasfolder(String _fld) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetExtrasFolder(fld As String) As WixPage";
 //BA.debugLineNum = 180;BA.debugLine="webix.GetField(\"env\").SetField(\"cdn\", fld)";
_webix.GetField("env").SetField("cdn",(Object)(_fld));
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setfullscreen(boolean _b) throws Exception{
 //BA.debugLineNum = 638;BA.debugLine="Sub SetFullScreen(b As Boolean) As WixPage			'igno";
 //BA.debugLineNum = 639;BA.debugLine="webix.RunMethod(\"ui\", Array(\"fullScreen\"))";
_webix.RunMethod("ui",(Object)(new Object[]{(Object)("fullScreen")}));
 //BA.debugLineNum = 640;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 641;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setgravity(int _g) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetGravity(g As Int) As WixPage";
 //BA.debugLineNum = 266;BA.debugLine="Page.SetGravity(g)";
_page._setgravity /*b4j.example.wixelement*/ (_g);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setheader(String _stitle) throws Exception{
b4j.example.wixheader _hdr = null;
 //BA.debugLineNum = 486;BA.debugLine="Sub SetHeader(sTitle As String) As WixPage";
 //BA.debugLineNum = 488;BA.debugLine="Dim hdr As WixHeader";
_hdr = new b4j.example.wixheader();
 //BA.debugLineNum = 489;BA.debugLine="hdr.Initialize(\"hdr\")";
_hdr._initialize /*b4j.example.wixheader*/ (ba,"hdr");
 //BA.debugLineNum = 490;BA.debugLine="hdr.Header.SetTemplate(sTitle)";
_hdr._header /*b4j.example.wixelement*/ ._settemplate /*b4j.example.wixelement*/ ((Object)(_stitle));
 //BA.debugLineNum = 491;BA.debugLine="hdr.Header.AddToRows(Page)";
_hdr._header /*b4j.example.wixelement*/ ._addtorows /*String*/ (_page);
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetHeight(h As Object) As WixPage";
 //BA.debugLineNum = 308;BA.debugLine="Page.setHeight(h)";
_page._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public String  _sethint(String _eid,String _shint) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub SetHint(eID As String, sHint As String)";
 //BA.debugLineNum = 376;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 377;BA.debugLine="hints.Put(eID,sHint)";
_hints.Put((Object)(_eid),(Object)(_shint));
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _setlocale(String _locale) throws Exception{
com.ab.banano.BANanoObject _i18n = null;
 //BA.debugLineNum = 185;BA.debugLine="Sub SetLocale(locale As String) As WixPage";
 //BA.debugLineNum = 186;BA.debugLine="Dim i18n As BANanoObject = webix.GetField(\"i18n\")";
_i18n = _webix.GetField("i18n");
 //BA.debugLineNum = 187;BA.debugLine="i18n.RunMethod(\"setLocale\", Array(locale))";
_i18n.RunMethod("setLocale",(Object)(new Object[]{(Object)(_locale)}));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 539;BA.debugLine="Sub SetMap(m As Map) As WixPage";
 //BA.debugLineNum = 540;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 541;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 542;BA.debugLine="Page.SetAttr(strKey,	strVal)";
_page._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 544;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 545;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetMinHeight(h As Int) As WixPage";
 //BA.debugLineNum = 247;BA.debugLine="Page.SetMinHeight(h)";
_page._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetMinWidth(w As Int) As WixPage";
 //BA.debugLineNum = 241;BA.debugLine="Page.SetMinWidth(w)";
_page._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setname(String _n) throws Exception{
 //BA.debugLineNum = 1104;BA.debugLine="Sub SetName(n As String) As WixPage";
 //BA.debugLineNum = 1105;BA.debugLine="Page.SetName(n)";
_page._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 1106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 1107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetResponsive(b As Object) As WixPage";
 //BA.debugLineNum = 228;BA.debugLine="Page.SetResponsive(b)";
_page._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixPage";
 //BA.debugLineNum = 234;BA.debugLine="Page.SetResponsiveCell(b)";
_page._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetScroll(b As Object) As WixPage";
 //BA.debugLineNum = 260;BA.debugLine="Page.SetProperty(\"scroll\", b)";
_page._setproperty /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 320;BA.debugLine="Page.SetStyle(prop,val)";
_page._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _settype(String _t) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub SetType(t As String) As WixPage";
 //BA.debugLineNum = 497;BA.debugLine="Page.SetType(t)";
_page._settype /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 498;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 503;BA.debugLine="Sub SetTypeClean(a As String) As WixPage  'ignore";
 //BA.debugLineNum = 504;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 505;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 506;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 533;BA.debugLine="Sub SetTypeForm(a As String) As WixPage  'ignore";
 //BA.debugLineNum = 534;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 535;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="Sub SetTypeHead(a As String) As WixPage   'ignore";
 //BA.debugLineNum = 528;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 529;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 509;BA.debugLine="Sub SetTypeLine(a As String) As WixPage   'ignore";
 //BA.debugLineNum = 510;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 511;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 521;BA.debugLine="Sub SetTypeSpace(a As String) As WixPage   'ignore";
 //BA.debugLineNum = 522;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 523;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 515;BA.debugLine="Sub SetTypeWide(a As String) As WixPage   'ignore";
 //BA.debugLineNum = 516;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return null;
}
public String  _setuniteby(String _ulid,String _fldname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _obj = null;
com.ab.banano.BANanoObject _cb = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 285;BA.debugLine="Sub SetUniteBy(ulID As String, fldName As String)";
 //BA.debugLineNum = 286;BA.debugLine="ulID = ulID.tolowercase";
_ulid = _ulid.toLowerCase();
 //BA.debugLineNum = 287;BA.debugLine="fldName = fldName.tolowercase";
_fldname = _fldname.toLowerCase();
 //BA.debugLineNum = 288;BA.debugLine="uniteFld = fldName";
_unitefld = _fldname;
 //BA.debugLineNum = 289;BA.debugLine="ulName = ulID";
_ulname = _ulid;
 //BA.debugLineNum = 291;BA.debugLine="Dim obj As Map";
_obj = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 292;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"uni";
_cb = (com.ab.banano.BANanoObject)(_banano.CallBack(this,"uniteby",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_obj.getObject())})));
 //BA.debugLineNum = 293;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 294;BA.debugLine="opt.Put(\"uniteBy\", cb)";
_opt.Put((Object)("uniteBy"),(Object)(_cb));
 //BA.debugLineNum = 295;BA.debugLine="Define(ulName, opt)";
_define(_ulname,_opt);
 //BA.debugLineNum = 296;BA.debugLine="Refresh(ulName)";
_refresh(_ulname);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(String _itm,String _value) throws Exception{
 //BA.debugLineNum = 576;BA.debugLine="Sub SetValue(itm As String, value As String)";
 //BA.debugLineNum = 577;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 578;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValue\",Array(v";
_dollar.Selector((Object)(_itm)).RunMethod("setValue",(Object)(new Object[]{(Object)(_value)}));
 //BA.debugLineNum = 579;BA.debugLine="End Sub";
return "";
}
public String  _setvalues(String _itm,anywheresoftware.b4a.objects.collections.Map _values) throws Exception{
 //BA.debugLineNum = 590;BA.debugLine="Sub SetValues(itm As String, values As Map)";
 //BA.debugLineNum = 591;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 592;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValues\",Array(";
_dollar.Selector((Object)(_itm)).RunMethod("setValues",(Object)(new Object[]{(Object)(_values.getObject())}));
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return "";
}
public String  _setvaluesjson(String _t,String _j) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mm = null;
 //BA.debugLineNum = 58;BA.debugLine="Sub SetValuesJSON(t As String, j As String)";
 //BA.debugLineNum = 59;BA.debugLine="t = t.ToLowerCase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 60;BA.debugLine="Dim mm As Map = Json2Map(j)";
_mm = new anywheresoftware.b4a.objects.collections.Map();
_mm = _json2map(_j);
 //BA.debugLineNum = 61;BA.debugLine="SetValues(t,mm)";
_setvalues(_t,_mm);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _setview(String _v) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetView(v As String) As WixPage";
 //BA.debugLineNum = 272;BA.debugLine="Page.SetView(v)";
_page._setview /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpage  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetWidth(w As Object) As WixPage";
 //BA.debugLineNum = 314;BA.debugLine="Page.SetWidth(w)";
_page._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public String  _show(String _itmid) throws Exception{
 //BA.debugLineNum = 610;BA.debugLine="Sub Show(itmID As String)";
 //BA.debugLineNum = 611;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 612;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"show\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("show",(Object)(""));
 //BA.debugLineNum = 613;BA.debugLine="End Sub";
return "";
}
public String  _showitem(String _listid,String _eid) throws Exception{
 //BA.debugLineNum = 854;BA.debugLine="Sub ShowItem(listID As String, eID As String)";
 //BA.debugLineNum = 855;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 856;BA.debugLine="Dollar.Selector(listID).RunMethod(\"showItem\",Arra";
_dollar.Selector((Object)(_listid)).RunMethod("showItem",(Object)(new Object[]{(Object)(_eid)}));
 //BA.debugLineNum = 857;BA.debugLine="End Sub";
return "";
}
public String  _showpopup(String _stemplate,int _height,int _width,String _position) throws Exception{
b4j.example.wixpopup _p = null;
com.ab.banano.BANanoObject _pp = null;
 //BA.debugLineNum = 1030;BA.debugLine="Sub ShowPopUp(sTemplate As String, height As Int,";
 //BA.debugLineNum = 1031;BA.debugLine="Dim p As WixPopUp";
_p = new b4j.example.wixpopup();
 //BA.debugLineNum = 1032;BA.debugLine="p.Initialize(\"popupi\").SetHeight(height).SetWidth";
_p._initialize /*b4j.example.wixpopup*/ (ba,"popupi")._setheight /*b4j.example.wixpopup*/ ((Object)(_height))._setwidth /*b4j.example.wixpopup*/ ((Object)(_width))._setposition /*b4j.example.wixpopup*/ (_position)._settemplate /*b4j.example.wixpopup*/ (_stemplate);
 //BA.debugLineNum = 1033;BA.debugLine="Dim pp As BANanoObject = webix.RunMethod(\"ui\",p.i";
_pp = _webix.RunMethod("ui",(Object)(_p._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 1034;BA.debugLine="pp.RunMethod(\"show\", Null)";
_pp.RunMethod("show",__c.Null);
 //BA.debugLineNum = 1035;BA.debugLine="End Sub";
return "";
}
public String  _starthint(b4j.example.wixhint _h) throws Exception{
com.ab.banano.BANanoObject _oh = null;
 //BA.debugLineNum = 898;BA.debugLine="Sub StartHint(h As WixHint)";
 //BA.debugLineNum = 900;BA.debugLine="Dim oh As BANanoObject = UX(h.Item)";
_oh = _ux(_h._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 901;BA.debugLine="oh.RunMethod(\"start\", Null)";
_oh.RunMethod("start",__c.Null);
 //BA.debugLineNum = 902;BA.debugLine="End Sub";
return "";
}
public String  _toasterror(String _text) throws Exception{
anywheresoftware.b4a.objects.collections.Map _msg = null;
 //BA.debugLineNum = 687;BA.debugLine="Sub ToastError(Text As String)";
 //BA.debugLineNum = 688;BA.debugLine="Dim msg As Map = CreateMap()";
_msg = new anywheresoftware.b4a.objects.collections.Map();
_msg = __c.createMap(new Object[] {});
 //BA.debugLineNum = 689;BA.debugLine="msg.put(\"type\",\"error\")";
_msg.Put((Object)("type"),(Object)("error"));
 //BA.debugLineNum = 690;BA.debugLine="msg.put(\"text\", Text)";
_msg.Put((Object)("text"),(Object)(_text));
 //BA.debugLineNum = 691;BA.debugLine="webix.RunMethod(\"message\", Array(msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg.getObject())}));
 //BA.debugLineNum = 692;BA.debugLine="End Sub";
return "";
}
public String  _toggle(String _sbid) throws Exception{
 //BA.debugLineNum = 966;BA.debugLine="Sub Toggle(sbID As String)";
 //BA.debugLineNum = 967;BA.debugLine="sbID = sbID.tolowercase";
_sbid = _sbid.toLowerCase();
 //BA.debugLineNum = 968;BA.debugLine="Dollar.Selector(sbID).RunMethod(\"toggle\",Null)";
_dollar.Selector((Object)(_sbid)).RunMethod("toggle",__c.Null);
 //BA.debugLineNum = 969;BA.debugLine="End Sub";
return "";
}
public String  _ui() throws Exception{
String _shint = "";
String _svalue = "";
 //BA.debugLineNum = 628;BA.debugLine="Sub UI()";
 //BA.debugLineNum = 629;BA.debugLine="webix.RunMethod(\"ui\",Array(Page.item))";
_webix.RunMethod("ui",(Object)(new Object[]{(Object)(_page._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject())}));
 //BA.debugLineNum = 631;BA.debugLine="For Each sHint As String In hints.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _hints.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_shint = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 632;BA.debugLine="Dim sValue As String = hints.Get(sHint)";
_svalue = BA.ObjectToString(_hints.Get((Object)(_shint)));
 //BA.debugLineNum = 633;BA.debugLine="SetBottomText(sHint, sValue)";
_setbottomtext(_shint,_svalue);
 }
};
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return "";
}
public String  _uniteby(anywheresoftware.b4a.objects.collections.Map _obj) throws Exception{
String _stitle = "";
String _ub = "";
 //BA.debugLineNum = 299;BA.debugLine="private Sub uniteby(obj As Map) As String";
 //BA.debugLineNum = 300;BA.debugLine="Dim stitle As String = obj.Get(uniteFld)";
_stitle = BA.ObjectToString(_obj.Get((Object)(_unitefld)));
 //BA.debugLineNum = 301;BA.debugLine="Dim ub As String = stitle.SubString2(0,1)";
_ub = _stitle.substring((int) (0),(int) (1));
 //BA.debugLineNum = 302;BA.debugLine="Return ub";
if (true) return _ub;
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return "";
}
public String  _update(String _eid,anywheresoftware.b4a.objects.collections.Map _propertymap) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub Update(eid As String, propertyMap As Map)";
 //BA.debugLineNum = 341;BA.debugLine="eid = eid.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 342;BA.debugLine="Define(eid, propertyMap)";
_define(_eid,_propertymap);
 //BA.debugLineNum = 343;BA.debugLine="Refresh(eid)";
_refresh(_eid);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return "";
}
public String  _updateitem(String _ownerid,String _recid,anywheresoftware.b4a.objects.collections.Map _recdata) throws Exception{
 //BA.debugLineNum = 726;BA.debugLine="Sub UpdateItem(ownerID As String, recID As String,";
 //BA.debugLineNum = 727;BA.debugLine="ownerID = ownerID.ToLowerCase";
_ownerid = _ownerid.toLowerCase();
 //BA.debugLineNum = 728;BA.debugLine="recID = recID.tolowercase";
_recid = _recid.toLowerCase();
 //BA.debugLineNum = 729;BA.debugLine="Dollar.Selector(ownerID).RunMethod(\"updateItem\",A";
_dollar.Selector((Object)(_ownerid)).RunMethod("updateItem",(Object)(new Object[]{(Object)(_recid),(Object)(_recdata.getObject())}));
 //BA.debugLineNum = 730;BA.debugLine="End Sub";
return "";
}
public String  _updateproperty(String _eid,String _prop,String _val) throws Exception{
anywheresoftware.b4a.objects.collections.Map _pv = null;
 //BA.debugLineNum = 347;BA.debugLine="Sub UpdateProperty(eID As String, prop As String,";
 //BA.debugLineNum = 348;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 349;BA.debugLine="Dim pv As Map = CreateMap()";
_pv = new anywheresoftware.b4a.objects.collections.Map();
_pv = __c.createMap(new Object[] {});
 //BA.debugLineNum = 350;BA.debugLine="pv.Put(prop, val)";
_pv.Put((Object)(_prop),(Object)(_val));
 //BA.debugLineNum = 351;BA.debugLine="Define(eID, pv)";
_define(_eid,_pv);
 //BA.debugLineNum = 352;BA.debugLine="Refresh(eID)";
_refresh(_eid);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _ux(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
com.ab.banano.BANanoObject _res = null;
 //BA.debugLineNum = 1044;BA.debugLine="Sub UX(m As Map) As BANanoObject";
 //BA.debugLineNum = 1045;BA.debugLine="Dim res As BANanoObject = webix.RunMethod(\"ui\", A";
_res = _webix.RunMethod("ui",(Object)(new Object[]{(Object)(_m.getObject())}));
 //BA.debugLineNum = 1046;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1047;BA.debugLine="End Sub";
return null;
}
public boolean  _validate(String _sbid) throws Exception{
boolean _res = false;
 //BA.debugLineNum = 972;BA.debugLine="Sub Validate(sbID As String) As Boolean";
 //BA.debugLineNum = 973;BA.debugLine="sbID = sbID.tolowercase";
_sbid = _sbid.toLowerCase();
 //BA.debugLineNum = 974;BA.debugLine="Dim res As Boolean = Dollar.Selector(sbID).RunMet";
_res = BA.ObjectToBoolean(_dollar.Selector((Object)(_sbid)).RunMethod("validate",__c.Null).Result());
 //BA.debugLineNum = 975;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 976;BA.debugLine="End Sub";
return false;
}
public com.ab.banano.BANanoObject  _view(String _eid) throws Exception{
String _v = "";
com.ab.banano.BANanoObject _res = null;
 //BA.debugLineNum = 923;BA.debugLine="Sub View(eID As String) As BANanoObject";
 //BA.debugLineNum = 924;BA.debugLine="Dim v As String = \"$\" & \"view\"";
_v = "$"+"view";
 //BA.debugLineNum = 925;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 926;BA.debugLine="Dim res As BANanoObject = Dollar.Selector(eID).Ge";
_res = _dollar.Selector((Object)(_eid)).GetField(_v);
 //BA.debugLineNum = 927;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 928;BA.debugLine="End Sub";
return null;
}
public String  _windowfullscreen(String _wid) throws Exception{
 //BA.debugLineNum = 979;BA.debugLine="Sub WindowFullScreen(wID As String)";
 //BA.debugLineNum = 980;BA.debugLine="wID = wID.ToLowerCase";
_wid = _wid.toLowerCase();
 //BA.debugLineNum = 981;BA.debugLine="Define(wID, CreateMap(\"fullscreen\":True,\"top\":0,\"";
_define(_wid,__c.createMap(new Object[] {(Object)("fullscreen"),(Object)(__c.True),(Object)("top"),(Object)(0),(Object)("left"),(Object)(0)}));
 //BA.debugLineNum = 982;BA.debugLine="Resize(wID)";
_resize(_wid);
 //BA.debugLineNum = 983;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
