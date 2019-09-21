package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixprogressbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixprogressbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _progressbar = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Progressbar As WixElement";
_progressbar = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize(sid As String) As WixProgres";
 //BA.debugLineNum = 52;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 53;BA.debugLine="Progressbar.Initialize(ID)";
_progressbar._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 54;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 65;BA.debugLine="Return Progressbar.item";
if (true) return _progressbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 60;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetAttributes(m As Map) As WixProgressBar";
 //BA.debugLineNum = 28;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 29;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 30;BA.debugLine="Progressbar.SetAttr(k,v)";
_progressbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _setdelay(int _delay) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetDelay(delay As Int) As WixProgressBar";
 //BA.debugLineNum = 100;BA.debugLine="Progressbar.SetAttr(\"delay\", delay)";
_progressbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("delay",(Object)(_delay));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _sethide(boolean _hide) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetHide(hide As Boolean) As WixProgressBar";
 //BA.debugLineNum = 106;BA.debugLine="Progressbar.SetAttr(\"hide\", hide)";
_progressbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hide",(Object)(_hide));
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _seticon(Object _icon) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetIcon(icon As Object) As WixProgressBar";
 //BA.debugLineNum = 94;BA.debugLine="Progressbar.SetAttr(\"icon\", icon)";
_progressbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetMargin(margin As Object) As WixProgressBar";
 //BA.debugLineNum = 23;BA.debugLine="Progressbar.SetMargin(margin)";
_progressbar._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetPadding(padding As Object) As WixProgressBa";
 //BA.debugLineNum = 17;BA.debugLine="Progressbar.SetPadding(padding)";
_progressbar._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub SetParent(p As WixElement) As WixProgressBar";
 //BA.debugLineNum = 11;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _setposition(double _position) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetPosition(position As Double) As WixProgress";
 //BA.debugLineNum = 112;BA.debugLine="Progressbar.SetAttr(\"position\", position)";
_progressbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("position",(Object)(_position));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 45;BA.debugLine="Progressbar.SetStyle(prop,sval)";
_progressbar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetStyles(m As Map) As WixProgressBar";
 //BA.debugLineNum = 36;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 37;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 38;BA.debugLine="Progressbar.SetStyle(k,v)";
_progressbar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetType(sType As Object) As WixProgressBar";
 //BA.debugLineNum = 70;BA.debugLine="Progressbar.SetAttr(\"type\", sType)";
_progressbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _settypebottom(Object _typebottom) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetTypeBottom(typeBottom As Object) As WixProg";
 //BA.debugLineNum = 82;BA.debugLine="Progressbar.SetAttr(\"type\", \"bottom\")";
_progressbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("bottom"));
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _settypeicon(Object _typeicon) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetTypeIcon(typeIcon As Object) As WixProgress";
 //BA.debugLineNum = 88;BA.debugLine="Progressbar.SetAttr(\"type\", \"icon\")";
_progressbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("icon"));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprogressbar  _settypetop(Object _typetop) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetTypeTop(typeTop As Object) As WixProgressBa";
 //BA.debugLineNum = 76;BA.debugLine="Progressbar.SetAttr(\"type\", \"top\")";
_progressbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("top"));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprogressbar)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
