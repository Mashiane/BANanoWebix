package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixvideo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixvideo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixvideo.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _video = null;
public anywheresoftware.b4a.objects.collections.List _sources = null;
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.modcenter _modcenter = null;
public b4j.example.dbutton _dbutton = null;
public b4j.example.modsidebar _modsidebar = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.drow _drow = null;
public b4j.example.dpager _dpager = null;
public b4j.example.ddbllist _ddbllist = null;
public b4j.example.dform _dform = null;
public b4j.example.dcheckbox _dcheckbox = null;
public b4j.example.dcolorpicker _dcolorpicker = null;
public b4j.example.dcombo _dcombo = null;
public b4j.example.dcounter _dcounter = null;
public b4j.example.ddatepicker _ddatepicker = null;
public b4j.example.dicon _dicon = null;
public b4j.example.dlabel _dlabel = null;
public b4j.example.dradio _dradio = null;
public b4j.example.drichselect _drichselect = null;
public b4j.example.dsearch _dsearch = null;
public b4j.example.dselect _dselect = null;
public b4j.example.dsegmented _dsegmented = null;
public b4j.example.dslider _dslider = null;
public b4j.example.dswitch _dswitch = null;
public b4j.example.dtabbar _dtabbar = null;
public b4j.example.dtext _dtext = null;
public b4j.example.dtextarea _dtextarea = null;
public b4j.example.dtoggle _dtoggle = null;
public b4j.example.duploader _duploader = null;
public b4j.example.dfieldset _dfieldset = null;
public b4j.example.dsuggest _dsuggest = null;
public b4j.example.dcolumn _dcolumn = null;
public b4j.example.modpropertybag _modpropertybag = null;
public b4j.example.ddesignerproperty _ddesignerproperty = null;
public b4j.example.dconnection _dconnection = null;
public b4j.example.dtable _dtable = null;
public b4j.example.dfield _dfield = null;
public b4j.example.modwebix _modwebix = null;
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 136;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 141;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 107;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 131;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Video As WixElement";
_video = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private sources As List";
_sources = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixvideo  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(iID As String) As WixVideo";
 //BA.debugLineNum = 16;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Video.Initialize(iID).SetView(\"video\")";
_video._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("video");
 //BA.debugLineNum = 18;BA.debugLine="sources.Initialize";
_sources.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 112;BA.debugLine="Video.SetAttr(\"src\", sources)";
_video._setattr /*b4j.example.wixelement*/ ("src",(Object)(_sources.getObject()));
 //BA.debugLineNum = 113;BA.debugLine="Return Video.item";
if (true) return _video._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setautoplay(boolean _b) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetAutoPlay(b As Boolean) As WixVideo";
 //BA.debugLineNum = 83;BA.debugLine="Video.SetAttr(\"autoplay\", b)";
_video._setattr /*b4j.example.wixelement*/ ("autoplay",(Object)(_b));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixVideo";
 //BA.debugLineNum = 10;BA.debugLine="Video.SetAttr(\"borderless\", b)";
_video._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setcontrols(boolean _b) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetControls(b As Boolean) As WixVideo";
 //BA.debugLineNum = 89;BA.debugLine="Video.SetAttr(\"controls\", b)";
_video._setattr /*b4j.example.wixelement*/ ("controls",(Object)(_b));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetHeight(h As Object) As WixVideo";
 //BA.debugLineNum = 95;BA.debugLine="Video.SetAttr(\"height\", h)";
_video._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMap(m As Map) As WixVideo";
 //BA.debugLineNum = 62;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 63;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 64;BA.debugLine="Video.SetAttr(strKey,	strVal)";
_video._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMinHeight(h As Int) As WixVideo";
 //BA.debugLineNum = 56;BA.debugLine="Video.SetMinHeight(h)";
_video._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetMinWidth(w As Int) As WixVideo";
 //BA.debugLineNum = 50;BA.debugLine="Video.SetMinWidth(w)";
_video._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setname(String _n) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetName(n As String) As WixVideo";
 //BA.debugLineNum = 31;BA.debugLine="Video.SetName(n)";
_video._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetResponsive(b As Object) As WixVideo";
 //BA.debugLineNum = 37;BA.debugLine="Video.SetResponsive(b)";
_video._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixVideo";
 //BA.debugLineNum = 43;BA.debugLine="Video.SetResponsiveCell(b)";
_video._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setsrc(String _l) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetSRC(l As String) As WixVideo";
 //BA.debugLineNum = 124;BA.debugLine="sources.Add(l)";
_sources.Add((Object)(_l));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 77;BA.debugLine="Video.SetStyle(prop,val)";
_video._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 23;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixVideo";
 //BA.debugLineNum = 24;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 25;BA.debugLine="Video.SetTemplate(os)";
_video._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTooltip(tt As String) As WixVideo";
 //BA.debugLineNum = 71;BA.debugLine="Video.SetAttr(\"tooltip\", tt)";
_video._setattr /*b4j.example.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetValue(v As String) As WixVideo";
 //BA.debugLineNum = 118;BA.debugLine="Video.SetValue(v)";
_video._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixvideo  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetWidth(w As Object) As WixVideo";
 //BA.debugLineNum = 101;BA.debugLine="Video.SetAttr(\"width\", w)";
_video._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixvideo)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
