package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixpager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixpager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixpager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _pager = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
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
 //BA.debugLineNum = 156;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 157;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 162;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 152;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Pager As WixElement";
_pager = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixpager  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sID As String) As WixPager";
 //BA.debugLineNum = 10;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Pager.Initialize(ID).SetView(\"pager\")";
_pager._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("pager");
 //BA.debugLineNum = 12;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
String _tt = "";
 //BA.debugLineNum = 140;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 141;BA.debugLine="Dim tt As String = sb.ToString";
_tt = _sb.ToString();
 //BA.debugLineNum = 142;BA.debugLine="tt = tt.trim";
_tt = _tt.trim();
 //BA.debugLineNum = 143;BA.debugLine="If tt <> \"\" Then";
if ((_tt).equals("") == false) { 
 //BA.debugLineNum = 144;BA.debugLine="Pager.SetTemplate(sb.ToString)";
_pager._settemplate /*b4j.example.wixelement*/ ((Object)(_sb.ToString()));
 };
 //BA.debugLineNum = 146;BA.debugLine="Return Pager.item";
if (true) return _pager._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetAnimate(b As Boolean) As WixPager";
 //BA.debugLineNum = 129;BA.debugLine="Pager.SetAttr(\"animate\", b)";
_pager._setattr /*b4j.example.wixelement*/ ("animate",(Object)(_b));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setcontainer(String _cont) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetContainer(cont As String) As WixPager";
 //BA.debugLineNum = 96;BA.debugLine="Pager.SetAttr(\"container\", cont)";
_pager._setattr /*b4j.example.wixelement*/ ("container",(Object)(_cont));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setcount(Object _c) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetCount(c As Object) As WixPager";
 //BA.debugLineNum = 117;BA.debugLine="Pager.SetAttr(\"count\", c)";
_pager._setattr /*b4j.example.wixelement*/ ("count",_c);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setgroup(int _g) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetGroup(g As Int) As WixPager";
 //BA.debugLineNum = 123;BA.debugLine="Pager.SetAttr(\"group\", g)";
_pager._setattr /*b4j.example.wixelement*/ ("group",(Object)(_g));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 101;BA.debugLine="Sub SetMap(m As Map) As WixPager";
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
 //BA.debugLineNum = 104;BA.debugLine="Pager.SetAttr(strKey,	strVal)";
_pager._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setmaster(Object _m) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetMaster(m As Object) As WixPager";
 //BA.debugLineNum = 111;BA.debugLine="Pager.SetAttr(\"master\", m)";
_pager._setattr /*b4j.example.wixelement*/ ("master",_m);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetMinHeight(h As Int) As WixPager";
 //BA.debugLineNum = 58;BA.debugLine="Pager.SetMinHeight(h)";
_pager._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetMinWidth(w As Int) As WixPager";
 //BA.debugLineNum = 52;BA.debugLine="Pager.SetMinWidth(w)";
_pager._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setname(String _n) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetName(n As String) As WixPager";
 //BA.debugLineNum = 33;BA.debugLine="Pager.SetName(n)";
_pager._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetResponsive(b As Object) As WixPager";
 //BA.debugLineNum = 39;BA.debugLine="Pager.SetResponsive(b)";
_pager._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixPager";
 //BA.debugLineNum = 45;BA.debugLine="Pager.SetResponsiveCell(b)";
_pager._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setshowfirst(boolean _b) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetShowFirst(b As Boolean) As WixPager";
 //BA.debugLineNum = 18;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 19;BA.debugLine="sb.Append(\"{common.first()} \")";
_sb.Append("{common.first()} ");
 };
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setshowlast(boolean _b) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetShowLast(b As Boolean) As WixPager";
 //BA.debugLineNum = 88;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 89;BA.debugLine="sb.Append(\"{common.last()}\")";
_sb.Append("{common.last()}");
 };
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setshownext(boolean _b) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetShowNext(b As Boolean) As WixPager";
 //BA.debugLineNum = 80;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 81;BA.debugLine="sb.Append(\"{common.next()} \")";
_sb.Append("{common.next()} ");
 };
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setshowpages(boolean _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetShowPages(b As Boolean) As WixPager";
 //BA.debugLineNum = 72;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 73;BA.debugLine="sb.Append(\"{common.pages()} \")";
_sb.Append("{common.pages()} ");
 };
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setshowprev(boolean _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetShowPrev(b As Boolean) As WixPager";
 //BA.debugLineNum = 64;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 65;BA.debugLine="sb.Append(\"{common.prev()} \")";
_sb.Append("{common.prev()} ");
 };
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _setsize(int _s) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetSize(s As Int) As WixPager";
 //BA.debugLineNum = 135;BA.debugLine="Pager.SetAttr(\"size\", s)";
_pager._setattr /*b4j.example.wixelement*/ ("size",(Object)(_s));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixpager  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 25;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixPager";
 //BA.debugLineNum = 26;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="pager.SetTemplate(os)";
_pager._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixpager)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
