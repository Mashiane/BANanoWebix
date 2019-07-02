package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtabbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixtabbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixtabbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _tabbar = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _additem(String _iid,String _itext,String _iicon) throws Exception{
b4j.Mashy.BANanoWebix.uoenowhtml _icon = null;
b4j.Mashy.BANanoWebix.uoenowhtml _text = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 18;BA.debugLine="Sub AddItem(iID As String, iText As String, iIcon";
 //BA.debugLineNum = 19;BA.debugLine="iID = iID.tolowercase";
_iid = _iid.toLowerCase();
 //BA.debugLineNum = 21;BA.debugLine="Dim icon As UOENowHTML";
_icon = new b4j.Mashy.BANanoWebix.uoenowhtml();
 //BA.debugLineNum = 22;BA.debugLine="icon.Initialize(\"\",\"span\")";
_icon._initialize /*b4j.Mashy.BANanoWebix.uoenowhtml*/ (ba,"","span");
 //BA.debugLineNum = 23;BA.debugLine="icon.AddClass(\"webix_icon\")";
_icon._addclass /*b4j.Mashy.BANanoWebix.uoenowhtml*/ ("webix_icon");
 //BA.debugLineNum = 24;BA.debugLine="icon.AddClass(iIcon)";
_icon._addclass /*b4j.Mashy.BANanoWebix.uoenowhtml*/ (_iicon);
 //BA.debugLineNum = 26;BA.debugLine="Dim text As UOENowHTML";
_text = new b4j.Mashy.BANanoWebix.uoenowhtml();
 //BA.debugLineNum = 27;BA.debugLine="text.Initialize(\"\",\"span\")";
_text._initialize /*b4j.Mashy.BANanoWebix.uoenowhtml*/ (ba,"","span");
 //BA.debugLineNum = 28;BA.debugLine="text.SetStyle(\"padding-left\", \"4px\")";
_text._setstyle /*b4j.Mashy.BANanoWebix.uoenowhtml*/ ("padding-left","4px");
 //BA.debugLineNum = 29;BA.debugLine="text.AddContent(iText)";
_text._addcontent /*b4j.Mashy.BANanoWebix.uoenowhtml*/ (_itext);
 //BA.debugLineNum = 31;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 32;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="sb.Append(icon.HTML)";
_sb.Append(_icon._html /*String*/ ());
 //BA.debugLineNum = 34;BA.debugLine="sb.Append(text.HTML)";
_sb.Append(_text._html /*String*/ ());
 //BA.debugLineNum = 36;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 37;BA.debugLine="opt.Put(\"id\", iID)";
_opt.Put((Object)("id"),(Object)(_iid));
 //BA.debugLineNum = 38;BA.debugLine="opt.Put(\"value\", sb.ToString)";
_opt.Put((Object)("value"),(Object)(_sb.ToString()));
 //BA.debugLineNum = 39;BA.debugLine="options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TabBar As WixElement";
_tabbar = new b4j.Mashy.BANanoWebix.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.wixtabbar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(sid As String) As WixTabBar";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="TabBar.Initialize(ID)";
_tabbar._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id);
 //BA.debugLineNum = 12;BA.debugLine="TabBar.SetView(\"tabbar\")";
_tabbar._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("tabbar");
 //BA.debugLineNum = 13;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtabbar)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 71;BA.debugLine="TabBar.SetAttr(\"options\", options)";
_tabbar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 72;BA.debugLine="Return TabBar.item";
if (true) return _tabbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtabbar  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetAnimate(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 89;BA.debugLine="TabBar.SetAttr(\"animate\", b)";
_tabbar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("animate",(Object)(_b));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtabbar)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtabbar  _setfitbiggest(boolean _b) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetFitBiggest(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 83;BA.debugLine="TabBar.SetAttr(\"fitBiggest\", b)";
_tabbar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("fitBiggest",(Object)(_b));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtabbar)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtabbar  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetHeight(h As Object) As WixTabBar";
 //BA.debugLineNum = 52;BA.debugLine="TabBar.SetAttr(\"height\", h)";
_tabbar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtabbar)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtabbar  _setkeepviews(boolean _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetkeepViews(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 95;BA.debugLine="TabBar.SetAttr(\"keepViews\", b)";
_tabbar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("keepViews",(Object)(_b));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtabbar)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtabbar  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetMultiView(b As Boolean) As WixTabBar";
 //BA.debugLineNum = 77;BA.debugLine="TabBar.SetAttr(\"multiview\", b)";
_tabbar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("multiview",(Object)(_b));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtabbar)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtabbar  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetTooltip(tt As String) As WixTabBar";
 //BA.debugLineNum = 45;BA.debugLine="TabBar.SetTooltip(tt)";
_tabbar._settooltip /*b4j.Mashy.BANanoWebix.wixelement*/ (_tt);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtabbar)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtabbar  _settypebottom(boolean _b) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetTypeBottom(b As Boolean) As WixTabBar   'ig";
 //BA.debugLineNum = 65;BA.debugLine="TabBar.SetType(\"bottom\")";
_tabbar._settype /*b4j.Mashy.BANanoWebix.wixelement*/ ("bottom");
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtabbar)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixtabbar  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetWidth(w As Object) As WixTabBar";
 //BA.debugLineNum = 58;BA.debugLine="TabBar.SetAttr(\"width\", w)";
_tabbar._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixtabbar)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
