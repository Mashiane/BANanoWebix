package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatatable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdatatable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdatatable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _datatable = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public boolean _autoconfig = false;
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 39;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 44;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DataTable As WixElement";
_datatable = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private AutoConfig As Boolean";
_autoconfig = false;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatatable  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(tID As String) As WixDataTab";
 //BA.debugLineNum = 11;BA.debugLine="ID = tID.ToLowerCase";
_id = _tid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="DataTable.Initialize(ID).SetView(\"datatable\")";
_datatable._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("datatable");
 //BA.debugLineNum = 13;BA.debugLine="AutoConfig = False";
_autoconfig = __c.False;
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 19;BA.debugLine="DataTable.SetAttr(\"autoConfig\", AutoConfig)";
_datatable._setattr /*b4j.example.wixelement*/ ("autoConfig",(Object)(_autoconfig));
 //BA.debugLineNum = 20;BA.debugLine="DataTable.SetAttr(\"data\", Data)";
_datatable._setattr /*b4j.example.wixelement*/ ("data",(Object)(_data.getObject()));
 //BA.debugLineNum = 21;BA.debugLine="Return DataTable.item";
if (true) return _datatable._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setautoconfig(boolean _a) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetAutoConfig(a As Boolean) As WixDataTable";
 //BA.debugLineNum = 32;BA.debugLine="AutoConfig = a";
_autoconfig = _a;
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetData(d As List) As WixDataTable";
 //BA.debugLineNum = 26;BA.debugLine="Data = d";
_data = _d;
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
