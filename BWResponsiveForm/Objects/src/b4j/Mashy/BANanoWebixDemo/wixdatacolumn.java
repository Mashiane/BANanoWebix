package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdatacolumn extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixdatacolumn", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixdatacolumn.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _datacolumn = null;
public anywheresoftware.b4a.objects.collections.Map _hdr = null;
public Object _title = null;
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public boolean _hasfilter = false;
public anywheresoftware.b4a.objects.collections.Map _foot = null;
public boolean _hasfooterfilter = false;
public Object _footertitle = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public boolean _keepsequence = false;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 674;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 675;BA.debugLine="P.AddDataColumn(Item)";
_p._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 676;BA.debugLine="End Sub";
return "";
}
public String  _addtodatacolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 678;BA.debugLine="Sub AddToDataColumns(P As WixElement)";
 //BA.debugLineNum = 679;BA.debugLine="P.AddDataColumn(Item)";
_p._adddatacolumn /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 680;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 684;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 685;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 669;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 670;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 671;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DataColumn As WixElement";
_datacolumn = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private hdr As Map";
_hdr = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private title As Object";
_title = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Private Styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Private hasFilter As Boolean";
_hasfilter = false;
 //BA.debugLineNum = 9;BA.debugLine="Private foot As Map";
_foot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private hasFooterFilter As Boolean";
_hasfooterfilter = false;
 //BA.debugLineNum = 11;BA.debugLine="Private Footertitle As Object";
_footertitle = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 13;BA.debugLine="Private keepSequence As Boolean";
_keepsequence = false;
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _initialize(anywheresoftware.b4a.BA _ba,String _cid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Initialize(cID As String) As WixDataCol";
 //BA.debugLineNum = 57;BA.debugLine="ID = cID.tolowercase";
_id = _cid.toLowerCase();
 //BA.debugLineNum = 58;BA.debugLine="DataColumn.Initialize(ID)";
_datacolumn._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id);
 //BA.debugLineNum = 59;BA.debugLine="hdr.Initialize";
_hdr.Initialize();
 //BA.debugLineNum = 60;BA.debugLine="title = \"\"";
_title = (Object)("");
 //BA.debugLineNum = 61;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 62;BA.debugLine="hasFilter = False";
_hasfilter = __c.False;
 //BA.debugLineNum = 63;BA.debugLine="foot.Initialize";
_foot.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="hasFooterFilter = False";
_hasfooterfilter = __c.False;
 //BA.debugLineNum = 65;BA.debugLine="Footertitle = \"\"";
_footertitle = (Object)("");
 //BA.debugLineNum = 66;BA.debugLine="keepSequence = False";
_keepsequence = __c.False;
 //BA.debugLineNum = 67;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 626;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 627;BA.debugLine="If Styles.Size > 0 Then";
if (_styles.getSize()>0) { 
 //BA.debugLineNum = 628;BA.debugLine="hdr.Put(\"css\", Styles)";
_hdr.Put((Object)("css"),(Object)(_styles.getObject()));
 };
 //BA.debugLineNum = 630;BA.debugLine="If hdr.Size > 0 Then";
if (_hdr.getSize()>0) { 
 //BA.debugLineNum = 631;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 632;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 633;BA.debugLine="If hasFilter Then";
if (_hasfilter) { 
 //BA.debugLineNum = 634;BA.debugLine="lst.Add(title)";
_lst.Add(_title);
 //BA.debugLineNum = 635;BA.debugLine="lst.Add(hdr)";
_lst.Add((Object)(_hdr.getObject()));
 }else {
 //BA.debugLineNum = 637;BA.debugLine="If keepSequence = False Then";
if (_keepsequence==__c.False) { 
 //BA.debugLineNum = 638;BA.debugLine="lst.Add(hdr)";
_lst.Add((Object)(_hdr.getObject()));
 //BA.debugLineNum = 639;BA.debugLine="lst.Add(title)";
_lst.Add(_title);
 }else {
 //BA.debugLineNum = 641;BA.debugLine="lst.Add(title)";
_lst.Add(_title);
 //BA.debugLineNum = 642;BA.debugLine="lst.Add(hdr)";
_lst.Add((Object)(_hdr.getObject()));
 };
 };
 //BA.debugLineNum = 645;BA.debugLine="DataColumn.SetAttr(\"header\", lst)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("header",(Object)(_lst.getObject()));
 }else {
 //BA.debugLineNum = 647;BA.debugLine="DataColumn.SetAttr(\"header\", title)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("header",_title);
 };
 //BA.debugLineNum = 650;BA.debugLine="If foot.Size > 0 Then";
