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
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addrow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub AddRow(r As WixRow)";
 //BA.debugLineNum = 102;BA.debugLine="Page.AddRow(R)";
_page._addrow /*String*/ (_r);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub AddRows(itm As Map) As WixPage";
 //BA.debugLineNum = 27;BA.debugLine="Page.AddRows(itm)";
_page._addrows /*String*/ (_itm);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
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
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _getvalue(String _itm) throws Exception{
String _res = "";
 //BA.debugLineNum = 49;BA.debugLine="Sub GetValue(itm As String) As String";
 //BA.debugLineNum = 50;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 51;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 52;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValue\",N";
_res = BA.ObjectToString(_dollar.Selector((Object)(_itm)).RunMethod("getValue",__c.Null).Result());
 //BA.debugLineNum = 53;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getvalues(String _itm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _res = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub GetValues(itm As String) As Map";
 //BA.debugLineNum = 64;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 65;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 66;BA.debugLine="res = Dollar.Selector(itm).RunMethod(\"getValues\",";
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_itm)).RunMethod("getValues",__c.Null).Result()));
 //BA.debugLineNum = 67;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public String  _hideit(String _itmid) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub HideIT(itmID As String)";
 //BA.debugLineNum = 72;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 73;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"hide\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("hide",(Object)(""));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _initialize(anywheresoftware.b4a.BA _ba,String _pgid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(pgID As String) As WixPage";
 //BA.debugLineNum = 13;BA.debugLine="Dollar.Initialize(\"$$\")";
_dollar.Initialize((Object)("$$"));
 //BA.debugLineNum = 14;BA.debugLine="ID = pgID.tolowercase";
_id = _pgid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="webix.Initialize(\"webix\")";
_webix.Initialize((Object)("webix"));
 //BA.debugLineNum = 16;BA.debugLine="Page.Initialize(ID)";
_page._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 17;BA.debugLine="Page.Container = \"body\"";
_page._container /*String*/  = "body";
 //BA.debugLineNum = 19;BA.debugLine="BANano.GetElement(\"#body\").empty";
_banano.GetElement("#body").Empty();
 //BA.debugLineNum = 21;BA.debugLine="EnumButtonTypes.Initialize";
_enumbuttontypes._initialize /*String*/ (ba);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _message(String _msg) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub Message(msg As String)";
 //BA.debugLineNum = 89;BA.debugLine="webix.RunMethod(\"message\", Array(msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg)}));
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _settype(String _t) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetType(t As String) As WixPage";
 //BA.debugLineNum = 38;BA.debugLine="Page.SetType(t)";
_page._settype /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _setvalue(String _itm,String _value) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetValue(itm As String, value As String)";
 //BA.debugLineNum = 44;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 45;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValue\",Array(v";
_dollar.Selector((Object)(_itm)).RunMethod("setValue",(Object)(new Object[]{(Object)(_value)}));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _setvalues(String _itm,anywheresoftware.b4a.objects.collections.Map _values) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetValues(itm As String, values As Map)";
 //BA.debugLineNum = 58;BA.debugLine="itm = itm.ToLowerCase";
_itm = _itm.toLowerCase();
 //BA.debugLineNum = 59;BA.debugLine="Dollar.Selector(itm).RunMethod(\"setValues\",Array(";
_dollar.Selector((Object)(_itm)).RunMethod("setValues",(Object)(new Object[]{(Object)(_values.getObject())}));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpage  _setview(String _v) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetView(v As String) As WixPage";
 //BA.debugLineNum = 32;BA.debugLine="Page.SetView(v)";
_page._setview /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpage)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public String  _showit(String _itmid) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub ShowIT(itmID As String)";
 //BA.debugLineNum = 78;BA.debugLine="itmID = itmID.ToLowerCase";
_itmid = _itmid.toLowerCase();
 //BA.debugLineNum = 79;BA.debugLine="Dollar.Selector(itmID).RunMethod(\"show\",\"\")";
_dollar.Selector((Object)(_itmid)).RunMethod("show",(Object)(""));
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _toasterror(String _text) throws Exception{
anywheresoftware.b4a.objects.collections.Map _msg = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub ToastError(Text As String)";
 //BA.debugLineNum = 94;BA.debugLine="Dim msg As Map = CreateMap()";
_msg = new anywheresoftware.b4a.objects.collections.Map();
_msg = __c.createMap(new Object[] {});
 //BA.debugLineNum = 95;BA.debugLine="msg.put(\"type\",\"error\")";
_msg.Put((Object)("type"),(Object)("error"));
 //BA.debugLineNum = 96;BA.debugLine="msg.put(\"text\", Text)";
_msg.Put((Object)("text"),(Object)(_text));
 //BA.debugLineNum = 97;BA.debugLine="webix.RunMethod(\"message\", Array(msg))";
_webix.RunMethod("message",(Object)(new Object[]{(Object)(_msg.getObject())}));
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _ui() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub UI";
 //BA.debugLineNum = 84;BA.debugLine="webix.RunMethod(\"ui\",Page.item)";
_webix.RunMethod("ui",(Object)(_page._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
