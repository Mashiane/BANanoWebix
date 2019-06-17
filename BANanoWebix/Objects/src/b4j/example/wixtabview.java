package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtabview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtabview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtabview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _tabview = null;
public b4j.example.main _main = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _additem(String _iid,String _header,String _template,anywheresoftware.b4a.objects.collections.Map _attributes) throws Exception{
b4j.example.wixelement _i = null;
String _astr = "";
String _vstr = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub AddItem(iid As String, header As String, templ";
 //BA.debugLineNum = 22;BA.debugLine="Dim i As WixElement";
_i = new b4j.example.wixelement();
 //BA.debugLineNum = 23;BA.debugLine="i.Initialize(iid)";
_i._initialize /*b4j.example.wixelement*/ (ba,_iid);
 //BA.debugLineNum = 24;BA.debugLine="i.SetHeader(header)";
_i._setheader /*b4j.example.wixelement*/ (_header);
 //BA.debugLineNum = 25;BA.debugLine="i.SetTemplate(template)";
_i._settemplate /*b4j.example.wixelement*/ (_template);
 //BA.debugLineNum = 26;BA.debugLine="If attributes <> Null Then";
if (_attributes!= null) { 
 //BA.debugLineNum = 27;BA.debugLine="For Each astr As String In attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _attributes.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_astr = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 28;BA.debugLine="Dim vstr As String = attributes.Get(astr)";
_vstr = BA.ObjectToString(_attributes.Get((Object)(_astr)));
 //BA.debugLineNum = 29;BA.debugLine="i.SetProperty(astr,vstr)";
_i._setproperty /*b4j.example.wixelement*/ (_astr,(Object)(_vstr));
 }
};
 };
 //BA.debugLineNum = 32;BA.debugLine="TabView.AddCells(i.Item)";
_tabview._addcells /*b4j.example.wixelement*/ (_i._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public TabView As WixElement";
_tabview = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtabview  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixTabView";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="TabView.Initialize(ID)";
_tabview._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 11;BA.debugLine="TabView.SetView(\"tabview\")";
_tabview._setview /*b4j.example.wixelement*/ ("tabview");
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtabview)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 17;BA.debugLine="Return TabView.item";
if (true) return _tabview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
