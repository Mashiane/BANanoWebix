package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class uoenowhtml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.uoenowhtml", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.uoenowhtml.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public String _tag = "";
public anywheresoftware.b4a.objects.collections.Map _properties = null;
public anywheresoftware.b4a.objects.collections.List _contents = null;
public anywheresoftware.b4a.objects.collections.Map _classes = null;
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public anywheresoftware.b4a.objects.collections.Map _looseattributes = null;
public anywheresoftware.b4a.objects.collections.List _dontbreak = null;
public String _prefix = "";
public boolean _doaproperclose = false;
public boolean _required = false;
public boolean _enabled = false;
public boolean _inline = false;
public boolean _readonly = false;
public anywheresoftware.b4a.objects.collections.Map _cssrule = null;
public anywheresoftware.b4a.objects.collections.List _singlequote = null;
public String _parentid = "";
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sbafter = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sbbefore = null;
public boolean _isimportant = false;
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
public b4j.example.uoenowhtml  _addanchor(String _href,String _caption,String _target) throws Exception{
 //BA.debugLineNum = 1650;BA.debugLine="Sub AddAnchor(href As String,caption As String,Tar";
 //BA.debugLineNum = 1651;BA.debugLine="AddLink(href,caption,Target)";
_addlink(_href,_caption,_target);
 //BA.debugLineNum = 1652;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1653;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addattribute(String _skey,String _svalue) throws Exception{
 //BA.debugLineNum = 1399;BA.debugLine="public Sub AddAttribute(skey As String, svalue As";
 //BA.debugLineNum = 1400;BA.debugLine="skey = CStr(skey)";
_skey = _cstr((Object)(_skey));
 //BA.debugLineNum = 1401;BA.debugLine="svalue = CStr(svalue)";
_svalue = _cstr((Object)(_svalue));
 //BA.debugLineNum = 1402;BA.debugLine="skey = skey.Replace(\"undefined\",\"\")";
_skey = _skey.replace("undefined","");
 //BA.debugLineNum = 1403;BA.debugLine="skey = skey.Replace(\"null\",\"\")";
_skey = _skey.replace("null","");
 //BA.debugLineNum = 1404;BA.debugLine="svalue = svalue.Replace(\"undefined\",\"\")";
_svalue = _svalue.replace("undefined","");
 //BA.debugLineNum = 1405;BA.debugLine="svalue = svalue.Replace(\"null\",\"\")";
_svalue = _svalue.replace("null","");
 //BA.debugLineNum = 1406;BA.debugLine="skey = skey.trim";
_skey = _skey.trim();
 //BA.debugLineNum = 1407;BA.debugLine="svalue = svalue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1408;BA.debugLine="If skey.Length > 0 And svalue.Length > 0 Then";
if (_skey.length()>0 && _svalue.length()>0) { 
 //BA.debugLineNum = 1409;BA.debugLine="properties.Put(skey,svalue)";
_properties.Put((Object)(_skey),(Object)(_svalue));
 }else {
 //BA.debugLineNum = 1411;BA.debugLine="properties.Remove(skey)";
_properties.Remove((Object)(_skey));
 };
 //BA.debugLineNum = 1413;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1414;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addattributeifset(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub AddAttributeIfSet(prop As String, value As Str";
 //BA.debugLineNum = 266;BA.debugLine="If value <> \"\" Then";
if ((_value).equals("") == false) { 
 //BA.debugLineNum = 267;BA.debugLine="AddAttribute(prop,value)";
_addattribute(_prop,_value);
 };
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addattributeoncondition(boolean _bcondition,String _attr,String _value) throws Exception{
 //BA.debugLineNum = 670;BA.debugLine="Sub AddAttributeOnCondition(bCondition As Boolean,";
 //BA.debugLineNum = 671;BA.debugLine="If bCondition = True Then";
if (_bcondition==__c.True) { 
 //BA.debugLineNum = 672;BA.debugLine="AddAttribute(attr,value)";
_addattribute(_attr,_value);
 };
 //BA.debugLineNum = 674;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 675;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addbold(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1549;BA.debugLine="Sub AddBold(value As String) As UOENowHTML";
 //BA.debugLineNum = 1550;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1551;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1552;BA.debugLine="sb.Append(\"{B}\").Append(value).Append(\"{/B}\")";
_sb.Append("{B}").Append(_value).Append("{/B}");
 //BA.debugLineNum = 1553;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1554;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1555;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addbreak(boolean _b) throws Exception{
 //BA.debugLineNum = 1637;BA.debugLine="Sub AddBreak(b As Boolean) As UOENowHTML  'ignore";
 //BA.debugLineNum = 1638;BA.debugLine="AddContent(\"{BR}\")";
_addcontent("{BR}");
 //BA.debugLineNum = 1639;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1640;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addclass(String _value) throws Exception{
anywheresoftware.b4a.objects.collections.List _spclasses = null;
String _strclass = "";
 //BA.debugLineNum = 1385;BA.debugLine="Sub AddClass(value As String) As UOENowHTML";
 //BA.debugLineNum = 1387;BA.debugLine="value = value.Replace(\" \",\";\")";
_value = _value.replace(" ",";");
 //BA.debugLineNum = 1388;BA.debugLine="Dim spClasses As List = StrParse(\";\",value)";
_spclasses = new anywheresoftware.b4a.objects.collections.List();
_spclasses = _strparse(";",_value);
 //BA.debugLineNum = 1389;BA.debugLine="For Each strClass As String In spClasses";
{
final anywheresoftware.b4a.BA.IterableList group3 = _spclasses;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strclass = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1390;BA.debugLine="strClass = strClass.Trim";
_strclass = _strclass.trim();
 //BA.debugLineNum = 1391;BA.debugLine="If strClass.Length > 0 Then";
if (_strclass.length()>0) { 
 //BA.debugLineNum = 1392;BA.debugLine="classes.Put(strClass,strClass)";
_classes.Put((Object)(_strclass),(Object)(_strclass));
 };
 }
};
 //BA.debugLineNum = 1395;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1396;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addclassoncondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 724;BA.debugLine="Sub AddClassOnCondition(bCondition As Boolean, sCl";
 //BA.debugLineNum = 725;BA.debugLine="If bCondition  Then";
if (_bcondition) { 
 //BA.debugLineNum = 726;BA.debugLine="AddClass(sClass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 728;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 729;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addclassonfalsecondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 731;BA.debugLine="Sub AddClassOnFalseCondition(bCondition As Boolean";
 //BA.debugLineNum = 732;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 733;BA.debugLine="AddClass(sClass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 735;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 736;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addclassonvalue(int _ivalue,String _sclass) throws Exception{
 //BA.debugLineNum = 717;BA.debugLine="Sub AddClassOnValue(iValue As Int, sClass As Strin";
 //BA.debugLineNum = 718;BA.debugLine="If iValue > 0 Then";
if (_ivalue>0) { 
 //BA.debugLineNum = 719;BA.debugLine="AddClass(sClass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 721;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addcode(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1610;BA.debugLine="Sub AddCode(value As String) As UOENowHTML";
 //BA.debugLineNum = 1611;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1612;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1613;BA.debugLine="sb.Append(\"<code>\").Append(value).Append(\"</code>";
_sb.Append("<code>").Append(_value).Append("</code>");
 //BA.debugLineNum = 1614;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1615;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1616;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addcontent(String _value) throws Exception{
 //BA.debugLineNum = 1010;BA.debugLine="public Sub AddContent(value As String) As UOENowHT";
 //BA.debugLineNum = 1011;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 1012;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 1013;BA.debugLine="value = FormatText(value)";
_value = _formattext(_value);
 //BA.debugLineNum = 1014;BA.debugLine="Contents.Add(value)";
_contents.Add((Object)(_value));
 };
 //BA.debugLineNum = 1016;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1017;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addcontentafter(String _value) throws Exception{
 //BA.debugLineNum = 1020;BA.debugLine="public Sub AddContentAfter(value As String) As UOE";
 //BA.debugLineNum = 1021;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 1022;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 1023;BA.debugLine="value = FormatText(value)";
_value = _formattext(_value);
 //BA.debugLineNum = 1024;BA.debugLine="SBAfter.Append(value)";
_sbafter.Append(_value);
 };
 //BA.debugLineNum = 1026;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1027;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addcontentbefore(String _value) throws Exception{
 //BA.debugLineNum = 1030;BA.debugLine="public Sub AddContentBefore(value As String) As UO";
 //BA.debugLineNum = 1031;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 1032;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 1033;BA.debugLine="value = FormatText(value)";
_value = _formattext(_value);
 //BA.debugLineNum = 1034;BA.debugLine="SBBefore.Append(value)";
_sbbefore.Append(_value);
 };
 //BA.debugLineNum = 1036;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1037;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addcontentline(String _value) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="public Sub AddContentLine(value As String) As UOEN";
 //BA.debugLineNum = 399;BA.debugLine="If value <> \"\" Then";
if ((_value).equals("") == false) { 
 //BA.debugLineNum = 400;BA.debugLine="value = value.Replace(CRLF,\"\")";
_value = _value.replace(__c.CRLF,"");
 //BA.debugLineNum = 401;BA.debugLine="value = FormatText(value)";
_value = _formattext(_value);
 //BA.debugLineNum = 402;BA.debugLine="Contents.Add(value)";
_contents.Add((Object)(_value));
 };
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addcontentlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _strcontent = "";
 //BA.debugLineNum = 755;BA.debugLine="Sub AddContentList(lst As List) As UOENowHTML";
 //BA.debugLineNum = 756;BA.debugLine="For Each strContent As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcontent = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 757;BA.debugLine="AddContent(strContent)";
_addcontent(_strcontent);
 }
};
 //BA.debugLineNum = 759;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 760;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addcontentlistreverse(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _ltot = 0;
int _lcnt = 0;
String _strcontent = "";
 //BA.debugLineNum = 500;BA.debugLine="Sub AddContentListReverse(lst As List) As UOENowHT";
 //BA.debugLineNum = 501;BA.debugLine="Dim lTot As Int = lst.Size - 1";
_ltot = (int) (_lst.getSize()-1);
 //BA.debugLineNum = 502;BA.debugLine="Dim lCnt As Int";
_lcnt = 0;
 //BA.debugLineNum = 503;BA.debugLine="For lCnt = lTot To 0 Step -1";
{
final int step3 = -1;
final int limit3 = (int) (0);
_lcnt = _ltot ;
for (;_lcnt >= limit3 ;_lcnt = _lcnt + step3 ) {
 //BA.debugLineNum = 504;BA.debugLine="Dim strContent As String = lst.Get(lCnt)";
_strcontent = BA.ObjectToString(_lst.Get(_lcnt));
 //BA.debugLineNum = 505;BA.debugLine="AddContent(strContent)";
_addcontent(_strcontent);
 }
};
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addcursor() throws Exception{
 //BA.debugLineNum = 707;BA.debugLine="Sub AddCursor As UOENowHTML";
 //BA.debugLineNum = 708;BA.debugLine="AddStyleAttribute(\"cursor\", \"pointer\")";
_addstyleattribute("cursor","pointer");
 //BA.debugLineNum = 709;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 710;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _adddataattribute(String _attribute,String _value) throws Exception{
boolean _sw = false;
 //BA.debugLineNum = 604;BA.debugLine="Sub AddDataAttribute(attribute As String, value As";
 //BA.debugLineNum = 605;BA.debugLine="Dim sw As Boolean = attribute.StartsWith(\"data-\")";
_sw = _attribute.startsWith("data-");
 //BA.debugLineNum = 606;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 607;BA.debugLine="AddAttribute(attribute,value)";
_addattribute(_attribute,_value);
 }else {
 //BA.debugLineNum = 609;BA.debugLine="AddAttribute(\"data-\" & attribute,value)";
_addattribute("data-"+_attribute,_value);
 };
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _adddataattributeoncondition(boolean _bcondition,String _attribute,String _value) throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Sub AddDataAttributeOnCondition(bCondition As Bool";
 //BA.debugLineNum = 615;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 616;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 };
 //BA.debugLineNum = 618;BA.debugLine="AddDataAttribute(attribute,value)";
_adddataattribute(_attribute,_value);
 //BA.debugLineNum = 619;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 620;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _adddiv(String _divid,String _divcontent,String _divclass) throws Exception{
b4j.example.uoenowhtml _div = null;
 //BA.debugLineNum = 1540;BA.debugLine="Sub AddDiv(divid As String, divContent As String,";
 //BA.debugLineNum = 1541;BA.debugLine="Dim div As UOENowHTML";
_div = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 1542;BA.debugLine="div.Initialize(divid,\"div\").SetText(divContent).a";
_div._initialize /*b4j.example.uoenowhtml*/ (ba,_divid,"div")._settext /*b4j.example.uoenowhtml*/ (_divcontent)._addclass /*b4j.example.uoenowhtml*/ (_divclass);
 //BA.debugLineNum = 1543;BA.debugLine="AddContent(div.HTML)";
_addcontent(_div._html /*String*/ ());
 //BA.debugLineNum = 1544;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1545;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addelement(b4j.example.uoenowhtml _el) throws Exception{
String _scode = "";
 //BA.debugLineNum = 1055;BA.debugLine="public Sub AddElement(el As UOENowHTML) As UOENowH";
 //BA.debugLineNum = 1056;BA.debugLine="If el <> Null Then";
if (_el!= null) { 
 //BA.debugLineNum = 1057;BA.debugLine="Dim scode As String = el.tostring";
_scode = _el._tostring /*String*/ ();
 //BA.debugLineNum = 1058;BA.debugLine="AddContent(scode)";
_addcontent(_scode);
 };
 //BA.debugLineNum = 1060;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1061;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addelementline(b4j.example.uoenowhtml _el) throws Exception{
String _scode = "";
 //BA.debugLineNum = 378;BA.debugLine="public Sub AddElementLine(el As UOENowHTML) As UOE";
 //BA.debugLineNum = 379;BA.debugLine="If el <> Null Then";
if (_el!= null) { 
 //BA.debugLineNum = 380;BA.debugLine="Dim scode As String = el.html";
_scode = _el._html /*String*/ ();
 //BA.debugLineNum = 381;BA.debugLine="AddContent(scode)";
_addcontent(_scode);
 };
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addelements(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.uoenowhtml _el = null;
 //BA.debugLineNum = 1064;BA.debugLine="Sub AddElements(lst As List) As UOENowHTML";
 //BA.debugLineNum = 1065;BA.debugLine="For Each el As UOENowHTML In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_el = (b4j.example.uoenowhtml)(group1.Get(index1));
 //BA.debugLineNum = 1066;BA.debugLine="AddElement(el)";
_addelement(_el);
 }
};
 //BA.debugLineNum = 1068;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1069;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addem(String _paratext) throws Exception{
 //BA.debugLineNum = 1686;BA.debugLine="Sub AddEM(paraText As String) As UOENowHTML";
 //BA.debugLineNum = 1687;BA.debugLine="AddContent($\"<em>${paraText}</em>\"$)";
