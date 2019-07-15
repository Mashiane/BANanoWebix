package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixwindow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixwindow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixwindow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _window = null;
public b4j.example.wixtoolbar _toolbar = null;
public b4j.example.wixelement _body = null;
public String _toolbarid = "";
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.dbutton _dbutton = null;
public b4j.example.modcenter _modcenter = null;
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
 //BA.debugLineNum = 168;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 169;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 174;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 164;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Window As WixElement";
_window = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public ToolBar As WixToolBar";
_toolbar = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 6;BA.debugLine="Private Body As WixElement";
_body = new b4j.example.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="Public ToolBarID As String";
_toolbarid = "";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixwindow  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixWindow";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="ToolBarID = ID & \"tblbar\"";
_toolbarid = _id+"tblbar";
 //BA.debugLineNum = 14;BA.debugLine="Window.Initialize(ID).SetView(\"window\")";
_window._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("window");
 //BA.debugLineNum = 15;BA.debugLine="ToolBar.Initialize(ToolBarID)";
_toolbar._initialize /*b4j.example.wixtoolbar*/ (ba,_toolbarid);
 //BA.debugLineNum = 16;BA.debugLine="Body.Initialize(ID & \"body\")";
_body._initialize /*b4j.example.wixelement*/ (ba,_id+"body");
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 100;BA.debugLine="Return Window.item";
if (true) return _window._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setbody(anywheresoftware.b4a.objects.collections.Map _b) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetBody(b As Map) As WixWindow";
 //BA.debugLineNum = 112;BA.debugLine="Window.SetAttr(\"body\", b)";
_window._setattr /*b4j.example.wixelement*/ ("body",(Object)(_b.getObject()));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setclose(boolean _b) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetClose(b As Boolean) As WixWindow";
 //BA.debugLineNum = 150;BA.debugLine="Window.SetAttr(\"close\", b)";
_window._setattr /*b4j.example.wixelement*/ ("close",(Object)(_b));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setfullscreen(boolean _b) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetFullScreen(b As Boolean) As WixWindow";
 //BA.debugLineNum = 69;BA.debugLine="Window.SetAttr(\"fullscreen\", b)";
_window._setattr /*b4j.example.wixelement*/ ("fullscreen",(Object)(_b));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _sethead(String _hdr) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetHead(hdr As String) As WixWindow";
 //BA.debugLineNum = 88;BA.debugLine="Window.SetAttr(\"head\", hdr)";
_window._setattr /*b4j.example.wixelement*/ ("head",(Object)(_hdr));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetHeight(h As Object) As WixWindow";
 //BA.debugLineNum = 144;BA.debugLine="Window.SetAttr(\"height\", h)";
_window._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setleft(int _t) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetLeft(t As Int) As WixWindow";
 //BA.debugLineNum = 138;BA.debugLine="Window.SetAttr(\"left\", t)";
_window._setattr /*b4j.example.wixelement*/ ("left",(Object)(_t));
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 59;BA.debugLine="Sub SetMap(m As Map) As WixWindow";
 //BA.debugLineNum = 60;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 61;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 62;BA.debugLine="Window.SetAttr(strKey,	strVal)";
_window._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMinHeight(h As Int) As WixWindow";
 //BA.debugLineNum = 54;BA.debugLine="Window.SetMinHeight(h)";
_window._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMinWidth(w As Int) As WixWindow";
 //BA.debugLineNum = 48;BA.debugLine="Window.SetMinWidth(w)";
_window._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setmodal(boolean _b) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetModal(b As Boolean) As WixWindow";
 //BA.debugLineNum = 82;BA.debugLine="Window.SetAttr(\"modal\", b)";
_window._setattr /*b4j.example.wixelement*/ ("modal",(Object)(_b));
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setmove(boolean _t) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetMove(t As Boolean) As WixWindow";
 //BA.debugLineNum = 124;BA.debugLine="Window.SetAttr(\"move\", t)";
_window._setattr /*b4j.example.wixelement*/ ("move",(Object)(_t));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setname(String _n) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetName(n As String) As WixWindow";
 //BA.debugLineNum = 29;BA.debugLine="Window.SetName(n)";
_window._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setpositioncenter(boolean _b) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetPositionCenter(b As Boolean) As WixWindow";
 //BA.debugLineNum = 75;BA.debugLine="Window.SetAttr(\"position\", \"center\")";
_window._setattr /*b4j.example.wixelement*/ ("position",(Object)("center"));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setresize(boolean _t) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetResize(t As Boolean) As WixWindow";
 //BA.debugLineNum = 118;BA.debugLine="Window.SetAttr(\"resize\", t)";
_window._setattr /*b4j.example.wixelement*/ ("resize",(Object)(_t));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetResponsive(b As Object) As WixWindow";
 //BA.debugLineNum = 35;BA.debugLine="Window.SetResponsive(b)";
_window._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixWindow";
 //BA.debugLineNum = 41;BA.debugLine="Window.SetResponsiveCell(b)";
_window._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetTemplate(t As String) As WixWindow";
 //BA.debugLineNum = 105;BA.debugLine="Body.SetTemplate(t)";
_body._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 106;BA.debugLine="Window.SetAttr(\"body\", Body.Item)";
_window._setattr /*b4j.example.wixelement*/ ("body",(Object)(_body._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixWindow";
 //BA.debugLineNum = 22;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="Window.SetTemplate(os)";
_window._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _settoolbar(boolean _b) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetToolBar(b As Boolean) As WixWindow  'ignore";
 //BA.debugLineNum = 94;BA.debugLine="Window.SetAttr(\"head\", ToolBar.Item)";
_window._setattr /*b4j.example.wixelement*/ ("head",(Object)(_toolbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _settop(int _t) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetTop(t As Int) As WixWindow";
 //BA.debugLineNum = 131;BA.debugLine="Window.SetAttr(\"top\", t)";
_window._setattr /*b4j.example.wixelement*/ ("top",(Object)(_t));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixwindow  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetWidth(w As Object) As WixWindow";
 //BA.debugLineNum = 157;BA.debugLine="Window.SetAttr(\"width\", w)";
_window._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixwindow)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
