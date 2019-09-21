package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wiximage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wiximage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wiximage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _image = null;
public b4j.Mashy.BANanoWebixDemo.uoenowhtml _img = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wiximage  _addimageclass(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _lv = "";
 //BA.debugLineNum = 109;BA.debugLine="Sub AddImageClass(lst As List) As WixImage     'ig";
 //BA.debugLineNum = 110;BA.debugLine="For Each lv As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lv = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 111;BA.debugLine="img.AddClass(lv)";
_img._addclass /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_lv);
 }
};
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 177;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 182;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 215;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 172;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Image As WixElement";
_image = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private img As UOENowHTML";
_img = new b4j.Mashy.BANanoWebixDemo.uoenowhtml();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _gettemplate() throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="private Sub GetTemplate() As String";
 //BA.debugLineNum = 143;BA.debugLine="Return img.html";
if (true) return _img._html /*String*/ ();
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixImage";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Image.Initialize(ID).SetView(\"template\")";
_image._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("template");
 //BA.debugLineNum = 13;BA.debugLine="img.Initialize(\"\",\"img\").SetImportant(False)";
_img._initialize /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (ba,"","img")._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 14;BA.debugLine="img.SetStyle(\"width\",\"100%\")";
_img._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("width","100%");
 //BA.debugLineNum = 15;BA.debugLine="img.SetStyle(\"height\",\"100%\")";
_img._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("height","100%");
 //BA.debugLineNum = 16;BA.debugLine="Image.SetCSS(\"form_photo\")";
_image._setcss /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("form_photo");
 //BA.debugLineNum = 17;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 138;BA.debugLine="Image.SetTemplateHTML(img)";
_image._settemplatehtml /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_img);
 //BA.debugLineNum = 139;BA.debugLine="Return Image.Item";
if (true) return _image._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 96;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.Mashy.BANanoWebixDemo.wixpage _pg) throws Exception{
String _t = "";
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 185;BA.debugLine="Sub Refresh(pg As WixPage)";
 //BA.debugLineNum = 186;BA.debugLine="Dim t As String = GetTemplate";
_t = _gettemplate();
 //BA.debugLineNum = 187;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 188;BA.debugLine="opt.Put(\"template\", t)";
_opt.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 189;BA.debugLine="pg.Define(ID, opt)";
_pg._define /*String*/ (_id,_opt);
 //BA.debugLineNum = 190;BA.debugLine="pg.Refresh(ID)";
_pg._refresh /*String*/ (_id);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setalign(Object _r) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetAlign(r As Object) As WixImage 'ignore";
 //BA.debugLineNum = 23;BA.debugLine="Image.SetAlign(r)";
_image._setalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_r));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetAlignCenter(r As String) As WixImage 'ignor";
 //BA.debugLineNum = 64;BA.debugLine="Image.setAligncenter(\"\")";
_image._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetAlignLeft(r As String) As WixImage 'ignore";
 //BA.debugLineNum = 70;BA.debugLine="Image.SetAlignleft(\"\")";
_image._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetAlignRight(r As String) As WixImage 'ignore";
 //BA.debugLineNum = 58;BA.debugLine="Image.setAlignright(\"\")";
_image._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixImage";
 //BA.debugLineNum = 219;BA.debugLine="Image.SetAttr(\"animate\", animate)";
_image._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetAttributes(m As Map) As WixImage";
 //BA.debugLineNum = 41;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 42;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 43;BA.debugLine="Image.SetAttr(k,v)";
_image._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixImage 'ignore";
 //BA.debugLineNum = 76;BA.debugLine="Image.SetAutoWidth(b)";
_image._setautowidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setborderless(Object _b) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetBorderLess(b As Object) As WixImage";
 //BA.debugLineNum = 165;BA.debugLine="Image.SetBorderLess(b)";
_image._setborderless /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToBoolean(_b));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setcontainer(Object _w) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetContainer(w As Object) As WixImage";
 //BA.debugLineNum = 160;BA.debugLine="Image.SetContainer(w)";
_image._setcontainer /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_w));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetCss(css As Object) As WixImage";
 //BA.debugLineNum = 224;BA.debugLine="Image.SetAttr(\"css\", css)";
_image._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixImage";
 //BA.debugLineNum = 229;BA.debugLine="Image.SetAttr(\"disabled\", disabled)";
_image._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetGravity(gravity As Object) As WixImage";
 //BA.debugLineNum = 234;BA.debugLine="Image.SetAttr(\"gravity\", gravity)";
_image._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetHeight(h As Object) As WixImage";
 //BA.debugLineNum = 148;BA.debugLine="Image.setHeight(h)";
_image._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixImage";
 //BA.debugLineNum = 239;BA.debugLine="Image.SetAttr(\"hidden\", hidden)";
_image._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setimageattr(String _p,String _v) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetImageAttr(p As String, v As String) As WixI";
 //BA.debugLineNum = 117;BA.debugLine="img.SetAttr(p,v)";
_img._setattr /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_p,_v);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setimageattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 121;BA.debugLine="Sub SetImageAttributes(m As Map) As WixImage";
 //BA.debugLineNum = 122;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 123;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 124;BA.debugLine="SetImageAttr(k,v)";
_setimageattr(_k,_v);
 }
};
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setimagestyle(String _p,String _v) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetImageStyle(p As String, v As String) As Wix";
 //BA.debugLineNum = 105;BA.debugLine="img.SetStyle(p, v)";
_img._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_p,_v);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setimagestyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 129;BA.debugLine="Sub SetImageStyles(m As Map) As WixImage";
 //BA.debugLineNum = 130;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 131;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 132;BA.debugLine="SetImageStyle(k,v)";
_setimagestyle(_k,_v);
 }
};
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetMargin(margin As Object) As WixImage";
 //BA.debugLineNum = 36;BA.debugLine="Image.SetMargin(margin)";
_image._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixImage";
 //BA.debugLineNum = 244;BA.debugLine="Image.SetAttr(\"maxHeight\", maxHeight)";
_image._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixImage";
 //BA.debugLineNum = 249;BA.debugLine="Image.SetAttr(\"maxWidth\", maxWidth)";
_image._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetMinHeight(h As Int) As WixImage";
 //BA.debugLineNum = 202;BA.debugLine="Image.SetMinHeight(h)";
_image._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetMinWidth(w As Int) As WixImage";
 //BA.debugLineNum = 196;BA.debugLine="Image.SetMinWidth(w)";
_image._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetPadding(padding As Object) As WixImage";
 //BA.debugLineNum = 30;BA.debugLine="Image.SetPadding(padding)";
_image._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetParent(p As WixElement) As WixImage";
 //BA.debugLineNum = 89;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 82;BA.debugLine="Image.SetStyle(prop,sval)";
_image._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 48;BA.debugLine="Sub SetStyles(m As Map) As WixImage";
 //BA.debugLineNum = 49;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 50;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 51;BA.debugLine="Image.SetStyle(k,v)";
_image._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetTooltip(tt As String) As WixImage";
 //BA.debugLineNum = 209;BA.debugLine="Image.SetAttr(\"tooltip\", tt)";
_image._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setvalue(Object _s) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetValue(s As Object) As WixImage   'ignore";
 //BA.debugLineNum = 100;BA.debugLine="img.SetSRC(s,True)";
_img._setsrc /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (BA.ObjectToString(_s),__c.True);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetWidth(w As Object) As WixImage";
 //BA.debugLineNum = 154;BA.debugLine="Image.SetWidth(w)";
_image._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wiximage)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