_addcontent(("<em>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</em>"));
 //BA.debugLineNum = 1688;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1689;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addh1(String _paratext) throws Exception{
 //BA.debugLineNum = 1656;BA.debugLine="Sub AddH1(paraText As String) As UOENowHTML";
 //BA.debugLineNum = 1657;BA.debugLine="AddContent($\"<h1>${paraText}</h1>\"$)";
_addcontent(("<h1>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h1>"));
 //BA.debugLineNum = 1658;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1659;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addh2(String _paratext) throws Exception{
 //BA.debugLineNum = 1661;BA.debugLine="Sub AddH2(paraText As String) As UOENowHTML";
 //BA.debugLineNum = 1662;BA.debugLine="AddContent($\"<h2>${paraText}</h2>\"$)";
_addcontent(("<h2>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h2>"));
 //BA.debugLineNum = 1663;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1664;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addh3(String _paratext) throws Exception{
 //BA.debugLineNum = 1666;BA.debugLine="Sub AddH3(paraText As String) As UOENowHTML";
 //BA.debugLineNum = 1667;BA.debugLine="AddContent($\"<h3>${paraText}</h3>\"$)";
_addcontent(("<h3>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h3>"));
 //BA.debugLineNum = 1668;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1669;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addh4(String _paratext) throws Exception{
 //BA.debugLineNum = 1671;BA.debugLine="Sub AddH4(paraText As String) As UOENowHTML";
 //BA.debugLineNum = 1672;BA.debugLine="AddContent($\"<h4>${paraText}</h4>\"$)";
_addcontent(("<h4>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h4>"));
 //BA.debugLineNum = 1673;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1674;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addh5(String _paratext) throws Exception{
 //BA.debugLineNum = 1692;BA.debugLine="Sub AddH5(paraText As String) As UOENowHTML";
 //BA.debugLineNum = 1693;BA.debugLine="AddContent($\"<h5>${paraText}</h5>\"$)";
_addcontent(("<h5>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h5>"));
 //BA.debugLineNum = 1694;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1695;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addh6(String _paratext) throws Exception{
 //BA.debugLineNum = 1697;BA.debugLine="Sub AddH6(paraText As String) As UOENowHTML";
 //BA.debugLineNum = 1698;BA.debugLine="AddContent($\"<h6>${paraText}</h6>\"$)";
_addcontent(("<h6>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h6>"));
 //BA.debugLineNum = 1699;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1700;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addheading(int _ssize,String _scontent) throws Exception{
b4j.example.uoenowhtml _hdr = null;
String _hkey = "";
 //BA.debugLineNum = 453;BA.debugLine="Sub AddHeading(sSize As Int, sContent As String) A";
 //BA.debugLineNum = 454;BA.debugLine="Dim hdr As UOENowHTML";
_hdr = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 455;BA.debugLine="Dim hKey As String = \"h\" & sSize";
_hkey = "h"+BA.NumberToString(_ssize);
 //BA.debugLineNum = 456;BA.debugLine="hdr.Initialize(\"\",hKey)";
_hdr._initialize /*b4j.example.uoenowhtml*/ (ba,"",_hkey);
 //BA.debugLineNum = 457;BA.debugLine="hdr.AddContent(sContent)";
_hdr._addcontent /*b4j.example.uoenowhtml*/ (_scontent);
 //BA.debugLineNum = 458;BA.debugLine="AddContent(hdr.HTML)";
_addcontent(_hdr._html /*String*/ ());
 //BA.debugLineNum = 459;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _additalic(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1558;BA.debugLine="Sub AddItalic(value As String) As UOENowHTML";
 //BA.debugLineNum = 1559;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1560;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1561;BA.debugLine="sb.Append(\"{I}\").Append(value).Append(\"{/I}\")";
_sb.Append("{I}").Append(_value).Append("{/I}");
 //BA.debugLineNum = 1562;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1563;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1564;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addkbd(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1601;BA.debugLine="Sub AddKBD(value As String) As UOENowHTML";
 //BA.debugLineNum = 1602;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1603;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1604;BA.debugLine="sb.Append(\"<kbd>\").Append(value).Append(\"</kbd>\")";
_sb.Append("<kbd>").Append(_value).Append("</kbd>");
 //BA.debugLineNum = 1605;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1606;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1607;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addlink(String _href,String _caption,String _target) throws Exception{
b4j.example.uoenowhtml _a = null;
 //BA.debugLineNum = 1643;BA.debugLine="Sub AddLink(href As String,caption As String,Targe";
 //BA.debugLineNum = 1644;BA.debugLine="Dim a As UOENowHTML";
_a = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 1645;BA.debugLine="a.Initialize(\"\",\"a\").SetHREF(href).AddContent(cap";
_a._initialize /*b4j.example.uoenowhtml*/ (ba,"","a")._sethref /*b4j.example.uoenowhtml*/ (_href)._addcontent /*b4j.example.uoenowhtml*/ (_caption)._settarget /*b4j.example.uoenowhtml*/ (_target);
 //BA.debugLineNum = 1646;BA.debugLine="AddElement(a)";
_addelement(_a);
 //BA.debugLineNum = 1647;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1648;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addlooseattribute(String _value) throws Exception{
 //BA.debugLineNum = 554;BA.debugLine="Sub AddLooseAttribute(value As String) As UOENowHT";
 //BA.debugLineNum = 555;BA.debugLine="LooseAttributes.Put(value,value)";
_looseattributes.Put((Object)(_value),(Object)(_value));
 //BA.debugLineNum = 556;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addlooseattributeoncondition(boolean _bstatus,String _value) throws Exception{
 //BA.debugLineNum = 546;BA.debugLine="Sub AddLooseAttributeOnCondition(bStatus As Boolea";
 //BA.debugLineNum = 547;BA.debugLine="If bStatus = True Then";
if (_bstatus==__c.True) { 
 //BA.debugLineNum = 548;BA.debugLine="AddLooseAttribute(value)";
_addlooseattribute(_value);
 };
 //BA.debugLineNum = 550;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addlooseattributeonfalsecondition(boolean _bstatus,String _value) throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub AddLooseAttributeOnFalseCondition(bStatus As B";
 //BA.debugLineNum = 480;BA.debugLine="If bStatus = False Then";
if (_bstatus==__c.False) { 
 //BA.debugLineNum = 481;BA.debugLine="AddLooseAttribute(value)";
_addlooseattribute(_value);
 };
 //BA.debugLineNum = 483;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addmailto(String _emailaddress,String _subject,String _caption) throws Exception{
b4j.example.uoenowhtml _a = null;
 //BA.debugLineNum = 1516;BA.debugLine="Sub AddMailTo(emailaddress As String,subject As St";
 //BA.debugLineNum = 1517;BA.debugLine="subject = subject.Replace(\" \", \"%20\")";
_subject = _subject.replace(" ","%20");
 //BA.debugLineNum = 1518;BA.debugLine="Dim a As UOENowHTML";
_a = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 1519;BA.debugLine="a.Initialize(\"\",\"a\").setHREF($\"mailto:${emailaddr";
_a._initialize /*b4j.example.uoenowhtml*/ (ba,"","a")._sethref /*b4j.example.uoenowhtml*/ (("mailto:"+__c.SmartStringFormatter("",(Object)(_emailaddress))+"?subject="+__c.SmartStringFormatter("",(Object)(_subject))+""))._addcontent /*b4j.example.uoenowhtml*/ (_caption)._settargetblank /*b4j.example.uoenowhtml*/ (__c.True);
 //BA.debugLineNum = 1520;BA.debugLine="AddContent(a.ToString)";
_addcontent(_a._tostring /*String*/ ());
 //BA.debugLineNum = 1521;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1522;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addmark(String _scontent,String _sclass) throws Exception{
b4j.example.uoenowhtml _p = null;
 //BA.debugLineNum = 470;BA.debugLine="Sub AddMark(sContent As String, sclass As String)";
 //BA.debugLineNum = 471;BA.debugLine="Dim p As UOENowHTML";
_p = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 472;BA.debugLine="p.Initialize(\"\",\"mark\").AddClass(sclass)";
_p._initialize /*b4j.example.uoenowhtml*/ (ba,"","mark")._addclass /*b4j.example.uoenowhtml*/ (_sclass);
 //BA.debugLineNum = 473;BA.debugLine="p.AddContent(sContent)";
_p._addcontent /*b4j.example.uoenowhtml*/ (_scontent);
 //BA.debugLineNum = 474;BA.debugLine="AddContent(p.HTML)";
