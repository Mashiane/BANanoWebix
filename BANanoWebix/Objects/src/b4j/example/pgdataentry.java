package b4j.example;


import anywheresoftware.b4a.BA;

public class pgdataentry extends Object{
public static pgdataentry mostCurrent = new pgdataentry();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgdataentry", null);
		ba.loadHtSubs(pgdataentry.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgdataentry", ba);
		}
	}
    public static Class<?> getObject() {
		return pgdataentry.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.main _main = null;
public static b4j.example.pgtabbar _pgtabbar = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgmenu _pgmenu = null;
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgdataview _pgdataview = null;
public static b4j.example.pgdatatable1 _pgdatatable1 = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pgcharts _pgcharts = null;
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgforms _pgforms = null;
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
public static String  _init() throws Exception{
anywheresoftware.b4a.objects.collections.List _dataobj = null;
b4j.example.wixform _form1 = null;
b4j.example.wixcolumn _c1 = null;
b4j.example.wixbutton _e1 = null;
b4j.example.wixcheckbox _e2 = null;
b4j.example.wixcolorpicker _e3 = null;
b4j.example.wixcombo _e4 = null;
b4j.example.wixcounter _e5 = null;
b4j.example.wixdatetimepicker _e6 = null;
b4j.example.wixtextbox _e22 = null;
b4j.example.wixlabel _e7 = null;
b4j.example.wixicon _e8 = null;
b4j.example.wixswitch _st = null;
b4j.example.wixdbllist _e20 = null;
b4j.example.wixfieldset _e21 = null;
b4j.example.wixcolumn _c3 = null;
b4j.example.wixradio _e9 = null;
b4j.example.wixsegmented _e10 = null;
b4j.example.wixtextbox _e11 = null;
b4j.example.wixrichselect _e14 = null;
b4j.example.wixselect _e15 = null;
b4j.example.wixsearch _e17 = null;
b4j.example.wixslider _e18 = null;
b4j.example.wixrichtext _e19 = null;
b4j.example.wixtextarea _e12 = null;
b4j.example.wixbutton _e13 = null;
b4j.example.wixform _c2 = null;
b4j.example.wixcolumn _c2c1 = null;
b4j.example.wixtextbox _manid = null;
anywheresoftware.b4a.objects.collections.List _datal = null;
b4j.example.wixdatatable _dt = null;
b4j.example.wixforminput _fi = null;
b4j.example.wixbutton _btns = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="pg.Initialize(\"\").SetHeader(\"Lesson 6: Form Data";
_pg._initialize /*b4j.example.wixpage*/ (ba,"")._setheader /*b4j.example.wixpage*/ ("Lesson 6: Form Data Entry");
 //BA.debugLineNum = 12;BA.debugLine="Dim dataObj As List";
_dataobj = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="dataObj.Initialize";
_dataobj.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="dataObj.Add(CreateMap(\"id\" : \"1\", \"value\" : \"Drea";
_dataobj.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("1"),(Object)("value"),(Object)("Dream Theater")}).getObject()));
 //BA.debugLineNum = 15;BA.debugLine="dataObj.Add(CreateMap(\"id\" : \"2\", \"value\" : \"Kame";
_dataobj.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("2"),(Object)("value"),(Object)("Kamelot")}).getObject()));
 //BA.debugLineNum = 16;BA.debugLine="dataObj.Add(CreateMap(\"id\" : \"3\", \"value\" : \"Circ";
_dataobj.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("3"),(Object)("value"),(Object)("Circus Maximus")}).getObject()));
 //BA.debugLineNum = 19;BA.debugLine="Dim form1 As WixForm";
_form1 = new b4j.example.wixform();
 //BA.debugLineNum = 20;BA.debugLine="form1.Initialize(\"form1\")";
_form1._initialize /*b4j.example.wixform*/ (ba,"form1");
 //BA.debugLineNum = 22;BA.debugLine="form1.SetWidth(1000).SetHeight(820)";
_form1._setwidth /*b4j.example.wixform*/ ((int) (1000))._setheight /*b4j.example.wixform*/ ((int) (820));
 //BA.debugLineNum = 24;BA.debugLine="form1.Form.SetStyle(\"border\", \"2px solid #000000\"";
