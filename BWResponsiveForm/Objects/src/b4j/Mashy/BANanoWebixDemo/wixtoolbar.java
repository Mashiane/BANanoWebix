package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtoolbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixtoolbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixtoolbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _toolbar = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _addbutton(b4j.Mashy.BANanoWebixDemo.wixbutton _btn) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub AddButton(btn As WixButton) As WixToolBar";
 //BA.debugLineNum = 121;BA.debugLine="ToolBar.AddColumns(btn.item)";
_toolbar._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_btn._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _addcolumns(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub AddColumns(m As Map) As WixToolBar";
 //BA.debugLineNum = 320;BA.debugLine="ToolBar.AddColumns(m)";
_toolbar._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_m);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _addelement(b4j.Mashy.BANanoWebixDemo.wixelement _btn) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub AddElement(btn As WixElement) As WixToolBar";
 //BA.debugLineNum = 136;BA.debugLine="ToolBar.AddColumns(btn.item)";
_toolbar._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_btn._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _addelements(anywheresoftware.b4a.objects.collections.Map _e) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub AddElements(e As Map) As WixToolBar";
 //BA.debugLineNum = 304;BA.debugLine="ToolBar.AddElements(e)";
_toolbar._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_e);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _addicon(b4j.Mashy.BANanoWebixDemo.wixicon _icn) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub AddIcon(icn As WixIcon) As WixToolBar";
 //BA.debugLineNum = 298;BA.debugLine="ToolBar.AddColumns(icn.Item)";
_toolbar._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_icn._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _addlabel(b4j.Mashy.BANanoWebixDemo.wixlabel _btn) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub AddLabel(btn As WixLabel) As WixToolBar";
 //BA.debugLineNum = 131;BA.debugLine="ToolBar.AddColumns(btn.item)";
_toolbar._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_btn._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _addspacer() throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub AddSpacer As WixToolBar";
 //BA.debugLineNum = 292;BA.debugLine="ToolBar.AddColumnsSpacer(\"\")";
_toolbar._addcolumnsspacer /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 316;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 326;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _addtoggle(b4j.Mashy.BANanoWebixDemo.wixtoggle _btn) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub AddToggle(btn As WixToggle) As WixToolBar";
 //BA.debugLineNum = 126;BA.debugLine="ToolBar.AddColumns(btn.item)";
_toolbar._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_btn._item /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public String  _addtopage(b4j.Mashy.BANanoWebixDemo.wixpage _pg) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub AddToPage(pg As WixPage)";
 //BA.debugLineNum = 10;BA.debugLine="ToolBar.AddToRows(pg.Page)";
_toolbar._addtorows /*String*/ (_pg._page /*b4j.Mashy.BANanoWebixDemo.wixelement*/ );
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 311;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public ToolBar As WixElement";
_toolbar = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _createavatar(String _sid,String _imgurl,String _statuscolor,anywheresoftware.b4a.objects.collections.Map _styles) throws Exception{
b4j.Mashy.BANanoWebixDemo.uoenowhtml _img = null;
String _mk = "";
String _mv = "";
b4j.Mashy.BANanoWebixDemo.uoenowhtml _span = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
b4j.Mashy.BANanoWebixDemo.wixelement _avatar = null;
 //BA.debugLineNum = 266;BA.debugLine="Sub CreateAvatar(sid As String, imgURL As String,";
 //BA.debugLineNum = 267;BA.debugLine="Dim img As UOENowHTML";
_img = new b4j.Mashy.BANanoWebixDemo.uoenowhtml();
 //BA.debugLineNum = 268;BA.debugLine="img.Initialize(\"\",\"img\").SetSRC(imgURL,True).SetS";
_img._initialize /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (ba,"","img")._setsrc /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_imgurl,__c.True)._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("border-radius","25px")._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("width","35px")._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("height","35px");
 //BA.debugLineNum = 269;BA.debugLine="img.SetStyle(\"cursor\", \"pointer\")";