_addcontent(_p._html /*String*/ ());
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addparagraph(String _scontent) throws Exception{
b4j.example.uoenowhtml _p = null;
 //BA.debugLineNum = 462;BA.debugLine="Sub AddParagraph(sContent As String) As UOENowHTML";
 //BA.debugLineNum = 463;BA.debugLine="Dim p As UOENowHTML";
_p = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 464;BA.debugLine="p.Initialize(\"\",\"p\")";
_p._initialize /*b4j.example.uoenowhtml*/ (ba,"","p");
 //BA.debugLineNum = 465;BA.debugLine="p.AddContent(sContent)";
_p._addcontent /*b4j.example.uoenowhtml*/ (_scontent);
 //BA.debugLineNum = 466;BA.debugLine="AddContent(p.HTML)";
_addcontent(_p._html /*String*/ ());
 //BA.debugLineNum = 467;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addpre(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1618;BA.debugLine="Sub AddPre(value As String) As UOENowHTML";
 //BA.debugLineNum = 1619;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1620;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1621;BA.debugLine="sb.Append(\"<pre>\").Append(value).Append(\"</pre>\")";
_sb.Append("<pre>").Append(_value).Append("</pre>");
 //BA.debugLineNum = 1622;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1623;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1624;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addproperty(String _skey,String _svalue) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Public Sub AddProperty(sKey As String, sValue As S";
 //BA.debugLineNum = 302;BA.debugLine="AddAttribute(sKey, sValue)";
_addattribute(_skey,_svalue);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addpropertyoncondition(boolean _bcondition,String _attr,String _value) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub AddPropertyOnCondition(bCondition As Boolean,";
 //BA.debugLineNum = 294;BA.debugLine="If bCondition Then";
if (_bcondition) { 
 //BA.debugLineNum = 295;BA.debugLine="AddAttribute(attr,value)";
_addattribute(_attr,_value);
 };
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addsmall(String _paratext) throws Exception{
 //BA.debugLineNum = 1681;BA.debugLine="Sub AddSmall(paraText As String) As UOENowHTML";
 //BA.debugLineNum = 1682;BA.debugLine="AddContent($\"<small>${paraText}</small>\"$)";
_addcontent(("<small>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</small>"));
 //BA.debugLineNum = 1683;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1684;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addstrong(String _paratext) throws Exception{
 //BA.debugLineNum = 1676;BA.debugLine="Sub AddStrong(paraText As String) As UOENowHTML";
 //BA.debugLineNum = 1677;BA.debugLine="AddContent($\"<strong>${paraText}</strong>\"$)";
_addcontent(("<strong>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</strong>"));
 //BA.debugLineNum = 1678;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1679;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addstyle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1320;BA.debugLine="Sub AddStyle(prop As String, value As String) As U";
 //BA.debugLineNum = 1321;BA.debugLine="AddStyleAttribute(prop,value)";
_addstyleattribute(_prop,_value);
 //BA.debugLineNum = 1322;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1323;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addstyleattribute(String _sprop,String _svalue) throws Exception{
 //BA.debugLineNum = 1326;BA.debugLine="Sub AddStyleAttribute(sprop As String, svalue As S";
 //BA.debugLineNum = 1327;BA.debugLine="sprop = sprop.ToLowerCase";
_sprop = _sprop.toLowerCase();
 //BA.debugLineNum = 1328;BA.debugLine="sprop = sprop.Trim";
_sprop = _sprop.trim();
 //BA.debugLineNum = 1329;BA.debugLine="svalue = svalue.Trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1331;BA.debugLine="sprop = RemDelim(sprop,\":\")";
_sprop = _remdelim(_sprop,":");
 //BA.debugLineNum = 1333;BA.debugLine="svalue = RemDelim(svalue,\";\")";
_svalue = _remdelim(_svalue,";");
 //BA.debugLineNum = 1334;BA.debugLine="sprop = sprop.Trim";
_sprop = _sprop.trim();
 //BA.debugLineNum = 1335;BA.debugLine="svalue = svalue.Trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1336;BA.debugLine="If svalue.Length > 0 And sprop.Length > 0 Then";
if (_svalue.length()>0 && _sprop.length()>0) { 
 //BA.debugLineNum = 1338;BA.debugLine="If svalue.EndsWith(\"!important\") = False Then";
if (_svalue.endsWith("!important")==__c.False) { 
 //BA.debugLineNum = 1339;BA.debugLine="If IsImportant Then";
if (_isimportant) { 
 //BA.debugLineNum = 1340;BA.debugLine="svalue = svalue & \" !important\"";
_svalue = _svalue+" !important";
 };
 };
 //BA.debugLineNum = 1344;BA.debugLine="Styles.Put(sprop, svalue)";
_styles.Put((Object)(_sprop),(Object)(_svalue));
 };
 //BA.debugLineNum = 1346;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1347;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addstyleattributeoncondition(boolean _bcondition,String _attr,String _value) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="Sub AddStyleAttributeOnCondition(bCondition As Boo";
 //BA.debugLineNum = 664;BA.debugLine="If bCondition = True Then";
if (_bcondition==__c.True) { 
 //BA.debugLineNum = 665;BA.debugLine="AddStyleAttribute(attr,value)";
_addstyleattribute(_attr,_value);
 };
 //BA.debugLineNum = 667;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 668;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addstyleoncondition(boolean _bcondition,String _attribute,String _value) throws Exception{
 //BA.debugLineNum = 622;BA.debugLine="Sub AddStyleOnCondition(bCondition As Boolean,attr";
 //BA.debugLineNum = 623;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 624;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 };
 //BA.debugLineNum = 626;BA.debugLine="AddStyle(attribute,value)";
_addstyle(_attribute,_value);
 //BA.debugLineNum = 627;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 628;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addsub(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1593;BA.debugLine="Sub AddSub(value As String) As UOENowHTML";
 //BA.debugLineNum = 1594;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1595;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1596;BA.debugLine="sb.Append(\"<sub>\").Append(value).Append(\"</sub>\")";
_sb.Append("<sub>").Append(_value).Append("</sub>");
 //BA.debugLineNum = 1597;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1598;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1599;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addsubscript(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1576;BA.debugLine="Sub AddSubScript(value As String) As UOENowHTML";
 //BA.debugLineNum = 1577;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1578;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1579;BA.debugLine="sb.Append(\"{SUB}\").Append(value).Append(\"{/SUB}\")";
_sb.Append("{SUB}").Append(_value).Append("{/SUB}");
 //BA.debugLineNum = 1580;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1581;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1582;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addsup(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1627;BA.debugLine="Sub AddSup(value As String) As UOENowHTML";
 //BA.debugLineNum = 1628;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1629;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1630;BA.debugLine="sb.Append(\"<sup>\").Append(value).Append(\"</sup>\")";
_sb.Append("<sup>").Append(_value).Append("</sup>");
 //BA.debugLineNum = 1631;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1632;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1633;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addsuperscript(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1585;BA.debugLine="Sub AddSuperScript(value As String) As UOENowHTML";
 //BA.debugLineNum = 1586;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1587;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1588;BA.debugLine="sb.Append(\"{SUP}\").Append(value).Append(\"{/SUP}\")";
_sb.Append("{SUP}").Append(_value).Append("{/SUP}");
 //BA.debugLineNum = 1589;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1590;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1591;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addtext(String _txt) throws Exception{
 //BA.debugLineNum = 777;BA.debugLine="Sub AddText(txt As String) As UOENowHTML";
 //BA.debugLineNum = 778;BA.debugLine="AddContent(txt)";
_addcontent(_txt);
 //BA.debugLineNum = 779;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 780;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _addunderline(String _value) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1567;BA.debugLine="Sub AddUnderline(value As String) As UOENowHTML";
 //BA.debugLineNum = 1568;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1569;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1570;BA.debugLine="sb.Append(\"{U}\").Append(value).Append(\"{/U}\")";
_sb.Append("{U}").Append(_value).Append("{/U}");
 //BA.debugLineNum = 1571;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 1572;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1573;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _applystyle(String _sstyle) throws Exception{
anywheresoftware.b4a.objects.collections.List _pieces = null;
String _strpiece = "";
String _attr = "";
String _val = "";
 //BA.debugLineNum = 332;BA.debugLine="Sub ApplyStyle(sStyle As String) As UOENowHTML";
 //BA.debugLineNum = 334;BA.debugLine="sStyle = sStyle.trim";
_sstyle = _sstyle.trim();
 //BA.debugLineNum = 335;BA.debugLine="sStyle = RemDelim(sStyle,\";\")";
_sstyle = _remdelim(_sstyle,";");
 //BA.debugLineNum = 336;BA.debugLine="Dim pieces As List = StrParse(\";\",sStyle)";
_pieces = new anywheresoftware.b4a.objects.collections.List();
_pieces = _strparse(";",_sstyle);
 //BA.debugLineNum = 337;BA.debugLine="For Each strPiece As String In pieces";
{
final anywheresoftware.b4a.BA.IterableList group4 = _pieces;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strpiece = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 338;BA.debugLine="Dim attr As String = MvField(strPiece,1,\":\")";
_attr = _mvfield(_strpiece,(int) (1),":");
 //BA.debugLineNum = 339;BA.debugLine="Dim val As String = MvField(strPiece,2,\":\")";
_val = _mvfield(_strpiece,(int) (2),":");
 //BA.debugLineNum = 340;BA.debugLine="attr = attr.trim";
_attr = _attr.trim();
 //BA.debugLineNum = 341;BA.debugLine="val = val.trim";
_val = _val.trim();
 //BA.debugLineNum = 342;BA.debugLine="If attr <> \"\" Then";
if ((_attr).equals("") == false) { 
 //BA.debugLineNum = 343;BA.debugLine="AddStyleAttribute(attr,val)";
_addstyleattribute(_attr,_val);
 };
 }
};
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public String  _buildattributes() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strkey = "";
String _strvalue = "";
 //BA.debugLineNum = 1215;BA.debugLine="Sub BuildAttributes As String";
 //BA.debugLineNum = 1216;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1217;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1218;BA.debugLine="Dim kTot As Int = properties.Size - 1";
_ktot = (int) (_properties.getSize()-1);
 //BA.debugLineNum = 1219;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 1220;BA.debugLine="Dim strKey As String = properties.GetKeyAt(0)";
_strkey = BA.ObjectToString(_properties.GetKeyAt((int) (0)));
 //BA.debugLineNum = 1221;BA.debugLine="Dim strValue As String = properties.Get(strKey)";
_strvalue = BA.ObjectToString(_properties.Get((Object)(_strkey)));
 //BA.debugLineNum = 1222;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
if (_singlequote.IndexOf((Object)(_strkey))==-1) { 
 //BA.debugLineNum = 1223;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
_sb.Append(_toproperty(_strkey,_strvalue));
 }else {
 //BA.debugLineNum = 1225;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue)";
_sb.Append(_tosinglequoteproperty(_strkey,_strvalue));
 };
 //BA.debugLineNum = 1227;BA.debugLine="For kCnt = 1 To kTot";
{
final int step12 = 1;
final int limit12 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit12 ;_kcnt = _kcnt + step12 ) {
 //BA.debugLineNum = 1228;BA.debugLine="strKey = properties.GetKeyAt(kCnt)";
_strkey = BA.ObjectToString(_properties.GetKeyAt(_kcnt));
 //BA.debugLineNum = 1229;BA.debugLine="strValue = properties.Get(strKey)";
_strvalue = BA.ObjectToString(_properties.Get((Object)(_strkey)));
 //BA.debugLineNum = 1230;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 1231;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
if (_singlequote.IndexOf((Object)(_strkey))==-1) { 
 //BA.debugLineNum = 1232;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
_sb.Append(_toproperty(_strkey,_strvalue));
 }else {
 //BA.debugLineNum = 1234;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue";
_sb.Append(_tosinglequoteproperty(_strkey,_strvalue));
 };
 }
};
 //BA.debugLineNum = 1237;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1238;BA.debugLine="End Sub";
return "";
}
public String  _buildclass() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strclass = "";
 //BA.debugLineNum = 1072;BA.debugLine="Sub BuildClass() As String";
 //BA.debugLineNum = 1073;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1074;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1075;BA.debugLine="Dim kTot As Int = classes.Size - 1";
_ktot = (int) (_classes.getSize()-1);
 //BA.debugLineNum = 1076;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 1077;BA.debugLine="Dim strClass As String  = classes.GetKeyAt(0)";
_strclass = BA.ObjectToString(_classes.GetKeyAt((int) (0)));
 //BA.debugLineNum = 1078;BA.debugLine="sb.Append(strClass)";
_sb.Append(_strclass);
 //BA.debugLineNum = 1079;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
 //BA.debugLineNum = 1080;BA.debugLine="Dim strClass As String  = classes.GetKeyAt(kCnt)";
_strclass = BA.ObjectToString(_classes.GetKeyAt(_kcnt));
 //BA.debugLineNum = 1081;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 1082;BA.debugLine="sb.Append(strClass)";
_sb.Append(_strclass);
 }
};
 //BA.debugLineNum = 1084;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1085;BA.debugLine="End Sub";
return "";
}
public String  _buildstyle() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _kcnt = 0;
int _ktot = 0;
String _strkey = "";
String _strvalue = "";
String _strline = "";
 //BA.debugLineNum = 1088;BA.debugLine="Sub BuildStyle() As String";
 //BA.debugLineNum = 1089;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1090;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1091;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 1092;BA.debugLine="Dim kTot As Int = Styles.Size - 1";
_ktot = (int) (_styles.getSize()-1);
 //BA.debugLineNum = 1094;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(0)";
_strkey = BA.ObjectToString(_styles.GetKeyAt((int) (0)));
 //BA.debugLineNum = 1095;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
_strvalue = BA.ObjectToString(_styles.Get((Object)(_strkey)));
 //BA.debugLineNum = 1096;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
_strline = _tostyle(_strkey,_strvalue);
 //BA.debugLineNum = 1097;BA.debugLine="sb.Append(strLine)";
_sb.Append(_strline);
 //BA.debugLineNum = 1098;BA.debugLine="For kCnt = 1 To kTot";
{
final int step9 = 1;
final int limit9 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit9 ;_kcnt = _kcnt + step9 ) {
 //BA.debugLineNum = 1099;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(kCnt)";
_strkey = BA.ObjectToString(_styles.GetKeyAt(_kcnt));
 //BA.debugLineNum = 1100;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
_strvalue = BA.ObjectToString(_styles.Get((Object)(_strkey)));
 //BA.debugLineNum = 1101;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
_strline = _tostyle(_strkey,_strvalue);
 //BA.debugLineNum = 1102;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 1103;BA.debugLine="sb.Append(strLine)";
_sb.Append(_strline);
 }
};
 //BA.debugLineNum = 1105;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1106;BA.debugLine="End Sub";
return "";
}
public b4j.example.uoenowhtml  _center() throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub Center As UOENowHTML";
 //BA.debugLineNum = 350;BA.debugLine="AddClass(\"center\")";
_addclass("center");
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Tag As String";
_tag = "";
 //BA.debugLineNum = 6;BA.debugLine="Private properties As Map";
_properties = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Private Contents As List";
_contents = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private classes As Map";
_classes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public Styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private LooseAttributes As Map";
_looseattributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private DontBreak As List";
_dontbreak = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private Prefix As String";
_prefix = "";
 //BA.debugLineNum = 13;BA.debugLine="Private DoAProperClose As Boolean";
_doaproperclose = false;
 //BA.debugLineNum = 14;BA.debugLine="Private Required As Boolean";
_required = false;
 //BA.debugLineNum = 15;BA.debugLine="Private Enabled As Boolean";
_enabled = false;
 //BA.debugLineNum = 16;BA.debugLine="Private Inline As Boolean";
_inline = false;
 //BA.debugLineNum = 17;BA.debugLine="Private ReadOnly As Boolean";
_readonly = false;
 //BA.debugLineNum = 18;BA.debugLine="Private CSSRule As Map";
_cssrule = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 19;BA.debugLine="Private SingleQuote As List";
_singlequote = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="Private ParentID As String";
_parentid = "";
 //BA.debugLineNum = 21;BA.debugLine="Private SBAfter As StringBuilder";
_sbafter = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private SBBefore As StringBuilder";
_sbbefore = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Public IsImportant As Boolean";
_isimportant = false;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public boolean  _classexists(String _value) throws Exception{
 //BA.debugLineNum = 687;BA.debugLine="Sub ClassExists(value As String) As Boolean";
 //BA.debugLineNum = 688;BA.debugLine="value = value.trim";
_value = _value.trim();
 //BA.debugLineNum = 689;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 690;BA.debugLine="Return classes.ContainsKey(value)";
if (true) return _classes.ContainsKey((Object)(_value));
 };
 //BA.debugLineNum = 692;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 693;BA.debugLine="End Sub";
return false;
}
public b4j.example.uoenowhtml  _clear() throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub Clear As UOENowHTML";
 //BA.debugLineNum = 289;BA.debugLine="Contents.clear";
_contents.Clear();
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public String  _close() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1450;BA.debugLine="private Sub Close() As String";
 //BA.debugLineNum = 1451;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1452;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1453;BA.debugLine="Select Case Tag.ToLowerCase";
switch (BA.switchObjectToInt(_tag.toLowerCase(),"img","link","meta","input","source","hr","br")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 1455;BA.debugLine="DoAProperClose = False";
_doaproperclose = __c.False;
 break; }
}
;
 //BA.debugLineNum = 1457;BA.debugLine="If DoAProperClose = True Then";
