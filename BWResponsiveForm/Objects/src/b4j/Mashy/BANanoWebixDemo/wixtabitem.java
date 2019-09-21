package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtabitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtabitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtabitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public String _vtitle = "";
public String _vicon = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _body = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _tabitem = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Private vTitle As String";
_vtitle = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vIcon As String";
_vicon = "";
 //BA.debugLineNum = 6;BA.debugLine="Public Body As WixElement";
_body = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="Public TabItem As WixElement";
_tabitem = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(sid As String) As WixTabItem";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="TabItem.Initialize(ID & \"tab\")";
_tabitem._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id+"tab");
 //BA.debugLineNum = 16;BA.debugLine="Body.Initialize(ID & \"body\")";
_body._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id+"body");
 //BA.debugLineNum = 17;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 101;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 102;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 103;BA.debugLine="If vIcon <> \"\" Then";
if ((_vicon).equals("") == false) { 
 //BA.debugLineNum = 104;BA.debugLine="sb.Append($\"<span class='webix_icon ${vIcon}'></";
_sb.Append(("<span class='webix_icon "+__c.SmartStringFormatter("",(Object)(_vicon))+"'></span>"));
 };
 //BA.debugLineNum = 106;BA.debugLine="If vTitle <> \"\" Then";
if ((_vtitle).equals("") == false) { 
 //BA.debugLineNum = 107;BA.debugLine="sb.Append(vTitle)";
_sb.Append(_vtitle);
 };
 //BA.debugLineNum = 109;BA.debugLine="TabItem.SetHeader(sb.ToString)";
_tabitem._setheader /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_sb.ToString()));
 //BA.debugLineNum = 110;BA.debugLine="TabItem.SetBody(Body.Item)";
_tabitem._setbody /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_body._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 111;BA.debugLine="Return TabItem.item";
if (true) return _tabitem._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 71;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 33;BA.debugLine="Sub SetAttributes(m As Map) As WixTabItem";
 //BA.debugLineNum = 34;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 35;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 36;BA.debugLine="TabItem.SetAttr(k,v)";
_tabitem._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _setbody(b4j.Mashy.BANanoWebixDemo.wixelement _b) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetBody(b As WixElement) As WixTabItem";
 //BA.debugLineNum = 83;BA.debugLine="Body = b";
_body = _b;
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _setclose(boolean _b) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetClose(b As Boolean) As WixTabItem";
 //BA.debugLineNum = 65;BA.debugLine="TabItem.SetAttr(\"close\", b)";
_tabitem._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("close",(Object)(_b));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetIcon(i As String) As WixTabItem";
 //BA.debugLineNum = 95;BA.debugLine="vIcon = i";
_vicon = _i;
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub SetMap(m As Map) As WixTabItem";
 //BA.debugLineNum = 117;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 118;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 119;BA.debugLine="TabItem.SetAttr(strKey,	strVal)";
_tabitem._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetMargin(margin As Object) As WixTabItem";
 //BA.debugLineNum = 29;BA.debugLine="TabItem.SetMargin(margin)";
_tabitem._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetPadding(padding As Object) As WixTabItem";
 //BA.debugLineNum = 23;BA.debugLine="TabItem.SetPadding(padding)";
_tabitem._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetParent(p As WixElement) As WixTabItem";
 //BA.debugLineNum = 58;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 51;BA.debugLine="TabItem.SetStyle(prop,sval)";
_tabitem._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 41;BA.debugLine="Sub SetStyles(m As Map) As WixTabItem";
 //BA.debugLineNum = 42;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 43;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 44;BA.debugLine="TabItem.SetStyle(k,v)";
_tabitem._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 74;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixTabItem";
 //BA.debugLineNum = 75;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 76;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 77;BA.debugLine="TabItem.SetTemplate(os)";
_tabitem._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabitem  _settitle(String _t) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetTitle(T As String) As WixTabItem";
 //BA.debugLineNum = 89;BA.debugLine="vTitle = T";
_vtitle = _t;
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtabitem)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
