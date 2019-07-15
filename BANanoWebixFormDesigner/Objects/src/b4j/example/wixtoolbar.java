package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtoolbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtoolbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtoolbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _toolbar = null;
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
public b4j.example.wixtoolbar  _addbutton(b4j.example.wixbutton _btn) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub AddButton(btn As WixButton) As WixToolBar";
 //BA.debugLineNum = 98;BA.debugLine="ToolBar.AddColumns(btn.item)";
_toolbar._addcolumns /*b4j.example.wixelement*/ (_btn._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _addelements(anywheresoftware.b4a.objects.collections.Map _e) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub AddElements(e As Map) As WixToolBar";
 //BA.debugLineNum = 157;BA.debugLine="ToolBar.AddElements(e)";
_toolbar._addelements /*b4j.example.wixelement*/ (_e);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _addicon(b4j.example.wixicon _icn) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub AddIcon(icn As WixIcon) As WixToolBar";
 //BA.debugLineNum = 151;BA.debugLine="ToolBar.AddColumns(icn.Item)";
_toolbar._addcolumns /*b4j.example.wixelement*/ (_icn._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _addspacer() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddSpacer As WixToolBar";
 //BA.debugLineNum = 145;BA.debugLine="ToolBar.AddColumnsSpacer";
_toolbar._addcolumnsspacer /*String*/ ();
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
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
public String  _addtopage(b4j.example.wixpage _pg) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub AddToPage(pg As WixPage)";
 //BA.debugLineNum = 10;BA.debugLine="ToolBar.AddToRows(pg.Page)";
_toolbar._addtorows /*String*/ (_pg._page /*b4j.example.wixelement*/ );
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public ToolBar As WixElement";
_toolbar = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixelement  _createavatar(String _sid,String _imgurl) throws Exception{
b4j.example.uoenowhtml _img = null;
String _html = "";
b4j.example.wixelement _avatar = null;
 //BA.debugLineNum = 131;BA.debugLine="Sub CreateAvatar(sid As String, imgURL As String)";
 //BA.debugLineNum = 132;BA.debugLine="Dim img As UOENowHTML";
_img = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 133;BA.debugLine="img.Initialize(\"\",\"img\").SetSRC(imgURL,True).SetS";
_img._initialize /*b4j.example.uoenowhtml*/ (ba,"","img")._setsrc /*b4j.example.uoenowhtml*/ (_imgurl,__c.True)._setstyle /*b4j.example.uoenowhtml*/ ("border-radius","25px")._setstyle /*b4j.example.uoenowhtml*/ ("width","42px")._setstyle /*b4j.example.uoenowhtml*/ ("height","42px");
 //BA.debugLineNum = 134;BA.debugLine="img.SetStyle(\"cursor\", \"pointer\")";
_img._setstyle /*b4j.example.uoenowhtml*/ ("cursor","pointer");
 //BA.debugLineNum = 136;BA.debugLine="Dim html As String = img.html";
_html = _img._html /*String*/ ();
 //BA.debugLineNum = 138;BA.debugLine="Dim avatar As WixElement";
_avatar = new b4j.example.wixelement();
 //BA.debugLineNum = 139;BA.debugLine="avatar.Initialize(sid).SetWidth(60).SetBorderLess";
_avatar._initialize /*b4j.example.wixelement*/ (ba,_sid)._setwidth /*b4j.example.wixelement*/ ((Object)(60))._setborderless /*b4j.example.wixelement*/ (__c.True)._settemplate /*b4j.example.wixelement*/ ((Object)(_html));
 //BA.debugLineNum = 140;BA.debugLine="Return avatar";
if (true) return _avatar;
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _createbutton(String _sid) throws Exception{
b4j.example.wixbutton _btn = null;
 //BA.debugLineNum = 103;BA.debugLine="Sub CreateButton(sid As String) As WixButton";
 //BA.debugLineNum = 104;BA.debugLine="Dim btn As WixButton";
_btn = new b4j.example.wixbutton();
 //BA.debugLineNum = 105;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.example.wixbutton*/ (ba,_sid);
 //BA.debugLineNum = 106;BA.debugLine="btn.parent = ToolBar";
_btn._parent /*b4j.example.wixelement*/  = _toolbar;
 //BA.debugLineNum = 107;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _createicon(String _sid) throws Exception{
b4j.example.wixicon _btn = null;
 //BA.debugLineNum = 111;BA.debugLine="Sub CreateIcon(sid As String) As WixIcon";
 //BA.debugLineNum = 112;BA.debugLine="Dim btn As WixIcon";
_btn = new b4j.example.wixicon();
 //BA.debugLineNum = 113;BA.debugLine="btn.Initialize(sid).SetParent(ToolBar)";
_btn._initialize /*b4j.example.wixicon*/ (ba,_sid)._setparent /*b4j.example.wixicon*/ (_toolbar);
 //BA.debugLineNum = 114;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlabel  _createlabel(String _sid) throws Exception{
b4j.example.wixlabel _lbl = null;
 //BA.debugLineNum = 118;BA.debugLine="Sub CreateLabel(sid As String) As WixLabel";
 //BA.debugLineNum = 119;BA.debugLine="Dim lbl As WixLabel";
_lbl = new b4j.example.wixlabel();
 //BA.debugLineNum = 120;BA.debugLine="lbl.Initialize(sid).setparent(ToolBar)";
_lbl._initialize /*b4j.example.wixlabel*/ (ba,_sid)._setparent /*b4j.example.wixlabel*/ (_toolbar);
 //BA.debugLineNum = 121;BA.debugLine="Return lbl";
if (true) return _lbl;
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _createtoggle(String _sid) throws Exception{
b4j.example.wixtoggle _btn = null;
 //BA.debugLineNum = 125;BA.debugLine="Sub CreateToggle(sid As String) As WixToggle";
 //BA.debugLineNum = 126;BA.debugLine="Dim btn As WixToggle";
_btn = new b4j.example.wixtoggle();
 //BA.debugLineNum = 127;BA.debugLine="btn.Initialize(sid).SetParent(ToolBar)";
_btn._initialize /*b4j.example.wixtoggle*/ (ba,_sid)._setparent /*b4j.example.wixtoggle*/ (_toolbar);
 //BA.debugLineNum = 128;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(sID As String) As WixToolBar";
 //BA.debugLineNum = 15;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="ToolBar.Initialize(ID).SetView(\"toolbar\")";
_toolbar._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("toolbar");
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 93;BA.debugLine="Return ToolBar.item";
if (true) return _toolbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetHeight(h As Int) As WixToolBar";
 //BA.debugLineNum = 60;BA.debugLine="ToolBar.SetHeight(h)";
_toolbar._setheight /*b4j.example.wixelement*/ ((Object)(_h));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 65;BA.debugLine="Sub SetMap(m As Map) As WixToolBar";
 //BA.debugLineNum = 66;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 67;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 68;BA.debugLine="ToolBar.SetAttr(strKey,	strVal)";
_toolbar._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _setmargin(int _m) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetMargin(m As Int) As WixToolBar";
 //BA.debugLineNum = 81;BA.debugLine="ToolBar.SetAttr(\"margin\", m)";
_toolbar._setattr /*b4j.example.wixelement*/ ("margin",(Object)(_m));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetMinHeight(h As Int) As WixToolBar";
 //BA.debugLineNum = 54;BA.debugLine="ToolBar.SetMinHeight(h)";
_toolbar._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetMinWidth(w As Int) As WixToolBar";
 //BA.debugLineNum = 48;BA.debugLine="ToolBar.SetMinWidth(w)";
_toolbar._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _setname(String _n) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetName(n As String) As WixToolBar";
 //BA.debugLineNum = 29;BA.debugLine="ToolBar.SetName(n)";
_toolbar._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _setpadding(String _p) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetPadding(p As String) As WixToolBar";
 //BA.debugLineNum = 75;BA.debugLine="ToolBar.SetAttr(\"padding\", p)";
_toolbar._setattr /*b4j.example.wixelement*/ ("padding",(Object)(_p));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetResponsive(b As Object) As WixToolBar";
 //BA.debugLineNum = 35;BA.debugLine="ToolBar.SetResponsive(b)";
_toolbar._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixToolBar";
 //BA.debugLineNum = 41;BA.debugLine="ToolBar.SetResponsiveCell(b)";
_toolbar._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixToolBar";
 //BA.debugLineNum = 22;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="ToolBar.SetTemplate(os)";
_toolbar._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoolbar  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetTooltip(tt As String) As WixToolBar";
 //BA.debugLineNum = 87;BA.debugLine="ToolBar.SetTooltip(tt)";
_toolbar._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoolbar)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