if (_doaproperclose==__c.True) { 
 //BA.debugLineNum = 1458;BA.debugLine="sb.Append(\"</\")";
_sb.Append("</");
 //BA.debugLineNum = 1459;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 1460;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 };
 //BA.debugLineNum = 1462;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1463;BA.debugLine="End Sub";
return "";
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 1004;BA.debugLine="private Sub CStr(o As Object) As String";
 //BA.debugLineNum = 1005;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 1006;BA.debugLine="End Sub";
return "";
}
public String  _formattext(String _stext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rm = null;
int _ktot = 0;
int _kcnt = 0;
String _strvalue = "";
String _strrep = "";
 //BA.debugLineNum = 1251;BA.debugLine="private Sub FormatText(sText As String) As String";
 //BA.debugLineNum = 1252;BA.debugLine="Dim RM As Map";
_rm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1253;BA.debugLine="RM.Initialize";
_rm.Initialize();
 //BA.debugLineNum = 1254;BA.debugLine="RM.clear";
_rm.Clear();
 //BA.debugLineNum = 1255;BA.debugLine="RM.Put(\"{U}\", \"<ins>\")";
_rm.Put((Object)("{U}"),(Object)("<ins>"));
 //BA.debugLineNum = 1256;BA.debugLine="RM.Put(\"{/U}\", \"</ins>\")";
_rm.Put((Object)("{/U}"),(Object)("</ins>"));
 //BA.debugLineNum = 1257;BA.debugLine="RM.Put(\"¢\",\"&cent;\")";
_rm.Put((Object)("¢"),(Object)("&cent;"));
 //BA.debugLineNum = 1258;BA.debugLine="RM.put(\"£\",\"&pound;\")";
_rm.Put((Object)("£"),(Object)("&pound;"));
 //BA.debugLineNum = 1259;BA.debugLine="RM.Put(\"{SUP}\", \"<sup>\")";
_rm.Put((Object)("{SUP}"),(Object)("<sup>"));
 //BA.debugLineNum = 1260;BA.debugLine="RM.Put(\"{/SUP}\", \"</sup>\")";
_rm.Put((Object)("{/SUP}"),(Object)("</sup>"));
 //BA.debugLineNum = 1261;BA.debugLine="RM.Put(\"¥\",\"&yen;\")";
_rm.Put((Object)("¥"),(Object)("&yen;"));
 //BA.debugLineNum = 1262;BA.debugLine="RM.Put(\"€\",\"&euro;\")";
_rm.Put((Object)("€"),(Object)("&euro;"));
 //BA.debugLineNum = 1263;BA.debugLine="RM.put(\"©\",\"&copy;\")";
_rm.Put((Object)("©"),(Object)("&copy;"));
 //BA.debugLineNum = 1264;BA.debugLine="RM.Put(\"®\",\"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
 //BA.debugLineNum = 1265;BA.debugLine="RM.Put(\"{POUND}\",\"&pound;\")";
_rm.Put((Object)("{POUND}"),(Object)("&pound;"));
 //BA.debugLineNum = 1266;BA.debugLine="RM.Put(\"{/B}\", \"</b>\")";
_rm.Put((Object)("{/B}"),(Object)("</b>"));
 //BA.debugLineNum = 1267;BA.debugLine="RM.Put(\"{I}\", \"<i>\")";
_rm.Put((Object)("{I}"),(Object)("<i>"));
 //BA.debugLineNum = 1268;BA.debugLine="RM.Put(\"{YEN}\",\"&yen;\")";
_rm.Put((Object)("{YEN}"),(Object)("&yen;"));
 //BA.debugLineNum = 1269;BA.debugLine="RM.Put(\"{EURO}\",\"&euro;\")";
_rm.Put((Object)("{EURO}"),(Object)("&euro;"));
 //BA.debugLineNum = 1270;BA.debugLine="RM.Put(\"{CODE}\",\"<code>\")";
_rm.Put((Object)("{CODE}"),(Object)("<code>"));
 //BA.debugLineNum = 1271;BA.debugLine="RM.Put(\"{/CODE}\",\"</code>\")";
_rm.Put((Object)("{/CODE}"),(Object)("</code>"));
 //BA.debugLineNum = 1272;BA.debugLine="RM.put(\"{COPYRIGHT}\",\"&copy;\")";
_rm.Put((Object)("{COPYRIGHT}"),(Object)("&copy;"));
 //BA.debugLineNum = 1273;BA.debugLine="RM.Put(\"{REGISTERED}\",\"&reg;\")";
_rm.Put((Object)("{REGISTERED}"),(Object)("&reg;"));
 //BA.debugLineNum = 1274;BA.debugLine="RM.Put(\"®\", \"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
 //BA.debugLineNum = 1275;BA.debugLine="RM.Put(\"{B}\", \"<b>\")";
_rm.Put((Object)("{B}"),(Object)("<b>"));
 //BA.debugLineNum = 1276;BA.debugLine="RM.Put(\"{SMALL}\", \"<small>\")";
_rm.Put((Object)("{SMALL}"),(Object)("<small>"));
 //BA.debugLineNum = 1277;BA.debugLine="RM.Put(\"{/SMALL}\", \"</small>\")";
_rm.Put((Object)("{/SMALL}"),(Object)("</small>"));
 //BA.debugLineNum = 1278;BA.debugLine="RM.Put(\"{EM}\", \"<em>\")";
_rm.Put((Object)("{EM}"),(Object)("<em>"));
 //BA.debugLineNum = 1279;BA.debugLine="RM.Put(\"{/EM}\", \"</em>\")";
_rm.Put((Object)("{/EM}"),(Object)("</em>"));
 //BA.debugLineNum = 1280;BA.debugLine="RM.Put(\"{MARK}\", \"<mark>\")";
_rm.Put((Object)("{MARK}"),(Object)("<mark>"));
 //BA.debugLineNum = 1281;BA.debugLine="RM.Put(\"{/MARK}\", \"</mark>\")";
_rm.Put((Object)("{/MARK}"),(Object)("</mark>"));
 //BA.debugLineNum = 1282;BA.debugLine="RM.Put(\"{/I}\", \"</i>\")";
_rm.Put((Object)("{/I}"),(Object)("</i>"));
 //BA.debugLineNum = 1283;BA.debugLine="RM.Put(\"{SUB}\", \"<sub>\")";
_rm.Put((Object)("{SUB}"),(Object)("<sub>"));
 //BA.debugLineNum = 1284;BA.debugLine="RM.Put(\"{/SUB}\", \"</sub>\")";
_rm.Put((Object)("{/SUB}"),(Object)("</sub>"));
 //BA.debugLineNum = 1285;BA.debugLine="RM.Put(\"{BR}\", \"<br/>\")";
_rm.Put((Object)("{BR}"),(Object)("<br/>"));
 //BA.debugLineNum = 1286;BA.debugLine="RM.Put(\"{WBR}\",\"<wbr>\")";
_rm.Put((Object)("{WBR}"),(Object)("<wbr>"));
 //BA.debugLineNum = 1287;BA.debugLine="RM.Put(\"{STRONG}\", \"<strong>\")";
_rm.Put((Object)("{STRONG}"),(Object)("<strong>"));
 //BA.debugLineNum = 1288;BA.debugLine="RM.Put(\"{/STRONG}\", \"</strong>\")";
_rm.Put((Object)("{/STRONG}"),(Object)("</strong>"));
 //BA.debugLineNum = 1289;BA.debugLine="RM.Put(\"{NBSP}\", \"&nbsp;\")";
_rm.Put((Object)("{NBSP}"),(Object)("&nbsp;"));
 //BA.debugLineNum = 1290;BA.debugLine="RM.Put(\"“\",\"\")";
_rm.Put((Object)("“"),(Object)(""));
 //BA.debugLineNum = 1291;BA.debugLine="RM.Put(\"”\",\"\")";
_rm.Put((Object)("”"),(Object)(""));
 //BA.debugLineNum = 1292;BA.debugLine="RM.Put(\"’\",\"'\")";
_rm.Put((Object)("’"),(Object)("'"));
 //BA.debugLineNum = 1293;BA.debugLine="Dim kTot As Int = RM.Size - 1";
_ktot = (int) (_rm.getSize()-1);
 //BA.debugLineNum = 1294;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 1295;BA.debugLine="For kCnt = 0 To kTot";
{
final int step44 = 1;
final int limit44 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit44 ;_kcnt = _kcnt + step44 ) {
 //BA.debugLineNum = 1296;BA.debugLine="Dim strValue As String = RM.GetKeyAt(kCnt)";
_strvalue = BA.ObjectToString(_rm.GetKeyAt(_kcnt));
 //BA.debugLineNum = 1297;BA.debugLine="Dim strRep As String = RM.Get(strValue)";
_strrep = BA.ObjectToString(_rm.Get((Object)(_strvalue)));
 //BA.debugLineNum = 1298;BA.debugLine="sText = sText.Replace(strValue, strRep)";
_stext = _stext.replace(_strvalue,_strrep);
 }
};
 //BA.debugLineNum = 1300;BA.debugLine="Return sText";
if (true) return _stext;
 //BA.debugLineNum = 1301;BA.debugLine="End Sub";
return "";
}
public String  _getattr(String _attr) throws Exception{
 //BA.debugLineNum = 1466;BA.debugLine="Sub GetAttr(attr As String) As String";
 //BA.debugLineNum = 1467;BA.debugLine="attr = attr.tolowercase";
_attr = _attr.toLowerCase();
 //BA.debugLineNum = 1468;BA.debugLine="If properties.ContainsKey(attr) Then";
if (_properties.ContainsKey((Object)(_attr))) { 
 //BA.debugLineNum = 1469;BA.debugLine="Return properties.Get(attr)";
if (true) return BA.ObjectToString(_properties.Get((Object)(_attr)));
 }else {
 //BA.debugLineNum = 1471;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1473;BA.debugLine="End Sub";
return "";
}
public String  _getattribute(String _attr) throws Exception{
 //BA.debugLineNum = 677;BA.debugLine="Sub GetAttribute(attr As String) As String";
 //BA.debugLineNum = 678;BA.debugLine="attr = attr.tolowercase";
_attr = _attr.toLowerCase();
 //BA.debugLineNum = 679;BA.debugLine="If properties.ContainsKey(attr) Then";
if (_properties.ContainsKey((Object)(_attr))) { 
 //BA.debugLineNum = 680;BA.debugLine="Return properties.Get(attr)";
if (true) return BA.ObjectToString(_properties.Get((Object)(_attr)));
 }else {
 //BA.debugLineNum = 682;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 684;BA.debugLine="End Sub";
return "";
}
public String  _getcomponentbuilder() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sout = "";
 //BA.debugLineNum = 947;BA.debugLine="private Sub GetComponentBuilder() As String";
 //BA.debugLineNum = 948;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 949;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 950;BA.debugLine="If Prefix.Length > 0 Then";
if (_prefix.length()>0) { 
 //BA.debugLineNum = 951;BA.debugLine="sb.Append(Prefix)";
_sb.Append(_prefix);
 };
 //BA.debugLineNum = 953;BA.debugLine="sb.Append(\"<\")";
_sb.Append("<");
 //BA.debugLineNum = 954;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 955;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 956;BA.debugLine="If ID.Length > 0 Then";
if (_id.length()>0) { 
 //BA.debugLineNum = 957;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
_sb.Append(_toproperty("id",_id));
 };
 //BA.debugLineNum = 959;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 //BA.debugLineNum = 960;BA.debugLine="Select Case Tag.ToLowerCase";
switch (BA.switchObjectToInt(_tag.toLowerCase(),"img","link","meta","input","source")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 //BA.debugLineNum = 962;BA.debugLine="DoAProperClose = False";
_doaproperclose = __c.False;
 break; }
}
;
 //BA.debugLineNum = 964;BA.debugLine="If DoAProperClose = True Then";
if (_doaproperclose==__c.True) { 
 //BA.debugLineNum = 965;BA.debugLine="sb.Append(\"</\")";
_sb.Append("</");
 //BA.debugLineNum = 966;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 967;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 };
 //BA.debugLineNum = 969;BA.debugLine="Dim sout As String = sb.tostring";
_sout = _sb.ToString();
 //BA.debugLineNum = 970;BA.debugLine="sout = sout.Trim";
_sout = _sout.trim();
 //BA.debugLineNum = 971;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 972;BA.debugLine="End Sub";
return "";
}
public String  _getkeys(String _delim,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _sout = "";
 //BA.debugLineNum = 1191;BA.debugLine="Sub GetKeys(Delim As String, m As Map) As String";
 //BA.debugLineNum = 1192;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1193;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1194;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1195;BA.debugLine="sb.Append(strKey).Append(Delim)";
_sb.Append(_strkey).Append(_delim);
 }
};
 //BA.debugLineNum = 1197;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
 //BA.debugLineNum = 1198;BA.debugLine="sout = RemDelim(sout,Delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 1199;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 1200;BA.debugLine="End Sub";
return "";
}
public String  _getstyleattribute(String _attr) throws Exception{
boolean _hasitem = false;
 //BA.debugLineNum = 354;BA.debugLine="Sub GetStyleAttribute(attr As String) As String";
 //BA.debugLineNum = 355;BA.debugLine="attr = attr.ToLowerCase";
_attr = _attr.toLowerCase();
 //BA.debugLineNum = 356;BA.debugLine="attr = RemDelim(attr,\":\")";
_attr = _remdelim(_attr,":");
 //BA.debugLineNum = 357;BA.debugLine="attr = attr.trim";
_attr = _attr.trim();
 //BA.debugLineNum = 358;BA.debugLine="Dim hasItem As Boolean = Styles.ContainsKey(attr)";
_hasitem = _styles.ContainsKey((Object)(_attr));
 //BA.debugLineNum = 359;BA.debugLine="If hasItem Then";
if (_hasitem) { 
 //BA.debugLineNum = 360;BA.debugLine="Return Styles.Get(attr)";
if (true) return BA.ObjectToString(_styles.Get((Object)(_attr)));
 }else {
 //BA.debugLineNum = 362;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return "";
}
public String  _getvalues(String _delim,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _sout = "";
 //BA.debugLineNum = 1203;BA.debugLine="Sub GetValues(Delim As String, m As Map) As String";
 //BA.debugLineNum = 1204;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1205;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1206;BA.debugLine="For Each strKey As String In m.values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1207;BA.debugLine="sb.Append(strKey).Append(Delim)";
_sb.Append(_strkey).Append(_delim);
 }
};
 //BA.debugLineNum = 1209;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
 //BA.debugLineNum = 1210;BA.debugLine="sout = RemDelim(sout,Delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 1211;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 1212;BA.debugLine="End Sub";
return "";
}
public String  _html() throws Exception{
String _sout = "";
 //BA.debugLineNum = 697;BA.debugLine="public Sub HTML As String";
 //BA.debugLineNum = 698;BA.debugLine="Dim sOut As String = ToString";
_sout = _tostring();
 //BA.debugLineNum = 699;BA.debugLine="Return sOut";
if (true) return _sout;
 //BA.debugLineNum = 700;BA.debugLine="End Sub";
return "";
}
public b4j.example.uoenowhtml  _initialize(anywheresoftware.b4a.BA _ba,String _elid,String _eltag) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 839;BA.debugLine="Public Sub Initialize(elID As String, eltag As Str";
 //BA.debugLineNum = 840;BA.debugLine="elID = CStr(elID)";
_elid = _cstr((Object)(_elid));
 //BA.debugLineNum = 841;BA.debugLine="IsImportant = True";
_isimportant = __c.True;
 //BA.debugLineNum = 842;BA.debugLine="SBBefore.Initialize";
_sbbefore.Initialize();
 //BA.debugLineNum = 843;BA.debugLine="SBAfter.Initialize";
_sbafter.Initialize();
 //BA.debugLineNum = 844;BA.debugLine="ID = elID.ToLowerCase";
