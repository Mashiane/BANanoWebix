package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixicon extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixicon", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixicon.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _icon = null;
public com.ab.banano.BANanoObject _onclick = null;
public String _iconname = "";
public b4j.Mashy.BANanoWebix.wixelement _parent = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 54;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.Mashy.BANanoWebix.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 59;BA.debugLine="tblB.Toolbar.AddColumns(Item)";
_tblb._toolbar /*b4j.Mashy.BANanoWebix.wixelement*/ ._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_item());
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Icon As WixElement";
_icon = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private onClick As BANanoObject";
_onclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Private IconName As String";
_iconname = "";
 //BA.debugLineNum = 7;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixicon  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(bID As String) As WixIcon";
 //BA.debugLineNum = 12;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Icon.Initialize(ID).SetView(\"icon\")";
_icon._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("icon");
 //BA.debugLineNum = 14;BA.debugLine="onClick = Null";
_onclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="IconName = \"\"";
_iconname = "";
 //BA.debugLineNum = 16;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebix.wixelement)(__c.Null);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 83;BA.debugLine="Icon.SetOnContent(\"icon\", IconName)";
_icon._setoncontent /*b4j.Mashy.BANanoWebix.wixelement*/ ("icon",_iconname);
 //BA.debugLineNum = 84;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 85;BA.debugLine="Icon.SetAttr(\"click\", onClick)";
_icon._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 87;BA.debugLine="Return Icon.item";
if (true) return _icon._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 22;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_item());
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixicon  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetAlignCenter(r As String) As WixIcon 'ignore";
 //BA.debugLineNum = 111;BA.debugLine="Icon.setAligncenter(\"\")";
_icon._setaligncenter /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetAlignLeft(r As String) As WixIcon 'ignore";
 //BA.debugLineNum = 117;BA.debugLine="Icon.SetAlignleft(\"\")";
_icon._setalignleft /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetAlignRight(r As String) As WixIcon 'ignore";
 //BA.debugLineNum = 105;BA.debugLine="Icon.setAlignright(\"\")";
_icon._setalignright /*b4j.Mashy.BANanoWebix.wixelement*/ ("");
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _setbadge(String _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetBadge(b As String) As WixIcon";
 //BA.debugLineNum = 76;BA.debugLine="Icon.SetAttr(\"badge\", b)";
_icon._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("badge",(Object)(_b));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetClick(e As BANanoObject) As WixIcon";
 //BA.debugLineNum = 70;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetHeight(h As Object) As WixIcon";
 //BA.debugLineNum = 92;BA.debugLine="Icon.Height = h";
_icon._height /*Object*/  = _h;
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetIcon(i As String) As WixIcon";
 //BA.debugLineNum = 64;BA.debugLine="IconName = i";
_iconname = _i;
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _setparent(b4j.Mashy.BANanoWebix.wixelement _p) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetParent(p As WixElement) As WixIcon";
 //BA.debugLineNum = 48;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _setpopup(String _popupid) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetPopUp(popupID As String) As WixIcon";
 //BA.debugLineNum = 35;BA.debugLine="popupID = popupID.ToLowerCase";
_popupid = _popupid.toLowerCase();
 //BA.debugLineNum = 36;BA.debugLine="Icon.SetProperty(\"popup\", popupID)";
_icon._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("popup",(Object)(_popupid));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 42;BA.debugLine="Icon.SetStyle(prop,val)";
_icon._setstyle /*b4j.Mashy.BANanoWebix.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetTooltip(tt As String) As WixIcon";
 //BA.debugLineNum = 28;BA.debugLine="Icon.SetTooltip(tt)";
_icon._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetWidth(w As Object) As WixIcon";
 //BA.debugLineNum = 98;BA.debugLine="Icon.Width = w";
_icon._width /*Object*/  = _w;
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixicon)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
