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
public anywheresoftware.b4a.objects.collections.Map _elementsconfig = null;
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pglayouts _pglayouts = null;
public String  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub AddItem(itm As Map)";
 //BA.debugLineNum = 89;BA.debugLine="Form.AddItem(itm)";
_form._additem /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 46;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 51;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 56;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Private elementsConfig As Map";
_elementsconfig = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 79;BA.debugLine="Dollar.Selector(ID).RunMethod(\"clear\",Null)";
_dollar.Selector((Object)(_id)).RunMethod("clear",__c.Null);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getvalues() throws Exception{
anywheresoftware.b4a.objects.collections.Map _values = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub GetValues() As Map";
 //BA.debugLineNum = 73;BA.debugLine="Dim values As Map = Dollar.Selector(ID).RunMethod";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dollar.Selector((Object)(_id)).RunMethod("getValues",__c.Null).Result()));
 //BA.debugLineNum = 74;BA.debugLine="Return values";
if (true) return _values;
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.wixpage _pg,String _fid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(pg As WixPage, fID As String";
 //BA.debugLineNum = 12;BA.debugLine="Page = pg";
_page = _pg;
 //BA.debugLineNum = 13;BA.debugLine="ID = fID.tolowercase";
_id = _fid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Form.Initialize(fID).SetView(\"form\")";
_form._initialize /*b4j.example.wixelement*/ (ba,_fid)._setview /*b4j.example.wixelement*/ ("form");
 //BA.debugLineNum = 15;BA.debugLine="Dollar = Page.dollar";
_dollar = _page._dollar /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 16;BA.debugLine="elementsConfig.Initialize";
_elementsconfig.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 67;BA.debugLine="Form.SetAttr(\"elementsConfig\", elementsConfig)";
_form._setattr /*b4j.example.wixelement*/ ("elementsConfig",(Object)(_elementsconfig.getObject()));
 //BA.debugLineNum = 68;BA.debugLine="Return Form.item";
if (true) return _form._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultalign(String _a) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetDefaultAlign(a As String) As WixForm";
 //BA.debugLineNum = 34;BA.debugLine="elementsConfig.Put(\"align\", a)";
_elementsconfig.Put((Object)("align"),(Object)(_a));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetDefaultLabelAlign(a As String) As WixForm";
 //BA.debugLineNum = 22;BA.debugLine="elementsConfig.Put(\"labelAlign\", a)";
_elementsconfig.Put((Object)("labelAlign"),(Object)(_a));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetDefaultLabelPosition(p As String) As WixFor";
 //BA.debugLineNum = 28;BA.debugLine="elementsConfig.Put(\"labelPosition\", p)";
_elementsconfig.Put((Object)("labelPosition"),(Object)(_p));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setdefaultwidth(int _w) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetDefaultWidth(w As Int) As WixForm";
 //BA.debugLineNum = 40;BA.debugLine="elementsConfig.Put(\"width\", w)";
_elementsconfig.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public String  _setvalues(anywheresoftware.b4a.objects.collections.Map _values) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetValues(values As Map)";
 //BA.debugLineNum = 84;BA.debugLine="Dollar.Selector(ID).RunMethod(\"setValues\",Array(v";
_dollar.Selector((Object)(_id)).RunMethod("setValues",(Object)(new Object[]{(Object)(_values.getObject())}));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixform  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetWidth(w As Int) As WixForm";
 //BA.debugLineNum = 61;BA.debugLine="Form.Width = w";
_form._width /*int*/  = _w;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
