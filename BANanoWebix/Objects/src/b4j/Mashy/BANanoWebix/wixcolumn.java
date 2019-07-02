package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcolumn extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixcolumn", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixcolumn.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebix.wixelement _column = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.main _main = null;
public b4j.Mashy.BANanoWebix.wixcolumn  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub AddColumns(itm As Map) As WixColumn";
 //BA.debugLineNum = 28;BA.debugLine="Column.AddColumns(itm)";
_column._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_itm);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcolumn)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _additem(anywheresoftware.b4a.objects.collections.Map _wxel) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub AddItem(wxEL As Map)";
 //BA.debugLineNum = 39;BA.debugLine="Column.AddColumns(wxEL)";
_column._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_wxel);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixcolumn  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub AddRows(itm As Map) As WixColumn";
 //BA.debugLineNum = 16;BA.debugLine="Column.AddRows(itm)";
_column._addrows /*b4j.Mashy.BANanoWebix.wixelement*/ (_itm);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcolumn)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 45;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _addtorow(b4j.Mashy.BANanoWebix.wixrow _r) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 50;BA.debugLine="r.Row.AddColumns(Item)";
_r._row /*b4j.Mashy.BANanoWebix.wixelement*/ ._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_item());
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Column As WixElement";
_column = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixcolumn  _initialize(anywheresoftware.b4a.BA _ba,String _rid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(rID As String) As WixColumn";
 //BA.debugLineNum = 9;BA.debugLine="ID = rID.tolowercase";
_id = _rid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="Column.Initialize(ID)";
_column._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id);
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcolumn)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 34;BA.debugLine="Return Column.item";
if (true) return _column._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcolumn  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetHeight(h As Object) As WixColumn";
 //BA.debugLineNum = 55;BA.debugLine="Column.SetHeight(h)";
_column._setheight /*b4j.Mashy.BANanoWebix.wixelement*/ (_h);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcolumn)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcolumn  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetTemplate(t As String) As WixColumn";
 //BA.debugLineNum = 67;BA.debugLine="Column.SetTemplate(t)";
_column._settemplate /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcolumn)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcolumn  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetTooltip(tt As String) As WixColumn";
 //BA.debugLineNum = 22;BA.debugLine="Column.SetTooltip(tt)";
_column._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcolumn)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcolumn  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetWidth(w As object) As WixColumn";
 //BA.debugLineNum = 61;BA.debugLine="Column.SetWidth(w)";
_column._setwidth /*b4j.Mashy.BANanoWebix.wixelement*/ (_w);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcolumn)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
