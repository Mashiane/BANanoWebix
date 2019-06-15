package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixheader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixheader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixheader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _header = null;
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 33;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _addtorow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 43;BA.debugLine="r.AddItem(Item)";
_r._additem /*b4j.example.wixrow*/ (_item());
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _parent) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub AddToRows(parent As WixElement)";
 //BA.debugLineNum = 28;BA.debugLine="parent.AddRows(Item)";
_parent._addrows /*String*/ (_item());
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 38;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Header As WixElement";
_header = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixheader  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sID As String) As WixHeader";
 //BA.debugLineNum = 9;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Header.Initialize(ID).SetView(\"template\")";
_header._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("template");
 //BA.debugLineNum = 11;BA.debugLine="Header.TypeOf = \"header\"";
_header._typeof /*String*/  = "header";
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 17;BA.debugLine="Return Header.item";
if (true) return _header._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixheader  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTemplate(t As String) As WixHeader";
 //BA.debugLineNum = 22;BA.debugLine="Header.Template = t";
_header._template /*String*/  = _t;
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixheader)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
