package b4j.example;


import anywheresoftware.b4a.BA;

public class dtable extends Object{
public static dtable mostCurrent = new dtable();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.dtable", null);
		ba.loadHtSubs(dtable.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dtable", ba);
		}
	}
    public static Class<?> getObject() {
		return dtable.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
public static b4j.example.modcenter _modcenter = null;
public static b4j.example.dbutton _dbutton = null;
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
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static String  _buildbag(b4j.example.wixpage _page,b4j.example.wixproperty _bag) throws Exception{
anywheresoftware.b4a.objects.collections.List _types = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub BuildBag(Page As WixPage, Bag As WixProperty)";
 //BA.debugLineNum = 8;BA.debugLine="Dim types As List";
_types = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="types.Initialize";
_types.Initialize();
 //BA.debugLineNum = 10;BA.debugLine="types.AddAll(Array(\"BOOL\", \"INT\", \"STRING\", \"BLOB";
_types.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("BOOL"),(Object)("INT"),(Object)("STRING"),(Object)("BLOB")}));
 //BA.debugLineNum = 12;BA.debugLine="Bag.Clear";
_bag._clear /*b4j.example.wixproperty*/ ();
 //BA.debugLineNum = 13;BA.debugLine="Bag.AddTextBox(\"id\", \"ID\",\"table\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("id","ID","table");
 //BA.debugLineNum = 14;BA.debugLine="Bag.AddTextBox(\"value\", \"Table Name\",\"table1\")";
_bag._addtextbox /*b4j.example.wixproperty*/ ("value","Table Name","table1");
 //BA.debugLineNum = 15;BA.debugLine="Bag.AddTextBox(\"primarykey\", \"Primary Field\", \"id";
_bag._addtextbox /*b4j.example.wixproperty*/ ("primarykey","Primary Field","id");
 //BA.debugLineNum = 16;BA.debugLine="Bag.AddCombo(\"type\", \"Field Type\",\"INT\", types)";
_bag._addcombo /*b4j.example.wixproperty*/ ("type","Field Type","INT",_types);
 //BA.debugLineNum = 17;BA.debugLine="Bag.AddCheckBox(\"autoincrement\", \"Auto Increment\"";
_bag._addcheckbox /*b4j.example.wixproperty*/ ("autoincrement","Auto Increment",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False));
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