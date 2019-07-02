package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixlabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixlabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _label = null;
public b4j.Mashy.BANanoWebix.wixelement _parent = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 59;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Label As WixElement";
_label = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixlabel  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(iID As String) As WixLabel";
 //BA.debugLineNum = 10;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Label.Initialize(iID).SetView(\"label\")";
_label._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("label");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebix.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlabel)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 18;BA.debugLine="Return Label.item";
if (true) return _label._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 30;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_item());
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixlabel  _setalign(String _a) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetAlign(a As String) As WixLabel";
 //BA.debugLineNum = 53;BA.debugLine="Label.SetAttr(\"align\", a)";
_label._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("align",(Object)(_a));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlabel)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlabel  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetAlignCenter(r As String) As WixLabel 'ignor";
 //BA.debugLineNum = 71;BA.debugLine="Label.setAligncenter(\"\")";
_label._setaligncenter /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlabel)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlabel  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetAlignLeft(r As String) As WixLabel 'ignore";
 //BA.debugLineNum = 77;BA.debugLine="Label.SetAlignleft(\"\")";
_label._setalignleft /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlabel)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlabel  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetAlignRight(r As String) As WixLabel 'ignore";
 //BA.debugLineNum = 65;BA.debugLine="Label.setAlignright(\"\")";
_label._setalignright /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlabel)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlabel  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetLabel(l As String) As WixLabel";
 //BA.debugLineNum = 47;BA.debugLine="Label.Label.Text = l";
_label._label /*b4j.Mashy.BANanoWebix.wixelement._labeltype*/ .Text /*String*/  = _l;
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlabel)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlabel  _setparent(b4j.Mashy.BANanoWebix.wixelement _p) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetParent(p As WixElement) As WixLabel";
 //BA.debugLineNum = 24;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlabel)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlabel  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 41;BA.debugLine="Label.SetStyle(prop,val)";
_label._setstyle /*b4j.Mashy.BANanoWebix.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlabel)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlabel  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetTooltip(tt As String) As WixLabel";
 //BA.debugLineNum = 35;BA.debugLine="Label.SetTooltip(tt)";
_label._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlabel)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
