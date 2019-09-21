package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixpager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixpager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixpager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _pager = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 206;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 211;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 201;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Pager As WixElement";
_pager = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sID As String) As WixPager";
 //BA.debugLineNum = 11;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Pager.Initialize(ID).SetView(\"pager\")";
_pager._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("pager");
 //BA.debugLineNum = 13;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
String _tt = "";
 //BA.debugLineNum = 189;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 190;BA.debugLine="Dim tt As String = sb.ToString";
_tt = _sb.ToString();
 //BA.debugLineNum = 191;BA.debugLine="tt = tt.trim";
_tt = _tt.trim();
 //BA.debugLineNum = 192;BA.debugLine="If tt <> \"\" Then";
if ((_tt).equals("") == false) { 
 //BA.debugLineNum = 193;BA.debugLine="Pager.SetTemplate(sb.ToString)";
_pager._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_sb.ToString()));
 };
 //BA.debugLineNum = 195;BA.debugLine="Return Pager.item";
if (true) return _pager._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 61;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetAnimate(b As Boolean) As WixPager";
 //BA.debugLineNum = 178;BA.debugLine="Pager.SetAttr(\"animate\", b)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_b));
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setapionly(Object _apionly) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetApiOnly(apiOnly As Object) As WixPager";
 //BA.debugLineNum = 216;BA.debugLine="Pager.SetAttr(\"apiOnly\", apiOnly)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("apiOnly",_apionly);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetAttributes(m As Map) As WixPager";
 //BA.debugLineNum = 37;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 38;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 39;BA.debugLine="Pager.SetAttr(k,v)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixPag";
 //BA.debugLineNum = 221;BA.debugLine="Pager.SetAttr(\"borderless\", borderless)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setcontainer(String _cont) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetContainer(cont As String) As WixPager";
 //BA.debugLineNum = 145;BA.debugLine="Pager.SetAttr(\"container\", cont)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",(Object)(_cont));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setcount(Object _c) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetCount(c As Object) As WixPager";
 //BA.debugLineNum = 166;BA.debugLine="Pager.SetAttr(\"count\", c)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("count",_c);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetCss(css As Object) As WixPager";
 //BA.debugLineNum = 226;BA.debugLine="Pager.SetAttr(\"css\", css)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixPager";
 //BA.debugLineNum = 231;BA.debugLine="Pager.SetAttr(\"disabled\", disabled)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetGravity(gravity As Object) As WixPager";
 //BA.debugLineNum = 236;BA.debugLine="Pager.SetAttr(\"gravity\", gravity)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setgroup(int _g) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetGroup(g As Int) As WixPager";
 //BA.debugLineNum = 172;BA.debugLine="Pager.SetAttr(\"group\", g)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("group",(Object)(_g));
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetHeight(height As Object) As WixPager";
 //BA.debugLineNum = 241;BA.debugLine="Pager.SetAttr(\"height\", height)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixPager";
 //BA.debugLineNum = 246;BA.debugLine="Pager.SetAttr(\"hidden\", hidden)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setlevel(Object _level) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetLevel(level As Object) As WixPager";
 //BA.debugLineNum = 251;BA.debugLine="Pager.SetAttr(\"level\", level)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("level",_level);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setlimit(Object _limit) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetLimit(limit As Object) As WixPager";
 //BA.debugLineNum = 256;BA.debugLine="Pager.SetAttr(\"limit\", limit)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("limit",_limit);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 150;BA.debugLine="Sub SetMap(m As Map) As WixPager";
 //BA.debugLineNum = 151;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 152;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 153;BA.debugLine="Pager.SetAttr(strKey,	strVal)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetMargin(margin As Object) As WixPager";
 //BA.debugLineNum = 32;BA.debugLine="Pager.SetMargin(margin)";
_pager._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setmaster(Object _m) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetMaster(m As Object) As WixPager";
 //BA.debugLineNum = 160;BA.debugLine="Pager.SetAttr(\"master\", m)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("master",_m);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixPager";
 //BA.debugLineNum = 261;BA.debugLine="Pager.SetAttr(\"maxHeight\", maxHeight)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixPager";
 //BA.debugLineNum = 266;BA.debugLine="Pager.SetAttr(\"maxWidth\", maxWidth)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetMinHeight(h As Int) As WixPager";
 //BA.debugLineNum = 107;BA.debugLine="Pager.SetMinHeight(h)";
_pager._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetMinWidth(w As Int) As WixPager";
 //BA.debugLineNum = 101;BA.debugLine="Pager.SetMinWidth(w)";
_pager._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setname(String _n) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetName(n As String) As WixPager";
 //BA.debugLineNum = 82;BA.debugLine="Pager.SetName(n)";
_pager._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetPadding(padding As Object) As WixPager";
 //BA.debugLineNum = 26;BA.debugLine="Pager.SetPadding(padding)";
_pager._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setpage(Object _page) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetPage(page As Object) As WixPager";
 //BA.debugLineNum = 271;BA.debugLine="Pager.SetAttr(\"page\", page)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("page",_page);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetParent(p As WixElement) As WixPager";
 //BA.debugLineNum = 20;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetResponsive(b As Object) As WixPager";
 //BA.debugLineNum = 88;BA.debugLine="Pager.SetResponsive(b)";
_pager._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixPager";
 //BA.debugLineNum = 94;BA.debugLine="Pager.SetResponsiveCell(b)";
_pager._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setshowfirst(boolean _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetShowFirst(b As Boolean) As WixPager";
 //BA.debugLineNum = 66;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 67;BA.debugLine="sb.Append(\"{common.first()} \")";
_sb.Append("{common.first()} ");
 };
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setshowlast(boolean _b) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetShowLast(b As Boolean) As WixPager";
 //BA.debugLineNum = 137;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 138;BA.debugLine="sb.Append(\"{common.last()}\")";
_sb.Append("{common.last()}");
 };
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setshownext(boolean _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetShowNext(b As Boolean) As WixPager";
 //BA.debugLineNum = 129;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 130;BA.debugLine="sb.Append(\"{common.next()} \")";
_sb.Append("{common.next()} ");
 };
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setshowpages(boolean _b) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetShowPages(b As Boolean) As WixPager";
 //BA.debugLineNum = 121;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 122;BA.debugLine="sb.Append(\"{common.pages()} \")";
_sb.Append("{common.pages()} ");
 };
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setshowprev(boolean _b) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetShowPrev(b As Boolean) As WixPager";
 //BA.debugLineNum = 113;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 114;BA.debugLine="sb.Append(\"{common.prev()} \")";
_sb.Append("{common.prev()} ");
 };
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setsize(int _s) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetSize(s As Int) As WixPager";
 //BA.debugLineNum = 184;BA.debugLine="Pager.SetAttr(\"size\", s)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("size",(Object)(_s));
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 54;BA.debugLine="Pager.SetStyle(prop,sval)";
_pager._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyles(m As Map) As WixPager";
 //BA.debugLineNum = 45;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 46;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 47;BA.debugLine="Pager.SetStyle(k,v)";
_pager._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _settemplate(Object _template) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetTemplate(template As Object) As WixPager";
 //BA.debugLineNum = 276;BA.debugLine="Pager.SetAttr(\"template\", template)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("template",_template);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixPager";
 //BA.debugLineNum = 74;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 75;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 76;BA.debugLine="Pager.SetTemplate(os)";
_pager._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetWidth(width As Object) As WixPager";
 //BA.debugLineNum = 281;BA.debugLine="Pager.SetAttr(\"width\", width)";
_pager._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixpager)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
