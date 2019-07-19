package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtabbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtabbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtabbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _tabbar = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
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
public String  _additem(String _iid,String _itext,String _iicon) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub AddItem(iID As String, iText As String, iIcon";
 //BA.debugLineNum = 90;BA.debugLine="AddOption(iID, iText,iIcon)";
_addoption(_iid,_itext,_iicon);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _addoption(String _iid,String _itext,String _iicon) throws Exception{
b4j.example.uoenowhtml _icon = null;
b4j.example.uoenowhtml _text = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 109;BA.debugLine="Sub AddOption(iID As String, iText As String, iIco";
 //BA.debugLineNum = 110;BA.debugLine="iID = iID.tolowercase";
_iid = _iid.toLowerCase();
 //BA.debugLineNum = 112;BA.debugLine="Dim icon As UOENowHTML";
_icon = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 113;BA.debugLine="icon.Initialize(\"\",\"span\")";
_icon._initialize /*b4j.example.uoenowhtml*/ (ba,"","span");
 //BA.debugLineNum = 114;BA.debugLine="icon.AddClass(\"webix_icon\")";
_icon._addclass /*b4j.example.uoenowhtml*/ ("webix_icon");
 //BA.debugLineNum = 115;BA.debugLine="icon.AddClass(iIcon)";
_icon._addclass /*b4j.example.uoenowhtml*/ (_iicon);
 //BA.debugLineNum = 117;BA.debugLine="Dim text As UOENowHTML";
_text = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 118;BA.debugLine="text.Initialize(\"\",\"span\")";
_text._initialize /*b4j.example.uoenowhtml*/ (ba,"","span");
 //BA.debugLineNum = 119;BA.debugLine="text.SetStyle(\"padding-left\", \"4px\")";
_text._setstyle /*b4j.example.uoenowhtml*/ ("padding-left","4px");
 //BA.debugLineNum = 120;BA.debugLine="text.AddContent(iText)";
_text._addcontent /*b4j.example.uoenowhtml*/ (_itext);
 //BA.debugLineNum = 122;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 123;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 124;BA.debugLine="sb.Append(icon.HTML)";
_sb.Append(_icon._html /*String*/ ());
 //BA.debugLineNum = 125;BA.debugLine="sb.Append(text.HTML)";
_sb.Append(_text._html /*String*/ ());
 //BA.debugLineNum = 127;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 128;BA.debugLine="opt.Put(\"id\", iID)";
_opt.Put((Object)("id"),(Object)(_iid));
 //BA.debugLineNum = 129;BA.debugLine="opt.Put(\"value\", sb.ToString)";
_opt.Put((Object)("value"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 130;BA.debugLine="options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 197;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 202;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 192;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TabBar As WixElement";
_tabbar = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtabbar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixTabBar";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="TabBar.Initialize(ID)";
_tabbar._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 12;BA.debugLine="TabBar.SetView(\"tabbar\")";
_tabbar._setview /*b4j.example.wixelement*/ ("tabbar");
 //BA.debugLineNum = 13;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 162;BA.debugLine="TabBar.SetAttr(\"options\", options)";
_tabbar._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 163;BA.debugLine="Return TabBar.item";
if (true) return _tabbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetAnimate(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 174;BA.debugLine="TabBar.SetAttr(\"animate\", b)";
_tabbar._setattr /*b4j.example.wixelement*/ ("animate",(Object)(_b));
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setclose(boolean _b) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetClose(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 29;BA.debugLine="TabBar.SetAttr(\"close\", b)";
_tabbar._setattr /*b4j.example.wixelement*/ ("close",(Object)(_b));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetHeight(h As Object) As WixTabBar";
 //BA.debugLineNum = 143;BA.debugLine="TabBar.SetAttr(\"height\", h)";
_tabbar._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setkeepviews(boolean _b) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetkeepViews(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 180;BA.debugLine="TabBar.SetAttr(\"keepViews\", b)";
_tabbar._setattr /*b4j.example.wixelement*/ ("keepViews",(Object)(_b));
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 18;BA.debugLine="Sub SetMap(m As Map) As WixTabBar";
 //BA.debugLineNum = 19;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 20;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 21;BA.debugLine="TabBar.SetAttr(strKey,	strVal)";
_tabbar._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetMinHeight(h As Int) As WixTabBar";
 //BA.debugLineNum = 85;BA.debugLine="TabBar.SetMinHeight(h)";
_tabbar._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetMinWidth(w As Int) As WixTabBar";
 //BA.debugLineNum = 79;BA.debugLine="TabBar.SetMinWidth(w)";
_tabbar._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetMultiView(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 168;BA.debugLine="TabBar.SetAttr(\"multiview\", b)";
_tabbar._setattr /*b4j.example.wixelement*/ ("multiview",(Object)(_b));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setname(String _n) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetName(n As String) As WixTabBar";
 //BA.debugLineNum = 60;BA.debugLine="TabBar.SetName(n)";
_tabbar._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetOptions(o As List) As WixTabBar";
 //BA.debugLineNum = 36;BA.debugLine="options = o";
_options = _o;
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setoptionsjson(String _json) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetOptionsJSON(json As String) As WixTabBar";
 //BA.debugLineNum = 94;BA.debugLine="TabBar.SetOptionsJSON(json)";
_tabbar._setoptionsjson /*b4j.example.wixelement*/ (_json);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixTabBar";
 //BA.debugLineNum = 101;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 102;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 103;BA.debugLine="AddOption(mk, mv,\"\")";
_addoption(_mk,BA.ObjectToString(_mv),"");
 }
};
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setoptionwidth(Object _w) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetOptionWidth(w As Object) As WixTabBar";
 //BA.debugLineNum = 47;BA.debugLine="TabBar.SetAttr(\"optionWidth\", w)";
_tabbar._setattr /*b4j.example.wixelement*/ ("optionWidth",_w);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetResponsive(b As Object) As WixTabBar";
 //BA.debugLineNum = 66;BA.debugLine="TabBar.SetResponsive(b)";
_tabbar._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTabBar";
 //BA.debugLineNum = 72;BA.debugLine="TabBar.SetResponsiveCell(b)";
_tabbar._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 52;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTabBar";
 //BA.debugLineNum = 53;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 54;BA.debugLine="TabBar.SetTemplate(os)";
_tabbar._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetTooltip(tt As String) As WixTabBar";
 //BA.debugLineNum = 136;BA.debugLine="TabBar.SetTooltip(tt)";
_tabbar._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _settype(Object _w) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetType(w As Object) As WixTabBar";
 //BA.debugLineNum = 41;BA.debugLine="TabBar.SetAttr(\"type\", w)";
_tabbar._setattr /*b4j.example.wixelement*/ ("type",_w);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _settypebottom(boolean _b) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetTypeBottom(b As Boolean) As WixTabBar   'ig";
 //BA.debugLineNum = 156;BA.debugLine="TabBar.SetType(\"bottom\")";
_tabbar._settype /*b4j.example.wixelement*/ ("bottom");
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setvalue(Object _v) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetValue(v As Object) As WixTabBar";
 //BA.debugLineNum = 186;BA.debugLine="TabBar.SetAttr(\"value\", v)";
_tabbar._setattr /*b4j.example.wixelement*/ ("value",_v);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabbar  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetWidth(w As Object) As WixTabBar";
 //BA.debugLineNum = 149;BA.debugLine="TabBar.SetAttr(\"width\", w)";
_tabbar._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabbar)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
