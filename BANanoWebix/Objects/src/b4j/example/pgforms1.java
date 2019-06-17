package b4j.example;


import anywheresoftware.b4a.BA;

public class pgforms1 extends Object{
public static pgforms1 mostCurrent = new pgforms1();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgforms1", null);
		ba.loadHtSubs(pgforms1.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgforms1", ba);
		}
	}
    public static Class<?> getObject() {
		return pgforms1.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixform _myform = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgforms _pgforms = null;
public static b4j.example.pgtoolbar _pgtoolbar = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgmultiview _pgmultiview = null;
public static b4j.example.pglayouts1 _pglayouts1 = null;
public static b4j.example.pglayouts2 _pglayouts2 = null;
public static b4j.example.pglayouts _pglayouts = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pglayout _pglayout = null;
public static String  _backtomain() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub backtomain";
 //BA.debugLineNum = 106;BA.debugLine="pgIndex.Init";
_pgindex._init /*String*/ ();
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public static String  _hideit() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub hideit()";
 //BA.debugLineNum = 102;BA.debugLine="pg.HideIt(\"sect\")";
_pg._hideit /*String*/ ("sect");
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.wixheader _hdr = null;
b4j.example.wixtoolbar _tblbar = null;
b4j.example.wixbutton _btnback = null;
b4j.example.wixbutton _btnibt = null;
b4j.example.wixbutton _btnshow = null;
anywheresoftware.b4a.objects.collections.List _fruit = null;
anywheresoftware.b4a.objects.collections.List _countries = null;
b4j.example.wixsuggest _suggest = null;
b4j.example.wixbutton _btnb = null;
b4j.example.wixsection _sect = null;
b4j.example.wixlabel _lbl = null;
b4j.example.wixsegmented _seg = null;
b4j.example.wixdatetimepicker _dt = null;
b4j.example.wixcolorpicker _cp = null;
b4j.example.wixtextbox _txtcountries = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Init()";
 //BA.debugLineNum = 10;BA.debugLine="pg.Initialize(\"forms1\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms1");
 //BA.debugLineNum = 12;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 13;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 15;BA.debugLine="Dim hdr As WixHeader";
_hdr = new b4j.example.wixheader();
 //BA.debugLineNum = 16;BA.debugLine="hdr.Initialize(\"hdr\")";
_hdr._initialize /*b4j.example.wixheader*/ (ba,"hdr");
 //BA.debugLineNum = 17;BA.debugLine="hdr.header.SetTemplate(\"Webix Form 2\")";
_hdr._header /*b4j.example.wixelement*/ ._settemplate /*b4j.example.wixelement*/ ("Webix Form 2");
 //BA.debugLineNum = 18;BA.debugLine="R1.AddItem(hdr.Item)";
_r1._additem /*b4j.example.wixrow*/ (_hdr._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 20;BA.debugLine="Dim tblBar As WixToolBar";
_tblbar = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 21;BA.debugLine="tblBar.Initialize(\"tblBar\")";
_tblbar._initialize /*b4j.example.wixtoolbar*/ (ba,"tblBar");
 //BA.debugLineNum = 23;BA.debugLine="Dim btnBack As WixButton";
_btnback = new b4j.example.wixbutton();
 //BA.debugLineNum = 24;BA.debugLine="btnBack.Initialize(\"btnBack\").SetLabel(\"Back\").Se";
_btnback._initialize /*b4j.example.wixbutton*/ (ba,"btnBack")._setlabel /*b4j.example.wixbutton*/ ("Back")._setwidth /*b4j.example.wixbutton*/ ((int) (100))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgforms1.getObject(),"backtomain",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 25;BA.debugLine="tblBar.AddButton(btnBack)";
_tblbar._addbutton /*b4j.example.wixtoolbar*/ (_btnback);
 //BA.debugLineNum = 27;BA.debugLine="Dim btnIBT As WixButton";
_btnibt = new b4j.example.wixbutton();
 //BA.debugLineNum = 28;BA.debugLine="btnIBT.Initialize(\"btnIBT\").SetWidth(100).SetHeig";
_btnibt._initialize /*b4j.example.wixbutton*/ (ba,"btnIBT")._setwidth /*b4j.example.wixbutton*/ ((int) (100))._setheight /*b4j.example.wixbutton*/ ((int) (80))._seticon /*b4j.example.wixbutton*/ ("wxi-download")._settypeiconbuttontop /*b4j.example.wixbutton*/ ("")._setlabel /*b4j.example.wixbutton*/ ("Hide");
 //BA.debugLineNum = 29;BA.debugLine="btnIBT.SetClick( BANano.CallBack(Me, \"hideit\",Nul";
_btnibt._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgforms1.getObject(),"hideit",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 31;BA.debugLine="Dim btnShow As WixButton";
_btnshow = new b4j.example.wixbutton();
 //BA.debugLineNum = 32;BA.debugLine="btnShow.Initialize(\"btnShow\").SetWidth(100).SetHe";
_btnshow._initialize /*b4j.example.wixbutton*/ (ba,"btnShow")._setwidth /*b4j.example.wixbutton*/ ((int) (100))._setheight /*b4j.example.wixbutton*/ ((int) (80))._seticon /*b4j.example.wixbutton*/ ("wxi-download")._settypeiconbuttontop /*b4j.example.wixbutton*/ ("")._setlabel /*b4j.example.wixbutton*/ ("Show");
 //BA.debugLineNum = 33;BA.debugLine="btnShow.SetClick( BANano.CallBack(Me, \"showit\",Nu";
_btnshow._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgforms1.getObject(),"showit",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 35;BA.debugLine="R1.AddItem(tblBar.Item)";
_r1._additem /*b4j.example.wixrow*/ (_tblbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 37;BA.debugLine="Dim fruit As List";
_fruit = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 38;BA.debugLine="fruit.Initialize";
_fruit.Initialize();
 //BA.debugLineNum = 39;BA.debugLine="fruit.Add(CreateMap(\"id\":1, \"value\": \"Apple\"))";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("value"),(Object)("Apple")}).getObject()));
 //BA.debugLineNum = 40;BA.debugLine="fruit.Add(CreateMap(\"id\":2, \"value\": \"Banana\"))";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("value"),(Object)("Banana")}).getObject()));
 //BA.debugLineNum = 41;BA.debugLine="fruit.Add(CreateMap(\"id\":3, \"value\": \"Kiwi\"))";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("value"),(Object)("Kiwi")}).getObject()));
 //BA.debugLineNum = 42;BA.debugLine="fruit.Add(CreateMap(\"id\":4, \"value\": \"Pineapple\")";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("value"),(Object)("Pineapple")}).getObject()));
 //BA.debugLineNum = 43;BA.debugLine="fruit.Add(CreateMap(\"id\":5, \"value\": \"Grapes\"))";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(5),(Object)("value"),(Object)("Grapes")}).getObject()));
 //BA.debugLineNum = 46;BA.debugLine="Dim countries As List";
_countries = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 47;BA.debugLine="countries.Initialize";
_countries.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="countries.add(CreateMap(\"id\":1, \"value\": \"Albania";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("value"),(Object)("Albania")}).getObject()));
 //BA.debugLineNum = 49;BA.debugLine="countries.Add(CreateMap(\"id\":2, \"value\": \"Bhutan\"";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("value"),(Object)("Bhutan")}).getObject()));
 //BA.debugLineNum = 50;BA.debugLine="countries.Add(CreateMap(\"id\":3, \"value\": \"Colombi";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("value"),(Object)("Colombia")}).getObject()));
 //BA.debugLineNum = 51;BA.debugLine="countries.Add(CreateMap(\"id\":4, \"value\": \"Denmark";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("value"),(Object)("Denmark")}).getObject()));
 //BA.debugLineNum = 52;BA.debugLine="countries.Add(CreateMap(\"id\":5, \"value\": \"Germany";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(5),(Object)("value"),(Object)("Germany")}).getObject()));
 //BA.debugLineNum = 53;BA.debugLine="countries.Add(CreateMap(\"id\":6, \"value\": \"Moldova";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(6),(Object)("value"),(Object)("Moldova")}).getObject()));
 //BA.debugLineNum = 55;BA.debugLine="Dim suggest As WixSuggest";
