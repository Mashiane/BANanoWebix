package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixuploader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixuploader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixuploader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _uploader = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 178;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 183;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 173;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Uploader As WixElement";
_uploader = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sID As String) As WixUploade";
 //BA.debugLineNum = 10;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Uploader.Initialize(ID).SetView(\"uploader\")";
_uploader._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("uploader");
 //BA.debugLineNum = 12;BA.debugLine="SetName(\"upload\")";
_setname("upload");
 //BA.debugLineNum = 13;BA.debugLine="SetInputName(\"upload\")";
_setinputname("upload");
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 167;BA.debugLine="Return Uploader.item";
if (true) return _uploader._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 225;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setaccept(String _a) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetAccept(a As String) As WixUploader";
 //BA.debugLineNum = 146;BA.debugLine="Uploader.SetAttr(\"accept\", a)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("accept",(Object)(_a));
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixUploader";
 //BA.debugLineNum = 187;BA.debugLine="Uploader.SetAttr(\"animate\", animate)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setapionly(boolean _b) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetApiOnly(b As Boolean) As WixUploader";
 //BA.debugLineNum = 113;BA.debugLine="Uploader.SetAttr(\"apiOnly\", b)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("apiOnly",(Object)(_b));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SetAttributes(m As Map) As WixUploader";
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
 //BA.debugLineNum = 46;BA.debugLine="Uploader.SetAttr(k,v)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setautosend(boolean _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetAutoSend(b As Boolean) As WixUploader";
 //BA.debugLineNum = 129;BA.debugLine="Uploader.SetAttr(\"autosend\", b)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autosend",(Object)(_b));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setautowidth(boolean _autowidth) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetAutowidth(autowidth As Boolean) As WixUploa";
 //BA.debugLineNum = 192;BA.debugLine="Uploader.SetAttr(\"autowidth\", autowidth)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("autowidth",(Object)(_autowidth));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixUpl";
 //BA.debugLineNum = 197;BA.debugLine="Uploader.SetAttr(\"borderless\", borderless)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setclick(Object _click) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetClick(click As Object) As WixUploader";
 //BA.debugLineNum = 202;BA.debugLine="Uploader.SetAttr(\"click\", click)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("click",_click);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetContainer(container As Object) As WixUpload";
 //BA.debugLineNum = 214;BA.debugLine="Uploader.SetAttr(\"container\", container)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetCss(css As Object) As WixUploader";
 //BA.debugLineNum = 219;BA.debugLine="Uploader.SetAttr(\"css\", css)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setdatatype(String _d) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetDataType(d As String) As WixUploader";
 //BA.debugLineNum = 119;BA.debugLine="Uploader.SetAttr(\"datatype\", d)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",(Object)(_d));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setdirectory(boolean _b) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetDirectory(b As Boolean) As WixUploader";
 //BA.debugLineNum = 140;BA.debugLine="Uploader.SetAttr(\"directory\", b)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("directory",(Object)(_b));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixUploade";
 //BA.debugLineNum = 229;BA.debugLine="Uploader.SetAttr(\"disabled\", disabled)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setformdata(Object _formdata) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetFormData(formData As Object) As WixUploader";
 //BA.debugLineNum = 234;BA.debugLine="Uploader.SetAttr(\"formData\", formData)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("formData",_formdata);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetGravity(gravity As Object) As WixUploader";
 //BA.debugLineNum = 239;BA.debugLine="Uploader.SetAttr(\"gravity\", gravity)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetHeight(h As Object) As WixUploader";
 //BA.debugLineNum = 157;BA.debugLine="Uploader.SetHeight(h)";
