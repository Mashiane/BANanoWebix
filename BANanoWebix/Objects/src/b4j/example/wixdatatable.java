package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatatable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixdatatable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixdatatable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _datatable = null;
public boolean _autoconfig = false;
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
public b4j.example.wixdatatable  _addheader(String _sid,String _sheader,int _ifillspace) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 17;BA.debugLine="Sub AddHeader(sid As String, sheader As String, iF";
 //BA.debugLineNum = 18;BA.debugLine="Dim col As Map = CreateMap()";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col = __c.createMap(new Object[] {});
 //BA.debugLineNum = 19;BA.debugLine="col.Put(\"id\", sid)";
_col.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 20;BA.debugLine="col.Put(\"header\", sheader)";
_col.Put((Object)("header"),(Object)(_sheader));
 //BA.debugLineNum = 21;BA.debugLine="If iFillSpace > 0 Then";
if (_ifillspace>0) { 
 //BA.debugLineNum = 22;BA.debugLine="col.Put(\"fillspace\", iFillSpace)";
_col.Put((Object)("fillspace"),(Object)(_ifillspace));
 };
 //BA.debugLineNum = 24;BA.debugLine="DataTable.AddColumns(col)";
_datatable._addcolumns /*b4j.example.wixelement*/ (_col);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 60;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DataTable As WixElement";
_datatable = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private AutoConfig As Boolean";
_autoconfig = false;
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixdatatable  _initialize(anywheresoftware.b4a.BA _ba,String _tid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(tID As String) As WixDataTab";
 //BA.debugLineNum = 10;BA.debugLine="ID = tID.ToLowerCase";
_id = _tid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="DataTable.Initialize(ID).SetView(\"datatable\")";
_datatable._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("datatable");
 //BA.debugLineNum = 12;BA.debugLine="AutoConfig = False";
_autoconfig = __c.False;
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 36;BA.debugLine="DataTable.SetAttr(\"autoConfig\", AutoConfig)";
_datatable._setattr /*b4j.example.wixelement*/ ("autoConfig",(Object)(_autoconfig));
 //BA.debugLineNum = 37;BA.debugLine="Return DataTable.item";
if (true) return _datatable._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setautoconfig(boolean _a) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetAutoConfig(a As Boolean) As WixDataTable";
 //BA.debugLineNum = 42;BA.debugLine="AutoConfig = a";
_autoconfig = _a;
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetData(data As List) As WixDataTable";
 //BA.debugLineNum = 65;BA.debugLine="DataTable.SetData(data)";
_datatable._setdata /*b4j.example.wixelement*/ (_data);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetHeight(h As Int) As WixDataTable";
 //BA.debugLineNum = 48;BA.debugLine="DataTable.SetHeight(h)";
_datatable._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetTooltip(tt As String) As WixDataTable";
 //BA.debugLineNum = 30;BA.debugLine="DataTable.SetTooltip(tt)";
_datatable._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixdatatable  _setwidth(int _h) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetWidth(h As Int) As WixDataTable";
 //BA.debugLineNum = 54;BA.debugLine="DataTable.SetWidth(h)";
_datatable._setwidth /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixdatatable)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
