package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsegmented extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixsegmented", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixsegmented.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _segmented = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _addoption(String _oid,Object _otxt) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 163;BA.debugLine="Sub AddOption(oid As String, oTxt As Object) As Wi";
 //BA.debugLineNum = 164;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 165;BA.debugLine="opt.put(\"id\",oid)";
_opt.Put((Object)("id"),(Object)(_oid));
 //BA.debugLineNum = 166;BA.debugLine="opt.Put(\"value\",oTxt)";
_opt.Put((Object)("value"),_otxt);
 //BA.debugLineNum = 167;BA.debugLine="Options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 220;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 225;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 173;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 215;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Segmented As WixElement";
_segmented = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixSegment";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Segmented.Initialize(iID).SetView(\"segmented\")";
_segmented._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("segmented");
 //BA.debugLineNum = 13;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 140;BA.debugLine="Segmented.SetAttr(\"options\", Options)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 141;BA.debugLine="Return Segmented.item";
if (true) return _segmented._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _onaftertabclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub OnAfterTabClick(cb As BANanoObject) As WixSegm";
 //BA.debugLineNum = 134;BA.debugLine="Segmented.OnAfterTabClick(cb)";
_segmented._onaftertabclick /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cb);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _onitemclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub OnItemClick(cb As BANanoObject) As WixSegmente";
 //BA.debugLineNum = 129;BA.debugLine="Segmented.OnItemClick(cb)";
_segmented._onitemclick /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cb);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 52;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setalign(Object _a) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetAlign(a As Object) As WixSegmented 'ignore";
 //BA.debugLineNum = 195;BA.debugLine="Segmented.SetAttr(\"align\", a)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("align",_a);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetAlignCenter(r As String) As WixSegmented 'i";
 //BA.debugLineNum = 190;BA.debugLine="Segmented.setAligncenter(\"\")";
_segmented._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetAlignLeft(r As String) As WixSegmented 'ign";
 //BA.debugLineNum = 202;BA.debugLine="Segmented.SetAlignleft(\"\")";
_segmented._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetAlignRight(r As String) As WixSegmented 'ig";
 //BA.debugLineNum = 184;BA.debugLine="Segmented.setAlignright(\"\")";