_suggest = new b4j.example.wixsuggest();
 //BA.debugLineNum = 56;BA.debugLine="suggest.Initialize(pg, \"countries\").SetData(count";
_suggest._initialize /*b4j.example.wixsuggest*/ (ba,_pg,"countries")._setdata /*b4j.example.wixsuggest*/ (_countries);
 //BA.debugLineNum = 57;BA.debugLine="suggest.UI";
_suggest._ui /*String*/ ();
 //BA.debugLineNum = 60;BA.debugLine="myForm.Initialize(pg, \"mashform1\").SetWidth(500)";
_myform._initialize /*b4j.example.wixform*/ (ba,_pg,"mashform1")._setwidth /*b4j.example.wixform*/ ((int) (500));
 //BA.debugLineNum = 62;BA.debugLine="Dim btnB As WixButton";
_btnb = new b4j.example.wixbutton();
 //BA.debugLineNum = 63;BA.debugLine="btnB.Initialize(\"btnB\").SetLabel(\"Back\").SetClick";
_btnb._initialize /*b4j.example.wixbutton*/ (ba,"btnB")._setlabel /*b4j.example.wixbutton*/ ("Back")._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgforms1.getObject(),"backtomain",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 64;BA.debugLine="myForm.AddItem(btnB.Item)";
_myform._additem /*String*/ (_btnb._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 66;BA.debugLine="Dim sect As WixSection";
_sect = new b4j.example.wixsection();
 //BA.debugLineNum = 67;BA.debugLine="sect.Initialize(\"sect\").SetTemplate(\"This is my s";
_sect._initialize /*b4j.example.wixsection*/ (ba,"sect")._settemplate /*b4j.example.wixsection*/ ("This is my section");
 //BA.debugLineNum = 68;BA.debugLine="myForm.AddItem(sect.Item)";
_myform._additem /*String*/ (_sect._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 70;BA.debugLine="Dim lbl As WixLabel";
_lbl = new b4j.example.wixlabel();
 //BA.debugLineNum = 71;BA.debugLine="lbl.Initialize(\"lbl\").SetLabel(\"This is my label\"";
_lbl._initialize /*b4j.example.wixlabel*/ (ba,"lbl")._setlabel /*b4j.example.wixlabel*/ ("This is my label");
 //BA.debugLineNum = 72;BA.debugLine="myForm.AddItem(lbl.Item)";
_myform._additem /*String*/ (_lbl._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 74;BA.debugLine="Dim seg As WixSegmented";
_seg = new b4j.example.wixsegmented();
 //BA.debugLineNum = 75;BA.debugLine="seg.Initialize(\"seq\").SetOptions(fruit)";
_seg._initialize /*b4j.example.wixsegmented*/ (ba,"seq")._setoptions /*b4j.example.wixsegmented*/ (_fruit);
 //BA.debugLineNum = 76;BA.debugLine="myForm.AddItem(seg.Item)";
_myform._additem /*String*/ (_seg._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 78;BA.debugLine="Dim dt As WixDateTimePicker";
_dt = new b4j.example.wixdatetimepicker();
 //BA.debugLineNum = 79;BA.debugLine="dt.Initialize(\"dt\").SetLabel(\"Date Picker\").SetTi";
_dt._initialize /*b4j.example.wixdatetimepicker*/ (ba,"dt")._setlabel /*b4j.example.wixdatetimepicker*/ ("Date Picker")._settimepicker /*b4j.example.wixdatetimepicker*/ (anywheresoftware.b4a.keywords.Common.True)._setformat /*b4j.example.wixdatetimepicker*/ ("%d %M %Y at %H:%i")._setlabelwidth /*b4j.example.wixdatetimepicker*/ ((int) (100));
 //BA.debugLineNum = 80;BA.debugLine="myForm.AddItem(dt.Item)";
_myform._additem /*String*/ (_dt._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 82;BA.debugLine="Dim cp As WixColorPicker";
_cp = new b4j.example.wixcolorpicker();
 //BA.debugLineNum = 83;BA.debugLine="cp.Initialize(\"cp\").SetLabel(\"Color Picker\").SetV";
_cp._initialize /*b4j.example.wixcolorpicker*/ (ba,"cp")._setlabel /*b4j.example.wixcolorpicker*/ ("Color Picker")._setvalue /*b4j.example.wixcolorpicker*/ ("#0000ff")._setlabelwidth /*b4j.example.wixcolorpicker*/ ((int) (100));
 //BA.debugLineNum = 84;BA.debugLine="myForm.AddItem(cp.Item)";
_myform._additem /*String*/ (_cp._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 86;BA.debugLine="Dim txtcountries As WixTextBox";
_txtcountries = new b4j.example.wixtextbox();
 //BA.debugLineNum = 87;BA.debugLine="txtcountries.Initialize(\"txtCountries\").SetSugges";
_txtcountries._initialize /*b4j.example.wixtextbox*/ (ba,"txtCountries")._setsuggest /*b4j.example.wixtextbox*/ ("countries")._setlabel /*b4j.example.wixtextbox*/ ("Countries");
 //BA.debugLineNum = 88;BA.debugLine="myForm.AddItem(txtcountries.Item)";
_myform._additem /*String*/ (_txtcountries._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 90;BA.debugLine="R1.AddItem(myForm.Item)";
_r1._additem /*b4j.example.wixrow*/ (_myform._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 91;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 93;BA.debugLine="pg.UI";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 5;BA.debugLine="Public myForm As WixForm";
_myform = new b4j.example.wixform();
 //BA.debugLineNum = 6;BA.debugLine="Public BANano As BANano  ' ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _showit() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub showit()";
 //BA.debugLineNum = 98;BA.debugLine="pg.ShowIt(\"sect\")";
_pg._showit /*String*/ ("sect");
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
}
