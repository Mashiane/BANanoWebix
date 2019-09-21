package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixhint extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixhint", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixhint.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _hint = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixhint  _addstep(String _elid,String _stitle,String _stext,String _sevent) throws Exception{
anywheresoftware.b4a.objects.collections.Map _h = null;
 //BA.debugLineNum = 59;BA.debugLine="Sub AddStep(elID As String, stitle As String, stex";
 //BA.debugLineNum = 60;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 61;BA.debugLine="Dim h As Map = CreateMap()";
_h = new anywheresoftware.b4a.objects.collections.Map();
_h = __c.createMap(new Object[] {});
 //BA.debugLineNum = 62;BA.debugLine="h.Put(\"el\", elID)";
_h.Put((Object)("el"),(Object)(_elid));
 //BA.debugLineNum = 63;BA.debugLine="h.Put(\"title\", stitle)";
_h.Put((Object)("title"),(Object)(_stitle));
 //BA.debugLineNum = 64;BA.debugLine="h.Put(\"text\", stext)";
_h.Put((Object)("text"),(Object)(_stext));
 //BA.debugLineNum = 65;BA.debugLine="h.Put(\"event\", sevent)";
_h.Put((Object)("event"),(Object)(_sevent));
 //BA.debugLineNum = 66;BA.debugLine="Items.Add(h)";
_items.Add((Object)(_h.getObject()));
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Hint As WixElement";
_hint = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 46;BA.debugLine="Public Sub Initialize(sid As String) As WixHint";
 //BA.debugLineNum = 47;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 48;BA.debugLine="Hint.Initialize(ID).SetView(\"hint\")";
_hint._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hint");
 //BA.debugLineNum = 49;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 50;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 89;BA.debugLine="Hint.SetAttr(\"steps\", Items)";
_hint._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("steps",(Object)(_items.getObject()));
 //BA.debugLineNum = 90;BA.debugLine="Return Hint.item";
if (true) return _hint._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 56;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetAttributes(m As Map) As WixHint";
 //BA.debugLineNum = 30;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 31;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 32;BA.debugLine="Hint.SetAttr(k,v)";
_hint._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _setleft(Object _l) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetLeft(l As Object) As WixHint";
 //BA.debugLineNum = 84;BA.debugLine="Hint.SetAttr(\"left\", l)";
_hint._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("left",_l);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetMargin(margin As Object) As WixHint";
 //BA.debugLineNum = 25;BA.debugLine="Hint.SetMargin(margin)";
_hint._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _setnextbutton(Object _n) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetNextButton(n As Object) As WixHint";
 //BA.debugLineNum = 95;BA.debugLine="Hint.SetAttr(\"nextButton\", n)";
_hint._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("nextButton",_n);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetPadding(padding As Object) As WixHint";
 //BA.debugLineNum = 19;BA.debugLine="Hint.SetPadding(padding)";
_hint._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _setprevbutton(Object _b) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetPrevButton(b As Object) As WixHint";
 //BA.debugLineNum = 101;BA.debugLine="Hint.SetAttr(\"prevButton\", b)";
_hint._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("prevButton",_b);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 13;BA.debugLine="Hint.SetStyle(prop,sval)";
_hint._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 37;BA.debugLine="Sub SetStyles(m As Map) As WixHint";
 //BA.debugLineNum = 38;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 39;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 40;BA.debugLine="Hint.SetStyle(k,v)";
_hint._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixHint";
 //BA.debugLineNum = 72;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 73;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="Hint.SetTemplate(os)";
_hint._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixhint  _settop(Object _t) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetTop(t As Object) As WixHint";
 //BA.debugLineNum = 79;BA.debugLine="Hint.SetAttr(\"top\", t)";
_hint._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("top",_t);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixhint)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