_img._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("cursor","pointer");
 //BA.debugLineNum = 271;BA.debugLine="If Styles <> Null Then";
if (_styles!= null) { 
 //BA.debugLineNum = 272;BA.debugLine="For Each mk As String In Styles.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _styles.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_mk = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 273;BA.debugLine="Dim mv As String = Styles.Get(mk)";
_mv = BA.ObjectToString(_styles.Get((Object)(_mk)));
 //BA.debugLineNum = 274;BA.debugLine="img.SetStyle(mk,mv)";
_img._setstyle /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_mk,_mv);
 }
};
 };
 //BA.debugLineNum = 278;BA.debugLine="Dim span As UOENowHTML";
_span = new b4j.Mashy.BANanoWebixDemo.uoenowhtml();
 //BA.debugLineNum = 279;BA.debugLine="span.Initialize(\"\",\"span\").AddClass(\"webix_icon m";
_span._initialize /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (ba,"","span")._addclass /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ ("webix_icon mdi mdi-circle status ")._addclass /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (_statuscolor);
 //BA.debugLineNum = 281;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 282;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 283;BA.debugLine="sb.Append(img.HTML).Append(span.HTML)";
_sb.Append(_img._html /*String*/ ()).Append(_span._html /*String*/ ());
 //BA.debugLineNum = 285;BA.debugLine="Dim avatar As WixElement";
_avatar = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 286;BA.debugLine="avatar.Initialize(sid).SetTemplate(sb.ToString)";
_avatar._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_sid)._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_sb.ToString()));
 //BA.debugLineNum = 287;BA.debugLine="Return avatar";
