package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtextarea extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtextarea", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtextarea.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixtextbox _textarea = null;
public b4j.example.main _main = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 23;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 28;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TextArea As WixTextBox";
_textarea = new b4j.example.wixtextbox();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtextarea  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(tID As String) As WixTextAre";
 //BA.debugLineNum = 9;BA.debugLine="TextArea.Initialize(tID)";
_textarea._initialize /*b4j.example.wixtextbox*/ (ba,_tid);
 //BA.debugLineNum = 10;BA.debugLine="TextArea.SetView(\"textarea\")";
_textarea._setview /*b4j.example.wixtextbox*/ ("textarea");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 33;BA.debugLine="Return TextArea.Item";
if (true) return _textarea._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 68;BA.debugLine="TextArea.SetAlign(a)";
_textarea._setalign /*b4j.example.wixtextbox*/ (_a);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetHeight(h As Int) As WixTextArea";
 //BA.debugLineNum = 62;BA.debugLine="TextArea.SetHeight(h)";
_textarea._setheight /*b4j.example.wixtextbox*/ (_h);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetLabel(lbl As String) As WixTextArea";
 //BA.debugLineNum = 50;BA.debugLine="TextArea.SetLabel(lbl)";
_textarea._setlabel /*b4j.example.wixtextbox*/ (_lbl);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetLabelAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 75;BA.debugLine="TextArea.SetLabelAlign(a)";
_textarea._setlabelalign /*b4j.example.wixtextbox*/ (_a);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetLabelPosition(p As String) As WixTextArea";
 //BA.debugLineNum = 81;BA.debugLine="TextArea.SetLabelPosition(p)";
_textarea._setlabelposition /*b4j.example.wixtextbox*/ (_p);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetLabelWidth(w As Int) As WixTextArea";
 //BA.debugLineNum = 87;BA.debugLine="TextArea.SetLabelWidth(w)";
_textarea._setlabelwidth /*b4j.example.wixtextbox*/ (_w);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setmaxlength(int _ml) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetMaxLength(ml As Int) As WixTextArea";
 //BA.debugLineNum = 38;BA.debugLine="TextArea.SetMaxLength(ml)";
_textarea._setmaxlength /*b4j.example.wixtextbox*/ (_ml);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixTextArea";
 //BA.debugLineNum = 44;BA.debugLine="TextArea.SetPlaceHolder(ph)";
_textarea._setplaceholder /*b4j.example.wixtextbox*/ (_ph);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetValue(v As String) As WixTextArea";
 //BA.debugLineNum = 16;BA.debugLine="TextArea.Setvalue(v)";
_textarea._setvalue /*b4j.example.wixtextbox*/ (_v);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtextarea  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetWidth(w As Int) As WixTextArea";
 //BA.debugLineNum = 56;BA.debugLine="TextArea.SetWidth(w)";
_textarea._setwidth /*b4j.example.wixtextbox*/ (_w);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtextarea)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