_uploader._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixUploader";
 //BA.debugLineNum = 244;BA.debugLine="Uploader.SetAttr(\"hidden\", hidden)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _sethotkey(Object _hotkey) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetHotkey(hotkey As Object) As WixUploader";
 //BA.debugLineNum = 249;BA.debugLine="Uploader.SetAttr(\"hotkey\", hotkey)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hotkey",_hotkey);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setinputheight(Object _inputheight) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetInputHeight(inputHeight As Object) As WixUp";
 //BA.debugLineNum = 254;BA.debugLine="Uploader.SetAttr(\"inputHeight\", inputHeight)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputHeight",_inputheight);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setinputname(String _n) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetInputName(n As String) As WixUploader";
 //BA.debugLineNum = 108;BA.debugLine="Uploader.SetAttr(\"inputName\", n)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputName",(Object)(_n));
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setinputwidth(Object _inputwidth) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetInputWidth(inputWidth As Object) As WixUplo";
 //BA.debugLineNum = 260;BA.debugLine="Uploader.SetAttr(\"inputWidth\", inputWidth)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("inputWidth",_inputwidth);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setlabel(Object _label) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetLabel(label As Object) As WixUploader";
 //BA.debugLineNum = 265;BA.debugLine="Uploader.SetAttr(\"label\", label)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("label",_label);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setlink(String _l) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetLink(l As String) As WixUploader";
 //BA.debugLineNum = 135;BA.debugLine="Uploader.SetAttr(\"link\", l)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("link",(Object)(_l));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 99;BA.debugLine="Sub SetMap(m As Map) As WixUploader";
 //BA.debugLineNum = 100;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 101;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 102;BA.debugLine="Uploader.SetAttr(strKey,	strVal)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetMargin(margin As Object) As WixUploader";
 //BA.debugLineNum = 31;BA.debugLine="Uploader.SetMargin(margin)";
_uploader._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixUpload";
 //BA.debugLineNum = 270;BA.debugLine="Uploader.SetAttr(\"maxHeight\", maxHeight)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixUploader";
 //BA.debugLineNum = 275;BA.debugLine="Uploader.SetAttr(\"maxWidth\", maxWidth)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetMinHeight(h As Int) As WixUploader";
 //BA.debugLineNum = 94;BA.debugLine="Uploader.SetMinHeight(h)";
_uploader._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetMinWidth(w As Int) As WixUploader";
 //BA.debugLineNum = 88;BA.debugLine="Uploader.SetMinWidth(w)";
_uploader._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setmultiple(boolean _b) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetMultiple(b As Boolean) As WixUploader";
 //BA.debugLineNum = 124;BA.debugLine="Uploader.SetAttr(\"multiple\", b)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiple",(Object)(_b));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setname(String _n) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetName(n As String) As WixUploader";
 //BA.debugLineNum = 69;BA.debugLine="Uploader.SetName(n)";
_uploader._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetPadding(padding As Object) As WixUploader";
 //BA.debugLineNum = 25;BA.debugLine="Uploader.SetPadding(padding)";
_uploader._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetParent(p As WixElement) As WixUploader";
 //BA.debugLineNum = 208;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setpopup(Object _popup) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetPopup(popup As Object) As WixUploader";
 //BA.debugLineNum = 280;BA.debugLine="Uploader.SetAttr(\"popup\", popup)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("popup",_popup);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetResponsive(b As Object) As WixUploader";
 //BA.debugLineNum = 75;BA.debugLine="Uploader.SetResponsive(b)";
_uploader._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixUploader";
 //BA.debugLineNum = 81;BA.debugLine="Uploader.SetResponsiveCell(b)";
_uploader._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 62;BA.debugLine="Uploader.SetStyle(prop,sval)";
_uploader._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 51;BA.debugLine="Sub SetStyles(m As Map) As WixUploader";
 //BA.debugLineNum = 52;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 53;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 54;BA.debugLine="Uploader.SetStyle(k,v)";
_uploader._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixUploade";
 //BA.debugLineNum = 36;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 37;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 38;BA.debugLine="Uploader.SetTemplate(os)";
_uploader._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _settooltip(Object _tooltip) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetTooltip(tooltip As Object) As WixUploader";
 //BA.debugLineNum = 285;BA.debugLine="Uploader.SetAttr(\"tooltip\", tooltip)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",_tooltip);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetType(sType As Object) As WixUploader";
 //BA.debugLineNum = 290;BA.debugLine="Uploader.SetAttr(\"type\", sType)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setupload(String _u) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetUpload(u As String) As WixUploader";
 //BA.debugLineNum = 152;BA.debugLine="Uploader.SetAttr(\"upload\", u)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("upload",(Object)(_u));
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _seturldata(Object _urldata) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetUrlData(urlData As Object) As WixUploader";
 //BA.debugLineNum = 295;BA.debugLine="Uploader.SetAttr(\"urlData\", urlData)";
_uploader._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("urlData",_urldata);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetValue(v As String) As WixUploader";
 //BA.debugLineNum = 19;BA.debugLine="Uploader.SetValue(v)";
_uploader._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetWidth(w As Object) As WixUploader";
 //BA.debugLineNum = 162;BA.debugLine="Uploader.SetWidth(w)";
_uploader._setwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixuploader)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
