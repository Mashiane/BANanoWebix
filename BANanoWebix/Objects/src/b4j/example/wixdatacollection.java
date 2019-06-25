package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatacollection extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdatacollection", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdatacollection.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _url = "";
public anywheresoftware.b4a.objects.collections.Map _options = null;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private URL As String";
_url = "";
 //BA.debugLineNum = 4;BA.debugLine="Private Options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _datacollection() throws Exception{
com.ab.banano.BANanoObject _dc = null;
 //BA.debugLineNum = 20;BA.debugLine="Sub DataCollection As BANanoObject";
 //BA.debugLineNum = 22;BA.debugLine="Options.Put(\"url\", URL)";
_options.Put((Object)("url"),(Object)(_url));
 //BA.debugLineNum = 24;BA.debugLine="Dim dc As BANanoObject";
_dc = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 25;BA.debugLine="dc.Initialize2(\"webix.DataCollection\",Array(Optio";
_dc.Initialize2("webix.DataCollection",(Object)(new Object[]{(Object)(_options.getObject())}));
 //BA.debugLineNum = 26;BA.debugLine="Return dc";
if (true) return _dc;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacollection  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize() As WixDataCollection";
 //BA.debugLineNum = 9;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 10;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacollection)(this);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatacollection  _seturl(String _u) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub SetURL(u As String) As WixDataCollection";
 //BA.debugLineNum = 15;BA.debugLine="URL = u";
_url = _u;
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatacollection)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
