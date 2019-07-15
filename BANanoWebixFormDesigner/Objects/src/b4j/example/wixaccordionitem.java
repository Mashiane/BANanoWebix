package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixaccordionitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixaccordionitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixaccordionitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _accordionitem = null;
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
 //BA.debugLineNum = 4;BA.debugLine="Public AccordionItem As WixElement";
_accordionitem = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixaccordionitem  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixAccordi";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="AccordionItem.Initialize(ID).setview(\"accordionit";
_accordionitem._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("accordionitem");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordionitem)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 45;BA.debugLine="Return AccordionItem.item";
if (true) return _accordionitem._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordionitem  _setbody(Object _t) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetBody(t As Object) As WixAccordionItem";
 //BA.debugLineNum = 28;BA.debugLine="AccordionItem.SetBody(t)";
_accordionitem._setbody /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordionitem)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordionitem  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetBorderless(b As Boolean) As WixAccordionIte";
 //BA.debugLineNum = 39;BA.debugLine="AccordionItem.SetAttr(\"borderless\", b)";
_accordionitem._setattr /*b4j.example.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordionitem)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordionitem  _setcollapsed(Object _b) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetCollapsed(b As Object) As WixAccordionItem";
 //BA.debugLineNum = 23;BA.debugLine="AccordionItem.SetAttr(\"collapsed\", b)";
_accordionitem._setattr /*b4j.example.wixelement*/ ("collapsed",_b);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordionitem)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordionitem  _setheader(String _t) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetHeader(T As String) As WixAccordionItem";
 //BA.debugLineNum = 34;BA.debugLine="AccordionItem.SetHeader(t)";
_accordionitem._setheader /*b4j.example.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordionitem)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordionitem  _setheaderheight(Object _h) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetHeaderHeight(h As Object) As WixAccordionIt";
 //BA.debugLineNum = 50;BA.debugLine="AccordionItem.SetAttr(\"headerHeight\", h)";
_accordionitem._setattr /*b4j.example.wixelement*/ ("headerHeight",_h);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordionitem)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordionitem  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMap(m As Map) As WixAccordionItem";
 //BA.debugLineNum = 56;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 57;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 58;BA.debugLine="AccordionItem.SetAttr(strKey, strVal)";
_accordionitem._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordionitem)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordionitem  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 15;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixAccordi";
 //BA.debugLineNum = 16;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="AccordionItem.SetTemplate(os)";
_accordionitem._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordionitem)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
