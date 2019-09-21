package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixfieldset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixfieldset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixfieldset.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _fieldset = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _body = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub AddItem(itm As Map) As WixFieldSet";
 //BA.debugLineNum = 121;BA.debugLine="Body.AddRows(itm)";
_body._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub AddRows(itm As Map) As WixFieldSet";
 //BA.debugLineNum = 127;BA.debugLine="Body.AddRows(itm)";
_body._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 157;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 162;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 152;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public FieldSet As WixElement";
_fieldset = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Body As WixElement";
_body = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixFieldSe";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="FieldSet.Initialize(ID)";
_fieldset._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="FieldSet.SetView(\"fieldset\")";
_fieldset._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("fieldset");
 //BA.debugLineNum = 14;BA.debugLine="Body.Initialize(ID & \"body\")";
_body._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id+"body");
 //BA.debugLineNum = 15;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 133;BA.debugLine="FieldSet.SetAttr(\"body\", Body.item)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",(Object)(_body._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 134;BA.debugLine="Return FieldSet.item";
if (true) return _fieldset._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 62;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixFieldSet";
 //BA.debugLineNum = 166;BA.debugLine="FieldSet.SetAttr(\"animate\", animate)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 37;BA.debugLine="Sub SetAttributes(m As Map) As WixFieldSet";
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
 //BA.debugLineNum = 40;BA.debugLine="FieldSet.SetAttr(k,v)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setbody(Object _xbody) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetBody(xbody As Object) As WixFieldSet";
 //BA.debugLineNum = 171;BA.debugLine="FieldSet.SetAttr(\"body\", xbody)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("body",_xbody);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixFie";
 //BA.debugLineNum = 176;BA.debugLine="FieldSet.SetAttr(\"borderless\", borderless)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetContainer(container As Object) As WixFieldS";
 //BA.debugLineNum = 181;BA.debugLine="FieldSet.SetAttr(\"container\", container)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetCss(css As Object) As WixFieldSet";
 //BA.debugLineNum = 186;BA.debugLine="FieldSet.SetAttr(\"css\", css)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixFieldSe";
 //BA.debugLineNum = 191;BA.debugLine="FieldSet.SetAttr(\"disabled\", disabled)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetGravity(gravity As Object) As WixFieldSet";
 //BA.debugLineNum = 196;BA.debugLine="FieldSet.SetAttr(\"gravity\", gravity)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetHeight(h As Object) As WixFieldSet";
 //BA.debugLineNum = 145;BA.debugLine="FieldSet.SetHeight(h)";
_fieldset._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixFieldSet";
 //BA.debugLineNum = 201;BA.debugLine="FieldSet.SetAttr(\"hidden\", hidden)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetLabel(l As String) As WixFieldSet";
 //BA.debugLineNum = 139;BA.debugLine="FieldSet.SetLabel(l)";
_fieldset._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 104;BA.debugLine="Sub SetMap(m As Map) As WixFieldSet";
 //BA.debugLineNum = 105;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 106;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 107;BA.debugLine="FieldSet.SetAttr(strKey,	strVal)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetMargin(margin As Object) As WixFieldSet";
 //BA.debugLineNum = 33;BA.debugLine="FieldSet.SetMargin(margin)";
_fieldset._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixFieldS";
 //BA.debugLineNum = 206;BA.debugLine="FieldSet.SetAttr(\"maxHeight\", maxHeight)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixFieldSet";
 //BA.debugLineNum = 211;BA.debugLine="FieldSet.SetAttr(\"maxWidth\", maxWidth)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetMinHeight(h As Int) As WixFieldSet";
 //BA.debugLineNum = 99;BA.debugLine="FieldSet.SetMinHeight(h)";
_fieldset._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetMinWidth(w As Int) As WixFieldSet";
 //BA.debugLineNum = 93;BA.debugLine="FieldSet.SetMinWidth(w)";
_fieldset._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setname(String _n) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetName(n As String) As WixFieldSet";
 //BA.debugLineNum = 74;BA.debugLine="FieldSet.SetName(n)";
_fieldset._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetPadding(padding As Object) As WixFieldSet";
 //BA.debugLineNum = 27;BA.debugLine="FieldSet.SetPadding(padding)";
_fieldset._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setpaddingx(Object _paddingx) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetPaddingX(paddingX As Object) As WixFieldSet";
 //BA.debugLineNum = 216;BA.debugLine="FieldSet.SetAttr(\"paddingX\", paddingX)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingX",_paddingx);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setpaddingy(Object _paddingy) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetPaddingY(paddingY As Object) As WixFieldSet";
 //BA.debugLineNum = 221;BA.debugLine="FieldSet.SetAttr(\"paddingY\", paddingY)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingY",_paddingy);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetParent(p As WixElement) As WixFieldSet";
 //BA.debugLineNum = 21;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetResponsive(b As Object) As WixFieldSet";
 //BA.debugLineNum = 80;BA.debugLine="FieldSet.SetResponsive(b)";
_fieldset._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixFieldSet";
 //BA.debugLineNum = 86;BA.debugLine="FieldSet.SetResponsiveCell(b)";
_fieldset._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 55;BA.debugLine="FieldSet.SetStyle(prop,sval)";
_fieldset._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStyles(m As Map) As WixFieldSet";
 //BA.debugLineNum = 46;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 47;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 48;BA.debugLine="FieldSet.SetStyle(k,v)";
_fieldset._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 65;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixFieldSe";
 //BA.debugLineNum = 66;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 67;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 68;BA.debugLine="FieldSet.SetTemplate(os)";
_fieldset._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetTooltip(tt As String) As WixFieldSet";
 //BA.debugLineNum = 115;BA.debugLine="FieldSet.SetTooltip(tt)";
_fieldset._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetWidth(width As Object) As WixFieldSet";
 //BA.debugLineNum = 226;BA.debugLine="FieldSet.SetAttr(\"width\", width)";
_fieldset._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixfieldset)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
