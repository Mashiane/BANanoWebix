package b4j.example;


import anywheresoftware.b4a.BA;

public class pgcharts extends Object{
public static pgcharts mostCurrent = new pgcharts();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgcharts", null);
		ba.loadHtSubs(pgcharts.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgcharts", ba);
		}
	}
    public static Class<?> getObject() {
		return pgcharts.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.main _main = null;
public static b4j.example.pgdatatable1 _pgdatatable1 = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pgdataentry _pgdataentry = null;
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgforms _pgforms = null;
public static b4j.example.pgtoolbar _pgtoolbar = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgmultiview _pgmultiview = null;
public static b4j.example.pglayouts1 _pglayouts1 = null;
public static b4j.example.pglayouts2 _pglayouts2 = null;
public static b4j.example.pglayouts _pglayouts = null;
public static b4j.example.pglayout _pglayout = null;
public static b4j.example.pgdataview _pgdataview = null;
public static b4j.example.pglist _pglist = null;
public static b4j.example.pgunitlist _pgunitlist = null;
public static b4j.example.pgpropertysheet _pgpropertysheet = null;
public static b4j.example.pgtree _pgtree = null;
public static b4j.example.pgtreetable _pgtreetable = null;
public static String  _init() throws Exception{
anywheresoftware.b4a.objects.collections.List _chartdata = null;
b4j.example.wixrow _r1 = null;
b4j.example.wixchart _wchart = null;
b4j.example.wixchart _w1 = null;
b4j.example.wixchart _w2 = null;
b4j.example.wixchart _wa = null;
b4j.example.wixrow _r2 = null;
b4j.example.wixchart _w3 = null;
b4j.example.wixchart _w4 = null;
b4j.example.wixchart _w5 = null;
b4j.example.wixchart _wb = null;
b4j.example.wixrow _r3 = null;
b4j.example.wixchart _w6 = null;
b4j.example.wixchart _w7 = null;
b4j.example.wixchart _w8 = null;
b4j.example.wixchart _w9 = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub Init";
 //BA.debugLineNum = 8;BA.debugLine="pg.Initialize(\"\").SetHeader(\"Lesson 7: WixCharts\"";
_pg._initialize /*b4j.example.wixpage*/ (ba,"")._setheader /*b4j.example.wixpage*/ ("Lesson 7: WixCharts");
 //BA.debugLineNum = 10;BA.debugLine="Dim chartData As List";
_chartdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="chartData.Initialize";
_chartdata.Initialize();
 //BA.debugLineNum = 12;BA.debugLine="chartData.Add(CreateMap(\"count\" : 65, \"dollars\" :";
_chartdata.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("count"),(Object)(65),(Object)("dollars"),(Object)(130),(Object)("color"),(Object)("#ff0000"),(Object)("type"),(Object)("AA")}).getObject()));
 //BA.debugLineNum = 13;BA.debugLine="chartData.Add(CreateMap(\"count\" : 120, \"dollars\"";
_chartdata.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("count"),(Object)(120),(Object)("dollars"),(Object)(280),(Object)("color"),(Object)("#00ff00"),(Object)("type"),(Object)("BB")}).getObject()));
 //BA.debugLineNum = 14;BA.debugLine="chartData.Add(CreateMap(\"count\" : 50, \"dollars\" :";
_chartdata.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("count"),(Object)(50),(Object)("dollars"),(Object)(98),(Object)("color"),(Object)("#0000ff"),(Object)("type"),(Object)("CC")}).getObject()));
 //BA.debugLineNum = 15;BA.debugLine="chartData.Add(CreateMap(\"count\" : 90, \"dollars\" :";
_chartdata.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("count"),(Object)(90),(Object)("dollars"),(Object)(110),(Object)("color"),(Object)("#ffff00"),(Object)("type"),(Object)("DD")}).getObject()));
 //BA.debugLineNum = 17;BA.debugLine="pg.Page.AddRows(CreateMap(\"height\":10))";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("height"),(Object)(10)}));
 //BA.debugLineNum = 19;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 20;BA.debugLine="R1.Initialize(\"\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"");
 //BA.debugLineNum = 23;BA.debugLine="R1.AddColumns(CreateMap(\"width\":10))";
