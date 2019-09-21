package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixprint extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixprint", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixprint.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _print = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Print As WixElement";
_print = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize As WixPrint";
 //BA.debugLineNum = 8;BA.debugLine="Print.Initialize(\"\")";
_print._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,"");
 //BA.debugLineNum = 9;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 137;BA.debugLine="Return Print.item";
if (true) return _print._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub SetAttributes(m As Map) As WixPrint";
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
 //BA.debugLineNum = 31;BA.debugLine="Print.SetAttr(k,v)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setborderless(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetBorderLess(b As Boolean) As WixPrint";
 //BA.debugLineNum = 97;BA.debugLine="Print.SetAttr(\"skiprows\", b)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("skiprows",(Object)(_b));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setdata(String _d) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetData(d As String) As WixPrint";
 //BA.debugLineNum = 112;BA.debugLine="Print.SetAttr(\"data\", d)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("data",(Object)(_d));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setdataall(boolean _b) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetDataAll(b As Boolean) As WixPrint  'ignore";
 //BA.debugLineNum = 117;BA.debugLine="SetData(\"all\")";
_setdata("all");
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setdatacurrent(Object _b) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetDataCurrent(b As Object) As WixPrint  'igno";
 //BA.debugLineNum = 122;BA.debugLine="SetData(\"current\")";
_setdata("current");
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setdataselection(Object _b) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetDataSelection(b As Object) As WixPrint  'ig";
 //BA.debugLineNum = 127;BA.debugLine="SetData(\"selection\")";
_setdata("selection");
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setdocfooter(Object _d) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetDocFooter(d As Object) As WixPrint";
 //BA.debugLineNum = 62;BA.debugLine="Print.SetAttr(\"docFooter\", d)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("docFooter",_d);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setdocheader(Object _d) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetDocHeader(d As Object) As WixPrint";
 //BA.debugLineNum = 57;BA.debugLine="Print.SetAttr(\"docHeader\", d)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("docHeader",_d);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setfit(Object _f) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetFit(f As Object) As WixPrint";
 //BA.debugLineNum = 72;BA.debugLine="Print.SetAttr(\"fit\", f)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("fit",_f);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setfitdata(boolean _b) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetFitData(b As Boolean) As WixPrint    'ignor";
 //BA.debugLineNum = 82;BA.debugLine="SetFit(\"data\")";
_setfit((Object)("data"));
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setfitpage(boolean _b) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetFitPage(b As Boolean) As WixPrint    'ignor";
 //BA.debugLineNum = 77;BA.debugLine="SetFit(\"page\")";
_setfit((Object)("page"));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setfooter(boolean _b) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetFooter(b As Boolean) As WixPrint";
 //BA.debugLineNum = 107;BA.debugLine="Print.SetAttr(\"footer\", b)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("footer",(Object)(_b));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setheader(boolean _b) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetHeader(b As Boolean) As WixPrint";
 //BA.debugLineNum = 87;BA.debugLine="Print.SetAttr(\"header\", b)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("header",(Object)(_b));
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setmode(Object _m) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetMode(m As Object) As WixPrint";
 //BA.debugLineNum = 42;BA.debugLine="Print.SetAttr(\"mode\", m)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("mode",_m);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setmodelandscape(boolean _b) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetModeLandScape(b As Boolean) As WixPrint   '";
 //BA.debugLineNum = 52;BA.debugLine="SetMode(\"landscape\")";
_setmode((Object)("landscape"));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setmodeportrait(boolean _b) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetModePortrait(b As Boolean) As WixPrint   'i";
 //BA.debugLineNum = 47;BA.debugLine="SetMode(\"portrait\")";
_setmode((Object)("portrait"));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setpaper(Object _p) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub SetPaper(p As Object) As WixPrint";
 //BA.debugLineNum = 13;BA.debugLine="Print.SetAttr(\"paper\", p)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paper",_p);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setpapera3(boolean _b) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub SetPaperA3(b As Boolean) As WixPrint   'ignore";
 //BA.debugLineNum = 18;BA.debugLine="SetPaper(\"a3\")";
_setpaper((Object)("a3"));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setpapera4(boolean _b) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetPaperA4(b As Boolean) As WixPrint   'ignore";
 //BA.debugLineNum = 23;BA.debugLine="SetPaper(\"a4\")";
_setpaper((Object)("a4"));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setpaperletter(boolean _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetPaperLetter(b As Boolean) As WixPrint    'i";
 //BA.debugLineNum = 37;BA.debugLine="SetPaper(\"letter\")";
_setpaper((Object)("letter"));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setscroll(boolean _s) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetScroll(s As Boolean) As WixPrint";
 //BA.debugLineNum = 67;BA.debugLine="Print.SetAttr(\"scroll\", s)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("scroll",(Object)(_s));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setsheetnames(boolean _b) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetSheetNames(b As Boolean) As WixPrint";
 //BA.debugLineNum = 132;BA.debugLine="Print.SetAttr(\"sheetnames\", b)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("sheetnames",(Object)(_b));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _setskiprows(boolean _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetSkipRows(b As Boolean) As WixPrint";
 //BA.debugLineNum = 92;BA.debugLine="Print.SetAttr(\"skiprows\", b)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("skiprows",(Object)(_b));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixprint  _settrim(boolean _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetTrim(b As Boolean) As WixPrint";
 //BA.debugLineNum = 102;BA.debugLine="Print.SetAttr(\"trim\", b)";
_print._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("trim",(Object)(_b));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixprint)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
