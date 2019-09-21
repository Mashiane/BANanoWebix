package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixrow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _row = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixrow  _addcells(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub AddCells(i As Map) As WixRow";
 //BA.debugLineNum = 147;BA.debugLine="Row.AddCells(i)";
_row._addcells /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_i);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _addcolumn(b4j.Mashy.BANanoWebixDemo.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub AddColumn(wxEL As WixRow) As WixRow";
 //BA.debugLineNum = 190;BA.debugLine="Row.AddColumns(wxEL.Item)";
_row._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _addcolumns(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub AddColumns(i As Map) As WixRow";
 //BA.debugLineNum = 92;BA.debugLine="Row.AddColumns(i)";
_row._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_i);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _addcolumnsitem(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub AddColumnsItem(i As Map) As WixRow";
 //BA.debugLineNum = 154;BA.debugLine="AddColumns(i)";
_addcolumns(_i);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _addcolumnsspacer(int _width) throws Exception{
anywheresoftware.b4a.objects.collections.Map _itm = null;
 //BA.debugLineNum = 159;BA.debugLine="Sub AddColumnsSpacer(width As Int) As WixRow  'ign";
 //BA.debugLineNum = 160;BA.debugLine="Dim itm As Map = CreateMap()";
_itm = new anywheresoftware.b4a.objects.collections.Map();
_itm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 161;BA.debugLine="If width > 0 Then itm.Put(\"width\", width)";
if (_width>0) { 
_itm.Put((Object)("width"),(Object)(_width));};
 //BA.debugLineNum = 162;BA.debugLine="Row.AddColumns(itm)";
_row._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _additem(anywheresoftware.b4a.objects.collections.Map _wxel) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub AddItem(wxEL As Map) As WixRow";
 //BA.debugLineNum = 184;BA.debugLine="Row.AddRows(wxEL)";
_row._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_wxel);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _addresizertocolumns(String _s) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub AddResizerToColumns(s As String) As WixRow   '";
 //BA.debugLineNum = 267;BA.debugLine="Row.AddResizerToColumns(s)";
_row._addresizertocolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_s);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _addresizertorows(String _s) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub AddResizerToRows(s As String) As WixRow   'ign";
 //BA.debugLineNum = 263;BA.debugLine="Row.AddResizerToRows(s)";
_row._addresizertorows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_s);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _addrows(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub AddRows(i As Map) As WixRow";
 //BA.debugLineNum = 167;BA.debugLine="Row.AddRows(i)";
_row._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_i);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _addrowscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 71;BA.debugLine="Sub AddRowsCells(mCells As List) As WixRow";
 //BA.debugLineNum = 72;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 73;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 74;BA.debugLine="AddRows(opt)";
_addrows(_opt);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _prt) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub AddToColumns(prt As WixElement)";
 //BA.debugLineNum = 237;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 259;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 196;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _addtopage(b4j.Mashy.BANanoWebixDemo.wixpage _p) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub AddToPage(p As WixPage)";
 //BA.debugLineNum = 201;BA.debugLine="p.Page.AddRows(Item)";
_p._page /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _addtopagerows(b4j.Mashy.BANanoWebixDemo.wixpage _sv) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub AddToPageRows(sv As WixPage)";
 //BA.debugLineNum = 245;BA.debugLine="sv.AddRows(Item)";
_sv._addrows /*String*/ (_item());
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _addtorow(b4j.Mashy.BANanoWebixDemo.wixrow _r) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 272;BA.debugLine="r.Row.AddColumns(Item)";
_r._row /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _prt) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub AddToRows(prt As WixElement)";
 //BA.debugLineNum = 232;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public String  _addtoscrollviewrows(b4j.Mashy.BANanoWebixDemo.wixscrollview _sv) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub AddToScrollViewRows(sv As WixScrollView)";
 //BA.debugLineNum = 241;BA.debugLine="sv.AddRows(Item)";
