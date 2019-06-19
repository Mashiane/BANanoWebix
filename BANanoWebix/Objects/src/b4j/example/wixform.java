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
public anywheresoftware.b4a.objects.collections.List _elements = null;
public anywheresoftware.b4a.objects.collections.List _columns = null;
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
public String  _addcolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub AddColumn(c As WixColumn)";
 //BA.debugLineNum = 32;BA.debugLine="Columns.Add(c.Item)";
_columns.Add((Object)(_c._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub AddColumns(i As Map)";
 //BA.debugLineNum = 37;BA.debugLine="Columns.Add(i)";
_columns.Add((Object)(_i.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _addcolumnsspacer() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub AddColumnsSpacer()";
 //BA.debugLineNum = 27;BA.debugLine="Columns.Add(CreateMap())";
_columns.Add((Object)(__c.createMap(new Object[] {}).getObject()));
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub AddItem(itm As Map)";
 //BA.debugLineNum = 73;BA.debugLine="Form.AddItem(itm)";
_form._additem /*b4j.example.wixelement*/ (_itm);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumn(b4j.example.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 42;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 47;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Form As WixElement";
_form = new b4j.example.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private Elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixform  _initialize(anywheresoftware.b4a.BA _ba,String _fid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(fID As String) As WixForm";
 //BA.debugLineNum = 11;BA.debugLine="ID = fID.tolowercase";
_id = _fid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Form.Initialize(fID).SetView(\"form\")";
_form._initialize /*b4j.example.wixelement*/ (ba,_fid)._setview /*b4j.example.wixelement*/ ("form");
 //BA.debugLineNum = 13;BA.debugLine="Elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.Map _cols = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 64;BA.debugLine="Dim cols As Map = CreateMap()";
_cols = new anywheresoftware.b4a.objects.collections.Map();
_cols = __c.createMap(new Object[] {});
 //BA.debugLineNum = 65;BA.debugLine="cols.Put(\"cols\", Columns)";
_cols.Put((Object)("cols"),(Object)(_columns.getObject()));
 //BA.debugLineNum = 66;BA.debugLine="Elements.Add(cols)";
_elements.Add((Object)(_cols.getObject()));
 //BA.debugLineNum = 67;BA.debugLine="Form.SetProperty(\"elements\", Elements)";
_form._setproperty /*b4j.example.wixelement*/ ("elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 68;BA.debugLine="Return Form.item";
if (true) return _form._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetHeight(h As Int) As WixForm";
 //BA.debugLineNum = 58;BA.debugLine="Form.Height = h";
_form._height /*int*/  = _h;
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTooltip(tt As String) As WixForm";
 //BA.debugLineNum = 21;BA.debugLine="Form.SetTooltip(tt)";
_form._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixform  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetWidth(w As Int) As WixForm";
 //BA.debugLineNum = 52;BA.debugLine="Form.Width = w";
_form._width /*int*/  = _w;
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.wixform)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