_form1._form /*b4j.example.wixelement*/ ._setstyle /*b4j.example.wixelement*/ ("border","2px solid #000000");
 //BA.debugLineNum = 26;BA.debugLine="form1.Form.SetStyle(\"margin\", \"10px\")";
_form1._form /*b4j.example.wixelement*/ ._setstyle /*b4j.example.wixelement*/ ("margin","10px");
 //BA.debugLineNum = 28;BA.debugLine="form1.Form.SetDefaultLabelWidth(120)";
_form1._form /*b4j.example.wixelement*/ ._setdefaultlabelwidth /*b4j.example.wixelement*/ ((int) (120));
 //BA.debugLineNum = 30;BA.debugLine="Dim C1 As WixColumn";
_c1 = new b4j.example.wixcolumn();
 //BA.debugLineNum = 31;BA.debugLine="C1.Initialize(\"C1\").SetWidth(420)";
_c1._initialize /*b4j.example.wixcolumn*/ (ba,"C1")._setwidth /*b4j.example.wixcolumn*/ ((int) (420));
 //BA.debugLineNum = 33;BA.debugLine="Dim e1 As WixButton";
_e1 = new b4j.example.wixbutton();
 //BA.debugLineNum = 34;BA.debugLine="e1.Initialize(\"\").SetLabel(\"Button\").SetTooltip(\"";
_e1._initialize /*b4j.example.wixbutton*/ (ba,"")._setlabel /*b4j.example.wixbutton*/ ("Button")._settooltip /*b4j.example.wixbutton*/ ("This is my tooltip!");
 //BA.debugLineNum = 36;BA.debugLine="C1.AddRows(e1.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 38;BA.debugLine="Dim e2 As WixCheckBox";
_e2 = new b4j.example.wixcheckbox();
 //BA.debugLineNum = 39;BA.debugLine="e2.Initialize(\"chk\").SetLabel(\"CheckBox\")";
_e2._initialize /*b4j.example.wixcheckbox*/ (ba,"chk")._setlabel /*b4j.example.wixcheckbox*/ ("CheckBox");
 //BA.debugLineNum = 40;BA.debugLine="C1.AddRows(e2.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 41;BA.debugLine="pg.SetHint(\"chk\",\"Check this to agree\")";
_pg._sethint /*String*/ ("chk","Check this to agree");
 //BA.debugLineNum = 43;BA.debugLine="Dim e3 As WixColorPicker";
_e3 = new b4j.example.wixcolorpicker();
 //BA.debugLineNum = 44;BA.debugLine="e3.Initialize(\"\").SetLabel(\"ColorPicker\")";
_e3._initialize /*b4j.example.wixcolorpicker*/ (ba,"")._setlabel /*b4j.example.wixcolorpicker*/ ("ColorPicker");
 //BA.debugLineNum = 45;BA.debugLine="C1.AddRows(e3.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e3._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 47;BA.debugLine="Dim e4 As WixCombo";
_e4 = new b4j.example.wixcombo();
 //BA.debugLineNum = 48;BA.debugLine="e4.Initialize(\"\").SetLabel(\"Combo\").SetValue(2)";
_e4._initialize /*b4j.example.wixcombo*/ (ba,"")._setlabel /*b4j.example.wixcombo*/ ("Combo")._setvalue /*b4j.example.wixcombo*/ (BA.NumberToString(2));
 //BA.debugLineNum = 49;BA.debugLine="e4.SetOptions(dataObj).SetRequired(True)";
_e4._setoptions /*b4j.example.wixcombo*/ (_dataobj)._setrequired /*b4j.example.wixcombo*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 50;BA.debugLine="C1.AddRows(e4.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e4._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 52;BA.debugLine="Dim e5 As WixCounter";
_e5 = new b4j.example.wixcounter();
 //BA.debugLineNum = 53;BA.debugLine="e5.Initialize(\"cnt\").SetLabel(\"Counter\")";
_e5._initialize /*b4j.example.wixcounter*/ (ba,"cnt")._setlabel /*b4j.example.wixcounter*/ ("Counter");
 //BA.debugLineNum = 54;BA.debugLine="C1.AddRows(e5.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e5._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 56;BA.debugLine="Dim e6 As WixDateTimePicker";
_e6 = new b4j.example.wixdatetimepicker();
 //BA.debugLineNum = 57;BA.debugLine="e6.Initialize(\"\").SetLabel(\"Date Time Picker\").Se";
