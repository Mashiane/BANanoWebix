package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcolumn extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcolumn", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcolumn.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _column = null;
public String _id = "";
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
public b4j.example.wixcolumn  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub AddColumns(itm As Map) As WixColumn";
 //BA.debugLineNum = 89;BA.debugLine="Column.AddColumns(itm)";
_column._addcolumns /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public String  _additem(anywheresoftware.b4a.objects.collections.Map _wxel) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub AddItem(wxEL As Map)";
 //BA.debugLineNum = 100;BA.debugLine="Column.AddColumns(wxEL)";
_column._addcolumns /*b4j.example.wixelement*/ (_wxel);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcolumn  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub AddRows(itm As Map) As WixColumn";
 //BA.debugLineNum = 16;BA.debugLine="Column.AddRows(itm)";
_column._addrows /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 140;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 145;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 106;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _addtorow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 111;BA.debugLine="r.Row.AddColumns(Item)";
_r._row /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 135;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Column As WixElement";
_column = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcolumn  _initialize(anywheresoftware.b4a.BA _ba,String _rid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(rID As String) As WixColumn";
 //BA.debugLineNum = 9;BA.debugLine="ID = rID.tolowercase";
_id = _rid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Column.Initialize(ID)";
_column._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 95;BA.debugLine="Return Column.item";
if (true) return _column._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetHeight(h As Object) As WixColumn";
 //BA.debugLineNum = 116;BA.debugLine="Column.SetHeight(h)";
_column._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 78;BA.debugLine="Sub SetMap(m As Map) As WixColumn";
 //BA.debugLineNum = 79;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 80;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 81;BA.debugLine="Column.SetAttr(strKey,	strVal)";
_column._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetMargin(margin As Object) As WixColumn";
 //BA.debugLineNum = 35;BA.debugLine="Column.SetMargin(margin)";
_column._setmargin /*b4j.example.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetMinHeight(h As Int) As WixColumn";
 //BA.debugLineNum = 67;BA.debugLine="Column.SetMinHeight(h)";
_column._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetMinWidth(w As Int) As WixColumn";
 //BA.debugLineNum = 61;BA.debugLine="Column.SetMinWidth(w)";
_column._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setname(String _n) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetName(n As String) As WixColumn";
 //BA.debugLineNum = 42;BA.debugLine="Column.SetName(n)";
_column._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetPadding(padding As Object) As WixColumn";
 //BA.debugLineNum = 29;BA.debugLine="Column.SetPadding(padding)";
_column._setpadding /*b4j.example.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetResponsive(b As Object) As WixColumn";
 //BA.debugLineNum = 48;BA.debugLine="Column.SetResponsive(b)";
_column._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixColumn";
 //BA.debugLineNum = 54;BA.debugLine="Column.SetResponsiveCell(b)";
_column._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetTemplate(t As String) As WixColumn";
 //BA.debugLineNum = 128;BA.debugLine="Column.SetTemplate(t)";
_column._settemplate /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixColumn";
 //BA.debugLineNum = 22;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="Column.SetTemplate(os)";
_column._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetTooltip(tt As String) As WixColumn";
 //BA.debugLineNum = 73;BA.debugLine="Column.SetTooltip(tt)";
_column._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcolumn  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetWidth(w As Object) As WixColumn";
 //BA.debugLineNum = 122;BA.debugLine="Column.SetWidth(w)";
_column._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcolumn)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
