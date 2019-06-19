package b4j.example;


import anywheresoftware.b4a.BA;

public class pgindex extends Object{
public static pgindex mostCurrent = new pgindex();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgindex", null);
		ba.loadHtSubs(pgindex.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgindex", ba);
		}
	}
    public static Class<?> getObject() {
		return pgindex.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.wixpage _pg = null;
public static b4j.example.wixlist _mylist = null;
public static b4j.example.wixform _myform = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgcharts _pgcharts = null;
public static b4j.example.pgdataentry _pgdataentry = null;
public static b4j.example.pgforms1 _pgforms1 = null;
public static b4j.example.pgforms _pgforms = null;
public static b4j.example.pgtoolbar _pgtoolbar = null;
public static b4j.example.pgmultiview _pgmultiview = null;
public static b4j.example.pglayouts1 _pglayouts1 = null;
public static b4j.example.pglayouts2 _pglayouts2 = null;
public static b4j.example.pglayouts _pglayouts = null;
public static b4j.example.pgdatatable _pgdatatable = null;
public static b4j.example.pglayout _pglayout = null;
public static String  _clear_form() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub clear_form";
 //BA.debugLineNum = 163;BA.debugLine="pg.Clear(\"myform\")";
_pg._clear /*String*/ ("myform");
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public static String  _delete_row(com.ab.banano.BANanoEvent _e) throws Exception{
String _recid = "";
 //BA.debugLineNum = 150;BA.debugLine="Sub delete_row(e As BANanoEvent)";
 //BA.debugLineNum = 152;BA.debugLine="Dim recID As String = pg.GetSelectedID(\"myList\")";
_recid = _pg._getselectedid /*String*/ ("myList");
 //BA.debugLineNum = 153;BA.debugLine="If recID = \"\" Then Return";
if ((_recid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 155;BA.debugLine="pg.Remove(\"myList\",recID)";
_pg._remove /*String*/ ("myList",_recid);
 //BA.debugLineNum = 157;BA.debugLine="pg.Clear(\"myform\")";
_pg._clear /*String*/ ("myform");
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
b4j.example.wixrow _r1 = null;
b4j.example.wixheader _hdr = null;
b4j.example.wixtoolbar _tblbar = null;
b4j.example.wixbutton _btnsave = null;
b4j.example.wixbutton _btndelete = null;
b4j.example.wixbutton _btnclear = null;
b4j.example.wixbutton _btnforms = null;
b4j.example.wixbutton _btnform1 = null;
b4j.example.wixbutton _btndt = null;
b4j.example.wixicon _btndown = null;
b4j.example.wixicon _btnup = null;
b4j.example.wixrow _r2 = null;
b4j.example.wixcolumn _r2c1 = null;
b4j.example.wixtextbox _title = null;
b4j.example.wixtextbox _year = null;
b4j.example.wixcolumn _r2c2 = null;
anywheresoftware.b4a.objects.collections.List _filmset = null;
String _recid = "";
 //BA.debugLineNum = 9;BA.debugLine="Sub Init()";
 //BA.debugLineNum = 10;BA.debugLine="pg.Initialize(\"mashy\")";
_pg._initialize /*b4j.example.wixpage*/ (ba,"mashy");
 //BA.debugLineNum = 11;BA.debugLine="pg.Page.SetType(\"line\")";
_pg._page /*b4j.example.wixelement*/ ._settype /*b4j.example.wixelement*/ ("line");
 //BA.debugLineNum = 14;BA.debugLine="Dim R1 As WixRow";
_r1 = new b4j.example.wixrow();
 //BA.debugLineNum = 15;BA.debugLine="R1.Initialize(\"R1\")";
_r1._initialize /*b4j.example.wixrow*/ (ba,"R1");
 //BA.debugLineNum = 18;BA.debugLine="Dim hdr As WixHeader";
_hdr = new b4j.example.wixheader();
 //BA.debugLineNum = 19;BA.debugLine="hdr.Initialize(\"hdr\")";
_hdr._initialize /*b4j.example.wixheader*/ (ba,"hdr");
 //BA.debugLineNum = 20;BA.debugLine="hdr.Header.SetTemplate(\"My First Webix App\")";
_hdr._header /*b4j.example.wixelement*/ ._settemplate /*b4j.example.wixelement*/ ("My First Webix App");
 //BA.debugLineNum = 21;BA.debugLine="hdr.Header.AddToRow(R1)";
_hdr._header /*b4j.example.wixelement*/ ._addtorow /*String*/ (_r1);
 //BA.debugLineNum = 23;BA.debugLine="Dim tblBar As WixToolBar";
_tblbar = new b4j.example.wixtoolbar();
 //BA.debugLineNum = 24;BA.debugLine="tblBar.Initialize(\"tblBar\")";
_tblbar._initialize /*b4j.example.wixtoolbar*/ (ba,"tblBar");
 //BA.debugLineNum = 26;BA.debugLine="Dim btnSave As WixButton";
_btnsave = new b4j.example.wixbutton();
 //BA.debugLineNum = 27;BA.debugLine="btnSave.Initialize(\"btnSave\").SetLabel(\"Save\").Se";
_btnsave._initialize /*b4j.example.wixbutton*/ (ba,"btnSave")._setlabel /*b4j.example.wixbutton*/ ("Save")._settypeform /*b4j.example.wixbutton*/ ("")._setwidth /*b4j.example.wixbutton*/ ((int) (70))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgindex.getObject(),"save_row",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 29;BA.debugLine="Dim btnDelete As WixButton";
_btndelete = new b4j.example.wixbutton();
 //BA.debugLineNum = 30;BA.debugLine="btnDelete.Initialize(\"btnDelete\").SetTypeDanger(\"";
_btndelete._initialize /*b4j.example.wixbutton*/ (ba,"btnDelete")._settypedanger /*b4j.example.wixbutton*/ ("")._setlabel /*b4j.example.wixbutton*/ ("Delete")._setwidth /*b4j.example.wixbutton*/ ((int) (70))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgindex.getObject(),"delete_row",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 32;BA.debugLine="Dim btnClear As WixButton";
_btnclear = new b4j.example.wixbutton();
 //BA.debugLineNum = 33;BA.debugLine="btnClear.Initialize(\"btnClear\").SetLabel(\"Clear\")";
_btnclear._initialize /*b4j.example.wixbutton*/ (ba,"btnClear")._setlabel /*b4j.example.wixbutton*/ ("Clear")._setwidth /*b4j.example.wixbutton*/ ((int) (100))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgindex.getObject(),"clear_form",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 35;BA.debugLine="Dim btnForms As WixButton";
_btnforms = new b4j.example.wixbutton();
 //BA.debugLineNum = 36;BA.debugLine="btnForms.Initialize(\"btnForms\").SetLabel(\"Forms 1";
_btnforms._initialize /*b4j.example.wixbutton*/ (ba,"btnForms")._setlabel /*b4j.example.wixbutton*/ ("Forms 1")._setwidth /*b4j.example.wixbutton*/ ((int) (100))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgindex.getObject(),"webxix_forms",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 38;BA.debugLine="Dim btnForm1 As WixButton";
_btnform1 = new b4j.example.wixbutton();
 //BA.debugLineNum = 39;BA.debugLine="btnForm1.Initialize(\"btnForms1\").SetLabel(\"Forms";
_btnform1._initialize /*b4j.example.wixbutton*/ (ba,"btnForms1")._setlabel /*b4j.example.wixbutton*/ ("Forms 2")._setwidth /*b4j.example.wixbutton*/ ((int) (100))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgindex.getObject(),"webxix_forms1",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 41;BA.debugLine="Dim btnDT As WixButton";
_btndt = new b4j.example.wixbutton();
 //BA.debugLineNum = 42;BA.debugLine="btnDT.Initialize(\"btnDT\").SetLabel(\"DataTable\").S";
_btndt._initialize /*b4j.example.wixbutton*/ (ba,"btnDT")._setlabel /*b4j.example.wixbutton*/ ("DataTable")._setwidth /*b4j.example.wixbutton*/ ((int) (100))._setclick /*b4j.example.wixbutton*/ ((com.ab.banano.BANanoObject)(_banano.CallBack(pgindex.getObject(),"webxix_datatable",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))))._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 44;BA.debugLine="tblBar.AddSpacer";
_tblbar._addspacer /*b4j.example.wixtoolbar*/ ();
 //BA.debugLineNum = 46;BA.debugLine="Dim btnDown As WixIcon";
_btndown = new b4j.example.wixicon();
 //BA.debugLineNum = 47;BA.debugLine="btnDown.Initialize(\"btnDown\").SetIcon(\"wxi-angle-";
_btndown._initialize /*b4j.example.wixicon*/ (ba,"btnDown")._seticon /*b4j.example.wixicon*/ ("wxi-angle-down")._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 49;BA.debugLine="Dim btnUp As WixIcon";
_btnup = new b4j.example.wixicon();
 //BA.debugLineNum = 50;BA.debugLine="btnUp.Initialize(\"btnUp\").SetIcon(\"wxi-angle-up\")";
_btnup._initialize /*b4j.example.wixicon*/ (ba,"btnUp")._seticon /*b4j.example.wixicon*/ ("wxi-angle-up")._addtotoolbar /*String*/ (_tblbar);
 //BA.debugLineNum = 58;BA.debugLine="tblBar.Toolbar.AddToRow(R1)";
_tblbar._toolbar /*b4j.example.wixelement*/ ._addtorow /*String*/ (_r1);
 //BA.debugLineNum = 60;BA.debugLine="R1.AddToPage(pg)";
_r1._addtopage /*String*/ (_pg);
 //BA.debugLineNum = 62;BA.debugLine="Dim R2 As WixRow";
_r2 = new b4j.example.wixrow();
 //BA.debugLineNum = 63;BA.debugLine="R2.Initialize(\"R2\")";
_r2._initialize /*b4j.example.wixrow*/ (ba,"R2");
 //BA.debugLineNum = 65;BA.debugLine="Dim R2C1 As WixColumn";
_r2c1 = new b4j.example.wixcolumn();
 //BA.debugLineNum = 66;BA.debugLine="R2C1.Initialize(\"R2C1\")";
_r2c1._initialize /*b4j.example.wixcolumn*/ (ba,"R2C1");
 //BA.debugLineNum = 70;BA.debugLine="myForm.Initialize(\"myform\").SetWidth(500)";
_myform._initialize /*b4j.example.wixform*/ (ba,"myform")._setwidth /*b4j.example.wixform*/ ((int) (500));
 //BA.debugLineNum = 72;BA.debugLine="Dim title As WixTextBox";
_title = new b4j.example.wixtextbox();
 //BA.debugLineNum = 73;BA.debugLine="title.Initialize(\"title\").SetLabel(\"Title\").AddTo";
_title._initialize /*b4j.example.wixtextbox*/ (ba,"title")._setlabel /*b4j.example.wixtextbox*/ ("Title")._addtoform /*String*/ (_myform);
 //BA.debugLineNum = 75;BA.debugLine="Dim year As WixTextBox";
_year = new b4j.example.wixtextbox();
 //BA.debugLineNum = 76;BA.debugLine="year.Initialize(\"year\").SetLabel(\"Year\").AddToFor";
_year._initialize /*b4j.example.wixtextbox*/ (ba,"year")._setlabel /*b4j.example.wixtextbox*/ ("Year")._addtoform /*String*/ (_myform);
 //BA.debugLineNum = 78;BA.debugLine="myForm.AddToColumn(R2C1)";
_myform._addtocolumn /*String*/ (_r2c1);
 //BA.debugLineNum = 80;BA.debugLine="R2C1.AddToRow(R2)";
_r2c1._addtorow /*String*/ (_r2);
 //BA.debugLineNum = 82;BA.debugLine="Dim R2C2 As WixColumn";
_r2c2 = new b4j.example.wixcolumn();
 //BA.debugLineNum = 83;BA.debugLine="R2C2.Initialize(\"R2C2\")";
_r2c2._initialize /*b4j.example.wixcolumn*/ (ba,"R2C2");
 //BA.debugLineNum = 87;BA.debugLine="Dim filmset As List";
_filmset = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 88;BA.debugLine="filmset.Initialize";
_filmset.Initialize();
 //BA.debugLineNum = 89;BA.debugLine="filmset.Add(CreateMap(\"id\":1, \"title\":\"The Shawsh";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("title"),(Object)("The Shawshank Redemption"),(Object)("year"),(Object)(1994)}).getObject()));
 //BA.debugLineNum = 90;BA.debugLine="filmset.Add(CreateMap(\"id\":2, \"title\":\"The Godfat";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("title"),(Object)("The Godfather"),(Object)("year"),(Object)(1972)}).getObject()));
 //BA.debugLineNum = 91;BA.debugLine="filmset.Add(CreateMap(\"id\":3, \"title\":\"The Godfat";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("title"),(Object)("The Godfather: Part II"),(Object)("year"),(Object)(1974)}).getObject()));
 //BA.debugLineNum = 92;BA.debugLine="filmset.Add(CreateMap(\"id\":4, \"title\":\"The Good,";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("title"),(Object)("The Good, the Bad and the Ugly"),(Object)("year"),(Object)(1966)}).getObject()));
 //BA.debugLineNum = 93;BA.debugLine="filmset.Add(CreateMap(\"id\":5, \"title\":\"My Fair La";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(5),(Object)("title"),(Object)("My Fair Lady"),(Object)("year"),(Object)(1964)}).getObject()));
 //BA.debugLineNum = 94;BA.debugLine="filmset.Add(CreateMap(\"id\":6, \"title\":\"12 Angry M";
_filmset.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(6),(Object)("title"),(Object)("12 Angry Men"),(Object)("year"),(Object)(1957)}).getObject()));
 //BA.debugLineNum = 97;BA.debugLine="Dim recID As String";