_e6._initialize /*b4j.example.wixdatetimepicker*/ (ba,"")._setlabel /*b4j.example.wixdatetimepicker*/ ("Date Time Picker")._seteditable /*b4j.example.wixdatetimepicker*/ (anywheresoftware.b4a.keywords.Common.True)._settimepicker /*b4j.example.wixdatetimepicker*/ (anywheresoftware.b4a.keywords.Common.True)._setformat /*b4j.example.wixdatetimepicker*/ ("%d %M %Y at %H:%i");
 //BA.debugLineNum = 58;BA.debugLine="C1.AddRows(e6.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e6._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 60;BA.debugLine="Dim e22 As WixTextBox";
_e22 = new b4j.example.wixtextbox();
 //BA.debugLineNum = 61;BA.debugLine="e22.Initialize(\"pwd\").SetTypePassword(\"\").SetLabe";
_e22._initialize /*b4j.example.wixtextbox*/ (ba,"pwd")._settypepassword /*b4j.example.wixtextbox*/ ("")._setlabel /*b4j.example.wixtextbox*/ ("Password")._setvalue /*b4j.example.wixtextbox*/ ("Password...")._setlabelposition /*b4j.example.wixtextbox*/ ("top");
 //BA.debugLineNum = 62;BA.debugLine="C1.AddRows(e22.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e22._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 63;BA.debugLine="pg.SetHint(\"pwd\",\"Enter your password here...\")";
_pg._sethint /*String*/ ("pwd","Enter your password here...");
 //BA.debugLineNum = 65;BA.debugLine="Dim e7 As WixLabel";
_e7 = new b4j.example.wixlabel();
 //BA.debugLineNum = 66;BA.debugLine="e7.Initialize(\"\").SetLabel(\"This is a label, and";
_e7._initialize /*b4j.example.wixlabel*/ (ba,"")._setlabel /*b4j.example.wixlabel*/ ("This is a label, and below is an icon");
 //BA.debugLineNum = 67;BA.debugLine="C1.AddRows(e7.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e7._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 69;BA.debugLine="Dim e8 As WixIcon";
_e8 = new b4j.example.wixicon();
 //BA.debugLineNum = 70;BA.debugLine="e8.Initialize(\"\").SetAlignCenter(\"\").SetIcon(\"wxi";
_e8._initialize /*b4j.example.wixicon*/ (ba,"")._setaligncenter /*b4j.example.wixicon*/ ("")._seticon /*b4j.example.wixicon*/ ("wxi-file");
 //BA.debugLineNum = 71;BA.debugLine="C1.AddRows(e8.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e8._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 73;BA.debugLine="Dim st As WixSwitch";
_st = new b4j.example.wixswitch();
 //BA.debugLineNum = 74;BA.debugLine="st.Initialize(\"st\").SetLabel(\"Switch\")";
_st._initialize /*b4j.example.wixswitch*/ (ba,"st")._setlabel /*b4j.example.wixswitch*/ ("Switch");
 //BA.debugLineNum = 75;BA.debugLine="C1.AddRows(st.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_st._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 77;BA.debugLine="Dim e20 As WixDBLList";
_e20 = new b4j.example.wixdbllist();
 //BA.debugLineNum = 78;BA.debugLine="e20.Initialize(\"\").SetHeight(200).SetValue(\"1,3\")";
_e20._initialize /*b4j.example.wixdbllist*/ (ba,"")._setheight /*b4j.example.wixdbllist*/ ((int) (200))._setvalue /*b4j.example.wixdbllist*/ ("1,3")._setstyle /*b4j.example.wixdbllist*/ ("margin-top","10px!important")._setdata /*b4j.example.wixdbllist*/ (_dataobj);
 //BA.debugLineNum = 79;BA.debugLine="C1.AddRows(e20.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e20._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 81;BA.debugLine="Dim e21 As WixFieldSet";
_e21 = new b4j.example.wixfieldset();
 //BA.debugLineNum = 82;BA.debugLine="e21.Initialize(\"\").SetLabel(\"Field-Set\")";
_e21._initialize /*b4j.example.wixfieldset*/ (ba,"")._setlabel /*b4j.example.wixfieldset*/ ("Field-Set");
 //BA.debugLineNum = 83;BA.debugLine="C1.AddRows(e21.Item)";
