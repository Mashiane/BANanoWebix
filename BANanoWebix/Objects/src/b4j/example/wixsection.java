package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsection extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsection", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsection.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _section = null;
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pglayouts _pglayouts = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 41;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 46;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Section As WixElement";
_section = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsection  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(iID As String) As WixSection";
 //BA.debugLineNum = 9;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Section.Initialize(iID)";
_section._initialize /*b4j.example.wixelement*/ (ba,_iid);
 //BA.debugLineNum = 11;BA.debugLine="Section.TypeOf = \"section\"";
_section._typeof /*String*/  = "section";
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 17;BA.debugLine="Return Section.item";
if (true) return _section._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetLabel(l As String) As WixSection";
 //BA.debugLineNum = 34;BA.debugLine="Section.Label.Text = l";
_section._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTemplate(t As String) As WixSection";
 //BA.debugLineNum = 22;BA.debugLine="Section.Template = t";
_section._template /*String*/  = _t;
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsection  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetValue(v As String) As WixSection";
 //BA.debugLineNum = 28;BA.debugLine="Section.Value = v";
_section._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsection)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
