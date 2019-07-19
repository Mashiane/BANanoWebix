package b4j.example;


import anywheresoftware.b4a.BA;

public class modcenter extends Object{
public static modcenter mostCurrent = new modcenter();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modcenter", null);
		ba.loadHtSubs(modcenter.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modcenter", ba);
		}
	}
    public static Class<?> getObject() {
		return modcenter.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
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
public static b4j.example.dtable _dtable = null;
public static b4j.example.dfield _dfield = null;
public static b4j.example.modwebix _modwebix = null;
public static b4j.example.wixrow  _getcenter() throws Exception{
b4j.example.wixrow _formholder = null;
b4j.example.wixaccordion _acc = null;
b4j.example.uoenowhtml _div = null;
b4j.example.wixelement _cel = null;
 //BA.debugLineNum = 5;BA.debugLine="Sub getCenter As WixRow";
 //BA.debugLineNum = 6;BA.debugLine="Dim formHolder As WixRow";
_formholder = new b4j.example.wixrow();
 //BA.debugLineNum = 7;BA.debugLine="formHolder.Initialize(\"formholder\")";
_formholder._initialize /*b4j.example.wixrow*/ (ba,"formholder");
 //BA.debugLineNum = 9;BA.debugLine="Dim acc As WixAccordion";
_acc = new b4j.example.wixaccordion();
 //BA.debugLineNum = 10;BA.debugLine="acc.Initialize(\"va\").SetTypeLine(True).SetMulti(T";
_acc._initialize /*b4j.example.wixaccordion*/ (ba,"va")._settypeline /*b4j.example.wixaccordion*/ (anywheresoftware.b4a.keywords.Common.True)._setmulti /*b4j.example.wixaccordion*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._setresponsive /*b4j.example.wixaccordion*/ ((Object)(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 12;BA.debugLine="Dim div As UOENowHTML";
_div = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 13;BA.debugLine="div.Initialize(\"previewit\",\"div\").SetStyle(\"width";
_div._initialize /*b4j.example.uoenowhtml*/ (ba,"previewit","div")._setstyle /*b4j.example.uoenowhtml*/ ("width","100%")._setstyle /*b4j.example.uoenowhtml*/ ("height","100%");
 //BA.debugLineNum = 15;BA.debugLine="Dim cel As WixElement";
_cel = new b4j.example.wixelement();
 //BA.debugLineNum = 16;BA.debugLine="cel.Initialize(\"codeit\").SetTemplate(\"No Code\").S";
_cel._initialize /*b4j.example.wixelement*/ (ba,"codeit")._settemplate /*b4j.example.wixelement*/ ((Object)("No Code"))._setscroll /*b4j.example.wixelement*/ ((Object)("y"));
 //BA.debugLineNum = 18;BA.debugLine="acc.AddItem(\"preview\",\"Preview\",div.html,False,Fa";
_acc._additem /*b4j.example.wixaccordion*/ ("preview",(Object)("Preview"),(Object)(_div._html /*String*/ ()),anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 19;BA.debugLine="acc.AddItem(\"code\",\"Source Code\",cel.item,False,F";
_acc._additem /*b4j.example.wixaccordion*/ ("code",(Object)("Source Code"),(Object)(_cel._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()),anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 21;BA.debugLine="formHolder.AddRows(acc.Item)";
_formholder._addrows /*b4j.example.wixrow*/ (_acc._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 22;BA.debugLine="Return formHolder";
if (true) return _formholder;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
}