_recid = "";
 //BA.debugLineNum = 98;BA.debugLine="myList.Initialize(\"myList\").SetTemplate(\"#title#";
_mylist._initialize /*b4j.example.wixlist*/ (ba,"myList")._settemplate /*b4j.example.wixlist*/ ("#title# - #year#")._setenableselect /*b4j.example.wixlist*/ (anywheresoftware.b4a.keywords.Common.True)._setheight /*b4j.example.wixlist*/ (BA.NumberToString(400))._setdata /*b4j.example.wixlist*/ (_filmset)._addtocolumn /*String*/ (_r2c2);
 //BA.debugLineNum = 100;BA.debugLine="R2C2.AddToRow(R2)";
_r2c2._addtorow /*String*/ (_r2);
 //BA.debugLineNum = 102;BA.debugLine="R2.AddToPage(pg)";
_r2._addtopage /*String*/ (_pg);
 //BA.debugLineNum = 104;BA.debugLine="pg.UI";
_pg._ui /*String*/ ();
 //BA.debugLineNum = 106;BA.debugLine="pg.AttachAfterSelectEvent(\"myList\", BANano.CallBa";
_pg._attachafterselectevent /*String*/ ("myList",(com.ab.banano.BANanoObject)(_banano.CallBack(pgindex.getObject(),"record_selected",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_recid)}))));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pg As WixPage";
_pg = new b4j.example.wixpage();
 //BA.debugLineNum = 4;BA.debugLine="Public myList As WixList";
