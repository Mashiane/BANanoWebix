package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixportlet extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixportlet", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixportlet.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _portlet = null;
public b4j.example.main _main = null;
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
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Portlet As WixElement";
_portlet = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixportlet  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixPortlet";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Portlet.Initialize(ID)";
_portlet._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 11;BA.debugLine="Portlet.SetView(\"portlet\")";
_portlet._setview /*b4j.example.wixelement*/ ("portlet");
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixportlet)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 24;BA.debugLine="Return Portlet.item";
if (true) return _portlet._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixportlet  _setbody(String _b) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tmp = null;
 //BA.debugLineNum = 28;BA.debugLine="Sub SetBody(b As String) As WixPortlet";
 //BA.debugLineNum = 29;BA.debugLine="Dim tmp As Map = CreateMap()";
_tmp = new anywheresoftware.b4a.objects.collections.Map();
_tmp = __c.createMap(new Object[] {});
 //BA.debugLineNum = 30;BA.debugLine="tmp.Put(\"template\", b)";
_tmp.Put((Object)("template"),(Object)(_b));
 //BA.debugLineNum = 31;BA.debugLine="Portlet.SetProperty(\"body\",tmp)";
_portlet._setproperty /*b4j.example.wixelement*/ ("body",(Object)(_tmp.getObject()));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixportlet)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixportlet  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetTooltip(tt As String) As WixPortlet";
 //BA.debugLineNum = 18;BA.debugLine="Portlet.SetTooltip(tt)";
_portlet._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixportlet)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
