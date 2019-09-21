package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrichtext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixrichtext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixrichtext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _richtext = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 240;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 245;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 53;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 235;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public RichText As WixElement";
_richtext = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(iID As String) As WixRichTex";
 //BA.debugLineNum = 10;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="RichText.Initialize(iID).SetView(\"richtext\")";
_richtext._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("richtext");
 //BA.debugLineNum = 12;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 162;BA.debugLine="Return RichText.item";
if (true) return _richtext._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 18;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetAlignCenter(r As String) As WixRichText 'ig";
 //BA.debugLineNum = 222;BA.debugLine="RichText.setAligncenter(\"\")";
_richtext._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetAlignLeft(r As String) As WixRichText 'igno";
 //BA.debugLineNum = 228;BA.debugLine="RichText.SetAlignleft(\"\")";
_richtext._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetAlignRight(r As String) As WixRichText 'ign";
 //BA.debugLineNum = 216;BA.debugLine="RichText.setAlignright(\"\")";
_richtext._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixRichtext";
 //BA.debugLineNum = 250;BA.debugLine="Richtext.SetAttr(\"animate\", animate)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetAttributes(m As Map) As WixRichText";
 //BA.debugLineNum = 22;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 23;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 24;BA.debugLine="RichText.SetAttr(k,v)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixRic";
 //BA.debugLineNum = 255;BA.debugLine="RichText.SetAttr(\"borderless\", borderless)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setbottomlabel(Object _f) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetBottomLabel(f As Object) As WixRichText";
 //BA.debugLineNum = 186;BA.debugLine="RichText.SetAttr(\"bottomLabel\", f)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_f);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setbottompadding(Object _f) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetBottomPadding(f As Object) As WixRichText";
 //BA.debugLineNum = 192;BA.debugLine="RichText.SetAttr(\"bottomPadding\", f)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_f);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetContainer(container As Object) As WixRichTe";
 //BA.debugLineNum = 260;BA.debugLine="RichText.SetAttr(\"container\", container)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetCss(css As Object) As WixRichText";
 //BA.debugLineNum = 265;BA.debugLine="RichText.SetAttr(\"css\", css)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixRichTex";
 //BA.debugLineNum = 270;BA.debugLine="RichText.SetAttr(\"disabled\", disabled)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetGravity(gravity As Object) As WixRichText";
 //BA.debugLineNum = 275;BA.debugLine="RichText.SetAttr(\"gravity\", gravity)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetHeight(h As Object) As WixRichText";
 //BA.debugLineNum = 167;BA.debugLine="RichText.SetHeight(h)";
_richtext._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixRichText";
 //BA.debugLineNum = 280;BA.debugLine="RichText.SetAttr(\"hidden\", hidden)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setinvalidmessage(String _msg) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetInvalidMessage(msg As String) As WixRichTex";
 //BA.debugLineNum = 88;BA.debugLine="RichText.SetAttr(\"invalidMessage\", msg)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",(Object)(_msg));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetLabel(l As String) As WixRichText";
 //BA.debugLineNum = 179;BA.debugLine="RichText.SetLabel(l)";
_richtext._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetLabelAlign(a As String) As WixRichText";
 //BA.debugLineNum = 198;BA.debugLine="RichText.SetLabelAlign(a)";
_richtext._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetLabelPosition(p As String) As WixRichText";
 //BA.debugLineNum = 204;BA.debugLine="RichText.SetLabelPosition(p)";
_richtext._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetLabelWidth(w As Int) As WixRichText";
 //BA.debugLineNum = 210;BA.debugLine="RichText.SetLabelWidth(w)";
_richtext._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 101;BA.debugLine="Sub SetMap(m As Map) As WixRichText";
 //BA.debugLineNum = 102;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 103;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 104;BA.debugLine="RichText.SetAttr(strKey,	strVal)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixRichTe";
 //BA.debugLineNum = 285;BA.debugLine="RichText.SetAttr(\"maxHeight\", maxHeight)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixRichText";
 //BA.debugLineNum = 290;BA.debugLine="RichText.SetAttr(\"maxWidth\", maxWidth)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetMinHeight(h As Int) As WixRichText";
 //BA.debugLineNum = 150;BA.debugLine="RichText.SetMinHeight(h)";