_mylist = new b4j.example.wixlist();
 //BA.debugLineNum = 5;BA.debugLine="Public myForm As WixForm";
_myform = new b4j.example.wixform();
 //BA.debugLineNum = 6;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _record_selected(String _id) throws Exception{
anywheresoftware.b4a.objects.collections.Map _record = null;
 //BA.debugLineNum = 126;BA.debugLine="Sub record_selected(id As String)";
 //BA.debugLineNum = 128;BA.debugLine="Dim record As Map = pg.GetItem(\"myList\", id)";
_record = new anywheresoftware.b4a.objects.collections.Map();
_record = _pg._getitem /*anywheresoftware.b4a.objects.collections.Map*/ ("myList",_id);
 //BA.debugLineNum = 130;BA.debugLine="pg.SetValues(\"myform\", record)";
_pg._setvalues /*String*/ ("myform",_record);
 //BA.debugLineNum = 131;BA.debugLine="pg.Message(BANano.ToJson(record))";
_pg._message /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_record.getObject()))));
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public static String  _save_row(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.Map _values = null;
String _recid = "";
 //BA.debugLineNum = 135;BA.debugLine="Sub save_row(e As BANanoEvent)";
 //BA.debugLineNum = 137;BA.debugLine="Dim values As Map = pg.GetValues(\"myform\")";
_values = new anywheresoftware.b4a.objects.collections.Map();
_values = _pg._getvalues /*anywheresoftware.b4a.objects.collections.Map*/ ("myform");
 //BA.debugLineNum = 139;BA.debugLine="Dim recID As String = values.GetDefault(\"id\",\"\")";
_recid = BA.ObjectToString(_values.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 140;BA.debugLine="If recID = \"\" Then";
if ((_recid).equals("")) { 
 //BA.debugLineNum = 142;BA.debugLine="pg.Add(\"myList\", values)";
_pg._add /*String*/ ("myList",_values);
 }else {
 //BA.debugLineNum = 145;BA.debugLine="pg.Update(\"myList\", recID, values)";
_pg._update /*String*/ ("myList",_recid,_values);
 };
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public static String  _webxix_datatable() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub webxix_datatable()";
 //BA.debugLineNum = 112;BA.debugLine="pgDataTable.init";
_pgdatatable._init /*String*/ ();
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public static String  _webxix_forms() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub webxix_forms()";
 //BA.debugLineNum = 117;BA.debugLine="pgForms.Init";
_pgforms._init /*String*/ ();
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _webxix_forms1() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub webxix_forms1()";
 //BA.debugLineNum = 122;BA.debugLine="pgForms1.Init";
_pgforms1._init /*String*/ ();
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
}
