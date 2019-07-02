package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtextarea extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixtextarea", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixtextarea.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixtextbox _textarea = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 40;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TextArea As WixTextBox";
_textarea = new b4j.Mashy.BANanoWebix.wixtextbox();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixtextarea  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(tID As String) As WixTextAre";
 //BA.debugLineNum = 9;BA.debugLine="TextArea.Initialize(tID)";
_textarea._initialize /*b4j.Mashy.BANanoWebix.wixtextbox*/ (ba,_tid);
 //BA.debugLineNum = 10;BA.debugLine="TextArea.SetView(\"textarea\")";
_textarea._setview /*b4j.Mashy.BANanoWebix.wixtextbox*/ ("textarea");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 45;BA.debugLine="Return TextArea.Item";
if (true) return _textarea._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 80;BA.debugLine="TextArea.SetAlign(a)";
_textarea._setalign /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_a);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetAlignCenter(r As String) As WixTextArea 'ig";
 //BA.debugLineNum = 112;BA.debugLine="TextArea.setAligncenter(\"\")";
_textarea._setaligncenter /*b4j.Mashy.BANanoWebix.wixtextbox*/ ("");
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetAlignLeft(r As String) As WixTextArea 'igno";
 //BA.debugLineNum = 118;BA.debugLine="TextArea.SetAlignleft(\"\")";
_textarea._setalignleft /*b4j.Mashy.BANanoWebix.wixtextbox*/ ("");
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetAlignRight(r As String) As WixTextArea 'ign";
 //BA.debugLineNum = 106;BA.debugLine="TextArea.setAlignright(\"\")";
_textarea._setalignright /*b4j.Mashy.BANanoWebix.wixtextbox*/ ("");
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetHeight(h As Object) As WixTextArea";
 //BA.debugLineNum = 74;BA.debugLine="TextArea.SetHeight(h)";
_textarea._setheight /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_h);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixTextAre";
 //BA.debugLineNum = 22;BA.debugLine="TextArea.SetInvalidMessage(msg)";
_textarea._setinvalidmessage /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_msg);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetLabel(lbl As String) As WixTextArea";
 //BA.debugLineNum = 62;BA.debugLine="TextArea.SetLabel(lbl)";
_textarea._setlabel /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_lbl);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetLabelAlign(a As String) As WixTextArea";
 //BA.debugLineNum = 87;BA.debugLine="TextArea.SetLabelAlign(a)";
_textarea._setlabelalign /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_a);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetLabelPosition(p As String) As WixTextArea";
 //BA.debugLineNum = 93;BA.debugLine="TextArea.SetLabelPosition(p)";
_textarea._setlabelposition /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_p);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetLabelWidth(w As Int) As WixTextArea";
 //BA.debugLineNum = 99;BA.debugLine="TextArea.SetLabelWidth(w)";
_textarea._setlabelwidth /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_w);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setmaxlength(int _ml) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetMaxLength(ml As Int) As WixTextArea";
 //BA.debugLineNum = 50;BA.debugLine="TextArea.SetMaxLength(ml)";
_textarea._setmaxlength /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_ml);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixTextArea";
 //BA.debugLineNum = 56;BA.debugLine="TextArea.SetPlaceHolder(ph)";
_textarea._setplaceholder /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_ph);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 34;BA.debugLine="TextArea.SetStyle(prop,val)";
_textarea._setstyle /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_prop,_val);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetTooltip(tt As String) As WixTextArea";
 //BA.debugLineNum = 28;BA.debugLine="TextArea.SetTooltip(tt)";
_textarea._settooltip /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_tt);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetValue(v As String) As WixTextArea";
 //BA.debugLineNum = 16;BA.debugLine="TextArea.Setvalue(v)";
_textarea._setvalue /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_v);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtextarea  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetWidth(w As object) As WixTextArea";
 //BA.debugLineNum = 68;BA.debugLine="TextArea.SetWidth(w)";
_textarea._setwidth /*b4j.Mashy.BANanoWebix.wixtextbox*/ (_w);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtextarea)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
