package b4j.example;


import anywheresoftware.b4a.BA;

public class modtoolbar extends Object{
public static modtoolbar mostCurrent = new modtoolbar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtoolbar", null);
		ba.loadHtSubs(modtoolbar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtoolbar", ba);
		}
	}
    public static Class<?> getObject() {
		return modtoolbar.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgformdesigner _pgformdesigner = null;
public static b4j.example.modcenter _modcenter = null;
public static b4j.example.dbutton _dbutton = null;
public static b4j.example.modsidebar _modsidebar = null;
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
public static b4j.example.wixtoolbar  _gettoolbar() throws Exception{
b4j.example.wixtoolbar _tblbar = null;
 //BA.debugLineNum = 6;BA.debugLine="Sub getToolBar As WixToolBar";
 //BA.debugLineNum = 7;BA.debugLine="Dim tblBar As WixToolBar";
_tblbar = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 8;BA.debugLine="tblBar.Initialize(\"tblBar\").SetHeight(56)";
_tblbar._initialize /*b4j.example.wixtoolbar*/ (ba,"tblBar")._setheight /*b4j.example.wixtoolbar*/ ((int) (56));
 //BA.debugLineNum = 9;BA.debugLine="tblBar.CreateIcon(\"menuopen\").SetIcon(\"mdi mdi-me";
_tblbar._createicon /*b4j.example.wixicon*/ ("menuopen")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-menu"))._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"OpenMenu",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 10;BA.debugLine="tblBar.CreateLabel(\"heading\").SetLabel(\"BANanoWeb";
_tblbar._createlabel /*b4j.example.wixlabel*/ ("heading")._setlabel /*b4j.example.wixlabel*/ ("BANanoWebix - Form Designer")._pop /*String*/ ();
 //BA.debugLineNum = 11;BA.debugLine="tblBar.AddSpacer";
_tblbar._addspacer /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 13;BA.debugLine="tblBar.CreateIcon(\"refresh\").SetIcon(\"mdi mdi-ref";
_tblbar._createicon /*b4j.example.wixicon*/ ("refresh")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-refresh"))._settooltip /*b4j.example.wixicon*/ ("Refresh tree")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"refreshapp",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="tblBar.CreateIcon(\"help\").SetIcon(\"mdi mdi-help\")";
_tblbar._createicon /*b4j.example.wixicon*/ ("help")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-help"))._settooltip /*b4j.example.wixicon*/ ("Hints")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"showhints",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="tblBar.CreateIcon(\"collab\").SetIcon(\"mdi mdi-wech";
_tblbar._createicon /*b4j.example.wixicon*/ ("collab")._seticon /*b4j.example.wixicon*/ ((Object)("mdi mdi-wechat"))._settooltip /*b4j.example.wixicon*/ ("Collaborate")._setclick /*b4j.example.wixicon*/ ((com.ab.banano.BANanoObject)(_banano.CallBack((Object)(_pgformdesigner.getObject()),"collab",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._pop /*String*/ ();
 //BA.debugLineNum = 19;BA.debugLine="tblBar.setPadding(3)";
_tblbar._setpadding /*b4j.example.wixtoolbar*/ (BA.NumberToString(3));
 //BA.debugLineNum = 20;BA.debugLine="Return tblBar";
if (true) return _tblbar;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
}
