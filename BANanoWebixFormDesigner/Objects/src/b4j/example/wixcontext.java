package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcontext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcontext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcontext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _context = null;
public anywheresoftware.b4a.objects.collections.Map _body = null;
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
 //BA.debugLineNum = 101;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 102;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 107;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 97;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Context As WixElement";
_context = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcontext  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixContext";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Context.Initialize(ID).setview(\"context\")";
_context._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("context");
 //BA.debugLineNum = 12;BA.debugLine="body.Initialize";
_body.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 84;BA.debugLine="Context.SetAttr(\"body\", body)";
_context._setattr /*b4j.example.wixelement*/ ("body",(Object)(_body.getObject()));
 //BA.debugLineNum = 85;BA.debugLine="Return Context.item";
if (true) return _context._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetHeight(h As Object) As WixContext";
 //BA.debugLineNum = 72;BA.debugLine="Context.SetAttr(\"height\", h)";
_context._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMap(m As Map) As WixContext";
 //BA.debugLineNum = 30;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 31;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 32;BA.debugLine="Context.SetAttr(strKey,	strVal)";
_context._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _setmaster(String _pid) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetMaster(pID As String) As WixContext";
 //BA.debugLineNum = 24;BA.debugLine="Context.SetAttr(\"master\", pID)";
_context._setattr /*b4j.example.wixelement*/ ("master",(Object)(_pid));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetMinHeight(h As Int) As WixContext";
 //BA.debugLineNum = 65;BA.debugLine="Context.SetMinHeight(h)";
_context._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetMinWidth(w As Int) As WixContext";
 //BA.debugLineNum = 59;BA.debugLine="Context.SetMinWidth(w)";
_context._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _setname(String _n) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetName(n As String) As WixContext";
 //BA.debugLineNum = 40;BA.debugLine="Context.SetName(n)";
_context._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetResponsive(b As Object) As WixContext";
 //BA.debugLineNum = 46;BA.debugLine="Context.SetResponsive(b)";
_context._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixContext";
 //BA.debugLineNum = 52;BA.debugLine="Context.SetResponsiveCell(b)";
_context._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetTemplate(t As String) As WixContext";
 //BA.debugLineNum = 90;BA.debugLine="body.put(\"template\", t)";
_body.Put((Object)("template"),(Object)(_t));
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 16;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixContext";
 //BA.debugLineNum = 17;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Context.SetTemplate(os)";
_context._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcontext  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetWidth(w As Object) As WixContext";
 //BA.debugLineNum = 78;BA.debugLine="Context.SetAttr(\"width\", w)";
_context._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcontext)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
