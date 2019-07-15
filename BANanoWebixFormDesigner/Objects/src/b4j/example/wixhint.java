package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixhint extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixhint", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixhint.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _hint = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
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
public b4j.example.wixhint  _addstep(String _elid,String _stitle,String _stext,String _sevent) throws Exception{
anywheresoftware.b4a.objects.collections.Map _h = null;
 //BA.debugLineNum = 16;BA.debugLine="Sub AddStep(elID As String, stitle As String, stex";
 //BA.debugLineNum = 17;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="Dim h As Map = CreateMap()";
_h = new anywheresoftware.b4a.objects.collections.Map();
_h = __c.createMap(new Object[] {});
 //BA.debugLineNum = 19;BA.debugLine="h.Put(\"el\", elID)";
_h.Put((Object)("el"),(Object)(_elid));
 //BA.debugLineNum = 20;BA.debugLine="h.Put(\"title\", stitle)";
_h.Put((Object)("title"),(Object)(_stitle));
 //BA.debugLineNum = 21;BA.debugLine="h.Put(\"text\", stext)";
_h.Put((Object)("text"),(Object)(_stext));
 //BA.debugLineNum = 22;BA.debugLine="h.Put(\"event\", sevent)";
_h.Put((Object)("event"),(Object)(_sevent));
 //BA.debugLineNum = 23;BA.debugLine="Items.Add(h)";
_items.Add((Object)(_h.getObject()));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixhint)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Hint As WixElement";
_hint = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixhint  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixHint";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Hint.Initialize(ID).SetView(\"hint\")";
_hint._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("hint");
 //BA.debugLineNum = 12;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixhint)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 45;BA.debugLine="Hint.SetAttr(\"steps\", Items)";
_hint._setattr /*b4j.example.wixelement*/ ("steps",(Object)(_items.getObject()));
 //BA.debugLineNum = 46;BA.debugLine="Return Hint.item";
if (true) return _hint._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixhint  _setleft(Object _l) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetLeft(l As Object) As WixHint";
 //BA.debugLineNum = 40;BA.debugLine="Hint.SetAttr(\"left\", l)";
_hint._setattr /*b4j.example.wixelement*/ ("left",_l);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixhint)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixhint  _setnextbutton(Object _n) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetNextButton(n As Object) As WixHint";
 //BA.debugLineNum = 51;BA.debugLine="Hint.SetAttr(\"nextButton\", n)";
_hint._setattr /*b4j.example.wixelement*/ ("nextButton",_n);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixhint)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixhint  _setprevbutton(Object _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetPrevButton(b As Object) As WixHint";
 //BA.debugLineNum = 57;BA.debugLine="Hint.SetAttr(\"prevButton\", b)";
_hint._setattr /*b4j.example.wixelement*/ ("prevButton",_b);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixhint)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixhint  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixHint";
 //BA.debugLineNum = 29;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 30;BA.debugLine="Hint.SetTemplate(os)";
_hint._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixhint)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixhint  _settop(Object _t) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetTop(t As Object) As WixHint";
 //BA.debugLineNum = 35;BA.debugLine="Hint.SetAttr(\"top\", t)";
_hint._setattr /*b4j.example.wixelement*/ ("top",_t);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.wixhint)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
