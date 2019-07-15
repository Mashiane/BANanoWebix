package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcomments extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixcomments", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixcomments.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _comments = null;
public anywheresoftware.b4a.objects.collections.List _users = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public String _user_active = "";
public String _user_away = "";
public String _user_busy = "";
public String _user_none = "";
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
public String  _addcomment(String _cid,String _uid,String _cdate,String _ctext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _comment = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub AddComment(cID As String, uID As String, cDate";
 //BA.debugLineNum = 73;BA.debugLine="Dim comment As Map = CreateMap()";
_comment = new anywheresoftware.b4a.objects.collections.Map();
_comment = __c.createMap(new Object[] {});
 //BA.debugLineNum = 74;BA.debugLine="comment.Put(\"id\", cID)";
_comment.Put((Object)("id"),(Object)(_cid));
 //BA.debugLineNum = 75;BA.debugLine="comment.Put(\"user_id\", uID)";
_comment.Put((Object)("user_id"),(Object)(_uid));
 //BA.debugLineNum = 76;BA.debugLine="comment.Put(\"date\", cDate)";
_comment.Put((Object)("date"),(Object)(_cdate));
 //BA.debugLineNum = 77;BA.debugLine="comment.Put(\"text\", cText)";
_comment.Put((Object)("text"),(Object)(_ctext));
 //BA.debugLineNum = 78;BA.debugLine="Data.Add(comment)";
_data.Add((Object)(_comment.getObject()));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 160;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 165;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 155;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public String  _adduser(String _uid,String _uname,String _uimage,String _ustatus) throws Exception{
anywheresoftware.b4a.objects.collections.Map _u = null;
 //BA.debugLineNum = 83;BA.debugLine="Sub AddUser(uID As String, uName As String, uImage";
 //BA.debugLineNum = 84;BA.debugLine="Dim u As Map = CreateMap()";
_u = new anywheresoftware.b4a.objects.collections.Map();
_u = __c.createMap(new Object[] {});
 //BA.debugLineNum = 85;BA.debugLine="u.Put(\"id\", uID)";
_u.Put((Object)("id"),(Object)(_uid));
 //BA.debugLineNum = 86;BA.debugLine="u.Put(\"value\", uName)";
_u.Put((Object)("value"),(Object)(_uname));
 //BA.debugLineNum = 87;BA.debugLine="u.Put(\"image\", uImage)";
_u.Put((Object)("image"),(Object)(_uimage));
 //BA.debugLineNum = 88;BA.debugLine="u.Put(\"status\", uStatus)";
_u.Put((Object)("status"),(Object)(_ustatus));
 //BA.debugLineNum = 89;BA.debugLine="Users.Add(u)";
_users.Add((Object)(_u.getObject()));
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Comments As WixElement";
_comments = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Private Users As List";
_users = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Public USER_ACTIVE As String = \"active\"";
_user_active = "active";
 //BA.debugLineNum = 9;BA.debugLine="Public USER_AWAY As String = \"away\"";
_user_away = "away";
 //BA.debugLineNum = 10;BA.debugLine="Public USER_BUSY As String = \"busy\"";
_user_busy = "busy";
 //BA.debugLineNum = 11;BA.debugLine="Public USER_NONE As String = \"none\"";
_user_none = "none";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixcomments  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(sid As String) As WixComment";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Comments.Initialize(ID).SetView(\"comments\")";
_comments._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("comments");
 //BA.debugLineNum = 18;BA.debugLine="Users.Initialize";
_users.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 107;BA.debugLine="Return Comments.item";
if (true) return _comments._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setcurrentuser(int _u) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetCurrentUser(u As Int) As WixComments";
 //BA.debugLineNum = 101;BA.debugLine="Comments.SetAttr(\"currentUser\", u)";
_comments._setattr /*b4j.example.wixelement*/ ("currentUser",(Object)(_u));
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setdata(anywheresoftware.b4a.objects.collections.List _cdata) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetData(cData As List) As WixComments";
 //BA.debugLineNum = 130;BA.debugLine="Comments.SetData(cData)";
_comments._setdata /*b4j.example.wixelement*/ (_cdata);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetHeight(h As Object) As WixComments";
 //BA.debugLineNum = 148;BA.debugLine="Comments.SetAttr(\"height\", h)";
_comments._setattr /*b4j.example.wixelement*/ ("height",_h);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 62;BA.debugLine="Sub SetMap(m As Map) As WixComments";
 //BA.debugLineNum = 63;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 64;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 65;BA.debugLine="Comments.SetAttr(strKey,	strVal)";
_comments._setattr /*b4j.example.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setmentions(boolean _b) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetMentions(b As Boolean) As WixComments";
 //BA.debugLineNum = 112;BA.debugLine="Comments.SetAttr(\"mentions\", b)";
_comments._setattr /*b4j.example.wixelement*/ ("mentions",(Object)(_b));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetMinHeight(h As Int) As WixComments";
 //BA.debugLineNum = 57;BA.debugLine="Comments.SetMinHeight(h)";
_comments._setminheight /*b4j.example.wixelement*/ (_h);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetMinWidth(w As Int) As WixComments";
 //BA.debugLineNum = 51;BA.debugLine="Comments.SetMinWidth(w)";
_comments._setminwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setmodechat(String _c) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetModeChat(c As String) As WixComments   'ign";
 //BA.debugLineNum = 124;BA.debugLine="Comments.SetAttr(\"mode\", \"chat\")";
_comments._setattr /*b4j.example.wixelement*/ ("mode",(Object)("chat"));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setmore(int _m) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetMore(m As Int) As WixComments";
 //BA.debugLineNum = 94;BA.debugLine="Comments.SetAttr(\"more\", M)";
_comments._setattr /*b4j.example.wixelement*/ ("more",(Object)(_m));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setmorebutton(String _m) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetMoreButton(m As String) As WixComments";
 //BA.debugLineNum = 118;BA.debugLine="Comments.SetAttr(\"moreButton\", m)";
_comments._setattr /*b4j.example.wixelement*/ ("moreButton",(Object)(_m));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setname(String _n) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetName(n As String) As WixComments";
 //BA.debugLineNum = 32;BA.debugLine="Comments.SetName(n)";
_comments._setname /*b4j.example.wixelement*/ (_n);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetResponsive(b As Object) As WixComments";
 //BA.debugLineNum = 38;BA.debugLine="Comments.SetResponsive(b)";
_comments._setresponsive /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixComments";
 //BA.debugLineNum = 44;BA.debugLine="Comments.SetResponsiveCell(b)";
_comments._setresponsivecell /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _settemplatehtml(b4j.example.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 24;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixComment";
 //BA.debugLineNum = 25;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 26;BA.debugLine="Comments.SetTemplate(os)";
_comments._settemplate /*b4j.example.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setusers(anywheresoftware.b4a.objects.collections.List _cusers) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetUsers(cUsers As List) As WixComments";
 //BA.debugLineNum = 136;BA.debugLine="Comments.SetAttr(\"users\", cUsers)";
_comments._setattr /*b4j.example.wixelement*/ ("users",(Object)(_cusers.getObject()));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixcomments  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetWidth(w As Object) As WixComments";
 //BA.debugLineNum = 142;BA.debugLine="Comments.SetAttr(\"width\", w)";
_comments._setattr /*b4j.example.wixelement*/ ("width",_w);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.wixcomments)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
