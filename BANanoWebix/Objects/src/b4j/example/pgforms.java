package b4j.example;


import anywheresoftware.b4a.BA;

public class pgforms extends Object{
public static pgforms mostCurrent = new pgforms();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgforms", null);
		ba.loadHtSubs(pgforms.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgforms", ba);
		}
	}
    public static Class<?> getObject() {
		return pgforms.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixform _myform = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgtabbar _pgtabbar = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgdataview _pgdataview = null;
public static b4j.example.pgdatatable1 _pgdatatable1 = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pgcharts _pgcharts = null;
public static b4j.example.pgdataentry _pgdataentry = null;
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgtoolbar _pgtoolbar = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgmultiview _pgmultiview = null;
public static b4j.example.pglayouts1 _pglayouts1 = null;
public static b4j.example.pglayouts2 _pglayouts2 = null;
public static b4j.example.pglayouts _pglayouts = null;
public static b4j.example.pglayout _pglayout = null;
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static b4j.example.pgsidebar _pgsidebar = null;
public static b4j.example.pgcomments _pgcomments = null;
public static b4j.example.pggrouplist _pggrouplist = null;
public static b4j.example.pgcontext _pgcontext = null;
public static b4j.example.pggooglemap _pggooglemap = null;
public static b4j.example.pguploader1 _pguploader1 = null;
public static b4j.example.pguploader2 _pguploader2 = null;
public static b4j.example.pguploader3 _pguploader3 = null;
public static String  _backtomain() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub backtomain";
 //BA.debugLineNum = 103;BA.debugLine="pgIndex.Init";
_pgindex._init /*String*/ ();
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public static String  _cbo_change(String _newv,String _oldv) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub cbo_change(newV As String, oldV As String)";
 //BA.debugLineNum = 99;BA.debugLine="pg.Message($\"Combo changed from ${oldV} to ${newV";
_pg._message /*String*/ (("Combo changed from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_oldv))+" to "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newv))+""));
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.wixheader _hdr = null;
b4j.example.wixbutton _btnb = null;
anywheresoftware.b4a.objects.collections.List _fruit = null;
b4j.example.wixcombo _cbo = null;
b4j.example.wixtextbox _txtbox = null;
b4j.example.wixtextbox _pwd = null;
b4j.example.wixtextarea _txta = null;
b4j.example.wixcheckbox _cb = null;
b4j.example.wixcheckbox _cb1 = null;
b4j.example.wixradio _ro = null;
b4j.example.wixradio _ro1 = null;
b4j.example.wixcounter _stepon = null;
String _n = "";
String _o = "";
com.ab.banano.BANanoObject _cbe = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Init()";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"forms\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"forms");
 //BA.debugLineNum = 11;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 12;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 14;BA.debugLine="Dim hdr As WixHeader";
_hdr = new b4j.example.wixheader();
 //BA.debugLineNum = 15;BA.debugLine="hdr.Initialize(\"hdr\")";
_hdr._initialize /*b4j.example.wixheader*/ (ba,"hdr");
 //BA.debugLineNum = 16;BA.debugLine="hdr.Header.SetTemplate(\"Webix Forms: 1\")";
_hdr._header /*b4j.example.wixelement*/ ._settemplate /*b4j.example.wixelement*/ ((Object)("Webix Forms: 1"));
 //BA.debugLineNum = 17;BA.debugLine="R1.AddItem(hdr.Item)";
_r1._additem /*b4j.example.wixrow*/ (_hdr._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 19;BA.debugLine="Dim btnB As WixButton";
_btnb = new b4j.example.wixbutton();
 //BA.debugLineNum = 20;BA.debugLine="btnB.Initialize(\"btnB\").SetLabel(\"Back\").SetClick";
_btnb._initialize /*b4j.example.wixbutton*/ (ba,"btnB")._setlabel /*b4j.example.wixbutton*/ ("Back")._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgforms.getObject(),"backtomain",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 21;BA.debugLine="R1.AddItem(btnB.Item)";
_r1._additem /*b4j.example.wixrow*/ (_btnb._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 23;BA.debugLine="Dim fruit As List";
_fruit = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 24;BA.debugLine="fruit.Initialize";
_fruit.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="fruit.Add(CreateMap(\"id\":1, \"value\": \"Apple\"))";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("value"),(Object)("Apple")}).getObject()));
 //BA.debugLineNum = 26;BA.debugLine="fruit.Add(CreateMap(\"id\":2, \"value\": \"Banana\"))";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("value"),(Object)("Banana")}).getObject()));
 //BA.debugLineNum = 27;BA.debugLine="fruit.Add(CreateMap(\"id\":3, \"value\": \"Kiwi\"))";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("value"),(Object)("Kiwi")}).getObject()));
 //BA.debugLineNum = 28;BA.debugLine="fruit.Add(CreateMap(\"id\":4, \"value\": \"Pineapple\")";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("value"),(Object)("Pineapple")}).getObject()));
 //BA.debugLineNum = 29;BA.debugLine="fruit.Add(CreateMap(\"id\":5, \"value\": \"Grapes\"))";
