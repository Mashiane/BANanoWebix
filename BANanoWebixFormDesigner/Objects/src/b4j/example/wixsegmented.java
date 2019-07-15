package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixsegmented extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixsegmented", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixsegmented.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _segmented = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public anywheresoftware.b4a.objects.collections.List _cells = null;
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.dbutton _dbutton = null;
public b4j.example.modcenter _modcenter = null;
public b4j.example.modsidebar _modsidebar = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.drow _drow = null;
public b4j.example.dpager _dpager = null;
public b4j.example.ddbllist _ddbllist = null;
public b4j.example.dform _dform = null;
public b4j.example.dcheckbox _dcheckbox = null;
public b4j.example.dcolorpicker _dcolorpicker = null;
public b4j.example.dcombo _dcombo = null;
public b4j.example.dcounter _dcounter = null;
public b4j.example.ddatepicker _ddatepicker = null;
public b4j.example.dicon _dicon = null;
public b4j.example.dlabel _dlabel = null;
public b4j.example.dradio _dradio = null;
public b4j.example.drichselect _drichselect = null;
public b4j.example.dsearch _dsearch = null;
public b4j.example.dselect _dselect = null;
public b4j.example.dsegmented _dsegmented = null;
public b4j.example.dslider _dslider = null;
public b4j.example.dswitch _dswitch = null;
public b4j.example.dtabbar _dtabbar = null;
public b4j.example.dtext _dtext = null;
public b4j.example.dtextarea _dtextarea = null;
public b4j.example.dtoggle _dtoggle = null;
public b4j.example.duploader _duploader = null;
public b4j.example.dfieldset _dfieldset = null;
public b4j.example.dsuggest _dsuggest = null;
public b4j.example.dcolumn _dcolumn = null;
public b4j.example.modpropertybag _modpropertybag = null;
public b4j.example.ddesignerproperty _ddesignerproperty = null;
public b4j.example.dconnection _dconnection = null;
public b4j.example.dtable _dtable = null;
public b4j.example.dfield _dfield = null;
public b4j.example.modwebix _modwebix = null;
public b4j.example.wixsegmented  _addoption(String _oid,String _otxt,String _childtemplate) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 103;BA.debugLine="Sub AddOption(oid As String, oTxt As String, child";
 //BA.debugLineNum = 104;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 105;BA.debugLine="opt.put(\"id\",oid)";
_opt.Put((Object)("id"),(Object)(_oid));
 //BA.debugLineNum = 106;BA.debugLine="opt.Put(\"value\",oTxt)";
_opt.Put((Object)("value"),(Object)(_otxt));
 //BA.debugLineNum = 107;BA.debugLine="Options.Add(opt)";
_options.Add((Object)(_opt.getObject()));
 //BA.debugLineNum = 108;BA.debugLine="If childTemplate <> \"\" Then";
if ((_childtemplate).equals("") == false) { 
 //BA.debugLineNum = 109;BA.debugLine="Dim Cell As Map = CreateMap()";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __c.createMap(new Object[] {});
 //BA.debugLineNum = 110;BA.debugLine="Cell.Put(\"id\", oid)";
_cell.Put((Object)("id"),(Object)(_oid));
 //BA.debugLineNum = 111;BA.debugLine="Cell.Put(\"template\", childTemplate)";
_cell.Put((Object)("template"),(Object)(_childtemplate));
 //BA.debugLineNum = 112;BA.debugLine="Cells.Add(Cell)";
_cells.Add((Object)(_cell.getObject()));
 };
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 149;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 154;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 119;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 144;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Segmented As WixElement";
_segmented = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public Cells As List";
_cells = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixsegmented  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixSegment";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Segmented.Initialize(iID).SetView(\"segmented\")";
_segmented._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("segmented");
 //BA.debugLineNum = 13;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 80;BA.debugLine="Segmented.SetAttr(\"options\", Options)";
_segmented._setattr /*b4j.example.wixelement*/ ("options",(Object)(_options.getObject()));
 //BA.debugLineNum = 81;BA.debugLine="Return Segmented.item";
if (true) return _segmented._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetAlignCenter(r As String) As WixSegmented 'i";
 //BA.debugLineNum = 131;BA.debugLine="Segmented.setAligncenter(\"\")";
_segmented._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetAlignLeft(r As String) As WixSegmented 'ign";
 //BA.debugLineNum = 137;BA.debugLine="Segmented.SetAlignleft(\"\")";
_segmented._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetAlignRight(r As String) As WixSegmented 'ig";
 //BA.debugLineNum = 125;BA.debugLine="Segmented.setAlignright(\"\")";
_segmented._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetLabel(l As String) As WixSegmented";
 //BA.debugLineNum = 92;BA.debugLine="Segmented.SetLabel(l)";
_segmented._setlabel /*b4j.example.wixelement*/ (_l);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub SetMap(m As Map) As WixSegmented";
 //BA.debugLineNum = 33;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 34;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 35;BA.debugLine="Segmented.SetAttr(strKey,	strVal)";
_segmented._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMinHeight(h As Int) As WixSegmented";
 //BA.debugLineNum = 62;BA.debugLine="Segmented.SetMinHeight(h)";
_segmented._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMinWidth(w As Int) As WixSegmented";
 //BA.debugLineNum = 56;BA.debugLine="Segmented.SetMinWidth(w)";
_segmented._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setname(String _n) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetName(n As String) As WixSegmented";
 //BA.debugLineNum = 27;BA.debugLine="Segmented.SetName(n)";
_segmented._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setoptions(anywheresoftware.b4a.objects.collections.List _o) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetOptions(o As List) As WixSegmented";
 //BA.debugLineNum = 86;BA.debugLine="Options = o";
_options = _o;
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetResponsive(b As Object) As WixSegmented";
 //BA.debugLineNum = 43;BA.debugLine="Segmented.SetResponsive(b)";
_segmented._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixSegmented";
 //BA.debugLineNum = 49;BA.debugLine="Segmented.SetResponsiveCell(b)";
_segmented._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 74;BA.debugLine="Segmented.SetStyle(prop,val)";
_segmented._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 19;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixSegment";
 //BA.debugLineNum = 20;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 21;BA.debugLine="Segmented.SetTemplate(os)";
_segmented._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetTooltip(tt As String) As WixSegmented";
 //BA.debugLineNum = 68;BA.debugLine="Segmented.SetTooltip(tt)";
_segmented._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixsegmented  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetValue(v As String) As WixSegmented";
 //BA.debugLineNum = 98;BA.debugLine="Segmented.SetValue(v)";
_segmented._setvalue /*b4j.example.wixelement*/ (_v);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.wixsegmented)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