_c1._addrows /*b4j.example.wixcolumn*/ (_e21._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 86;BA.debugLine="form1.AddColumn(C1)";
_form1._addcolumn /*String*/ (_c1);
 //BA.debugLineNum = 88;BA.debugLine="form1.AddColumnsSpacer  'C2";
_form1._addcolumnsspacer /*String*/ ();
 //BA.debugLineNum = 91;BA.debugLine="Dim C3 As WixColumn";
_c3 = new b4j.example.wixcolumn();
 //BA.debugLineNum = 92;BA.debugLine="C3.Initialize(\"C3\").SetWidth(520)";
_c3._initialize /*b4j.example.wixcolumn*/ (ba,"C3")._setwidth /*b4j.example.wixcolumn*/ ((int) (520));
 //BA.debugLineNum = 94;BA.debugLine="Dim e9 As WixRadio";
_e9 = new b4j.example.wixradio();
 //BA.debugLineNum = 95;BA.debugLine="e9.Initialize(\"\").SetLabel(\"Radio\").SetValue(1).S";
_e9._initialize /*b4j.example.wixradio*/ (ba,"")._setlabel /*b4j.example.wixradio*/ ("Radio")._setvalue /*b4j.example.wixradio*/ (BA.NumberToString(1))._setoptions /*b4j.example.wixradio*/ (_dataobj);
 //BA.debugLineNum = 96;BA.debugLine="C3.AddRows(e9.Item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e9._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 98;BA.debugLine="Dim e10 As WixSegmented";
_e10 = new b4j.example.wixsegmented();
 //BA.debugLineNum = 99;BA.debugLine="e10.Initialize(\"\").SetLabel(\"Segmented\").SetValue";
_e10._initialize /*b4j.example.wixsegmented*/ (ba,"")._setlabel /*b4j.example.wixsegmented*/ ("Segmented")._setvalue /*b4j.example.wixsegmented*/ (BA.NumberToString(3))._setoptions /*b4j.example.wixsegmented*/ (_dataobj);
 //BA.debugLineNum = 100;BA.debugLine="C3.AddRows(e10.Item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e10._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 102;BA.debugLine="Dim e11 As WixTextBox";
_e11 = new b4j.example.wixtextbox();
 //BA.debugLineNum = 103;BA.debugLine="e11.Initialize(\"myText\").SetLabel(\"Text\").SetLabe";
_e11._initialize /*b4j.example.wixtextbox*/ (ba,"myText")._setlabel /*b4j.example.wixtextbox*/ ("Text")._setlabelalign /*b4j.example.wixtextbox*/ ("right");
 //BA.debugLineNum = 104;BA.debugLine="C3.AddRows(e11.Item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e11._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 106;BA.debugLine="Dim e14 As WixRichSelect";
_e14 = new b4j.example.wixrichselect();
 //BA.debugLineNum = 107;BA.debugLine="e14.Initialize(\"\").SetLabel(\"Rich Select\").SetVal";
_e14._initialize /*b4j.example.wixrichselect*/ (ba,"")._setlabel /*b4j.example.wixrichselect*/ ("Rich Select")._setvalue /*b4j.example.wixrichselect*/ (BA.NumberToString(2))._setoptions /*b4j.example.wixrichselect*/ (_dataobj);
 //BA.debugLineNum = 108;BA.debugLine="C3.AddRows(e14.Item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e14._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 110;BA.debugLine="Dim e15 As WixSelect";
_e15 = new b4j.example.wixselect();
 //BA.debugLineNum = 111;BA.debugLine="e15.Initialize(\"\").SetLabel(\"Select\").SetValue(1)";
_e15._initialize /*b4j.example.wixselect*/ (ba,"")._setlabel /*b4j.example.wixselect*/ ("Select")._setvalue /*b4j.example.wixselect*/ (BA.NumberToString(1))._setoptions /*b4j.example.wixselect*/ (_dataobj);
 //BA.debugLineNum = 112;BA.debugLine="C3.AddRows(e15.Item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e15._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 114;BA.debugLine="Dim e17 As WixSearch";
_e17 = new b4j.example.wixsearch();
 //BA.debugLineNum = 115;BA.debugLine="e17.Initialize(\"\").SetLabel(\"Search\")";
_e17._initialize /*b4j.example.wixsearch*/ (ba,"")._setlabel /*b4j.example.wixsearch*/ ("Search");
 //BA.debugLineNum = 116;BA.debugLine="C3.AddRows(e17.Item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e17._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 118;BA.debugLine="Dim e18 As WixSlider";
_e18 = new b4j.example.wixslider();
 //BA.debugLineNum = 119;BA.debugLine="e18.Initialize(\"\").SetLabel(\"Slider\").SetMoveTitl";
_e18._initialize /*b4j.example.wixslider*/ (ba,"")._setlabel /*b4j.example.wixslider*/ ("Slider")._setmovetitle /*b4j.example.wixslider*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 120;BA.debugLine="C3.AddRows(e18.Item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e18._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 122;BA.debugLine="Dim e19 As WixRichText";
_e19 = new b4j.example.wixrichtext();
 //BA.debugLineNum = 123;BA.debugLine="e19.Initialize(\"\").SetLabel(\"Rich Text\").Setheigh";
_e19._initialize /*b4j.example.wixrichtext*/ (ba,"")._setlabel /*b4j.example.wixrichtext*/ ("Rich Text")._setheight /*b4j.example.wixrichtext*/ ((int) (150));
 //BA.debugLineNum = 124;BA.debugLine="C3.AddRows(e19.Item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e19._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 126;BA.debugLine="Dim e12 As WixTextArea";
_e12 = new b4j.example.wixtextarea();
 //BA.debugLineNum = 127;BA.debugLine="e12.Initialize(\"\").SetLabel(\"Text Area\").SetHeigh";
_e12._initialize /*b4j.example.wixtextarea*/ (ba,"")._setlabel /*b4j.example.wixtextarea*/ ("Text Area")._setheight /*b4j.example.wixtextarea*/ ((int) (220));
 //BA.debugLineNum = 128;BA.debugLine="C3.AddRows(e12.Item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e12._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 130;BA.debugLine="Dim e13 As WixButton";
_e13 = new b4j.example.wixbutton();
 //BA.debugLineNum = 131;BA.debugLine="e13.Initialize(\"\").SetToggle(\"\").SetOnLabel(\"Togg";
_e13._initialize /*b4j.example.wixbutton*/ (ba,"")._settoggle /*b4j.example.wixbutton*/ ("")._setonlabel /*b4j.example.wixbutton*/ ("Toggle ON")._setofflabel /*b4j.example.wixbutton*/ ("Toggle OFF")._setwidth /*b4j.example.wixbutton*/ ((int) (100))._setalignright /*b4j.example.wixbutton*/ ("");
 //BA.debugLineNum = 132;BA.debugLine="C3.AddRows(e13.item)";
_c3._addrows /*b4j.example.wixcolumn*/ (_e13._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 134;BA.debugLine="form1.AddColumn(C3)";
_form1._addcolumn /*String*/ (_c3);
 //BA.debugLineNum = 137;BA.debugLine="form1.AddColumnsSpacer  'C2";
_form1._addcolumnsspacer /*String*/ ();
 //BA.debugLineNum = 139;BA.debugLine="Dim C2 As WixForm";
_c2 = new b4j.example.wixform();
 //BA.debugLineNum = 140;BA.debugLine="C2.Initialize(\"dataform\").SetWidth(600)";
_c2._initialize /*b4j.example.wixform*/ (ba,"dataform")._setwidth /*b4j.example.wixform*/ ((int) (600));
 //BA.debugLineNum = 141;BA.debugLine="C2.Form.SetDefaultLabelWidth(120)";
_c2._form /*b4j.example.wixelement*/ ._setdefaultlabelwidth /*b4j.example.wixelement*/ ((int) (120));
 //BA.debugLineNum = 142;BA.debugLine="Dim C2C1 As WixColumn";
_c2c1 = new b4j.example.wixcolumn();
 //BA.debugLineNum = 143;BA.debugLine="C2C1.Initialize(\"C2C1\").SetWidth(550)";
_c2c1._initialize /*b4j.example.wixcolumn*/ (ba,"C2C1")._setwidth /*b4j.example.wixcolumn*/ ((int) (550));
 //BA.debugLineNum = 145;BA.debugLine="Dim manID As WixTextBox";
_manid = new b4j.example.wixtextbox();
 //BA.debugLineNum = 146;BA.debugLine="manID.Initialize(\"manID\").SetLabel(\"Manager ID\").";
_manid._initialize /*b4j.example.wixtextbox*/ (ba,"manID")._setlabel /*b4j.example.wixtextbox*/ ("Manager ID")._setwidth /*b4j.example.wixtextbox*/ ((int) (300));
 //BA.debugLineNum = 147;BA.debugLine="C2C1.AddRows(manID.Item)";
_c2c1._addrows /*b4j.example.wixcolumn*/ (_manid._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 150;BA.debugLine="Dim datal As List";
_datal = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 151;BA.debugLine="datal.Initialize";
_datal.Initialize();
 //BA.debugLineNum = 152;BA.debugLine="datal.Add(CreateMap(\"name\" : \"Jack\", \"position\" :";
_datal.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Jack"),(Object)("position"),(Object)("Dillon"),(Object)("phone"),(Object)("111-222-3333")}).getObject()));
 //BA.debugLineNum = 153;BA.debugLine="datal.Add(CreateMap(\"name\" : \"Susan\", \"position\"";
_datal.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Susan"),(Object)("position"),(Object)("Everest"),(Object)("phone"),(Object)("444-555-6666")}).getObject()));
 //BA.debugLineNum = 154;BA.debugLine="datal.Add(CreateMap(\"name\" : \"Charlie\", \"position";
_datal.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)("Charlie"),(Object)("position"),(Object)("Jackson"),(Object)("phone"),(Object)("777-888-9999")}).getObject()));
 //BA.debugLineNum = 156;BA.debugLine="Dim dt As WixDataTable";
