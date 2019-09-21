package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixcalendar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixcalendar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixcalendar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _calendar = null;
public anywheresoftware.b4a.objects.collections.Map _on = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 261;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 266;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 256;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Calendar As WixElement";
_calendar = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private On As Map";
_on = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _initialize(anywheresoftware.b4a.BA _ba,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(sid As String) As WixCalenda";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Calendar.Initialize(ID).SetView(\"calendar\")";
_calendar._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_id)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("calendar");
 //BA.debugLineNum = 14;BA.debugLine="On.Initialize";
_on.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 91;BA.debugLine="If On.Size > 0 Then";
if (_on.getSize()>0) { 
 //BA.debugLineNum = 92;BA.debugLine="Calendar.SetAttr(\"on\", On)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("on",(Object)(_on.getObject()));
 };
 //BA.debugLineNum = 94;BA.debugLine="Return Calendar.item";
if (true) return _calendar._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _onafterdateselect(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub OnAfterDateSelect(cb As BANanoObject) As WixCa";
 //BA.debugLineNum = 65;BA.debugLine="On.Put(\"onAfterDateSelect\",cb)";
_on.Put((Object)("onAfterDateSelect"),(Object)(_cb));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _onaftermonthchange(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub OnAfterMonthChange(cb As BANanoObject) As WixC";
 //BA.debugLineNum = 70;BA.debugLine="On.Put(\"onAfterMonthChange\", cb)";
_on.Put((Object)("onAfterMonthChange"),(Object)(_cb));
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _ondateclear(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub OnDateClear(cb As BANanoObject) As WixCalendar";
 //BA.debugLineNum = 75;BA.debugLine="On.Put(\"onDateClear\", cb)";
_on.Put((Object)("onDateClear"),(Object)(_cb));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _ondateselect(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub OnDateSelect(cb As BANanoObject) As WixCalenda";
 //BA.debugLineNum = 80;BA.debugLine="On.Put(\"onDateSelect\", cb)";
_on.Put((Object)("onDateSelect"),(Object)(_cb));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _ontodayset(com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub OnTodaySet(cb As BANanoObject) As WixCalendar";
 //BA.debugLineNum = 85;BA.debugLine="On.Put(\"onTodaySet\", cb)";
_on.Put((Object)("onTodaySet"),(Object)(_cb));
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 61;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixCalendar";
 //BA.debugLineNum = 271;BA.debugLine="Calendar.SetAttr(\"animate\", animate)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 31;BA.debugLine="Sub SetAttributes(m As Map) As WixCalendar";
 //BA.debugLineNum = 32;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 33;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 34;BA.debugLine="Calendar.SetAttr(k,v)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setblockdates(Object _blockdates) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetBlockDates(blockDates As Object) As WixCale";
 //BA.debugLineNum = 163;BA.debugLine="Calendar.SetAttr(\"blockDates\", blockDates)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("blockDates",_blockdates);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setblocktime(String _blocktime) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetBlockTime(blockTime As String) As WixCalend";
 //BA.debugLineNum = 178;BA.debugLine="Calendar.SetAttr(\"blockTime\", blockTime)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("blockTime",(Object)(_blocktime));
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixCal";
 //BA.debugLineNum = 277;BA.debugLine="Calendar.SetAttr(\"borderless\", borderless)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setcalendarheader(Object _calendarheader) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetCalendarHeader(calendarHeader As Object) As";
 //BA.debugLineNum = 248;BA.debugLine="Calendar.SetAttr(\"calendarHeader\", calendarHeader)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("calendarHeader",_calendarheader);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setcalendartime(Object _calendartime) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetCalendarTime(calendarTime As Object) As Wix";
 //BA.debugLineNum = 243;BA.debugLine="Calendar.SetAttr(\"calendarTime\", calendarTime)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("calendarTime",_calendartime);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setcalendarweekheader(String _calendarweekheader) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetCalendarWeekHeader(calendarWeekHeader As St";
 //BA.debugLineNum = 238;BA.debugLine="Calendar.SetAttr(\"calendarWeekHeader\", calendarWee";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("calendarWeekHeader",(Object)(_calendarweekheader));
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setcellheight(String _cellheight) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetCellHeight(cellHeight As String) As WixCale";
 //BA.debugLineNum = 233;BA.debugLine="Calendar.SetAttr(\"cellHeight\", cellHeight)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("cellHeight",(Object)(_cellheight));
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setcontainer(String _container) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetContainer(container As String) As WixCalend";
 //BA.debugLineNum = 228;BA.debugLine="Calendar.SetAttr(\"container\", container)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",(Object)(_container));
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setcss(String _css) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetCSS(CSS As String) As WixCalendar";
 //BA.debugLineNum = 223;BA.debugLine="Calendar.SetAttr(\"CSS\", CSS)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("CSS",(Object)(_css));
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setdate(Object _sdate) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetDate(sdate As Object) As WixCalendar";
 //BA.debugLineNum = 98;BA.debugLine="Calendar.SetAttr(\"date\", sdate)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("date",_sdate);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setdaytemplate(String _daytemplate) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetDayTemplate(dayTemplate As String) As WixCa";
 //BA.debugLineNum = 218;BA.debugLine="Calendar.SetAttr(\"dayTemplate\", dayTemplate)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dayTemplate",(Object)(_daytemplate));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixCalenda";
 //BA.debugLineNum = 282;BA.debugLine="Calendar.SetAttr(\"disabled\", disabled)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setevents(Object _sevents) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetEvents(sevents As Object) As WixCalendar";
 //BA.debugLineNum = 103;BA.debugLine="Calendar.SetAttr(\"events\", sevents)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("events",_sevents);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetGravity(gravity As Object) As WixCalendar";
 //BA.debugLineNum = 287;BA.debugLine="Calendar.SetAttr(\"gravity\", gravity)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setheaderheight(String _headerheight) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetHeaderHeight(headerHeight As String) As Wix";
 //BA.debugLineNum = 213;BA.debugLine="Calendar.SetAttr(\"headerHeight\", headerHeight)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("headerHeight",(Object)(_headerheight));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setheight(String _height) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetHeight(height As String) As WixCalendar";
 //BA.debugLineNum = 118;BA.debugLine="Calendar.SetAttr(\"height\", height)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("height",(Object)(_height));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixCalendar";
 //BA.debugLineNum = 208;BA.debugLine="Calendar.SetAttr(\"hidden\", hidden)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _seticons(Object _icons) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetIcons(icons As Object) As WixCalendar";
 //BA.debugLineNum = 128;BA.debugLine="Calendar.SetAttr(\"icons\", icons)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("icons",_icons);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmargin(Object _margin) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetMargin(margin As Object) As WixCalendar";
 //BA.debugLineNum = 27;BA.debugLine="Calendar.SetMargin(margin)";
_calendar._setmargin /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_margin));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmaxdate(Object _maxdate) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetMaxDate(maxDate As Object) As WixCalendar";
 //BA.debugLineNum = 158;BA.debugLine="Calendar.SetAttr(\"maxDate\", maxDate)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxDate",_maxdate);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixCalend";
 //BA.debugLineNum = 292;BA.debugLine="Calendar.SetAttr(\"maxHeight\", maxHeight)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmaxtime(String _maxtime) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetMaxTime(maxTime As String) As WixCalendar";
 //BA.debugLineNum = 173;BA.debugLine="Calendar.SetAttr(\"maxTime\", maxTime)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxTime",(Object)(_maxtime));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixCalendar";
 //BA.debugLineNum = 297;BA.debugLine="Calendar.SetAttr(\"maxWidth\", maxWidth)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmindate(Object _mindate) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetMinDate(minDate As Object) As WixCalendar";
 //BA.debugLineNum = 153;BA.debugLine="Calendar.SetAttr(\"minDate\", minDate)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minDate",_mindate);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setminheight(Object _minheight) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetMinHeight(minHeight As Object) As WixCalend";
 //BA.debugLineNum = 302;BA.debugLine="Calendar.SetAttr(\"minHeight\", minHeight)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minHeight",_minheight);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmintime(String _mintime) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetMinTime(minTime As String) As WixCalendar";
 //BA.debugLineNum = 168;BA.debugLine="Calendar.SetAttr(\"minTime\", minTime)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minTime",(Object)(_mintime));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setminutestep(String _minutestep) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetMinuteStep(minuteStep As String) As WixCale";
 //BA.debugLineNum = 183;BA.debugLine="Calendar.SetAttr(\"minuteStep\", minuteStep)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minuteStep",(Object)(_minutestep));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setminwidth(Object _minwidth) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetMinWidth(minWidth As Object) As WixCalendar";
 //BA.debugLineNum = 307;BA.debugLine="Calendar.SetAttr(\"minWidth\", minWidth)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("minWidth",_minwidth);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmonthheader(boolean _monthheader) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetMonthHeader(monthHeader As Boolean) As WixC";
 //BA.debugLineNum = 188;BA.debugLine="Calendar.SetAttr(\"monthHeader\", monthHeader)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("monthHeader",(Object)(_monthheader));
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmonthselect(boolean _monthselect) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetMonthSelect(monthSelect As Boolean) As WixC";
 //BA.debugLineNum = 193;BA.debugLine="Calendar.SetAttr(\"monthSelect\", monthSelect)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("monthSelect",(Object)(_monthselect));
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setmultiselect(boolean _multiselect) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetMultiselect(multiselect As Boolean) As WixC";
 //BA.debugLineNum = 138;BA.debugLine="Calendar.SetAttr(\"multiselect\", multiselect)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("multiselect",(Object)(_multiselect));
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setnavigation(boolean _navigation) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetNavigation(navigation As Boolean) As WixCal";
 //BA.debugLineNum = 312;BA.debugLine="Calendar.SetAttr(\"navigation\", navigation)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("navigation",(Object)(_navigation));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetPadding(padding As Object) As WixCalendar";
 //BA.debugLineNum = 21;BA.debugLine="Calendar.SetPadding(padding)";
_calendar._setpadding /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (BA.ObjectToString(_padding));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetParent(p As WixElement) As WixCalendar";
 //BA.debugLineNum = 55;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setselect(boolean _sselect) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetSelect(sSelect As Boolean) As WixCalendar";
 //BA.debugLineNum = 203;BA.debugLine="Calendar.SetAttr(\"select\", sSelect)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("select",(Object)(_sselect));
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setskipemptyweeks(boolean _skipemptyweeks) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetSkipEmptyWeeks(skipEmptyWeeks As Boolean) A";
 //BA.debugLineNum = 198;BA.debugLine="Calendar.SetAttr(\"skipEmptyWeeks\", skipEmptyWeeks)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("skipEmptyWeeks",(Object)(_skipemptyweeks));
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 49;BA.debugLine="Calendar.SetStyle(prop,sval)";
_calendar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 39;BA.debugLine="Sub SetStyles(m As Map) As WixCalendar";
 //BA.debugLineNum = 40;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 41;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 42;BA.debugLine="Calendar.SetStyle(k,v)";
_calendar._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _settimeicon(Object _timeicon) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetTimeIcon(timeIcon As Object) As WixCalendar";
 //BA.debugLineNum = 317;BA.debugLine="Calendar.SetAttr(\"timeIcon\", timeIcon)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("timeIcon",_timeicon);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _settimepicker(boolean _timepicker) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetTimepicker(timepicker As Boolean) As WixCal";
 //BA.debugLineNum = 133;BA.debugLine="Calendar.SetAttr(\"timepicker\", timepicker)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("timepicker",(Object)(_timepicker));
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _settimepickerheight(String _timepickerheight) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetTimepickerHeight(timepickerHeight As String";
 //BA.debugLineNum = 148;BA.debugLine="Calendar.SetAttr(\"timepickerHeight\", timepickerHei";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("timepickerHeight",(Object)(_timepickerheight));
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _settype(String _stype) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetType(sType As String) As WixCalendar";
 //BA.debugLineNum = 143;BA.debugLine="Calendar.SetAttr(\"type\", sType)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",(Object)(_stype));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setweekheader(boolean _weekheader) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetWeekHeader(weekHeader As Boolean) As WixCal";
 //BA.debugLineNum = 108;BA.debugLine="Calendar.SetAttr(\"weekHeader\", weekHeader)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("weekHeader",(Object)(_weekheader));
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setweeknumber(boolean _weeknumber) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetWeekNumber(weekNumber As Boolean) As WixCal";
 //BA.debugLineNum = 123;BA.debugLine="Calendar.SetAttr(\"weekNumber\", weekNumber)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("weekNumber",(Object)(_weeknumber));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixcalendar  _setwidth(String _width) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetWidth(width As String) As WixCalendar";
 //BA.debugLineNum = 113;BA.debugLine="Calendar.SetAttr(\"width\", width)";
_calendar._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",(Object)(_width));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixcalendar)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
