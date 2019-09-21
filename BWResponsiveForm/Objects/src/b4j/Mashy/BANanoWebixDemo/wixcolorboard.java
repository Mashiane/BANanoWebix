package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcolorboard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcolorboard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcolorboard.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _colorboard = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 178;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 183;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 173;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Colorboard As WixElement";
_colorboard = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixColorBo";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Colorboard.Initialize(ID).SetView(\"colorboard\")";
_colorboard._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("colorboard");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 63;BA.debugLine="Return Colorboard.item";
if (true) return _colorboard._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 58;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixColorBoar";
 //BA.debugLineNum = 67;BA.debugLine="Colorboard.SetAttr(\"animate\", animate)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 34;BA.debugLine="Sub SetAttributes(m As Map) As WixColorBoard";
 //BA.debugLineNum = 35;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 36;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 37;BA.debugLine="Colorboard.SetAttr(k,v)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixCol";
 //BA.debugLineNum = 72;BA.debugLine="Colorboard.SetAttr(\"borderless\", borderless)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setcols(Object _cols) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetCols(cols As Object) As WixColorBoard";
 //BA.debugLineNum = 77;BA.debugLine="Colorboard.SetAttr(\"cols\", cols)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cols",_cols);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetContainer(container As Object) As WixColorB";
 //BA.debugLineNum = 82;BA.debugLine="Colorboard.SetAttr(\"container\", container)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetCss(css As Object) As WixColorBoard";
 //BA.debugLineNum = 87;BA.debugLine="Colorboard.SetAttr(\"css\", css)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixColorBo";
 //BA.debugLineNum = 92;BA.debugLine="Colorboard.SetAttr(\"disabled\", disabled)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetGravity(gravity As Object) As WixColorBoard";
 //BA.debugLineNum = 97;BA.debugLine="Colorboard.SetAttr(\"gravity\", gravity)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetHeight(height As Object) As WixColorBoard";
 //BA.debugLineNum = 102;BA.debugLine="Colorboard.SetAttr(\"height\", height)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixColorBoard";
 //BA.debugLineNum = 107;BA.debugLine="Colorboard.SetAttr(\"hidden\", hidden)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMargin(margin As Object) As WixColorBoard";
 //BA.debugLineNum = 30;BA.debugLine="Colorboard.SetMargin(margin)";
_colorboard._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixColorB";
 //BA.debugLineNum = 112;BA.debugLine="Colorboard.SetAttr(\"maxHeight\", maxHeight)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setmaxlightness(Object _maxlightness) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetMaxLightness(maxLightness As Object) As Wix";
 //BA.debugLineNum = 117;BA.debugLine="Colorboard.SetAttr(\"maxLightness\", maxLightness)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxLightness",_maxlightness);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixColorBoa";
 //BA.debugLineNum = 122;BA.debugLine="Colorboard.SetAttr(\"maxWidth\", maxWidth)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setminheight(Object _minheight) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetMinHeight(minHeight As Object) As WixColorB";
 //BA.debugLineNum = 127;BA.debugLine="Colorboard.SetAttr(\"minHeight\", minHeight)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minHeight",_minheight);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setminlightness(Object _minlightness) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetMinLightness(minLightness As Object) As Wix";
 //BA.debugLineNum = 132;BA.debugLine="Colorboard.SetAttr(\"minLightness\", minLightness)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minLightness",_minlightness);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setminwidth(Object _minwidth) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetMinWidth(minWidth As Object) As WixColorBoa";
 //BA.debugLineNum = 137;BA.debugLine="Colorboard.SetAttr(\"minWidth\", minWidth)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minWidth",_minwidth);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setnavigation(boolean _navigation) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetNavigation(navigation As Boolean) As WixCol";
 //BA.debugLineNum = 142;BA.debugLine="Colorboard.SetAttr(\"navigation\", navigation)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",(Object)(_navigation));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetPadding(padding As Object) As WixColorBoard";
 //BA.debugLineNum = 24;BA.debugLine="Colorboard.SetPadding(padding)";
_colorboard._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setpalette(Object _palette) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetPalette(palette As Object) As WixColorBoard";
 //BA.debugLineNum = 147;BA.debugLine="Colorboard.SetAttr(\"palette\", palette)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("palette",_palette);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetParent(p As WixElement) As WixColorBoard";
 //BA.debugLineNum = 18;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setrows(Object _rows) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetRows(rows As Object) As WixColorBoard";
 //BA.debugLineNum = 152;BA.debugLine="Colorboard.SetAttr(\"rows\", rows)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rows",_rows);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 52;BA.debugLine="Colorboard.SetStyle(prop,sval)";
_colorboard._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub SetStyles(m As Map) As WixColorBoard";
 //BA.debugLineNum = 43;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 44;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 45;BA.debugLine="Colorboard.SetStyle(k,v)";
_colorboard._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _settemplate(Object _template) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetTemplate(template As Object) As WixColorBoa";
 //BA.debugLineNum = 157;BA.debugLine="Colorboard.SetAttr(\"template\", template)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("template",_template);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setvalue(Object _value) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetValue(value As Object) As WixColorBoard";
 //BA.debugLineNum = 162;BA.debugLine="Colorboard.SetAttr(\"value\", value)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("value",_value);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorboard  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetWidth(width As Object) As WixColorBoard";
 //BA.debugLineNum = 167;BA.debugLine="Colorboard.SetAttr(\"width\", width)";
_colorboard._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolorboard)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
