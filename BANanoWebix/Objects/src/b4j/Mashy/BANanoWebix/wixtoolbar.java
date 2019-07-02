package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtoolbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixtoolbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixtoolbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _toolbar = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public b4j.Mashy.BANanoWebix.wixtoolbar  _addbutton(b4j.Mashy.BANanoWebix.wixbutton _btn) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub AddButton(btn As WixButton) As WixToolBar";
 //BA.debugLineNum = 45;BA.debugLine="ToolBar.AddColumns(btn.item)";
_toolbar._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_btn._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtoolbar)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtoolbar  _addicon(b4j.Mashy.BANanoWebix.wixicon _icn) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub AddIcon(icn As WixIcon) As WixToolBar";
 //BA.debugLineNum = 86;BA.debugLine="ToolBar.AddColumns(icn.Item)";
_toolbar._addcolumns /*b4j.Mashy.BANanoWebix.wixelement*/ (_icn._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtoolbar)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtoolbar  _addspacer() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub AddSpacer As WixToolBar";
 //BA.debugLineNum = 80;BA.debugLine="ToolBar.AddColumnsSpacer";
_toolbar._addcolumnsspacer /*String*/ ();
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtoolbar)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public String  _addtopage(b4j.Mashy.BANanoWebix.wixpage _pg) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub AddToPage(pg As WixPage)";
 //BA.debugLineNum = 10;BA.debugLine="ToolBar.AddToRows(pg.Page)";
_toolbar._addtorows /*String*/ (_pg._page /*b4j.Mashy.BANanoWebix.wixelement*/ );
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public ToolBar As WixElement";
_toolbar = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixbutton  _createbutton(String _sid) throws Exception{
b4j.Mashy.BANanoWebix.wixbutton _btn = null;
 //BA.debugLineNum = 50;BA.debugLine="Sub CreateButton(sid As String) As WixButton";
 //BA.debugLineNum = 51;BA.debugLine="Dim btn As WixButton";
_btn = new b4j.Mashy.BANanoWebix.wixbutton();
 //BA.debugLineNum = 52;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebix.wixbutton*/ (ba,_sid);
 //BA.debugLineNum = 53;BA.debugLine="btn.parent = ToolBar";
_btn._parent /*b4j.Mashy.BANanoWebix.wixelement*/  = _toolbar;
 //BA.debugLineNum = 54;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixicon  _createicon(String _sid) throws Exception{
b4j.Mashy.BANanoWebix.wixicon _btn = null;
 //BA.debugLineNum = 58;BA.debugLine="Sub CreateIcon(sid As String) As WixIcon";
 //BA.debugLineNum = 59;BA.debugLine="Dim btn As WixIcon";
_btn = new b4j.Mashy.BANanoWebix.wixicon();
 //BA.debugLineNum = 60;BA.debugLine="btn.Initialize(sid).SetParent(ToolBar)";
_btn._initialize /*b4j.Mashy.BANanoWebix.wixicon*/ (ba,_sid)._setparent /*b4j.Mashy.BANanoWebix.wixicon*/ (_toolbar);
 //BA.debugLineNum = 61;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlabel  _createlabel(String _sid) throws Exception{
b4j.Mashy.BANanoWebix.wixlabel _lbl = null;
 //BA.debugLineNum = 65;BA.debugLine="Sub CreateLabel(sid As String) As WixLabel";
 //BA.debugLineNum = 66;BA.debugLine="Dim lbl As WixLabel";
_lbl = new b4j.Mashy.BANanoWebix.wixlabel();
 //BA.debugLineNum = 67;BA.debugLine="lbl.Initialize(sid).setparent(ToolBar)";
_lbl._initialize /*b4j.Mashy.BANanoWebix.wixlabel*/ (ba,_sid)._setparent /*b4j.Mashy.BANanoWebix.wixlabel*/ (_toolbar);
 //BA.debugLineNum = 68;BA.debugLine="Return lbl";
if (true) return _lbl;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixbutton  _createtoggle(String _sid) throws Exception{
b4j.Mashy.BANanoWebix.wixbutton _btn = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub CreateToggle(sid As String) As WixButton";
 //BA.debugLineNum = 73;BA.debugLine="Dim btn As WixButton";
_btn = new b4j.Mashy.BANanoWebix.wixbutton();
 //BA.debugLineNum = 74;BA.debugLine="btn.Initialize(sid).SetToggle(\"\").SetParent(ToolB";
_btn._initialize /*b4j.Mashy.BANanoWebix.wixbutton*/ (ba,_sid)._settoggle /*b4j.Mashy.BANanoWebix.wixbutton*/ ("")._setparent /*b4j.Mashy.BANanoWebix.wixbutton*/ (_toolbar);
 //BA.debugLineNum = 75;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtoolbar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(sID As String) As WixToolBar";
 //BA.debugLineNum = 15;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="ToolBar.Initialize(ID).SetView(\"toolbar\")";
_toolbar._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("toolbar");
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtoolbar)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 40;BA.debugLine="Return ToolBar.item";
if (true) return _toolbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtoolbar  _setmargin(int _m) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetMargin(m As Int) As WixToolBar";
 //BA.debugLineNum = 28;BA.debugLine="ToolBar.SetAttr(\"margin\", m)";
_toolbar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("margin",(Object)(_m));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtoolbar)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtoolbar  _setpadding(String _p) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetPadding(p As String) As WixToolBar";
 //BA.debugLineNum = 22;BA.debugLine="ToolBar.SetAttr(\"padding\", p)";
_toolbar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("padding",(Object)(_p));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtoolbar)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtoolbar  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetTooltip(tt As String) As WixToolBar";
 //BA.debugLineNum = 34;BA.debugLine="ToolBar.SetTooltip(tt)";
_toolbar._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtoolbar)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
