package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixmultiview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixmultiview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixmultiview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _multiview = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _additem(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub AddItem(i As Map) As WixMultiView";
 //BA.debugLineNum = 49;BA.debugLine="MultiView.AddCells(i)";
_multiview._addcells /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_i);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 154;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 159;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 149;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public MultiView As WixElement";
_multiview = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixMultiVi";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="MultiView.Initialize(ID)";
_multiview._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="MultiView.SetView(\"multiview\")";
_multiview._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiview");
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 125;BA.debugLine="Return MultiView.item";
if (true) return _multiview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 55;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetAnimate(b As Boolean) As WixMultiView";
 //BA.debugLineNum = 136;BA.debugLine="MultiView.SetAttr(\"animate\", b)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_b));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 18;BA.debugLine="Sub SetAttributes(m As Map) As WixMultiView";
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
 //BA.debugLineNum = 21;BA.debugLine="MultiView.SetAttr(k,v)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixMul";
 //BA.debugLineNum = 164;BA.debugLine="MultiView.SetAttr(\"borderless\", borderless)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setcells(Object _cells) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetCells(cells As Object) As WixMultiView";
 //BA.debugLineNum = 169;BA.debugLine="MultiView.SetAttr(\"cells\", cells)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cells",_cells);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setcols(Object _cols) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetCols(cols As Object) As WixMultiView";
 //BA.debugLineNum = 174;BA.debugLine="MultiView.SetAttr(\"cols\", cols)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cols",_cols);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetContainer(container As Object) As WixMultiV";
 //BA.debugLineNum = 179;BA.debugLine="MultiView.SetAttr(\"container\", container)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetCss(css As Object) As WixMultiView";
 //BA.debugLineNum = 184;BA.debugLine="MultiView.SetAttr(\"css\", css)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixMultiVi";
 //BA.debugLineNum = 189;BA.debugLine="MultiView.SetAttr(\"disabled\", disabled)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setfitbiggest(boolean _b) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetFitBiggest(b As Boolean) As WixMultiView";
 //BA.debugLineNum = 130;BA.debugLine="MultiView.SetAttr(\"fitBiggest\", b)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("fitBiggest",(Object)(_b));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetGravity(gravity As Object) As WixMultiView";
 //BA.debugLineNum = 194;BA.debugLine="MultiView.SetAttr(\"gravity\", gravity)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetHeight(height As Object) As WixMultiView";
 //BA.debugLineNum = 199;BA.debugLine="MultiView.SetAttr(\"height\", height)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixMultiView";
 //BA.debugLineNum = 204;BA.debugLine="MultiView.SetAttr(\"hidden\", hidden)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setkeepviews(boolean _b) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetkeepViews(b As Boolean) As WixMultiView";
 //BA.debugLineNum = 142;BA.debugLine="MultiView.SetAttr(\"keepViews\", b)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("keepViews",(Object)(_b));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub SetMap(m As Map) As WixMultiView";
 //BA.debugLineNum = 65;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 66;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 67;BA.debugLine="MultiView.SetAttr(strKey,	strVal)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixMultiV";
 //BA.debugLineNum = 210;BA.debugLine="MultiView.SetAttr(\"maxHeight\", maxHeight)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixMultiVie";
 //BA.debugLineNum = 215;BA.debugLine="MultiView.SetAttr(\"maxWidth\", maxWidth)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetMinHeight(h As Int) As WixMultiView";
 //BA.debugLineNum = 112;BA.debugLine="MultiView.SetMinHeight(h)";
_multiview._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetMinWidth(w As Int) As WixMultiView";
 //BA.debugLineNum = 106;BA.debugLine="MultiView.SetMinWidth(w)";
_multiview._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setname(String _n) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetName(n As String) As WixMultiView";
 //BA.debugLineNum = 87;BA.debugLine="MultiView.SetName(n)";
_multiview._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetPadding(p As Object) As WixMultiView";
 //BA.debugLineNum = 74;BA.debugLine="MultiView.SetPadding(p)";
_multiview._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_p));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetParent(p As WixElement) As WixMultiView";
 //BA.debugLineNum = 43;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetResponsive(b As Object) As WixMultiView";
 //BA.debugLineNum = 93;BA.debugLine="MultiView.SetResponsive(b)";
_multiview._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixMultiView";
 //BA.debugLineNum = 99;BA.debugLine="MultiView.SetResponsiveCell(b)";
_multiview._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setrows(Object _rows) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetRows(rows As Object) As WixMultiView";
 //BA.debugLineNum = 220;BA.debugLine="MultiView.SetAttr(\"rows\", rows)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rows",_rows);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 36;BA.debugLine="MultiView.SetStyle(prop,sval)";
_multiview._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetStyles(m As Map) As WixMultiView";
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
 //BA.debugLineNum = 29;BA.debugLine="MultiView.SetStyle(k,v)";
_multiview._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 78;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixMultiVi";
 //BA.debugLineNum = 79;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 80;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 81;BA.debugLine="MultiView.SetTemplate(os)";
_multiview._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetTooltip(tt As String) As WixMultiView";
 //BA.debugLineNum = 118;BA.debugLine="MultiView.SetTooltip(tt)";
_multiview._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setvisiblebatch(Object _v) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetVisibleBatch(v As Object) As WixMultiView";
 //BA.debugLineNum = 59;BA.debugLine="MultiView.SetAttr(\"visibleBatch\", v)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("visibleBatch",_v);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetWidth(width As Object) As WixMultiView";
 //BA.debugLineNum = 225;BA.debugLine="MultiView.SetAttr(\"width\", width)";
_multiview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixmultiview)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
