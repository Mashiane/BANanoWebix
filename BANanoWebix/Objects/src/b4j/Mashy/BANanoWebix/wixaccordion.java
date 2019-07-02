package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixaccordion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixaccordion", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixaccordion.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _accordion = null;
public boolean _horizontal = false;
public b4j.Mashy.BANanoWebix.main _main = null;
public b4j.Mashy.BANanoWebix.wixelement  _additem(String _iid,String _header,String _body,int _width,boolean _bcollapsed) throws Exception{
b4j.Mashy.BANanoWebix.wixelement _h = null;
 //BA.debugLineNum = 41;BA.debugLine="Sub AddItem(iID As String, header As String, body";
 //BA.debugLineNum = 42;BA.debugLine="iID = iID.tolowercase";
_iid = _iid.toLowerCase();
 //BA.debugLineNum = 43;BA.debugLine="Dim h As WixElement";
_h = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 44;BA.debugLine="h.Initialize(iID)";
_h._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_iid);
 //BA.debugLineNum = 45;BA.debugLine="h.SetHeader(header)";
_h._setheader /*b4j.Mashy.BANanoWebix.wixelement*/ (_header);
 //BA.debugLineNum = 46;BA.debugLine="h.SetBody(body)";
_h._setbody /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_body));
 //BA.debugLineNum = 47;BA.debugLine="h.SetWidth(width)";
_h._setwidth /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_width));
 //BA.debugLineNum = 48;BA.debugLine="h.SetCollapsed(bCollapsed)";
_h._setcollapsed /*b4j.Mashy.BANanoWebix.wixelement*/ (_bcollapsed);
 //BA.debugLineNum = 49;BA.debugLine="If Horizontal = True Then";
if (_horizontal==__c.True) { 
 //BA.debugLineNum = 50;BA.debugLine="Accordion.AddRows(h.Item)";
_accordion._addrows /*b4j.Mashy.BANanoWebix.wixelement*/ (_h._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 }else {
 //BA.debugLineNum = 52;BA.debugLine="Accordion.AddColumns(h.Item)";
_accordion._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_h._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 };
 //BA.debugLineNum = 54;BA.debugLine="Return h";
if (true) return _h;
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Accordion As WixElement";
_accordion = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Horizontal As Boolean";
_horizontal = false;
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixaccordion  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixAccordi";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Accordion.Initialize(ID)";
_accordion._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id);
 //BA.debugLineNum = 12;BA.debugLine="Accordion.SetView(\"accordion\")";
_accordion._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("accordion");
 //BA.debugLineNum = 13;BA.debugLine="SetHorizontal(True)";
_sethorizontal(__c.True);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixaccordion)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 37;BA.debugLine="Return Accordion.item";
if (true) return _accordion._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixaccordion  _setcollapsed(boolean _b) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetCollapsed(b As Boolean) As WixAccordion";
 //BA.debugLineNum = 19;BA.debugLine="Accordion.SetProperty(\"collapsed\", b)";
_accordion._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("collapsed",(Object)(_b));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixaccordion)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixaccordion  _sethorizontal(boolean _b) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetHorizontal(b As Boolean) As WixAccordion";
 //BA.debugLineNum = 25;BA.debugLine="Horizontal = b";
_horizontal = _b;
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixaccordion)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixaccordion  _setmulti(boolean _b) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetMulti(b As Boolean) As WixAccordion";
 //BA.debugLineNum = 31;BA.debugLine="Accordion.SetAttr(\"multi\", b)";
_accordion._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("multi",(Object)(_b));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixaccordion)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
