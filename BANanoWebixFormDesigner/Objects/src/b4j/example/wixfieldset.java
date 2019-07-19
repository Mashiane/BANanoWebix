package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixfieldset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixfieldset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixfieldset.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _fieldset = null;
public anywheresoftware.b4a.objects.collections.Map _body = null;
public anywheresoftware.b4a.objects.collections.List _rows = null;
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
public b4j.example.wixfieldset  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub AddItem(itm As Map) As WixFieldSet";
 //BA.debugLineNum = 75;BA.debugLine="Rows.Add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 106;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 111;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 101;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public FieldSet As WixElement";
_fieldset = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private Rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixfieldset  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixFieldSe";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="FieldSet.Initialize(ID)";
_fieldset._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="FieldSet.SetView(\"fieldset\")";
_fieldset._setview /*b4j.example.wixelement*/ ("fieldset");
 //BA.debugLineNum = 14;BA.debugLine="body.Initialize";
_body.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 81;BA.debugLine="body.Put(\"rows\", Rows)";
_body.Put((Object)("rows"),(Object)(_rows.getObject()));
 //BA.debugLineNum = 82;BA.debugLine="FieldSet.SetAttr(\"body\", body)";
_fieldset._setattr /*b4j.example.wixelement*/ ("body",(Object)(_body.getObject()));
 //BA.debugLineNum = 83;BA.debugLine="Return FieldSet.item";
if (true) return _fieldset._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetHeight(h As Object) As WixFieldSet";
 //BA.debugLineNum = 94;BA.debugLine="FieldSet.SetHeight(h)";
_fieldset._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetLabel(l As String) As WixFieldSet";
 //BA.debugLineNum = 88;BA.debugLine="FieldSet.SetLabel(l)";
_fieldset._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMap(m As Map) As WixFieldSet";
 //BA.debugLineNum = 59;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 60;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 61;BA.debugLine="FieldSet.SetAttr(strKey,	strVal)";
_fieldset._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetMinHeight(h As Int) As WixFieldSet";
 //BA.debugLineNum = 53;BA.debugLine="FieldSet.SetMinHeight(h)";
_fieldset._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetMinWidth(w As Int) As WixFieldSet";
 //BA.debugLineNum = 47;BA.debugLine="FieldSet.SetMinWidth(w)";
_fieldset._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setname(String _n) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetName(n As String) As WixFieldSet";
 //BA.debugLineNum = 28;BA.debugLine="FieldSet.SetName(n)";
_fieldset._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetResponsive(b As Object) As WixFieldSet";
 //BA.debugLineNum = 34;BA.debugLine="FieldSet.SetResponsive(b)";
_fieldset._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixFieldSet";
 //BA.debugLineNum = 40;BA.debugLine="FieldSet.SetResponsiveCell(b)";
_fieldset._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixFieldSe";
 //BA.debugLineNum = 21;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 22;BA.debugLine="FieldSet.SetTemplate(os)";
_fieldset._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetTooltip(tt As String) As WixFieldSet";
 //BA.debugLineNum = 69;BA.debugLine="FieldSet.SetTooltip(tt)";
_fieldset._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
