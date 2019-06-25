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
public b4j.example.main _main = null;
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
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgtreetable _pgtreetable = null;
public String  _add(String _listid,anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub Add(listID As String, record As Map)";
 //BA.debugLineNum = 180;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 181;BA.debugLine="Dollar.Selector(listID).RunMethod(\"add\",Array(rec";
_dollar.Selector((Object)(_listid)).RunMethod("add",(Object)(new Object[]{(Object)(_record.getObject())}));
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _adjust(String _eid) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub Adjust(eID As String)";
 //BA.debugLineNum = 299;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 300;BA.debugLine="Dollar.Selector(eID).RunMethod(\"adjust\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("adjust",__c.Null);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return "";
}
public String  _attachonchangeevent(String _eid,com.ab.banano.BANanoObject _onchange) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub AttachOnChangeEvent(eID As String, onChange As";
 //BA.debugLineNum = 43;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 44;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onChange"),(Object)(_onchange)}));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _bind(String _frmid,String _dattableid) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub Bind(frmID As String, datTableID As String)";
 //BA.debugLineNum = 323;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 324;BA.debugLine="datTableID = datTableID.ToLowerCase";
_dattableid = _dattableid.toLowerCase();
 //BA.debugLineNum = 325;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"bind\",Array(dat";
_dollar.Selector((Object)(_frmid)).RunMethod("bind",(Object)(new Object[]{(Object)(_dattableid)}));
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _clear(String _itm) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Clear(itm As String)";
 //BA.debugLineNum = 174;BA.debugLine="itm = itm.tolowercase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 175;BA.debugLine="Dollar.Selector(itm).RunMethod(\"clear\",Null)";
_dollar.Selector((Object)(_itm)).RunMethod("clear",__c.Null);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public String  _clearall(String _eid) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub ClearAll(eID As String)";
 //BA.debugLineNum = 311;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 312;BA.debugLine="Dollar.Selector(eID).RunMethod(\"clearAll\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("clearAll",__c.Null);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return "";
}
public String  _confirm(com.ab.banano.BANanoObject _callback,String _stitle,String _stext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 164;BA.debugLine="Sub Confirm(CallBack As BANanoObject, stitle As St";
 //BA.debugLineNum = 165;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 166;BA.debugLine="opt.Put(\"title\", stitle)";
_opt.Put((Object)("title"),(Object)(_stitle));
 //BA.debugLineNum = 167;BA.debugLine="opt.Put(\"text\", stext)";
_opt.Put((Object)("text"),(Object)(_stext));
 //BA.debugLineNum = 168;BA.debugLine="opt.Put(\"callback\", CallBack)";
_opt.Put((Object)("callback"),(Object)(_callback));
 //BA.debugLineNum = 169;BA.debugLine="webix.RunMethod(\"confirm\", opt)";
_webix.RunMethod("confirm",(Object)(_opt.getObject()));
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 185;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public String  _define(String _eid,anywheresoftware.b4a.objects.collections.Map _properties) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub Define(eID As String, properties As Map)";
 //BA.debugLineNum = 31;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 32;BA.debugLine="Dollar.Selector(eID).RunMethod(\"define\",Array(pro";
_dollar.Selector((Object)(_eid)).RunMethod("define",(Object)(new Object[]{(Object)(_properties.getObject())}));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _disableit(String _itmid) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub DisableIT(itmID As String)";
 //BA.debugLineNum = 136;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 137;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"disable\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("disable",(Object)(""));
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _enableit(String _itmid) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub EnableIT(itmID As String)";
 //BA.debugLineNum = 130;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 131;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"enable\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("enable",(Object)(""));
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public Object  _exists(String _listid,String _eid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 263;BA.debugLine="Sub Exists(listID As String, eID As String) As Obj";
 //BA.debugLineNum = 264;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 265;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("exists",(Object)(new Object[]{(Object)(_eid)})).Result());
 //BA.debugLineNum = 266;BA.debugLine="Return recID";
if (true) return (Object)(_recid);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public String  _export2csv(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 368;BA.debugLine="Sub Export2CSV(eID As String)";
 //BA.debugLineNum = 369;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 371;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 373;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID & \".pn";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid+".png")});
 //BA.debugLineNum = 375;BA.debugLine="webix.RunMethod(\"toCSV\", Array(itm, opt))";
_webix.RunMethod("toCSV",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return "";
}
public String  _export2excel(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 346;BA.debugLine="Sub Export2Excel(eID As String)";
 //BA.debugLineNum = 347;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 349;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 351;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID & \".pn";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid+".png")});
 //BA.debugLineNum = 353;BA.debugLine="webix.RunMethod(\"toExcel\", Array(itm, opt))";
_webix.RunMethod("toExcel",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return "";
}
public String  _export2pdf(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 357;BA.debugLine="Sub Export2PDF(eID As String)";
 //BA.debugLineNum = 358;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 360;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 362;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID & \".pn";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid+".png")});
 //BA.debugLineNum = 364;BA.debugLine="webix.RunMethod(\"toPDF\", Array(itm, opt))";
_webix.RunMethod("toPDF",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return "";
}
public String  _export2png(String _eid) throws Exception{
com.ab.banano.BANanoObject _itm = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 335;BA.debugLine="Sub Export2PNG(eID As String)";
 //BA.debugLineNum = 336;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 338;BA.debugLine="Dim itm As BANanoObject = Dollar.Selector(eID)";
_itm = _dollar.Selector((Object)(_eid));
 //BA.debugLineNum = 340;BA.debugLine="Dim opt As Map = CreateMap(\"filename\": eID & \".pn";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {(Object)("filename"),(Object)(_eid+".png")});
 //BA.debugLineNum = 342;BA.debugLine="webix.RunMethod(\"toPNG\", Array(itm, opt))";
_webix.RunMethod("toPNG",(Object)(new Object[]{(Object)(_itm),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public String  _freezerow(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub FreezeRow(dtID As String, r As Int)";
 //BA.debugLineNum = 56;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 57;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"freezeRow\", Arra";
_dollar.Selector((Object)(_dtid)).RunMethod("freezeRow",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcleanvalues(String _frmid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 284;BA.debugLine="Sub GetCleanValues(frmID As String) As Map";
 //BA.debugLineNum = 285;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 286;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 287;BA.debugLine="rec = Dollar.Selector(frmID).RunMethod(\"getCleanV";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_frmid)).RunMethod("getCleanValues",__c.Null).Result()));
 //BA.debugLineNum = 288;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdirtyvalues(String _frmid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 276;BA.debugLine="Sub GetDirtyValues(frmID As String) As Map";
 //BA.debugLineNum = 277;BA.debugLine="frmID = frmID.ToLowerCase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 278;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 279;BA.debugLine="rec = Dollar.Selector(frmID).RunMethod(\"getDirtyV";
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_frmid)).RunMethod("getDirtyValues",__c.Null).Result()));
 //BA.debugLineNum = 280;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getitem(String _listid,String _recordid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 196;BA.debugLine="Sub GetItem(listID As String, recordID As String)";
 //BA.debugLineNum = 197;BA.debugLine="listID = listID.ToLowerCase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 198;BA.debugLine="recordID = recordID.tolowercase";
_recordid = _recordid.toLowerCase();
 //BA.debugLineNum = 199;BA.debugLine="Dim values As Map = Dollar.Selector(listID).RunMe";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getItem",(Object)(new Object[]{(Object)(_recordid)})).Result()));
 //BA.debugLineNum = 200;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public Object  _getselected(String _listid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 249;BA.debugLine="Sub GetSelected(listID As String) As Object";
 //BA.debugLineNum = 250;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 251;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("getSelected",__c.Null).Result());
 //BA.debugLineNum = 252;BA.debugLine="Return recID";
if (true) return (Object)(_recid);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public String  _getselectedid(String _listid) throws Exception{
String _recid = "";
 //BA.debugLineNum = 242;BA.debugLine="Sub GetSelectedID(listID As String) As String";
 //BA.debugLineNum = 243;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 244;BA.debugLine="Dim recID As String = Dollar.Selector(listID).Run";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_listid)).RunMethod("getSelectedId",__c.Null).Result());
 //BA.debugLineNum = 245;BA.debugLine="Return recID";
if (true) return _recid;
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getselecteditem(String _listid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _recid = null;
 //BA.debugLineNum = 256;BA.debugLine="Sub GetSelectedItem(listID As String) As Map";
 //BA.debugLineNum = 257;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 258;BA.debugLine="Dim recID As Map = Dollar.Selector(listID).RunMet";
_recid = new anywheresoftware.b4a.objects.collections.Map();
_recid.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_listid)).RunMethod("getSelectedItem",__c.Null).Result()));
 //BA.debugLineNum = 259;BA.debugLine="Return recID";
if (true) return _recid;
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public String  _getvalue(String _itm) throws Exception{
String _res = "";
 //BA.debugLineNum = 95;BA.debugLine="Sub GetValue(itm As String) As String";
 //BA.debugLineNum = 96;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 97;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 98;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValue\",N";
_res = BA.ObjectToString(_dollar.Selector((Object)(_itm)).RunMethod("getValue",__c.Null).Result());
 //BA.debugLineNum = 99;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getvalues(String _itm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _res = null;
 //BA.debugLineNum = 109;BA.debugLine="Sub GetValues(itm As String) As Map";
 //BA.debugLineNum = 110;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 111;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 112;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValues\",";
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_itm)).RunMethod("getValues",__c.Null).Result()));
 //BA.debugLineNum = 113;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public String  _hideit(String _itmid) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub HideIT(itmID As String)";
 //BA.debugLineNum = 118;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 119;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"hide\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("hide",(Object)(""));
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _initialize(anywheresoftware.b4a.BA _ba,String _pgid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(pgID As String) As WixPage";
 //BA.debugLineNum = 15;BA.debugLine="hints.Initialize";
_hints.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="Dollar.Initialize(\"$$\")";
_dollar.Initialize((Object)("$$"));
 //BA.debugLineNum = 17;BA.debugLine="ID = pgID.tolowercase";
_id = _pgid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="webix.Initialize(\"webix\")";
_webix.Initialize((Object)("webix"));
 //BA.debugLineNum = 19;BA.debugLine="Page.Initialize(ID)";
_page._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 20;BA.debugLine="Page.Container = \"body\"";
_page._container /*String*/  = "body";
 //BA.debugLineNum = 22;BA.debugLine="BANano.GetElement(\"#body\").empty";
_banano.GetElement("#body").Empty();
 //BA.debugLineNum = 24;BA.debugLine="EnumButtonTypes.Initialize";
_enumbuttontypes._initialize /*String*/ (ba);
 //BA.debugLineNum = 25;BA.debugLine="EnumLayoutTypes.Initialize";
_enumlayouttypes._initialize /*String*/ (ba);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _message(String _msg) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Message(msg As String)";
 //BA.debugLineNum = 152;BA.debugLine="webix.RunMethod(\"message\", Array(msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg)}));
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _move(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub Move(dtID As String, r As Int)";
 //BA.debugLineNum = 74;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 75;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"move\", Array(r))";
_dollar.Selector((Object)(_dtid)).RunMethod("move",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _movebottom(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub MoveBottom(dtID As String, r As Int)";
 //BA.debugLineNum = 62;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 63;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"moveBottom\", Arr";
_dollar.Selector((Object)(_dtid)).RunMethod("moveBottom",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _movetop(String _dtid,int _r) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub MoveTop(dtID As String, r As Int)";
 //BA.debugLineNum = 68;BA.debugLine="dtID = dtID.ToLowerCase";
_dtid = _dtid.toLowerCase();
 //BA.debugLineNum = 69;BA.debugLine="Dollar.Selector(dtID).RunMethod(\"moveTop\", Array(";
_dollar.Selector((Object)(_dtid)).RunMethod("moveTop",(Object)(new Object[]{(Object)(_r)}));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _onafterselect(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub OnAfterSelect(eID As String, cb As BANanoObjec";
 //BA.debugLineNum = 205;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 206;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterSelect"),(Object)(_cb)}));
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public String  _onafterunselect(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub OnAfterUnSelect(eID As String, cb As BANanoObj";
 //BA.debugLineNum = 217;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 218;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterUnSelect"),(Object)(_cb)}));
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public String  _onitemclick(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub OnItemClick(eID As String, cb As BANanoObject)";
 //BA.debugLineNum = 210;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 211;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onItemClick"),(Object)(_cb)}));
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public String  _onselectchange(String _eid,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub OnSelectChange(eID As String, cb As BANanoObje";
 //BA.debugLineNum = 223;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 224;BA.debugLine="Dollar.Selector(eID).RunMethod(\"attachEvent\",Arra";
_dollar.Selector((Object)(_eid)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onSelectChange"),(Object)(_cb)}));
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public String  _parse(String _eid,anywheresoftware.b4a.objects.collections.List _data,String _typeof) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub Parse(eID As String, data As List, typeOf As S";
 //BA.debugLineNum = 317;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 318;BA.debugLine="Dollar.Selector(eID).RunMethod(\"parse\",Array(data";
_dollar.Selector((Object)(_eid)).RunMethod("parse",(Object)(new Object[]{(Object)(_data.getObject()),(Object)(_typeof)}));
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return "";
}
public String  _refresh(String _eid) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Refresh(eID As String)";
 //BA.debugLineNum = 50;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 51;BA.debugLine="Dollar.Selector(eID).RunMethod(\"refresh\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("refresh",__c.Null);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _remove(String _listid,String _recid) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub Remove(listID As String, recID As String)";
 //BA.debugLineNum = 236;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 237;BA.debugLine="If recID = \"\" Then Return";
if ((_recid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 238;BA.debugLine="Dollar.Selector(listID).RunMethod(\"remove\",Array(";
_dollar.Selector((Object)(_listid)).RunMethod("remove",(Object)(new Object[]{(Object)(_recid)}));
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public String  _resize(String _eid) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub Resize(eID As String)";
 //BA.debugLineNum = 305;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 306;BA.debugLine="Dollar.Selector(eID).RunMethod(\"resize\",Null)";
_dollar.Selector((Object)(_eid)).RunMethod("resize",__c.Null);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return "";
}
public String  _save(String _frmid) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub Save(frmID As String)";
 //BA.debugLineNum = 330;BA.debugLine="frmID = frmID.tolowercase";
_frmid = _frmid.toLowerCase();
 //BA.debugLineNum = 331;BA.debugLine="Dollar.Selector(frmID).RunMethod(\"save\",Null)";
_dollar.Selector((Object)(_frmid)).RunMethod("save",__c.Null);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _serialize(String _eid,boolean _ball) throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 228;BA.debugLine="Sub Serialize(eID As String, bAll As Boolean) As L";
 //BA.debugLineNum = 229;BA.debugLine="eID = eID.ToLowerCase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 230;BA.debugLine="Dim res As List = Dollar.Selector(eID).RunMethod(";
_res = new anywheresoftware.b4a.objects.collections.List();
_res.setObject((java.util.List)(_dollar.Selector((Object)(_eid)).RunMethod("serialize",(Object)(new Object[]{(Object)(_ball)})).Result()));
 //BA.debugLineNum = 231;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public String  _setbottomtext(String _eid,String _etext) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetBottomText(eID As String, eText As String)";
 //BA.debugLineNum = 293;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 294;BA.debugLine="Dollar.Selector(eID).RunMethod(\"setBottomText\",Ar";
_dollar.Selector((Object)(_eid)).RunMethod("setBottomText",(Object)(new Object[]{(Object)(_etext)}));
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _setheader(String _stitle) throws Exception{
b4j.example.wixheader _hdr = null;
 //BA.debugLineNum = 79;BA.debugLine="Sub SetHeader(sTitle As String) As WixPage";
 //BA.debugLineNum = 81;BA.debugLine="Dim hdr As WixHeader";
_hdr = new b4j.example.wixheader();
 //BA.debugLineNum = 82;BA.debugLine="hdr.Initialize(\"hdr\")";
_hdr._initialize /*b4j.example.wixheader*/ (ba,"hdr");
 //BA.debugLineNum = 83;BA.debugLine="hdr.Header.SetTemplate(sTitle)";
_hdr._header /*b4j.example.wixelement*/ ._settemplate /*b4j.example.wixelement*/ ((Object)(_stitle));
 //BA.debugLineNum = 84;BA.debugLine="hdr.Header.AddToRows(Page)";
_hdr._header /*b4j.example.wixelement*/ ._addtorows /*String*/ (_page);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public String  _sethint(String _eid,String _shint) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetHint(eID As String, sHint As String)";
 //BA.debugLineNum = 37;BA.debugLine="eID = eID.tolowercase";
_eid = _eid.toLowerCase();
 //BA.debugLineNum = 38;BA.debugLine="hints.Put(eID,sHint)";
_hints.Put((Object)(_eid),(Object)(_shint));
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(String _itm,String _value) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetValue(itm As String, value As String)";
 //BA.debugLineNum = 90;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 91;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValue\",Array(v";
_dollar.Selector((Object)(_itm)).RunMethod("setValue",(Object)(new Object[]{(Object)(_value)}));
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _setvalues(String _itm,anywheresoftware.b4a.objects.collections.Map _values) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetValues(itm As String, values As Map)";
 //BA.debugLineNum = 104;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 105;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValues\",Array(";
_dollar.Selector((Object)(_itm)).RunMethod("setValues",(Object)(new Object[]{(Object)(_values.getObject())}));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _showit(String _itmid) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub ShowIT(itmID As String)";
 //BA.debugLineNum = 124;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 125;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"show\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("show",(Object)(""));
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _showitem(String _listid,String _eid) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub ShowItem(listID As String, eID As String)";
 //BA.debugLineNum = 271;BA.debugLine="listID = listID.tolowercase";
_listid = _listid.toLowerCase();
 //BA.debugLineNum = 272;BA.debugLine="Dollar.Selector(listID).RunMethod(\"showItem\",Arra";
_dollar.Selector((Object)(_listid)).RunMethod("showItem",(Object)(new Object[]{(Object)(_eid)}));
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public String  _toasterror(String _text) throws Exception{
anywheresoftware.b4a.objects.collections.Map _msg = null;
 //BA.debugLineNum = 156;BA.debugLine="Sub ToastError(Text As String)";
 //BA.debugLineNum = 157;BA.debugLine="Dim msg As Map = CreateMap()";
_msg = new anywheresoftware.b4a.objects.collections.Map();
_msg = __c.createMap(new Object[] {});
 //BA.debugLineNum = 158;BA.debugLine="msg.put(\"type\",\"error\")";
_msg.Put((Object)("type"),(Object)("error"));
 //BA.debugLineNum = 159;BA.debugLine="msg.put(\"text\", Text)";
_msg.Put((Object)("text"),(Object)(_text));
 //BA.debugLineNum = 160;BA.debugLine="webix.RunMethod(\"message\", Array(msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg.getObject())}));
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _ui() throws Exception{
String _shint = "";
String _svalue = "";
 //BA.debugLineNum = 141;BA.debugLine="Sub UI";
 //BA.debugLineNum = 142;BA.debugLine="webix.RunMethod(\"ui\",Page.item)";
_webix.RunMethod("ui",(Object)(_page._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 144;BA.debugLine="For Each sHint As String In hints.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _hints.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_shint = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 145;BA.debugLine="Dim sValue As String = hints.Get(sHint)";
_svalue = BA.ObjectToString(_hints.Get((Object)(_shint)));
 //BA.debugLineNum = 146;BA.debugLine="SetBottomText(sHint, sValue)";
_setbottomtext(_shint,_svalue);
 }
};
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _updateitem(String _ownerid,String _recid,anywheresoftware.b4a.objects.collections.Map _recdata) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub UpdateItem(ownerID As String, recID As String,";
 //BA.debugLineNum = 190;BA.debugLine="ownerID = ownerID.ToLowerCase";
_ownerid = _ownerid.toLowerCase();
 //BA.debugLineNum = 191;BA.debugLine="recID = recID.tolowercase";
_recid = _recid.toLowerCase();
 //BA.debugLineNum = 192;BA.debugLine="Dollar.Selector(ownerID).RunMethod(\"updateItem\",A";
_dollar.Selector((Object)(_ownerid)).RunMethod("updateItem",(Object)(new Object[]{(Object)(_recid),(Object)(_recdata.getObject())}));
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
