package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcolumn extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcolumn", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcolumn.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _column = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub AddColumns(itm As Map) As WixColumn";
 //BA.debugLineNum = 128;BA.debugLine="Column.AddColumns(itm)";
_column._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public String  _additem(anywheresoftware.b4a.objects.collections.Map _wxel) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub AddItem(wxEL As Map)";
 //BA.debugLineNum = 139;BA.debugLine="Column.AddColumns(wxEL)";
_column._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_wxel);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _addresizertocolumns(String _s) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub AddResizerToColumns(s As String) As WixColumn";
 //BA.debugLineNum = 75;BA.debugLine="Column.AddResizerToColumns(s)";
_column._addresizertocolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_s);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _addresizertorows(String _s) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub AddResizerToRows(s As String) As WixColumn   '";
 //BA.debugLineNum = 71;BA.debugLine="Column.AddResizerToRows(s)";
_column._addresizertorows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_s);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub AddRows(itm As Map) As WixColumn";
 //BA.debugLineNum = 53;BA.debugLine="Column.AddRows(itm)";
_column._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 179;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 184;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 145;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _addtorow(b4j.Mashy.BANanoWebixDemo.wixrow _r) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 150;BA.debugLine="r.Row.AddColumns(Item)";
_r._row /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 174;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Column As WixElement";
_column = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _initialize(anywheresoftware.b4a.BA _ba,String _rid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(rID As String) As WixColumn";
 //BA.debugLineNum = 11;BA.debugLine="ID = rID.tolowercase";
_id = _rid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Column.Initialize(ID)";
_column._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 134;BA.debugLine="Return Column.item";
if (true) return _column._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 59;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixColumn";
 //BA.debugLineNum = 312;BA.debugLine="Column.SetAttr(\"animate\", animate)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetAttributes(m As Map) As WixColumn";
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
 //BA.debugLineNum = 38;BA.debugLine="Column.SetAttr(k,v)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setbatch(String _paddingy) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetBatch(paddingY As String) As WixColumn";
 //BA.debugLineNum = 296;BA.debugLine="Column.SetAttr(\"batch\", paddingY)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("batch",(Object)(_paddingy));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixCol";
 //BA.debugLineNum = 239;BA.debugLine="Column.SetAttr(\"borderless\", borderless)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setcols(Object _cols) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetCols(cols As Object) As WixColumn";
 //BA.debugLineNum = 317;BA.debugLine="Column.SetAttr(\"cols\", cols)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cols",_cols);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setcontainer(String _container) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetContainer(container As String) As WixColumn";
 //BA.debugLineNum = 244;BA.debugLine="Column.SetAttr(\"container\", container)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",(Object)(_container));
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setcss(String _css) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetCss(css As String) As WixColumn";
 //BA.debugLineNum = 249;BA.debugLine="Column.SetAttr(\"css\", css)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",(Object)(_css));
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixColumn";
 //BA.debugLineNum = 259;BA.debugLine="Column.SetAttr(\"disabled\", disabled)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setgravity(String _gravity) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetGravity(gravity As String) As WixColumn";
 //BA.debugLineNum = 254;BA.debugLine="Column.SetAttr(\"gravity\", gravity)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",(Object)(_gravity));
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetHeight(h As Object) As WixColumn";
 //BA.debugLineNum = 155;BA.debugLine="Column.SetHeight(h)";
_column._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixColumn";
 //BA.debugLineNum = 264;BA.debugLine="Column.SetAttr(\"hidden\", hidden)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setisolate(boolean _isolate) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetIsolate(isolate As Boolean) As WixColumn";
 //BA.debugLineNum = 270;BA.debugLine="Column.SetAttr(\"isolate\", isolate)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("isolate",(Object)(_isolate));
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 117;BA.debugLine="Sub SetMap(m As Map) As WixColumn";
 //BA.debugLineNum = 118;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 119;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 120;BA.debugLine="Column.SetAttr(strKey,	strVal)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetMargin(margin As Object) As WixColumn";
 //BA.debugLineNum = 31;BA.debugLine="Column.SetMargin(margin)";
_column._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setmaxheght(Object _maxheght) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetMaxHeght(maxHeght As Object) As WixColumn";
 //BA.debugLineNum = 322;BA.debugLine="Column.SetAttr(\"maxHeght\", maxHeght)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeght",_maxheght);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setmaxheight(String _maxheight) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetMaxHeight(maxHeight As String) As WixColumn";
 //BA.debugLineNum = 275;BA.debugLine="Column.SetAttr(\"maxHeight\", maxHeight)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",(Object)(_maxheight));
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setmaxwidth(String _maxwidth) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetMaxWidth(maxWidth As String) As WixColumn";
 //BA.debugLineNum = 281;BA.debugLine="Column.SetAttr(\"maxWidth\", maxWidth)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",(Object)(_maxwidth));
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetMinHeight(h As Int) As WixColumn";
 //BA.debugLineNum = 106;BA.debugLine="Column.SetMinHeight(h)";
_column._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetMinWidth(w As Int) As WixColumn";
 //BA.debugLineNum = 100;BA.debugLine="Column.SetMinWidth(w)";
_column._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setname(String _n) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetName(n As String) As WixColumn";
 //BA.debugLineNum = 81;BA.debugLine="Column.SetName(n)";
_column._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetPadding(padding As Object) As WixColumn";
 //BA.debugLineNum = 25;BA.debugLine="Column.SetPadding(padding)";
_column._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setpaddingx(String _paddingx) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetPaddingX(paddingX As String) As WixColumn";
 //BA.debugLineNum = 286;BA.debugLine="Column.SetAttr(\"paddingX\", paddingX)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingX",(Object)(_paddingx));
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setpaddingy(String _paddingy) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetPaddingY(paddingY As String) As WixColumn";
 //BA.debugLineNum = 291;BA.debugLine="Column.SetAttr(\"paddingY\", paddingY)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingY",(Object)(_paddingy));
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetParent(p As WixElement) As WixColumn";
 //BA.debugLineNum = 19;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetResponsive(b As Object) As WixColumn";
 //BA.debugLineNum = 87;BA.debugLine="Column.SetResponsive(b)";
_column._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixColumn";
 //BA.debugLineNum = 93;BA.debugLine="Column.SetResponsiveCell(b)";
_column._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setrows(Object _rows) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetRows(rows As Object) As WixColumn";
 //BA.debugLineNum = 327;BA.debugLine="Column.SetAttr(\"rows\", rows)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rows",_rows);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetScroll(b As Object) As WixColumn";
 //BA.debugLineNum = 190;BA.debugLine="Column.SetAttr(\"scroll\", b)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 302;BA.debugLine="Column.SetStyle(prop,val)";
_column._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SetStyles(m As Map) As WixColumn";
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
 //BA.debugLineNum = 46;BA.debugLine="Column.SetStyle(k,v)";
_column._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetTemplate(t As String) As WixColumn";
 //BA.debugLineNum = 167;BA.debugLine="Column.SetTemplate(t)";
_column._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 62;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixColumn";
 //BA.debugLineNum = 63;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 64;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 65;BA.debugLine="Column.SetTemplate(os)";
_column._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetTooltip(tt As String) As WixColumn";
 //BA.debugLineNum = 112;BA.debugLine="Column.SetTooltip(tt)";
_column._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settype(String _t) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetType(t As String) As WixColumn";
 //BA.debugLineNum = 197;BA.debugLine="Column.SetType(t)";
_column._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetTypeClean(a As String) As WixColumn   'igno";
 //BA.debugLineNum = 203;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetTypeForm(a As String) As WixColumn   'ignor";
 //BA.debugLineNum = 233;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetTypeHead(a As String) As WixColumn   'ignor";
 //BA.debugLineNum = 227;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetTypeLine(a As String) As WixColumn   'ignor";
 //BA.debugLineNum = 209;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetTypeSpace(a As String) As WixColumn   'igno";
 //BA.debugLineNum = 221;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetTypeWide(a As String) As WixColumn   'ignor";
 //BA.debugLineNum = 215;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setvisiblebatch(String _visiblebatch) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetVisibleBatch(visibleBatch As String) As Wix";
 //BA.debugLineNum = 307;BA.debugLine="Column.SetAttr(\"visibleBatch\", visibleBatch)";
_column._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("visibleBatch",(Object)(_visiblebatch));
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetWidth(w As Object) As WixColumn";
 //BA.debugLineNum = 161;BA.debugLine="Column.SetWidth(w)";
_column._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcolumn)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
