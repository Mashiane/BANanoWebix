package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlayout extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixlayout", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixlayout.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _layout = null;
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
 //BA.debugLineNum = 128;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 129;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 134;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 124;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Layout As WixElement";
_layout = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixlayout  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sID As String) As WixLayout";
 //BA.debugLineNum = 9;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Layout.Initialize(ID).SetView(\"layout\")";
_layout._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("layout");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 16;BA.debugLine="Return Layout.item";
if (true) return _layout._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub SetMap(m As Map) As WixLayout";
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
 //BA.debugLineNum = 23;BA.debugLine="Layout.SetAttr(strKey,	strVal)";
_layout._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMinHeight(h As Int) As WixLayout";
 //BA.debugLineNum = 62;BA.debugLine="Layout.SetMinHeight(h)";
_layout._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMinWidth(w As Int) As WixLayout";
 //BA.debugLineNum = 56;BA.debugLine="Layout.SetMinWidth(w)";
_layout._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setname(String _n) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetName(n As String) As WixLayout";
 //BA.debugLineNum = 37;BA.debugLine="Layout.SetName(n)";
_layout._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetResponsive(b As Object) As WixLayout";
 //BA.debugLineNum = 43;BA.debugLine="Layout.SetResponsive(b)";
_layout._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixLayout";
 //BA.debugLineNum = 49;BA.debugLine="Layout.SetResponsiveCell(b)";
_layout._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetScroll(b As Object) As WixLayout";
 //BA.debugLineNum = 68;BA.debugLine="Layout.SetProperty(\"scroll\", b)";
_layout._setproperty /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetTemplate(t As String) As WixLayout";
 //BA.debugLineNum = 74;BA.debugLine="Layout.SetTemplate(t)";
_layout._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixLayout";
 //BA.debugLineNum = 30;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="Layout.SetTemplate(os)";
_layout._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settype(String _t) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetType(t As String) As WixLayout";
 //BA.debugLineNum = 81;BA.debugLine="Layout.SetType(t)";
_layout._settype /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetTypeClean(a As String) As WixLayout   'igno";
 //BA.debugLineNum = 87;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetTypeForm(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 117;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetTypeHead(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 111;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetTypeLine(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 93;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetTypeSpace(a As String) As WixLayout   'igno";
 //BA.debugLineNum = 105;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetTypeWide(a As String) As WixLayout   'ignor";
 //BA.debugLineNum = 99;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