_dt = new b4j.example.wixdatatable();
 //BA.debugLineNum = 157;BA.debugLine="dt.Initialize(\"\").SetHeight(200)";
_dt._initialize /*b4j.example.wixdatatable*/ (ba,"")._setheight /*b4j.example.wixdatatable*/ ((int) (200));
 //BA.debugLineNum = 159;BA.debugLine="dt.AddHeader(\"name\", \"Employee Name\",0).AddHeader";
_dt._addheader /*b4j.example.wixdatatable*/ ("name","Employee Name",(int) (0))._addheader /*b4j.example.wixdatatable*/ ("position","Position",(int) (0))._addheader /*b4j.example.wixdatatable*/ ("phone","Phone #",(int) (1));
 //BA.debugLineNum = 161;BA.debugLine="dt.SetData(datal).SetAutoConfig(True)";
_dt._setdata /*b4j.example.wixdatatable*/ (_datal)._setautoconfig /*b4j.example.wixdatatable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 163;BA.debugLine="Dim fi As WixFormInput";
_fi = new b4j.example.wixforminput();
 //BA.debugLineNum = 164;BA.debugLine="fi.Initialize(\"\").SetLabel(\"Employees Grid\").SetB";
_fi._initialize /*b4j.example.wixforminput*/ (ba,"")._setlabel /*b4j.example.wixforminput*/ ("Employees Grid")._setbody /*b4j.example.wixforminput*/ ((Object)(_dt._item /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 165;BA.debugLine="C2C1.AddRows(fi.Item)";
_c2c1._addrows /*b4j.example.wixcolumn*/ (_fi._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 167;BA.debugLine="Dim btnS As WixButton";
_btns = new b4j.example.wixbutton();
 //BA.debugLineNum = 168;BA.debugLine="btnS.Initialize(\"btnS\").SetValue(\"Save\").SetInput";
_btns._initialize /*b4j.example.wixbutton*/ (ba,"btnS")._setvalue /*b4j.example.wixbutton*/ ("Save")._setinputwidth /*b4j.example.wixbutton*/ ((int) (200))._setalignright /*b4j.example.wixbutton*/ ("");
 //BA.debugLineNum = 169;BA.debugLine="C2C1.AddRows(btnS.Item)";
_c2c1._addrows /*b4j.example.wixcolumn*/ (_btns._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 171;BA.debugLine="C2.AddColumn(C2C1)";
_c2._addcolumn /*String*/ (_c2c1);
 //BA.debugLineNum = 172;BA.debugLine="form1.AddColumns(C2.Item)";
_form1._addcolumns /*String*/ (_c2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 176;BA.debugLine="pg.Page.AddRows(form1.Item)";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (_form1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 178;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 179;BA.debugLine="pg.DisableIT(\"cnt\")";
_pg._disableit /*String*/ ("cnt");
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
