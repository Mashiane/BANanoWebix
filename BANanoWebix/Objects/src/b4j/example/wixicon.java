package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixicon extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixicon", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixicon.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _icon = null;
public com.ab.banano.BANanoObject _onclick = null;
public String _iconname = "";
public b4j.example.wixelement _parent = null;
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
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 34;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 39;BA.debugLine="tblB.Toolbar.AddColumns(Item)";
_tblb._toolbar /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Icon As WixElement";
_icon = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private onClick As BANanoObject";
_onclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Private IconName As String";
_iconname = "";
 //BA.debugLineNum = 7;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.example.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixicon  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(bID As String) As WixIcon";
 //BA.debugLineNum = 12;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Icon.Initialize(ID).SetView(\"icon\")";
_icon._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("icon");
 //BA.debugLineNum = 14;BA.debugLine="onClick = Null";
_onclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="IconName = \"\"";
_iconname = "";
 //BA.debugLineNum = 16;BA.debugLine="Parent = Null";
_parent = (b4j.example.wixelement)(__c.Null);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 56;BA.debugLine="Icon.SetOnContent(\"icon\", IconName)";
_icon._setoncontent /*b4j.example.wixelement*/ ("icon",_iconname);
 //BA.debugLineNum = 57;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 58;BA.debugLine="Icon.SetAttr(\"click\", onClick)";
_icon._setattr /*b4j.example.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 60;BA.debugLine="Return Icon.item";
if (true) return _icon._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 22;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixicon  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetClick(e As BANanoObject) As WixIcon";
 //BA.debugLineNum = 50;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetHeight(h As Int) As WixIcon";
 //BA.debugLineNum = 65;BA.debugLine="Icon.Height = h";
_icon._height /*int*/  = _h;
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetIcon(i As String) As WixIcon";
 //BA.debugLineNum = 44;BA.debugLine="IconName = i";
_iconname = _i;
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setparent(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetParent(p As WixElement) As WixIcon";
 //BA.debugLineNum = 27;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetWidth(w As Int) As WixIcon";
 //BA.debugLineNum = 71;BA.debugLine="Icon.Width = w";
_icon._width /*int*/  = _w;
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
