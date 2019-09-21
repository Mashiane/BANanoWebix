package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;

public class modarchivi extends Object{
public static modarchivi mostCurrent = new modarchivi();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.modarchivi", null);
		ba.loadHtSubs(modarchivi.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.Mashy.BANanoWebixDemo.modarchivi", ba);
		}
	}
    public static Class<?> getObject() {
		return modarchivi.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.Mashy.BANanoWebixDemo.wixpage _page = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.Mashy.BANanoWebixDemo.main _main = null;
public static b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public static b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public static b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public static b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public static String  _addpage(b4j.Mashy.BANanoWebixDemo.wixpage _pg,b4j.Mashy.BANanoWebixDemo.wixmultiview _mv) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixlayout _a = null;
 //BA.debugLineNum = 76;BA.debugLine="Sub AddPage(pg As WixPage, mv As WixMultiView)";
 //BA.debugLineNum = 77;BA.debugLine="Page = pg";
_page = _pg;
 //BA.debugLineNum = 79;BA.debugLine="Dim a As WixLayout";
_a = new b4j.Mashy.BANanoWebixDemo.wixlayout();
 //BA.debugLineNum = 80;BA.debugLine="a.Initialize(\"mv_companies\").SetTemplate(\"Almacen";
_a._initialize /*b4j.Mashy.BANanoWebixDemo.wixlayout*/ (ba,"mv_companies")._settemplate /*b4j.Mashy.BANanoWebixDemo.wixlayout*/ ("Almacena información de Compañías")._settypeline /*b4j.Mashy.BANanoWebixDemo.wixlayout*/ ("");
 //BA.debugLineNum = 82;BA.debugLine="a.AddRows(CreateForm.Item)";
_a._addrows /*String*/ (_createform()._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 84;BA.debugLine="mv.AddItem(a.Item)";
_mv._additem /*b4j.Mashy.BANanoWebixDemo.wixmultiview*/ (_a._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public static b4j.Mashy.BANanoWebixDemo.wixform  _createform() throws Exception{
b4j.Mashy.BANanoWebixDemo.wixform _formcompanies = null;
b4j.Mashy.BANanoWebixDemo.wixtext _code_company = null;
b4j.Mashy.BANanoWebixDemo.wixtext _name_company = null;
b4j.Mashy.BANanoWebixDemo.wixselect _code_zone = null;
b4j.Mashy.BANanoWebixDemo.wixtext _seqc_company = null;
b4j.Mashy.BANanoWebixDemo.wixtext _seqv_company = null;
b4j.Mashy.BANanoWebixDemo.wixtext _seqe_company = null;
b4j.Mashy.BANanoWebixDemo.wixswitch _active = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub CreateForm As WixForm";
 //BA.debugLineNum = 8;BA.debugLine="Dim formcompanies As WixForm";
_formcompanies = new b4j.Mashy.BANanoWebixDemo.wixform();
 //BA.debugLineNum = 9;BA.debugLine="formcompanies.Initialize(\"formcompanies\")";
_formcompanies._initialize /*b4j.Mashy.BANanoWebixDemo.wixform*/ (ba,"formcompanies");
 //BA.debugLineNum = 10;BA.debugLine="formcompanies.SetResponsive(True)";
_formcompanies._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixform*/ ((Object)(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 11;BA.debugLine="formcompanies.SetScroll(\"y\")";
_formcompanies._setscroll /*b4j.Mashy.BANanoWebixDemo.wixform*/ ((Object)("y"));
 //BA.debugLineNum = 12;BA.debugLine="formcompanies.SetName(\"formcompanies\")";
_formcompanies._setname /*b4j.Mashy.BANanoWebixDemo.wixform*/ ("formcompanies");
 //BA.debugLineNum = 13;BA.debugLine="formcompanies.SetResponsive(\"true\")";
_formcompanies._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixform*/ ((Object)("true"));
 //BA.debugLineNum = 14;BA.debugLine="formcompanies.SetDefaultLabelWidth(\"120\")";
_formcompanies._setdefaultlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixform*/ ((int)(Double.parseDouble("120")));
 //BA.debugLineNum = 15;BA.debugLine="formcompanies.SetDefaultLabelPosition(\"top\")";
_formcompanies._setdefaultlabelposition /*b4j.Mashy.BANanoWebixDemo.wixform*/ ("top");
 //BA.debugLineNum = 17;BA.debugLine="Dim code_company As WixText";
_code_company = new b4j.Mashy.BANanoWebixDemo.wixtext();
 //BA.debugLineNum = 18;BA.debugLine="code_company.Initialize(\"companies.code_company\")";
_code_company._initialize /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (ba,"companies.code_company");
 //BA.debugLineNum = 19;BA.debugLine="code_company.SetName(\"code_company\")";
_code_company._setname /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("code_company");
 //BA.debugLineNum = 20;BA.debugLine="code_company.SetType(\"text\")";
_code_company._settype /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("text");
 //BA.debugLineNum = 21;BA.debugLine="code_company.SetLabel(\"Código Compañía\")";
_code_company._setlabel /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("Código Compañía");
 //BA.debugLineNum = 22;BA.debugLine="code_company.SetHidden(True)";
_code_company._sethidden /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 23;BA.debugLine="formcompanies.AddRows(code_company.Item)";
_formcompanies._addrows /*String*/ (_code_company._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 25;BA.debugLine="Dim name_company As WixText";
_name_company = new b4j.Mashy.BANanoWebixDemo.wixtext();
 //BA.debugLineNum = 26;BA.debugLine="name_company.Initialize(\"companies.name_company\")";
_name_company._initialize /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (ba,"companies.name_company");
 //BA.debugLineNum = 27;BA.debugLine="name_company.SetName(\"name_company\")";
_name_company._setname /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("name_company");
 //BA.debugLineNum = 28;BA.debugLine="name_company.SetType(\"text\")";
_name_company._settype /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("text");
 //BA.debugLineNum = 29;BA.debugLine="name_company.SetLabel(\"Nombre Compañía\")";
_name_company._setlabel /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("Nombre Compañía");
 //BA.debugLineNum = 30;BA.debugLine="formcompanies.AddRows(name_company.Item)";
_formcompanies._addrows /*String*/ (_name_company._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 32;BA.debugLine="Dim code_zone As WixSelect";
_code_zone = new b4j.Mashy.BANanoWebixDemo.wixselect();
 //BA.debugLineNum = 33;BA.debugLine="code_zone.Initialize(\"companies.code_zone\")";
_code_zone._initialize /*b4j.Mashy.BANanoWebixDemo.wixselect*/ (ba,"companies.code_zone");
 //BA.debugLineNum = 34;BA.debugLine="code_zone.SetName(\"code_zone\")";
_code_zone._setname /*b4j.Mashy.BANanoWebixDemo.wixselect*/ ("code_zone");
 //BA.debugLineNum = 35;BA.debugLine="code_zone.SetLabel(\"Zona\")";
_code_zone._setlabel /*b4j.Mashy.BANanoWebixDemo.wixselect*/ ("Zona");
 //BA.debugLineNum = 36;BA.debugLine="formcompanies.AddRows(code_zone.Item)";
_formcompanies._addrows /*String*/ (_code_zone._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 38;BA.debugLine="Dim seqc_company As WixText";
_seqc_company = new b4j.Mashy.BANanoWebixDemo.wixtext();
 //BA.debugLineNum = 39;BA.debugLine="seqc_company.Initialize(\"companies.seqc_company\")";
_seqc_company._initialize /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (ba,"companies.seqc_company");
 //BA.debugLineNum = 40;BA.debugLine="seqc_company.SetName(\"seqc_company\")";
_seqc_company._setname /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("seqc_company");
 //BA.debugLineNum = 41;BA.debugLine="seqc_company.SetType(\"text\")";
_seqc_company._settype /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("text");
 //BA.debugLineNum = 42;BA.debugLine="seqc_company.SetFormat(\"1,111\")";
_seqc_company._setformat /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ((Object)("1,111"));
 //BA.debugLineNum = 43;BA.debugLine="seqc_company.SetLabel(\"Número de Solicitud Vehicu";
_seqc_company._setlabel /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("Número de Solicitud Vehiculos");
 //BA.debugLineNum = 44;BA.debugLine="formcompanies.AddRows(seqc_company.Item)";
_formcompanies._addrows /*String*/ (_seqc_company._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 46;BA.debugLine="Dim seqv_company As WixText";
_seqv_company = new b4j.Mashy.BANanoWebixDemo.wixtext();
 //BA.debugLineNum = 47;BA.debugLine="seqv_company.Initialize(\"companies.seqv_company\")";
_seqv_company._initialize /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (ba,"companies.seqv_company");
 //BA.debugLineNum = 48;BA.debugLine="seqv_company.SetName(\"seqv_company\")";
_seqv_company._setname /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("seqv_company");
 //BA.debugLineNum = 49;BA.debugLine="seqv_company.SetType(\"text\")";
_seqv_company._settype /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("text");
 //BA.debugLineNum = 50;BA.debugLine="seqv_company.SetFormat(\"1,111\")";
_seqv_company._setformat /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ((Object)("1,111"));
 //BA.debugLineNum = 51;BA.debugLine="seqv_company.SetLabel(\"Número de Solicitud Visita";
_seqv_company._setlabel /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("Número de Solicitud Visitantes");
 //BA.debugLineNum = 52;BA.debugLine="formcompanies.AddRows(seqv_company.Item)";
_formcompanies._addrows /*String*/ (_seqv_company._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 54;BA.debugLine="Dim seqe_company As WixText";
_seqe_company = new b4j.Mashy.BANanoWebixDemo.wixtext();
 //BA.debugLineNum = 55;BA.debugLine="seqe_company.Initialize(\"companies.seqe_company\")";
_seqe_company._initialize /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (ba,"companies.seqe_company");
 //BA.debugLineNum = 56;BA.debugLine="seqe_company.SetName(\"seqe_company\")";
_seqe_company._setname /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("seqe_company");
 //BA.debugLineNum = 57;BA.debugLine="seqe_company.SetType(\"text\")";
_seqe_company._settype /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("text");
 //BA.debugLineNum = 58;BA.debugLine="seqe_company.SetFormat(\"1,111\")";
_seqe_company._setformat /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ((Object)("1,111"));
 //BA.debugLineNum = 59;BA.debugLine="seqe_company.SetLabel(\"Número Pase de Salida\")";
_seqe_company._setlabel /*b4j.Mashy.BANanoWebixDemo.wixtext*/ ("Número Pase de Salida");
 //BA.debugLineNum = 60;BA.debugLine="formcompanies.AddRows(seqe_company.Item)";
_formcompanies._addrows /*String*/ (_seqe_company._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 62;BA.debugLine="Dim active As WixSwitch";
_active = new b4j.Mashy.BANanoWebixDemo.wixswitch();
 //BA.debugLineNum = 63;BA.debugLine="active.Initialize(\"companies.active\")";
_active._initialize /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ (ba,"companies.active");
 //BA.debugLineNum = 64;BA.debugLine="active.SetName(\"active\")";
_active._setname /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ ("active");
 //BA.debugLineNum = 65;BA.debugLine="active.SetLabel(\"Activo\")";
_active._setlabel /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ ("Activo");
 //BA.debugLineNum = 66;BA.debugLine="active.SetCheckValue(\"1\")";
_active._setcheckvalue /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ ((Object)("1"));
 //BA.debugLineNum = 67;BA.debugLine="active.setUnCheckValue(\"0\")";
_active._setuncheckvalue /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ ((Object)("0"));
 //BA.debugLineNum = 68;BA.debugLine="active.SetOffLabel(\"NO\")";
_active._setofflabel /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ ("NO");
 //BA.debugLineNum = 69;BA.debugLine="active.SetOnLabel(\"YES\")";
_active._setonlabel /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ ("YES");
 //BA.debugLineNum = 70;BA.debugLine="formcompanies.AddRows(active.Item)";
_formcompanies._addrows /*String*/ (_active._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 72;BA.debugLine="formcompanies.AddRowsSpacer(\"\")";
_formcompanies._addrowsspacer /*b4j.Mashy.BANanoWebixDemo.wixform*/ ("");
 //BA.debugLineNum = 73;BA.debugLine="Return formcompanies";
if (true) return _formcompanies;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Page As WixPage";
_page = new b4j.Mashy.BANanoWebixDemo.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _showpage(b4j.Mashy.BANanoWebixDemo.wixpage _pg) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub ShowPage(pg As WixPage)";
 //BA.debugLineNum = 88;BA.debugLine="Page = pg";
_page = _pg;
 //BA.debugLineNum = 89;BA.debugLine="Page.Show(\"mv_companies\")";
_page._show /*String*/ ("mv_companies");
 //BA.debugLineNum = 90;BA.debugLine="Page.Clear(\"formcompanies\")";
_page._clear /*String*/ ("formcompanies");
 //BA.debugLineNum = 91;BA.debugLine="Page.ClearValidation(\"formcompanies\")";
_page._clearvalidation /*String*/ ("formcompanies");
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
}
