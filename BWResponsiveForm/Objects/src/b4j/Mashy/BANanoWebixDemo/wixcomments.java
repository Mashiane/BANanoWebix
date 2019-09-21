package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcomments extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcomments", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcomments.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _comments = null;
public anywheresoftware.b4a.objects.collections.List _commentusers = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public String _user_active = "";
public String _user_away = "";
public String _user_busy = "";
public String _user_none = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcomment(String _cid,String _uid,String _cdate,String _ctext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _comment = null;
 //BA.debugLineNum = 121;BA.debugLine="Sub AddComment(cID As String, uID As String, cDate";
 //BA.debugLineNum = 122;BA.debugLine="Dim comment As Map = CreateMap()";
_comment = new anywheresoftware.b4a.objects.collections.Map();
_comment = __c.createMap(new Object[] {});
 //BA.debugLineNum = 123;BA.debugLine="comment.Put(\"id\", cID)";
_comment.Put((Object)("id"),(Object)(_cid));
 //BA.debugLineNum = 124;BA.debugLine="comment.Put(\"user_id\", uID)";
_comment.Put((Object)("user_id"),(Object)(_uid));
 //BA.debugLineNum = 125;BA.debugLine="comment.Put(\"date\", cDate)";
_comment.Put((Object)("date"),(Object)(_cdate));
 //BA.debugLineNum = 126;BA.debugLine="comment.Put(\"text\", cText)";
_comment.Put((Object)("text"),(Object)(_ctext));
 //BA.debugLineNum = 127;BA.debugLine="Data.Add(comment)";
_data.Add((Object)(_comment.getObject()));
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 209;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 214;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 204;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _adduser(String _uid,String _uname,String _uimage,String _ustatus) throws Exception{
anywheresoftware.b4a.objects.collections.Map _u = null;
 //BA.debugLineNum = 132;BA.debugLine="Sub AddUser(uID As String, uName As String, uImage";
 //BA.debugLineNum = 133;BA.debugLine="Dim u As Map = CreateMap()";
_u = new anywheresoftware.b4a.objects.collections.Map();
_u = __c.createMap(new Object[] {});
 //BA.debugLineNum = 134;BA.debugLine="u.Put(\"id\", uID)";
_u.Put((Object)("id"),(Object)(_uid));
 //BA.debugLineNum = 135;BA.debugLine="u.Put(\"value\", uName)";
_u.Put((Object)("value"),(Object)(_uname));
 //BA.debugLineNum = 136;BA.debugLine="u.Put(\"image\", uImage)";
_u.Put((Object)("image"),(Object)(_uimage));
 //BA.debugLineNum = 137;BA.debugLine="u.Put(\"status\", uStatus)";
_u.Put((Object)("status"),(Object)(_ustatus));
 //BA.debugLineNum = 138;BA.debugLine="CommentUsers.Add(u)";
_commentusers.Add((Object)(_u.getObject()));
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Comments As WixElement";
_comments = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Private CommentUsers As List";
_commentusers = new anywheresoftware.b4a.objects.collections.List();
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
 //BA.debugLineNum = 12;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize(sid As String) As WixComment";
 //BA.debugLineNum = 52;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 53;BA.debugLine="Comments.Initialize(ID).SetView(\"comments\")";
_comments._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("comments");
 //BA.debugLineNum = 54;BA.debugLine="CommentUsers.Initialize";
_commentusers.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 156;BA.debugLine="Return Comments.item";
if (true) return _comments._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 62;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 34;BA.debugLine="Sub SetAttributes(m As Map) As WixComments";
 //BA.debugLineNum = 35;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 36;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 37;BA.debugLine="Comments.SetAttr(k,v)";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setcurrentuser(int _u) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetCurrentUser(u As Int) As WixComments";
 //BA.debugLineNum = 150;BA.debugLine="Comments.SetAttr(\"currentUser\", u)";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("currentUser",(Object)(_u));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setdata(anywheresoftware.b4a.objects.collections.List _cdata) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetData(cData As List) As WixComments";
 //BA.debugLineNum = 179;BA.debugLine="Comments.SetData(cData)";
_comments._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_cdata);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetHeight(h As Object) As WixComments";
 //BA.debugLineNum = 197;BA.debugLine="Comments.SetAttr(\"height\", h)";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",_h);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 104;BA.debugLine="Sub SetMap(m As Map) As WixComments";
 //BA.debugLineNum = 105;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 106;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 107;BA.debugLine="Comments.SetAttr(strKey,	strVal)";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMargin(margin As Object) As WixComments";
 //BA.debugLineNum = 30;BA.debugLine="Comments.SetMargin(margin)";
_comments._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setmentions(boolean _b) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetMentions(b As Boolean) As WixComments";
 //BA.debugLineNum = 161;BA.debugLine="Comments.SetAttr(\"mentions\", b)";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("mentions",(Object)(_b));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetMinHeight(h As Int) As WixComments";
 //BA.debugLineNum = 99;BA.debugLine="Comments.SetMinHeight(h)";
_comments._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetMinWidth(w As Int) As WixComments";
 //BA.debugLineNum = 93;BA.debugLine="Comments.SetMinWidth(w)";
_comments._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setmodechat(String _c) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetModeChat(c As String) As WixComments   'ign";
 //BA.debugLineNum = 173;BA.debugLine="Comments.SetAttr(\"mode\", \"chat\")";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("mode",(Object)("chat"));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setmore(int _m) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetMore(m As Int) As WixComments";
 //BA.debugLineNum = 143;BA.debugLine="Comments.SetAttr(\"more\", M)";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("more",(Object)(_m));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setmorebutton(String _m) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetMoreButton(m As String) As WixComments";
 //BA.debugLineNum = 167;BA.debugLine="Comments.SetAttr(\"moreButton\", m)";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("moreButton",(Object)(_m));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setname(String _n) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetName(n As String) As WixComments";
 //BA.debugLineNum = 74;BA.debugLine="Comments.SetName(n)";
_comments._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetPadding(padding As Object) As WixComments";
 //BA.debugLineNum = 24;BA.debugLine="Comments.SetPadding(padding)";
_comments._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetParent(p As WixElement) As WixComments";
 //BA.debugLineNum = 18;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetResponsive(b As Object) As WixComments";
 //BA.debugLineNum = 80;BA.debugLine="Comments.SetResponsive(b)";
_comments._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixComments";
 //BA.debugLineNum = 86;BA.debugLine="Comments.SetResponsiveCell(b)";
_comments._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 115;BA.debugLine="Comments.SetStyle(prop,sval)";
_comments._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub SetStyles(m As Map) As WixComments";
 //BA.debugLineNum = 43;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 44;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 45;BA.debugLine="Comments.SetStyle(k,v)";
_comments._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 65;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixComment";
 //BA.debugLineNum = 66;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 67;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 68;BA.debugLine="Comments.SetTemplate(os)";
_comments._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setusers(anywheresoftware.b4a.objects.collections.List _cusers) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetUsers(cUsers As List) As WixComments";
 //BA.debugLineNum = 185;BA.debugLine="Comments.SetAttr(\"users\", cUsers)";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("users",(Object)(_cusers.getObject()));
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcomments  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetWidth(w As Object) As WixComments";
 //BA.debugLineNum = 191;BA.debugLine="Comments.SetAttr(\"width\", w)";
_comments._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_w);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcomments)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
