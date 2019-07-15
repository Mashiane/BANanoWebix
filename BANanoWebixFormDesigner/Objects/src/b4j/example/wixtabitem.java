package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtabitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtabitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtabitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public String _vtitle = "";
public String _vicon = "";
public b4j.example.wixelement _body = null;
public b4j.example.wixelement _tabitem = null;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Private vTitle As String";
_vtitle = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vIcon As String";
_vicon = "";
 //BA.debugLineNum = 6;BA.debugLine="Public Body As WixElement";
_body = new b4j.example.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="Public TabItem As WixElement";
_tabitem = new b4j.example.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtabitem  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixTabItem";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="TabItem.Initialize(ID & \"tab\")";
_tabitem._initialize /*b4j.example.wixelement*/ (ba,_id+"tab");
 //BA.debugLineNum = 14;BA.debugLine="Body.Initialize(ID & \"body\")";
_body._initialize /*b4j.example.wixelement*/ (ba,_id+"body");
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabitem)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 50;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 51;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 52;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 53;BA.debugLine="If vIcon <> \"\" Then";
if ((_vicon).equals("") == false) { 
 //BA.debugLineNum = 54;BA.debugLine="sb.Append($\"<span class='webix_icon ${vIcon}'></";
_sb.Append(("<span class='webix_icon "+__c.SmartStringFormatter("",(Object)(_vicon))+"'></span>"));
 };
 //BA.debugLineNum = 56;BA.debugLine="If vTitle <> \"\" Then";
if ((_vtitle).equals("") == false) { 
 //BA.debugLineNum = 57;BA.debugLine="sb.Append(vTitle)";
_sb.Append(_vtitle);
 };
 //BA.debugLineNum = 59;BA.debugLine="TabItem.SetHeader(sb.ToString)";
_tabitem._setheader /*b4j.example.wixelement*/ ((Object)(_sb.ToString()));
 //BA.debugLineNum = 60;BA.debugLine="TabItem.SetBody(Body.Item)";
_tabitem._setbody /*b4j.example.wixelement*/ ((Object)(_body._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 61;BA.debugLine="Return TabItem.item";
if (true) return _tabitem._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabitem  _setbody(b4j.example.wixelement _b) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetBody(b As WixElement) As WixTabItem";
 //BA.debugLineNum = 33;BA.debugLine="Body = b";
_body = _b;
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabitem)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabitem  _setclose(boolean _b) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetClose(b As Boolean) As WixTabItem";
 //BA.debugLineNum = 20;BA.debugLine="TabItem.SetAttr(\"close\", b)";
_tabitem._setattr /*b4j.example.wixelement*/ ("close",(Object)(_b));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabitem)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabitem  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetIcon(i As String) As WixTabItem";
 //BA.debugLineNum = 45;BA.debugLine="vIcon = i";
_vicon = _i;
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabitem)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabitem  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 66;BA.debugLine="Sub SetMap(m As Map) As WixTabItem";
 //BA.debugLineNum = 67;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 68;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 69;BA.debugLine="TabItem.SetAttr(strKey,	strVal)";
_tabitem._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabitem)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabitem  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 25;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTabItem";
 //BA.debugLineNum = 26;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="TabItem.SetTemplate(os)";
_tabitem._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabitem)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtabitem  _settitle(String _t) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetTitle(T As String) As WixTabItem";
 //BA.debugLineNum = 39;BA.debugLine="vTitle = T";
_vtitle = _t;
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabitem)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
