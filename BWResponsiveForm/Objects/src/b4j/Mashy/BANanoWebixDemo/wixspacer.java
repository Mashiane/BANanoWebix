package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixspacer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixspacer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixspacer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _spacer = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 140;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 145;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 135;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Spacer As WixElement";
_spacer = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixSpacer";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Spacer.Initialize(ID).SetView(\"spacer\")";
_spacer._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spacer");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 60;BA.debugLine="Return Spacer.item";
if (true) return _spacer._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 65;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixSpacer";
 //BA.debugLineNum = 69;BA.debugLine="Spacer.SetAttr(\"animate\", animate)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetAttributes(m As Map) As WixSpacer";
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
 //BA.debugLineNum = 38;BA.debugLine="Spacer.SetAttr(k,v)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixSpa";
 //BA.debugLineNum = 74;BA.debugLine="Spacer.SetAttr(\"borderless\", borderless)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetContainer(container As Object) As WixSpacer";
 //BA.debugLineNum = 79;BA.debugLine="Spacer.SetAttr(\"container\", container)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetCss(css As Object) As WixSpacer";
 //BA.debugLineNum = 84;BA.debugLine="Spacer.SetAttr(\"css\", css)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixSpacer";
 //BA.debugLineNum = 89;BA.debugLine="Spacer.SetAttr(\"disabled\", disabled)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetGravity(gravity As Object) As WixSpacer";
 //BA.debugLineNum = 94;BA.debugLine="Spacer.SetAttr(\"gravity\", gravity)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetHeight(height As Object) As WixSpacer";
 //BA.debugLineNum = 99;BA.debugLine="Spacer.SetAttr(\"height\", height)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixSpacer";
 //BA.debugLineNum = 104;BA.debugLine="Spacer.SetAttr(\"hidden\", hidden)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetMargin(margin As Object) As WixSpacer";
 //BA.debugLineNum = 31;BA.debugLine="Spacer.SetMargin(margin)";
_spacer._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixSpacer";
 //BA.debugLineNum = 109;BA.debugLine="Spacer.SetAttr(\"maxHeight\", maxHeight)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixSpacer";
 //BA.debugLineNum = 114;BA.debugLine="Spacer.SetAttr(\"maxWidth\", maxWidth)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setminheight(Object _minheight) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetMinHeight(minHeight As Object) As WixSpacer";
 //BA.debugLineNum = 119;BA.debugLine="Spacer.SetAttr(\"minHeight\", minHeight)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minHeight",_minheight);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setminwidth(Object _minwidth) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetMinWidth(minWidth As Object) As WixSpacer";
 //BA.debugLineNum = 124;BA.debugLine="Spacer.SetAttr(\"minWidth\", minWidth)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minWidth",_minwidth);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetPadding(padding As Object) As WixSpacer";
 //BA.debugLineNum = 25;BA.debugLine="Spacer.SetPadding(padding)";
_spacer._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetParent(p As WixElement) As WixSpacer";
 //BA.debugLineNum = 53;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 19;BA.debugLine="Spacer.SetStyle(prop,sval)";
_spacer._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SetStyles(m As Map) As WixSpacer";
 //BA.debugLineNum = 44;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 45;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 46;BA.debugLine="Spacer.SetStyle(k,v)";
_spacer._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixspacer  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetWidth(width As Object) As WixSpacer";
 //BA.debugLineNum = 129;BA.debugLine="Spacer.SetAttr(\"width\", width)";
_spacer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixspacer)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
