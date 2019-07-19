package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixmultiview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixmultiview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixmultiview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _multiview = null;
public b4j.example.main _main = null;
public b4j.example.pgformdesigner _pgformdesigner = null;
public b4j.example.modcenter _modcenter = null;
public b4j.example.dbutton _dbutton = null;
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
public b4j.example.wixmultiview  _additem(anywheresoftware.b4a.objects.collections.Map _i) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub AddItem(i As Map) As WixMultiView";
 //BA.debugLineNum = 16;BA.debugLine="MultiView.AddCells(i)";
_multiview._addcells /*b4j.example.wixelement*/ (_i);
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 115;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 120;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 110;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public MultiView As WixElement";
_multiview = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixmultiview  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(sid As String) As WixMultiVi";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="MultiView.Initialize(ID)";
_multiview._initialize /*b4j.example.wixelement*/ (ba,_id);
 //BA.debugLineNum = 11;BA.debugLine="MultiView.SetView(\"multiview\")";
_multiview._setview /*b4j.example.wixelement*/ ("multiview");
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 86;BA.debugLine="Return MultiView.item";
if (true) return _multiview._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setanimate(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetAnimate(b As Boolean) As WixMultiView";
 //BA.debugLineNum = 97;BA.debugLine="MultiView.SetAttr(\"animate\", b)";
_multiview._setattr /*b4j.example.wixelement*/ ("animate",(Object)(_b));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setfitbiggest(boolean _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetFitBiggest(b As Boolean) As WixMultiView";
 //BA.debugLineNum = 91;BA.debugLine="MultiView.SetAttr(\"fitBiggest\", b)";
_multiview._setattr /*b4j.example.wixelement*/ ("fitBiggest",(Object)(_b));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setkeepviews(boolean _b) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetkeepViews(b As Boolean) As WixMultiView";
 //BA.debugLineNum = 103;BA.debugLine="MultiView.SetAttr(\"keepViews\", b)";
_multiview._setattr /*b4j.example.wixelement*/ ("keepViews",(Object)(_b));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetMap(m As Map) As WixMultiView";
 //BA.debugLineNum = 27;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 28;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 29;BA.debugLine="MultiView.SetAttr(strKey,	strVal)";
_multiview._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetMinHeight(h As Int) As WixMultiView";
 //BA.debugLineNum = 73;BA.debugLine="MultiView.SetMinHeight(h)";
_multiview._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetMinWidth(w As Int) As WixMultiView";
 //BA.debugLineNum = 67;BA.debugLine="MultiView.SetMinWidth(w)";
_multiview._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setname(String _n) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetName(n As String) As WixMultiView";
 //BA.debugLineNum = 48;BA.debugLine="MultiView.SetName(n)";
_multiview._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetPadding(p As Object) As WixMultiView";
 //BA.debugLineNum = 36;BA.debugLine="MultiView.SetPadding(p)";
_multiview._setpadding /*b4j.example.wixelement*/ (BA.ObjectToString(_p));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetResponsive(b As Object) As WixMultiView";
 //BA.debugLineNum = 54;BA.debugLine="MultiView.SetResponsive(b)";
_multiview._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixMultiView";
 //BA.debugLineNum = 60;BA.debugLine="MultiView.SetResponsiveCell(b)";
_multiview._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixMultiVi";
 //BA.debugLineNum = 41;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 42;BA.debugLine="MultiView.SetTemplate(os)";
_multiview._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetTooltip(tt As String) As WixMultiView";
 //BA.debugLineNum = 79;BA.debugLine="MultiView.SetTooltip(tt)";
_multiview._settooltip /*b4j.example.wixelement*/ (_tt);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixmultiview  _setvisiblebatch(Object _v) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetVisibleBatch(v As Object) As WixMultiView";
 //BA.debugLineNum = 21;BA.debugLine="MultiView.SetAttr(\"visibleBatch\", v)";
_multiview._setattr /*b4j.example.wixelement*/ ("visibleBatch",_v);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.wixmultiview)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
