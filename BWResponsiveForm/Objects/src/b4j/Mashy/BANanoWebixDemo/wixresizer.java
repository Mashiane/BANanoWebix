package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixresizer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixresizer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixresizer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _resizer = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _xparent) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub AddToColumns(xParent As WixElement)";
 //BA.debugLineNum = 84;BA.debugLine="xParent.AddColumns(Item)";
_xparent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 104;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 66;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 99;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Resizer As WixElement";
_resizer = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixResizer";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Resizer.Initialize(iID).SetView(\"resizer\")";
_resizer._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("resizer");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 79;BA.debugLine="Return Resizer.item";
if (true) return _resizer._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 61;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixResizer";
 //BA.debugLineNum = 109;BA.debugLine="Resizer.SetAttr(\"animate\", animate)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetAttributes(m As Map) As WixResizer";
 //BA.debugLineNum = 30;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 31;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 32;BA.debugLine="Resizer.SetAttr(k,v)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixRes";
 //BA.debugLineNum = 114;BA.debugLine="Resizer.SetAttr(\"borderless\", borderless)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetContainer(container As Object) As WixResize";
 //BA.debugLineNum = 119;BA.debugLine="Resizer.SetAttr(\"container\", container)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetCss(css As Object) As WixResizer";
 //BA.debugLineNum = 124;BA.debugLine="Resizer.SetAttr(\"css\", css)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixResizer";
 //BA.debugLineNum = 129;BA.debugLine="Resizer.SetAttr(\"disabled\", disabled)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetGravity(gravity As Object) As WixResizer";
 //BA.debugLineNum = 134;BA.debugLine="Resizer.SetAttr(\"gravity\", gravity)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetHeight(height As Object) As WixResizer";
 //BA.debugLineNum = 139;BA.debugLine="Resizer.SetAttr(\"height\", height)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixResizer";
 //BA.debugLineNum = 144;BA.debugLine="Resizer.SetAttr(\"hidden\", hidden)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 88;BA.debugLine="Sub SetMap(m As Map) As WixResizer";
 //BA.debugLineNum = 89;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 90;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 91;BA.debugLine="Resizer.SetAttr(strKey,	strVal)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixResizer";
 //BA.debugLineNum = 25;BA.debugLine="Resizer.SetMargin(margin)";
_resizer._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixResize";
 //BA.debugLineNum = 149;BA.debugLine="Resizer.SetAttr(\"maxHeight\", maxHeight)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixResizer";
 //BA.debugLineNum = 154;BA.debugLine="Resizer.SetAttr(\"maxWidth\", maxWidth)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setminheight(Object _minheight) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetMinHeight(minHeight As Object) As WixResize";
 //BA.debugLineNum = 159;BA.debugLine="Resizer.SetAttr(\"minHeight\", minHeight)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minHeight",_minheight);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setminwidth(Object _minwidth) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetMinWidth(minWidth As Object) As WixResizer";
 //BA.debugLineNum = 164;BA.debugLine="Resizer.SetAttr(\"minWidth\", minWidth)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minWidth",_minwidth);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixResizer";
 //BA.debugLineNum = 19;BA.debugLine="Resizer.SetPadding(padding)";
_resizer._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetParent(p As WixElement) As WixResizer";
 //BA.debugLineNum = 54;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 47;BA.debugLine="Resizer.SetStyle(prop,sval)";
_resizer._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 37;BA.debugLine="Sub SetStyles(m As Map) As WixResizer";
 //BA.debugLineNum = 38;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 39;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 40;BA.debugLine="Resizer.SetStyle(k,v)";
_resizer._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixResizer";
 //BA.debugLineNum = 71;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 72;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="Resizer.SetTemplate(os)";
_resizer._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetWidth(width As Object) As WixResizer";
 //BA.debugLineNum = 169;BA.debugLine="Resizer.SetAttr(\"width\", width)";
_resizer._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixresizer)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
