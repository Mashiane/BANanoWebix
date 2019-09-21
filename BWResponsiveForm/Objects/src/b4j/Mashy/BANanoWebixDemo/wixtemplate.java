package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _template = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 55;BA.debugLine="Template.AddColumns(itm)";
_template._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _addrow(b4j.Mashy.BANanoWebixDemo.wixrow _r) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub AddRow(r As WixRow) As WixTemplate";
 //BA.debugLineNum = 104;BA.debugLine="AddRows(r.Item)";
_addrows(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 120;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 121;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 122;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 100;BA.debugLine="Template.AddRows(itm)";
_template._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_itm);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 219;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 224;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 214;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrow _i = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 128;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.Mashy.BANanoWebixDemo.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 129;BA.debugLine="AddRow(i)";
_addrow(_i);
 }
};
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Template As WixElement";
_template = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixTemplat";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Template.Initialize(ID).setview(\"template\")";
_template._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("template");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 45;BA.debugLine="Return Template.item";
if (true) return _template._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 50;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixTemplate";
 //BA.debugLineNum = 228;BA.debugLine="Template.SetAttr(\"animate\", animate)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setautoheight(boolean _autoheight) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetAutoheight(autoheight As Boolean) As WixTem";
 //BA.debugLineNum = 233;BA.debugLine="Template.SetAttr(\"autoheight\", autoheight)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autoheight",(Object)(_autoheight));
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixTemplate";
 //BA.debugLineNum = 147;BA.debugLine="Template.SetAttr(\"autowidth\", b)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixTem";
 //BA.debugLineNum = 238;BA.debugLine="Template.SetAttr(\"borderless\", borderless)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetContainer(container As Object) As WixTempla";
 //BA.debugLineNum = 243;BA.debugLine="Template.SetAttr(\"container\", container)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setcontent(Object _content) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetContent(content As Object) As WixTemplate";
 //BA.debugLineNum = 248;BA.debugLine="Template.SetAttr(\"content\", content)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("content",_content);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetCss(css As Object) As WixTemplate";
 //BA.debugLineNum = 253;BA.debugLine="Template.SetAttr(\"css\", css)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setdata(Object _data) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetData(data As Object) As WixTemplate";
 //BA.debugLineNum = 258;BA.debugLine="Template.SetAttr(\"data\", data)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("data",_data);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetDatatype(datatype As Object) As WixTemplate";
 //BA.debugLineNum = 308;BA.debugLine="Template.SetAttr(\"datatype\", datatype)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixTemplat";
 //BA.debugLineNum = 263;BA.debugLine="Template.SetAttr(\"disabled\", disabled)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetGravity(gravity As Object) As WixTemplate";
 //BA.debugLineNum = 268;BA.debugLine="Template.SetAttr(\"gravity\", gravity)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetHeight(h As Object) As WixTemplate";
 //BA.debugLineNum = 135;BA.debugLine="Template.SetAttr(\"height\", h)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixTemplate";
 //BA.debugLineNum = 273;BA.debugLine="Template.SetAttr(\"hidden\", hidden)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 110;BA.debugLine="Sub SetMap(m As Map) As WixTemplate";
 //BA.debugLineNum = 111;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 112;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 113;BA.debugLine="Template.SetAttr(strKey,	strVal)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetMargin(margin As Object) As WixTemplate";
 //BA.debugLineNum = 24;BA.debugLine="Template.SetMargin(margin)";
_template._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixTempla";
 //BA.debugLineNum = 278;BA.debugLine="Template.SetAttr(\"maxHeight\", maxHeight)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixTemplate";
 //BA.debugLineNum = 283;BA.debugLine="Template.SetAttr(\"maxWidth\", maxWidth)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetMinHeight(h As Int) As WixTemplate";
 //BA.debugLineNum = 94;BA.debugLine="Template.SetMinHeight(h)";
_template._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetMinWidth(w As Int) As WixTemplate";
 //BA.debugLineNum = 88;BA.debugLine="Template.SetMinWidth(w)";
_template._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setname(String _n) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetName(n As String) As WixTemplate";
 //BA.debugLineNum = 68;BA.debugLine="Template.SetName(n)";
_template._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetPadding(padding As Object) As WixTemplate";
 //BA.debugLineNum = 18;BA.debugLine="Template.SetPadding(padding)";
_template._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetParent(p As WixElement) As WixTemplate";
 //BA.debugLineNum = 38;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetResponsive(b As Object) As WixTemplate";
 //BA.debugLineNum = 75;BA.debugLine="Template.SetResponsive(b)";
_template._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTemplate";
 //BA.debugLineNum = 81;BA.debugLine="Template.SetResponsiveCell(b)";
_template._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetScroll(b As Object) As WixTemplate";
 //BA.debugLineNum = 159;BA.debugLine="Template.SetAttr(\"scroll\", b)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixTe";
 //BA.debugLineNum = 288;BA.debugLine="Template.SetAttr(\"scrollSpeed\", scrollSpeed)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setscrollxy(boolean _b) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetScrollXY(b As Boolean) As WixTemplate  'ign";
 //BA.debugLineNum = 165;BA.debugLine="SetScroll(\"xy\")";
_setscroll((Object)("xy"));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setsrc(Object _src) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetSrc(src As Object) As WixTemplate";
 //BA.debugLineNum = 293;BA.debugLine="Template.SetAttr(\"src\", src)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("src",_src);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 31;BA.debugLine="Template.SetStyle(prop,sval)";
_template._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetTemplate(t As String) As WixTemplate";
 //BA.debugLineNum = 153;BA.debugLine="Template.SetAttr(\"template\", t)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("template",(Object)(_t));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 59;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTemplat";
 //BA.debugLineNum = 60;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 61;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 62;BA.debugLine="Template.SetTemplate(os)";
_template._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settooltip(Object _tooltip) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub SetTooltip(tooltip As Object) As WixTemplate";
 //BA.debugLineNum = 298;BA.debugLine="Template.SetAttr(\"tooltip\", tooltip)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",_tooltip);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settype(String _t) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetType(t As String) As WixTemplate";
 //BA.debugLineNum = 171;BA.debugLine="Template.SetType(t)";
_template._settype /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetTypeClean(a As String) As WixTemplate  'ign";
 //BA.debugLineNum = 177;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetTypeForm(a As String) As WixTemplate  'igno";
 //BA.debugLineNum = 207;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetTypeHead(a As String) As WixTemplate   'ign";
 //BA.debugLineNum = 201;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetTypeLine(a As String) As WixTemplate   'ign";
 //BA.debugLineNum = 183;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetTypeSpace(a As String) As WixTemplate   'ig";
 //BA.debugLineNum = 195;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetTypeWide(a As String) As WixTemplate   'ign";
 //BA.debugLineNum = 189;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetUrl(url As Object) As WixTemplate";
 //BA.debugLineNum = 303;BA.debugLine="Template.SetAttr(\"url\", url)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetWidth(w As Object) As WixTemplate";
 //BA.debugLineNum = 141;BA.debugLine="Template.SetAttr(\"width\", w)";
_template._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtemplate)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
