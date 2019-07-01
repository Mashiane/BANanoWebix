package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsegmented extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsegmented", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsegmented.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _segmented = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public anywheresoftware.b4a.objects.collections.List _cells = null;
public b4j.example.main _main = null;
public b4j.example.pgtabbar _pgtabbar = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgdataview _pgdataview = null;
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
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.pggrouplist _pggrouplist = null;
public b4j.example.pgcontext _pgcontext = null;
public b4j.example.pggooglemap _pggooglemap = null;
public b4j.example.pguploader1 _pguploader1 = null;
public b4j.example.wixsegmented  _addoption(String _oid,String _otxt,String _childtemplate) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 56;BA.debugLine="Sub AddOption(oid As String, oTxt As String, child";
 //BA.debugLineNum = 57;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 58;BA.debugLine="opt.put(\"id\",oid)";
_opt.Put((Object)("id"),(Object)(_oid));
 //BA.debugLineNum = 59;BA.debugLine="opt.Put(\"value\",oTxt)";
_opt.Put((Object)("value"),(Object)(_otxt));
 //BA.debugLineNum = 60;BA.debugLine="Options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 61;BA.debugLine="If childTemplate <> \"\" Then";
if ((_childtemplate).equals("") == false) { 
 //BA.debugLineNum = 62;BA.debugLine="Dim Cell As Map = CreateMap()";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __c.createMap(new Object[] {});
 //BA.debugLineNum = 63;BA.debugLine="Cell.Put(\"id\", oid)";
_cell.Put((Object)("id"),(Object)(_oid));
 //BA.debugLineNum = 64;BA.debugLine="Cell.Put(\"template\", childTemplate)";
_cell.Put((Object)("template"),(Object)(_childtemplate));
 //BA.debugLineNum = 65;BA.debugLine="Cells.Add(Cell)";
_cells.Add((Object)(_cell.getObject()));
 };
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 72;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Segmented As WixElement";
_segmented = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Cells As List";
_cells = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsegmented  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixSegment";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Segmented.Initialize(iID).SetView(\"segmented\")";
_segmented._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("segmented");
 //BA.debugLineNum = 13;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 33;BA.debugLine="Segmented.SetAttr(\"options\", Options)";
_segmented._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 34;BA.debugLine="Return Segmented.item";
if (true) return _segmented._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetAlignCenter(r As String) As WixSegmented 'i";
 //BA.debugLineNum = 84;BA.debugLine="Segmented.setAligncenter(\"\")";
_segmented._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetAlignLeft(r As String) As WixSegmented 'ign";
 //BA.debugLineNum = 90;BA.debugLine="Segmented.SetAlignleft(\"\")";
_segmented._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetAlignRight(r As String) As WixSegmented 'ig";
 //BA.debugLineNum = 78;BA.debugLine="Segmented.setAlignright(\"\")";
_segmented._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetLabel(l As String) As WixSegmented";
 //BA.debugLineNum = 45;BA.debugLine="Segmented.SetLabel(l)";
_segmented._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetOptions(o As List) As WixSegmented";
 //BA.debugLineNum = 39;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 27;BA.debugLine="Segmented.SetStyle(prop,val)";
_segmented._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTooltip(tt As String) As WixSegmented";
 //BA.debugLineNum = 21;BA.debugLine="Segmented.SetTooltip(tt)";
_segmented._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetValue(v As String) As WixSegmented";
 //BA.debugLineNum = 51;BA.debugLine="Segmented.SetValue(v)";
_segmented._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
