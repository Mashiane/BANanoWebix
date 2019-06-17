package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixaccordion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixaccordion", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixaccordion.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _accordion = null;
public boolean _horizontal = false;
public b4j.example.main _main = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.wixelement  _additem(String _iid,String _header,String _body,int _width,boolean _bcollapsed) throws Exception{
b4j.example.wixelement _h = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub AddItem(iID As String, header As String, body";
 //BA.debugLineNum = 36;BA.debugLine="iID = iID.tolowercase";
_iid = _iid.toLowerCase();
 //BA.debugLineNum = 37;BA.debugLine="Dim h As WixElement";
_h = new b4j.example.wixelement();
 //BA.debugLineNum = 38;BA.debugLine="h.Initialize(iID)";
_h._initialize /*b4j.example.wixelement*/ (ba,_iid);
 //BA.debugLineNum = 39;BA.debugLine="h.SetHeader(header)";
_h._setheader /*b4j.example.wixelement*/ (_header);
 //BA.debugLineNum = 40;BA.debugLine="h.SetBody(body)";
_h._setbody /*b4j.example.wixelement*/ (_body);
 //BA.debugLineNum = 41;BA.debugLine="h.SetWidth(width)";
_h._setwidth /*b4j.example.wixelement*/ (_width);
 //BA.debugLineNum = 42;BA.debugLine="h.SetCollapsed(bCollapsed)";
_h._setcollapsed /*b4j.example.wixelement*/ (_bcollapsed);
 //BA.debugLineNum = 43;BA.debugLine="If Horizontal = True Then";
if (_horizontal==__c.True) { 
 //BA.debugLineNum = 44;BA.debugLine="Accordion.AddRows(h.Item)";
_accordion._addrows /*b4j.example.wixelement*/ (_h._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 }else {
 //BA.debugLineNum = 46;BA.debugLine="Accordion.AddColumns(h.Item)";
_accordion._addcolumns /*b4j.example.wixelement*/ (_h._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 };
 //BA.debugLineNum = 48;BA.debugLine="Return h";
if (true) return _h;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Accordion As WixElement";
_accordion = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Horizontal As Boolean";
_horizontal = false;
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixaccordion  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixAccordi";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="Accordion.Initialize(ID)";
_accordion._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 12;BA.debugLine="Accordion.SetView(\"accordion\")";
_accordion._setview /*b4j.example.wixelement*/ ("accordion");
 //BA.debugLineNum = 13;BA.debugLine="SetHorizontal(True)";
_sethorizontal(__c.True);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 31;BA.debugLine="Return Accordion.item";
if (true) return _accordion._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _setcollapsed(boolean _b) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetCollapsed(b As Boolean) As WixAccordion";
 //BA.debugLineNum = 19;BA.debugLine="Accordion.SetProperty(\"collapsed\", b)";
_accordion._setproperty /*b4j.example.wixelement*/ ("collapsed",(Object)(_b));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixaccordion  _sethorizontal(boolean _b) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetHorizontal(b As Boolean) As WixAccordion";
 //BA.debugLineNum = 25;BA.debugLine="Horizontal = b";
_horizontal = _b;
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.wixaccordion)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