_id = _elid.toLowerCase();
 //BA.debugLineNum = 845;BA.debugLine="properties.Initialize";
_properties.Initialize();
 //BA.debugLineNum = 846;BA.debugLine="properties.clear";
_properties.Clear();
 //BA.debugLineNum = 847;BA.debugLine="Contents.Initialize";
_contents.Initialize();
 //BA.debugLineNum = 848;BA.debugLine="Contents.clear";
_contents.Clear();
 //BA.debugLineNum = 849;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 850;BA.debugLine="Styles.clear";
_styles.Clear();
 //BA.debugLineNum = 851;BA.debugLine="classes.Initialize";
_classes.Initialize();
 //BA.debugLineNum = 852;BA.debugLine="classes.clear";
_classes.Clear();
 //BA.debugLineNum = 853;BA.debugLine="LooseAttributes.Initialize";
_looseattributes.Initialize();
 //BA.debugLineNum = 854;BA.debugLine="LooseAttributes.clear";
_looseattributes.Clear();
 //BA.debugLineNum = 855;BA.debugLine="ParentID = \"\"";
_parentid = "";
 //BA.debugLineNum = 856;BA.debugLine="DontBreak.Initialize";
_dontbreak.Initialize();
 //BA.debugLineNum = 857;BA.debugLine="DontBreak.clear";
_dontbreak.Clear();
 //BA.debugLineNum = 858;BA.debugLine="DontBreak.Add(\"li\")";
_dontbreak.Add((Object)("li"));
 //BA.debugLineNum = 859;BA.debugLine="DontBreak.Add(\"a\")";
_dontbreak.Add((Object)("a"));
 //BA.debugLineNum = 860;BA.debugLine="DontBreak.Add(\"i\")";
_dontbreak.Add((Object)("i"));
 //BA.debugLineNum = 861;BA.debugLine="DontBreak.Add(\"span\")";
_dontbreak.Add((Object)("span"));
 //BA.debugLineNum = 862;BA.debugLine="DontBreak.Add(\"img\")";
_dontbreak.Add((Object)("img"));
 //BA.debugLineNum = 863;BA.debugLine="Tag = eltag";
_tag = _eltag;
 //BA.debugLineNum = 864;BA.debugLine="Prefix = \"\"";
_prefix = "";
 //BA.debugLineNum = 865;BA.debugLine="DoAProperClose = True";
_doaproperclose = __c.True;
 //BA.debugLineNum = 866;BA.debugLine="Required = False";
_required = __c.False;
 //BA.debugLineNum = 867;BA.debugLine="Enabled = True";
_enabled = __c.True;
 //BA.debugLineNum = 868;BA.debugLine="Inline = False";
_inline = __c.False;
 //BA.debugLineNum = 869;BA.debugLine="ReadOnly = False";
_readonly = __c.False;
 //BA.debugLineNum = 870;BA.debugLine="CSSRule.Initialize";
_cssrule.Initialize();
 //BA.debugLineNum = 871;BA.debugLine="CSSRule.clear";
_cssrule.Clear();
 //BA.debugLineNum = 872;BA.debugLine="SingleQuote.Initialize";
_singlequote.Initialize();
 //BA.debugLineNum = 873;BA.debugLine="SingleQuote.clear";
_singlequote.Clear();
 //BA.debugLineNum = 874;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 875;BA.debugLine="End Sub";
return null;
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 559;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 560;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 561;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
 //BA.debugLineNum = 562;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vm")) { 
 //BA.debugLineNum = 564;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("px")) { 
 //BA.debugLineNum = 566;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("cm")) { 
 //BA.debugLineNum = 568;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("mm")) { 
 //BA.debugLineNum = 570;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("in")) { 
 //BA.debugLineNum = 572;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pt")) { 
 //BA.debugLineNum = 574;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pc")) { 
 //BA.debugLineNum = 576;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("em")) { 
 //BA.debugLineNum = 578;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ex")) { 
 //BA.debugLineNum = 580;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ch")) { 
 //BA.debugLineNum = 582;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("rem")) { 
 //BA.debugLineNum = 584;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vw")) { 
 //BA.debugLineNum = 586;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vh")) { 
 //BA.debugLineNum = 588;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmin")) { 
 //BA.debugLineNum = 590;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmax")) { 
 //BA.debugLineNum = 592;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith(";")) { 
 //BA.debugLineNum = 594;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
 //BA.debugLineNum = 596;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
 //BA.debugLineNum = 597;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+__c.SmartStringFormatter("",(Object)(_svalue))+"px");
 //BA.debugLineNum = 598;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
 //BA.debugLineNum = 599;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return "";
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
int _xpos = 0;
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 1350;BA.debugLine="private Sub MvField(sValue As String, iPosition As";
 //BA.debugLineNum = 1351;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1352;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
 //BA.debugLineNum = 1353;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
 //BA.debugLineNum = 1354;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
_mvalues = _strparse(_delimiter,_svalue);
 //BA.debugLineNum = 1355;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 1356;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
 //BA.debugLineNum = 1357;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
 //BA.debugLineNum = 1359;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 break; }
case 1: {
 //BA.debugLineNum = 1361;BA.debugLine="Return mValues.get(tValues - 1)";
if (true) return BA.ObjectToString(_mvalues.Get((int) (_tvalues-1)));
 break; }
case 2: {
 //BA.debugLineNum = 1363;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1364;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1365;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 1366;BA.debugLine="sb.Append(mValues.Get(1))";
_sb.Append(BA.ObjectToString(_mvalues.Get((int) (1))));
 //BA.debugLineNum = 1367;BA.debugLine="For startcnt = 2 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (2) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
 //BA.debugLineNum = 1368;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
 //BA.debugLineNum = 1369;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
 //BA.debugLineNum = 1371;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
 //BA.debugLineNum = 1373;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
 //BA.debugLineNum = 1374;BA.debugLine="If iPosition <= -1 Then";
if (_iposition<=-1) { 
 //BA.debugLineNum = 1375;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
 //BA.debugLineNum = 1377;BA.debugLine="If iPosition > tValues Then";
if (_iposition>_tvalues) { 
 //BA.debugLineNum = 1378;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1380;BA.debugLine="Return mValues.get(iPosition)";
if (true) return BA.ObjectToString(_mvalues.Get(_iposition));
 break; }
}
;
 //BA.debugLineNum = 1382;BA.debugLine="End Sub";
return "";
}
public String  _mvfieldfrom(String _svalue,int _iposition,String _delimiter) throws Exception{
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
boolean _ew = false;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 1123;BA.debugLine="public Sub MvFieldFrom(sValue As String, iPosition";
 //BA.debugLineNum = 1124;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1125;BA.debugLine="Dim mValues As List";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1126;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 1127;BA.debugLine="Dim ew As Boolean = sValue.EndsWith(Delimiter)";
_ew = _svalue.endsWith(_delimiter);
 //BA.debugLineNum = 1128;BA.debugLine="If ew Then";
if (_ew) { 
 //BA.debugLineNum = 1129;BA.debugLine="sValue = sValue & \" \"";
_svalue = _svalue+" ";
 };
 //BA.debugLineNum = 1131;BA.debugLine="mValues = StrParse(Delimiter, sValue)";
_mvalues = _strparse(_delimiter,_svalue);
 //BA.debugLineNum = 1132;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
 //BA.debugLineNum = 1133;BA.debugLine="If tValues < iPosition Then";
if (_tvalues<_iposition) { 
 //BA.debugLineNum = 1134;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
 //BA.debugLineNum = 1136;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1137;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1138;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 1139;BA.debugLine="sb.Append(mValues.get(iPosition))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_iposition)));
 //BA.debugLineNum = 1140;BA.debugLine="For startcnt = iPosition + 1 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (_iposition+1) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
 //BA.debugLineNum = 1141;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
 //BA.debugLineNum = 1142;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
 //BA.debugLineNum = 1144;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1145;BA.debugLine="End Sub";
return "";
}
public String  _open() throws Exception{
String _thisclass = "";
String _thisstyle = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _thisattr = "";
String _thoseloose = "";
 //BA.debugLineNum = 1148;BA.debugLine="private Sub Open() As String";
 //BA.debugLineNum = 1150;BA.debugLine="If Required = True Then SetAttrLoose(\"required\")";
if (_required==__c.True) { 
_setattrloose("required");};
 //BA.debugLineNum = 1151;BA.debugLine="If Enabled = False Then SetAttrLoose(\"disabled\")";
if (_enabled==__c.False) { 
_setattrloose("disabled");};
 //BA.debugLineNum = 1152;BA.debugLine="If Inline = True Then SetAttrLoose(\"inline\")";
if (_inline==__c.True) { 
_setattrloose("inline");};
 //BA.debugLineNum = 1153;BA.debugLine="If ReadOnly = True Then SetAttrLoose(\"readonly\")";
if (_readonly==__c.True) { 
_setattrloose("readonly");};
 //BA.debugLineNum = 1155;BA.debugLine="Dim thisClass As String = BuildClass";
_thisclass = _buildclass();
 //BA.debugLineNum = 1156;BA.debugLine="thisClass = thisClass.trim";
_thisclass = _thisclass.trim();
 //BA.debugLineNum = 1157;BA.debugLine="If thisClass.Length > 0 Then";
if (_thisclass.length()>0) { 
 //BA.debugLineNum = 1158;BA.debugLine="AddAttribute(\"class\", thisClass)";
_addattribute("class",_thisclass);
 };
 //BA.debugLineNum = 1161;BA.debugLine="Dim thisStyle As String = BuildStyle";
_thisstyle = _buildstyle();
 //BA.debugLineNum = 1162;BA.debugLine="thisStyle = thisStyle.trim";
_thisstyle = _thisstyle.trim();
 //BA.debugLineNum = 1163;BA.debugLine="If thisStyle.Length > 0 Then";
if (_thisstyle.length()>0) { 
 //BA.debugLineNum = 1164;BA.debugLine="AddAttribute(\"style\", thisStyle)";
_addattribute("style",_thisstyle);
 };
 //BA.debugLineNum = 1166;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1167;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1168;BA.debugLine="If Prefix.Length > 0 Then";
if (_prefix.length()>0) { 
 //BA.debugLineNum = 1169;BA.debugLine="sb.Append(Prefix)";
_sb.Append(_prefix);
 };
 //BA.debugLineNum = 1171;BA.debugLine="sb.Append(\"<\")";
_sb.Append("<");
 //BA.debugLineNum = 1172;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 1173;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 1174;BA.debugLine="If ID.Length > 0 Then";
if (_id.length()>0) { 
 //BA.debugLineNum = 1175;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
_sb.Append(_toproperty("id",_id));
 //BA.debugLineNum = 1176;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 };
 //BA.debugLineNum = 1179;BA.debugLine="Dim thisAttr As String = BuildAttributes";
_thisattr = _buildattributes();
 //BA.debugLineNum = 1180;BA.debugLine="thisAttr = thisAttr.Trim";
_thisattr = _thisattr.trim();
 //BA.debugLineNum = 1181;BA.debugLine="If thisAttr.Length > 0 Then";
if (_thisattr.length()>0) { 
 //BA.debugLineNum = 1182;BA.debugLine="sb.Append(thisAttr)";
_sb.Append(_thisattr);
 };
 //BA.debugLineNum = 1184;BA.debugLine="Dim thoseLoose As String = GetKeys(\" \",LooseAttri";
_thoseloose = _getkeys(" ",_looseattributes);
 //BA.debugLineNum = 1185;BA.debugLine="sb.Append(\" \").Append(thoseLoose)";
_sb.Append(" ").Append(_thoseloose);
 //BA.debugLineNum = 1186;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 //BA.debugLineNum = 1187;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1188;BA.debugLine="End Sub";
return "";
}
public String  _pointer() throws Exception{
 //BA.debugLineNum = 703;BA.debugLine="Sub Pointer As String";
 //BA.debugLineNum = 704;BA.debugLine="Return \"cursor:pointer\"";
if (true) return "cursor:pointer";
 //BA.debugLineNum = 705;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.uoenowhtml _pelement) throws Exception{
 //BA.debugLineNum = 887;BA.debugLine="Sub Pop(pElement As UOENowHTML)";
 //BA.debugLineNum = 888;BA.debugLine="pElement.AddElement(Me)";
_pelement._addelement /*b4j.example.uoenowhtml*/ ((b4j.example.uoenowhtml)(this));
 //BA.debugLineNum = 889;BA.debugLine="End Sub";
return "";
}
public String  _remdelim(String _svalue,String _delim) throws Exception{
boolean _sw = false;
int _ldelim = 0;
String _nvalue = "";
 //BA.debugLineNum = 1304;BA.debugLine="private Sub RemDelim(sValue As String, Delim As St";
 //BA.debugLineNum = 1305;BA.debugLine="Dim sw As Boolean = sValue.EndsWith(Delim)";
_sw = _svalue.endsWith(_delim);
 //BA.debugLineNum = 1306;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 1307;BA.debugLine="Dim lDelim As Int = Delim.Length";
_ldelim = _delim.length();
 //BA.debugLineNum = 1308;BA.debugLine="Dim nValue As String = sValue";
_nvalue = _svalue;
 //BA.debugLineNum = 1309;BA.debugLine="sw = nValue.EndsWith(Delim)";
_sw = _nvalue.endsWith(_delim);
 //BA.debugLineNum = 1310;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 1311;BA.debugLine="nValue = nValue.SubString2(0, nValue.Length-lDe";
_nvalue = _nvalue.substring((int) (0),(int) (_nvalue.length()-_ldelim));
 };
 //BA.debugLineNum = 1313;BA.debugLine="Return nValue";
if (true) return _nvalue;
 }else {
 //BA.debugLineNum = 1315;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 1317;BA.debugLine="End Sub";
return "";
}
public b4j.example.uoenowhtml  _removeattr(String _sname) throws Exception{
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
 //BA.debugLineNum = 912;BA.debugLine="public Sub RemoveAttr(sName As String) As UOENowHT";
 //BA.debugLineNum = 913;BA.debugLine="sName = sName.ToLowerCase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 914;BA.debugLine="sName = sName.Replace(\" \",\";\")";
_sname = _sname.replace(" ",";");
 //BA.debugLineNum = 915;BA.debugLine="Dim sItems As List = StrParse(\";\",sName)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = _strparse(";",_sname);
 //BA.debugLineNum = 916;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sitems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 917;BA.debugLine="strStyle = strStyle.trim";
_strstyle = _strstyle.trim();
 //BA.debugLineNum = 918;BA.debugLine="If properties.ContainsKey(strStyle) Then";
if (_properties.ContainsKey((Object)(_strstyle))) { 
 //BA.debugLineNum = 919;BA.debugLine="properties.Remove(strStyle)";
_properties.Remove((Object)(_strstyle));
 };
 }
};
 //BA.debugLineNum = 922;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 923;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _removeattrdata(String _sdata) throws Exception{
 //BA.debugLineNum = 892;BA.debugLine="public Sub RemoveAttrData(sData As String) As UOEN";
 //BA.debugLineNum = 893;BA.debugLine="sData = $\"data-${sData}\"$";