_r1._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 24;BA.debugLine="Dim wchart As WixChart";
_wchart = new b4j.example.wixchart();
 //BA.debugLineNum = 25;BA.debugLine="wchart.Initialize(\"\").SetTypeSpLineArea(\"\").SetVa";
_wchart._initialize /*b4j.example.wixchart*/ (ba,"")._settypesplinearea /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setlabel /*b4j.example.wixchart*/ ("#count#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 26;BA.debugLine="wchart.SetColor(\"#36abee\").SetAlpha(0.8).SetXAxis";
_wchart._setcolor /*b4j.example.wixchart*/ ("#36abee")._setalpha /*b4j.example.wixchart*/ ((float) (0.8))._setxaxistemplate /*b4j.example.wixchart*/ ("#type#")._settooltiptemplate /*b4j.example.wixchart*/ ("#count#")._setborder /*b4j.example.wixchart*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="R1.AddColumns(wchart.Item)";
_r1._addcolumns /*b4j.example.wixrow*/ (_wchart._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 30;BA.debugLine="R1.AddColumns(CreateMap(\"width\":10))";
_r1._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 31;BA.debugLine="Dim w1 As WixChart";
_w1 = new b4j.example.wixchart();
 //BA.debugLineNum = 32;BA.debugLine="w1.Initialize(\"\").SetTypeBar(\"\").SetValue(\"#count";
_w1._initialize /*b4j.example.wixchart*/ (ba,"")._settypebar /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setlabel /*b4j.example.wixchart*/ ("#count#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 33;BA.debugLine="w1.SetBarWidth(35).SetRadius(0).SetGradientFallin";
_w1._setbarwidth /*b4j.example.wixchart*/ ((int) (35))._setradius /*b4j.example.wixchart*/ ((int) (0))._setgradientfalling /*b4j.example.wixchart*/ ("")._setxaxistemplate /*b4j.example.wixchart*/ ("#type#");
 //BA.debugLineNum = 35;BA.debugLine="R1.AddColumns(w1.Item)";
_r1._addcolumns /*b4j.example.wixrow*/ (_w1._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 38;BA.debugLine="R1.AddColumns(CreateMap(\"width\":10))";
_r1._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 39;BA.debugLine="Dim w2 As WixChart";
_w2 = new b4j.example.wixchart();
 //BA.debugLineNum = 40;BA.debugLine="w2.Initialize(\"\").SetTypeBarH(\"\").SetValue(\"#coun";
_w2._initialize /*b4j.example.wixchart*/ (ba,"")._settypebarh /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setlabel /*b4j.example.wixchart*/ ("#count#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 41;BA.debugLine="w2.SetBarWidth(20).SetRadius(10).SetGradient(\"fal";
_w2._setbarwidth /*b4j.example.wixchart*/ ((int) (20))._setradius /*b4j.example.wixchart*/ ((int) (10))._setgradient /*b4j.example.wixchart*/ ("falling")._setpadding /*b4j.example.wixchart*/ ((int) (40))._setyaxistemplate /*b4j.example.wixchart*/ ("#type#");
 //BA.debugLineNum = 42;BA.debugLine="R1.AddColumns(w2.Item)";
_r1._addcolumns /*b4j.example.wixrow*/ (_w2._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 45;BA.debugLine="R1.AddColumns(CreateMap(\"width\":10))";
_r1._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 46;BA.debugLine="Dim wa As WixChart";
_wa = new b4j.example.wixchart();
 //BA.debugLineNum = 47;BA.debugLine="wa.Initialize(\"\").SetTypeRadar(\"\").SetValue(\"#cou";
_wa._initialize /*b4j.example.wixchart*/ (ba,"")._settyperadar /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 48;BA.debugLine="wa.SetDisableLines(True).SetXAxisTemplate(\"#type#";
_wa._setdisablelines /*b4j.example.wixchart*/ (anywheresoftware.b4a.keywords.Common.True)._setxaxistemplate /*b4j.example.wixchart*/ ("#type#")._setyaxislineshape /*b4j.example.wixchart*/ ("arc")._setyaxisbg /*b4j.example.wixchart*/ ("#fffbf4");
 //BA.debugLineNum = 49;BA.debugLine="wa.SetTooltipTemplate(\"#count#\").SetItemBorderWid";
_wa._settooltiptemplate /*b4j.example.wixchart*/ ("#count#")._setitemborderwidth /*b4j.example.wixchart*/ (BA.NumberToString(0))._setitemcolor /*b4j.example.wixchart*/ ("#3a838e")._setitemradius /*b4j.example.wixchart*/ ((int) (2));
 //BA.debugLineNum = 50;BA.debugLine="R1.AddColumns(wa.Item)";
_r1._addcolumns /*b4j.example.wixrow*/ (_wa._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 51;BA.debugLine="R1.AddColumns(CreateMap())";
_r1._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {}));
 //BA.debugLineNum = 54;BA.debugLine="pg.Page.AddRow(R1)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r1);
 //BA.debugLineNum = 56;BA.debugLine="pg.Page.AddRows(CreateMap(\"height\":10))";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("height"),(Object)(10)}));
 //BA.debugLineNum = 57;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.example.wixrow();
 //BA.debugLineNum = 58;BA.debugLine="R2.Initialize(\"\")";
_r2._initialize /*b4j.example.wixrow*/ (ba,"");
 //BA.debugLineNum = 61;BA.debugLine="R2.AddColumns(CreateMap(\"width\":10))";
_r2._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 62;BA.debugLine="Dim w3 As WixChart";
_w3 = new b4j.example.wixchart();
 //BA.debugLineNum = 63;BA.debugLine="w3.Initialize(\"\").SetTypeDonut(\"\").SetValue(\"#cou";
_w3._initialize /*b4j.example.wixchart*/ (ba,"")._settypedonut /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setcolor /*b4j.example.wixchart*/ ("#color#")._setlabel /*b4j.example.wixchart*/ ("#type#")._setdata /*b4j.example.wixchart*/ (_chartdata)._setshadow /*b4j.example.wixchart*/ ((int) (20));
 //BA.debugLineNum = 64;BA.debugLine="w3.SetWidth(300).SetHeight(200).SetPieInnerText(\"";
_w3._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setpieinnertext /*b4j.example.wixchart*/ ("#count#");
 //BA.debugLineNum = 65;BA.debugLine="R2.AddColumns(w3.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_w3._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 68;BA.debugLine="R2.AddColumns(CreateMap(\"width\":10))";
_r2._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 69;BA.debugLine="Dim w4 As WixChart";
_w4 = new b4j.example.wixchart();
 //BA.debugLineNum = 70;BA.debugLine="w4.Initialize(\"\").SetTypeLine(\"\").SetValue(\"#coun";
_w4._initialize /*b4j.example.wixchart*/ (ba,"")._settypeline /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setlabel /*b4j.example.wixchart*/ ("#count#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 71;BA.debugLine="w4.SetLineColor(\"#ffa0d0\").SetLineWidth(10).SetXA";
_w4._setlinecolor /*b4j.example.wixchart*/ ("#ffa0d0")._setlinewidth /*b4j.example.wixchart*/ ((int) (10))._setxaxistemplate /*b4j.example.wixchart*/ ("#type#")._setoffset /*b4j.example.wixchart*/ ((int) (0));
 //BA.debugLineNum = 72;BA.debugLine="w4.SetItemBorderColor(\"#1293f8\").SetItemColor(\"#f";
_w4._setitembordercolor /*b4j.example.wixchart*/ ("#1293f8")._setitemcolor /*b4j.example.wixchart*/ ("#ffffff");
 //BA.debugLineNum = 73;BA.debugLine="R2.AddColumns(w4.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_w4._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 76;BA.debugLine="R2.AddColumns(CreateMap(\"width\":10))";
_r2._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 77;BA.debugLine="Dim w5 As WixChart";
_w5 = new b4j.example.wixchart();
 //BA.debugLineNum = 78;BA.debugLine="w5.Initialize(\"\").SetTypePie(\"\").SetValue(\"#count";
_w5._initialize /*b4j.example.wixchart*/ (ba,"")._settypepie /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setpieinnertext /*b4j.example.wixchart*/ ("#count#")._setlabel /*b4j.example.wixchart*/ ("#type#")._setcolor /*b4j.example.wixchart*/ ("#color#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 80;BA.debugLine="R2.AddColumns(w5.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_w5._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 83;BA.debugLine="R2.AddColumns(CreateMap(\"width\":10))";
_r2._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 84;BA.debugLine="Dim wb As WixChart";
_wb = new b4j.example.wixchart();
 //BA.debugLineNum = 85;BA.debugLine="wb.Initialize(\"\").SetTypeScatter(\"\").SetValue(\"#d";
_wb._initialize /*b4j.example.wixchart*/ (ba,"")._settypescatter /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#dollars#")._setxvalue /*b4j.example.wixchart*/ ("#count#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 86;BA.debugLine="wb.SetXAxisTitle(\"Count\").SetYAxisTitle(\"Dollars\"";
_wb._setxaxistitle /*b4j.example.wixchart*/ ("Count")._setyaxistitle /*b4j.example.wixchart*/ ("Dollars");
 //BA.debugLineNum = 87;BA.debugLine="wb.SetItemBorderColor(\"#f38f00\")";
_wb._setitembordercolor /*b4j.example.wixchart*/ ("#f38f00");
 //BA.debugLineNum = 88;BA.debugLine="wb.SetItemBorderWidth(1)";
_wb._setitemborderwidth /*b4j.example.wixchart*/ (BA.NumberToString(1));
 //BA.debugLineNum = 89;BA.debugLine="wb.SetItemRadius(5)";
_wb._setitemradius /*b4j.example.wixchart*/ ((int) (5));
 //BA.debugLineNum = 90;BA.debugLine="wb.SetItemTypeDiamond(\"\")";
_wb._setitemtypediamond /*b4j.example.wixchart*/ ("");
 //BA.debugLineNum = 91;BA.debugLine="wb.SetItemColor(\"#ff9600\")";
_wb._setitemcolor /*b4j.example.wixchart*/ ("#ff9600");
 //BA.debugLineNum = 92;BA.debugLine="wb.SetItemShadow(True)";
_wb._setitemshadow /*b4j.example.wixchart*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 93;BA.debugLine="R2.AddColumns(wb.Item)";
_r2._addcolumns /*b4j.example.wixrow*/ (_wb._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 94;BA.debugLine="R2.AddColumns(CreateMap())";
_r2._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {}));
 //BA.debugLineNum = 97;BA.debugLine="pg.Page.AddRow(R2)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r2);
 //BA.debugLineNum = 98;BA.debugLine="pg.Page.AddRows(CreateMap(\"height\":10))";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("height"),(Object)(10)}));
 //BA.debugLineNum = 101;BA.debugLine="Dim R3 As WixRow";
_r3 = new b4j.example.wixrow();
 //BA.debugLineNum = 102;BA.debugLine="R3.Initialize(\"\")";
_r3._initialize /*b4j.example.wixrow*/ (ba,"");
 //BA.debugLineNum = 103;BA.debugLine="R3.AddColumns(CreateMap(\"width\":10))";
_r3._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 104;BA.debugLine="Dim w6 As WixChart";
_w6 = new b4j.example.wixchart();
 //BA.debugLineNum = 105;BA.debugLine="w6.Initialize(\"\").SetTypePie3D(\"\").SetValue(\"#cou";
_w6._initialize /*b4j.example.wixchart*/ (ba,"")._settypepie3d /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setlabel /*b4j.example.wixchart*/ ("#type#")._setcolor /*b4j.example.wixchart*/ ("#color#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 106;BA.debugLine="w6.SetPieInnerText(\"#count#\")";
_w6._setpieinnertext /*b4j.example.wixchart*/ ("#count#");
 //BA.debugLineNum = 107;BA.debugLine="R3.AddColumns(w6.Item)";
_r3._addcolumns /*b4j.example.wixrow*/ (_w6._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 110;BA.debugLine="R3.AddColumns(CreateMap(\"width\":10))";
_r3._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 111;BA.debugLine="Dim w7 As WixChart";
_w7 = new b4j.example.wixchart();
 //BA.debugLineNum = 112;BA.debugLine="w7.Initialize(\"\").SetTypeStackedArea(\"\").SetValue";
_w7._initialize /*b4j.example.wixchart*/ (ba,"")._settypestackedarea /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setlabel /*b4j.example.wixchart*/ ("#count#")._setcolor /*b4j.example.wixchart*/ ("#color#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 113;BA.debugLine="w7.SetXAxisTemplate(\"#type#\")";
_w7._setxaxistemplate /*b4j.example.wixchart*/ ("#type#");
 //BA.debugLineNum = 114;BA.debugLine="R3.AddColumns(w7.Item)";
_r3._addcolumns /*b4j.example.wixrow*/ (_w7._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 117;BA.debugLine="R3.AddColumns(CreateMap(\"width\":10))";
_r3._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 118;BA.debugLine="Dim w8 As WixChart";
_w8 = new b4j.example.wixchart();
 //BA.debugLineNum = 119;BA.debugLine="w8.Initialize(\"\").SetTypeSpline(\"\").SetValue(\"#co";
_w8._initialize /*b4j.example.wixchart*/ (ba,"")._settypespline /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setlabel /*b4j.example.wixchart*/ ("#count#")._setcolor /*b4j.example.wixchart*/ ("#color#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 120;BA.debugLine="w8.SetXAxisTemplate(\"#type#\")";
_w8._setxaxistemplate /*b4j.example.wixchart*/ ("#type#");
 //BA.debugLineNum = 121;BA.debugLine="R3.AddColumns(w8.Item)";
_r3._addcolumns /*b4j.example.wixrow*/ (_w8._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 125;BA.debugLine="R3.AddColumns(CreateMap(\"width\":10))";
_r3._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("width"),(Object)(10)}));
 //BA.debugLineNum = 126;BA.debugLine="Dim w9 As WixChart";
_w9 = new b4j.example.wixchart();
 //BA.debugLineNum = 127;BA.debugLine="w9.Initialize(\"\").SetStackedBarH(\"\").SetValue(\"#c";
_w9._initialize /*b4j.example.wixchart*/ (ba,"")._setstackedbarh /*b4j.example.wixchart*/ ("")._setvalue /*b4j.example.wixchart*/ ("#count#")._setlabel /*b4j.example.wixchart*/ ("#count#")._setcolor /*b4j.example.wixchart*/ ("#color#")._setwidth /*b4j.example.wixchart*/ ((int) (300))._setheight /*b4j.example.wixchart*/ ((int) (200))._setdata /*b4j.example.wixchart*/ (_chartdata);
 //BA.debugLineNum = 128;BA.debugLine="w9.SetRadius(10).SetShadow(\"falling\").SetYAxisTem";
_w9._setradius /*b4j.example.wixchart*/ ((int) (10))._setshadow /*b4j.example.wixchart*/ ((int)(Double.parseDouble("falling")))._setyaxistemplate /*b4j.example.wixchart*/ ("#type#");
 //BA.debugLineNum = 129;BA.debugLine="R3.AddColumns(w9.Item)";
_r3._addcolumns /*b4j.example.wixrow*/ (_w9._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 130;BA.debugLine="R3.AddColumns(CreateMap())";
_r3._addcolumns /*b4j.example.wixrow*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {}));
 //BA.debugLineNum = 132;BA.debugLine="pg.Page.AddRow(R3)";
_pg._page /*b4j.example.wixelement*/ ._addrow /*String*/ (_r3);
 //BA.debugLineNum = 133;BA.debugLine="pg.Page.AddRows(CreateMap(\"height\":10))";
_pg._page /*b4j.example.wixelement*/ ._addrows /*b4j.example.wixelement*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("height"),(Object)(10)}));
 //BA.debugLineNum = 136;BA.debugLine="pg.ui";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
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