_fruit.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(5),(Object)("value"),(Object)("Grapes")}).getObject()));
 //BA.debugLineNum = 32;BA.debugLine="myForm.Initialize(\"mashform\").SetWidth(500)";
_myform._initialize /*b4j.example.wixform*/ (ba,"mashform")._setwidth /*b4j.example.wixform*/ ((int) (500));
 //BA.debugLineNum = 35;BA.debugLine="Dim cbo As WixCombo";
_cbo = new b4j.example.wixcombo();
 //BA.debugLineNum = 36;BA.debugLine="cbo.Initialize(\"cbo\").SetLabel(\"Combo\").SetValue(";
_cbo._initialize /*b4j.example.wixcombo*/ (ba,"cbo")._setlabel /*b4j.example.wixcombo*/ ("Combo")._setvalue /*b4j.example.wixcombo*/ (BA.NumberToString(3))._setoptions /*b4j.example.wixcombo*/ (_fruit)._settemplate /*b4j.example.wixcombo*/ ("Fresh #value#")._setycount /*b4j.example.wixcombo*/ ((int) (2))._setlabelalign /*b4j.example.wixcombo*/ ("right");
 //BA.debugLineNum = 37;BA.debugLine="myForm.Form.AddItem(cbo.Item)";
_myform._form /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_cbo._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 40;BA.debugLine="Dim txtBox As WixTextBox";
_txtbox = new b4j.example.wixtextbox();
 //BA.debugLineNum = 41;BA.debugLine="txtBox.Initialize(\"txtBox\").SetLabel(\"Text Box\").";
_txtbox._initialize /*b4j.example.wixtextbox*/ (ba,"txtBox")._setlabel /*b4j.example.wixtextbox*/ ("Text Box")._setplaceholder /*b4j.example.wixtextbox*/ ("Text Box")._setlabelposition /*b4j.example.wixtextbox*/ ("top");
 //BA.debugLineNum = 42;BA.debugLine="myForm.Form.AddItem(txtBox.Item)";
_myform._form /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_txtbox._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 44;BA.debugLine="Dim pwd As WixTextBox";
_pwd = new b4j.example.wixtextbox();
 //BA.debugLineNum = 45;BA.debugLine="pwd.Initialize(\"pwd\").SetTypePassword(\"\").SetLabe";
_pwd._initialize /*b4j.example.wixtextbox*/ (ba,"pwd")._settypepassword /*b4j.example.wixtextbox*/ ("")._setlabel /*b4j.example.wixtextbox*/ ("Password")._setplaceholder /*b4j.example.wixtextbox*/ ("Password")._setmaxlength /*b4j.example.wixtextbox*/ ((int) (10));
 //BA.debugLineNum = 46;BA.debugLine="myForm.Form.AddItem(pwd.Item)";
_myform._form /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_pwd._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 49;BA.debugLine="Dim txta As WixTextArea";
_txta = new b4j.example.wixtextarea();
 //BA.debugLineNum = 50;BA.debugLine="txta.Initialize(\"ta\").SetLabel(\"Text Area\").SetPl";
_txta._initialize /*b4j.example.wixtextarea*/ (ba,"ta")._setlabel /*b4j.example.wixtextarea*/ ("Text Area")._setplaceholder /*b4j.example.wixtextarea*/ ("Text Area");
 //BA.debugLineNum = 51;BA.debugLine="myForm.Form.AddItem(txta.item)";
_myform._form /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_txta._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 53;BA.debugLine="Dim cb As WixCheckBox";
_cb = new b4j.example.wixcheckbox();
 //BA.debugLineNum = 54;BA.debugLine="cb.Initialize(\"cb\").SetLabel(\"Checkbox\").SetValue";
