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
public anywheresoftware.b4a.objects.collections.List _data = null;
public com.ab.banano.BANanoObject _dollar = null;
public com.ab.banano.BANanoObject _onafterselect = null;
public b4j.example.main _main = null;
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
public String  _add(anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Add(record As Map)";
 //BA.debugLineNum = 68;BA.debugLine="Dollar.Selector(ID).RunMethod(\"add\",Array(record)";
_dollar.Selector((Object)(_id)).RunMethod("add",(Object)(new Object[]{(Object)(_record.getObject())}));
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 21;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 26;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _attachafterselectevent() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub AttachAfterSelectEvent()";
 //BA.debugLineNum = 84;BA.debugLine="Dollar.Selector(ID).RunMethod(\"attachEvent\",Array";
_dollar.Selector((Object)(_id)).RunMethod("attachEvent",(Object)(new Object[]{(Object)("onAfterSelect"),(Object)(_onafterselect)}));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Private Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private Dollar As BANanoObject";
_dollar = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 8;BA.debugLine="Private onAfterSelect As BANanoObject";
_onafterselect = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getitem(String _recordid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub GetItem(recordID As String) As Map";
 //BA.debugLineNum = 78;BA.debugLine="Dim values As Map = Dollar.Selector(ID).RunMethod";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_id)).RunMethod("getItem",(Object)(new Object[]{(Object)(_recordid)})).Result()));
 //BA.debugLineNum = 79;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public String  _getselectedid() throws Exception{
String _recid = "";
 //BA.debugLineNum = 94;BA.debugLine="Sub GetSelectedID As String";
 //BA.debugLineNum = 95;BA.debugLine="Dim recID As String = Dollar.Selector(ID).RunMeth";
_recid = BA.ObjectToString(_dollar.Selector((Object)(_id)).RunMethod("getSelectedId",__c.Null).Result());
 //BA.debugLineNum = 96;BA.debugLine="Return recID";
if (true) return _recid;
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixlist  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.wixpage _pg,String _lid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(pg As WixPage, lID As String";
 //BA.debugLineNum = 13;BA.debugLine="ID = lID.tolowercase";
_id = _lid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="List.Initialize(ID).SetView(\"list\")";
_list._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("list");
 //BA.debugLineNum = 15;BA.debugLine="Dollar = pg.Dollar";
_dollar = _pg._dollar /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 61;BA.debugLine="List.SetAttr(\"select\", EnableSelect)";
_list._setattr /*b4j.example.wixelement*/ ("select",(Object)(_enableselect));
 //BA.debugLineNum = 62;BA.debugLine="List.SetAttr(\"data\", Data)";
_list._setattr /*b4j.example.wixelement*/ ("data",(Object)(_data.getObject()));
 //BA.debugLineNum = 63;BA.debugLine="Return List.item";
if (true) return _list._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public String  _remove(String _recid) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub Remove(recID As String)";
 //BA.debugLineNum = 89;BA.debugLine="If recID = \"\" Then Return";
if ((_recid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 90;BA.debugLine="Dollar.Selector(ID).RunMethod(\"remove\",Array(recI";
_dollar.Selector((Object)(_id)).RunMethod("remove",(Object)(new Object[]{(Object)(_recid)}));
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixlist  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetData(d As List) As WixList";
 //BA.debugLineNum = 49;BA.debugLine="Data = d";
_data = _d;
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setenableselect(boolean _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetEnableSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 43;BA.debugLine="EnableSelect = b";
_enableselect = _b;
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetHeight(h As Int) As WixList";
 //BA.debugLineNum = 31;BA.debugLine="List.Height = h";
_list._height /*int*/  = _h;
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setonafterselect(com.ab.banano.BANanoObject _b) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetOnAfterSelect(b As BANanoObject) As WixList";
 //BA.debugLineNum = 55;BA.debugLine="onAfterSelect = b";
_onafterselect = _b;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetTemplate(t As String) As WixList";
 //BA.debugLineNum = 101;BA.debugLine="List.Template = t";
_list._template /*String*/  = _t;
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixlist  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetWidth(w As Int) As WixList";
 //BA.debugLineNum = 37;BA.debugLine="List.Width = w";
_list._width /*int*/  = _w;
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixlist)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public String  _update(String _recordid,anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Update(recordID As String, record As Map)";
 //BA.debugLineNum = 73;BA.debugLine="Dollar.Selector(ID).RunMethod(\"updateItem\",Array(";
_dollar.Selector((Object)(_id)).RunMethod("updateItem",(Object)(new Object[]{(Object)(_recordid),(Object)(_record.getObject())}));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
