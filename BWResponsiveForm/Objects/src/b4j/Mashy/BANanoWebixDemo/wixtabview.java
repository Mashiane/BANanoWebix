package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtabview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtabview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtabview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _tabview = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _additem(b4j.Mashy.BANanoWebixDemo.wixtabitem _ti) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub AddItem(ti As WixTabItem)";
 //BA.debugLineNum = 139;BA.debugLine="TabView.AddCells(ti.Item)";
_tabview._addcells /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ti._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 149;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 154;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 144;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TabView As WixElement";
_tabview = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixTabView";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="TabView.Initialize(ID)";
_tabview._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="TabView.SetView(\"tabview\")";
_tabview._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tabview");
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 129;BA.debugLine="Return TabView.item";
if (true) return _tabview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 58;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixTabView";
 //BA.debugLineNum = 159;BA.debugLine="TabView.SetAttr(\"animate\", animate)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 24;BA.debugLine="Sub SetAttributes(m As Map) As WixTabView";
 //BA.debugLineNum = 25;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 26;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 27;BA.debugLine="TabView.SetAttr(k,v)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixTab";
 //BA.debugLineNum = 164;BA.debugLine="TabView.SetAttr(\"borderless\", borderless)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setcells(Object _cells) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetCells(cells As Object) As WixTabView";
 //BA.debugLineNum = 169;BA.debugLine="TabView.SetAttr(\"cells\", cells)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cells",_cells);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetContainer(container As Object) As WixTabVie";
 //BA.debugLineNum = 174;BA.debugLine="TabView.SetAttr(\"container\", container)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetCss(css As Object) As WixTabView";
 //BA.debugLineNum = 179;BA.debugLine="TabView.SetAttr(\"css\", css)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixTabView";
 //BA.debugLineNum = 184;BA.debugLine="TabView.SetAttr(\"disabled\", disabled)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetGravity(gravity As Object) As WixTabView";
 //BA.debugLineNum = 189;BA.debugLine="TabView.SetAttr(\"gravity\", gravity)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetHeight(h As Object) As WixTabView";
 //BA.debugLineNum = 101;BA.debugLine="TabView.SetAttr(\"height\", h)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixTabView";
 //BA.debugLineNum = 194;BA.debugLine="TabView.SetAttr(\"hidden\", hidden)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 48;BA.debugLine="Sub SetMap(m As Map) As WixTabView";
 //BA.debugLineNum = 49;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 50;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 51;BA.debugLine="TabView.SetAttr(strKey,	strVal)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixTabVie";
 //BA.debugLineNum = 199;BA.debugLine="TabView.SetAttr(\"maxHeight\", maxHeight)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixTabView";
 //BA.debugLineNum = 204;BA.debugLine="TabView.SetAttr(\"maxWidth\", maxWidth)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetMinHeight(h As Int) As WixTabView";
 //BA.debugLineNum = 95;BA.debugLine="TabView.SetMinHeight(h)";
_tabview._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetMinWidth(w As Int) As WixTabView";
 //BA.debugLineNum = 89;BA.debugLine="TabView.SetMinWidth(w)";
_tabview._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setmultiview(anywheresoftware.b4a.objects.collections.Map _tb) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetMultiview(tb As Map) As WixTabView";
 //BA.debugLineNum = 123;BA.debugLine="TabView.SetAttr(\"multiview\", tb)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiview",(Object)(_tb.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setname(String _n) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetName(n As String) As WixTabView";
 //BA.debugLineNum = 70;BA.debugLine="TabView.SetName(n)";
_tabview._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetPadding(padding As Object) As WixTabView";
 //BA.debugLineNum = 209;BA.debugLine="TabView.SetAttr(\"padding\", padding)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",_padding);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setpaddingx(Object _paddingx) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetPaddingX(paddingX As Object) As WixTabView";
 //BA.debugLineNum = 214;BA.debugLine="TabView.SetAttr(\"paddingX\", paddingX)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingX",_paddingx);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setpaddingy(Object _paddingy) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetPaddingY(paddingY As Object) As WixTabView";
 //BA.debugLineNum = 219;BA.debugLine="TabView.SetAttr(\"paddingY\", paddingY)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingY",_paddingy);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetParent(p As WixElement) As WixTabView";
 //BA.debugLineNum = 20;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetResponsive(b As Object) As WixTabView";
 //BA.debugLineNum = 76;BA.debugLine="TabView.SetResponsive(b)";
_tabview._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTabView";
 //BA.debugLineNum = 82;BA.debugLine="TabView.SetResponsiveCell(b)";
_tabview._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 42;BA.debugLine="TabView.SetStyle(prop,sval)";
_tabview._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub SetStyles(m As Map) As WixTabView";
 //BA.debugLineNum = 33;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 34;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 35;BA.debugLine="TabView.SetStyle(k,v)";
_tabview._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _settabbar(anywheresoftware.b4a.objects.collections.Map _tb) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetTabBar(tb As Map) As WixTabView";
 //BA.debugLineNum = 118;BA.debugLine="TabView.SetAttr(\"tabbar\", tb)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tabbar",(Object)(_tb.getObject()));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTabView";
 //BA.debugLineNum = 62;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 63;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 64;BA.debugLine="TabView.SetTemplate(os)";
_tabview._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetTooltip(tt As String) As WixTabView";
 //BA.debugLineNum = 113;BA.debugLine="TabView.SetTooltip(tt)";
_tabview._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetType(sType As Object) As WixTabView";
 //BA.debugLineNum = 224;BA.debugLine="TabView.SetAttr(\"type\", sType)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _settypebottom(boolean _b) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetTypeBottom(b As Boolean) As WixTabView   'i";
 //BA.debugLineNum = 134;BA.debugLine="TabView.SetType(\"bottom\")";
_tabview._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottom");
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetWidth(w As Object) As WixTabView";
 //BA.debugLineNum = 107;BA.debugLine="TabView.SetAttr(\"width\", w)";
_tabview._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabview)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
