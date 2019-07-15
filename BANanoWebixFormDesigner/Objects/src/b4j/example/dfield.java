package b4j.example;


import anywheresoftware.b4a.BA;

public class dfield extends Object{
public static dfield mostCurrent = new dfield();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.dfield", null);
		ba.loadHtSubs(dfield.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dfield", ba);
		}
	}
    public static Class<?> getObject() {
		return dfield.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
public static b4j.example.dbutton _dbutton = null;
public static b4j.example.modcenter _modcenter = null;
public static b4j.example.modsidebar _modsidebar = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.drow _drow = null;
public static b4j.example.dpager _dpager = null;
public static b4j.example.ddbllist _ddbllist = null;
public static b4j.example.dform _dform = null;
public static b4j.example.dcheckbox _dcheckbox = null;
public static b4j.example.dcolorpicker _dcolorpicker = null;
public static b4j.example.dcombo _dcombo = null;
public static b4j.example.dcounter _dcounter = null;
public static b4j.example.ddatepicker _ddatepicker = null;
public static b4j.example.dicon _dicon = null;
public static b4j.example.dlabel _dlabel = null;
public static b4j.example.dradio _dradio = null;
public static b4j.example.drichselect _drichselect = null;
public static b4j.example.dsearch _dsearch = null;
public static b4j.example.dselect _dselect = null;
public static b4j.example.dsegmented _dsegmented = null;
public static b4j.example.dslider _dslider = null;
public static b4j.example.dswitch _dswitch = null;
public static b4j.example.dtabbar _dtabbar = null;
public static b4j.example.dtext _dtext = null;
public static b4j.example.dtextarea _dtextarea = null;
public static b4j.example.dtoggle _dtoggle = null;
public static b4j.example.duploader _duploader = null;
public static b4j.example.dfieldset _dfieldset = null;
public static b4j.example.dsuggest _dsuggest = null;
public static b4j.example.dcolumn _dcolumn = null;
public static b4j.example.modpropertybag _modpropertybag = null;
public static b4j.example.ddesignerproperty _ddesignerproperty = null;
public static b4j.example.dconnection _dconnection = null;
public static b4j.example.dtable _dtable = null;
public static b4j.example.modwebix _modwebix = null;
public static String  _buildbag(b4j.example.wixpage _page,b4j.example.wixproperty _bag) throws Exception{
anywheresoftware.b4a.objects.collections.List _types = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub BuildBag(Page As WixPage, Bag As WixProperty)";
 //BA.debugLineNum = 7;BA.debugLine="Dim types As List";
_types = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="types.Initialize";
_types.Initialize();
 //BA.debugLineNum = 9;BA.debugLine="types.AddAll(Array(\"BOOL\", \"INT\", \"STRING\", \"REAL";
_types.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("BOOL"),(Object)("INT"),(Object)("STRING"),(Object)("REAL"),(Object)("DATE"),(Object)("BLOB"),(Object)("FLOAT")}));
 //BA.debugLineNum = 11;BA.debugLine="Bag.Clear";
_bag._clear /*String*/ ();
 //BA.debugLineNum = 12;BA.debugLine="Bag.AddTextBox(\"id\", \"ID\",\"field\")";
_bag._addtextbox /*String*/ ("id","ID","field");
 //BA.debugLineNum = 13;BA.debugLine="Bag.AddTextBox(\"value\", \"Field Name\",\"field1\")";
_bag._addtextbox /*String*/ ("value","Field Name","field1");
 //BA.debugLineNum = 14;BA.debugLine="Bag.AddCombo(\"type\", \"Field Type\",\"STRING\", types";
_bag._addcombo /*String*/ ("type","Field Type","STRING",_types);
 //BA.debugLineNum = 15;BA.debugLine="Bag.AddTextBox(\"length\", \"Field Length\",\"20\")";
_bag._addtextbox /*String*/ ("length","Field Length","20");
 //BA.debugLineNum = 16;BA.debugLine="Bag.AddLabel(\"Parent Table\")";
_bag._addlabel /*String*/ ("Parent Table");
 //BA.debugLineNum = 17;BA.debugLine="Bag.AddTextBox(\"tablename\", \"Table Name\", \"table\"";
_bag._addtextbox /*String*/ ("tablename","Table Name","table");
 //BA.debugLineNum = 18;BA.debugLine="Bag.Refresh(Page)";
_bag._refresh /*String*/ (_page);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
}
