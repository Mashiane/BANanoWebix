package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;

public class modsidebar extends Object{
public static modsidebar mostCurrent = new modsidebar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.modsidebar", null);
		ba.loadHtSubs(modsidebar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.Mashy.BANanoWebixDemo.modsidebar", ba);
		}
	}
    public static Class<?> getObject() {
		return modsidebar.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.Mashy.BANanoWebixDemo.wixsidebar _sm = null;
public static b4j.Mashy.BANanoWebixDemo.wixpage _page = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.Mashy.BANanoWebixDemo.main _main = null;
public static b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public static b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public static b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public static b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public static anywheresoftware.b4a.objects.collections.Map  _create(b4j.Mashy.BANanoWebixDemo.wixpage _pg) throws Exception{
String _meid = "";
 //BA.debugLineNum = 10;BA.debugLine="Sub Create(pg As WixPage) As Map";
 //BA.debugLineNum = 11;BA.debugLine="Dim meid As String";
_meid = "";
 //BA.debugLineNum = 12;BA.debugLine="Page = pg";
_page = _pg;
 //BA.debugLineNum = 13;BA.debugLine="sm.Initialize(\"sb\")";
_sm._initialize /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ (ba,"sb");
 //BA.debugLineNum = 14;BA.debugLine="sm.SetCollapsed(False)";
_sm._setcollapsed /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 15;BA.debugLine="sm.SetActiveTitle(True)";
_sm._setactivetitle /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 17;BA.debugLine="sm.SideBar.OnAfterSelect(BANano.CallBack(Me, \"sm_";
_sm._sidebar /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ._onafterselect /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(modsidebar.getObject(),"sm_click",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_meid)}))));
 //BA.debugLineNum = 18;BA.debugLine="sm.AddItem(\"\", \"archivi\", \"Archivi\",\"\",\"mdi mdi-d";
_sm._additem /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ ("","archivi","Archivi","","mdi mdi-database","","");
 //BA.debugLineNum = 19;BA.debugLine="sm.AddItem(\"archivi\", \"arc_clienti\", \"Clienti\",\"\"";
_sm._additem /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ ("archivi","arc_clienti","Clienti","","","","");
 //BA.debugLineNum = 20;BA.debugLine="sm.AddItem(\"archivi\", \"arc_prodotti\", \"Prodotti\",";
_sm._additem /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ ("archivi","arc_prodotti","Prodotti","","","","");
 //BA.debugLineNum = 21;BA.debugLine="sm.AddItem(\"\", \"settings\", \"Settings\",\"\",\"mdi mdi";
_sm._additem /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ ("","settings","Settings","","mdi mdi-settings","","");
 //BA.debugLineNum = 22;BA.debugLine="sm.AddItem(\"settings\", \"utility_backup\", \"Backup";
_sm._additem /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ ("settings","utility_backup","Backup Files","","","","");
 //BA.debugLineNum = 23;BA.debugLine="sm.AddItem(\"settings\", \"utility_restore\", \"Restor";
_sm._additem /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ ("settings","utility_restore","Restore Backup","","","","");
 //BA.debugLineNum = 24;BA.debugLine="Return sm.item";
if (true) return _sm._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private sm As WixSideBar";
_sm = new b4j.Mashy.BANanoWebixDemo.wixsidebar();
 //BA.debugLineNum = 4;BA.debugLine="Private Page As WixPage";
_page = new b4j.Mashy.BANanoWebixDemo.wixpage();
 //BA.debugLineNum = 5;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _sm_click(String _meid) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub sm_click(meid As String)";
 //BA.debugLineNum = 28;BA.debugLine="Select Case meid";
switch (BA.switchObjectToInt(_meid,"arc_clienti","arc_prodotti","utility_backup","utility_restore")) {
case 0: {
 //BA.debugLineNum = 30;BA.debugLine="modClient.ShowPage(Page)";
_modclient._showpage /*String*/ (_page);
 break; }
case 1: {
 //BA.debugLineNum = 32;BA.debugLine="modArchivi.ShowPage(Page)";
_modarchivi._showpage /*String*/ (_page);
 break; }
case 2: {
 break; }
case 3: {
 break; }
}
;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
}
