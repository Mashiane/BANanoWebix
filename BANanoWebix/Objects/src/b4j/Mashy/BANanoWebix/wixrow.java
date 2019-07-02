package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixrow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebix.wixelement _row = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.main _main = null;
public b4j.Mashy.BANanoWebix.wixrow  _addcells(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub AddCells(i As Map) As WixRow";
 //BA.debugLineNum = 35;BA.debugLine="Row.AddCells(i)";
_row._addcells /*b4j.Mashy.BANanoWebix.wixelement*/ (_i);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _addcolumn(b4j.Mashy.BANanoWebix.wixcolumn _wxel) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub AddColumn(wxEL As WixColumn) As WixRow";
 //BA.debugLineNum = 78;BA.debugLine="Row.AddColumns(wxEL.Item)";
_row._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _addcolumns(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub AddColumns(i As Map) As WixRow";
 //BA.debugLineNum = 22;BA.debugLine="Row.AddColumns(i)";
_row._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_i);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _addcolumnsitem(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub AddColumnsItem(i As Map) As WixRow";
 //BA.debugLineNum = 42;BA.debugLine="AddColumns(i)";
_addcolumns(_i);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _addcolumnsspacer(int _width) throws Exception{
anywheresoftware.b4a.objects.collections.Map _itm = null;
 //BA.debugLineNum = 47;BA.debugLine="Sub AddColumnsSpacer(width As Int) As WixRow  'ign";
 //BA.debugLineNum = 48;BA.debugLine="Dim itm As Map = CreateMap()";
_itm = new anywheresoftware.b4a.objects.collections.Map();
_itm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 49;BA.debugLine="If width > 0 Then itm.Put(\"width\", width)";
if (_width>0) { 
_itm.Put((Object)("width"),(Object)(_width));};
 //BA.debugLineNum = 50;BA.debugLine="Row.AddColumns(itm)";
_row._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_itm);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _additem(anywheresoftware.b4a.objects.collections.Map _wxel) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub AddItem(wxEL As Map) As WixRow";
 //BA.debugLineNum = 72;BA.debugLine="Row.AddRows(wxEL)";
_row._addrows /*b4j.Mashy.BANanoWebix.wixelement*/ (_wxel);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _addrows(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub AddRows(i As Map) As WixRow";
 //BA.debugLineNum = 55;BA.debugLine="Row.AddRows(i)";
_row._addrows /*b4j.Mashy.BANanoWebix.wixelement*/ (_i);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 84;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _addtopage(b4j.Mashy.BANanoWebix.wixpage _p) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub AddToPage(p As WixPage)";
 //BA.debugLineNum = 89;BA.debugLine="p.Page.AddRows(Item)";
_p._page /*b4j.Mashy.BANanoWebix.wixelement*/ ._addrows /*b4j.Mashy.BANanoWebix.wixelement*/ (_item());
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Row As WixElement";
_row = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixrow  _initialize(anywheresoftware.b4a.BA _ba,String _rid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(rID As String) As WixRow";
 //BA.debugLineNum = 9;BA.debugLine="ID = rID.tolowercase";
_id = _rid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Row.Initialize(ID)";
_row._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id);
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 67;BA.debugLine="Return Row.item";
if (true) return _row._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetHeight(h As Object) As WixRow";
 //BA.debugLineNum = 94;BA.debugLine="Row.SetHeight(h)";
_row._setheight /*b4j.Mashy.BANanoWebix.wixelement*/ (_h);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetScroll(b As Boolean) As WixRow";
 //BA.debugLineNum = 29;BA.debugLine="Row.SetProperty(\"scroll\", b)";
_row._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetTemplate(t As String) As WixRow";
 //BA.debugLineNum = 106;BA.debugLine="Row.SetTemplate(t)";
_row._settemplate /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetTooltip(tt As String) As WixRow";
 //BA.debugLineNum = 61;BA.debugLine="Row.SetTooltip(tt)";
_row._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _settypewide() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetTypeWide As WixRow";
 //BA.debugLineNum = 16;BA.debugLine="Row.SetAttr(\"type\", \"wide\")";
_row._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("type",(Object)("wide"));
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixrow  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetWidth(w As object) As WixRow";
 //BA.debugLineNum = 100;BA.debugLine="Row.setwidth(w)";
_row._setwidth /*b4j.Mashy.BANanoWebix.wixelement*/ (_w);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixrow)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