if (true) return _avatar;
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixbutton  _createbutton(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixbutton _btn = null;
 //BA.debugLineNum = 141;BA.debugLine="Sub CreateButton(sid As String) As WixButton";
 //BA.debugLineNum = 142;BA.debugLine="Dim btn As WixButton";
_btn = new b4j.Mashy.BANanoWebixDemo.wixbutton();
 //BA.debugLineNum = 143;BA.debugLine="btn.Initialize(sid)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixbutton*/ (ba,_sid);
 //BA.debugLineNum = 144;BA.debugLine="btn.parent = ToolBar";
_btn._parent /*b4j.Mashy.BANanoWebixDemo.wixelement*/  = _toolbar;
 //BA.debugLineNum = 145;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcombo  _createcombo(String _c) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcombo _cbo = null;
 //BA.debugLineNum = 162;BA.debugLine="Sub CreateCombo(c As String) As WixCombo";
 //BA.debugLineNum = 163;BA.debugLine="Dim cbo As WixCombo";
_cbo = new b4j.Mashy.BANanoWebixDemo.wixcombo();
 //BA.debugLineNum = 164;BA.debugLine="cbo.Initialize(c)";
_cbo._initialize /*b4j.Mashy.BANanoWebixDemo.wixcombo*/ (ba,_c);
 //BA.debugLineNum = 165;BA.debugLine="cbo.parent = ToolBar";
_cbo._parent /*b4j.Mashy.BANanoWebixDemo.wixelement*/  = _toolbar;
 //BA.debugLineNum = 166;BA.debugLine="Return cbo";
if (true) return _cbo;
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcounter  _createcounter(String _cnt) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixcounter _cntx = null;
 //BA.debugLineNum = 242;BA.debugLine="Sub CreateCounter(cnt As String) As WixCounter";
 //BA.debugLineNum = 243;BA.debugLine="Dim cntx As WixCounter";
_cntx = new b4j.Mashy.BANanoWebixDemo.wixcounter();
 //BA.debugLineNum = 244;BA.debugLine="cntx.Initialize(cnt).SetParent(ToolBar)";
_cntx._initialize /*b4j.Mashy.BANanoWebixDemo.wixcounter*/ (ba,_cnt)._setparent /*b4j.Mashy.BANanoWebixDemo.wixcounter*/ (_toolbar);
 //BA.debugLineNum = 245;BA.debugLine="Return cntx";
if (true) return _cntx;
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdatepicker  _createdatepicker(String _dp) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixdatepicker _dpx = null;
 //BA.debugLineNum = 205;BA.debugLine="Sub CreateDatePicker(dp As String) As WixDatePicke";
 //BA.debugLineNum = 206;BA.debugLine="Dim dpx As WixDatePicker";
_dpx = new b4j.Mashy.BANanoWebixDemo.wixdatepicker();
 //BA.debugLineNum = 207;BA.debugLine="dpx.Initialize(dp).SetParent(ToolBar)";
_dpx._initialize /*b4j.Mashy.BANanoWebixDemo.wixdatepicker*/ (ba,_dp)._setparent /*b4j.Mashy.BANanoWebixDemo.wixdatepicker*/ (_toolbar);
 //BA.debugLineNum = 208;BA.debugLine="Return dpx";
if (true) return _dpx;
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixelement  _createelement(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixelement _lbl = null;
 //BA.debugLineNum = 191;BA.debugLine="Sub CreateElement(sid As String) As WixElement";
 //BA.debugLineNum = 192;BA.debugLine="Dim lbl As WixElement";
_lbl = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 193;BA.debugLine="lbl.Initialize(sid)";
_lbl._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_sid);
 //BA.debugLineNum = 194;BA.debugLine="Return lbl";
if (true) return _lbl;
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixheader  _createheader(String _hdr) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixheader _hdrx = null;
 //BA.debugLineNum = 260;BA.debugLine="Sub CreateHeader(hdr As String) As WixHeader";
 //BA.debugLineNum = 261;BA.debugLine="Dim hdrx As WixHeader";
_hdrx = new b4j.Mashy.BANanoWebixDemo.wixheader();
 //BA.debugLineNum = 262;BA.debugLine="hdrx.Initialize(hdr).SetParent(ToolBar)";
_hdrx._initialize /*b4j.Mashy.BANanoWebixDemo.wixheader*/ (ba,_hdr)._setparent /*b4j.Mashy.BANanoWebixDemo.wixheader*/ (_toolbar);
 //BA.debugLineNum = 263;BA.debugLine="Return hdrx";
if (true) return _hdrx;
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixicon  _createicon(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixicon _btn = null;
 //BA.debugLineNum = 177;BA.debugLine="Sub CreateIcon(sid As String) As WixIcon";
 //BA.debugLineNum = 178;BA.debugLine="Dim btn As WixIcon";
_btn = new b4j.Mashy.BANanoWebixDemo.wixicon();
 //BA.debugLineNum = 179;BA.debugLine="btn.Initialize(sid).SetParent(ToolBar)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixicon*/ (ba,_sid)._setparent /*b4j.Mashy.BANanoWebixDemo.wixicon*/ (_toolbar);
 //BA.debugLineNum = 180;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wiximage  _createimage(String _img) throws Exception{
b4j.Mashy.BANanoWebixDemo.wiximage _imgx = null;
 //BA.debugLineNum = 211;BA.debugLine="Sub CreateImage(img As String) As WixImage";
 //BA.debugLineNum = 212;BA.debugLine="Dim imgx As WixImage";
_imgx = new b4j.Mashy.BANanoWebixDemo.wiximage();
 //BA.debugLineNum = 213;BA.debugLine="imgx.Initialize(img).SetParent(ToolBar)";
_imgx._initialize /*b4j.Mashy.BANanoWebixDemo.wiximage*/ (ba,_img)._setparent /*b4j.Mashy.BANanoWebixDemo.wiximage*/ (_toolbar);
 //BA.debugLineNum = 214;BA.debugLine="Return imgx";
if (true) return _imgx;
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixlabel  _createlabel(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixlabel _lbl = null;
 //BA.debugLineNum = 184;BA.debugLine="Sub CreateLabel(sid As String) As WixLabel";
 //BA.debugLineNum = 185;BA.debugLine="Dim lbl As WixLabel";
_lbl = new b4j.Mashy.BANanoWebixDemo.wixlabel();
 //BA.debugLineNum = 186;BA.debugLine="lbl.Initialize(sid).setparent(ToolBar)";
_lbl._initialize /*b4j.Mashy.BANanoWebixDemo.wixlabel*/ (ba,_sid)._setparent /*b4j.Mashy.BANanoWebixDemo.wixlabel*/ (_toolbar);
 //BA.debugLineNum = 187;BA.debugLine="Return lbl";
if (true) return _lbl;
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixrichselect  _createrichselect(String _rs) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixrichselect _irs = null;
 //BA.debugLineNum = 169;BA.debugLine="Sub CreateRichSelect(rs As String) As WixRichSelec";
 //BA.debugLineNum = 170;BA.debugLine="Dim irs As WixRichSelect";
_irs = new b4j.Mashy.BANanoWebixDemo.wixrichselect();
 //BA.debugLineNum = 171;BA.debugLine="irs.Initialize(rs)";
_irs._initialize /*b4j.Mashy.BANanoWebixDemo.wixrichselect*/ (ba,_rs);
 //BA.debugLineNum = 172;BA.debugLine="irs.parent = ToolBar";
_irs._parent /*b4j.Mashy.BANanoWebixDemo.wixelement*/  = _toolbar;
 //BA.debugLineNum = 173;BA.debugLine="Return irs";
if (true) return _irs;
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsearch  _createsearch(String _s) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixsearch _txt = null;
 //BA.debugLineNum = 155;BA.debugLine="Sub CreateSearch(s As String) As WixSearch";
 //BA.debugLineNum = 156;BA.debugLine="Dim txt As WixSearch";
_txt = new b4j.Mashy.BANanoWebixDemo.wixsearch();
 //BA.debugLineNum = 157;BA.debugLine="txt.Initialize(s)";
_txt._initialize /*b4j.Mashy.BANanoWebixDemo.wixsearch*/ (ba,_s);
 //BA.debugLineNum = 158;BA.debugLine="txt.parent = ToolBar";
_txt._parent /*b4j.Mashy.BANanoWebixDemo.wixelement*/  = _toolbar;
 //BA.debugLineNum = 159;BA.debugLine="Return txt";
if (true) return _txt;
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixsegmented  _createsegmented(String _seg) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixsegmented _segx = null;
 //BA.debugLineNum = 236;BA.debugLine="Sub CreateSegmented(seg As String) As WixSegmented";
 //BA.debugLineNum = 237;BA.debugLine="Dim segx As WixSegmented";
_segx = new b4j.Mashy.BANanoWebixDemo.wixsegmented();
 //BA.debugLineNum = 238;BA.debugLine="segx.Initialize(seg).SetParent(ToolBar)";
_segx._initialize /*b4j.Mashy.BANanoWebixDemo.wixsegmented*/ (ba,_seg)._setparent /*b4j.Mashy.BANanoWebixDemo.wixsegmented*/ (_toolbar);
 //BA.debugLineNum = 239;BA.debugLine="Return segx";
if (true) return _segx;
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixselect  _createselect(String _sel) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixselect _selx = null;
 //BA.debugLineNum = 229;BA.debugLine="Sub CreateSelect(sel As String) As WixSelect";
 //BA.debugLineNum = 230;BA.debugLine="Dim selx As WixSelect";
_selx = new b4j.Mashy.BANanoWebixDemo.wixselect();
 //BA.debugLineNum = 231;BA.debugLine="selx.Initialize(sel).SetParent(ToolBar)";
_selx._initialize /*b4j.Mashy.BANanoWebixDemo.wixselect*/ (ba,_sel)._setparent /*b4j.Mashy.BANanoWebixDemo.wixselect*/ (_toolbar);
 //BA.debugLineNum = 232;BA.debugLine="Return selx";
if (true) return _selx;
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixswitch  _createswitch(String _swt) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixswitch _swtx = null;
 //BA.debugLineNum = 223;BA.debugLine="Sub CreateSwitch(swt As String) As WixSwitch";
 //BA.debugLineNum = 224;BA.debugLine="Dim swtx As WixSwitch";
_swtx = new b4j.Mashy.BANanoWebixDemo.wixswitch();
 //BA.debugLineNum = 225;BA.debugLine="swtx.Initialize(swt).SetParent(ToolBar)";
_swtx._initialize /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ (ba,_swt)._setparent /*b4j.Mashy.BANanoWebixDemo.wixswitch*/ (_toolbar);
 //BA.debugLineNum = 226;BA.debugLine="Return swtx";
if (true) return _swtx;
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtext  _createtext(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtext _txt = null;
 //BA.debugLineNum = 148;BA.debugLine="Sub CreateText(sid As String) As WixText";
 //BA.debugLineNum = 149;BA.debugLine="Dim txt As WixText";
_txt = new b4j.Mashy.BANanoWebixDemo.wixtext();
 //BA.debugLineNum = 150;BA.debugLine="txt.Initialize(sid)";
_txt._initialize /*b4j.Mashy.BANanoWebixDemo.wixtext*/ (ba,_sid);
 //BA.debugLineNum = 151;BA.debugLine="txt.parent = ToolBar";
_txt._parent /*b4j.Mashy.BANanoWebixDemo.wixelement*/  = _toolbar;
 //BA.debugLineNum = 152;BA.debugLine="Return txt";
if (true) return _txt;
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoggle  _createtoggle(String _sid) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixtoggle _btn = null;
 //BA.debugLineNum = 198;BA.debugLine="Sub CreateToggle(sid As String) As WixToggle";
 //BA.debugLineNum = 199;BA.debugLine="Dim btn As WixToggle";
_btn = new b4j.Mashy.BANanoWebixDemo.wixtoggle();
 //BA.debugLineNum = 200;BA.debugLine="btn.Initialize(sid).SetParent(ToolBar)";
_btn._initialize /*b4j.Mashy.BANanoWebixDemo.wixtoggle*/ (ba,_sid)._setparent /*b4j.Mashy.BANanoWebixDemo.wixtoggle*/ (_toolbar);
 //BA.debugLineNum = 201;BA.debugLine="Return btn";
if (true) return _btn;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixuploader  _createuploader(String _upl) throws Exception{
b4j.Mashy.BANanoWebixDemo.wixuploader _uplx = null;
 //BA.debugLineNum = 217;BA.debugLine="Sub CreateUploader(upl As String) As WixUploader";
 //BA.debugLineNum = 218;BA.debugLine="Dim uplx As WixUploader";
_uplx = new b4j.Mashy.BANanoWebixDemo.wixuploader();
 //BA.debugLineNum = 219;BA.debugLine="uplx.Initialize(upl).SetParent(ToolBar)";
_uplx._initialize /*b4j.Mashy.BANanoWebixDemo.wixuploader*/ (ba,_upl)._setparent /*b4j.Mashy.BANanoWebixDemo.wixuploader*/ (_toolbar);
 //BA.debugLineNum = 220;BA.debugLine="Return uplx";
if (true) return _uplx;
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(sID As String) As WixToolBar";
 //BA.debugLineNum = 15;BA.debugLine="ID = sID.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="ToolBar.Initialize(ID).SetView(\"toolbar\")";
_toolbar._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("toolbar");
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 116;BA.debugLine="Return ToolBar.item";
if (true) return _toolbar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixToolBar";
 //BA.debugLineNum = 380;BA.debugLine="ToolBar.SetAttr(\"animate\", animate)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub SetAttributes(m As Map) As WixToolBar";
 //BA.debugLineNum = 29;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 30;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 31;BA.debugLine="ToolBar.SetAttr(k,v)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixToo";
 //BA.debugLineNum = 335;BA.debugLine="ToolBar.SetAttr(\"borderless\", borderless)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setcols(Object _cols) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetCols(cols As Object) As WixToolBar";
 //BA.debugLineNum = 385;BA.debugLine="ToolBar.SetAttr(\"cols\", cols)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cols",_cols);
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setcomplexdata(boolean _complexdata) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Sub SetComplexData(complexData As Boolean) As WixT";
 //BA.debugLineNum = 390;BA.debugLine="ToolBar.SetAttr(\"complexData\", complexData)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("complexData",(Object)(_complexdata));
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setcontainer(String _container) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetContainer(container As String) As WixToolBa";
 //BA.debugLineNum = 330;BA.debugLine="ToolBar.SetAttr(\"container\", container)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",(Object)(_container));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub SetCss(css As Object) As WixToolBar";
 //BA.debugLineNum = 395;BA.debugLine="ToolBar.SetAttr(\"css\", css)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setdata(Object _data) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub SetData(data As Object) As WixToolBar";
 //BA.debugLineNum = 400;BA.debugLine="ToolBar.SetAttr(\"data\", data)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("data",_data);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setdatafeed(Object _datafeed) throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub SetDataFeed(dataFeed As Object) As WixToolBar";
 //BA.debugLineNum = 405;BA.debugLine="ToolBar.SetAttr(\"dataFeed\", dataFeed)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dataFeed",_datafeed);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 409;BA.debugLine="Sub SetDatatype(datatype As Object) As WixToolBar";
 //BA.debugLineNum = 410;BA.debugLine="ToolBar.SetAttr(\"datatype\", datatype)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixToolBar";
 //BA.debugLineNum = 415;BA.debugLine="ToolBar.SetAttr(\"disabled\", disabled)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setelements(Object _elements) throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub SetElements(elements As Object) As WixToolBar";
 //BA.debugLineNum = 420;BA.debugLine="ToolBar.SetAttr(\"elements\", elements)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("elements",_elements);
 //BA.debugLineNum = 421;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setelementsconfig(Object _elementsconfig) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub SetElementsConfig(elementsConfig As Object) As";
 //BA.debugLineNum = 425;BA.debugLine="ToolBar.SetAttr(\"elementsConfig\", elementsConfig)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("elementsConfig",_elementsconfig);
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setgravity(String _gravity) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub SetGravity(gravity As String) As WixToolBar";
 //BA.debugLineNum = 340;BA.debugLine="ToolBar.SetAttr(\"gravity\", gravity)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",(Object)(_gravity));
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetHeight(h As Int) As WixToolBar";
 //BA.debugLineNum = 83;BA.debugLine="ToolBar.SetHeight(h)";
_toolbar._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_h));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixToolBar";
 //BA.debugLineNum = 345;BA.debugLine="ToolBar.SetAttr(\"hidden\", hidden)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setisolate(boolean _isolate) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetIsolate(isolate As Boolean) As WixToolBar";
 //BA.debugLineNum = 350;BA.debugLine="ToolBar.SetAttr(\"isolate\", isolate)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("isolate",(Object)(_isolate));
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 88;BA.debugLine="Sub SetMap(m As Map) As WixToolBar";
 //BA.debugLineNum = 89;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 90;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 91;BA.debugLine="ToolBar.SetAttr(strKey,	strVal)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setmargin(int _m) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetMargin(m As Int) As WixToolBar";
 //BA.debugLineNum = 104;BA.debugLine="ToolBar.SetAttr(\"margin\", m)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("margin",(Object)(_m));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setmaxheight(String _maxheight) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetMaxHeight(maxHeight As String) As WixToolBa";
 //BA.debugLineNum = 355;BA.debugLine="ToolBar.SetAttr(\"maxHeight\", maxHeight)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",(Object)(_maxheight));
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setmaxwidth(String _maxwidth) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetMaxWidth(maxWidth As String) As WixToolBar";
 //BA.debugLineNum = 360;BA.debugLine="ToolBar.SetAttr(\"maxWidth\", maxWidth)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",(Object)(_maxwidth));
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetMinHeight(h As Int) As WixToolBar";
 //BA.debugLineNum = 77;BA.debugLine="ToolBar.SetMinHeight(h)";
_toolbar._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetMinWidth(w As Int) As WixToolBar";
 //BA.debugLineNum = 71;BA.debugLine="ToolBar.SetMinWidth(w)";
_toolbar._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setname(String _n) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetName(n As String) As WixToolBar";
 //BA.debugLineNum = 52;BA.debugLine="ToolBar.SetName(n)";
_toolbar._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setpadding(String _p) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetPadding(p As String) As WixToolBar";
 //BA.debugLineNum = 98;BA.debugLine="ToolBar.SetAttr(\"padding\", p)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",(Object)(_p));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setpaddingx(Object _x) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetPaddingX(x As Object) As WixToolBar";
 //BA.debugLineNum = 250;BA.debugLine="ToolBar.SetAttr(\"paddingX\", x)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingX",_x);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setpaddingy(Object _x) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetPaddingY(x As Object) As WixToolBar";
 //BA.debugLineNum = 256;BA.debugLine="ToolBar.SetAttr(\"paddingY\", x)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingY",_x);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetResponsive(b As Object) As WixToolBar";
 //BA.debugLineNum = 58;BA.debugLine="ToolBar.SetResponsive(b)";
_toolbar._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixToolBar";
 //BA.debugLineNum = 64;BA.debugLine="ToolBar.SetResponsiveCell(b)";
_toolbar._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setrows(Object _rows) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub SetRows(rows As Object) As WixToolBar";
 //BA.debugLineNum = 430;BA.debugLine="ToolBar.SetAttr(\"rows\", rows)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rows",_rows);
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setrules(Object _rules) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub SetRules(rules As Object) As WixToolBar";
 //BA.debugLineNum = 435;BA.debugLine="ToolBar.SetAttr(\"rules\", rules)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("rules",_rules);
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setscroll(String _scroll) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetScroll(scroll As String) As WixToolBar";
 //BA.debugLineNum = 365;BA.debugLine="ToolBar.SetAttr(\"scroll\", scroll)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",(Object)(_scroll));
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setscrollspeed(Object _scrollspeed) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub SetScrollSpeed(scrollSpeed As Object) As WixTo";
 //BA.debugLineNum = 440;BA.debugLine="ToolBar.SetAttr(\"scrollSpeed\", scrollSpeed)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scrollSpeed",_scrollspeed);
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 46;BA.debugLine="ToolBar.SetStyle(prop,sval)";
_toolbar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetStyles(m As Map) As WixToolBar";
 //BA.debugLineNum = 37;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 38;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 39;BA.debugLine="ToolBar.SetStyle(k,v)";
_toolbar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixToolBar";
 //BA.debugLineNum = 21;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 22;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="ToolBar.SetTemplate(os)";
_toolbar._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetTooltip(tt As String) As WixToolBar";
 //BA.debugLineNum = 110;BA.debugLine="ToolBar.SetTooltip(tt)";
_toolbar._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub SetType(sType As Object) As WixToolBar";
 //BA.debugLineNum = 445;BA.debugLine="ToolBar.SetAttr(\"type\", sType)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetUrl(url As Object) As WixToolBar";
 //BA.debugLineNum = 450;BA.debugLine="ToolBar.SetAttr(\"url\", url)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setvisiblebatch(String _visiblebatch) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetVisibleBatch(visibleBatch As String) As Wix";
 //BA.debugLineNum = 370;BA.debugLine="ToolBar.SetAttr(\"visibleBatch\", visibleBatch)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("visibleBatch",(Object)(_visiblebatch));
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixtoolbar  _setwidth(String _width) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetWidth(width As String) As WixToolBar";
 //BA.debugLineNum = 375;BA.debugLine="ToolBar.SetAttr(\"width\", width)";
_toolbar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",(Object)(_width));
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixtoolbar)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