_richtext._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetMinWidth(w As Int) As WixRichText";
 //BA.debugLineNum = 144;BA.debugLine="RichText.SetMinWidth(w)";
_richtext._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setname(String _n) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetName(n As String) As WixRichText";
 //BA.debugLineNum = 125;BA.debugLine="RichText.SetName(n)";
_richtext._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetPadding(padding As Object) As WixRichText";
 //BA.debugLineNum = 295;BA.debugLine="RichText.SetAttr(\"padding\", padding)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",_padding);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setpaddingx(Object _paddingx) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetPaddingX(paddingX As Object) As WixRichText";
 //BA.debugLineNum = 300;BA.debugLine="RichText.SetAttr(\"paddingX\", paddingX)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingX",_paddingx);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setpaddingy(Object _paddingy) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetPaddingY(paddingY As Object) As WixRichText";
 //BA.debugLineNum = 305;BA.debugLine="RichText.SetAttr(\"paddingY\", paddingY)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingY",_paddingy);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetParent(p As WixElement) As WixRichText";
 //BA.debugLineNum = 46;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetPlaceHolder(ph As String) As WixRichText";
 //BA.debugLineNum = 112;BA.debugLine="RichText.SetPlaceHolder(ph)";
_richtext._setplaceholder /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_ph);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetRequired(b As Boolean) As WixRichText";
 //BA.debugLineNum = 95;BA.debugLine="RichText.SetAttr(\"required\", b)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_b));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetResponsive(b As Object) As WixRichText";
 //BA.debugLineNum = 131;BA.debugLine="RichText.SetResponsive(b)";
_richtext._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixRichText";
 //BA.debugLineNum = 137;BA.debugLine="RichText.SetResponsiveCell(b)";
_richtext._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 39;BA.debugLine="RichText.SetStyle(prop,sval)";
_richtext._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetStyles(m As Map) As WixRichText";
 //BA.debugLineNum = 30;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 31;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 32;BA.debugLine="RichText.SetStyle(k,v)";
_richtext._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixRichTex";
 //BA.debugLineNum = 117;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 118;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 119;BA.debugLine="RichText.SetTemplate(os)";
_richtext._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetTooltip(tt As String) As WixRichText";
 //BA.debugLineNum = 156;BA.debugLine="RichText.SetTooltip(tt)";
_richtext._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetType(sType As Object) As WixRichText";
 //BA.debugLineNum = 310;BA.debugLine="RichText.SetAttr(\"type\", sType)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setvalidate(Object _v) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetValidate(v As Object) As WixRichText   'ign";
 //BA.debugLineNum = 81;BA.debugLine="RichText.SetAttr(\"validate\",v)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_v);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setvalidateevent(Object _e) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetValidateEvent(e As Object) As WixRichText";
 //BA.debugLineNum = 58;BA.debugLine="RichText.SetAttr(\"validateEvent\", e)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_e);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setvalidateeventblur(boolean _b) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetValidateEventBlur(b As Boolean) As WixRichT";
 //BA.debugLineNum = 63;BA.debugLine="RichText.SetAttr(\"validateEvent\", \"blur\")";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("blur"));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setvalidateeventkey(boolean _b) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetValidateEventKey(b As Boolean) As WixRichTe";
 //BA.debugLineNum = 68;BA.debugLine="RichText.SetAttr(\"validateEvent\", \"key\")";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",(Object)("key"));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setvalidateisnotempty(boolean _b) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetValidateIsNotEmpty(b As Boolean) As WixRich";
 //BA.debugLineNum = 74;BA.debugLine="RichText.SetAttr(\"validate\",\"isNotEmpty\")";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",(Object)("isNotEmpty"));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetValue(v As String) As WixRichText";
 //BA.debugLineNum = 173;BA.debugLine="RichText.SetValue(v)";
_richtext._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetWidth(width As Object) As WixRichText";
 //BA.debugLineNum = 315;BA.debugLine="RichText.SetAttr(\"width\", width)";
_richtext._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixrichtext)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
