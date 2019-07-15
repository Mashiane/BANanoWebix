package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtabview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtabview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtabview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _tabview = null;
public b4j.example.wixelement _mv = null;
public b4j.example.wixelement _tb = null;
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
public String  _addtab(String _iid,String _header,String _template,anywheresoftware.b4a.objects.collections.Map _attributes) throws Exception{
b4j.example.wixelement _i = null;
String _astr = "";
String _vstr = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub AddTab(iid As String, header As String, templa";
 //BA.debugLineNum = 117;BA.debugLine="Dim i As WixElement";
_i = new b4j.example.wixelement();
 //BA.debugLineNum = 118;BA.debugLine="i.Initialize(iid)";
_i._initialize /*b4j.example.wixelement*/ (ba,_iid);
 //BA.debugLineNum = 119;BA.debugLine="i.SetHeader(header)";
_i._setheader /*b4j.example.wixelement*/ ((Object)(_header));
 //BA.debugLineNum = 120;BA.debugLine="i.SetTemplate(template)";
_i._settemplate /*b4j.example.wixelement*/ ((Object)(_template));
 //BA.debugLineNum = 121;BA.debugLine="If attributes <> Null Then";
if (_attributes!= null) { 
 //BA.debugLineNum = 122;BA.debugLine="For Each astr As String In attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _attributes.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_astr = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 123;BA.debugLine="Dim vstr As String = attributes.Get(astr)";
_vstr = BA.ObjectToString(_attributes.Get((Object)(_astr)));
 //BA.debugLineNum = 124;BA.debugLine="i.SetProperty(astr,vstr)";
_i._setproperty /*b4j.example.wixelement*/ (_astr,(Object)(_vstr));
 }
};
 };
 //BA.debugLineNum = 127;BA.debugLine="TabView.AddCells(i.Item)";
_tabview._addcells /*b4j.example.wixelement*/ (_i._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 138;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 143;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 133;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TabView As WixElement";
_tabview = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private mv As WixElement";
_mv = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Private tb As WixElement";
_tb = new b4j.example.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtabview  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixTabView";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="TabView.Initialize(ID)";
_tabview._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="TabView.SetView(\"tabview\")";
_tabview._setview /*b4j.example.wixelement*/ ("tabview");
 //BA.debugLineNum = 14;BA.debugLine="mv.Initialize(ID & \"mv\")";
_mv._initialize /*b4j.example.wixelement*/ (ba,_id+"mv");
 //BA.debugLineNum = 15;BA.debugLine="tb.Initialize(ID & \"tb\")";
_tb._initialize /*b4j.example.wixelement*/ (ba,_id+"tb");
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 98;BA.debugLine="TabView.SetAttr(\"tabbar\", tb.Item)";
_tabview._setattr /*b4j.example.wixelement*/ ("tabbar",(Object)(_tb._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 99;BA.debugLine="TabView.SetAttr(\"multiview\", mv.Item)";
_tabview._setattr /*b4j.example.wixelement*/ ("multiview",(Object)(_mv._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 100;BA.debugLine="Return TabView.item";
if (true) return _tabview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetAnimate(b As Boolean) As WixTabView";
 //BA.debugLineNum = 80;BA.debugLine="mv.SetAnimate(b)";
_mv._setanimate /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetHeight(h As Object) As WixTabView";
 //BA.debugLineNum = 68;BA.debugLine="TabView.SetAttr(\"height\", h)";
_tabview._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub SetMap(m As Map) As WixTabView";
 //BA.debugLineNum = 21;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 22;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 23;BA.debugLine="TabView.SetAttr(strKey,	strVal)";
_tabview._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMinHeight(h As Int) As WixTabView";
 //BA.debugLineNum = 62;BA.debugLine="TabView.SetMinHeight(h)";
_tabview._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMinWidth(w As Int) As WixTabView";
 //BA.debugLineNum = 56;BA.debugLine="TabView.SetMinWidth(w)";
_tabview._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetMultiView(b As Boolean) As WixTabView";
 //BA.debugLineNum = 111;BA.debugLine="TabView.SetAttr(\"multiview\",b)";
_tabview._setattr /*b4j.example.wixelement*/ ("multiview",(Object)(_b));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setname(String _n) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetName(n As String) As WixTabView";
 //BA.debugLineNum = 37;BA.debugLine="TabView.SetName(n)";
_tabview._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetResponsive(b As Object) As WixTabView";
 //BA.debugLineNum = 43;BA.debugLine="TabView.SetResponsive(b)";
_tabview._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixTabView";
 //BA.debugLineNum = 49;BA.debugLine="TabView.SetResponsiveCell(b)";
_tabview._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _settabbarclose(boolean _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetTabBarClose(b As Boolean) As WixTabView";
 //BA.debugLineNum = 86;BA.debugLine="tb.SetAttr(\"close\", b)";
_tb._setattr /*b4j.example.wixelement*/ ("close",(Object)(_b));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTabView";
 //BA.debugLineNum = 30;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="TabView.SetTemplate(os)";
_tabview._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetTooltip(tt As String) As WixTabView";
 //BA.debugLineNum = 92;BA.debugLine="TabView.SetTooltip(tt)";
_tabview._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _settypebottom(boolean _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetTypeBottom(b As Boolean) As WixTabView   'i";
 //BA.debugLineNum = 105;BA.debugLine="TabView.SetType(\"bottom\")";
_tabview._settype /*b4j.example.wixelement*/ ("bottom");
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabview  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetWidth(w As Object) As WixTabView";
 //BA.debugLineNum = 74;BA.debugLine="TabView.SetAttr(\"width\", w)";
_tabview._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
