package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsuggest extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsuggest", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsuggest.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _suggest = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public b4j.example.wixpage _page = null;
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
public b4j.example.wixsuggest  _addsuggestion(String _sid,String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sug = null;
 //BA.debugLineNum = 36;BA.debugLine="Sub AddSuggestion(sID As String, sValue As String)";
 //BA.debugLineNum = 37;BA.debugLine="Dim sug As Map = CreateMap()";
_sug = new anywheresoftware.b4a.objects.collections.Map();
_sug = __c.createMap(new Object[] {});
 //BA.debugLineNum = 38;BA.debugLine="sug.Put(\"id\", sID)";
_sug.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 39;BA.debugLine="sug.Put(\"value\", sValue)";
_sug.Put((Object)("value"),(Object)(_svalue));
 //BA.debugLineNum = 40;BA.debugLine="Data.Add(sug)";
_data.Add((Object)(_sug.getObject()));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Suggest As WixElement";
_suggest = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Page As WixPage";
_page = new b4j.example.wixpage();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsuggest  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.wixpage _pg,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(pg As WixPage, sID As String";
 //BA.debugLineNum = 11;BA.debugLine="Suggest.Initialize(sID).SetView(\"suggest\")";
_suggest._initialize /*b4j.example.wixelement*/ (ba,_sid)._setview /*b4j.example.wixelement*/ ("suggest");
 //BA.debugLineNum = 12;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Page = pg";
_page = _pg;
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="private Sub Item As Map";
 //BA.debugLineNum = 25;BA.debugLine="Suggest.SetAttr(\"data\", Data)";
_suggest._setattr /*b4j.example.wixelement*/ ("data",(Object)(_data.getObject()));
 //BA.debugLineNum = 26;BA.debugLine="Return Suggest.Item";
if (true) return _suggest._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetData(d As List) As WixSuggest";
 //BA.debugLineNum = 19;BA.debugLine="Data = d";
_data = _d;
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _ui() throws Exception{
com.ab.banano.BANanoObject _webix = null;
 //BA.debugLineNum = 30;BA.debugLine="Sub UI()";
 //BA.debugLineNum = 31;BA.debugLine="Dim webix As BANanoObject = Page.webix";
_webix = _page._webix /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 32;BA.debugLine="webix.RunMethod(\"ui\",Item)";
_webix.RunMethod("ui",(Object)(_item().getObject()));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