if (_foot.getSize()>0) { 
 //BA.debugLineNum = 651;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 652;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 653;BA.debugLine="If hasFooterFilter Then";
if (_hasfooterfilter) { 
 //BA.debugLineNum = 654;BA.debugLine="lst.Add(Footertitle)";
_lst.Add(_footertitle);
 //BA.debugLineNum = 655;BA.debugLine="lst.Add(foot)";
_lst.Add((Object)(_foot.getObject()));
 }else {
 //BA.debugLineNum = 657;BA.debugLine="lst.Add(foot)";
_lst.Add((Object)(_foot.getObject()));
 //BA.debugLineNum = 658;BA.debugLine="lst.Add(Footertitle)";
_lst.Add(_footertitle);
 };
 //BA.debugLineNum = 660;BA.debugLine="DataColumn.SetAttr(\"footer\", lst)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("footer",(Object)(_lst.getObject()));
 }else {
 //BA.debugLineNum = 662;BA.debugLine="DataColumn.SetAttr(\"footer\", Footertitle)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("footer",_footertitle);
 };
 //BA.debugLineNum = 664;BA.debugLine="Return DataColumn.item";
if (true) return _datacolumn._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 73;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setadjust(Object _a) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetAdjust(a As Object) As WixDataColumn";
 //BA.debugLineNum = 179;BA.debugLine="DataColumn.SetAttr(\"adjust\", a)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("adjust",_a);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setadjustdata(boolean _b) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetAdjustData(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 204;BA.debugLine="SetAdjust(\"data\")";
