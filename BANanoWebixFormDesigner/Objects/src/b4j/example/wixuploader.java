package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixuploader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixuploader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixuploader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _uploader = null;
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
 //BA.debugLineNum = 138;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 139;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 144;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 134;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Uploader As WixElement";
_uploader = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixuploader  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sID As String) As WixUploade";
 //BA.debugLineNum = 9;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Uploader.Initialize(ID).SetView(\"uploader\")";
_uploader._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("uploader");
 //BA.debugLineNum = 11;BA.debugLine="SetName(\"upload\")";
_setname("upload");
 //BA.debugLineNum = 12;BA.debugLine="SetInputName(\"upload\")";
_setinputname("upload");
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 128;BA.debugLine="Return Uploader.item";
if (true) return _uploader._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setaccept(String _a) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetAccept(a As String) As WixUploader";
 //BA.debugLineNum = 107;BA.debugLine="Uploader.SetAttr(\"accept\", a)";
_uploader._setattr /*b4j.example.wixelement*/ ("accept",(Object)(_a));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setapionly(boolean _b) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetApiOnly(b As Boolean) As WixUploader";
 //BA.debugLineNum = 74;BA.debugLine="Uploader.SetAttr(\"apiOnly\", b)";
_uploader._setattr /*b4j.example.wixelement*/ ("apiOnly",(Object)(_b));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setautosend(boolean _b) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetAutoSend(b As Boolean) As WixUploader";
 //BA.debugLineNum = 90;BA.debugLine="Uploader.SetAttr(\"autosend\", b)";
_uploader._setattr /*b4j.example.wixelement*/ ("autosend",(Object)(_b));
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setdatatype(String _d) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetDataType(d As String) As WixUploader";
 //BA.debugLineNum = 80;BA.debugLine="Uploader.SetAttr(\"datatype\", d)";
_uploader._setattr /*b4j.example.wixelement*/ ("datatype",(Object)(_d));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setdirectory(boolean _b) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetDirectory(b As Boolean) As WixUploader";
 //BA.debugLineNum = 101;BA.debugLine="Uploader.SetAttr(\"directory\", b)";
_uploader._setattr /*b4j.example.wixelement*/ ("directory",(Object)(_b));
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetHeight(h As Object) As WixUploader";
 //BA.debugLineNum = 118;BA.debugLine="Uploader.SetHeight(h)";
_uploader._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setinputname(String _n) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetInputName(n As String) As WixUploader";
 //BA.debugLineNum = 69;BA.debugLine="Uploader.SetAttr(\"inputName\", n)";
_uploader._setattr /*b4j.example.wixelement*/ ("inputName",(Object)(_n));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setlink(String _l) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetLink(l As String) As WixUploader";
 //BA.debugLineNum = 96;BA.debugLine="Uploader.SetAttr(\"link\", l)";
_uploader._setattr /*b4j.example.wixelement*/ ("link",(Object)(_l));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 60;BA.debugLine="Sub SetMap(m As Map) As WixUploader";
 //BA.debugLineNum = 61;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 62;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 63;BA.debugLine="Uploader.SetAttr(strKey,	strVal)";
_uploader._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetMinHeight(h As Int) As WixUploader";
 //BA.debugLineNum = 55;BA.debugLine="Uploader.SetMinHeight(h)";
_uploader._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetMinWidth(w As Int) As WixUploader";
 //BA.debugLineNum = 49;BA.debugLine="Uploader.SetMinWidth(w)";
_uploader._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setmultiple(boolean _b) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetMultiple(b As Boolean) As WixUploader";
 //BA.debugLineNum = 85;BA.debugLine="Uploader.SetAttr(\"multiple\", b)";
_uploader._setattr /*b4j.example.wixelement*/ ("multiple",(Object)(_b));
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setname(String _n) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetName(n As String) As WixUploader";
 //BA.debugLineNum = 30;BA.debugLine="Uploader.SetName(n)";
_uploader._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetResponsive(b As Object) As WixUploader";
 //BA.debugLineNum = 36;BA.debugLine="Uploader.SetResponsive(b)";
_uploader._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixUploader";
 //BA.debugLineNum = 42;BA.debugLine="Uploader.SetResponsiveCell(b)";
_uploader._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 22;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixUploade";
 //BA.debugLineNum = 23;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 24;BA.debugLine="Uploader.SetTemplate(os)";
_uploader._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setupload(String _u) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetUpload(u As String) As WixUploader";
 //BA.debugLineNum = 113;BA.debugLine="Uploader.SetAttr(\"upload\", u)";
_uploader._setattr /*b4j.example.wixelement*/ ("upload",(Object)(_u));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetValue(v As String) As WixUploader";
 //BA.debugLineNum = 17;BA.debugLine="Uploader.SetValue(v)";
_uploader._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixuploader  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetWidth(w As Object) As WixUploader";
 //BA.debugLineNum = 123;BA.debugLine="Uploader.SetWidth(w)";
_uploader._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixuploader)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