_sdata = ("data-"+__c.SmartStringFormatter("",(Object)(_sdata))+"");
 //BA.debugLineNum = 894;BA.debugLine="RemoveAttr(sData)";
_removeattr(_sdata);
 //BA.debugLineNum = 895;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 896;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _removeattribute(String _prop) throws Exception{
 //BA.debugLineNum = 906;BA.debugLine="Sub RemoveAttribute(prop As String) As UOENowHTML";
 //BA.debugLineNum = 907;BA.debugLine="RemoveAttr(prop)";
_removeattr(_prop);
 //BA.debugLineNum = 908;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 909;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _removeattributeoncondition(boolean _bcondition,String _prop) throws Exception{
 //BA.debugLineNum = 898;BA.debugLine="Sub RemoveAttributeOnCondition(bCondition As Boole";
 //BA.debugLineNum = 899;BA.debugLine="If bCondition Then";
if (_bcondition) { 
 //BA.debugLineNum = 900;BA.debugLine="RemoveAttr(prop)";
_removeattr(_prop);
 };
 //BA.debugLineNum = 902;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 903;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _removeclass(String _classname) throws Exception{
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
 //BA.debugLineNum = 1041;BA.debugLine="public Sub removeClass(className As String) As UOE";
 //BA.debugLineNum = 1042;BA.debugLine="className = className.Trim";
_classname = _classname.trim();
 //BA.debugLineNum = 1043;BA.debugLine="className = className.replace(\" \",\";\")";
_classname = _classname.replace(" ",";");
 //BA.debugLineNum = 1044;BA.debugLine="Dim sItems As List = StrParse(\";\",className)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = _strparse(";",_classname);
 //BA.debugLineNum = 1045;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sitems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 1046;BA.debugLine="strStyle = strStyle.Trim";
_strstyle = _strstyle.trim();
 //BA.debugLineNum = 1047;BA.debugLine="If classes.ContainsKey(strStyle) Then";
if (_classes.ContainsKey((Object)(_strstyle))) { 
 //BA.debugLineNum = 1048;BA.debugLine="classes.Remove(strStyle)";
_classes.Remove((Object)(_strstyle));
 };
 }
};
 //BA.debugLineNum = 1051;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1052;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _removeclassoncondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 738;BA.debugLine="Sub RemoveClassOnCondition(bCondition As Boolean,";
 //BA.debugLineNum = 739;BA.debugLine="If bCondition Then";
if (_bcondition) { 
 //BA.debugLineNum = 740;BA.debugLine="removeClass(sClass)";
_removeclass(_sclass);
 };
 //BA.debugLineNum = 742;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _removeclassonfalsecondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 746;BA.debugLine="Sub RemoveClassOnFalseCondition(bCondition As Bool";
 //BA.debugLineNum = 747;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 748;BA.debugLine="removeClass(sClass)";
_removeclass(_sclass);
 };
 //BA.debugLineNum = 750;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 751;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _removestyle(String _stylename) throws Exception{
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
 //BA.debugLineNum = 926;BA.debugLine="public Sub RemoveStyle(styleName As String) As UOE";
 //BA.debugLineNum = 927;BA.debugLine="styleName = styleName.Trim";
_stylename = _stylename.trim();
 //BA.debugLineNum = 928;BA.debugLine="styleName = styleName.tolowercase";
_stylename = _stylename.toLowerCase();
 //BA.debugLineNum = 929;BA.debugLine="styleName = styleName.Replace(\" \",\";\")";
_stylename = _stylename.replace(" ",";");
 //BA.debugLineNum = 930;BA.debugLine="Dim sItems As List = StrParse(\";\",styleName)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = _strparse(";",_stylename);
 //BA.debugLineNum = 931;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group5 = _sitems;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_strstyle = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 932;BA.debugLine="strStyle = strStyle.trim";
_strstyle = _strstyle.trim();
 //BA.debugLineNum = 933;BA.debugLine="If Styles.ContainsKey(strStyle) Then";
if (_styles.ContainsKey((Object)(_strstyle))) { 
 //BA.debugLineNum = 934;BA.debugLine="Styles.Remove(strStyle)";
_styles.Remove((Object)(_strstyle));
 };
 }
};
 //BA.debugLineNum = 937;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 938;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setalt(String _svalue) throws Exception{
 //BA.debugLineNum = 643;BA.debugLine="Sub SetALT(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 644;BA.debugLine="AddAttribute(\"alt\",sValue)";
_addattribute("alt",_svalue);
 //BA.debugLineNum = 645;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setattr(String _attr,String _val) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetAttr(attr As String, val As String) As UOEN";
 //BA.debugLineNum = 148;BA.debugLine="AddAttribute(attr,val)";
_addattribute(_attr,_val);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setattrdata(String _prop,String _value) throws Exception{
boolean _sw = false;
 //BA.debugLineNum = 994;BA.debugLine="Sub SetAttrData(prop As String, value As String) A";
 //BA.debugLineNum = 995;BA.debugLine="Dim sw As Boolean = prop.StartsWith(\"data-\")";
_sw = _prop.startsWith("data-");
 //BA.debugLineNum = 996;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 997;BA.debugLine="AddAttribute(prop,value)";
_addattribute(_prop,_value);
 }else {
 //BA.debugLineNum = 999;BA.debugLine="AddAttribute(\"data-\" & prop,value)";
_addattribute("data-"+_prop,_value);
 };
 //BA.debugLineNum = 1001;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1002;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setattrloose(String _value) throws Exception{
 //BA.debugLineNum = 941;BA.debugLine="Sub SetAttrLoose(value As String) As UOENowHTML";
 //BA.debugLineNum = 942;BA.debugLine="AddLooseAttribute(value)";
_addlooseattribute(_value);
 //BA.debugLineNum = 943;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 944;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setbordered(boolean _b) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetBordered(b As Boolean) As UOENowHTML   'ign";
 //BA.debugLineNum = 124;BA.debugLine="AddClass(\"bordered\")";
_addclass("bordered");
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setboxcolored(boolean _b) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetBoxColored(b As Boolean) As UOENowHTML  'ig";
 //BA.debugLineNum = 48;BA.debugLine="AddClass(\"box-colored\")";
_addclass("box-colored");
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setcircular(boolean _b) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetCircular(b As Boolean) As UOENowHTML  'igno";
 //BA.debugLineNum = 118;BA.debugLine="AddClass(\"circular\")";
_addclass("circular");
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setcode(String _stext) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 768;BA.debugLine="Sub SetCode(sText As String) As UOENowHTML";
 //BA.debugLineNum = 769;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 770;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 771;BA.debugLine="sb.Append(\"<code>\").Append(sText).Append(\"</code>";
_sb.Append("<code>").Append(_stext).Append("</code>");
 //BA.debugLineNum = 772;BA.debugLine="AddContent(sb.tostring)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 773;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 774;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setcontents(String _value) throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="public Sub SetContents(value As String) As UOENowH";
 //BA.debugLineNum = 368;BA.debugLine="Contents.Initialize";
_contents.Initialize();
 //BA.debugLineNum = 369;BA.debugLine="Contents.clear";
_contents.Clear();
 //BA.debugLineNum = 370;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 371;BA.debugLine="value = FormatText(value)";
_value = _formattext(_value);
 //BA.debugLineNum = 372;BA.debugLine="Contents.Add(value)";
_contents.Add((Object)(_value));
 };
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setcss(Object _w) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetCSS(w As Object) As UOENowHTML";
 //BA.debugLineNum = 196;BA.debugLine="AddAttribute(\"css\", w)";
