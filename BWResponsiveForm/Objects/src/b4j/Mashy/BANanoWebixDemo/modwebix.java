package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;

public class modwebix extends Object{
public static modwebix mostCurrent = new modwebix();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.modwebix", null);
		ba.loadHtSubs(modwebix.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.Mashy.BANanoWebixDemo.modwebix", ba);
		}
	}
    public static Class<?> getObject() {
		return modwebix.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.Mashy.BANanoWebixDemo.main _main = null;
public static b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public static b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public static b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public static b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _unflatten(anywheresoftware.b4a.objects.collections.List _data,String _childname) throws Exception{
anywheresoftware.b4a.objects.collections.List _tree = null;
anywheresoftware.b4a.objects.collections.Map _mappedarr = null;
anywheresoftware.b4a.objects.collections.Map _arrelem = null;
String _did = "";
anywheresoftware.b4a.objects.collections.List _cdata = null;
anywheresoftware.b4a.objects.collections.Map _mappedelem = null;
String _parentid = "";
anywheresoftware.b4a.objects.collections.Map _parentelem = null;
anywheresoftware.b4a.objects.collections.List _children = null;
String _mk = "";
anywheresoftware.b4a.objects.collections.Map _mi = null;
anywheresoftware.b4a.objects.collections.List _childs = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub Unflatten(data As List, childname As String) A";
 //BA.debugLineNum = 8;BA.debugLine="Dim tree As List";
_tree = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="Dim mappedArr As Map";
_mappedarr = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="tree.Initialize";
_tree.Initialize();
 //BA.debugLineNum = 12;BA.debugLine="mappedArr.Initialize";
_mappedarr.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="For Each arrElem As Map In data";
_arrelem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _data;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_arrelem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
 //BA.debugLineNum = 16;BA.debugLine="Dim dID As String = arrElem.Get(\"id\")";
_did = BA.ObjectToString(_arrelem.Get((Object)("id")));
 //BA.debugLineNum = 18;BA.debugLine="Dim cdata As List";
_cdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="cdata.Initialize";
_cdata.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="arrElem.Put(childname, cdata)";
_arrelem.Put((Object)(_childname),(Object)(_cdata.getObject()));
 //BA.debugLineNum = 22;BA.debugLine="mappedArr.Put(dID, arrElem)";
_mappedarr.Put((Object)(_did),(Object)(_arrelem.getObject()));
 }
};
 //BA.debugLineNum = 25;BA.debugLine="For Each dID As String In mappedArr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group12 = _mappedarr.Keys();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_did = BA.ObjectToString(group12.Get(index12));
 //BA.debugLineNum = 26;BA.debugLine="Dim mappedElem As Map = mappedArr.Get(dID)";
_mappedelem = new anywheresoftware.b4a.objects.collections.Map();
_mappedelem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_did))));
 //BA.debugLineNum = 27;BA.debugLine="Dim parentid As String = mappedElem.Get(\"parenti";
_parentid = BA.ObjectToString(_mappedelem.Get((Object)("parentid")));
 //BA.debugLineNum = 29;BA.debugLine="If parentid = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 30;BA.debugLine="tree.Add(mappedElem)";
_tree.Add((Object)(_mappedelem.getObject()));
 }else {
 //BA.debugLineNum = 33;BA.debugLine="Dim parentElem As Map = mappedArr.Get(parentid)";
_parentelem = new anywheresoftware.b4a.objects.collections.Map();
_parentelem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_parentid))));
 //BA.debugLineNum = 34;BA.debugLine="Dim children As List = parentElem.Get(childname";
_children = new anywheresoftware.b4a.objects.collections.List();
_children.setObject((java.util.List)(_parentelem.Get((Object)(_childname))));
 //BA.debugLineNum = 35;BA.debugLine="children.Add(mappedElem)";
_children.Add((Object)(_mappedelem.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="parentElem.Put(childname, children)";
_parentelem.Put((Object)(_childname),(Object)(_children.getObject()));
 //BA.debugLineNum = 37;BA.debugLine="mappedArr.Put(parentid, parentElem)";
_mappedarr.Put((Object)(_parentid),(Object)(_parentelem.getObject()));
 };
 }
};
 //BA.debugLineNum = 41;BA.debugLine="For Each mk As String In mappedArr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group25 = _mappedarr.Keys();
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_mk = BA.ObjectToString(group25.Get(index25));
 //BA.debugLineNum = 42;BA.debugLine="Dim mi As Map = mappedArr.Get(mk)";
_mi = new anywheresoftware.b4a.objects.collections.Map();
_mi.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_mk))));
 //BA.debugLineNum = 43;BA.debugLine="Dim childs As List = mi.Get(childname)";
_childs = new anywheresoftware.b4a.objects.collections.List();
_childs.setObject((java.util.List)(_mi.Get((Object)(_childname))));
 //BA.debugLineNum = 44;BA.debugLine="If childs.Size = 0 Then mi.Remove(childname)";
if (_childs.getSize()==0) { 
_mi.Remove((Object)(_childname));};
 }
};
 //BA.debugLineNum = 46;BA.debugLine="Return tree";
if (true) return _tree;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
}
