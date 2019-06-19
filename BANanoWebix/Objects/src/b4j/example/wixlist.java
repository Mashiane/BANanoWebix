package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixlist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixlist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _list = null;
public String _id = "";
public boolean _enableselect = false;
public b4j.example.main _main = null;
public b4j.example.pgcharts _pgcharts = null;
public b4j.example.pgdataentry _pgdataentry = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgtoolbar _pgtoolbar = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtocolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 24;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 29;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public List As WixElement";
_list = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private EnableSelect As Boolean";
_enableselect = false;
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixlist  _initialize(anywheresoftware.b4a.BA _ba,String _lid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(lID As String) As WixList";
 //BA.debugLineNum = 10;BA.debugLine="ID = lID.tolowercase";
_id = _lid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="List.Initialize(ID).SetView(\"list\")";
_list._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("list");
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 47;BA.debugLine="List.SetAttr(\"select\", EnableSelect)";
_list._setattr /*b4j.example.wixelement*/ ("select",(Object)(_enableselect));
 //BA.debugLineNum = 48;BA.debugLine="Return List.item";
if (true) return _list._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setdata(anywheresoftware.b4a.objects.collections.List _t) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetData(t As List) As WixList";
 //BA.debugLineNum = 72;BA.debugLine="List.SetData(t)";
_list._setdata /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setenableselect(boolean _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetEnableSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 41;BA.debugLine="EnableSelect = b";
_enableselect = _b;
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setheight(String _t) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetHeight(t As String) As WixList";
 //BA.debugLineNum = 60;BA.debugLine="List.SetHeight(t)";
_list._setheight /*b4j.example.wixelement*/ ((int)(Double.parseDouble(_t)));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetTemplate(t As String) As WixList";
 //BA.debugLineNum = 53;BA.debugLine="List.SetTemplate(t)";
_list._settemplate /*b4j.example.wixelement*/ (_t);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetTooltip(tt As String) As WixList";
 //BA.debugLineNum = 18;BA.debugLine="List.SetTooltip(tt)";
_list._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetValue(v As String) As WixList";
 //BA.debugLineNum = 34;BA.debugLine="List.SetValue(v)";
_list._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setwidth(String _t) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetWidth(t As String) As WixList";
 //BA.debugLineNum = 66;BA.debugLine="List.SetWidth(t)";
_list._setwidth /*b4j.example.wixelement*/ ((int)(Double.parseDouble(_t)));
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
