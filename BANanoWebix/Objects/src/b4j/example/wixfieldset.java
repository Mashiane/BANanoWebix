package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixfieldset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixfieldset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixfieldset.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _fieldset = null;
public anywheresoftware.b4a.objects.collections.Map _body = null;
public anywheresoftware.b4a.objects.collections.List _rows = null;
public b4j.example.main _main = null;
public b4j.example.pgdatatable1 _pgdatatable1 = null;
public b4j.example.pgdatatable _pgdatatable = null;
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
public b4j.example.pglayout _pglayout = null;
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.wixfieldset  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub AddItem(itm As Map) As WixFieldSet";
 //BA.debugLineNum = 28;BA.debugLine="Rows.Add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public FieldSet As WixElement";
_fieldset = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private Rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixfieldset  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(sid As String) As WixFieldSe";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="FieldSet.Initialize(ID)";
_fieldset._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 13;BA.debugLine="FieldSet.SetView(\"fieldset\")";
_fieldset._setview /*b4j.example.wixelement*/ ("fieldset");
 //BA.debugLineNum = 14;BA.debugLine="body.Initialize";
_body.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 34;BA.debugLine="body.Put(\"rows\", Rows)";
_body.Put((Object)("rows"),(Object)(_rows.getObject()));
 //BA.debugLineNum = 35;BA.debugLine="FieldSet.SetProperty(\"body\", body)";
_fieldset._setproperty /*b4j.example.wixelement*/ ("body",(Object)(_body.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="Return FieldSet.item";
if (true) return _fieldset._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetHeight(h As Int) As WixFieldSet";
 //BA.debugLineNum = 47;BA.debugLine="FieldSet.SetHeight(h)";
_fieldset._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetLabel(l As String) As WixFieldSet";
 //BA.debugLineNum = 41;BA.debugLine="FieldSet.SetLabel(l)";
_fieldset._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixfieldset  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTooltip(tt As String) As WixFieldSet";
 //BA.debugLineNum = 22;BA.debugLine="FieldSet.SetTooltip(tt)";
_fieldset._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixfieldset)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
