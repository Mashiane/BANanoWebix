package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _menu = null;
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public int _sepcount = 0;
public b4j.Mashy.BANanoWebix.main _main = null;
public b4j.Mashy.BANanoWebix.wixmenu  _additem(String _parentid,String _meid,String _mvalue,String _mhref,String _micon,String _badge,String _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub AddItem(parentID As String, meID As String, mV";
 //BA.debugLineNum = 64;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 65;BA.debugLine="meID = meID.tolowercase";
_meid = _meid.toLowerCase();
 //BA.debugLineNum = 66;BA.debugLine="Dim mitem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 67;BA.debugLine="mitem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 68;BA.debugLine="mitem.Put(\"value\", mValue)";
_mitem.Put((Object)("value"),(Object)(_mvalue));
 //BA.debugLineNum = 69;BA.debugLine="mitem.Put(\"href\", mhref)";
_mitem.Put((Object)("href"),(Object)(_mhref));
 //BA.debugLineNum = 70;BA.debugLine="mitem.Put(\"badge\", badge)";
_mitem.Put((Object)("badge"),(Object)(_badge));
 //BA.debugLineNum = 71;BA.debugLine="mitem.Put(\"target\", target)";
_mitem.Put((Object)("target"),(Object)(_target));
 //BA.debugLineNum = 72;BA.debugLine="mitem.Put(\"icon\", mIcon)";
_mitem.Put((Object)("icon"),(Object)(_micon));
 //BA.debugLineNum = 73;BA.debugLine="mitem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 74;BA.debugLine="Items.Add(mitem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _addseparator(String _parentid) throws Exception{
String _meid = "";
anywheresoftware.b4a.objects.collections.Map _mitem = null;
 //BA.debugLineNum = 78;BA.debugLine="Sub AddSeparator(parentID As String) As WixMenu";
 //BA.debugLineNum = 79;BA.debugLine="parentID = parentID.tolowercase";
_parentid = _parentid.toLowerCase();
 //BA.debugLineNum = 80;BA.debugLine="sepCount = sepCount + 1";
_sepcount = (int) (_sepcount+1);
 //BA.debugLineNum = 81;BA.debugLine="sepCount = sepCount & \"\"";
_sepcount = (int)(Double.parseDouble(BA.NumberToString(_sepcount)+""));
 //BA.debugLineNum = 82;BA.debugLine="Dim meID As String = \"sep\" & sepCount";
_meid = "sep"+BA.NumberToString(_sepcount);
 //BA.debugLineNum = 83;BA.debugLine="Dim mItem As Map = CreateMap()";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = __c.createMap(new Object[] {});
 //BA.debugLineNum = 84;BA.debugLine="mItem.Put(\"id\", meID)";
_mitem.Put((Object)("id"),(Object)(_meid));
 //BA.debugLineNum = 85;BA.debugLine="mItem.Put(\"parentid\", parentID)";
_mitem.Put((Object)("parentid"),(Object)(_parentid));
 //BA.debugLineNum = 86;BA.debugLine="mItem.Put(\"$template\", \"Separator\")";
_mitem.Put((Object)("$template"),(Object)("Separator"));
 //BA.debugLineNum = 87;BA.debugLine="Items.Add(mItem)";
_items.Add((Object)(_mitem.getObject()));
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 93;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Menu As WixElement";
_menu = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private typeof As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private sepCount As Int";
_sepcount = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixmenu  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(iID As String) As WixMenu";
 //BA.debugLineNum = 12;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Menu.Initialize(iID).SetView(\"menu\")";
_menu._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("menu");
 //BA.debugLineNum = 14;BA.debugLine="typeof = CreateMap()";
_typeof = __c.createMap(new Object[] {});
 //BA.debugLineNum = 15;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="sepCount = 0";
_sepcount = (int) (0);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 98;BA.debugLine="Menu.SetAttr(\"type\", typeof)";
_menu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 99;BA.debugLine="Return Menu.item";
if (true) return _menu._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixMenu";
 //BA.debugLineNum = 58;BA.debugLine="Menu.SetAttr(\"autowidth\", b)";
_menu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("autowidth",(Object)(_b));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetData(d As List) As WixMenu";
 //BA.debugLineNum = 109;BA.debugLine="Menu.SetAttr(\"data\", d)";
_menu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("data",(Object)(_d.getObject()));
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetHeight(h As Object) As WixMenu";
 //BA.debugLineNum = 40;BA.debugLine="Menu.SetAttr(\"height\", h)";
_menu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _setitemsubsign(boolean _b) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetItemSubSign(b As Boolean) As WixMenu";
 //BA.debugLineNum = 28;BA.debugLine="typeof.Put(\"subsign\", b)";
_typeof.Put((Object)("subsign"),(Object)(_b));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _setlayouty(String _r) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetLayoutY(r As String) As WixMenu  'ignore";
 //BA.debugLineNum = 52;BA.debugLine="Menu.SetAttr(\"layout\", \"y\")";
_menu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("layout",(Object)("y"));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetSelect(b As Boolean) As WixMenu";
 //BA.debugLineNum = 104;BA.debugLine="Menu.SetProperty(\"select\", b)";
_menu._setproperty /*b4j.Mashy.BANanoWebix.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _setsubmenuposright(String _r) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetSubMenuPosRight(r As String) As WixMenu   '";
 //BA.debugLineNum = 22;BA.debugLine="Menu.SetAttr(\"subMenuPos\", \"right\")";
_menu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("subMenuPos",(Object)("right"));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetTooltip(tt As String) As WixMenu";
 //BA.debugLineNum = 34;BA.debugLine="Menu.SetTooltip(tt)";
_menu._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixmenu  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetWidth(w As Object) As WixMenu";
 //BA.debugLineNum = 46;BA.debugLine="Menu.SetAttr(\"width\", w)";
_menu._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixmenu)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