_sv._addrows /*String*/ (_item());
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Row As WixElement";
_row = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _createresizer(String _rid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _res1 = null;
 //BA.debugLineNum = 52;BA.debugLine="Sub CreateResizer(rid As String) As WixResizer";
 //BA.debugLineNum = 53;BA.debugLine="Dim res1 As WixResizer";
_res1 = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 54;BA.debugLine="res1.Initialize(rid)";
_res1._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,_rid);
 //BA.debugLineNum = 55;BA.debugLine="Return res1";
if (true) return _res1;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _initialize(anywheresoftware.b4a.BA _ba,String _rid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(rID As String) As WixRow";
 //BA.debugLineNum = 11;BA.debugLine="ID = rID.tolowercase";
_id = _rid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Row.Initialize(ID)";
_row._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 179;BA.debugLine="Return Row.item";
if (true) return _row._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 49;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixRow";
 //BA.debugLineNum = 374;BA.debugLine="Row.SetAttr(\"animate\", animate)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 17;BA.debugLine="Sub SetAttributes(m As Map) As WixRow";
 //BA.debugLineNum = 18;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 19;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 20;BA.debugLine="Row.SetAttr(k,v)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixRow";
 //BA.debugLineNum = 135;BA.debugLine="Row.SetAttr(\"autoheight\", b)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixRow";
 //BA.debugLineNum = 129;BA.debugLine="Row.SetAttr(\"autowidth\", b)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setbatch(String _paddingy) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetBatch(paddingY As String) As WixRow";
 //BA.debugLineNum = 364;BA.debugLine="Row.SetAttr(\"batch\", paddingY)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("batch",(Object)(_paddingy));
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixRow";
 //BA.debugLineNum = 307;BA.debugLine="Row.SetAttr(\"borderless\", borderless)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setcols(Object _cols) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetCols(cols As Object) As WixRow";
 //BA.debugLineNum = 379;BA.debugLine="Row.SetAttr(\"cols\", cols)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cols",_cols);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setcontainer(String _container) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetContainer(container As String) As WixRow";
 //BA.debugLineNum = 312;BA.debugLine="Row.SetAttr(\"container\", container)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",(Object)(_container));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setcss(String _css) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetCss(css As String) As WixRow";
 //BA.debugLineNum = 317;BA.debugLine="Row.SetAttr(\"css\", css)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",(Object)(_css));
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixRow";
 //BA.debugLineNum = 327;BA.debugLine="Row.SetAttr(\"disabled\", disabled)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setgravity(String _gravity) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetGravity(gravity As String) As WixRow";
 //BA.debugLineNum = 322;BA.debugLine="Row.SetAttr(\"gravity\", gravity)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",(Object)(_gravity));
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetHeight(h As Object) As WixRow";
 //BA.debugLineNum = 206;BA.debugLine="Row.SetHeight(h)";
_row._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixRow";
 //BA.debugLineNum = 332;BA.debugLine="Row.SetAttr(\"hidden\", hidden)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setisolate(boolean _isolate) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetIsolate(isolate As Boolean) As WixRow";
 //BA.debugLineNum = 338;BA.debugLine="Row.SetAttr(\"isolate\", isolate)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("isolate",(Object)(_isolate));
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 249;BA.debugLine="Sub SetMap(m As Map) As WixRow";
 //BA.debugLineNum = 250;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 251;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 252;BA.debugLine="Row.SetAttr(strKey,	strVal)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetMargin(margin As Object) As WixRow";
 //BA.debugLineNum = 86;BA.debugLine="Row.SetMargin(margin)";
_row._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setmaxheght(Object _maxheght) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="Sub SetMaxHeght(maxHeght As Object) As WixRow";
 //BA.debugLineNum = 384;BA.debugLine="Row.SetAttr(\"maxHeght\", maxHeght)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeght",_maxheght);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setmaxheight(String _maxheight) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetMaxHeight(maxHeight As String) As WixRow";
 //BA.debugLineNum = 343;BA.debugLine="Row.SetAttr(\"maxHeight\", maxHeight)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",(Object)(_maxheight));
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setmaxwidth(String _maxwidth) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetMaxWidth(maxWidth As String) As WixRow";
 //BA.debugLineNum = 349;BA.debugLine="Row.SetAttr(\"maxWidth\", maxWidth)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",(Object)(_maxwidth));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetMinHeight(h As Int) As WixRow";
 //BA.debugLineNum = 123;BA.debugLine="Row.SetMinHeight(h)";
_row._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetMinWidth(w As Int) As WixRow";
 //BA.debugLineNum = 117;BA.debugLine="Row.SetMinWidth(w)";
_row._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setname(String _n) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetName(n As String) As WixRow";
 //BA.debugLineNum = 98;BA.debugLine="Row.SetName(n)";
_row._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetPadding(padding As Object) As WixRow";
 //BA.debugLineNum = 80;BA.debugLine="Row.SetPadding(padding)";
_row._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setpaddingx(String _paddingx) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetPaddingX(paddingX As String) As WixRow";
 //BA.debugLineNum = 354;BA.debugLine="Row.SetAttr(\"paddingX\", paddingX)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingX",(Object)(_paddingx));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setpaddingy(String _paddingy) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetPaddingY(paddingY As String) As WixRow";
 //BA.debugLineNum = 359;BA.debugLine="Row.SetAttr(\"paddingY\", paddingY)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingY",(Object)(_paddingy));
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetParent(p As WixElement) As WixRow";
 //BA.debugLineNum = 42;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetResponsive(b As Object) As WixRow";
 //BA.debugLineNum = 104;BA.debugLine="Row.SetResponsive(b)";
_row._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRow";
 //BA.debugLineNum = 110;BA.debugLine="Row.SetResponsiveCell(b)";
_row._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setrows(Object _rows) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub SetRows(rows As Object) As WixRow";
 //BA.debugLineNum = 389;BA.debugLine="Row.SetAttr(\"rows\", rows)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rows",_rows);
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetScroll(b As Object) As WixRow";
 //BA.debugLineNum = 141;BA.debugLine="Row.SetAttr(\"scroll\", b)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 35;BA.debugLine="Row.SetStyle(prop,sval)";
_row._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 25;BA.debugLine="Sub SetStyles(m As Map) As WixRow";
 //BA.debugLineNum = 26;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 27;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 28;BA.debugLine="Row.SetStyle(k,v)";
_row._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetTemplate(t As String) As WixRow";
 //BA.debugLineNum = 226;BA.debugLine="Row.SetTemplate(t)";
_row._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 217;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRow";
 //BA.debugLineNum = 218;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 219;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 220;BA.debugLine="Row.SetTemplate(os)";
_row._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetTooltip(tt As String) As WixRow";
 //BA.debugLineNum = 173;BA.debugLine="Row.SetTooltip(tt)";
_row._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settype(Object _t) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetType(t As Object) As WixRow";
 //BA.debugLineNum = 66;BA.debugLine="Row.SetAttr(\"type\", t)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_t);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetTypeClean(a As String) As WixRow   'ignore";
 //BA.debugLineNum = 277;BA.debugLine="SetType(\"clean\")";
_settype((Object)("clean"));
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetTypeForm(a As String) As WixRow   'ignore";
 //BA.debugLineNum = 301;BA.debugLine="SetType(\"form\")";
_settype((Object)("form"));
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetTypeHead(a As String) As WixRow   'ignore";
 //BA.debugLineNum = 295;BA.debugLine="SetType(\"head\")";
_settype((Object)("head"));
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetTypeLine(a As String) As WixRow   'ignore";
 //BA.debugLineNum = 283;BA.debugLine="SetType(\"line\")";
_settype((Object)("line"));
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetTypeSpace(a As String) As WixRow   'ignore";
 //BA.debugLineNum = 289;BA.debugLine="SetType(\"space\")";
_settype((Object)("space"));
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _settypewide() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetTypeWide As WixRow";
 //BA.debugLineNum = 60;BA.debugLine="Row.SetAttr(\"type\", \"wide\")";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)("wide"));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setvisiblebatch(String _visiblebatch) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetVisibleBatch(visibleBatch As String) As Wix";
 //BA.debugLineNum = 369;BA.debugLine="Row.SetAttr(\"visibleBatch\", visibleBatch)";
_row._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("visibleBatch",(Object)(_visiblebatch));
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetWidth(w As Object) As WixRow";
 //BA.debugLineNum = 212;BA.debugLine="Row.setwidth(w)";
_row._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrow)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
