package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsuggest extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsuggest", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsuggest.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _suggest = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
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
public b4j.example.wixsuggest  _additem(String _sid,String _svalue) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub AddItem(sID As String, sValue As String) As Wi";
 //BA.debugLineNum = 97;BA.debugLine="AddSuggestion(sID, sValue)";
_addsuggestion(_sid,_svalue);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _addsuggestion(String _sid,String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sug = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub AddSuggestion(sID As String, sValue As String)";
 //BA.debugLineNum = 88;BA.debugLine="Dim sug As Map = CreateMap()";
_sug = new anywheresoftware.b4a.objects.collections.Map();
_sug = __c.createMap(new Object[] {});
 //BA.debugLineNum = 89;BA.debugLine="sug.Put(\"id\", sID)";
_sug.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 90;BA.debugLine="sug.Put(\"value\", sValue)";
_sug.Put((Object)("value"),(Object)(_svalue));
 //BA.debugLineNum = 91;BA.debugLine="Items.Add(sug)";
_items.Add((Object)(_sug.getObject()));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Suggest As WixElement";
_suggest = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsuggest  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sID As String) As WixSuggest";
 //BA.debugLineNum = 10;BA.debugLine="Suggest.Initialize(sID).SetView(\"suggest\")";
_suggest._initialize /*b4j.example.wixelement*/ (ba,_sid)._setview /*b4j.example.wixelement*/ ("suggest");
 //BA.debugLineNum = 11;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 82;BA.debugLine="If Items.Size > 0 Then SetData(Items)";
if (_items.getSize()>0) { 
_setdata(_items);};
 //BA.debugLineNum = 83;BA.debugLine="Return Suggest.Item";
if (true) return _suggest._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetData(d As List) As WixSuggest";
 //BA.debugLineNum = 17;BA.debugLine="Suggest.SetData(d)";
_suggest._setdata /*b4j.example.wixelement*/ (_d);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setfitmaster(boolean _b) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetFitMaster(b As Boolean) As WixSuggest";
 //BA.debugLineNum = 123;BA.debugLine="Suggest.SetAttr(\"fitMaster\", b)";
_suggest._setattr /*b4j.example.wixelement*/ ("fitMaster",(Object)(_b));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetHeight(h As Int) As WixSuggest";
 //BA.debugLineNum = 64;BA.debugLine="Suggest.SetHeight(h)";
_suggest._setheight /*b4j.example.wixelement*/ ((Object)(_h));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 22;BA.debugLine="Sub SetMap(m As Map) As WixSuggest";
 //BA.debugLineNum = 23;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 24;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 25;BA.debugLine="Suggest.SetAttr(strKey,	strVal)";
_suggest._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetMinHeight(h As Int) As WixSuggest";
 //BA.debugLineNum = 76;BA.debugLine="Suggest.SetMinHeight(h)";
_suggest._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetMinWidth(w As Int) As WixSuggest";
 //BA.debugLineNum = 70;BA.debugLine="Suggest.SetMinWidth(w)";
_suggest._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setname(String _n) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetName(n As String) As WixSuggest";
 //BA.debugLineNum = 39;BA.debugLine="Suggest.SetName(n)";
_suggest._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setrelativeleft(boolean _b) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetRelativeLeft(b As Boolean) As WixSuggest  '";
 //BA.debugLineNum = 110;BA.debugLine="Suggest.SetAttr(\"relative\", \"left\")";
_suggest._setattr /*b4j.example.wixelement*/ ("relative",(Object)("left"));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setrelativeright(boolean _b) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetRelativeRight(b As Boolean) As WixSuggest";
 //BA.debugLineNum = 117;BA.debugLine="Suggest.SetAttr(\"relative\", \"right\")";
_suggest._setattr /*b4j.example.wixelement*/ ("relative",(Object)("right"));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setrelativetop(boolean _b) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetRelativeTop(b As Boolean) As WixSuggest   '";
 //BA.debugLineNum = 103;BA.debugLine="Suggest.SetAttr(\"relative\", \"top\")";
_suggest._setattr /*b4j.example.wixelement*/ ("relative",(Object)("top"));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetResponsive(b As Object) As WixSuggest";
 //BA.debugLineNum = 45;BA.debugLine="Suggest.SetResponsive(b)";
_suggest._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSuggest";
 //BA.debugLineNum = 51;BA.debugLine="Suggest.SetResponsiveCell(b)";
_suggest._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 31;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSuggest";
 //BA.debugLineNum = 32;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 33;BA.debugLine="Suggest.SetTemplate(os)";
_suggest._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetWidth(w As Int) As WixSuggest";
 //BA.debugLineNum = 58;BA.debugLine="Suggest.SetWidth(w)";
_suggest._setwidth /*b4j.example.wixelement*/ ((Object)(_w));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsuggest  _setycount(Object _y) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetYCount(y As Object) As WixSuggest";
 //BA.debugLineNum = 129;BA.debugLine="Suggest.SetAttr(\"yCount\", y)";
_suggest._setattr /*b4j.example.wixelement*/ ("yCount",_y);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsuggest)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
