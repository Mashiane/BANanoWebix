package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlayout extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixlayout", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixlayout.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _layout = null;
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.wixlayout  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub AddColumns(itm As Map) As WixLayout";
 //BA.debugLineNum = 22;BA.debugLine="Layout.AddColumns(itm)";
_layout._addcolumns /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _addelements(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub AddElements(itm As Map) As WixLayout";
 //BA.debugLineNum = 28;BA.debugLine="Layout.AddElements(itm)";
_layout._addelements /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub AddRows(itm As Map) As WixLayout";
 //BA.debugLineNum = 34;BA.debugLine="Layout.AddRows(itm)";
_layout._addrows /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _addtocolumns(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub AddToColumns(prt As WixElement) As WixLayout";
 //BA.debugLineNum = 114;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _addtoelements(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub AddToElements(prt As WixElement) As WixLayout";
 //BA.debugLineNum = 120;BA.debugLine="prt.AddElements(Item)";
_prt._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 93;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _addtorow(b4j.example.wixrow _r) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 103;BA.debugLine="r.AddItem(Item)";
_r._additem /*b4j.example.wixrow*/ (_item());
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixlayout  _addtorows(b4j.example.wixelement _prt) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub AddToRows(prt As WixElement) As WixLayout";
 //BA.debugLineNum = 108;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 98;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Layout As WixElement";
_layout = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixlayout  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sID As String) As WixLayout";
 //BA.debugLineNum = 9;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Layout.Initialize(ID).SetView(\"layout\")";
_layout._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("layout");
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 82;BA.debugLine="Return Layout.item";
if (true) return _layout._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setclean() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetClean As WixLayout";
 //BA.debugLineNum = 40;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setform() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetForm As WixLayout";
 //BA.debugLineNum = 70;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _sethead() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetHead As WixLayout";
 //BA.debugLineNum = 64;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setheaderlayout() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetHeaderLayout As WixLayout";
 //BA.debugLineNum = 16;BA.debugLine="Layout.SetView(\"headerlayout\")";
_layout._setview /*b4j.example.wixelement*/ ("headerlayout");
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setline() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetLine As WixLayout";
 //BA.debugLineNum = 46;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setspace() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetSpace As WixLayout";
 //BA.debugLineNum = 58;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetTemplate(t As String) As WixLayout";
 //BA.debugLineNum = 87;BA.debugLine="Layout.Template = t";
_layout._template /*String*/  = _t;
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _settype(String _typeof) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetType(typeof As String) As WixLayout";
 //BA.debugLineNum = 76;BA.debugLine="Layout.TypeOf = typeof";
_layout._typeof /*String*/  = _typeof;
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlayout  _setwide() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetWide As WixLayout";
 //BA.debugLineNum = 52;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlayout)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