_setadjust((Object)("data"));
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setadjustheader(boolean _b) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetAdjustHeader(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 198;BA.debugLine="SetAdjust(\"header\")";
_setadjust((Object)("header"));
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setalign(Object _r) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetAlign(r As Object) As WixDataColumn";
 //BA.debugLineNum = 161;BA.debugLine="DataColumn.SetStyle(\"text-align\", r)";
_datacolumn._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("text-align",BA.ObjectToString(_r));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setaligncenter(boolean _b) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetAlignCenter(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 173;BA.debugLine="DataColumn.SetStyle(\"text-align\", \"center\")";
_datacolumn._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("text-align","center");
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setalignright(boolean _b) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetAlignRight(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 167;BA.debugLine="DataColumn.SetStyle(\"text-align\", \"right\")";
_datacolumn._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("text-align","right");
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetAttributes(m As Map) As WixDataColumn";
 //BA.debugLineNum = 41;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 42;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 43;BA.debugLine="DataColumn.SetAttr(k,v)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetBatch(b As Int) As WixDataColumn";
 //BA.debugLineNum = 150;BA.debugLine="DataColumn.SetAttr(\"batch\", b)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("batch",(Object)(_b));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setcheckbox(boolean _b) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub SetCheckBox(b As Boolean) As WixDataColumn		'i";
 //BA.debugLineNum = 391;BA.debugLine="SetTemplate(\"{common.checkbox()}\")";
_settemplate((Object)("{common.checkbox()}"));
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setcheckvalue(Object _v) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetCheckValue(v As Object) As WixDataColumn";
 //BA.debugLineNum = 372;BA.debugLine="DataColumn.SetAttr(\"checkValue\", v)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("checkValue",_v);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setcollection(Object _s) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub SetCollection(s As Object) As WixDataColumn";
 //BA.debugLineNum = 497;BA.debugLine="DataColumn.SetAttr(\"collection\", s)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("collection",_s);
 //BA.debugLineNum = 498;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setcss(Object _c) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetCSS(c As Object) As WixDataColumn";
 //BA.debugLineNum = 329;BA.debugLine="DataColumn.SetAttr(\"css\", c)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_c);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setcssjson(String _json) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetCSSJSON(json As String) As WixDataColumn";
 //BA.debugLineNum = 347;BA.debugLine="DataColumn.SetCSSJSON(json)";
_datacolumn._setcssjson /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_json);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditaction(String _e) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetEditAction(e As String) As WixDataColumn";
 //BA.debugLineNum = 235;BA.debugLine="DataColumn.SetAttr(\"editaction\", e)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editaction",(Object)(_e));
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditactionclick(boolean _e) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetEditActionClick(e As Boolean) As WixDataCol";
 //BA.debugLineNum = 241;BA.debugLine="DataColumn.SetAttr(\"editaction\", \"click\")";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editaction",(Object)("click"));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditactioncustom(boolean _e) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetEditActionCustom(e As Boolean) As WixDataCo";
 //BA.debugLineNum = 247;BA.debugLine="DataColumn.SetAttr(\"editaction\", \"custom\")";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editaction",(Object)("custom"));
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditactiondblclick(boolean _e) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetEditActionDblClick(e As Boolean) As WixData";
 //BA.debugLineNum = 254;BA.debugLine="DataColumn.SetAttr(\"editaction\", \"dblclick\")";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editaction",(Object)("dblclick"));
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditor(String _e) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetEditor(e As String) As WixDataColumn";
 //BA.debugLineNum = 229;BA.debugLine="DataColumn.SetAttr(\"editor\", e)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("editor",(Object)(_e));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditorcheckbox(String _r) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetEditorCheckBox(r As String) As WixDataColum";
 //BA.debugLineNum = 323;BA.debugLine="SetEditor(\"checkbox\")";
_seteditor("checkbox");
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditorcolor(String _r) throws Exception{
String _val = "";
b4j.Mashy.BANanoWebixDemo.uoenowhtml _ct = null;
 //BA.debugLineNum = 266;BA.debugLine="Sub SetEditorColor(r As String) As WixDataColumn";
 //BA.debugLineNum = 267;BA.debugLine="SetEditor(\"color\")";
_seteditor("color");
 //BA.debugLineNum = 268;BA.debugLine="Dim val As String = \"#\" & ID & \"#\"";
_val = "#"+_id+"#";
 //BA.debugLineNum = 269;BA.debugLine="Dim ct As UOENowHTML";
_ct = new b4j.Mashy.BANanoWebixDemo.uoenowhtml();
 //BA.debugLineNum = 270;BA.debugLine="ct.Initialize(\"\",\"span\").SetImportant(False)";
_ct._initialize /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (ba,"","span")._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 271;BA.debugLine="ct.SetStyle(\"background-color\",val)";
_ct._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("background-color",_val);
 //BA.debugLineNum = 272;BA.debugLine="ct.SetStyle(\"border-radius\", \"4px\")";
_ct._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("border-radius","4px");
 //BA.debugLineNum = 273;BA.debugLine="ct.SetStyle(\"padding-right\",\"10px\")";
_ct._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("padding-right","10px");
 //BA.debugLineNum = 274;BA.debugLine="ct.AddContent(\"&nbsp&nbsp\").AddContentAfter(val)";
_ct._addcontent /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("&nbsp&nbsp")._addcontentafter /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_val);
 //BA.debugLineNum = 275;BA.debugLine="SetTemplateHTML(ct)";
_settemplatehtml(_ct);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditorcombo(String _r) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetEditorCombo(r As String) As WixDataColumn";
 //BA.debugLineNum = 311;BA.debugLine="SetEditor(\"combo\")";
_seteditor("combo");
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditordate(String _r) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetEditorDate(r As String) As WixDataColumn";
 //BA.debugLineNum = 293;BA.debugLine="SetEditor(\"date\")";
_seteditor("date");
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditorinlinecheckbox(String _r) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetEditorInlineCheckBox(r As String) As WixDat";
 //BA.debugLineNum = 354;BA.debugLine="SetEditor(\"inline-checkbox\")";
_seteditor("inline-checkbox");
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditorinlinetext(String _r) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetEditorInlineText(r As String) As WixDataCol";
 //BA.debugLineNum = 299;BA.debugLine="SetEditor(\"inline-text\")";
_seteditor("inline-text");
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditorpassword(String _r) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetEditorPassword(r As String) As WixDataColum";
 //BA.debugLineNum = 287;BA.debugLine="SetEditor(\"password\")";
_seteditor("password");
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditorpopup(String _e) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetEditorPopUp(e As String) As WixDataColumn";
 //BA.debugLineNum = 261;BA.debugLine="SetEditor(\"popup\")";
_seteditor("popup");
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditorrichselect(String _r) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetEditorRichSelect(r As String) As WixDataCol";
 //BA.debugLineNum = 317;BA.debugLine="SetEditor(\"richselect\")";
_seteditor("richselect");
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditorselect(String _r) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetEditorSelect(r As String) As WixDataColumn";
 //BA.debugLineNum = 305;BA.debugLine="SetEditor(\"select\")";
_seteditor("select");
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _seteditortext(String _r) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetEditorText(r As String) As WixDataColumn";
 //BA.debugLineNum = 281;BA.debugLine="SetEditor(\"text\")";
_seteditor("text");
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfillspace(Object _s) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetFillSpace(s As Object) As WixDataColumn";
 //BA.debugLineNum = 360;BA.debugLine="DataColumn.SetAttr(\"fillspace\", s)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("fillspace",_s);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfooter(Object _h) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetFooter(h As Object) As WixDataColumn";
 //BA.debugLineNum = 216;BA.debugLine="Footertitle = h";
_footertitle = _h;
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfooterautoheight(Object _c) throws Exception{
 //BA.debugLineNum = 609;BA.debugLine="Sub SetFooterAutoHeight(c As Object) As WixDataCol";
 //BA.debugLineNum = 610;BA.debugLine="foot.Put(\"autoheight\", c)";
_foot.Put((Object)("autoheight"),_c);
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfootercolspan(Object _c) throws Exception{
 //BA.debugLineNum = 575;BA.debugLine="Sub SetFooterColSpan(c As Object) As WixDataColumn";
 //BA.debugLineNum = 576;BA.debugLine="foot.Put(\"colspan\", c)";
_foot.Put((Object)("colspan"),_c);
 //BA.debugLineNum = 577;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 578;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfootercontent(Object _c) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub SetFooterContent(c As Object) As WixDataColumn";
 //BA.debugLineNum = 435;BA.debugLine="foot.Put(\"content\", c)";
_foot.Put((Object)("content"),_c);
 //BA.debugLineNum = 436;BA.debugLine="hasFooterFilter = True";
_hasfooterfilter = __c.True;
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfootercss(Object _c) throws Exception{
 //BA.debugLineNum = 563;BA.debugLine="Sub SetFooterCSS(c As Object) As WixDataColumn";
 //BA.debugLineNum = 564;BA.debugLine="foot.put(\"css\", c)";
_foot.Put((Object)("css"),_c);
 //BA.debugLineNum = 565;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 566;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfooterdatefilter(boolean _b) throws Exception{
 //BA.debugLineNum = 468;BA.debugLine="Sub SetFooterDateFilter(b As Boolean) As WixDataCo";
 //BA.debugLineNum = 469;BA.debugLine="foot.Put(\"content\", \"dateFilter\")";
_foot.Put((Object)("content"),(Object)("dateFilter"));
 //BA.debugLineNum = 470;BA.debugLine="hasFooterFilter = True";
_hasfooterfilter = __c.True;
 //BA.debugLineNum = 471;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfooterheight(Object _c) throws Exception{
 //BA.debugLineNum = 620;BA.debugLine="Sub SetFooterHeight(c As Object) As WixDataColumn";
 //BA.debugLineNum = 621;BA.debugLine="foot.Put(\"height\", c)";
_foot.Put((Object)("height"),_c);
 //BA.debugLineNum = 622;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfooternumberfilter(boolean _b) throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub SetFooterNumberFilter(b As Boolean) As WixData";
 //BA.debugLineNum = 455;BA.debugLine="foot.Put(\"content\", \"numberFilter\")";
_foot.Put((Object)("content"),(Object)("numberFilter"));
 //BA.debugLineNum = 456;BA.debugLine="hasFooterFilter = True";
_hasfooterfilter = __c.True;
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfooterrotate(Object _c) throws Exception{
 //BA.debugLineNum = 598;BA.debugLine="Sub SetFooterRotate(c As Object) As WixDataColumn";
 //BA.debugLineNum = 599;BA.debugLine="foot.Put(\"rotate\", c)";
_foot.Put((Object)("rotate"),_c);
 //BA.debugLineNum = 600;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfooterrowspan(Object _c) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Sub SetFooterRowSpan(c As Object) As WixDataColumn";
 //BA.debugLineNum = 588;BA.debugLine="foot.Put(\"rowspan\", c)";
_foot.Put((Object)("rowspan"),_c);
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfooterselectfilter(boolean _b) throws Exception{
 //BA.debugLineNum = 481;BA.debugLine="Sub SetFooterSelectFilter(b As Boolean) As WixData";
 //BA.debugLineNum = 482;BA.debugLine="foot.Put(\"content\", \"selectFilter\")";
_foot.Put((Object)("content"),(Object)("selectFilter"));
 //BA.debugLineNum = 483;BA.debugLine="hasFooterFilter = True";
_hasfooterfilter = __c.True;
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfootersummcolumn(boolean _b) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Sub SetFooterSummColumn(b As Boolean) As WixDataCo";
 //BA.debugLineNum = 442;BA.debugLine="foot.Put(\"content\", \"summColumn\")";
_foot.Put((Object)("content"),(Object)("summColumn"));
 //BA.debugLineNum = 443;BA.debugLine="hasFooterFilter = True";
_hasfooterfilter = __c.True;
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfootertext(Object _t) throws Exception{
 //BA.debugLineNum = 552;BA.debugLine="Sub SetFooterText(t As Object) As WixDataColumn";
 //BA.debugLineNum = 553;BA.debugLine="foot.Put(\"text\", t)";
_foot.Put((Object)("text"),_t);
 //BA.debugLineNum = 554;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 555;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setfootertextfilter(boolean _b) throws Exception{
 //BA.debugLineNum = 421;BA.debugLine="Sub SetFooterTextFilter(b As Boolean) As WixDataCo";
 //BA.debugLineNum = 422;BA.debugLine="foot.Put(\"content\", \"textFilter\")";
_foot.Put((Object)("content"),(Object)("textFilter"));
 //BA.debugLineNum = 423;BA.debugLine="hasFooterFilter = True";
_hasfooterfilter = __c.True;
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setformat(Object _s) throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Sub SetFormat(s As Object) As WixDataColumn";
 //BA.debugLineNum = 535;BA.debugLine="DataColumn.SetAttr(\"format\", s)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("format",_s);
 //BA.debugLineNum = 536;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheader(Object _h) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetHeader(h As Object) As WixDataColumn";
 //BA.debugLineNum = 210;BA.debugLine="title = h";
_title = _h;
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheaderautoheight(Object _c) throws Exception{
 //BA.debugLineNum = 604;BA.debugLine="Sub SetHeaderAutoHeight(c As Object) As WixDataCol";
 //BA.debugLineNum = 605;BA.debugLine="hdr.Put(\"autoheight\", c)";
_hdr.Put((Object)("autoheight"),_c);
 //BA.debugLineNum = 606;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheadercolspan(Object _c) throws Exception{
 //BA.debugLineNum = 570;BA.debugLine="Sub SetHeaderColSpan(c As Object) As WixDataColumn";
 //BA.debugLineNum = 571;BA.debugLine="hdr.Put(\"colspan\", c)";
_hdr.Put((Object)("colspan"),_c);
 //BA.debugLineNum = 572;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheadercontent(Object _c) throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub SetHeaderContent(c As Object) As WixDataColumn";
 //BA.debugLineNum = 429;BA.debugLine="hdr.Put(\"content\", c)";
_hdr.Put((Object)("content"),_c);
 //BA.debugLineNum = 430;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheadercss(Object _c) throws Exception{
 //BA.debugLineNum = 558;BA.debugLine="Sub SetHeaderCSS(c As Object) As WixDataColumn";
 //BA.debugLineNum = 559;BA.debugLine="hdr.put(\"css\", c)";
_hdr.Put((Object)("css"),_c);
 //BA.debugLineNum = 560;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheaderdatefilter(boolean _b) throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Sub SetHeaderDateFilter(b As Boolean) As WixDataCo";
 //BA.debugLineNum = 463;BA.debugLine="hdr.Put(\"content\", \"dateFilter\")";
_hdr.Put((Object)("content"),(Object)("dateFilter"));
 //BA.debugLineNum = 464;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheaderheight(Object _c) throws Exception{
 //BA.debugLineNum = 615;BA.debugLine="Sub SetHeaderHeight(c As Object) As WixDataColumn";
 //BA.debugLineNum = 616;BA.debugLine="hdr.Put(\"height\", c)";
_hdr.Put((Object)("height"),_c);
 //BA.debugLineNum = 617;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 618;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheadernumberfilter(boolean _b) throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub SetHeaderNumberFilter(b As Boolean) As WixData";
 //BA.debugLineNum = 449;BA.debugLine="hdr.Put(\"content\", \"numberFilter\")";
_hdr.Put((Object)("content"),(Object)("numberFilter"));
 //BA.debugLineNum = 450;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheaderrotate(Object _c) throws Exception{
 //BA.debugLineNum = 593;BA.debugLine="Sub SetHeaderRotate(c As Object) As WixDataColumn";
 //BA.debugLineNum = 594;BA.debugLine="hdr.Put(\"rotate\", c)";
_hdr.Put((Object)("rotate"),_c);
 //BA.debugLineNum = 595;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 596;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheaderrowspan(Object _c) throws Exception{
 //BA.debugLineNum = 582;BA.debugLine="Sub SetHeaderRowSpan(c As Object) As WixDataColumn";
 //BA.debugLineNum = 583;BA.debugLine="hdr.Put(\"rowspan\", c)";
_hdr.Put((Object)("rowspan"),_c);
 //BA.debugLineNum = 584;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheaderselectfilter(boolean _b) throws Exception{
 //BA.debugLineNum = 475;BA.debugLine="Sub SetHeaderSelectFilter(b As Boolean) As WixData";
 //BA.debugLineNum = 476;BA.debugLine="hdr.Put(\"content\", \"selectFilter\")";
_hdr.Put((Object)("content"),(Object)("selectFilter"));
 //BA.debugLineNum = 477;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheadersummcolumn(boolean _b) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub SetHeaderSummColumn(b As Boolean) As WixDataCo";
 //BA.debugLineNum = 408;BA.debugLine="hdr.Put(\"content\", \"summColumn\")";
_hdr.Put((Object)("content"),(Object)("summColumn"));
 //BA.debugLineNum = 409;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 410;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheadertext(Object _t) throws Exception{
 //BA.debugLineNum = 547;BA.debugLine="Sub SetHeaderText(t As Object) As WixDataColumn";
 //BA.debugLineNum = 548;BA.debugLine="hdr.Put(\"text\", t)";
_hdr.Put((Object)("text"),_t);
 //BA.debugLineNum = 549;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheadertextfilter(boolean _b) throws Exception{
 //BA.debugLineNum = 415;BA.debugLine="Sub SetHeaderTextFilter(b As Boolean) As WixDataCo";
 //BA.debugLineNum = 416;BA.debugLine="hdr.Put(\"content\", \"textFilter\")";
_hdr.Put((Object)("content"),(Object)("textFilter"));
 //BA.debugLineNum = 417;BA.debugLine="hasFilter = True";
_hasfilter = __c.True;
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetHeight(h As Int) As WixDataColumn";
 //BA.debugLineNum = 122;BA.debugLine="DataColumn.SetHeight(h)";
_datacolumn._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_h));
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetHidden(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 156;BA.debugLine="DataColumn.SetAttr(\"hidden\", b)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_b));
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setkeepsequence(boolean _b) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetKeepSequence(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 24;BA.debugLine="keepSequence = b";
_keepsequence = _b;
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setlabel(Object _c) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetLabel(c As Object) As WixDataColumn";
 //BA.debugLineNum = 341;BA.debugLine="DataColumn.SetAttr(\"label\", c)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("label",_c);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setliveedit(Object _a) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetLiveEdit(a As Object) As WixDataColumn";
 //BA.debugLineNum = 186;BA.debugLine="DataColumn.SetAttr(\"liveEdit\", a)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("liveEdit",_a);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 128;BA.debugLine="Sub SetMap(m As Map) As WixDataColumn";
 //BA.debugLineNum = 129;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 130;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 131;BA.debugLine="DataColumn.SetAttr(strKey,	strVal)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetMargin(margin As Object) As WixDataColumn";
 //BA.debugLineNum = 36;BA.debugLine="DataColumn.SetMargin(margin)";
_datacolumn._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setmastercheckbox(boolean _b) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub SetMasterCheckBox(b As Boolean) As WixDataColu";
 //BA.debugLineNum = 402;BA.debugLine="hdr.Put(\"content\", \"masterCheckbox\")";
_hdr.Put((Object)("content"),(Object)("masterCheckbox"));
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setmath(Object _a) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetMath(a As Object) As WixDataColumn";
 //BA.debugLineNum = 192;BA.debugLine="DataColumn.SetAttr(\"math\", a)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("math",_a);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetMinHeight(h As Int) As WixDataColumn";
 //BA.debugLineNum = 116;BA.debugLine="DataColumn.SetMinHeight(h)";
_datacolumn._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetMinWidth(w As Int) As WixDataColumn";
 //BA.debugLineNum = 110;BA.debugLine="DataColumn.SetMinWidth(w)";
_datacolumn._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setname(String _n) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetName(n As String) As WixDataColumn";
 //BA.debugLineNum = 97;BA.debugLine="DataColumn.SetName(n)";
_datacolumn._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setnumberformat(Object _n) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetNumberFormat(n As Object) As WixDataColumn";
 //BA.debugLineNum = 144;BA.debugLine="DataColumn.SetAttr(\"numberFormat\", n)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("numberFormat",_n);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setoptions(anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetOptions(options As List) As WixDataColumn";
 //BA.debugLineNum = 138;BA.debugLine="DataColumn.SetAttr(\"options\", options)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetPadding(padding As Object) As WixDataColumn";
 //BA.debugLineNum = 30;BA.debugLine="DataColumn.SetPadding(padding)";
_datacolumn._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetParent(p As WixElement) As WixDataColumn";
 //BA.debugLineNum = 18;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setradio(boolean _b) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetRadio(b As Boolean) As WixDataColumn			'ign";
 //BA.debugLineNum = 397;BA.debugLine="SetTemplate(\"{common.radio()}\")";
_settemplate((Object)("{common.radio()}"));
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetResponsive(b As Object) As WixDataColumn";
 //BA.debugLineNum = 85;BA.debugLine="DataColumn.SetResponsive(b)";
_datacolumn._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixDataColum";
 //BA.debugLineNum = 103;BA.debugLine="DataColumn.SetResponsiveCell(b)";
_datacolumn._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setsort(Object _s) throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Sub SetSort(s As Object) As WixDataColumn";
 //BA.debugLineNum = 490;BA.debugLine="DataColumn.SetAttr(\"sort\", s)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("sort",_s);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setsortdate(boolean _b) throws Exception{
 //BA.debugLineNum = 520;BA.debugLine="Sub SetSortDate(b As Boolean) As WixDataColumn   '";
 //BA.debugLineNum = 521;BA.debugLine="SetSort(\"date\")";
_setsort((Object)("date"));
 //BA.debugLineNum = 522;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setsortint(boolean _b) throws Exception{
 //BA.debugLineNum = 502;BA.debugLine="Sub SetSortInt(b As Boolean) As WixDataColumn   'i";
 //BA.debugLineNum = 503;BA.debugLine="SetSort(\"int\")";
_setsort((Object)("int"));
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setsortstring(boolean _b) throws Exception{
 //BA.debugLineNum = 508;BA.debugLine="Sub SetSortString(b As Boolean) As WixDataColumn";
 //BA.debugLineNum = 509;BA.debugLine="SetSort(\"string\")";
_setsort((Object)("string"));
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setsortstringstrict(boolean _b) throws Exception{
 //BA.debugLineNum = 514;BA.debugLine="Sub SetSortStringStrict(b As Boolean) As WixDataCo";
 //BA.debugLineNum = 515;BA.debugLine="SetSort(\"string_strict\")";
_setsort((Object)("string_strict"));
 //BA.debugLineNum = 516;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 517;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setsorttext(boolean _b) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="Sub SetSortText(b As Boolean) As WixDataColumn   '";
 //BA.debugLineNum = 528;BA.debugLine="SetSort(\"text\")";
_setsort((Object)("text"));
 //BA.debugLineNum = 529;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 91;BA.debugLine="Styles.Put(prop,val)";
_styles.Put((Object)(_prop),(Object)(_val));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 48;BA.debugLine="Sub SetStyles(m As Map) As WixDataColumn";
 //BA.debugLineNum = 49;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 50;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 51;BA.debugLine="DataColumn.SetStyle(k,v)";
_datacolumn._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 541;BA.debugLine="Sub SetSuggest(s As Object) As WixDataColumn";
 //BA.debugLineNum = 542;BA.debugLine="DataColumn.SetAttr(\"suggest\", s)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("suggest",_s);
 //BA.debugLineNum = 543;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub SetTemplate(t As Object) As WixDataColumn";
 //BA.debugLineNum = 366;BA.debugLine="DataColumn.SetTemplate(t)";
_datacolumn._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_t);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixDataCol";
 //BA.debugLineNum = 77;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 78;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="DataColumn.SetTemplate(os)";
_datacolumn._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _settooltip(Object _v) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetToolTip(v As Object) As WixDataColumn";
 //BA.debugLineNum = 378;BA.debugLine="DataColumn.SetAttr(\"tooltip\", v)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("tooltip",_v);
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _settype(Object _c) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub SetType(c As Object) As WixDataColumn";
 //BA.debugLineNum = 335;BA.debugLine="DataColumn.SetAttr(\"type\", c)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_c);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setuncheckvalue(Object _v) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetUncheckValue(v As Object) As WixDataColumn";
 //BA.debugLineNum = 385;BA.debugLine="DataColumn.SetAttr(\"uncheckValue\", v)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("uncheckValue",_v);
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatacolumn  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetWidth(w As Object) As WixDataColumn";
 //BA.debugLineNum = 223;BA.debugLine="DataColumn.SetAttr(\"width\", w)";
_datacolumn._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdatacolumn)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