_addattribute("css",BA.ObjectToString(_w));
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setdark(boolean _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetDark(b As Boolean) As UOENowHTML   'ignore";
 //BA.debugLineNum = 42;BA.debugLine="AddClass(\"dark\")";
_addclass("dark");
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetDisabled(b As Boolean) As UOENowHTML";
 //BA.debugLineNum = 160;BA.debugLine="If b Then AddLooseAttribute(\"disabled\")";
if (_b) { 
_addlooseattribute("disabled");};
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setdoublepadded(boolean _b) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetDoublePadded(b As Boolean) As UOENowHTML";
 //BA.debugLineNum = 60;BA.debugLine="AddClass(\"double-padded\")";
_addclass("double-padded");
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setelementtypeoncondition(boolean _bstatus,String _selementtype) throws Exception{
 //BA.debugLineNum = 487;BA.debugLine="Sub SetElementTypeOnCondition(bStatus As Boolean,s";
 //BA.debugLineNum = 488;BA.debugLine="If bStatus Then";
if (_bstatus) { 
 //BA.debugLineNum = 489;BA.debugLine="Tag = sElementType";
_tag = _selementtype;
 };
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setenabled(boolean _benabled) throws Exception{
 //BA.debugLineNum = 827;BA.debugLine="Sub SetEnabled(bEnabled As Boolean) As UOENowHTML";
 //BA.debugLineNum = 828;BA.debugLine="Enabled = bEnabled";
_enabled = _benabled;
 //BA.debugLineNum = 829;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 830;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _seterror(boolean _b) throws Exception{
 //BA.debugLineNum = 1529;BA.debugLine="Sub SetError(b As Boolean) As UOENowHTML  'ignore";
 //BA.debugLineNum = 1530;BA.debugLine="AddClass(\"error\")";
_addclass("error");
 //BA.debugLineNum = 1531;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1532;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setfor(String _sfor) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub SetFOR(sFor As String) As UOENowHTML";
 //BA.debugLineNum = 512;BA.debugLine="AddAttribute(\"for\",sFor)";
_addattribute("for",_sfor);
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetHeight(h As String) As UOENowHTML";
 //BA.debugLineNum = 202;BA.debugLine="AddAttribute(\"height\", h)";
_addattribute("height",_h);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setheightpx(String _height) throws Exception{
 //BA.debugLineNum = 656;BA.debugLine="Sub SetHeightPX(Height As String) As UOENowHTML";
 //BA.debugLineNum = 657;BA.debugLine="If Height <> \"\" Then";
if ((_height).equals("") == false) { 
 //BA.debugLineNum = 658;BA.debugLine="AddStyleAttribute(\"height\", MakePx(Height))";
_addstyleattribute("height",_makepx(_height));
 };
 //BA.debugLineNum = 660;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 661;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _sethref(String _value) throws Exception{
 //BA.debugLineNum = 712;BA.debugLine="Sub SetHREF(value As String) As UOENowHTML";
 //BA.debugLineNum = 713;BA.debugLine="AddAttribute(\"href\",value)";
_addattribute("href",_value);
 //BA.debugLineNum = 714;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setid(String _sid) throws Exception{
 //BA.debugLineNum = 789;BA.debugLine="Sub SetID(sID As String) As UOENowHTML";
 //BA.debugLineNum = 790;BA.debugLine="sID = sID.tolowercase";
_sid = _sid.toLowerCase();
 //BA.debugLineNum = 791;BA.debugLine="ID = sID";
_id = _sid;
 //BA.debugLineNum = 792;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setimportant(boolean _b) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetImportant(b As Boolean) As UOENowHTML";
 //BA.debugLineNum = 178;BA.debugLine="IsImportant = b";
_isimportant = _b;
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setinline(boolean _binline) throws Exception{
 //BA.debugLineNum = 821;BA.debugLine="Sub SetInline(bInline As Boolean) As UOENowHTML";
 //BA.debugLineNum = 822;BA.debugLine="Inline = bInline";
_inline = _binline;
 //BA.debugLineNum = 823;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 824;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setinverse(boolean _b) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetInverse(b As Boolean) As UOENowHTML   'igno";
 //BA.debugLineNum = 93;BA.debugLine="AddClass(\"inverse\")";
_addclass("inverse");
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setlarge(boolean _b) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetLarge(b As Boolean) As UOENowHTML";
 //BA.debugLineNum = 172;BA.debugLine="AddClassOnCondition(b, \"large\")";
_addclassoncondition(_b,"large");
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setliststylecircle() throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Sub SetListStyleCircle() As UOENowHTML";
 //BA.debugLineNum = 434;BA.debugLine="AddStyleAttribute(\"list-style-type\",\"circle\")";
_addstyleattribute("list-style-type","circle");
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setliststyledisk() throws Exception{
 //BA.debugLineNum = 438;BA.debugLine="Sub SetListStyleDisk() As UOENowHTML";
 //BA.debugLineNum = 439;BA.debugLine="AddStyleAttribute(\"list-style-type\",\"disk\")";
_addstyleattribute("list-style-type","disk");
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setliststylenone() throws Exception{
 //BA.debugLineNum = 443;BA.debugLine="Sub SetListStyleNone() As UOENowHTML";
 //BA.debugLineNum = 444;BA.debugLine="AddStyleAttribute(\"list-style-type\",\"none\")";
_addstyleattribute("list-style-type","none");
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setliststylesquare() throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub SetListStyleSquare() As UOENowHTML";
 //BA.debugLineNum = 449;BA.debugLine="AddStyleAttribute(\"list-style-type\",\"square\")";
_addstyleattribute("list-style-type","square");
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setmargin(String _marginbottom) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetMargin(MarginBottom As String) As UOENowHTM";
 //BA.debugLineNum = 232;BA.debugLine="AddStyleAttribute(\"margin\", MakePx(MarginBottom))";
_addstyleattribute("margin",_makepx(_marginbottom));
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setmarginbottom(String _marginbottom) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetMarginBottom(MarginBottom As String) As UOE";
 //BA.debugLineNum = 237;BA.debugLine="AddStyleAttribute(\"margin-bottom\", MakePx(MarginB";
_addstyleattribute("margin-bottom",_makepx(_marginbottom));
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setmarginleft(String _marginleft) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetMarginLeft(MarginLeft As String) As UOENowH";
 //BA.debugLineNum = 247;BA.debugLine="AddStyleAttribute(\"margin-left\", MakePx(MarginLef";
_addstyleattribute("margin-left",_makepx(_marginleft));
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setmarginright(String _marginright) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetMarginRight(MarginRight As String) As UOENo";
 //BA.debugLineNum = 242;BA.debugLine="AddStyleAttribute(\"margin-right\", MakePx(MarginRi";
_addstyleattribute("margin-right",_makepx(_marginright));
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setmargintop(String _margintop) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetMarginTop(MarginTop As String) As UOENowHTM";
 //BA.debugLineNum = 252;BA.debugLine="AddStyleAttribute(\"margin-top\", MakePx(MarginTop)";
_addstyleattribute("margin-top",_makepx(_margintop));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setmax(Object _m) throws Exception{
 //BA.debugLineNum = 814;BA.debugLine="Sub SetMax(m As Object) As UOENowHTML";
 //BA.debugLineNum = 815;BA.debugLine="SetAttr(\"max\", m)";
_setattr("max",BA.ObjectToString(_m));
 //BA.debugLineNum = 816;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 817;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setmedia(boolean _b) throws Exception{
 //BA.debugLineNum = 1534;BA.debugLine="Sub SetMedia(b As Boolean) As UOENowHTML   'ignore";
 //BA.debugLineNum = 1535;BA.debugLine="AddClass(\"media\")";
_addclass("media");
 //BA.debugLineNum = 1536;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1537;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setmethod(String _svalue) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetMETHOD(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 393;BA.debugLine="AddAttribute(\"method\",sValue)";
_addattribute("method",_svalue);
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setname(String _sname) throws Exception{
 //BA.debugLineNum = 523;BA.debugLine="Sub SetNAME(sName As String) As UOENowHTML";
 //BA.debugLineNum = 524;BA.debugLine="AddAttribute(\"name\",sName)";
_addattribute("name",_sname);
 //BA.debugLineNum = 525;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setpadding(String _paddingbottom) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetPadding(PaddingBottom As String) As UOENowH";
 //BA.debugLineNum = 207;BA.debugLine="AddStyleAttribute(\"padding\", MakePx(PaddingBottom";
_addstyleattribute("padding",_makepx(_paddingbottom));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setpaddingbottom(String _paddingbottom) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetPaddingBottom(PaddingBottom As String) As U";
 //BA.debugLineNum = 212;BA.debugLine="AddStyleAttribute(\"padding-bottom\", MakePx(Paddin";
_addstyleattribute("padding-bottom",_makepx(_paddingbottom));
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setpaddingleft(String _paddingleft) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetPaddingLeft(PaddingLeft As String) As UOENo";
 //BA.debugLineNum = 222;BA.debugLine="AddStyleAttribute(\"padding-left\", MakePx(PaddingL";
_addstyleattribute("padding-left",_makepx(_paddingleft));
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setpaddingright(String _paddingright) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetPaddingRight(PaddingRight As String) As UOE";
 //BA.debugLineNum = 217;BA.debugLine="AddStyleAttribute(\"padding-right\", MakePx(Padding";
_addstyleattribute("padding-right",_makepx(_paddingright));
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setpaddingtop(String _paddingtop) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetPaddingTop(PaddingTop As String) As UOENowH";
 //BA.debugLineNum = 227;BA.debugLine="AddStyleAttribute(\"padding-top\", MakePx(PaddingTo";
_addstyleattribute("padding-top",_makepx(_paddingtop));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setparentid(String _sparentid) throws Exception{
 //BA.debugLineNum = 802;BA.debugLine="Sub SetParentID(sParentID As String) As UOENowHTML";
 //BA.debugLineNum = 803;BA.debugLine="ParentID = sParentID";
_parentid = _sparentid;
 //BA.debugLineNum = 804;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 805;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setplaceholder(String _splaceholder) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetPlaceHolder(sPlaceholder As String) As UOEN";
 //BA.debugLineNum = 273;BA.debugLine="AddAttribute(\"placeholder\",sPlaceholder)";
_addattribute("placeholder",_splaceholder);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setprefix(String _sprefix) throws Exception{
 //BA.debugLineNum = 783;BA.debugLine="Sub SetPrefix(sPrefix As String) As UOENowHTML";
 //BA.debugLineNum = 784;BA.debugLine="Prefix = sPrefix";
_prefix = _sprefix;
 //BA.debugLineNum = 785;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 786;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetPrimary(b As Boolean) As UOENowHTML  'ignor";
 //BA.debugLineNum = 111;BA.debugLine="AddClass(\"primary\")";
_addclass("primary");
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setreadonly(boolean _breadonly) throws Exception{
 //BA.debugLineNum = 808;BA.debugLine="Sub SetReadOnly(bReadOnly As Boolean) As UOENowHTM";
 //BA.debugLineNum = 809;BA.debugLine="ReadOnly = bReadOnly";
_readonly = _breadonly;
 //BA.debugLineNum = 810;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 811;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setrel(String _rel) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetREL(rel As String) As UOENowHTML";
 //BA.debugLineNum = 283;BA.debugLine="AddAttribute(\"rel\", rel)";
_addattribute("rel",_rel);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setrequired(boolean _brequired) throws Exception{
 //BA.debugLineNum = 833;BA.debugLine="Sub SetRequired(bRequired As Boolean) As UOENowHTM";
 //BA.debugLineNum = 834;BA.debugLine="Required = bRequired";
_required = _brequired;
 //BA.debugLineNum = 835;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 836;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setresponsivemargin(boolean _b) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetResponsiveMargin(b As Boolean) As UOENowHTM";
 //BA.debugLineNum = 87;BA.debugLine="AddClass(\"responsive-margin\")";
_addclass("responsive-margin");
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setresponsivepadding(boolean _b) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetResponsivePadding(b As Boolean) As UOENowHT";
 //BA.debugLineNum = 80;BA.debugLine="AddClass(\"responsive-padding\")";
_addclass("responsive-padding");
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setrole(String _svalue) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub SetROLE(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 388;BA.debugLine="AddAttribute(\"role\",sValue)";
_addattribute("role",_svalue);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setrolebutton(boolean _b) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetRoleButton(b As Boolean) As UOENowHTML   'i";
 //BA.debugLineNum = 154;BA.debugLine="SetROLE(\"button\")";
_setrole("button");
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setrounded(boolean _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetRounded(b As Boolean) As UOENowHTML   'igno";
 //BA.debugLineNum = 136;BA.debugLine="AddClass(\"rounded\")";
_addclass("rounded");
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setrow(boolean _b) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetRow(b As Boolean) As UOENowHTML   'ignore";
 //BA.debugLineNum = 74;BA.debugLine="AddClass(\"row\")";
_addclass("row");
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setsecondary(boolean _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetSecondary(b As Boolean) As UOENowHTML   'ig";
 //BA.debugLineNum = 105;BA.debugLine="AddClass(\"secondary\")";
_addclass("secondary");
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setsection(boolean _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetSection(b As Boolean) As UOENowHTML   'igno";
 //BA.debugLineNum = 54;BA.debugLine="AddClass(\"section\")";
_addclass("section");
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setshadowed(boolean _b) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetShadowed(b As Boolean) As UOENowHTML  'igno";
 //BA.debugLineNum = 130;BA.debugLine="AddClass(\"shadowed\")";
_addclass("shadowed");
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setsmall(boolean _b) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetSmall(b As Boolean) As UOENowHTML";
 //BA.debugLineNum = 166;BA.debugLine="AddClassOnCondition(b, \"small\")";
_addclassoncondition(_b,"small");
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setspan(String _stext) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 26;BA.debugLine="Sub SetSpan(sText As String) As UOENowHTML";
 //BA.debugLineNum = 27;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 28;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="sb.Append(\"<span>\").Append(sText).Append(\"</span>";
_sb.Append("<span>").Append(_stext).Append("</span>");
 //BA.debugLineNum = 30;BA.debugLine="SetText(sb.ToString)";
_settext(_sb.ToString());
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setsrc(String _svalue,boolean _static) throws Exception{
String _tmpfile = "";
 //BA.debugLineNum = 631;BA.debugLine="Sub SetSRC(sValue As String, Static As Boolean) As";
 //BA.debugLineNum = 632;BA.debugLine="Dim tmpFile As String = MvField(sValue,1,\"?\")";
_tmpfile = _mvfield(_svalue,(int) (1),"?");
 //BA.debugLineNum = 633;BA.debugLine="If Static Then";
if (_static) { 
 //BA.debugLineNum = 634;BA.debugLine="sValue = tmpFile";
_svalue = _tmpfile;
 }else {
 //BA.debugLineNum = 636;BA.debugLine="sValue = tmpFile & \"?\" & DateTime.now";
_svalue = _tmpfile+"?"+BA.NumberToString(__c.DateTime.getNow());
 };
 //BA.debugLineNum = 638;BA.debugLine="AddAttribute(\"src\",sValue)";
_addattribute("src",_svalue);
 //BA.debugLineNum = 639;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 640;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetStyle(prop As String, val As String) As UOE";
 //BA.debugLineNum = 184;BA.debugLine="AddStyle(prop,val)";
_addstyle(_prop,_val);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setsublink1(boolean _b) throws Exception{
 //BA.debugLineNum = 877;BA.debugLine="Sub SetSublink1(b As Boolean) As UOENowHTML   'ign";
 //BA.debugLineNum = 878;BA.debugLine="AddClass(\"sublink-1\")";
_addclass("sublink-1");
 //BA.debugLineNum = 879;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setsublink2(boolean _b) throws Exception{
 //BA.debugLineNum = 882;BA.debugLine="Sub SetSublink2(b As Boolean) As UOENowHTML  'igno";
 //BA.debugLineNum = 883;BA.debugLine="AddClass(\"sublink-2\")";
_addclass("sublink-2");
 //BA.debugLineNum = 884;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 885;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settag(String _stag) throws Exception{
 //BA.debugLineNum = 796;BA.debugLine="Sub SetTag(sTag As String) As UOENowHTML";
 //BA.debugLineNum = 797;BA.debugLine="Tag = sTag";
_tag = _stag;
 //BA.debugLineNum = 798;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 799;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settarget(String _svalue) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetTARGET(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 307;BA.debugLine="If sValue.Trim = \"\" Then Return Me";
if ((_svalue.trim()).equals("")) { 
if (true) return (b4j.example.uoenowhtml)(this);};
 //BA.debugLineNum = 308;BA.debugLine="AddAttribute(\"target\",sValue)";
_addattribute("target",_svalue);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settargetblank(boolean _b) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetTargetBlank(b As Boolean) As UOENowHTML   '";
 //BA.debugLineNum = 313;BA.debugLine="SetTARGET(\"_blank\")";
_settarget("_blank");
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settargetparent(boolean _b) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetTargetParent(b As Boolean) As UOENowHTML";
 //BA.debugLineNum = 323;BA.debugLine="SetTARGET(\"_parent\")";
_settarget("_parent");
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settargetself(boolean _b) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetTargetSelf(b As Boolean) As UOENowHTML    '";
 //BA.debugLineNum = 318;BA.debugLine="SetTARGET(\"_self\")";
_settarget("_self");
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settargettop(boolean _b) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetTargetTop(b As Boolean) As UOENowHTML    'i";
 //BA.debugLineNum = 328;BA.debugLine="SetTARGET(\"_top\")";
_settarget("_top");
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settertiary(boolean _b) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetTertiary(b As Boolean) As UOENowHTML   'ign";
 //BA.debugLineNum = 99;BA.debugLine="AddClass(\"tertiary\")";
_addclass("tertiary");
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settext(String _stext) throws Exception{
 //BA.debugLineNum = 763;BA.debugLine="Sub SetText(sText As String) As UOENowHTML";
 //BA.debugLineNum = 764;BA.debugLine="AddContent(sText)";
_addcontent(_stext);
 //BA.debugLineNum = 765;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 766;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settitle(String _stitle) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetTITLE(stitle As String) As UOENowHTML";
 //BA.debugLineNum = 278;BA.debugLine="AddAttribute(\"title\", stitle)";
_addattribute("title",_stitle);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetToolTip(tt As String) As UOENowHTML";
 //BA.debugLineNum = 142;BA.debugLine="AddClass(\"tooltip\")";
_addclass("tooltip");
 //BA.debugLineNum = 143;BA.debugLine="SetAttr(\"aria-label\", tt)";
_setattr("aria-label",_tt);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settype(String _svalue) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Sub SetTYPE(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 529;BA.debugLine="AddAttribute(\"type\",sValue)";
_addattribute("type",_svalue);
 //BA.debugLineNum = 530;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 531;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settypelowercase() throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetTypeLowerCase() As UOENowHTML";
 //BA.debugLineNum = 418;BA.debugLine="AddAttribute(\"type\",\"a\")";
_addattribute("type","a");
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settypelowercaseroman() throws Exception{
 //BA.debugLineNum = 427;BA.debugLine="Sub SetTypeLowerCaseRoman() As UOENowHTML";
 //BA.debugLineNum = 428;BA.debugLine="AddAttribute(\"type\",\"i\")";
_addattribute("type","i");
 //BA.debugLineNum = 429;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settypenumbers() throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub SetTypeNumbers() As UOENowHTML";
 //BA.debugLineNum = 408;BA.debugLine="AddAttribute(\"type\",\"1\")";
_addattribute("type","1");
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settypeuppercase() throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetTypeUpperCase() As UOENowHTML";
 //BA.debugLineNum = 413;BA.debugLine="AddAttribute(\"type\",\"A\")";
_addattribute("type","A");
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _settypeuppercaseroman() throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub SetTypeUpperCaseRoman() As UOENowHTML";
 //BA.debugLineNum = 423;BA.debugLine="AddAttribute(\"type\",\"I\")";
_addattribute("type","I");
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setvalue(String _svalue) throws Exception{
 //BA.debugLineNum = 517;BA.debugLine="Sub SetVALUE(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 518;BA.debugLine="AddAttribute(\"value\",sValue)";
_addattribute("value",_svalue);
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setvertical(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetVertical(b As Boolean) As UOENowHTML   'ign";
 //BA.debugLineNum = 36;BA.debugLine="AddClass(\"vertical\")";
_addclass("vertical");
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setwarning(boolean _b) throws Exception{
 //BA.debugLineNum = 1524;BA.debugLine="Sub SetWarning(b As Boolean) As UOENowHTML   'igno";
 //BA.debugLineNum = 1525;BA.debugLine="AddClass(\"warning\")";
_addclass("warning");
 //BA.debugLineNum = 1526;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 1527;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetWidth(w As Object) As UOENowHTML";
 //BA.debugLineNum = 190;BA.debugLine="AddAttribute(\"width\", w)";
_addattribute("width",BA.ObjectToString(_w));
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setwidthpx(String _width) throws Exception{
 //BA.debugLineNum = 648;BA.debugLine="Sub SetWidthPX(Width As String) As UOENowHTML";
 //BA.debugLineNum = 649;BA.debugLine="If Width <> \"\" Then";
if ((_width).equals("") == false) { 
 //BA.debugLineNum = 650;BA.debugLine="AddStyleAttribute(\"width\", MakePx(Width))";
_addstyleattribute("width",_makepx(_width));
 };
 //BA.debugLineNum = 652;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _setzindex(String _zindex) throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub SetZIndex(zindex As String) As UOENowHTML";
 //BA.debugLineNum = 496;BA.debugLine="AddStyleAttribute(\"z-index\",zindex)";
_addstyleattribute("z-index",_zindex);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _strparse(String _delim,String _inputstring) throws Exception{
anywheresoftware.b4a.objects.collections.List _outlist = null;
int _commaloc = 0;
String _leftside = "";
String _rightside = "";
 //BA.debugLineNum = 1418;BA.debugLine="private Sub StrParse(Delim As String, InputString";
 //BA.debugLineNum = 1419;BA.debugLine="Dim OutList As List";
_outlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1420;BA.debugLine="Dim CommaLoc As Int";
_commaloc = 0;
 //BA.debugLineNum = 1421;BA.debugLine="OutList.Initialize";
_outlist.Initialize();
 //BA.debugLineNum = 1422;BA.debugLine="OutList.clear";
_outlist.Clear();
 //BA.debugLineNum = 1423;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 //BA.debugLineNum = 1424;BA.debugLine="Do While CommaLoc >-1";
while (_commaloc>-1) {
 //BA.debugLineNum = 1425;BA.debugLine="Dim LeftSide As String";
_leftside = "";
 //BA.debugLineNum = 1426;BA.debugLine="LeftSide= InputString.SubString2(0,CommaLoc)";
_leftside = _inputstring.substring((int) (0),_commaloc);
 //BA.debugLineNum = 1427;BA.debugLine="Dim RightSide As String";
_rightside = "";
 //BA.debugLineNum = 1428;BA.debugLine="RightSide= InputString.SubString(CommaLoc+1)";
_rightside = _inputstring.substring((int) (_commaloc+1));
 //BA.debugLineNum = 1429;BA.debugLine="OutList.Add(LeftSide)";
_outlist.Add((Object)(_leftside));
 //BA.debugLineNum = 1430;BA.debugLine="InputString=RightSide";
_inputstring = _rightside;
 //BA.debugLineNum = 1431;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 }
;
 //BA.debugLineNum = 1433;BA.debugLine="OutList.Add(InputString)";
_outlist.Add((Object)(_inputstring));
 //BA.debugLineNum = 1434;BA.debugLine="Return OutList";
if (true) return _outlist;
 //BA.debugLineNum = 1435;BA.debugLine="End Sub";
return null;
}
public String  _toproperty(String _sname,String _svalue) throws Exception{
String _script = "";
 //BA.debugLineNum = 975;BA.debugLine="private Sub ToProperty(sName As String, svalue As";
 //BA.debugLineNum = 976;BA.debugLine="sName = CStr(sName)";
_sname = _cstr((Object)(_sname));
 //BA.debugLineNum = 977;BA.debugLine="svalue = CStr(svalue)";
_svalue = _cstr((Object)(_svalue));
 //BA.debugLineNum = 978;BA.debugLine="sName = sName.Replace(\"null\",\"\")";
_sname = _sname.replace("null","");
 //BA.debugLineNum = 979;BA.debugLine="sName = sName.Replace(\"undefined\",\"\")";
_sname = _sname.replace("undefined","");
 //BA.debugLineNum = 980;BA.debugLine="svalue = svalue.Replace(\"null\",\"\")";
_svalue = _svalue.replace("null","");
 //BA.debugLineNum = 981;BA.debugLine="svalue = svalue.Replace(\"undefined\",\"\")";
_svalue = _svalue.replace("undefined","");
 //BA.debugLineNum = 982;BA.debugLine="sName = sName.Trim";
_sname = _sname.trim();
 //BA.debugLineNum = 983;BA.debugLine="svalue = svalue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 984;BA.debugLine="If sName.Length > 0 Then";
if (_sname.length()>0) { 
 //BA.debugLineNum = 985;BA.debugLine="Dim script As String = $\"${sName}='${svalue}'\"$";
_script = (""+__c.SmartStringFormatter("",(Object)(_sname))+"='"+__c.SmartStringFormatter("",(Object)(_svalue))+"'");
 //BA.debugLineNum = 986;BA.debugLine="script = script.trim";
_script = _script.trim();
 //BA.debugLineNum = 987;BA.debugLine="Return script";
if (true) return _script;
 }else {
 //BA.debugLineNum = 989;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 991;BA.debugLine="End Sub";
return "";
}
public String  _tosinglequoteproperty(String _sname,String _svalue) throws Exception{
String _script = "";
 //BA.debugLineNum = 1241;BA.debugLine="private Sub ToSingleQuoteProperty(sName As String,";
 //BA.debugLineNum = 1242;BA.debugLine="Dim script As String = $\"${sName}='${svalue}'\"$";
_script = (""+__c.SmartStringFormatter("",(Object)(_sname))+"='"+__c.SmartStringFormatter("",(Object)(_svalue))+"'");
 //BA.debugLineNum = 1243;BA.debugLine="script = script.Trim";
_script = _script.trim();
 //BA.debugLineNum = 1244;BA.debugLine="If script = \"=''\" Then";
if ((_script).equals("=''")) { 
 //BA.debugLineNum = 1245;BA.debugLine="script = \"\"";
_script = "";
 };
 //BA.debugLineNum = 1247;BA.debugLine="Return script";
if (true) return _script;
 //BA.debugLineNum = 1248;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
String _imgurl = "";
String _lnk = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strcontent = "";
String _sout = "";
 //BA.debugLineNum = 1477;BA.debugLine="public Sub ToString As String";
 //BA.debugLineNum = 1478;BA.debugLine="If ParentID <> \"\" Then";
if ((_parentid).equals("") == false) { 
 //BA.debugLineNum = 1479;BA.debugLine="ID = ParentID & ID";
_id = _parentid+_id;
 };
 //BA.debugLineNum = 1481;BA.debugLine="Select Case Tag";
switch (BA.switchObjectToInt(_tag,"img","script","link")) {
case 0: 
case 1: {
 //BA.debugLineNum = 1484;BA.debugLine="Dim imgURL As String = GetAttr(\"src\")";
_imgurl = _getattr("src");
 //BA.debugLineNum = 1485;BA.debugLine="If imgURL.Length > 0 Then";
if (_imgurl.length()>0) { 
 //BA.debugLineNum = 1486;BA.debugLine="imgURL = imgURL.tolowercase";
_imgurl = _imgurl.toLowerCase();
 };
 break; }
case 2: {
 //BA.debugLineNum = 1489;BA.debugLine="Dim lnk As String = GetAttr(\"href\")";
_lnk = _getattr("href");
 //BA.debugLineNum = 1490;BA.debugLine="If lnk.Length > 0 Then";
if (_lnk.length()>0) { 
 //BA.debugLineNum = 1491;BA.debugLine="lnk = lnk.tolowercase";
_lnk = _lnk.toLowerCase();
 };
 break; }
}
;
 //BA.debugLineNum = 1494;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1495;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1496;BA.debugLine="sb.Append(SBBefore)";
_sb.Append(BA.ObjectToString(_sbbefore));
 //BA.debugLineNum = 1497;BA.debugLine="sb.Append(Open)";
_sb.Append(_open());
 //BA.debugLineNum = 1498;BA.debugLine="For Each strContent As String In Contents";
{
final anywheresoftware.b4a.BA.IterableList group20 = _contents;
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_strcontent = BA.ObjectToString(group20.Get(index20));
 //BA.debugLineNum = 1499;BA.debugLine="If strContent.Length > 0 Then";
if (_strcontent.length()>0) { 
 //BA.debugLineNum = 1500;BA.debugLine="strContent = strContent.trim";
_strcontent = _strcontent.trim();
 //BA.debugLineNum = 1501;BA.debugLine="sb.Append(strContent.trim)";
_sb.Append(_strcontent.trim());
 };
 }
};
 //BA.debugLineNum = 1504;BA.debugLine="sb.Append(Close)";
_sb.Append(_close());
 //BA.debugLineNum = 1505;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
 //BA.debugLineNum = 1506;BA.debugLine="If DontBreak.IndexOf(Tag) <> -1 Then";
if (_dontbreak.IndexOf((Object)(_tag))!=-1) { 
 //BA.debugLineNum = 1507;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
_sout = _sout.replace(__c.CRLF,"");
 };
 //BA.debugLineNum = 1510;BA.debugLine="sout = sout & SBAfter.tostring";
_sout = _sout+_sbafter.ToString();
 //BA.debugLineNum = 1511;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
_sout = _sout.replace(__c.CRLF,"");
 //BA.debugLineNum = 1512;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 1513;BA.debugLine="End Sub";
return "";
}
public String  _tostyle(String _sname,String _value) throws Exception{
boolean _ew = false;
String _sout = "";
 //BA.debugLineNum = 1109;BA.debugLine="private Sub ToStyle(sName As String, value As Stri";
 //BA.debugLineNum = 1110;BA.debugLine="If sName.Length > 0 And value.Length > 0 Then";
if (_sname.length()>0 && _value.length()>0) { 
 //BA.debugLineNum = 1111;BA.debugLine="Dim ew As Boolean = sName.EndsWith(\":\")";
_ew = _sname.endsWith(":");
 //BA.debugLineNum = 1112;BA.debugLine="If ew Then";
if (_ew) { 
 //BA.debugLineNum = 1113;BA.debugLine="sName = MvField(sName,1,\":\")";
_sname = _mvfield(_sname,(int) (1),":");
 };
 //BA.debugLineNum = 1115;BA.debugLine="Dim sout As String = $\"${sName}:${value};\"$";
_sout = (""+__c.SmartStringFormatter("",(Object)(_sname))+":"+__c.SmartStringFormatter("",(Object)(_value))+";");
 //BA.debugLineNum = 1116;BA.debugLine="If sout = \":;\" Then sout = \"\"";
if ((_sout).equals(":;")) { 
_sout = "";};
 //BA.debugLineNum = 1117;BA.debugLine="Return sout";
if (true) return _sout;
 }else {
 //BA.debugLineNum = 1119;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1121;BA.debugLine="End Sub";
return "";
}
public b4j.example.uoenowhtml  _updateattribute(String _name,String _propvalue) throws Exception{
String _svalue = "";
 //BA.debugLineNum = 534;BA.debugLine="Sub UpdateAttribute(name As String, propValue As S";
 //BA.debugLineNum = 535;BA.debugLine="If properties.ContainsKey(name) Then";
if (_properties.ContainsKey((Object)(_name))) { 
 //BA.debugLineNum = 536;BA.debugLine="Dim svalue As String = properties.Get(name)";
_svalue = BA.ObjectToString(_properties.Get((Object)(_name)));
 //BA.debugLineNum = 537;BA.debugLine="svalue = svalue & \";\" & propValue";
_svalue = _svalue+";"+_propvalue;
 //BA.debugLineNum = 538;BA.debugLine="properties.Put(name,svalue)";
_properties.Put((Object)(_name),(Object)(_svalue));
 }else {
 //BA.debugLineNum = 540;BA.debugLine="properties.Put(name,propValue)";
_properties.Put((Object)(_name),(Object)(_propvalue));
 };
 //BA.debugLineNum = 542;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _usetheme(String _sprefix,String _themename) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub UseTheme(sPrefix As String, themeName As Strin";
 //BA.debugLineNum = 257;BA.debugLine="If themeName = \"\" Then Return Me";
if ((_themename).equals("")) { 
if (true) return (b4j.example.uoenowhtml)(this);};
 //BA.debugLineNum = 258;BA.debugLine="themeName = themeName.tolowercase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 259;BA.debugLine="If sPrefix <> \"\" And themeName <> \"\" Then";
if ((_sprefix).equals("") == false && (_themename).equals("") == false) { 
 //BA.debugLineNum = 260;BA.debugLine="AddClass($\"${sPrefix}-${themeName}\"$)";
_addclass((""+__c.SmartStringFormatter("",(Object)(_sprefix))+"-"+__c.SmartStringFormatter("",(Object)(_themename))+""));
 };
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.uoenowhtml)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.uoenowhtml  _wrap(String _wid,String _wraptype) throws Exception{
b4j.example.uoenowhtml _p = null;
 //BA.debugLineNum = 65;BA.debugLine="Sub Wrap(wid As String, wrapType As String) As UOE";
 //BA.debugLineNum = 66;BA.debugLine="Dim p As UOENowHTML";
_p = new b4j.example.uoenowhtml();
 //BA.debugLineNum = 67;BA.debugLine="p.Initialize(wid, wrapType)";
_p._initialize /*b4j.example.uoenowhtml*/ (ba,_wid,_wraptype);
 //BA.debugLineNum = 68;BA.debugLine="p.AddContent(HTML)";
_p._addcontent /*b4j.example.uoenowhtml*/ (_html());
 //BA.debugLineNum = 69;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
