package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcomments extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.wixcomments", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.wixcomments.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebix.wixelement _comments = null;
public anywheresoftware.b4a.objects.collections.List _users = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public String _user_active = "";
public String _user_away = "";
public String _user_busy = "";
public String _user_none = "";
public b4j.Mashy.BANanoWebix.main _main = null;
public String  _addcomment(String _cid,String _uid,String _cdate,String _ctext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _comment = null;
 //BA.debugLineNum = 24;BA.debugLine="Sub AddComment(cID As String, uID As String, cDate";
 //BA.debugLineNum = 25;BA.debugLine="Dim comment As Map = CreateMap()";
_comment = new anywheresoftware.b4a.objects.collections.Map();
_comment = __c.createMap(new Object[] {});
 //BA.debugLineNum = 26;BA.debugLine="comment.Put(\"id\", cID)";
_comment.Put((Object)("id"),(Object)(_cid));
 //BA.debugLineNum = 27;BA.debugLine="comment.Put(\"user_id\", uID)";
_comment.Put((Object)("user_id"),(Object)(_uid));
 //BA.debugLineNum = 28;BA.debugLine="comment.Put(\"date\", cDate)";
_comment.Put((Object)("date"),(Object)(_cdate));
 //BA.debugLineNum = 29;BA.debugLine="comment.Put(\"text\", cText)";
_comment.Put((Object)("text"),(Object)(_ctext));
 //BA.debugLineNum = 30;BA.debugLine="Data.Add(comment)";
_data.Add((Object)(_comment.getObject()));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _adduser(String _uid,String _uname,String _uimage,String _ustatus) throws Exception{
anywheresoftware.b4a.objects.collections.Map _u = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub AddUser(uID As String, uName As String, uImage";
 //BA.debugLineNum = 36;BA.debugLine="Dim u As Map = CreateMap()";
_u = new anywheresoftware.b4a.objects.collections.Map();
_u = __c.createMap(new Object[] {});
 //BA.debugLineNum = 37;BA.debugLine="u.Put(\"id\", uID)";
_u.Put((Object)("id"),(Object)(_uid));
 //BA.debugLineNum = 38;BA.debugLine="u.Put(\"value\", uName)";
_u.Put((Object)("value"),(Object)(_uname));
 //BA.debugLineNum = 39;BA.debugLine="u.Put(\"image\", uImage)";
_u.Put((Object)("image"),(Object)(_uimage));
 //BA.debugLineNum = 40;BA.debugLine="u.Put(\"status\", uStatus)";
_u.Put((Object)("status"),(Object)(_ustatus));
 //BA.debugLineNum = 41;BA.debugLine="Users.Add(u)";
_users.Add((Object)(_u.getObject()));
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Comments As WixElement";
_comments = new b4j.Mashy.BANanoWebix.wixelement();
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
public b4j.Mashy.BANanoWebix.wixcomments  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(sid As String) As WixComment";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Comments.Initialize(ID).SetView(\"comments\")";
_comments._initialize /*b4j.Mashy.BANanoWebix.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebix.wixelement*/ ("comments");
 //BA.debugLineNum = 18;BA.debugLine="Users.Initialize";
_users.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 59;BA.debugLine="Return Comments.item";
if (true) return _comments._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcomments  _setcurrentuser(int _u) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetCurrentUser(u As Int) As WixComments";
 //BA.debugLineNum = 53;BA.debugLine="Comments.SetAttr(\"currentUser\", u)";
_comments._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("currentUser",(Object)(_u));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcomments  _setdata(anywheresoftware.b4a.objects.collections.List _cdata) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetData(cData As List) As WixComments";
 //BA.debugLineNum = 82;BA.debugLine="Comments.SetData(cData)";
_comments._setdata /*b4j.Mashy.BANanoWebix.wixelement*/ (_cdata);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcomments  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetHeight(h As Object) As WixComments";
 //BA.debugLineNum = 100;BA.debugLine="Comments.SetAttr(\"height\", h)";
_comments._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("height",_h);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcomments  _setmentions(boolean _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetMentions(b As Boolean) As WixComments";
 //BA.debugLineNum = 64;BA.debugLine="Comments.SetAttr(\"mentions\", b)";
_comments._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("mentions",(Object)(_b));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcomments  _setmodechat(String _c) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetModeChat(c As String) As WixComments   'ign";
 //BA.debugLineNum = 76;BA.debugLine="Comments.SetAttr(\"mode\", \"chat\")";
_comments._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("mode",(Object)("chat"));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcomments  _setmore(int _m) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetMore(m As Int) As WixComments";
 //BA.debugLineNum = 46;BA.debugLine="Comments.SetAttr(\"more\", M)";
_comments._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("more",(Object)(_m));
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcomments  _setmorebutton(String _m) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetMoreButton(m As String) As WixComments";
 //BA.debugLineNum = 70;BA.debugLine="Comments.SetAttr(\"moreButton\", m)";
_comments._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("moreButton",(Object)(_m));
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcomments  _setusers(anywheresoftware.b4a.objects.collections.List _cusers) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetUsers(cUsers As List) As WixComments";
 //BA.debugLineNum = 88;BA.debugLine="Comments.SetAttr(\"users\", cUsers)";
_comments._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("users",(Object)(_cusers.getObject()));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.wixcomments  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetWidth(w As Object) As WixComments";
 //BA.debugLineNum = 94;BA.debugLine="Comments.SetAttr(\"width\", w)";
_comments._setattr /*b4j.Mashy.BANanoWebix.wixelement*/ ("width",_w);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.wixcomments)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
