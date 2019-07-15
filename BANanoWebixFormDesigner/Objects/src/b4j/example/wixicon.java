package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixicon extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixicon", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixicon.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _icon = null;
public com.ab.banano.BANanoObject _onclick = null;
public b4j.example.wixelement _parent = null;
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
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 172;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 177;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 104;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 167;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 109;BA.debugLine="tblB.Toolbar.AddColumns(Item)";
_tblb._toolbar /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Icon As WixElement";
_icon = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private onClick As BANanoObject";
_onclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.example.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixicon  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(bID As String) As WixIcon";
 //BA.debugLineNum = 11;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Icon.Initialize(ID).SetView(\"icon\")";
_icon._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("icon");
 //BA.debugLineNum = 13;BA.debugLine="onClick = Null";
_onclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Parent = Null";
_parent = (b4j.example.wixelement)(__c.Null);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 127;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 128;BA.debugLine="Icon.SetAttr(\"click\", onClick)";
_icon._setattr /*b4j.example.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 130;BA.debugLine="Return Icon.item";
if (true) return _icon._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 20;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixicon  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetAlignCenter(r As String) As WixIcon 'ignore";
 //BA.debugLineNum = 154;BA.debugLine="Icon.setAligncenter(\"\")";
_icon._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetAlignLeft(r As String) As WixIcon 'ignore";
 //BA.debugLineNum = 160;BA.debugLine="Icon.SetAlignleft(\"\")";
_icon._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetAlignRight(r As String) As WixIcon 'ignore";
 //BA.debugLineNum = 148;BA.debugLine="Icon.setAlignright(\"\")";
_icon._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setbadge(String _b) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetBadge(b As String) As WixIcon";
 //BA.debugLineNum = 120;BA.debugLine="Icon.SetAttr(\"badge\", b)";
_icon._setattr /*b4j.example.wixelement*/ ("badge",(Object)(_b));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetClick(e As BANanoObject) As WixIcon";
 //BA.debugLineNum = 114;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetHeight(h As Object) As WixIcon";
 //BA.debugLineNum = 135;BA.debugLine="Icon.SetHeight(h)";
_icon._setheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _seticon(Object _i) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetIcon(i As Object) As WixIcon";
 //BA.debugLineNum = 24;BA.debugLine="Icon.SetAttr(\"icon\", i)";
_icon._setattr /*b4j.example.wixelement*/ ("icon",_i);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub SetMap(m As Map) As WixIcon";
 //BA.debugLineNum = 43;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 44;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 45;BA.debugLine="Icon.SetAttr(strKey,	strVal)";
_icon._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetMinHeight(h As Int) As WixIcon";
 //BA.debugLineNum = 72;BA.debugLine="Icon.SetMinHeight(h)";
_icon._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetMinWidth(w As Int) As WixIcon";
 //BA.debugLineNum = 66;BA.debugLine="Icon.SetMinWidth(w)";
_icon._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setname(String _n) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetName(n As String) As WixIcon";
 //BA.debugLineNum = 37;BA.debugLine="Icon.SetName(n)";
_icon._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setparent(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetParent(p As WixElement) As WixIcon";
 //BA.debugLineNum = 98;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setpopup(String _popupid) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetPopUp(popupID As String) As WixIcon";
 //BA.debugLineNum = 85;BA.debugLine="popupID = popupID.ToLowerCase";
_popupid = _popupid.toLowerCase();
 //BA.debugLineNum = 86;BA.debugLine="Icon.SetProperty(\"popup\", popupID)";
_icon._setproperty /*b4j.example.wixelement*/ ("popup",(Object)(_popupid));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetResponsive(b As Object) As WixIcon";
 //BA.debugLineNum = 53;BA.debugLine="Icon.SetResponsive(b)";
_icon._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixIcon";
 //BA.debugLineNum = 59;BA.debugLine="Icon.SetResponsiveCell(b)";
_icon._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 92;BA.debugLine="Icon.SetStyle(prop,val)";
_icon._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixIcon";
 //BA.debugLineNum = 30;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="Icon.SetTemplate(os)";
_icon._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetTooltip(tt As String) As WixIcon";
 //BA.debugLineNum = 78;BA.debugLine="Icon.SetTooltip(tt)";
_icon._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixicon  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetWidth(w As Object) As WixIcon";
 //BA.debugLineNum = 141;BA.debugLine="Icon.SetWidth(w)";
_icon._setwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.wixicon)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