_segmented._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixSegmented";
 //BA.debugLineNum = 229;BA.debugLine="Segmented.SetAttr(\"animate\", animate)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setattributes(Object _attributes) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetAttributes(attributes As Object) As WixSegm";
 //BA.debugLineNum = 234;BA.debugLine="Segmented.SetAttr(\"attributes\", attributes)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("attributes",_attributes);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixSeg";
 //BA.debugLineNum = 239;BA.debugLine="Segmented.SetAttr(\"borderless\", borderless)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setbottomlabel(Object _bottomlabel) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetBottomLabel(bottomLabel As Object) As WixSe";
 //BA.debugLineNum = 244;BA.debugLine="Segmented.SetAttr(\"bottomLabel\", bottomLabel)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomLabel",_bottomlabel);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setbottompadding(Object _bottompadding) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetBottomPadding(bottomPadding As Object) As W";
 //BA.debugLineNum = 249;BA.debugLine="Segmented.SetAttr(\"bottomPadding\", bottomPadding)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("bottomPadding",_bottompadding);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetClick(e As BANanoObject) As WixSegmented";
 //BA.debugLineNum = 209;BA.debugLine="Segmented.SetAttr(\"click\", e)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",(Object)(_e));
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetContainer(container As Object) As WixSegmen";
 //BA.debugLineNum = 254;BA.debugLine="Segmented.SetAttr(\"container\", container)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetCss(css As Object) As WixSegmented";
 //BA.debugLineNum = 259;BA.debugLine="Segmented.SetAttr(\"css\", css)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixSegment";
 //BA.debugLineNum = 264;BA.debugLine="Segmented.SetAttr(\"disabled\", disabled)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setformat(Object _format) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetFormat(format As Object) As WixSegmented";
 //BA.debugLineNum = 269;BA.debugLine="Segmented.SetAttr(\"format\", format)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_format);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetGravity(gravity As Object) As WixSegmented";
 //BA.debugLineNum = 274;BA.debugLine="Segmented.SetAttr(\"gravity\", gravity)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setheight(Object _height) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetHeight(height As Object) As WixSegmented";
 //BA.debugLineNum = 279;BA.debugLine="Segmented.SetAttr(\"height\", height)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_height);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixSegmented";
 //BA.debugLineNum = 284;BA.debugLine="Segmented.SetAttr(\"hidden\", hidden)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixSegmented";
 //BA.debugLineNum = 289;BA.debugLine="Segmented.SetAttr(\"hotkey\", hotkey)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setinputalign(Object _inputalign) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub SetInputAlign(inputAlign As Object) As WixSegm";
 //BA.debugLineNum = 294;BA.debugLine="Segmented.SetAttr(\"inputAlign\", inputAlign)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputAlign",_inputalign);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixSe";
 //BA.debugLineNum = 299;BA.debugLine="Segmented.SetAttr(\"inputHeight\", inputHeight)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixSegm";
 //BA.debugLineNum = 304;BA.debugLine="Segmented.SetAttr(\"inputWidth\", inputWidth)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setinvalidmessage(Object _invalidmessage) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetInvalidMessage(invalidMessage As Object) As";
 //BA.debugLineNum = 309;BA.debugLine="Segmented.SetAttr(\"invalidMessage\", invalidMessage";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("invalidMessage",_invalidmessage);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetLabel(l As String) As WixSegmented";
 //BA.debugLineNum = 152;BA.debugLine="Segmented.SetLabel(l)";
_segmented._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setlabelalign(Object _labelalign) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetLabelAlign(labelAlign As Object) As WixSegm";
 //BA.debugLineNum = 314;BA.debugLine="Segmented.SetAttr(\"labelAlign\", labelAlign)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelAlign",_labelalign);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setlabelposition(Object _labelposition) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetLabelPosition(labelPosition As Object) As W";
 //BA.debugLineNum = 319;BA.debugLine="Segmented.SetAttr(\"labelPosition\", labelPosition)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelPosition",_labelposition);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setlabelwidth(Object _labelwidth) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetLabelWidth(labelWidth As Object) As WixSegm";
 //BA.debugLineNum = 324;BA.debugLine="Segmented.SetAttr(\"labelWidth\", labelWidth)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelWidth",_labelwidth);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 75;BA.debugLine="Sub SetMap(m As Map) As WixSegmented";
 //BA.debugLineNum = 76;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 77;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 78;BA.debugLine="Segmented.SetAttr(strKey,	strVal)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetMargin(margin As Object) As WixSegmented";
 //BA.debugLineNum = 26;BA.debugLine="Segmented.SetMargin(margin)";
_segmented._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixSegmen";
 //BA.debugLineNum = 329;BA.debugLine="Segmented.SetAttr(\"maxHeight\", maxHeight)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixSegmente";
 //BA.debugLineNum = 334;BA.debugLine="Segmented.SetAttr(\"maxWidth\", maxWidth)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetMinHeight(h As Int) As WixSegmented";
 //BA.debugLineNum = 105;BA.debugLine="Segmented.SetMinHeight(h)";
_segmented._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetMinWidth(w As Int) As WixSegmented";
 //BA.debugLineNum = 99;BA.debugLine="Segmented.SetMinWidth(w)";
_segmented._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setmultiview(Object _b) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMultiView(b As Object) As WixSegmented";
 //BA.debugLineNum = 56;BA.debugLine="Segmented.SetMultiView(b)";
_segmented._setmultiview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToBoolean(_b));
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setname(String _n) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetName(n As String) As WixSegmented";
 //BA.debugLineNum = 69;BA.debugLine="Segmented.SetName(n)";
