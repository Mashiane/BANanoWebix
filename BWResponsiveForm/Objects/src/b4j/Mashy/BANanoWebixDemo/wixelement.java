package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixelement extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixelement", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixelement.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public anywheresoftware.b4a.objects.collections.List _columns = null;
public anywheresoftware.b4a.objects.collections.List _rows = null;
public anywheresoftware.b4a.objects.collections.Map _element = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public anywheresoftware.b4a.objects.collections.Map _attributes = null;
public anywheresoftware.b4a.objects.collections.Map _htmlattributes = null;
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public anywheresoftware.b4a.objects.collections.List _cells = null;
public anywheresoftware.b4a.objects.collections.Map _elementsconfig = null;
public anywheresoftware.b4a.objects.collections.List _cols = null;
public anywheresoftware.b4a.objects.collections.Map _rules = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public anywheresoftware.b4a.objects.collections.Map _on = null;
public String _parentid = "";
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixelement  _addcells(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 895;BA.debugLine="Sub AddCells(itm As Map) As WixElement";
 //BA.debugLineNum = 896;BA.debugLine="Cells.Add(itm)";
_cells.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 897;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 898;BA.debugLine="End Sub";
return null;
}
public String  _addcolumn(b4j.Mashy.BANanoWebixDemo.wixcolumn _wxel) throws Exception{
 //BA.debugLineNum = 1029;BA.debugLine="Sub AddColumn(wxEL As WixColumn)";
 //BA.debugLineNum = 1030;BA.debugLine="AddColumns(wxEL.Item)";
_addcolumns(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 1031;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addcolumns(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 883;BA.debugLine="Sub AddColumns(itm As Map) As WixElement";
 //BA.debugLineNum = 884;BA.debugLine="Cols.Add(itm)";
_cols.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 885;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addcolumnscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 910;BA.debugLine="Sub AddColumnsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 911;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 912;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 913;BA.debugLine="AddColumns(opt)";
_addcolumns(_opt);
 //BA.debugLineNum = 914;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 915;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addcolumnsresizer(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 862;BA.debugLine="Sub AddColumnsResizer(s As String) As WixElement";
 //BA.debugLineNum = 863;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 864;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 865;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 866;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 867;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addcolumnsspacer(String _b) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _s = null;
 //BA.debugLineNum = 978;BA.debugLine="Sub AddColumnsSpacer(b As String) As WixElement";
 //BA.debugLineNum = 979;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 980;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spacer");
 //BA.debugLineNum = 981;BA.debugLine="AddColumns(s.item)";
_addcolumns(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 982;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 983;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _adddatacolumn(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="Sub AddDataColumn(itm As Map) As WixElement";
 //BA.debugLineNum = 890;BA.debugLine="Columns.Add(itm)";
_columns.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 891;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 892;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addelements(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 918;BA.debugLine="Sub AddElements(itm As Map) As WixElement";
 //BA.debugLineNum = 919;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 920;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _additem(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 930;BA.debugLine="Sub AddItem(itm As Map) As WixElement";
 //BA.debugLineNum = 931;BA.debugLine="Elements.Add(itm)";
_elements.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 932;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 933;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addoption(String _oid,Object _otxt) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 149;BA.debugLine="Sub AddOption(oid As String, oTxt As Object) As Wi";
 //BA.debugLineNum = 150;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 151;BA.debugLine="opt.put(\"id\",oid)";
_opt.Put((Object)("id"),(Object)(_oid));
 //BA.debugLineNum = 152;BA.debugLine="opt.Put(\"value\",oTxt)";
_opt.Put((Object)("value"),_otxt);
 //BA.debugLineNum = 153;BA.debugLine="options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addresizertocolumns(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 855;BA.debugLine="Sub AddResizerToColumns(s As String) As WixElement";
 //BA.debugLineNum = 856;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 857;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 858;BA.debugLine="AddColumns(r.Item)";
_addcolumns(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 859;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 860;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addresizertorows(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 869;BA.debugLine="Sub AddResizerToRows(s As String) As WixElement";
 //BA.debugLineNum = 870;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 871;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 872;BA.debugLine="AddRows(r.Item)";
_addrows(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 873;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 874;BA.debugLine="End Sub";
return null;
}
public String  _addrow(b4j.Mashy.BANanoWebixDemo.wixrow _wxel) throws Exception{
 //BA.debugLineNum = 936;BA.debugLine="Sub AddRow(wxEL As WixRow)";
 //BA.debugLineNum = 937;BA.debugLine="AddRows(wxEL.Item)";
_addrows(_wxel._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 938;BA.debugLine="End Sub";
return "";
}
public String  _addrowitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 941;BA.debugLine="Sub AddRowItems(items As List)";
 //BA.debugLineNum = 942;BA.debugLine="For Each m As Map In items";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
 //BA.debugLineNum = 943;BA.debugLine="AddRows(m)";
_addrows(_m);
 }
};
 //BA.debugLineNum = 945;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addrows(anywheresoftware.b4a.objects.collections.Map _itm) throws Exception{
 //BA.debugLineNum = 924;BA.debugLine="Sub AddRows(itm As Map) As WixElement";
 //BA.debugLineNum = 925;BA.debugLine="Rows.Add(itm)";
_rows.Add((Object)(_itm.getObject()));
 //BA.debugLineNum = 926;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 927;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addrowscells(anywheresoftware.b4a.objects.collections.List _mcells) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 901;BA.debugLine="Sub AddRowsCells(mCells As List) As WixElement";
 //BA.debugLineNum = 902;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 903;BA.debugLine="opt.Put(\"cells\", mCells)";
_opt.Put((Object)("cells"),(Object)(_mcells.getObject()));
 //BA.debugLineNum = 904;BA.debugLine="AddRows(opt)";
_addrows(_opt);
 //BA.debugLineNum = 905;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 906;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addrowsresizer(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _r = null;
 //BA.debugLineNum = 970;BA.debugLine="Sub AddRowsResizer(s As String) As WixElement   'i";
 //BA.debugLineNum = 971;BA.debugLine="Dim r As WixResizer";
_r = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 972;BA.debugLine="r.Initialize(\"\")";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,"");
 //BA.debugLineNum = 973;BA.debugLine="AddRows(r.Item)";
_addrows(_r._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 974;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 975;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addrowsspacer(String _r) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _s = null;
 //BA.debugLineNum = 963;BA.debugLine="Sub AddRowsSpacer(r As String) As WixElement   'ig";
 //BA.debugLineNum = 964;BA.debugLine="Dim s As WixElement";
_s = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 965;BA.debugLine="s.Initialize(\"\").SetView(\"spacer\")";
_s._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,"")._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("spacer");
 //BA.debugLineNum = 966;BA.debugLine="AddRows(s.item)";
_addrows(_s._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 967;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 968;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addtocells(b4j.Mashy.BANanoWebixDemo.wixelement _prt) throws Exception{
 //BA.debugLineNum = 991;BA.debugLine="Sub AddToCells(prt As WixElement) As WixElement";
 //BA.debugLineNum = 992;BA.debugLine="prt.AddCells(Item)";
_prt._addcells /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 993;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 994;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _prt) throws Exception{
 //BA.debugLineNum = 986;BA.debugLine="Sub AddToColumns(prt As WixElement) As WixElement";
 //BA.debugLineNum = 987;BA.debugLine="prt.AddColumns(Item)";
_prt._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 988;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 989;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _prt) throws Exception{
 //BA.debugLineNum = 1023;BA.debugLine="Sub AddToElements(prt As WixElement) As WixElement";
 //BA.debugLineNum = 1024;BA.debugLine="prt.AddElements(Item)";
_prt._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 1025;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1026;BA.debugLine="End Sub";
return null;
}
public String  _addtolist(anywheresoftware.b4a.objects.collections.List _target) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub AddToList(target As List)";
 //BA.debugLineNum = 58;BA.debugLine="target.Add(Item)";
_target.Add((Object)(_item().getObject()));
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _addtorow(b4j.Mashy.BANanoWebixDemo.wixrow _r) throws Exception{
 //BA.debugLineNum = 1084;BA.debugLine="Sub AddToRow(r As WixRow)";
 //BA.debugLineNum = 1085;BA.debugLine="r.AddItem(Item)";
_r._additem /*b4j.Mashy.BANanoWebixDemo.wixrow*/ (_item());
 //BA.debugLineNum = 1086;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _prt) throws Exception{
 //BA.debugLineNum = 958;BA.debugLine="Sub AddToRows(prt As WixElement)";
 //BA.debugLineNum = 959;BA.debugLine="prt.AddRows(Item)";
_prt._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 960;BA.debugLine="End Sub";
return "";
}
public String  _addwixrows(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrow _i = null;
 //BA.debugLineNum = 258;BA.debugLine="Sub AddWixRows(lst As List)";
 //BA.debugLineNum = 259;BA.debugLine="For Each i As WixRow In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_i = (b4j.Mashy.BANanoWebixDemo.wixrow)(group1.Get(index1));
 //BA.debugLineNum = 260;BA.debugLine="AddRow(i)";
_addrow(_i);
 }
};
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 5;BA.debugLine="Public Rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Element As Map";
_element = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Public Elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private Attributes As Map";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private HTMLAttributes As Map";
_htmlattributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private Styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Public Cells As List";
_cells = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private elementsConfig As Map";
_elementsconfig = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Public Cols As List";
_cols = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Public Rules As Map";
_rules = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Private options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private On As Map";
_on = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="Public ParentID As String";
_parentid = "";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixaccordion  _createaccordion(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixaccordion _btn = null;
 //BA.debugLineNum = 1145;BA.debugLine="Sub CreateAccordion(sid As String) As WixAccordion";
 //BA.debugLineNum = 1146;BA.debugLine="Dim btn As WixAccordion";
_btn = new b4j.Mashy.BANanoWebixDemo.wixaccordion();
 //BA.debugLineNum = 1147;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixaccordion*/ (ba,_sid);
 //BA.debugLineNum = 1148;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1149;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _createbutton(String _eid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixbutton _btn = null;
 //BA.debugLineNum = 230;BA.debugLine="Sub CreateButton(eid As String) As WixButton";
 //BA.debugLineNum = 231;BA.debugLine="Dim btn As WixButton";
_btn = new b4j.Mashy.BANanoWebixDemo.wixbutton();
 //BA.debugLineNum = 232;BA.debugLine="btn.Initialize(eid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixbutton*/ (ba,_eid);
 //BA.debugLineNum = 233;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcarousel  _createcarousel(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcarousel _btn = null;
 //BA.debugLineNum = 1151;BA.debugLine="Sub CreateCarousel(sid As String) As WixCarousel";
 //BA.debugLineNum = 1152;BA.debugLine="Dim btn As WixCarousel";
_btn = new b4j.Mashy.BANanoWebixDemo.wixcarousel();
 //BA.debugLineNum = 1153;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixcarousel*/ (ba,_sid);
 //BA.debugLineNum = 1154;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixchart  _createchart(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixchart _btn = null;
 //BA.debugLineNum = 1157;BA.debugLine="Sub CreateChart(sid As String) As WixChart";
 //BA.debugLineNum = 1158;BA.debugLine="Dim btn As WixChart";
_btn = new b4j.Mashy.BANanoWebixDemo.wixchart();
 //BA.debugLineNum = 1159;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixchart*/ (ba,_sid);
 //BA.debugLineNum = 1160;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1161;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcheckbox  _createcheckbox(String _eid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcheckbox _chk = null;
 //BA.debugLineNum = 237;BA.debugLine="Sub CreateCheckBox(eid As String) As WixCheckBox";
 //BA.debugLineNum = 238;BA.debugLine="Dim chk As WixCheckBox";
_chk = new b4j.Mashy.BANanoWebixDemo.wixcheckbox();
 //BA.debugLineNum = 239;BA.debugLine="chk.Initialize(eid)";
_chk._initialize /*b4j.Mashy.BANanoWebixDemo.wixcheckbox*/ (ba,_eid);
 //BA.debugLineNum = 240;BA.debugLine="Return chk";
if (true) return _chk;
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolorpicker  _createcolorpicker(String _eid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcolorpicker _cp = null;
 //BA.debugLineNum = 244;BA.debugLine="Sub CreateColorPicker(eid As String) As WixColorPi";
 //BA.debugLineNum = 245;BA.debugLine="Dim cp As WixColorPicker";
_cp = new b4j.Mashy.BANanoWebixDemo.wixcolorpicker();
 //BA.debugLineNum = 246;BA.debugLine="cp.Initialize(eid)";
_cp._initialize /*b4j.Mashy.BANanoWebixDemo.wixcolorpicker*/ (ba,_eid);
 //BA.debugLineNum = 247;BA.debugLine="Return cp";
if (true) return _cp;
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcolumn  _createcolumn(String _cid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcolumn _c = null;
 //BA.debugLineNum = 209;BA.debugLine="Sub CreateColumn(cid As String) As WixColumn";
 //BA.debugLineNum = 210;BA.debugLine="Dim c As WixColumn";
_c = new b4j.Mashy.BANanoWebixDemo.wixcolumn();
 //BA.debugLineNum = 211;BA.debugLine="c.Initialize(cid)";
_c._initialize /*b4j.Mashy.BANanoWebixDemo.wixcolumn*/ (ba,_cid);
 //BA.debugLineNum = 212;BA.debugLine="Return c";
if (true) return _c;
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _createcombo(String _eid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcombo _cp = null;
 //BA.debugLineNum = 251;BA.debugLine="Sub CreateCombo(eid As String) As WixCombo";
 //BA.debugLineNum = 252;BA.debugLine="Dim cp As WixCombo";
_cp = new b4j.Mashy.BANanoWebixDemo.wixcombo();
 //BA.debugLineNum = 253;BA.debugLine="cp.Initialize(eid)";
_cp._initialize /*b4j.Mashy.BANanoWebixDemo.wixcombo*/ (ba,_eid);
 //BA.debugLineNum = 254;BA.debugLine="Return cp";
if (true) return _cp;
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _createcomments(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcomments _btn = null;
 //BA.debugLineNum = 1163;BA.debugLine="Sub CreateComments(sid As String) As WixComments";
 //BA.debugLineNum = 1164;BA.debugLine="Dim btn As WixComments";
_btn = new b4j.Mashy.BANanoWebixDemo.wixcomments();
 //BA.debugLineNum = 1165;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixcomments*/ (ba,_sid);
 //BA.debugLineNum = 1166;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1167;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontext  _createcontext(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcontext _btn = null;
 //BA.debugLineNum = 1169;BA.debugLine="Sub CreateContext(sid As String) As WixContext";
 //BA.debugLineNum = 1170;BA.debugLine="Dim btn As WixContext";
_btn = new b4j.Mashy.BANanoWebixDemo.wixcontext();
 //BA.debugLineNum = 1171;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixcontext*/ (ba,_sid);
 //BA.debugLineNum = 1172;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1173;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcontextmenu  _createcontextmenu(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcontextmenu _btn = null;
 //BA.debugLineNum = 1175;BA.debugLine="Sub CreateContextMenu(sid As String) As WixContext";
 //BA.debugLineNum = 1176;BA.debugLine="Dim btn As WixContextMenu";
_btn = new b4j.Mashy.BANanoWebixDemo.wixcontextmenu();
 //BA.debugLineNum = 1177;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixcontextmenu*/ (ba,_sid);
 //BA.debugLineNum = 1178;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1179;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _createcounter(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcounter _btn = null;
 //BA.debugLineNum = 1181;BA.debugLine="Sub CreateCounter(sid As String) As WixCounter";
 //BA.debugLineNum = 1182;BA.debugLine="Dim btn As WixCounter";
_btn = new b4j.Mashy.BANanoWebixDemo.wixcounter();
 //BA.debugLineNum = 1183;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixcounter*/ (ba,_sid);
 //BA.debugLineNum = 1184;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1185;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatatable  _createdatatable(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixdatatable _btn = null;
 //BA.debugLineNum = 1187;BA.debugLine="Sub CreateDataTable(sid As String) As WixDataTable";
 //BA.debugLineNum = 1188;BA.debugLine="Dim btn As WixDataTable";
_btn = new b4j.Mashy.BANanoWebixDemo.wixdatatable();
 //BA.debugLineNum = 1189;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixdatatable*/ (ba,_sid);
 //BA.debugLineNum = 1190;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdataview  _createdataview(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixdataview _btn = null;
 //BA.debugLineNum = 1194;BA.debugLine="Sub CreateDataView(sid As String) As WixDataView";
 //BA.debugLineNum = 1195;BA.debugLine="Dim btn As WixDataView";
_btn = new b4j.Mashy.BANanoWebixDemo.wixdataview();
 //BA.debugLineNum = 1196;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixdataview*/ (ba,_sid);
 //BA.debugLineNum = 1197;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1198;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _createdatepicker(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixdatepicker _btn = null;
 //BA.debugLineNum = 1201;BA.debugLine="Sub CreateDatePicker(sid As String) As WixDatePick";
 //BA.debugLineNum = 1202;BA.debugLine="Dim btn As WixDatePicker";
_btn = new b4j.Mashy.BANanoWebixDemo.wixdatepicker();
 //BA.debugLineNum = 1203;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixdatepicker*/ (ba,_sid);
 //BA.debugLineNum = 1204;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1205;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _createdbllist(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixdbllist _btn = null;
 //BA.debugLineNum = 1208;BA.debugLine="Sub CreateDBLList(sid As String) As WixDBLList";
 //BA.debugLineNum = 1209;BA.debugLine="Dim btn As WixDBLList";
_btn = new b4j.Mashy.BANanoWebixDemo.wixdbllist();
 //BA.debugLineNum = 1210;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixdbllist*/ (ba,_sid);
 //BA.debugLineNum = 1211;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1212;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixfieldset  _createfieldset(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixfieldset _btn = null;
 //BA.debugLineNum = 1216;BA.debugLine="Sub CreateFieldSet(sid As String) As WixFieldSet";
 //BA.debugLineNum = 1217;BA.debugLine="Dim btn As WixFieldSet";
_btn = new b4j.Mashy.BANanoWebixDemo.wixfieldset();
 //BA.debugLineNum = 1218;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixfieldset*/ (ba,_sid);
 //BA.debugLineNum = 1219;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixflexlayout  _createflexlayout(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixflexlayout _btn = null;
 //BA.debugLineNum = 1222;BA.debugLine="Sub CreateFlexLayout(sid As String) As WixFlexLayo";
 //BA.debugLineNum = 1223;BA.debugLine="Dim btn As WixFlexLayout";
_btn = new b4j.Mashy.BANanoWebixDemo.wixflexlayout();
 //BA.debugLineNum = 1224;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixflexlayout*/ (ba,_sid);
 //BA.debugLineNum = 1225;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixform  _createform(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixform _btn = null;
 //BA.debugLineNum = 1228;BA.debugLine="Sub CreateForm(sid As String) As WixForm";
 //BA.debugLineNum = 1229;BA.debugLine="Dim btn As WixForm";
_btn = new b4j.Mashy.BANanoWebixDemo.wixform();
 //BA.debugLineNum = 1230;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixform*/ (ba,_sid);
 //BA.debugLineNum = 1231;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixforminput  _createforminput(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixforminput _btn = null;
 //BA.debugLineNum = 1235;BA.debugLine="Sub CreateFormInput(sid As String) As WixFormInput";
 //BA.debugLineNum = 1236;BA.debugLine="Dim btn As WixFormInput";
_btn = new b4j.Mashy.BANanoWebixDemo.wixforminput();
 //BA.debugLineNum = 1237;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixforminput*/ (ba,_sid);
 //BA.debugLineNum = 1238;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1239;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgooglemap  _creategooglemap(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixgooglemap _btn = null;
 //BA.debugLineNum = 1242;BA.debugLine="Sub CreateGoogleMap(sid As String) As WixGoogleMap";
 //BA.debugLineNum = 1243;BA.debugLine="Dim btn As WixGoogleMap";
_btn = new b4j.Mashy.BANanoWebixDemo.wixgooglemap();
 //BA.debugLineNum = 1244;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixgooglemap*/ (ba,_sid);
 //BA.debugLineNum = 1245;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixgrouplist  _creategrouplist(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixgrouplist _btn = null;
 //BA.debugLineNum = 1248;BA.debugLine="Sub CreateGroupList(sid As String) As WixGroupList";
 //BA.debugLineNum = 1249;BA.debugLine="Dim btn As WixGroupList";
_btn = new b4j.Mashy.BANanoWebixDemo.wixgrouplist();
 //BA.debugLineNum = 1250;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixgrouplist*/ (ba,_sid);
 //BA.debugLineNum = 1251;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1252;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _createheader(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixheader _itm = null;
 //BA.debugLineNum = 1254;BA.debugLine="Sub CreateHeader(sid As String) As WixHeader";
 //BA.debugLineNum = 1255;BA.debugLine="Dim itm As WixHeader";
_itm = new b4j.Mashy.BANanoWebixDemo.wixheader();
 //BA.debugLineNum = 1256;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixheader*/ (ba,_sid);
 //BA.debugLineNum = 1257;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _createicon(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixicon _btn = null;
 //BA.debugLineNum = 1125;BA.debugLine="Sub CreateIcon(sid As String) As WixIcon";
 //BA.debugLineNum = 1126;BA.debugLine="Dim btn As WixIcon";
_btn = new b4j.Mashy.BANanoWebixDemo.wixicon();
 //BA.debugLineNum = 1127;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixicon*/ (ba,_sid);
 //BA.debugLineNum = 1128;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixiframe  _createiframe(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixiframe _itm = null;
 //BA.debugLineNum = 1260;BA.debugLine="Sub CreateIFrame(sid As String) As WixIFrame";
 //BA.debugLineNum = 1261;BA.debugLine="Dim itm As WixIFrame";
_itm = new b4j.Mashy.BANanoWebixDemo.wixiframe();
 //BA.debugLineNum = 1262;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixiframe*/ (ba,_sid);
 //BA.debugLineNum = 1263;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1264;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _createimage(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wiximage _itm = null;
 //BA.debugLineNum = 1284;BA.debugLine="Sub CreateImage(sid As String) As WixImage";
 //BA.debugLineNum = 1285;BA.debugLine="Dim itm As WixImage";
_itm = new b4j.Mashy.BANanoWebixDemo.wiximage();
 //BA.debugLineNum = 1286;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wiximage*/ (ba,_sid);
 //BA.debugLineNum = 1287;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _createlabel(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixlabel _lbl = null;
 //BA.debugLineNum = 1132;BA.debugLine="Sub CreateLabel(sid As String) As WixLabel";
 //BA.debugLineNum = 1133;BA.debugLine="Dim lbl As WixLabel";
_lbl = new b4j.Mashy.BANanoWebixDemo.wixlabel();
 //BA.debugLineNum = 1134;BA.debugLine="lbl.Initialize(sid)";
_lbl._initialize /*b4j.Mashy.BANanoWebixDemo.wixlabel*/ (ba,_sid);
 //BA.debugLineNum = 1135;BA.debugLine="Return lbl";
if (true) return _lbl;
 //BA.debugLineNum = 1136;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlayout  _createlayout(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixlayout _itm = null;
 //BA.debugLineNum = 1266;BA.debugLine="Sub CreateLayout(sid As String) As WixLayout";
 //BA.debugLineNum = 1267;BA.debugLine="Dim itm As WixLayout";
_itm = new b4j.Mashy.BANanoWebixDemo.wixlayout();
 //BA.debugLineNum = 1268;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixlayout*/ (ba,_sid);
 //BA.debugLineNum = 1269;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1270;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlist  _createlist(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixlist _itm = null;
 //BA.debugLineNum = 1272;BA.debugLine="Sub CreateList(sid As String) As WixList";
 //BA.debugLineNum = 1273;BA.debugLine="Dim itm As WixList";
_itm = new b4j.Mashy.BANanoWebixDemo.wixlist();
 //BA.debugLineNum = 1274;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixlist*/ (ba,_sid);
 //BA.debugLineNum = 1275;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmenu  _createmenu(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixmenu _itm = null;
 //BA.debugLineNum = 1278;BA.debugLine="Sub CreateMenu(sid As String) As WixMenu";
 //BA.debugLineNum = 1279;BA.debugLine="Dim itm As WixMenu";
_itm = new b4j.Mashy.BANanoWebixDemo.wixmenu();
 //BA.debugLineNum = 1280;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixmenu*/ (ba,_sid);
 //BA.debugLineNum = 1281;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmessagebox  _createmessagebox(String _mbox) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixmessagebox _out = null;
 //BA.debugLineNum = 91;BA.debugLine="Sub CreateMessageBox(mbox As String) As WixMessage";
 //BA.debugLineNum = 92;BA.debugLine="Dim out As WixMessageBox";
_out = new b4j.Mashy.BANanoWebixDemo.wixmessagebox();
 //BA.debugLineNum = 93;BA.debugLine="out.Initialize(mbox)";
_out._initialize /*b4j.Mashy.BANanoWebixDemo.wixmessagebox*/ (ba,_mbox);
 //BA.debugLineNum = 94;BA.debugLine="Return out";
if (true) return _out;
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixmultiview  _createmultiview(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixmultiview _itm = null;
 //BA.debugLineNum = 1290;BA.debugLine="Sub CreateMultiView(sid As String) As WixMultiView";
 //BA.debugLineNum = 1291;BA.debugLine="Dim itm As WixMultiView";
_itm = new b4j.Mashy.BANanoWebixDemo.wixmultiview();
 //BA.debugLineNum = 1292;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixmultiview*/ (ba,_sid);
 //BA.debugLineNum = 1293;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1294;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpager  _createpager(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixpager _itm = null;
 //BA.debugLineNum = 1296;BA.debugLine="Sub CreatePager(sid As String) As WixPager";
 //BA.debugLineNum = 1297;BA.debugLine="Dim itm As WixPager";
_itm = new b4j.Mashy.BANanoWebixDemo.wixpager();
 //BA.debugLineNum = 1298;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixpager*/ (ba,_sid);
 //BA.debugLineNum = 1299;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1300;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixpopup  _createpopup(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixpopup _itm = null;
 //BA.debugLineNum = 1302;BA.debugLine="Sub CreatePopUp(sid As String) As WixPopUp";
 //BA.debugLineNum = 1303;BA.debugLine="Dim itm As WixPopUp";
_itm = new b4j.Mashy.BANanoWebixDemo.wixpopup();
 //BA.debugLineNum = 1304;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixpopup*/ (ba,_sid);
 //BA.debugLineNum = 1305;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixportlet  _createportlet(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixportlet _itm = null;
 //BA.debugLineNum = 1308;BA.debugLine="Sub CreatePortlet(sid As String) As WixPortlet";
 //BA.debugLineNum = 1309;BA.debugLine="Dim itm As WixPortlet";
_itm = new b4j.Mashy.BANanoWebixDemo.wixportlet();
 //BA.debugLineNum = 1310;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixportlet*/ (ba,_sid);
 //BA.debugLineNum = 1311;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1312;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixproperty  _createproperty(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixproperty _itm = null;
 //BA.debugLineNum = 1314;BA.debugLine="Sub CreateProperty(sid As String) As WixProperty";
 //BA.debugLineNum = 1315;BA.debugLine="Dim itm As WixProperty";
_itm = new b4j.Mashy.BANanoWebixDemo.wixproperty();
 //BA.debugLineNum = 1316;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixproperty*/ (ba,_sid);
 //BA.debugLineNum = 1317;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1318;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixradio  _createradio(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixradio _itm = null;
 //BA.debugLineNum = 1320;BA.debugLine="Sub CreateRadio(sid As String) As WixRadio";
 //BA.debugLineNum = 1321;BA.debugLine="Dim itm As WixRadio";
_itm = new b4j.Mashy.BANanoWebixDemo.wixradio();
 //BA.debugLineNum = 1322;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixradio*/ (ba,_sid);
 //BA.debugLineNum = 1323;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1324;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrangeslider  _createrangeslider(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrangeslider _itm = null;
 //BA.debugLineNum = 1326;BA.debugLine="Sub CreateRangeSlider(sid As String) As WixRangeSl";
 //BA.debugLineNum = 1327;BA.debugLine="Dim itm As WixRangeSlider";
_itm = new b4j.Mashy.BANanoWebixDemo.wixrangeslider();
 //BA.debugLineNum = 1328;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixrangeslider*/ (ba,_sid);
 //BA.debugLineNum = 1329;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1330;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixresizer  _createresizer(String _rid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixresizer _res1 = null;
 //BA.debugLineNum = 165;BA.debugLine="Sub CreateResizer(rid As String) As WixResizer";
 //BA.debugLineNum = 166;BA.debugLine="Dim res1 As WixResizer";
_res1 = new b4j.Mashy.BANanoWebixDemo.wixresizer();
 //BA.debugLineNum = 167;BA.debugLine="res1.Initialize(rid)";
_res1._initialize /*b4j.Mashy.BANanoWebixDemo.wixresizer*/ (ba,_rid);
 //BA.debugLineNum = 168;BA.debugLine="Return res1";
if (true) return _res1;
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _createrichselect(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrichselect _itm = null;
 //BA.debugLineNum = 1332;BA.debugLine="Sub CreateRichSelect(sid As String) As WixRichSele";
 //BA.debugLineNum = 1333;BA.debugLine="Dim itm As WixRichSelect";
_itm = new b4j.Mashy.BANanoWebixDemo.wixrichselect();
 //BA.debugLineNum = 1334;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixrichselect*/ (ba,_sid);
 //BA.debugLineNum = 1335;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1336;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichtext  _createrichtext(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrichtext _itm = null;
 //BA.debugLineNum = 1338;BA.debugLine="Sub CreateRichText(sid As String) As WixRichText";
 //BA.debugLineNum = 1339;BA.debugLine="Dim itm As WixRichText";
_itm = new b4j.Mashy.BANanoWebixDemo.wixrichtext();
 //BA.debugLineNum = 1340;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixrichtext*/ (ba,_sid);
 //BA.debugLineNum = 1341;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1342;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrow  _createrow(String _rid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrow _r = null;
 //BA.debugLineNum = 216;BA.debugLine="Sub CreateRow(rid As String) As WixRow";
 //BA.debugLineNum = 217;BA.debugLine="Dim r As WixRow";
_r = new b4j.Mashy.BANanoWebixDemo.wixrow();
 //BA.debugLineNum = 218;BA.debugLine="r.Initialize(rid)";
_r._initialize /*b4j.Mashy.BANanoWebixDemo.wixrow*/ (ba,_rid);
 //BA.debugLineNum = 219;BA.debugLine="Return r";
if (true) return _r;
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixscrollview  _createscrollview(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixscrollview _itm = null;
 //BA.debugLineNum = 1344;BA.debugLine="Sub CreateScrollView(sid As String) As WixScrollVi";
 //BA.debugLineNum = 1345;BA.debugLine="Dim itm As WixScrollView";
_itm = new b4j.Mashy.BANanoWebixDemo.wixscrollview();
 //BA.debugLineNum = 1346;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixscrollview*/ (ba,_sid);
 //BA.debugLineNum = 1347;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1348;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _createsearch(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixsearch _itm = null;
 //BA.debugLineNum = 1350;BA.debugLine="Sub CreateSearch(sid As String) As WixSearch";
 //BA.debugLineNum = 1351;BA.debugLine="Dim itm As WixSearch";
_itm = new b4j.Mashy.BANanoWebixDemo.wixsearch();
 //BA.debugLineNum = 1352;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixsearch*/ (ba,_sid);
 //BA.debugLineNum = 1353;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1354;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsection  _createsection(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixsection _itm = null;
 //BA.debugLineNum = 1356;BA.debugLine="Sub CreateSection(sid As String) As WixSection";
 //BA.debugLineNum = 1357;BA.debugLine="Dim itm As WixSection";
_itm = new b4j.Mashy.BANanoWebixDemo.wixsection();
 //BA.debugLineNum = 1358;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixsection*/ (ba,_sid);
 //BA.debugLineNum = 1359;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1360;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _createsegmented(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixsegmented _itm = null;
 //BA.debugLineNum = 1362;BA.debugLine="Sub CreateSegmented(sid As String) As WixSegmented";
 //BA.debugLineNum = 1363;BA.debugLine="Dim itm As WixSegmented";
_itm = new b4j.Mashy.BANanoWebixDemo.wixsegmented();
 //BA.debugLineNum = 1364;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixsegmented*/ (ba,_sid);
 //BA.debugLineNum = 1365;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1366;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _createselect(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixselect _itm = null;
 //BA.debugLineNum = 1368;BA.debugLine="Sub CreateSelect(sid As String) As WixSelect";
 //BA.debugLineNum = 1369;BA.debugLine="Dim itm As WixSelect";
_itm = new b4j.Mashy.BANanoWebixDemo.wixselect();
 //BA.debugLineNum = 1370;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixselect*/ (ba,_sid);
 //BA.debugLineNum = 1371;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1372;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidebar  _createsidebar(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixsidebar _itm = null;
 //BA.debugLineNum = 1374;BA.debugLine="Sub CreateSideBar(sid As String) As WixSideBar";
 //BA.debugLineNum = 1375;BA.debugLine="Dim itm As WixSideBar";
_itm = new b4j.Mashy.BANanoWebixDemo.wixsidebar();
 //BA.debugLineNum = 1376;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixsidebar*/ (ba,_sid);
 //BA.debugLineNum = 1377;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1378;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsidemenu  _createsidemenu(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixsidemenu _itm = null;
 //BA.debugLineNum = 1380;BA.debugLine="Sub CreateSideMenu(sid As String) As WixSideMenu";
 //BA.debugLineNum = 1381;BA.debugLine="Dim itm As WixSideMenu";
_itm = new b4j.Mashy.BANanoWebixDemo.wixsidemenu();
 //BA.debugLineNum = 1382;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixsidemenu*/ (ba,_sid);
 //BA.debugLineNum = 1383;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1384;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixslider  _createslider(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixslider _itm = null;
 //BA.debugLineNum = 1386;BA.debugLine="Sub CreateSlider(sid As String) As WixSlider";
 //BA.debugLineNum = 1387;BA.debugLine="Dim itm As WixSlider";
_itm = new b4j.Mashy.BANanoWebixDemo.wixslider();
 //BA.debugLineNum = 1388;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixslider*/ (ba,_sid);
 //BA.debugLineNum = 1389;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1390;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsuggest  _createsuggest(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixsuggest _itm = null;
 //BA.debugLineNum = 1392;BA.debugLine="Sub CreateSuggest(sid As String) As WixSuggest";
 //BA.debugLineNum = 1393;BA.debugLine="Dim itm As WixSuggest";
_itm = new b4j.Mashy.BANanoWebixDemo.wixsuggest();
 //BA.debugLineNum = 1394;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixsuggest*/ (ba,_sid);
 //BA.debugLineNum = 1395;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1396;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _createswitch(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixswitch _itm = null;
 //BA.debugLineNum = 1398;BA.debugLine="Sub CreateSwitch(sid As String) As WixSwitch";
 //BA.debugLineNum = 1399;BA.debugLine="Dim itm As WixSwitch";
_itm = new b4j.Mashy.BANanoWebixDemo.wixswitch();
 //BA.debugLineNum = 1400;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ (ba,_sid);
 //BA.debugLineNum = 1401;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1402;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabbar  _createtabbar(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtabbar _itm = null;
 //BA.debugLineNum = 1404;BA.debugLine="Sub CreateTabBar(sid As String) As WixTabBar";
 //BA.debugLineNum = 1405;BA.debugLine="Dim itm As WixTabBar";
_itm = new b4j.Mashy.BANanoWebixDemo.wixtabbar();
 //BA.debugLineNum = 1406;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixtabbar*/ (ba,_sid);
 //BA.debugLineNum = 1407;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1408;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtabview  _createtabview(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtabview _itm = null;
 //BA.debugLineNum = 1410;BA.debugLine="Sub CreateTabView(sid As String) As WixTabView";
 //BA.debugLineNum = 1411;BA.debugLine="Dim itm As WixTabView";
_itm = new b4j.Mashy.BANanoWebixDemo.wixtabview();
 //BA.debugLineNum = 1412;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixtabview*/ (ba,_sid);
 //BA.debugLineNum = 1413;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1414;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtemplate  _createtemplate(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtemplate _itm = null;
 //BA.debugLineNum = 1416;BA.debugLine="Sub CreateTemplate(sid As String) As WixTemplate";
 //BA.debugLineNum = 1417;BA.debugLine="Dim itm As WixTemplate";
_itm = new b4j.Mashy.BANanoWebixDemo.wixtemplate();
 //BA.debugLineNum = 1418;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixtemplate*/ (ba,_sid);
 //BA.debugLineNum = 1419;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1420;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _createtext(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtext _itm = null;
 //BA.debugLineNum = 1422;BA.debugLine="Sub CreateText(sid As String) As WixText";
 //BA.debugLineNum = 1423;BA.debugLine="Dim itm As WixText";
_itm = new b4j.Mashy.BANanoWebixDemo.wixtext();
 //BA.debugLineNum = 1424;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (ba,_sid);
 //BA.debugLineNum = 1425;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1426;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtextarea  _createtextarea(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtextarea _itm = null;
 //BA.debugLineNum = 1428;BA.debugLine="Sub CreateTextArea(sid As String) As WixTextArea";
 //BA.debugLineNum = 1429;BA.debugLine="Dim itm As WixTextArea";
_itm = new b4j.Mashy.BANanoWebixDemo.wixtextarea();
 //BA.debugLineNum = 1430;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixtextarea*/ (ba,_sid);
 //BA.debugLineNum = 1431;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1432;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _createtextbox(String _eid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtext _txtbox = null;
 //BA.debugLineNum = 223;BA.debugLine="Sub CreateTextBox(eid As String) As WixText";
 //BA.debugLineNum = 224;BA.debugLine="Dim txtbox As WixText";
_txtbox = new b4j.Mashy.BANanoWebixDemo.wixtext();
 //BA.debugLineNum = 225;BA.debugLine="txtbox.Initialize(eid)";
_txtbox._initialize /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (ba,_eid);
 //BA.debugLineNum = 226;BA.debugLine="Return txtbox";
if (true) return _txtbox;
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _createtoggle(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtoggle _btn = null;
 //BA.debugLineNum = 1139;BA.debugLine="Sub CreateToggle(sid As String) As WixToggle";
 //BA.debugLineNum = 1140;BA.debugLine="Dim btn As WixToggle";
_btn = new b4j.Mashy.BANanoWebixDemo.wixtoggle();
 //BA.debugLineNum = 1141;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixtoggle*/ (ba,_sid);
 //BA.debugLineNum = 1142;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 1143;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _createtoolbar(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtoolbar _itm = null;
 //BA.debugLineNum = 1434;BA.debugLine="Sub CreateToolBar(sid As String) As WixToolBar";
 //BA.debugLineNum = 1435;BA.debugLine="Dim itm As WixToolBar";
_itm = new b4j.Mashy.BANanoWebixDemo.wixtoolbar();
 //BA.debugLineNum = 1436;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixtoolbar*/ (ba,_sid);
 //BA.debugLineNum = 1437;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1438;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtree  _createtree(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtree _itm = null;
 //BA.debugLineNum = 1440;BA.debugLine="Sub CreateTree(sid As String) As WixTree";
 //BA.debugLineNum = 1441;BA.debugLine="Dim itm As WixTree";
_itm = new b4j.Mashy.BANanoWebixDemo.wixtree();
 //BA.debugLineNum = 1442;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixtree*/ (ba,_sid);
 //BA.debugLineNum = 1443;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1444;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtreetable  _createtreetable(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtreetable _itm = null;
 //BA.debugLineNum = 1446;BA.debugLine="Sub CreateTreeTable(sid As String) As WixTreeTable";
 //BA.debugLineNum = 1447;BA.debugLine="Dim itm As WixTreeTable";
_itm = new b4j.Mashy.BANanoWebixDemo.wixtreetable();
 //BA.debugLineNum = 1448;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixtreetable*/ (ba,_sid);
 //BA.debugLineNum = 1449;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1450;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixunitlist  _createunitlist(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixunitlist _itm = null;
 //BA.debugLineNum = 1452;BA.debugLine="Sub CreateUnitList(sid As String) As WixUnitList";
 //BA.debugLineNum = 1453;BA.debugLine="Dim itm As WixUnitList";
_itm = new b4j.Mashy.BANanoWebixDemo.wixunitlist();
 //BA.debugLineNum = 1454;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixunitlist*/ (ba,_sid);
 //BA.debugLineNum = 1455;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1456;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _createuploader(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixuploader _itm = null;
 //BA.debugLineNum = 1458;BA.debugLine="Sub CreateUploader(sid As String) As WixUploader";
 //BA.debugLineNum = 1459;BA.debugLine="Dim itm As WixUploader";
_itm = new b4j.Mashy.BANanoWebixDemo.wixuploader();
 //BA.debugLineNum = 1460;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixuploader*/ (ba,_sid);
 //BA.debugLineNum = 1461;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1462;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixvideo  _createvideo(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixvideo _itm = null;
 //BA.debugLineNum = 1464;BA.debugLine="Sub CreateVideo(sid As String) As WixVideo";
 //BA.debugLineNum = 1465;BA.debugLine="Dim itm As WixVideo";
_itm = new b4j.Mashy.BANanoWebixDemo.wixvideo();
 //BA.debugLineNum = 1466;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixvideo*/ (ba,_sid);
 //BA.debugLineNum = 1467;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1468;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixwindow  _createwindow(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixwindow _itm = null;
 //BA.debugLineNum = 1470;BA.debugLine="Sub CreateWindow(sid As String) As WixWindow";
 //BA.debugLineNum = 1471;BA.debugLine="Dim itm As WixWindow";
_itm = new b4j.Mashy.BANanoWebixDemo.wixwindow();
 //BA.debugLineNum = 1472;BA.debugLine="itm.Initialize(sid)";
_itm._initialize /*b4j.Mashy.BANanoWebixDemo.wixwindow*/ (ba,_sid);
 //BA.debugLineNum = 1473;BA.debugLine="Return itm";
if (true) return _itm;
 //BA.debugLineNum = 1474;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 352;BA.debugLine="Public Sub Initialize(sID As String) As WixElement";
 //BA.debugLineNum = 353;BA.debugLine="ID = sID.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 354;BA.debugLine="Cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 355;BA.debugLine="Cols.Initialize";
_cols.Initialize();
 //BA.debugLineNum = 356;BA.debugLine="elementsConfig.Initialize";
_elementsconfig.Initialize();
 //BA.debugLineNum = 357;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 358;BA.debugLine="Element = CreateMap(\"id\":ID)";
_element = __c.createMap(new Object[] {(Object)("id"),(Object)(_id)});
 //BA.debugLineNum = 359;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 360;BA.debugLine="Elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 361;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 362;BA.debugLine="Attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 363;BA.debugLine="HTMLAttributes.Initialize";
_htmlattributes.Initialize();
 //BA.debugLineNum = 364;BA.debugLine="Rules.Initialize";
_rules.Initialize();
 //BA.debugLineNum = 365;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 366;BA.debugLine="SetLocalID(ID)";
_setlocalid(_id);
 //BA.debugLineNum = 367;BA.debugLine="SetName(ID)";
_setname(_id);
 //BA.debugLineNum = 368;BA.debugLine="On.Initialize";
_on.Initialize();
 //BA.debugLineNum = 369;BA.debugLine="ParentID = \"\"";
_parentid = "";
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
String _attr = "";
Object _strval = null;
 //BA.debugLineNum = 811;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 812;BA.debugLine="For Each attr As String In Attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attributes.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_attr = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 813;BA.debugLine="Dim strVal As Object = Attributes.Get(attr)";
_strval = _attributes.Get((Object)(_attr));
 //BA.debugLineNum = 814;BA.debugLine="Element.Put(attr,strVal)";
_element.Put((Object)(_attr),_strval);
 }
};
 //BA.debugLineNum = 816;BA.debugLine="SetOnCondition(On.Size,\"on\", On)";
_setoncondition(_on.getSize(),"on",(Object)(_on.getObject()));
 //BA.debugLineNum = 817;BA.debugLine="SetOnCondition(options.Size,\"options\", options)";
_setoncondition(_options.getSize(),"options",(Object)(_options.getObject()));
 //BA.debugLineNum = 818;BA.debugLine="SetOnCondition(Columns.Size,\"columns\", Columns)";
_setoncondition(_columns.getSize(),"columns",(Object)(_columns.getObject()));
 //BA.debugLineNum = 819;BA.debugLine="SetOnCondition(Cols.Size, \"cols\", Cols)";
_setoncondition(_cols.getSize(),"cols",(Object)(_cols.getObject()));
 //BA.debugLineNum = 820;BA.debugLine="SetOnCondition(Rows.Size, \"rows\", Rows)";
_setoncondition(_rows.getSize(),"rows",(Object)(_rows.getObject()));
 //BA.debugLineNum = 821;BA.debugLine="SetOnCondition(Elements.Size, \"elements\", Element";
_setoncondition(_elements.getSize(),"elements",(Object)(_elements.getObject()));
 //BA.debugLineNum = 822;BA.debugLine="SetOnCondition(Cells.Size, \"cells\", Cells)";
_setoncondition(_cells.getSize(),"cells",(Object)(_cells.getObject()));
 //BA.debugLineNum = 823;BA.debugLine="SetOnCondition(HTMLAttributes.Size, \"attributes\",";
_setoncondition(_htmlattributes.getSize(),"attributes",(Object)(_htmlattributes.getObject()));
 //BA.debugLineNum = 824;BA.debugLine="SetOnCondition(elementsConfig.Size, \"elementsConf";
_setoncondition(_elementsconfig.getSize(),"elementsConfig",(Object)(_elementsconfig.getObject()));
 //BA.debugLineNum = 825;BA.debugLine="SetOnCondition(Rules.Size, \"rules\", Rules)";
_setoncondition(_rules.getSize(),"rules",(Object)(_rules.getObject()));
 //BA.debugLineNum = 826;BA.debugLine="SetOnCondition(Styles.Size, \"css\", Styles)";
_setoncondition(_styles.getSize(),"css",(Object)(_styles.getObject()));
 //BA.debugLineNum = 827;BA.debugLine="Return Element";
if (true) return _element;
 //BA.debugLineNum = 828;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
 //BA.debugLineNum = 114;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 115;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 116;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 117;BA.debugLine="lst.clear";
_lst.Clear();
 //BA.debugLineNum = 118;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
 //BA.debugLineNum = 119;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 121;BA.debugLine="Try";
try { //BA.debugLineNum = 122;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 123;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
 //BA.debugLineNum = 124;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 126;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 192;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 193;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 194;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 195;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 196;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 197;BA.debugLine="Try";
try { //BA.debugLineNum = 198;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 199;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 200;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 202;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 204;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onaftercollapse(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 516;BA.debugLine="Sub onAfterCollapse(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 517;BA.debugLine="On.Put(\"onAfterCollapse\",cb)";
_on.Put((Object)("onAfterCollapse"),(Object)(_cb));
 //BA.debugLineNum = 518;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onaftereditstart(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 494;BA.debugLine="Sub OnAfterEditStart(cb As BANanoObject) As WixEle";
 //BA.debugLineNum = 495;BA.debugLine="On.Put(\"onAfterEditStart\",cb)";
_on.Put((Object)("onAfterEditStart"),(Object)(_cb));
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onaftereditstop(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 499;BA.debugLine="Sub OnAfterEditStop(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 500;BA.debugLine="On.Put(\"onAfterEditStop\",cb)";
_on.Put((Object)("onAfterEditStop"),(Object)(_cb));
 //BA.debugLineNum = 501;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onafterexpand(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 521;BA.debugLine="Sub onAfterExpand(cb As BANanoObject) As WixElemen";
 //BA.debugLineNum = 522;BA.debugLine="On.Put(\"onAfterExpand\",cb)";
_on.Put((Object)("onAfterExpand"),(Object)(_cb));
 //BA.debugLineNum = 523;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onafterfileadd(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 456;BA.debugLine="Sub OnAfterFileAdd(cb As BANanoObject) As WixEleme";
 //BA.debugLineNum = 457;BA.debugLine="On.put(\"onAfterFileAdd\",cb)";
_on.Put((Object)("onAfterFileAdd"),(Object)(_cb));
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onafterload(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub OnAfterLoad(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 404;BA.debugLine="On.Put(\"onAfterLoad\",cb)";
_on.Put((Object)("onAfterLoad"),(Object)(_cb));
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onafterselect(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub OnAfterSelect(cb As BANanoObject) As WixElemen";
 //BA.debugLineNum = 479;BA.debugLine="On.Put(\"onAfterSelect\",cb)";
_on.Put((Object)("onAfterSelect"),(Object)(_cb));
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onaftertabclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub OnAfterTabClick(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 435;BA.debugLine="On.Put(\"onAfterTabClick\",cb)";
_on.Put((Object)("onAfterTabClick"),(Object)(_cb));
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onafterunselect(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 543;BA.debugLine="Sub OnAfterUnSelect(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 544;BA.debugLine="On.Put(\"onAfterUnSelect\",cb)";
_on.Put((Object)("onAfterUnSelect"),(Object)(_cb));
 //BA.debugLineNum = 545;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onbeforedrop(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub onBeforeDrop(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 506;BA.debugLine="On.Put(\"onBeforeDrop\",cb)";
_on.Put((Object)("onBeforeDrop"),(Object)(_cb));
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onbeforefileadd(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub OnBeforeFileAdd(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 462;BA.debugLine="On.Put(\"onBeforeFileAdd\",cb)";
_on.Put((Object)("onBeforeFileAdd"),(Object)(_cb));
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onbeforeload(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub OnBeforeLoad(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 399;BA.debugLine="On.Put(\"onBeforeLoad\",cb)";
_on.Put((Object)("onBeforeLoad"),(Object)(_cb));
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onblur(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="Sub OnBlur(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 384;BA.debugLine="On.Put(\"onBlur\",cb)";
_on.Put((Object)("onBlur"),(Object)(_cb));
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onchange(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 408;BA.debugLine="Sub OnChange(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 409;BA.debugLine="On.Put(\"onChange\",cb)";
_on.Put((Object)("onChange"),(Object)(_cb));
 //BA.debugLineNum = 410;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _oncheck(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub OnCheck(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 440;BA.debugLine="On.Put(\"onCheck\",cb)";
_on.Put((Object)("onCheck"),(Object)(_cb));
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 532;BA.debugLine="Sub OnClick(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 533;BA.debugLine="On.Put(\"onClick\",cb)";
_on.Put((Object)("onClick"),(Object)(_cb));
 //BA.debugLineNum = 534;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _oncontext(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub OnContext(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 512;BA.debugLine="On.Put(\"onContext\",cb)";
_on.Put((Object)("onContext"),(Object)(_cb));
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _ondblclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 526;BA.debugLine="Sub OnDblClick(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 527;BA.debugLine="On.Put(\"onDblClick\",cb)";
_on.Put((Object)("onDblClick"),(Object)(_cb));
 //BA.debugLineNum = 528;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 529;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onenter(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub OnEnter(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 420;BA.debugLine="On.Put(\"onEnter\",cb)";
_on.Put((Object)("onEnter"),(Object)(_cb));
 //BA.debugLineNum = 421;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onfileupload(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Sub OnFileUpload(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 473;BA.debugLine="On.Put(\"onFileUpload\",cb)";
_on.Put((Object)("onFileUpload"),(Object)(_cb));
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onfileuploaderror(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub OnFileUploadError(cb As BANanoObject) As WixEl";
 //BA.debugLineNum = 467;BA.debugLine="On.Put(\"onFileUploadError\",cb)";
_on.Put((Object)("onFileUploadError"),(Object)(_cb));
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onfocus(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub OnFocus(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 389;BA.debugLine="On.Put(\"onFocus\",cb)";
_on.Put((Object)("onFocus"),(Object)(_cb));
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onitemclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub OnItemClick(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 484;BA.debugLine="On.Put(\"onItemClick\",cb)";
_on.Put((Object)("onItemClick"),(Object)(_cb));
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onitemdblclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 488;BA.debugLine="Sub OnItemDblClick(cb As BANanoObject) As WixEleme";
 //BA.debugLineNum = 489;BA.debugLine="On.Put(\"onItemDblClick\",cb)";
_on.Put((Object)("onItemDblClick"),(Object)(_cb));
 //BA.debugLineNum = 490;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onkeypress(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub OnKeyPress(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 394;BA.debugLine="On.Put(\"onKeyPress\",cb)";
_on.Put((Object)("onKeyPress"),(Object)(_cb));
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onliveedit(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub OnLiveEdit(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 425;BA.debugLine="On.Put(\"onLiveEdit\",cb)";
_on.Put((Object)("onLiveEdit"),(Object)(_cb));
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onlongtouch(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Sub onLongTouch(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 414;BA.debugLine="On.Put(\"onLongTouch\",cb)";
_on.Put((Object)("onLongTouch"),(Object)(_cb));
 //BA.debugLineNum = 415;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onmenuitemclick(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 537;BA.debugLine="Sub OnMenuItemClick(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 538;BA.debugLine="On.Put(\"onMenuItemClick\",cb)";
_on.Put((Object)("onMenuItemClick"),(Object)(_cb));
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onmousemove(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub OnMouseMove(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 374;BA.debugLine="On.Put(\"onMouseMove\",cb)";
_on.Put((Object)("onMouseMove"),(Object)(_cb));
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onmouseout(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub OnMouseOut(cb As BANanoObject) As WixElement";
 //BA.debugLineNum = 379;BA.debugLine="On.Put(\"onMouseOut\",cb)";
_on.Put((Object)("onMouseOut"),(Object)(_cb));
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onselectchange(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 445;BA.debugLine="Sub OnSelectChange(cb As BANanoObject) As WixEleme";
 //BA.debugLineNum = 446;BA.debugLine="On.put(\"onSelectChange\",cb)";
_on.Put((Object)("onSelectChange"),(Object)(_cb));
 //BA.debugLineNum = 447;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _ontimedkeypress(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub OnTimedKeyPress(cb As BANanoObject) As WixElem";
 //BA.debugLineNum = 430;BA.debugLine="On.Put(\"onTimedKeyPress\",cb)";
_on.Put((Object)("onTimedKeyPress"),(Object)(_cb));
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _onuploadcomplete(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 451;BA.debugLine="Sub OnUploadComplete(cb As BANanoObject) As WixEle";
 //BA.debugLineNum = 452;BA.debugLine="On.Put(\"onUploadComplete\",cb)";
_on.Put((Object)("onUploadComplete"),(Object)(_cb));
 //BA.debugLineNum = 453;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 454;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _removeattr(String _sdata) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="public Sub RemoveAttr(sData As String) As WixEleme";
 //BA.debugLineNum = 98;BA.debugLine="sData = sData.tolowercase";
_sdata = _sdata.toLowerCase();
 //BA.debugLineNum = 99;BA.debugLine="Element.Remove(sData)";
_element.Remove((Object)(_sdata));
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setalign(String _r) throws Exception{
 //BA.debugLineNum = 1016;BA.debugLine="Sub SetAlign(r As String) As WixElement 'ignore";
 //BA.debugLineNum = 1017;BA.debugLine="SetAttr(\"align\", r)";
_setattr("align",(Object)(_r));
 //BA.debugLineNum = 1018;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1019;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 1004;BA.debugLine="Sub SetAlignCenter(r As String) As WixElement 'ign";
 //BA.debugLineNum = 1005;BA.debugLine="SetAlign(\"center\")";
_setalign("center");
 //BA.debugLineNum = 1006;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1007;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 1010;BA.debugLine="Sub SetAlignLeft(r As String) As WixElement 'ignor";
 //BA.debugLineNum = 1011;BA.debugLine="SetAlign(\"left\")";
_setalign("left");
 //BA.debugLineNum = 1012;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1013;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 998;BA.debugLine="Sub SetAlignRight(r As String) As WixElement 'igno";
 //BA.debugLineNum = 999;BA.debugLine="SetAlign(\"right\")";
_setalign("right");
 //BA.debugLineNum = 1000;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1001;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 657;BA.debugLine="Sub SetAnimate(b As Boolean) As WixElement";
 //BA.debugLineNum = 658;BA.debugLine="SetAttr(\"animate\",b)";
_setattr("animate",(Object)(_b));
 //BA.debugLineNum = 659;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setattr(String _p,Object _v) throws Exception{
 //BA.debugLineNum = 799;BA.debugLine="Sub SetAttr(p As String, v As Object) As WixElemen";
 //BA.debugLineNum = 800;BA.debugLine="Element.Put(p,v)";
_element.Put((Object)(_p),_v);
 //BA.debugLineNum = 801;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 21;BA.debugLine="Sub SetAttributes(m As Map) As WixElement";
 //BA.debugLineNum = 22;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 23;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 24;BA.debugLine="SetAttr(k,v)";
_setattr(_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setautoheight(boolean _b) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetAutoHeight(b As Boolean) As WixElement";
 //BA.debugLineNum = 266;BA.debugLine="SetAttr(\"autoheight\", b)";
_setattr("autoheight",(Object)(_b));
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setautowidth(boolean _b) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetAutoWidth(b As Boolean) As WixElement";
 //BA.debugLineNum = 292;BA.debugLine="SetAttr(\"autowidth\", b)";
_setattr("autowidth",(Object)(_b));
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setbadge(Object _b) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetBadge(b As Object) As WixElement";
 //BA.debugLineNum = 174;BA.debugLine="SetAttr(\"badge\", b)";
_setattr("badge",_b);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 651;BA.debugLine="Sub SetBatch(b As Int) As WixElement";
 //BA.debugLineNum = 652;BA.debugLine="SetAttr(\"batch\",b)";
_setattr("batch",(Object)(_b));
 //BA.debugLineNum = 653;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 654;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setbody(Object _b) throws Exception{
 //BA.debugLineNum = 742;BA.debugLine="Sub SetBody(b As Object) As WixElement";
 //BA.debugLineNum = 743;BA.debugLine="SetAttr(\"body\", b)";
_setattr("body",_b);
 //BA.debugLineNum = 744;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 745;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixElement";
 //BA.debugLineNum = 329;BA.debugLine="SetAttr(\"borderless\", b)";
_setattr("borderless",(Object)(_b));
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setbottom(Object _r) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetBottom(r As Object) As WixElement";
 //BA.debugLineNum = 53;BA.debugLine="SetAttr(\"bottom\", r)";
_setattr("bottom",_r);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setclick(com.ab.banano.BANanoObject _c) throws Exception{
 //BA.debugLineNum = 849;BA.debugLine="Sub SetClick(c As BANanoObject) As WixElement";
 //BA.debugLineNum = 850;BA.debugLine="Element.Put(\"click\", c)";
_element.Put((Object)("click"),(Object)(_c));
 //BA.debugLineNum = 851;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 852;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setcollapsed(boolean _c) throws Exception{
 //BA.debugLineNum = 1089;BA.debugLine="Sub SetCollapsed(c As Boolean) As WixElement";
 //BA.debugLineNum = 1090;BA.debugLine="SetAttr(\"collapsed\", c)";
_setattr("collapsed",(Object)(_c));
 //BA.debugLineNum = 1091;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1092;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setcontainer(String _c) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetContainer(c As String) As WixElement";
 //BA.debugLineNum = 323;BA.debugLine="SetAttr(\"container\", c)";
_setattr("container",(Object)(_c));
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setcss(String _cs) throws Exception{
 //BA.debugLineNum = 784;BA.debugLine="Sub SetCSS(cs As String) As WixElement";
 //BA.debugLineNum = 785;BA.debugLine="SetAttr(\"css\", cs)";
_setattr("css",(Object)(_cs));
 //BA.debugLineNum = 786;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 787;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setcssjson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 789;BA.debugLine="Sub SetCSSJSON(json As String) As WixElement";
 //BA.debugLineNum = 790;BA.debugLine="Dim m As Map = Json2Map(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _json2map(_json);
 //BA.debugLineNum = 791;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 792;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 793;BA.debugLine="SetStyle(mk, mv)";
_setstyle(_mk,BA.ObjectToString(_mv));
 }
};
 //BA.debugLineNum = 795;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 730;BA.debugLine="Sub SetData(d As List) As WixElement";
 //BA.debugLineNum = 731;BA.debugLine="Element.Put(\"data\", d)";
_element.Put((Object)("data"),(Object)(_d.getObject()));
 //BA.debugLineNum = 732;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 733;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaultalign(String _a) throws Exception{
 //BA.debugLineNum = 622;BA.debugLine="Sub SetDefaultAlign(a As String) As WixElement";
 //BA.debugLineNum = 623;BA.debugLine="elementsConfig.Put(\"align\", a)";
_elementsconfig.Put((Object)("align"),(Object)(_a));
 //BA.debugLineNum = 624;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaultbottompadding(int _w) throws Exception{
 //BA.debugLineNum = 639;BA.debugLine="Sub SetDefaultBottomPadding(w As Int) As WixElemen";
 //BA.debugLineNum = 640;BA.debugLine="elementsConfig.Put(\"bottomPadding\", w)";
_elementsconfig.Put((Object)("bottomPadding"),(Object)(_w));
 //BA.debugLineNum = 641;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaultheight(int _h) throws Exception{
 //BA.debugLineNum = 634;BA.debugLine="Sub SetDefaultHeight(h As Int) As WixElement";
 //BA.debugLineNum = 635;BA.debugLine="elementsConfig.Put(\"height\", h)";
_elementsconfig.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 636;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 637;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaultlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 603;BA.debugLine="Sub SetDefaultLabelAlign(a As String) As WixElemen";
 //BA.debugLineNum = 604;BA.debugLine="elementsConfig.Put(\"labelAlign\", a)";
_elementsconfig.Put((Object)("labelAlign"),(Object)(_a));
 //BA.debugLineNum = 605;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 606;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaultlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 616;BA.debugLine="Sub SetDefaultLabelPosition(p As String) As WixEle";
 //BA.debugLineNum = 617;BA.debugLine="elementsConfig.Put(\"labelPosition\", p)";
_elementsconfig.Put((Object)("labelPosition"),(Object)(_p));
 //BA.debugLineNum = 618;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaultlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 609;BA.debugLine="Sub SetDefaultLabelWidth(a As Int) As WixElement";
 //BA.debugLineNum = 610;BA.debugLine="elementsConfig.Put(\"labelWidth\", a)";
_elementsconfig.Put((Object)("labelWidth"),(Object)(_a));
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaulttype(String _a) throws Exception{
 //BA.debugLineNum = 579;BA.debugLine="Sub SetDefaultType(a As String) As WixElement";
 //BA.debugLineNum = 580;BA.debugLine="elementsConfig.Put(\"type\", a)";
_elementsconfig.Put((Object)("type"),(Object)(_a));
 //BA.debugLineNum = 581;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaulttypeicon(String _r) throws Exception{
 //BA.debugLineNum = 1113;BA.debugLine="Sub SetDefaultTypeIcon(r As String) As WixElement";
 //BA.debugLineNum = 1114;BA.debugLine="SetDefaultType(\"icon\")";
_setdefaulttype("icon");
 //BA.debugLineNum = 1115;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1116;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaulttypeiconbutton(String _r) throws Exception{
 //BA.debugLineNum = 1095;BA.debugLine="Sub SetDefaultTypeIconButton(r As String) As WixEl";
 //BA.debugLineNum = 1096;BA.debugLine="SetDefaultType(\"iconButton\")";
_setdefaulttype("iconButton");
 //BA.debugLineNum = 1097;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1098;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaulttypeiconbuttontop(String _r) throws Exception{
 //BA.debugLineNum = 1119;BA.debugLine="Sub SetDefaultTypeIconButtonTop(r As String) As Wi";
 //BA.debugLineNum = 1120;BA.debugLine="SetDefaultType(\"iconButtonTop\")";
_setdefaulttype("iconButtonTop");
 //BA.debugLineNum = 1121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaulttypeimage(String _r) throws Exception{
 //BA.debugLineNum = 1107;BA.debugLine="Sub SetDefaultTypeImage(r As String) As WixElement";
 //BA.debugLineNum = 1108;BA.debugLine="SetDefaultType(\"image\")";
_setdefaulttype("image");
 //BA.debugLineNum = 1109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaulttypeimagebutton(String _r) throws Exception{
 //BA.debugLineNum = 1101;BA.debugLine="Sub SetDefaultTypeImageButton(r As String) As WixE";
 //BA.debugLineNum = 1102;BA.debugLine="SetDefaultType(\"imageButton\")";
_setdefaulttype("imageButton");
 //BA.debugLineNum = 1103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1104;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaultview(String _a) throws Exception{
 //BA.debugLineNum = 573;BA.debugLine="Sub SetDefaultView(a As String) As WixElement";
 //BA.debugLineNum = 574;BA.debugLine="elementsConfig.Put(\"view\", a)";
_elementsconfig.Put((Object)("view"),(Object)(_a));
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setdefaultwidth(int _w) throws Exception{
 //BA.debugLineNum = 628;BA.debugLine="Sub SetDefaultWidth(w As Int) As WixElement";
 //BA.debugLineNum = 629;BA.debugLine="elementsConfig.Put(\"width\", w)";
_elementsconfig.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 630;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 631;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setelementsconfigjson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 103;BA.debugLine="Sub SetElementsConfigJSON(json As String) As WixEl";
 //BA.debugLineNum = 104;BA.debugLine="Dim m As Map = Json2Map(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _json2map(_json);
 //BA.debugLineNum = 105;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 106;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 107;BA.debugLine="elementsConfig.Put(mk,mv)";
_elementsconfig.Put((Object)(_mk),_mv);
 }
};
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setgravity(int _g) throws Exception{
 //BA.debugLineNum = 748;BA.debugLine="Sub SetGravity(g As Int) As WixElement";
 //BA.debugLineNum = 749;BA.debugLine="SetAttr(\"gravity\", g)";
_setattr("gravity",(Object)(_g));
 //BA.debugLineNum = 750;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 751;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setheader(Object _h) throws Exception{
 //BA.debugLineNum = 736;BA.debugLine="Sub SetHeader(h As Object) As WixElement";
 //BA.debugLineNum = 737;BA.debugLine="SetAttr(\"header\", h)";
_setattr("header",_h);
 //BA.debugLineNum = 738;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 739;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 772;BA.debugLine="Sub SetHeight(h As Object) As WixElement";
 //BA.debugLineNum = 773;BA.debugLine="SetAttr(\"height\", h)";
_setattr("height",_h);
 //BA.debugLineNum = 774;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetHidden(b As Boolean) As WixElement";
 //BA.debugLineNum = 180;BA.debugLine="SetAttr(\"hidden\", b)";
_setattr("hidden",(Object)(_b));
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _sethref(Object _h) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetHREF(h As Object) As WixElement";
 //BA.debugLineNum = 73;BA.debugLine="SetAttr(\"href\", h)";
_setattr("href",_h);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _sethtmlattr(String _attrname,Object _attrvalue) throws Exception{
 //BA.debugLineNum = 805;BA.debugLine="Sub SetHTMLAttr(attrName As String, attrValue As O";
 //BA.debugLineNum = 806;BA.debugLine="HTMLAttributes.put(attrName,attrValue)";
_htmlattributes.Put((Object)(_attrname),_attrvalue);
 //BA.debugLineNum = 807;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _seticon(String _i) throws Exception{
 //BA.debugLineNum = 837;BA.debugLine="Sub SetIcon(i As String) As WixElement";
 //BA.debugLineNum = 838;BA.debugLine="SetAttr(\"icon\", i)";
_setattr("icon",(Object)(_i));
 //BA.debugLineNum = 839;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 699;BA.debugLine="Sub SetInputWidth(w As Int) As WixElement";
 //BA.debugLineNum = 700;BA.debugLine="SetAttr(\"inputWidth\", w)";
_setattr("inputWidth",(Object)(_w));
 //BA.debugLineNum = 701;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 843;BA.debugLine="Sub SetLabel(l As String) As WixElement";
 //BA.debugLineNum = 844;BA.debugLine="SetAttr(\"label\", l)";
_setattr("label",(Object)(_l));
 //BA.debugLineNum = 845;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 846;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 585;BA.debugLine="Sub SetLabelAlign(a As String) As WixElement";
 //BA.debugLineNum = 586;BA.debugLine="SetAttr(\"labelAlign\", a)";
_setattr("labelAlign",(Object)(_a));
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setlabelheight(int _h) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetLabelHeight(h As Int) As WixElement";
 //BA.debugLineNum = 341;BA.debugLine="SetAttr(\"labelHeight\", h)";
_setattr("labelHeight",(Object)(_h));
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 597;BA.debugLine="Sub SetLabelPosition(p As String) As WixElement";
 //BA.debugLineNum = 598;BA.debugLine="SetAttr(\"labelPosition\", p)";
_setattr("labelPosition",(Object)(_p));
 //BA.debugLineNum = 599;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setlabelwidth(int _a) throws Exception{
 //BA.debugLineNum = 591;BA.debugLine="Sub SetLabelWidth(a As Int) As WixElement";
 //BA.debugLineNum = 592;BA.debugLine="SetAttr(\"labelWidth\", a)";
_setattr("labelWidth",(Object)(_a));
 //BA.debugLineNum = 593;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setleft(Object _r) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetLeft(r As Object) As WixElement";
 //BA.debugLineNum = 38;BA.debugLine="SetAttr(\"left\", r)";
_setattr("left",_r);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setlocalid(String _i) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetLocalID(i As String) As WixElement";
 //BA.debugLineNum = 186;BA.debugLine="SetAttr(\"localId\", i)";
_setattr("localId",(Object)(_i));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 948;BA.debugLine="Sub SetMap(m As Map) As WixElement";
 //BA.debugLineNum = 949;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 950;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 951;BA.debugLine="SetAttr(strKey,	strVal)";
_setattr(_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 953;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 954;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setmargin(String _margin) throws Exception{
 //BA.debugLineNum = 693;BA.debugLine="Sub SetMargin(margin As String) As WixElement";
 //BA.debugLineNum = 694;BA.debugLine="Element.Put(\"margin\", margin)";
_element.Put((Object)("margin"),(Object)(_margin));
 //BA.debugLineNum = 695;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 696;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setmaxheight(int _h) throws Exception{
 //BA.debugLineNum = 687;BA.debugLine="Sub SetMaxHeight(h As Int) As WixElement";
 //BA.debugLineNum = 688;BA.debugLine="Element.Put(\"maxHeight\", h)";
_element.Put((Object)("maxHeight"),(Object)(_h));
 //BA.debugLineNum = 689;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 690;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setmaxwidth(int _w) throws Exception{
 //BA.debugLineNum = 681;BA.debugLine="Sub SetMaxWidth(w As Int) As WixElement";
 //BA.debugLineNum = 682;BA.debugLine="Element.Put(\"maxWidth\", w)";
_element.Put((Object)("maxWidth"),(Object)(_w));
 //BA.debugLineNum = 683;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 684;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 675;BA.debugLine="Sub SetMinHeight(h As Int) As WixElement";
 //BA.debugLineNum = 676;BA.debugLine="Element.Put(\"minHeight\", h)";
_element.Put((Object)("minHeight"),(Object)(_h));
 //BA.debugLineNum = 677;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 678;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 669;BA.debugLine="Sub SetMinWidth(w As Int) As WixElement";
 //BA.debugLineNum = 670;BA.debugLine="Element.put(\"minwidth\",w)";
_element.Put((Object)("minwidth"),(Object)(_w));
 //BA.debugLineNum = 671;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 672;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setmultiview(boolean _b) throws Exception{
 //BA.debugLineNum = 831;BA.debugLine="Sub SetMultiView(b As Boolean) As WixElement";
 //BA.debugLineNum = 832;BA.debugLine="SetAttr(\"multiview\", b)";
_setattr("multiview",(Object)(_b));
 //BA.debugLineNum = 833;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 834;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setname(String _n) throws Exception{
 //BA.debugLineNum = 561;BA.debugLine="Sub SetName(n As String) As WixElement";
 //BA.debugLineNum = 562;BA.debugLine="SetAttr(\"name\", n)";
_setattr("name",(Object)(_n));
 //BA.debugLineNum = 563;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setoncondition(int _condition,String _prop,Object _propvalue) throws Exception{
 //BA.debugLineNum = 1034;BA.debugLine="Sub SetOnCondition(Condition As Int, Prop As Strin";
 //BA.debugLineNum = 1035;BA.debugLine="If Condition <= 0 Then Return Me";
if (_condition<=0) { 
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);};
 //BA.debugLineNum = 1036;BA.debugLine="Element.put(Prop,PropValue)";
_element.Put((Object)(_prop),_propvalue);
 //BA.debugLineNum = 1037;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1038;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setopen(Object _o) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetOpen(o As Object) As WixElement";
 //BA.debugLineNum = 68;BA.debugLine="SetAttr(\"open\", o)";
_setattr("open",_o);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Sub SetOptions(o As List) As WixElement";
 //BA.debugLineNum = 550;BA.debugLine="SetAttr(\"options\", o)";
_setattr("options",(Object)(_o.getObject()));
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setoptionsjson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.Map _rec = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _mk = "";
Object _mv = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 130;BA.debugLine="Sub SetOptionsJSON(json As String) As WixElement";
 //BA.debugLineNum = 131;BA.debugLine="If json.StartsWith(\"[\") Then";
if (_json.startsWith("[")) { 
 //BA.debugLineNum = 132;BA.debugLine="Dim lst As List = Json2List(json)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = _json2list(_json);
 //BA.debugLineNum = 133;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 134;BA.debugLine="options.Add(rec)";
_options.Add((Object)(_rec.getObject()));
 }
};
 }else if(_json.startsWith("{")) { 
 //BA.debugLineNum = 137;BA.debugLine="Dim m As Map = Json2Map(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _json2map(_json);
 //BA.debugLineNum = 138;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _m.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_mk = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 139;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 140;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 141;BA.debugLine="opt.Put(mk,mv)";
_opt.Put((Object)(_mk),_mv);
 //BA.debugLineNum = 142;BA.debugLine="options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 }
};
 };
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setoptionsmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _mk = "";
Object _mv = null;
 //BA.debugLineNum = 157;BA.debugLine="Sub SetOptionsMAP(m As Map) As WixElement";
 //BA.debugLineNum = 158;BA.debugLine="For Each mk As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 159;BA.debugLine="Dim mv As Object = m.Get(mk)";
_mv = _m.Get((Object)(_mk));
 //BA.debugLineNum = 160;BA.debugLine="AddOption(mk, mv)";
_addoption(_mk,_mv);
 }
};
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setpadding(String _padding) throws Exception{
 //BA.debugLineNum = 705;BA.debugLine="Sub SetPadding(padding As String) As WixElement";
 //BA.debugLineNum = 706;BA.debugLine="Element.Put(\"padding\", padding)";
_element.Put((Object)("padding"),(Object)(_padding));
 //BA.debugLineNum = 707;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 708;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setpaddingx(String _x) throws Exception{
 //BA.debugLineNum = 718;BA.debugLine="Sub SetPaddingX(x As String) As WixElement";
 //BA.debugLineNum = 719;BA.debugLine="Element.Put(\"paddingX\", x)";
_element.Put((Object)("paddingX"),(Object)(_x));
 //BA.debugLineNum = 720;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setpaddingy(String _y) throws Exception{
 //BA.debugLineNum = 724;BA.debugLine="Sub SetPaddingY(y As String) As WixElement";
 //BA.debugLineNum = 725;BA.debugLine="Element.Put(\"paddingY\",y)";
_element.Put((Object)("paddingY"),(Object)(_y));
 //BA.debugLineNum = 726;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 727;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setparent(Object _p) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetParent(p As Object) As WixElement";
 //BA.debugLineNum = 62;BA.debugLine="SetAttr(\"parentid\", p)";
_setattr("parentid",_p);
 //BA.debugLineNum = 63;BA.debugLine="ParentID = p";
_parentid = BA.ObjectToString(_p);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setplaceholder(String _p) throws Exception{
 //BA.debugLineNum = 712;BA.debugLine="Sub SetPlaceHolder(p As String) As WixElement";
 //BA.debugLineNum = 713;BA.debugLine="Element.Put(\"placeholder\", p)";
_element.Put((Object)("placeholder"),(Object)(_p));
 //BA.debugLineNum = 714;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 567;BA.debugLine="Sub SetRequired(b As Boolean) As WixElement";
 //BA.debugLineNum = 568;BA.debugLine="SetAttr(\"required\", b)";
_setattr("required",(Object)(_b));
 //BA.debugLineNum = 569;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetResponsive(b As Object) As WixElement";
 //BA.debugLineNum = 280;BA.debugLine="SetAttr(\"responsive\", b)";
_setattr("responsive",_b);
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixElement";
 //BA.debugLineNum = 286;BA.debugLine="SetAttr(\"responsiveCell\", b)";
_setattr("responsiveCell",_b);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setright(Object _r) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetRight(r As Object) As WixElement";
 //BA.debugLineNum = 48;BA.debugLine="SetAttr(\"right\", r)";
_setattr("right",_r);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setscroll(Object _c) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetScroll(c As Object) As WixElement";
 //BA.debugLineNum = 305;BA.debugLine="SetAttr(\"scroll\", c)";
_setattr("scroll",_c);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setscrollx(Object _b) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetScrollX(b As Object) As WixElement";
 //BA.debugLineNum = 317;BA.debugLine="SetAttr(\"scrollX\", b)";
_setattr("scrollX",_b);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setscrolly(Object _b) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetScrollY(b As Object) As WixElement";
 //BA.debugLineNum = 311;BA.debugLine="SetAttr(\"scrollY\", b)";
_setattr("scrollY",_b);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setselect(boolean _b) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub SetSelect(b As Boolean) As WixElement";
 //BA.debugLineNum = 335;BA.debugLine="SetAttr(\"select\", b)";
_setattr("select",(Object)(_b));
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setsidebarimage(Object _i) throws Exception{
b4j.Mashy.BANanoWebixDemo.uoenowhtml _ih = null;
String _icon = "";
 //BA.debugLineNum = 82;BA.debugLine="Sub SetSideBarImage(i As Object) As WixElement";
 //BA.debugLineNum = 83;BA.debugLine="Dim ih As UOENowHTML";
_ih = new b4j.Mashy.BANanoWebixDemo.uoenowhtml();
 //BA.debugLineNum = 84;BA.debugLine="ih.Initialize(\"\",\"img\").SetImportant(False).SetSR";
_ih._initialize /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (ba,"","img")._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False)._setsrc /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (BA.ObjectToString(_i),__c.True)._addclass /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("sidebar-icon");
 //BA.debugLineNum = 85;BA.debugLine="Dim icon As String = ih.html";
_icon = _ih._html /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="SetIcon(icon)";
_seticon(_icon);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setstate(Object _s) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub SetState(s As Object) As WixElement";
 //BA.debugLineNum = 556;BA.debugLine="SetAttr(\"state\", s)";
_setattr("state",_s);
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 664;BA.debugLine="Styles.Put(prop,val)";
_styles.Put((Object)(_prop),(Object)(_val));
 //BA.debugLineNum = 665;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetStyles(m As Map) As WixElement";
 //BA.debugLineNum = 30;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 31;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 32;BA.debugLine="SetStyle(k,v)";
_setstyle(_k,_v);
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setsuggest(Object _s) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetSuggest(s As Object) As WixElement";
 //BA.debugLineNum = 299;BA.debugLine="SetAttr(\"suggest\", s)";
_setattr("suggest",_s);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settarget(Object _h) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetTarget(h As Object) As WixElement";
 //BA.debugLineNum = 78;BA.debugLine="SetAttr(\"target\", h)";
_setattr("target",_h);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settemplate(Object _t) throws Exception{
 //BA.debugLineNum = 877;BA.debugLine="Sub SetTemplate(t As Object) As WixElement";
 //BA.debugLineNum = 878;BA.debugLine="Element.Put(\"template\", t)";
_element.Put((Object)("template"),_t);
 //BA.debugLineNum = 879;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 271;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixElement";
 //BA.debugLineNum = 272;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 273;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 274;BA.debugLine="SetTemplate(os)";
_settemplate((Object)(_os));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetTooltip(tt As String) As WixElement";
 //BA.debugLineNum = 347;BA.debugLine="SetAttr(\"tooltip\", tt)";
_setattr("tooltip",(Object)(_tt));
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settop(Object _r) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetTop(r As Object) As WixElement";
 //BA.debugLineNum = 43;BA.debugLine="SetAttr(\"top\", r)";
_setattr("top",_r);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settype(String _t) throws Exception{
 //BA.debugLineNum = 766;BA.debugLine="Sub SetType(t As String) As WixElement";
 //BA.debugLineNum = 767;BA.debugLine="SetAttr(\"type\", t)";
_setattr("type",(Object)(_t));
 //BA.debugLineNum = 768;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 769;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settypeclean(String _r) throws Exception{
 //BA.debugLineNum = 1041;BA.debugLine="Sub SetTypeClean(r As String) As WixElement  'igno";
 //BA.debugLineNum = 1042;BA.debugLine="SetType(\"clean\")";
_settype("clean");
 //BA.debugLineNum = 1043;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1044;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settypeform(String _r) throws Exception{
 //BA.debugLineNum = 1071;BA.debugLine="Sub SetTypeForm(r As String) As WixElement		'ignor";
 //BA.debugLineNum = 1072;BA.debugLine="SetType(\"form\")";
_settype("form");
 //BA.debugLineNum = 1073;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1074;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settypehead(String _r) throws Exception{
 //BA.debugLineNum = 1065;BA.debugLine="Sub SetTypeHead(r As String) As WixElement		'ignor";
 //BA.debugLineNum = 1066;BA.debugLine="SetType(\"head\")";
_settype("head");
 //BA.debugLineNum = 1067;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1068;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settypeline(String _r) throws Exception{
 //BA.debugLineNum = 1047;BA.debugLine="Sub SetTypeLine(r As String) As WixElement   'igno";
 //BA.debugLineNum = 1048;BA.debugLine="SetType(\"line\")";
_settype("line");
 //BA.debugLineNum = 1049;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1050;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settypespace(String _r) throws Exception{
 //BA.debugLineNum = 1059;BA.debugLine="Sub SetTypeSpace(r As String) As WixElement   'ign";
 //BA.debugLineNum = 1060;BA.debugLine="SetType(\"space\")";
_settype("space");
 //BA.debugLineNum = 1061;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1062;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _settypewide(String _r) throws Exception{
 //BA.debugLineNum = 1053;BA.debugLine="Sub SetTypeWide(r As String) As WixElement   'igno";
 //BA.debugLineNum = 1054;BA.debugLine="SetType(\"wide\")";
_settype("wide");
 //BA.debugLineNum = 1055;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1056;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 760;BA.debugLine="Sub SetValue(v As String) As WixElement";
 //BA.debugLineNum = 761;BA.debugLine="SetAttr(\"value\", v)";
_setattr("value",(Object)(_v));
 //BA.debugLineNum = 762;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 763;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setview(String _v) throws Exception{
 //BA.debugLineNum = 754;BA.debugLine="Sub SetView(v As String) As WixElement";
 //BA.debugLineNum = 755;BA.debugLine="SetAttr(\"view\", v)";
_setattr("view",(Object)(_v));
 //BA.debugLineNum = 756;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 757;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setviewheaderlayout(String _r) throws Exception{
 //BA.debugLineNum = 1078;BA.debugLine="Sub SetViewHeaderLayout(r As String) As WixElement";
 //BA.debugLineNum = 1079;BA.debugLine="SetView(\"headerlayout\")";
_setview("headerlayout");
 //BA.debugLineNum = 1080;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 1081;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setvisiblebatch(int _b) throws Exception{
 //BA.debugLineNum = 645;BA.debugLine="Sub SetVisibleBatch(b As Int) As WixElement";
 //BA.debugLineNum = 646;BA.debugLine="SetAttr(\"visibleBatch\", b)";
_setattr("visibleBatch",(Object)(_b));
 //BA.debugLineNum = 647;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 648;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 778;BA.debugLine="Sub SetWidth(w As Object) As WixElement";
 //BA.debugLineNum = 779;BA.debugLine="SetAttr(\"width\", w)";
_setattr("width",_w);
 //BA.debugLineNum = 780;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixelement)(this);
 //BA.debugLineNum = 781;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
