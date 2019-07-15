package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixflexlayout extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixflexlayout", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixflexlayout.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _flexlayout = null;
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
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub AddColumns(itm As Map)";
 //BA.debugLineNum = 34;BA.debugLine="FlexLayout.AddColumns(itm)";
_flexlayout._addcolumns /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub AddRows(itm As Map)";
 //BA.debugLineNum = 40;BA.debugLine="FlexLayout.AddRows(itm)";
_flexlayout._addrows /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 152;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 157;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 147;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public FlexLayout As WixElement";
_flexlayout = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixflexlayout  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sID As String) As WixFlexLay";
 //BA.debugLineNum = 9;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="FlexLayout.Initialize(ID).SetView(\"flexlayout\")";
_flexlayout._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("flexlayout");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 16;BA.debugLine="Return FlexLayout.item";
if (true) return _flexlayout._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub SetMap(m As Map) As WixFlexLayout";
 //BA.debugLineNum = 45;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 46;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 47;BA.debugLine="FlexLayout.SetAttr(strKey,	strVal)";
_flexlayout._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetMargin(margin As Object) As WixFlexLayout";
 //BA.debugLineNum = 60;BA.debugLine="FlexLayout.SetMargin(margin)";
_flexlayout._setmargin /*b4j.example.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetMinHeight(h As Int) As WixFlexLayout";
 //BA.debugLineNum = 85;BA.debugLine="FlexLayout.SetMinHeight(h)";
_flexlayout._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetMinWidth(w As Int) As WixFlexLayout";
 //BA.debugLineNum = 79;BA.debugLine="FlexLayout.SetMinWidth(w)";
_flexlayout._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _setname(String _n) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetName(n As String) As WixFlexLayout";
 //BA.debugLineNum = 28;BA.debugLine="FlexLayout.SetName(n)";
_flexlayout._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetPadding(padding As Object) As WixFlexLayout";
 //BA.debugLineNum = 54;BA.debugLine="FlexLayout.SetPadding(padding)";
_flexlayout._setpadding /*b4j.example.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetResponsive(b As Object) As WixFlexLayout";
 //BA.debugLineNum = 66;BA.debugLine="FlexLayout.SetResponsive(b)";
_flexlayout._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixFlexLayou";
 //BA.debugLineNum = 72;BA.debugLine="FlexLayout.SetResponsiveCell(b)";
_flexlayout._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _setscroll(Object _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetScroll(b As Object) As WixFlexLayout";
 //BA.debugLineNum = 91;BA.debugLine="FlexLayout.SetProperty(\"scroll\", b)";
_flexlayout._setproperty /*b4j.example.wixelement*/ ("scroll",_b);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetTemplate(t As String) As WixFlexLayout";
 //BA.debugLineNum = 97;BA.debugLine="FlexLayout.SetTemplate(t)";
_flexlayout._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixFlexLay";
 //BA.debugLineNum = 21;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 22;BA.debugLine="FlexLayout.SetTemplate(os)";
_flexlayout._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _settype(String _t) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetType(t As String) As WixFlexLayout";
 //BA.debugLineNum = 104;BA.debugLine="FlexLayout.SetType(t)";
_flexlayout._settype /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _settypeclean(String _a) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetTypeClean(a As String) As WixFlexLayout   '";
 //BA.debugLineNum = 110;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _settypeform(String _a) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetTypeForm(a As String) As WixFlexLayout   'i";
 //BA.debugLineNum = 140;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _settypehead(String _a) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetTypeHead(a As String) As WixFlexLayout   'i";
 //BA.debugLineNum = 134;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _settypeline(String _a) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetTypeLine(a As String) As WixFlexLayout   'i";
 //BA.debugLineNum = 116;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _settypespace(String _a) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetTypeSpace(a As String) As WixFlexLayout   '";
 //BA.debugLineNum = 128;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixflexlayout  _settypewide(String _a) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetTypeWide(a As String) As WixFlexLayout   'i";
 //BA.debugLineNum = 122;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.wixflexlayout)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