_cb._initialize /*b4j.example.wixcheckbox*/ (ba,"cb")._setlabel /*b4j.example.wixcheckbox*/ ("Checkbox")._setvalue /*b4j.example.wixcheckbox*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True))._setlabelonright /*b4j.example.wixcheckbox*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 55;BA.debugLine="myForm.Form.AddItem(cb.item)";
_myform._form /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_cb._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 57;BA.debugLine="Dim cb1 As WixCheckBox";
_cb1 = new b4j.example.wixcheckbox();
 //BA.debugLineNum = 58;BA.debugLine="cb1.Initialize(\"cb1\").SetLabel(\"Checkbox Before\")";
_cb1._initialize /*b4j.example.wixcheckbox*/ (ba,"cb1")._setlabel /*b4j.example.wixcheckbox*/ ("Checkbox Before");
 //BA.debugLineNum = 59;BA.debugLine="myForm.Form.AddItem(cb1.item)";
_myform._form /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_cb1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 66;BA.debugLine="Dim ro As WixRadio";
_ro = new b4j.example.wixradio();
 //BA.debugLineNum = 67;BA.debugLine="ro.Initialize(\"ro\").SetLabel(\"Radio\").SetOptions(";
_ro._initialize /*b4j.example.wixradio*/ (ba,"ro")._setlabel /*b4j.example.wixradio*/ ("Radio")._setoptions /*b4j.example.wixradio*/ (_fruit)._setvalue /*b4j.example.wixradio*/ (BA.NumberToString(2))._setvertical /*b4j.example.wixradio*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 68;BA.debugLine="myForm.Form.AddItem(ro.Item)";
_myform._form /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_ro._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 70;BA.debugLine="Dim ro1 As WixRadio";
_ro1 = new b4j.example.wixradio();
 //BA.debugLineNum = 71;BA.debugLine="ro1.Initialize(\"ro1\").SetLabel(\"Vertical Radio\").";
_ro1._initialize /*b4j.example.wixradio*/ (ba,"ro1")._setlabel /*b4j.example.wixradio*/ ("Vertical Radio")._setoptions /*b4j.example.wixradio*/ (_fruit)._setvalue /*b4j.example.wixradio*/ (BA.NumberToString(2))._setvertical /*b4j.example.wixradio*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 72;BA.debugLine="myForm.Form.AddItem(ro1.Item)";
_myform._form /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_ro1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 82;BA.debugLine="Dim stepon As WixCounter";
_stepon = new b4j.example.wixcounter();
 //BA.debugLineNum = 83;BA.debugLine="stepon.Initialize(\"stepon\").SetLabel(\"Counter\").S";
_stepon._initialize /*b4j.example.wixcounter*/ (ba,"stepon")._setlabel /*b4j.example.wixcounter*/ ("Counter")._setmin /*b4j.example.wixcounter*/ ((int) (0))._setmax /*b4j.example.wixcounter*/ ((int) (100))._setvalue /*b4j.example.wixcounter*/ (BA.NumberToString(12))._setstep /*b4j.example.wixcounter*/ ((int) (2));
 //BA.debugLineNum = 84;BA.debugLine="myForm.Form.AddItem(stepon.Item)";
_myform._form /*b4j.example.wixelement*/ ._additem /*b4j.example.wixelement*/ (_stepon._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 87;BA.debugLine="R1.AddItem(myForm.Item)";
_r1._additem /*b4j.example.wixrow*/ (_myform._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 88;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 90;BA.debugLine="pg.UI";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 92;BA.debugLine="Dim n, o As String";
_n = "";
_o = "";
 //BA.debugLineNum = 93;BA.debugLine="Dim cbe As BANanoObject = BANano.CallBack(Me,\"cbo";
_cbe = (com.ab.banano.BANanoObject)(_banano.CallBack(pgforms.getObject(),"cbo_change",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_n),(Object)(_o)})));
 //BA.debugLineNum = 94;BA.debugLine="pg.OnChange(\"cbo\", cbe)";
_pg._onchange /*String*/ ("cbo",_cbe);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Public myForm As WixForm";
_myform = new b4j.example.wixform();
 //BA.debugLineNum = 5;BA.debugLine="Public BANano As BANano  ' ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
