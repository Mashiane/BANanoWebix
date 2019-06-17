package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixform extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixform", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixform.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.wixelement _form = null;
public String _id = "";
public com.ab.banano.BANanoObject _dollar = null;
public b4j.example.wixpage _page = null;
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
public String  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub AddItem(itm As Map)";
 //BA.debugLineNum = 57;BA.debugLine="Form.AddItem(itm)";
_form._additem /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 20;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 25;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Form As WixElement";
_form = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private Dollar As BANanoObject";
_dollar = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Private Page As WixPage";
_page = new b4j.example.wixpage();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 47;BA.debugLine="Dollar.Selector(ID).RunMethod(\"clear\",Null)";
_dollar.Selector((Object)(_id)).RunMethod("clear",__c.Null);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getvalues() throws Exception{
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 40;BA.debugLine="Sub GetValues() As Map";
 //BA.debugLineNum = 41;BA.debugLine="Dim values As Map = Dollar.Selector(ID).RunMethod";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_id)).RunMethod("getValues",__c.Null).Result()));
 //BA.debugLineNum = 42;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.wixpage _pg,String _fid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(pg As WixPage, fID As String";
 //BA.debugLineNum = 11;BA.debugLine="Page = pg";
_page = _pg;
 //BA.debugLineNum = 12;BA.debugLine="ID = fID.tolowercase";
_id = _fid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Form.Initialize(fID).SetView(\"form\")";
_form._initialize /*b4j.example.wixelement*/ (ba,_fid)._setview /*b4j.example.wixelement*/ ("form");
 //BA.debugLineNum = 14;BA.debugLine="Dollar = Page.dollar";
_dollar = _page._dollar /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 36;BA.debugLine="Return Form.item";
if (true) return _form._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public String  _setvalues(anywheresoftware.b4a.objects.collections.Map _values) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetValues(values As Map)";
 //BA.debugLineNum = 52;BA.debugLine="Dollar.Selector(ID).RunMethod(\"setValues\",Array(v";
_dollar.Selector((Object)(_id)).RunMethod("setValues",(Object)(new Object[]{(Object)(_values.getObject())}));
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixform  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetWidth(w As Int) As WixForm";
 //BA.debugLineNum = 30;BA.debugLine="Form.Width = w";
_form._width /*int*/  = _w;
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
