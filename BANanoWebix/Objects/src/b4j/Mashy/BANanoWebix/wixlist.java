package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixlist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixlist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebix.wixelement _list = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.Map _typeof = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _addtocolumn(b4j.Mashy.BANanoWebix.wixcolumn _c) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub AddToColumn(c As WixColumn)";
 //BA.debugLineNum = 37;BA.debugLine="c.AddItem(Item)";
_c._additem /*String*/ (_item());
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebix.wixform _frm) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 42;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public List As WixElement";
_list = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private typeOf As Map";
_typeof = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixlist  _initialize(anywheresoftware.b4a.BA _ba,String _lid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(lID As String) As WixList";
 //BA.debugLineNum = 10;BA.debugLine="ID = lID.tolowercase";
_id = _lid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="List.Initialize(ID).SetView(\"list\")";
_list._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("list");
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 84;BA.debugLine="List.SetAttr(\"type\", typeOf)";
_list._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("type",(Object)(_typeof.getObject()));
 //BA.debugLineNum = 85;BA.debugLine="Return List.item";
if (true) return _list._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixList";
 //BA.debugLineNum = 102;BA.debugLine="List.SetAttr(\"autoheight\", b)";
_list._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("autoheight",(Object)(_b));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixList";
 //BA.debugLineNum = 53;BA.debugLine="List.SetAttr(\"borderless\", b)";
_list._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("borderless",(Object)(_b));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setdata(anywheresoftware.b4a.objects.collections.List _t) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetData(t As List) As WixList";
 //BA.debugLineNum = 119;BA.debugLine="List.SetData(t)";
_list._setdata /*b4j.Mashy.BANanoWebix.wixelement*/ (_t);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setheight(Object _t) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetHeight(t As Object) As WixList";
 //BA.debugLineNum = 96;BA.debugLine="List.SetHeight(t)";
_list._setheight /*b4j.Mashy.BANanoWebix.wixelement*/ (_t);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setitemheight(Object _h) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetItemHeight(h As Object) As WixList";
 //BA.debugLineNum = 18;BA.debugLine="typeOf.Put(\"height\", h)";
_typeof.Put((Object)("height"),_h);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setitemwidth(Object _w) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetItemWidth(w As Object) As WixList";
 //BA.debugLineNum = 24;BA.debugLine="typeOf.Put(\"width\", w)";
_typeof.Put((Object)("width"),_w);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setmultiselect(boolean _b) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetMultiSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 65;BA.debugLine="List.SetAttr(\"multiselect\", b)";
_list._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("multiselect",(Object)(_b));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setpager(String _p) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetPager(p As String) As WixList";
 //BA.debugLineNum = 77;BA.debugLine="p = p.tolowercase";
_p = _p.toLowerCase();
 //BA.debugLineNum = 78;BA.debugLine="List.SetAttr(\"pager\", p)";
_list._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("pager",(Object)(_p));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setscroll(boolean _b) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetScroll(b As Boolean) As WixList";
 //BA.debugLineNum = 71;BA.debugLine="List.SetAttr(\"scroll\", b)";
_list._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("scroll",(Object)(_b));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetSelect(b As Boolean) As WixList";
 //BA.debugLineNum = 59;BA.debugLine="List.SetAttr(\"select\", b)";
_list._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("select",(Object)(_b));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _settemplate(String _t) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetTemplate(t As String) As WixList";
 //BA.debugLineNum = 90;BA.debugLine="List.SetTemplate(t)";
_list._settemplate /*b4j.Mashy.BANanoWebix.wixelement*/ ((Object)(_t));
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetTooltip(tt As String) As WixList";
 //BA.debugLineNum = 31;BA.debugLine="List.SetTooltip(tt)";
_list._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _settypeuploader(boolean _b) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetTypeUploader(b As Boolean) As WixList  'ign";
 //BA.debugLineNum = 107;BA.debugLine="List.SetType(\"uploader\")";
_list._settype /*b4j.Mashy.BANanoWebix.wixelement*/ ("uploader");
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetValue(v As String) As WixList";
 //BA.debugLineNum = 47;BA.debugLine="List.SetValue(v)";
_list._setvalue /*b4j.Mashy.BANanoWebix.wixelement*/ (_v);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixlist  _setwidth(Object _t) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetWidth(t As object) As WixList";
 //BA.debugLineNum = 113;BA.debugLine="List.SetWidth(t)";
_list._setwidth /*b4j.Mashy.BANanoWebix.wixelement*/ (_t);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixlist)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
