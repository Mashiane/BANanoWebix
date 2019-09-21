package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlayout extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixlayout", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixlayout.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _layout = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 79;BA.debugLine="Layout.AddColumns(itm)";
_layout._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _addcolumnsresizer(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 49;BA.debugLine="Sub AddColumnsResizer(s As String) As WixLayout";
 //BA.debugLineNum = 50;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 51;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 52;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public String  _addcolumnsspacer() throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _s = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub AddColumnsSpacer()";
 //BA.debugLineNum = 71;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 72;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spacer");
 //BA.debugLineNum = 73;BA.debugLine="AddColumns(s.item)";
_addcolumns(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _addresizertocolumns(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 42;BA.debugLine="Sub AddResizerToColumns(s As String) As WixLayout";
 //BA.debugLineNum = 43;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 44;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 45;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 84;BA.debugLine="Layout.AddRows(itm)";
_layout._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _addrowsspacer() throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _s = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub AddRowsSpacer()";
 //BA.debugLineNum = 64;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 65;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spacer");
 //BA.debugLineNum = 66;BA.debugLine="AddRows(s.item)";
_addrows(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 208;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 213;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 203;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Layout As WixElement";
_layout = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sID As String) As WixLayout";
 //BA.debugLineNum = 11;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Layout.Initialize(ID)";
_layout._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 89;BA.debugLine="Return Layout.item";
if (true) return _layout._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 94;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixLayout";
 //BA.debugLineNum = 305;BA.debugLine="Layout.SetAttr(\"animate\", animate)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 18;BA.debugLine="Sub SetAttributes(m As Map) As WixLayout";
 //BA.debugLineNum = 19;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 20;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 21;BA.debugLine="Layout.SetAttr(k,v)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setbatch(String _paddingy) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetBatch(paddingY As String) As WixLayout";
 //BA.debugLineNum = 289;BA.debugLine="Layout.SetAttr(\"batch\", paddingY)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("batch",(Object)(_paddingy));
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixLay";
 //BA.debugLineNum = 217;BA.debugLine="Layout.SetAttr(\"borderless\", borderless)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setcols(Object _cols) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetCols(cols As Object) As WixLayout";
 //BA.debugLineNum = 310;BA.debugLine="Layout.SetAttr(\"cols\", cols)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cols",_cols);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setcontainer(String _container) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetContainer(container As String) As WixLayout";
 //BA.debugLineNum = 222;BA.debugLine="Layout.SetAttr(\"container\", container)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",(Object)(_container));
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setcss(String _css) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetCss(css As String) As WixLayout";
 //BA.debugLineNum = 227;BA.debugLine="Layout.SetAttr(\"css\", css)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",(Object)(_css));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixLayout";
 //BA.debugLineNum = 237;BA.debugLine="Layout.SetAttr(\"disabled\", disabled)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setgravity(String _gravity) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetGravity(gravity As String) As WixLayout";
 //BA.debugLineNum = 232;BA.debugLine="Layout.SetAttr(\"gravity\", gravity)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",(Object)(_gravity));
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setheight(String _height) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetHeight(height As String) As WixLayout";
 //BA.debugLineNum = 242;BA.debugLine="Layout.SetAttr(\"height\", height)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",(Object)(_height));
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixLayout";
 //BA.debugLineNum = 247;BA.debugLine="Layout.SetAttr(\"hidden\", hidden)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setisolate(boolean _isolate) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetIsolate(isolate As Boolean) As WixLayout";
 //BA.debugLineNum = 253;BA.debugLine="Layout.SetAttr(\"isolate\", isolate)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("isolate",(Object)(_isolate));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 98;BA.debugLine="Sub SetMap(m As Map) As WixLayout";
 //BA.debugLineNum = 99;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 100;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 101;BA.debugLine="Layout.SetAttr(strKey,	strVal)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setmargin(String _margin) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetMargin(margin As String) As WixLayout";
 //BA.debugLineNum = 258;BA.debugLine="Layout.SetAttr(\"margin\", margin)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("margin",(Object)(_margin));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setmaxheght(Object _maxheght) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetMaxHeght(maxHeght As Object) As WixLayout";
 //BA.debugLineNum = 315;BA.debugLine="Layout.SetAttr(\"maxHeght\", maxHeght)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeght",_maxheght);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setmaxheight(String _maxheight) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetMaxHeight(maxHeight As String) As WixLayout";
 //BA.debugLineNum = 263;BA.debugLine="Layout.SetAttr(\"maxHeight\", maxHeight)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",(Object)(_maxheight));
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setmaxwidth(String _maxwidth) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetMaxWidth(maxWidth As String) As WixLayout";
 //BA.debugLineNum = 269;BA.debugLine="Layout.SetAttr(\"maxWidth\", maxWidth)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",(Object)(_maxwidth));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetMinHeight(h As Int) As WixLayout";
 //BA.debugLineNum = 141;BA.debugLine="Layout.SetMinHeight(h)";
_layout._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetMinWidth(w As Int) As WixLayout";
 //BA.debugLineNum = 135;BA.debugLine="Layout.SetMinWidth(w)";
_layout._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setname(String _n) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetName(n As String) As WixLayout";
 //BA.debugLineNum = 116;BA.debugLine="Layout.SetName(n)";
_layout._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setpadding(String _padding) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetPadding(padding As String) As WixLayout";
 //BA.debugLineNum = 274;BA.debugLine="Layout.SetAttr(\"padding\", padding)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",(Object)(_padding));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setpaddingx(String _paddingx) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetPaddingX(paddingX As String) As WixLayout";
 //BA.debugLineNum = 279;BA.debugLine="Layout.SetAttr(\"paddingX\", paddingX)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingX",(Object)(_paddingx));
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setpaddingy(String _paddingy) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetPaddingY(paddingY As String) As WixLayout";
 //BA.debugLineNum = 284;BA.debugLine="Layout.SetAttr(\"paddingY\", paddingY)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingY",(Object)(_paddingy));
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetParent(p As WixElement) As WixLayout";
 //BA.debugLineNum = 58;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetResponsive(b As Object) As WixLayout";
 //BA.debugLineNum = 122;BA.debugLine="Layout.SetResponsive(b)";
_layout._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixLayout";
 //BA.debugLineNum = 128;BA.debugLine="Layout.SetResponsiveCell(b)";
_layout._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setrows(Object _rows) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetRows(rows As Object) As WixLayout";
 //BA.debugLineNum = 320;BA.debugLine="Layout.SetAttr(\"rows\", rows)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rows",_rows);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetScroll(b As Object) As WixLayout";
 //BA.debugLineNum = 147;BA.debugLine="Layout.SetAttr(\"scroll\", b)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 36;BA.debugLine="Layout.SetStyle(prop,sval)";
_layout._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetStyles(m As Map) As WixLayout";
 //BA.debugLineNum = 27;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 28;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 29;BA.debugLine="Layout.SetStyle(k,v)";
_layout._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetTemplate(t As String) As WixLayout";
 //BA.debugLineNum = 153;BA.debugLine="Layout.SetTemplate(t)";
_layout._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 107;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixLayout";
 //BA.debugLineNum = 108;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 109;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 110;BA.debugLine="Layout.SetTemplate(os)";
_layout._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _settype(String _t) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetType(t As String) As WixLayout";
 //BA.debugLineNum = 160;BA.debugLine="Layout.SetType(t)";
_layout._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetTypeClean(a As String) As WixLayout   'igno";
 //BA.debugLineNum = 166;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetTypeForm(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 196;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetTypeHead(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 190;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetTypeLine(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 172;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetTypeSpace(a As String) As WixLayout   'igno";
 //BA.debugLineNum = 184;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetTypeWide(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 178;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setvisiblebatch(String _visiblebatch) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetVisibleBatch(visibleBatch As String) As Wix";
 //BA.debugLineNum = 295;BA.debugLine="Layout.SetAttr(\"visibleBatch\", visibleBatch)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("visibleBatch",(Object)(_visiblebatch));
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _setwidth(String _width) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetWidth(width As String) As WixLayout";
 //BA.debugLineNum = 300;BA.debugLine="Layout.SetAttr(\"width\", width)";
_layout._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",(Object)(_width));
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixlayout)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