_segmented._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetOptions(o As List) As WixSegmented";
 //BA.debugLineNum = 146;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetOptionsJSON(json As String) As WixSegmented";
 //BA.debugLineNum = 116;BA.debugLine="Segmented.SetOptionsJSON(json)";
_segmented._setoptionsjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 120;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixSegmented";
 //BA.debugLineNum = 121;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 122;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 123;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,_mv);
 }
};
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setoptionwidth(Object _w) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetOptionWidth(w As Object) As WixSegmented";
 //BA.debugLineNum = 177;BA.debugLine="Segmented.SetAttr(\"optionWidth\", w)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("optionWidth",_w);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetPadding(padding As Object) As WixSegmented";
 //BA.debugLineNum = 20;BA.debugLine="Segmented.SetPadding(padding)";
_segmented._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetParent(p As WixElement) As WixSegmented";
 //BA.debugLineNum = 45;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetPopup(popup As Object) As WixSegmented";
 //BA.debugLineNum = 339;BA.debugLine="Segmented.SetAttr(\"popup\", popup)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setreadonly(boolean _readonly) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetReadonly(readonly As Boolean) As WixSegment";
 //BA.debugLineNum = 32;BA.debugLine="Segmented.SetAttr(\"readonly\", readonly)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("readonly",(Object)(_readonly));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setrelatedaction(Object _relatedaction) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetRelatedAction(relatedAction As Object) As W";
 //BA.debugLineNum = 344;BA.debugLine="Segmented.SetAttr(\"relatedAction\", relatedAction)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedAction",_relatedaction);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setrelatedview(Object _relatedview) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetRelatedView(relatedView As Object) As WixSe";
 //BA.debugLineNum = 349;BA.debugLine="Segmented.SetAttr(\"relatedView\", relatedView)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("relatedView",_relatedview);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setrequired(boolean _required) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetRequired(required As Boolean) As WixSegment";
 //BA.debugLineNum = 354;BA.debugLine="Segmented.SetAttr(\"required\", required)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("required",(Object)(_required));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetResponsive(b As Object) As WixSegmented";
 //BA.debugLineNum = 86;BA.debugLine="Segmented.SetResponsive(b)";
_segmented._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSegmented";
 //BA.debugLineNum = 92;BA.debugLine="Segmented.SetResponsiveCell(b)";
_segmented._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 38;BA.debugLine="Segmented.SetStyle(prop,sval)";
_segmented._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setsuggest(Object _suggest) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetSuggest(suggest As Object) As WixSegmented";
 //BA.debugLineNum = 359;BA.debugLine="Segmented.SetAttr(\"suggest\", suggest)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_suggest);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 60;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSegment";
 //BA.debugLineNum = 61;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 62;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 63;BA.debugLine="Segmented.SetTemplate(os)";
_segmented._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetTooltip(tt As String) As WixSegmented";
 //BA.debugLineNum = 111;BA.debugLine="Segmented.SetTooltip(tt)";
_segmented._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setvalidate(Object _validate) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetValidate(validate As Object) As WixSegmente";
 //BA.debugLineNum = 364;BA.debugLine="Segmented.SetAttr(\"validate\", validate)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validate",_validate);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setvalidateevent(Object _validateevent) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetValidateEvent(validateEvent As Object) As W";
 //BA.debugLineNum = 369;BA.debugLine="Segmented.SetAttr(\"validateEvent\", validateEvent)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("validateEvent",_validateevent);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setvalue(Object _v) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetValue(v As Object) As WixSegmented";
 //BA.debugLineNum = 158;BA.debugLine="Segmented.SetValue(v)";
_segmented._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_v));
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetWidth(width As Object) As WixSegmented";
 //BA.debugLineNum = 374;BA.debugLine="Segmented.SetAttr(\"width\", width)";
_segmented._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixsegmented)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
