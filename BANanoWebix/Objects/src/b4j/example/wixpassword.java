package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixpassword extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixpassword", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixpassword.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixtextbox _password = null;
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 22;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 27;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Password As WixTextBox";
_password = new b4j.example.wixtextbox();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpassword  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(tID As String) As WixPasswor";
 //BA.debugLineNum = 9;BA.debugLine="Password.Initialize(tID)";
_password._initialize /*b4j.example.wixtextbox*/ (ba,_tid);
 //BA.debugLineNum = 10;BA.debugLine="Password.SetType(\"password\")";
_password._settype /*b4j.example.wixtextbox*/ ("password");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 16;BA.debugLine="Return Password.Item";
if (true) return _password._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpassword  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetAlign(a As String) As WixPassword";
 //BA.debugLineNum = 63;BA.debugLine="Password.SetAlign(a)";
_password._setalign /*b4j.example.wixtextbox*/ (_a);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpassword  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetHeight(h As Int) As WixPassword";
 //BA.debugLineNum = 57;BA.debugLine="Password.SetHeight(h)";
_password._setheight /*b4j.example.wixtextbox*/ (_h);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpassword  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetLabel(lbl As String) As WixPassword";
 //BA.debugLineNum = 45;BA.debugLine="Password.SetLabel(lbl)";
_password._setlabel /*b4j.example.wixtextbox*/ (_lbl);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpassword  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetLabelAlign(a As String) As WixPassword";
 //BA.debugLineNum = 70;BA.debugLine="Password.SetLabelAlign(a)";
_password._setlabelalign /*b4j.example.wixtextbox*/ (_a);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpassword  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetLabelPosition(p As String) As WixPassword";
 //BA.debugLineNum = 76;BA.debugLine="Password.SetLabelPosition(p)";
_password._setlabelposition /*b4j.example.wixtextbox*/ (_p);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpassword  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetLabelWidth(w As Int) As WixPassword";
 //BA.debugLineNum = 82;BA.debugLine="Password.SetLabelWidth(w)";
_password._setlabelwidth /*b4j.example.wixtextbox*/ (_w);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpassword  _setmaxlength(int _ml) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetMaxLength(ml As Int) As WixPassword";
 //BA.debugLineNum = 33;BA.debugLine="Password.SetMaxLength(ml)";
_password._setmaxlength /*b4j.example.wixtextbox*/ (_ml);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpassword  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixPassword";
 //BA.debugLineNum = 39;BA.debugLine="Password.SetPlaceHolder(ph)";
_password._setplaceholder /*b4j.example.wixtextbox*/ (_ph);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpassword  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetWidth(w As Int) As WixPassword";
 //BA.debugLineNum = 51;BA.debugLine="Password.SetWidth(w)";
_password._setwidth /*b4j.example.wixtextbox*/ (_w);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpassword)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
