package b4j.Mashy.BANanoWebix;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class uoenowhtml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebix", "b4j.Mashy.BANanoWebix.uoenowhtml", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebix.uoenowhtml.class).invoke(this, new Object[] {null});
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
public String _text = "";
public boolean _textafter = false;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sbafter = null;
public boolean _isimportant = false;
public b4j.Mashy.BANanoWebix.main _main = null;
public b4j.Mashy.BANanoWebix.uoenowhtml  _addattribute(String _skey,String _svalue) throws Exception{
 //BA.debugLineNum = 1144;BA.debugLine="public Sub AddAttribute(skey As String, svalue As";
 //BA.debugLineNum = 1145;BA.debugLine="skey = CStr(skey)";
_skey = _cstr((Object)(_skey));
 //BA.debugLineNum = 1146;BA.debugLine="svalue = CStr(svalue)";
_svalue = _cstr((Object)(_svalue));
 //BA.debugLineNum = 1147;BA.debugLine="skey = skey.Replace(\"undefined\",\"\")";
_skey = _skey.replace("undefined","");
 //BA.debugLineNum = 1148;BA.debugLine="skey = skey.Replace(\"null\",\"\")";
_skey = _skey.replace("null","");
 //BA.debugLineNum = 1149;BA.debugLine="svalue = svalue.Replace(\"undefined\",\"\")";
_svalue = _svalue.replace("undefined","");
 //BA.debugLineNum = 1150;BA.debugLine="svalue = svalue.Replace(\"null\",\"\")";
_svalue = _svalue.replace("null","");
 //BA.debugLineNum = 1151;BA.debugLine="skey = skey.trim";
_skey = _skey.trim();
 //BA.debugLineNum = 1152;BA.debugLine="svalue = svalue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1153;BA.debugLine="If skey.Length > 0 And svalue.Length > 0 Then";
if (_skey.length()>0 && _svalue.length()>0) { 
 //BA.debugLineNum = 1154;BA.debugLine="properties.Put(skey,svalue)";
_properties.Put((Object)(_skey),(Object)(_svalue));
 }else {
 //BA.debugLineNum = 1156;BA.debugLine="properties.Remove(skey)";
_properties.Remove((Object)(_skey));
 };
 //BA.debugLineNum = 1158;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 1159;BA.debugLine="End Sub";
return null;
}
public String  _addattributeifset(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub AddAttributeIfSet(prop As String, value As Str";
 //BA.debugLineNum = 86;BA.debugLine="If value <> \"\" Then";
if ((_value).equals("") == false) { 
 //BA.debugLineNum = 87;BA.debugLine="AddAttribute(prop,value)";
_addattribute(_prop,_value);
 };
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addattributeoncondition(boolean _bcondition,String _attr,String _value) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub AddAttributeOnCondition(bCondition As Boolean,";
 //BA.debugLineNum = 460;BA.debugLine="If bCondition = True Then";
if (_bcondition==__c.True) { 
 //BA.debugLineNum = 461;BA.debugLine="AddAttribute(attr,value)";
_addattribute(_attr,_value);
 };
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addclass(String _value) throws Exception{
anywheresoftware.b4a.objects.collections.List _spclasses = null;
String _strclass = "";
 //BA.debugLineNum = 1130;BA.debugLine="Sub AddClass(value As String) As UOENowHTML";
 //BA.debugLineNum = 1132;BA.debugLine="value = value.Replace(\" \",\";\")";
_value = _value.replace(" ",";");
 //BA.debugLineNum = 1133;BA.debugLine="Dim spClasses As List = StrParse(\";\",value)";
_spclasses = new anywheresoftware.b4a.objects.collections.List();
_spclasses = _strparse(";",_value);
 //BA.debugLineNum = 1134;BA.debugLine="For Each strClass As String In spClasses";
{
final anywheresoftware.b4a.BA.IterableList group3 = _spclasses;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strclass = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1135;BA.debugLine="strClass = strClass.Trim";
_strclass = _strclass.trim();
 //BA.debugLineNum = 1136;BA.debugLine="If strClass.Length > 0 Then";
if (_strclass.length()>0) { 
 //BA.debugLineNum = 1137;BA.debugLine="classes.Put(strClass,strClass)";
_classes.Put((Object)(_strclass),(Object)(_strclass));
 };
 }
};
 //BA.debugLineNum = 1140;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 1141;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addclassoncondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 513;BA.debugLine="Sub AddClassOnCondition(bCondition As Boolean, sCl";
 //BA.debugLineNum = 514;BA.debugLine="If bCondition  Then";
if (_bcondition) { 
 //BA.debugLineNum = 515;BA.debugLine="AddClass(sClass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addclassonfalsecondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 520;BA.debugLine="Sub AddClassOnFalseCondition(bCondition As Boolean";
 //BA.debugLineNum = 521;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 522;BA.debugLine="AddClass(sClass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addclassonvalue(int _ivalue,String _sclass) throws Exception{
 //BA.debugLineNum = 506;BA.debugLine="Sub AddClassOnValue(iValue As Int, sClass As Strin";
 //BA.debugLineNum = 507;BA.debugLine="If iValue > 0 Then";
if (_ivalue>0) { 
 //BA.debugLineNum = 508;BA.debugLine="AddClass(sClass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addcontent(String _value) throws Exception{
 //BA.debugLineNum = 772;BA.debugLine="public Sub AddContent(value As String) As UOENowHT";
 //BA.debugLineNum = 773;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 774;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 775;BA.debugLine="value = FormatText(value)";
_value = _formattext(_value);
 //BA.debugLineNum = 776;BA.debugLine="Contents.Add(value)";
_contents.Add((Object)(_value));
 };
 //BA.debugLineNum = 778;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 779;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addcontentafter(String _value) throws Exception{
 //BA.debugLineNum = 782;BA.debugLine="public Sub AddContentAfter(value As String) As UOE";
 //BA.debugLineNum = 783;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 784;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 785;BA.debugLine="value = FormatText(value)";
_value = _formattext(_value);
 //BA.debugLineNum = 786;BA.debugLine="SBAfter.Append(value)";
_sbafter.Append(_value);
 };
 //BA.debugLineNum = 788;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 789;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addcontentline(String _value) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="public Sub AddContentLine(value As String) As UOEN";
 //BA.debugLineNum = 195;BA.debugLine="If value <> \"\" Then";
if ((_value).equals("") == false) { 
 //BA.debugLineNum = 196;BA.debugLine="value = value.Replace(CRLF,\"\")";
_value = _value.replace(__c.CRLF,"");
 //BA.debugLineNum = 197;BA.debugLine="value = FormatText(value)";
_value = _formattext(_value);
 //BA.debugLineNum = 198;BA.debugLine="Contents.Add(value)";
_contents.Add((Object)(_value));
 };
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addcontentlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _strcontent = "";
 //BA.debugLineNum = 544;BA.debugLine="Sub AddContentList(lst As List) As UOENowHTML";
 //BA.debugLineNum = 545;BA.debugLine="For Each strContent As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcontent = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 546;BA.debugLine="AddContent(strContent)";
_addcontent(_strcontent);
 }
};
 //BA.debugLineNum = 548;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addcontentlistreverse(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _ltot = 0;
int _lcnt = 0;
String _strcontent = "";
 //BA.debugLineNum = 289;BA.debugLine="Sub AddContentListReverse(lst As List) As UOENowHT";
 //BA.debugLineNum = 290;BA.debugLine="Dim lTot As Int = lst.Size - 1";
_ltot = (int) (_lst.getSize()-1);
 //BA.debugLineNum = 291;BA.debugLine="Dim lCnt As Int";
_lcnt = 0;
 //BA.debugLineNum = 292;BA.debugLine="For lCnt = lTot To 0 Step -1";
{
final int step3 = -1;
final int limit3 = (int) (0);
_lcnt = _ltot ;
for (;_lcnt >= limit3 ;_lcnt = _lcnt + step3 ) {
 //BA.debugLineNum = 293;BA.debugLine="Dim strContent As String = lst.Get(lCnt)";
_strcontent = BA.ObjectToString(_lst.Get(_lcnt));
 //BA.debugLineNum = 294;BA.debugLine="AddContent(strContent)";
_addcontent(_strcontent);
 }
};
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addcursor() throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub AddCursor As UOENowHTML";
 //BA.debugLineNum = 497;BA.debugLine="AddStyleAttribute(\"cursor\", \"pointer\")";
_addstyleattribute("cursor","pointer");
 //BA.debugLineNum = 498;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _adddataattribute(String _attribute,String _value) throws Exception{
boolean _sw = false;
 //BA.debugLineNum = 393;BA.debugLine="Sub AddDataAttribute(attribute As String, value As";
 //BA.debugLineNum = 394;BA.debugLine="Dim sw As Boolean = attribute.StartsWith(\"data-\")";
_sw = _attribute.startsWith("data-");
 //BA.debugLineNum = 395;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 396;BA.debugLine="AddAttribute(attribute,value)";
_addattribute(_attribute,_value);
 }else {
 //BA.debugLineNum = 398;BA.debugLine="AddAttribute(\"data-\" & attribute,value)";
_addattribute("data-"+_attribute,_value);
 };
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _adddataattributeoncondition(boolean _bcondition,String _attribute,String _value) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub AddDataAttributeOnCondition(bCondition As Bool";
 //BA.debugLineNum = 404;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 };
 //BA.debugLineNum = 407;BA.debugLine="AddDataAttribute(attribute,value)";
_adddataattribute(_attribute,_value);
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addelement(b4j.Mashy.BANanoWebix.uoenowhtml _el) throws Exception{
String _scode = "";
 //BA.debugLineNum = 807;BA.debugLine="public Sub AddElement(el As UOENowHTML) As UOENowH";
 //BA.debugLineNum = 808;BA.debugLine="If el <> Null Then";
if (_el!= null) { 
 //BA.debugLineNum = 809;BA.debugLine="Dim scode As String = el.tostring";
_scode = _el._tostring /*String*/ ();
 //BA.debugLineNum = 810;BA.debugLine="AddContent(scode)";
_addcontent(_scode);
 };
 //BA.debugLineNum = 812;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addelementline(b4j.Mashy.BANanoWebix.uoenowhtml _el) throws Exception{
String _scode = "";
 //BA.debugLineNum = 174;BA.debugLine="public Sub AddElementLine(el As UOENowHTML) As UOE";
 //BA.debugLineNum = 175;BA.debugLine="If el <> Null Then";
if (_el!= null) { 
 //BA.debugLineNum = 176;BA.debugLine="Dim scode As String = el.html";
_scode = _el._html /*String*/ ();
 //BA.debugLineNum = 177;BA.debugLine="AddContent(scode)";
_addcontent(_scode);
 };
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addheading(int _ssize,String _scontent) throws Exception{
b4j.Mashy.BANanoWebix.uoenowhtml _hdr = null;
String _hkey = "";
 //BA.debugLineNum = 249;BA.debugLine="Sub AddHeading(sSize As Int, sContent As String) A";
 //BA.debugLineNum = 250;BA.debugLine="Dim hdr As UOENowHTML";
_hdr = new b4j.Mashy.BANanoWebix.uoenowhtml();
 //BA.debugLineNum = 251;BA.debugLine="Dim hKey As String = \"h\" & sSize";
_hkey = "h"+BA.NumberToString(_ssize);
 //BA.debugLineNum = 252;BA.debugLine="hdr.Initialize(\"\",hKey)";
_hdr._initialize /*b4j.Mashy.BANanoWebix.uoenowhtml*/ (ba,"",_hkey);
 //BA.debugLineNum = 253;BA.debugLine="hdr.AddContent(sContent)";
_hdr._addcontent /*b4j.Mashy.BANanoWebix.uoenowhtml*/ (_scontent);
 //BA.debugLineNum = 254;BA.debugLine="AddContent(hdr.HTML)";
_addcontent(_hdr._html /*String*/ ());
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addlooseattribute(String _value) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub AddLooseAttribute(value As String) As UOENowHT";
 //BA.debugLineNum = 344;BA.debugLine="LooseAttributes.Put(value,value)";
_looseattributes.Put((Object)(_value),(Object)(_value));
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addlooseattributeoncondition(boolean _bstatus,String _value) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub AddLooseAttributeOnCondition(bStatus As Boolea";
 //BA.debugLineNum = 336;BA.debugLine="If bStatus = True Then";
if (_bstatus==__c.True) { 
 //BA.debugLineNum = 337;BA.debugLine="AddLooseAttribute(value)";
_addlooseattribute(_value);
 };
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addlooseattributeonfalsecondition(boolean _bstatus,String _value) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub AddLooseAttributeOnFalseCondition(bStatus As B";
 //BA.debugLineNum = 269;BA.debugLine="If bStatus = False Then";
if (_bstatus==__c.False) { 
 //BA.debugLineNum = 270;BA.debugLine="AddLooseAttribute(value)";
_addlooseattribute(_value);
 };
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addparagraph(String _scontent) throws Exception{
b4j.Mashy.BANanoWebix.uoenowhtml _p = null;
 //BA.debugLineNum = 258;BA.debugLine="Sub AddParagraph(sContent As String) As UOENowHTML";
 //BA.debugLineNum = 259;BA.debugLine="Dim p As UOENowHTML";
_p = new b4j.Mashy.BANanoWebix.uoenowhtml();
 //BA.debugLineNum = 260;BA.debugLine="p.Initialize(\"\",\"p\")";
_p._initialize /*b4j.Mashy.BANanoWebix.uoenowhtml*/ (ba,"","p");
 //BA.debugLineNum = 261;BA.debugLine="p.AddContent(sContent)";
_p._addcontent /*b4j.Mashy.BANanoWebix.uoenowhtml*/ (_scontent);
 //BA.debugLineNum = 262;BA.debugLine="AddContent(p.HTML)";
_addcontent(_p._html /*String*/ ());
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addproperty(String _skey,String _svalue) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub AddProperty(sKey As String, sValue As S";
 //BA.debugLineNum = 118;BA.debugLine="AddAttribute(sKey, sValue)";
_addattribute(_skey,_svalue);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addpropertyoncondition(boolean _bcondition,String _attr,String _value) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub AddPropertyOnCondition(bCondition As Boolean,";
 //BA.debugLineNum = 110;BA.debugLine="If bCondition Then";
if (_bcondition) { 
 //BA.debugLineNum = 111;BA.debugLine="AddAttribute(attr,value)";
_addattribute(_attr,_value);
 };
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public String  _addstyle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 1066;BA.debugLine="Sub AddStyle(prop As String, value As String)";
 //BA.debugLineNum = 1067;BA.debugLine="AddStyleAttribute(prop,value)";
_addstyleattribute(_prop,_value);
 //BA.debugLineNum = 1068;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addstyleattribute(String _sprop,String _svalue) throws Exception{
 //BA.debugLineNum = 1071;BA.debugLine="Sub AddStyleAttribute(sprop As String, svalue As S";
 //BA.debugLineNum = 1072;BA.debugLine="sprop = sprop.ToLowerCase";
_sprop = _sprop.toLowerCase();
 //BA.debugLineNum = 1073;BA.debugLine="sprop = sprop.Trim";
_sprop = _sprop.trim();
 //BA.debugLineNum = 1074;BA.debugLine="svalue = svalue.Trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1076;BA.debugLine="sprop = RemDelim(sprop,\":\")";
_sprop = _remdelim(_sprop,":");
 //BA.debugLineNum = 1078;BA.debugLine="svalue = RemDelim(svalue,\";\")";
_svalue = _remdelim(_svalue,";");
 //BA.debugLineNum = 1079;BA.debugLine="sprop = sprop.Trim";
_sprop = _sprop.trim();
 //BA.debugLineNum = 1080;BA.debugLine="svalue = svalue.Trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1081;BA.debugLine="If svalue.Length > 0 And sprop.Length > 0 Then";
if (_svalue.length()>0 && _sprop.length()>0) { 
 //BA.debugLineNum = 1083;BA.debugLine="If svalue.EndsWith(\"!important\") = False Then";
if (_svalue.endsWith("!important")==__c.False) { 
 //BA.debugLineNum = 1084;BA.debugLine="If IsImportant Then";
if (_isimportant) { 
 //BA.debugLineNum = 1085;BA.debugLine="svalue = svalue & \" !important\"";
_svalue = _svalue+" !important";
 };
 };
 //BA.debugLineNum = 1089;BA.debugLine="Styles.Put(sprop, svalue)";
_styles.Put((Object)(_sprop),(Object)(_svalue));
 };
 //BA.debugLineNum = 1091;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 1092;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addstyleattributeoncondition(boolean _bcondition,String _attr,String _value) throws Exception{
 //BA.debugLineNum = 452;BA.debugLine="Sub AddStyleAttributeOnCondition(bCondition As Boo";
 //BA.debugLineNum = 453;BA.debugLine="If bCondition = True Then";
if (_bcondition==__c.True) { 
 //BA.debugLineNum = 454;BA.debugLine="AddStyleAttribute(attr,value)";
_addstyleattribute(_attr,_value);
 };
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _addstyleoncondition(boolean _bcondition,String _attribute,String _value) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub AddStyleOnCondition(bCondition As Boolean,attr";
 //BA.debugLineNum = 412;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 };
 //BA.debugLineNum = 415;BA.debugLine="AddStyle(attribute,value)";
_addstyle(_attribute,_value);
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _applystyle(String _sstyle) throws Exception{
anywheresoftware.b4a.objects.collections.List _pieces = null;
String _strpiece = "";
String _attr = "";
String _val = "";
 //BA.debugLineNum = 128;BA.debugLine="Sub ApplyStyle(sStyle As String) As UOENowHTML";
 //BA.debugLineNum = 130;BA.debugLine="sStyle = sStyle.trim";
_sstyle = _sstyle.trim();
 //BA.debugLineNum = 131;BA.debugLine="sStyle = RemDelim(sStyle,\";\")";
_sstyle = _remdelim(_sstyle,";");
 //BA.debugLineNum = 132;BA.debugLine="Dim pieces As List = StrParse(\";\",sStyle)";
_pieces = new anywheresoftware.b4a.objects.collections.List();
_pieces = _strparse(";",_sstyle);
 //BA.debugLineNum = 133;BA.debugLine="For Each strPiece As String In pieces";
{
final anywheresoftware.b4a.BA.IterableList group4 = _pieces;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strpiece = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 134;BA.debugLine="Dim attr As String = MvField(strPiece,1,\":\")";
_attr = _mvfield(_strpiece,(int) (1),":");
 //BA.debugLineNum = 135;BA.debugLine="Dim val As String = MvField(strPiece,2,\":\")";
_val = _mvfield(_strpiece,(int) (2),":");
 //BA.debugLineNum = 136;BA.debugLine="attr = attr.trim";
_attr = _attr.trim();
 //BA.debugLineNum = 137;BA.debugLine="val = val.trim";
_val = _val.trim();
 //BA.debugLineNum = 138;BA.debugLine="If attr <> \"\" Then";
if ((_attr).equals("") == false) { 
 //BA.debugLineNum = 139;BA.debugLine="AddStyleAttribute(attr,val)";
_addstyleattribute(_attr,_val);
 };
 }
};
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public String  _buildattributes() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strkey = "";
String _strvalue = "";
 //BA.debugLineNum = 961;BA.debugLine="Sub BuildAttributes As String";
 //BA.debugLineNum = 962;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 963;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 964;BA.debugLine="Dim kTot As Int = properties.Size - 1";
_ktot = (int) (_properties.getSize()-1);
 //BA.debugLineNum = 965;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 966;BA.debugLine="Dim strKey As String = properties.GetKeyAt(0)";
_strkey = BA.ObjectToString(_properties.GetKeyAt((int) (0)));
 //BA.debugLineNum = 967;BA.debugLine="Dim strValue As String = properties.Get(strKey)";
_strvalue = BA.ObjectToString(_properties.Get((Object)(_strkey)));
 //BA.debugLineNum = 968;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
if (_singlequote.IndexOf((Object)(_strkey))==-1) { 
 //BA.debugLineNum = 969;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
_sb.Append(_toproperty(_strkey,_strvalue));
 }else {
 //BA.debugLineNum = 971;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue)";
_sb.Append(_tosinglequoteproperty(_strkey,_strvalue));
 };
 //BA.debugLineNum = 973;BA.debugLine="For kCnt = 1 To kTot";
{
final int step12 = 1;
final int limit12 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit12 ;_kcnt = _kcnt + step12 ) {
 //BA.debugLineNum = 974;BA.debugLine="strKey = properties.GetKeyAt(kCnt)";
_strkey = BA.ObjectToString(_properties.GetKeyAt(_kcnt));
 //BA.debugLineNum = 975;BA.debugLine="strValue = properties.Get(strKey)";
_strvalue = BA.ObjectToString(_properties.Get((Object)(_strkey)));
 //BA.debugLineNum = 976;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 977;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
if (_singlequote.IndexOf((Object)(_strkey))==-1) { 
 //BA.debugLineNum = 978;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
_sb.Append(_toproperty(_strkey,_strvalue));
 }else {
 //BA.debugLineNum = 980;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue";
_sb.Append(_tosinglequoteproperty(_strkey,_strvalue));
 };
 }
};
 //BA.debugLineNum = 983;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 984;BA.debugLine="End Sub";
return "";
}
public String  _buildclass() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strclass = "";
 //BA.debugLineNum = 816;BA.debugLine="Sub BuildClass() As String";
 //BA.debugLineNum = 817;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 818;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 819;BA.debugLine="Dim kTot As Int = classes.Size - 1";
_ktot = (int) (_classes.getSize()-1);
 //BA.debugLineNum = 820;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 821;BA.debugLine="Dim strClass As String  = classes.GetKeyAt(0)";
_strclass = BA.ObjectToString(_classes.GetKeyAt((int) (0)));
 //BA.debugLineNum = 822;BA.debugLine="sb.Append(strClass)";
_sb.Append(_strclass);
 //BA.debugLineNum = 823;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
 //BA.debugLineNum = 824;BA.debugLine="Dim strClass As String  = classes.GetKeyAt(kCnt)";
_strclass = BA.ObjectToString(_classes.GetKeyAt(_kcnt));
 //BA.debugLineNum = 825;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 826;BA.debugLine="sb.Append(strClass)";
_sb.Append(_strclass);
 }
};
 //BA.debugLineNum = 828;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 829;BA.debugLine="End Sub";
return "";
}
public String  _buildstyle() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _kcnt = 0;
int _ktot = 0;
String _strkey = "";
String _strvalue = "";
String _strline = "";
 //BA.debugLineNum = 832;BA.debugLine="Sub BuildStyle() As String";
 //BA.debugLineNum = 833;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 834;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 835;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 836;BA.debugLine="Dim kTot As Int = Styles.Size - 1";
_ktot = (int) (_styles.getSize()-1);
 //BA.debugLineNum = 838;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(0)";
_strkey = BA.ObjectToString(_styles.GetKeyAt((int) (0)));
 //BA.debugLineNum = 839;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
_strvalue = BA.ObjectToString(_styles.Get((Object)(_strkey)));
 //BA.debugLineNum = 840;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
_strline = _tostyle(_strkey,_strvalue);
 //BA.debugLineNum = 841;BA.debugLine="sb.Append(strLine)";
_sb.Append(_strline);
 //BA.debugLineNum = 842;BA.debugLine="For kCnt = 1 To kTot";
{
final int step9 = 1;
final int limit9 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit9 ;_kcnt = _kcnt + step9 ) {
 //BA.debugLineNum = 843;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(kCnt)";
_strkey = BA.ObjectToString(_styles.GetKeyAt(_kcnt));
 //BA.debugLineNum = 844;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
_strvalue = BA.ObjectToString(_styles.Get((Object)(_strkey)));
 //BA.debugLineNum = 845;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
_strline = _tostyle(_strkey,_strvalue);
 //BA.debugLineNum = 846;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 847;BA.debugLine="sb.Append(strLine)";
_sb.Append(_strline);
 }
};
 //BA.debugLineNum = 849;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _center() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub Center As UOENowHTML";
 //BA.debugLineNum = 146;BA.debugLine="AddClass(\"center\")";
_addclass("center");
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 21;BA.debugLine="Private Text As String";
_text = "";
 //BA.debugLineNum = 22;BA.debugLine="Private TextAfter As Boolean";
_textafter = false;
 //BA.debugLineNum = 23;BA.debugLine="Private SBAfter As StringBuilder";
_sbafter = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Public IsImportant As Boolean";
_isimportant = false;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public boolean  _classexists(String _value) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub ClassExists(value As String) As Boolean";
 //BA.debugLineNum = 477;BA.debugLine="value = value.trim";
_value = _value.trim();
 //BA.debugLineNum = 478;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 479;BA.debugLine="Return classes.ContainsKey(value)";
if (true) return _classes.ContainsKey((Object)(_value));
 };
 //BA.debugLineNum = 481;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return false;
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 106;BA.debugLine="Contents.clear";
_contents.Clear();
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 1195;BA.debugLine="private Sub Close() As String";
 //BA.debugLineNum = 1196;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1197;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1198;BA.debugLine="Select Case Tag.ToLowerCase";
switch (BA.switchObjectToInt(_tag.toLowerCase(),"img","link","meta","input","source","hr","br")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 1200;BA.debugLine="DoAProperClose = False";
_doaproperclose = __c.False;
 break; }
}
;
 //BA.debugLineNum = 1202;BA.debugLine="If DoAProperClose = True Then";
if (_doaproperclose==__c.True) { 
 //BA.debugLineNum = 1203;BA.debugLine="sb.Append(\"</\")";
_sb.Append("</");
 //BA.debugLineNum = 1204;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 1205;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 };
 //BA.debugLineNum = 1207;BA.debugLine="sb.Append(CRLF)";
_sb.Append(__c.CRLF);
 //BA.debugLineNum = 1208;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1209;BA.debugLine="End Sub";
return "";
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 766;BA.debugLine="private Sub CStr(o As Object) As String";
 //BA.debugLineNum = 767;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 768;BA.debugLine="End Sub";
return "";
}
public String  _formattext(String _stext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rm = null;
int _ktot = 0;
int _kcnt = 0;
String _strvalue = "";
String _strrep = "";
 //BA.debugLineNum = 997;BA.debugLine="private Sub FormatText(sText As String) As String";
 //BA.debugLineNum = 998;BA.debugLine="Dim RM As Map";
_rm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 999;BA.debugLine="RM.Initialize";
_rm.Initialize();
 //BA.debugLineNum = 1000;BA.debugLine="RM.clear";
_rm.Clear();
 //BA.debugLineNum = 1001;BA.debugLine="RM.Put(\"{U}\", \"<ins>\")";
_rm.Put((Object)("{U}"),(Object)("<ins>"));
 //BA.debugLineNum = 1002;BA.debugLine="RM.Put(\"{/U}\", \"</ins>\")";
_rm.Put((Object)("{/U}"),(Object)("</ins>"));
 //BA.debugLineNum = 1003;BA.debugLine="RM.Put(\"¢\",\"&cent;\")";
_rm.Put((Object)("¢"),(Object)("&cent;"));
 //BA.debugLineNum = 1004;BA.debugLine="RM.put(\"£\",\"&pound;\")";
_rm.Put((Object)("£"),(Object)("&pound;"));
 //BA.debugLineNum = 1005;BA.debugLine="RM.Put(\"{SUP}\", \"<sup>\")";
_rm.Put((Object)("{SUP}"),(Object)("<sup>"));
 //BA.debugLineNum = 1006;BA.debugLine="RM.Put(\"{/SUP}\", \"</sup>\")";
_rm.Put((Object)("{/SUP}"),(Object)("</sup>"));
 //BA.debugLineNum = 1007;BA.debugLine="RM.Put(\"¥\",\"&yen;\")";
_rm.Put((Object)("¥"),(Object)("&yen;"));
 //BA.debugLineNum = 1008;BA.debugLine="RM.Put(\"€\",\"&euro;\")";
_rm.Put((Object)("€"),(Object)("&euro;"));
 //BA.debugLineNum = 1009;BA.debugLine="RM.put(\"©\",\"&copy;\")";
_rm.Put((Object)("©"),(Object)("&copy;"));
 //BA.debugLineNum = 1010;BA.debugLine="RM.Put(\"®\",\"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
 //BA.debugLineNum = 1011;BA.debugLine="RM.Put(\"{POUND}\",\"&pound;\")";
_rm.Put((Object)("{POUND}"),(Object)("&pound;"));
 //BA.debugLineNum = 1012;BA.debugLine="RM.Put(\"{/B}\", \"</b>\")";
_rm.Put((Object)("{/B}"),(Object)("</b>"));
 //BA.debugLineNum = 1013;BA.debugLine="RM.Put(\"{I}\", \"<i>\")";
_rm.Put((Object)("{I}"),(Object)("<i>"));
 //BA.debugLineNum = 1014;BA.debugLine="RM.Put(\"{YEN}\",\"&yen;\")";
_rm.Put((Object)("{YEN}"),(Object)("&yen;"));
 //BA.debugLineNum = 1015;BA.debugLine="RM.Put(\"{EURO}\",\"&euro;\")";
_rm.Put((Object)("{EURO}"),(Object)("&euro;"));
 //BA.debugLineNum = 1016;BA.debugLine="RM.Put(\"{CODE}\",\"<code>\")";
_rm.Put((Object)("{CODE}"),(Object)("<code>"));
 //BA.debugLineNum = 1017;BA.debugLine="RM.Put(\"{/CODE}\",\"</code>\")";
_rm.Put((Object)("{/CODE}"),(Object)("</code>"));
 //BA.debugLineNum = 1018;BA.debugLine="RM.put(\"{COPYRIGHT}\",\"&copy;\")";
_rm.Put((Object)("{COPYRIGHT}"),(Object)("&copy;"));
 //BA.debugLineNum = 1019;BA.debugLine="RM.Put(\"{REGISTERED}\",\"&reg;\")";
_rm.Put((Object)("{REGISTERED}"),(Object)("&reg;"));
 //BA.debugLineNum = 1020;BA.debugLine="RM.Put(\"®\", \"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
 //BA.debugLineNum = 1021;BA.debugLine="RM.Put(\"{B}\", \"<b>\")";
_rm.Put((Object)("{B}"),(Object)("<b>"));
 //BA.debugLineNum = 1022;BA.debugLine="RM.Put(\"{SMALL}\", \"<small>\")";
_rm.Put((Object)("{SMALL}"),(Object)("<small>"));
 //BA.debugLineNum = 1023;BA.debugLine="RM.Put(\"{/SMALL}\", \"</small>\")";
_rm.Put((Object)("{/SMALL}"),(Object)("</small>"));
 //BA.debugLineNum = 1024;BA.debugLine="RM.Put(\"{EM}\", \"<em>\")";
_rm.Put((Object)("{EM}"),(Object)("<em>"));
 //BA.debugLineNum = 1025;BA.debugLine="RM.Put(\"{/EM}\", \"</em>\")";
_rm.Put((Object)("{/EM}"),(Object)("</em>"));
 //BA.debugLineNum = 1026;BA.debugLine="RM.Put(\"{MARK}\", \"<mark>\")";
_rm.Put((Object)("{MARK}"),(Object)("<mark>"));
 //BA.debugLineNum = 1027;BA.debugLine="RM.Put(\"{/MARK}\", \"</mark>\")";
_rm.Put((Object)("{/MARK}"),(Object)("</mark>"));
 //BA.debugLineNum = 1028;BA.debugLine="RM.Put(\"{/I}\", \"</i>\")";
_rm.Put((Object)("{/I}"),(Object)("</i>"));
 //BA.debugLineNum = 1029;BA.debugLine="RM.Put(\"{SUB}\", \"<sub>\")";
_rm.Put((Object)("{SUB}"),(Object)("<sub>"));
 //BA.debugLineNum = 1030;BA.debugLine="RM.Put(\"{/SUB}\", \"</sub>\")";
_rm.Put((Object)("{/SUB}"),(Object)("</sub>"));
 //BA.debugLineNum = 1031;BA.debugLine="RM.Put(\"{BR}\", \"<br/>\")";
_rm.Put((Object)("{BR}"),(Object)("<br/>"));
 //BA.debugLineNum = 1032;BA.debugLine="RM.Put(\"{WBR}\",\"<wbr>\")";
_rm.Put((Object)("{WBR}"),(Object)("<wbr>"));
 //BA.debugLineNum = 1033;BA.debugLine="RM.Put(\"{STRONG}\", \"<strong>\")";
_rm.Put((Object)("{STRONG}"),(Object)("<strong>"));
 //BA.debugLineNum = 1034;BA.debugLine="RM.Put(\"{/STRONG}\", \"</strong>\")";
_rm.Put((Object)("{/STRONG}"),(Object)("</strong>"));
 //BA.debugLineNum = 1035;BA.debugLine="RM.Put(\"{NBSP}\", \"&nbsp;\")";
_rm.Put((Object)("{NBSP}"),(Object)("&nbsp;"));
 //BA.debugLineNum = 1036;BA.debugLine="RM.Put(\"“\",\"\")";
_rm.Put((Object)("“"),(Object)(""));
 //BA.debugLineNum = 1037;BA.debugLine="RM.Put(\"”\",\"\")";
_rm.Put((Object)("”"),(Object)(""));
 //BA.debugLineNum = 1038;BA.debugLine="RM.Put(\"’\",\"'\")";
_rm.Put((Object)("’"),(Object)("'"));
 //BA.debugLineNum = 1039;BA.debugLine="Dim kTot As Int = RM.Size - 1";
_ktot = (int) (_rm.getSize()-1);
 //BA.debugLineNum = 1040;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 1041;BA.debugLine="For kCnt = 0 To kTot";
{
final int step44 = 1;
final int limit44 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit44 ;_kcnt = _kcnt + step44 ) {
 //BA.debugLineNum = 1042;BA.debugLine="Dim strValue As String = RM.GetKeyAt(kCnt)";
_strvalue = BA.ObjectToString(_rm.GetKeyAt(_kcnt));
 //BA.debugLineNum = 1043;BA.debugLine="Dim strRep As String = RM.Get(strValue)";
_strrep = BA.ObjectToString(_rm.Get((Object)(_strvalue)));
 //BA.debugLineNum = 1044;BA.debugLine="sText = sText.Replace(strValue, strRep)";
_stext = _stext.replace(_strvalue,_strrep);
 }
};
 //BA.debugLineNum = 1046;BA.debugLine="Return sText";
if (true) return _stext;
 //BA.debugLineNum = 1047;BA.debugLine="End Sub";
return "";
}
public String  _getattr(String _attr) throws Exception{
 //BA.debugLineNum = 1212;BA.debugLine="Sub GetAttr(attr As String) As String";
 //BA.debugLineNum = 1213;BA.debugLine="attr = attr.tolowercase";
_attr = _attr.toLowerCase();
 //BA.debugLineNum = 1214;BA.debugLine="If properties.ContainsKey(attr) Then";
if (_properties.ContainsKey((Object)(_attr))) { 
 //BA.debugLineNum = 1215;BA.debugLine="Return properties.Get(attr)";
if (true) return BA.ObjectToString(_properties.Get((Object)(_attr)));
 }else {
 //BA.debugLineNum = 1217;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1219;BA.debugLine="End Sub";
return "";
}
public String  _getattribute(String _attr) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub GetAttribute(attr As String) As String";
 //BA.debugLineNum = 467;BA.debugLine="attr = attr.tolowercase";
_attr = _attr.toLowerCase();
 //BA.debugLineNum = 468;BA.debugLine="If properties.ContainsKey(attr) Then";
if (_properties.ContainsKey((Object)(_attr))) { 
 //BA.debugLineNum = 469;BA.debugLine="Return properties.Get(attr)";
if (true) return BA.ObjectToString(_properties.Get((Object)(_attr)));
 }else {
 //BA.debugLineNum = 471;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return "";
}
public String  _getcomponentbuilder() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sout = "";
 //BA.debugLineNum = 707;BA.debugLine="private Sub GetComponentBuilder() As String";
 //BA.debugLineNum = 708;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 709;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 710;BA.debugLine="If Prefix.Length > 0 Then";
if (_prefix.length()>0) { 
 //BA.debugLineNum = 711;BA.debugLine="sb.Append(Prefix)";
_sb.Append(_prefix);
 //BA.debugLineNum = 712;BA.debugLine="sb.Append(CRLF)";
_sb.Append(__c.CRLF);
 };
 //BA.debugLineNum = 714;BA.debugLine="sb.Append(\"<\")";
_sb.Append("<");
 //BA.debugLineNum = 715;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 716;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 717;BA.debugLine="If ID.Length > 0 Then";
if (_id.length()>0) { 
 //BA.debugLineNum = 718;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
_sb.Append(_toproperty("id",_id));
 };
 //BA.debugLineNum = 720;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 //BA.debugLineNum = 721;BA.debugLine="Select Case Tag.ToLowerCase";
switch (BA.switchObjectToInt(_tag.toLowerCase(),"img","link","meta","input","source")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 //BA.debugLineNum = 723;BA.debugLine="DoAProperClose = False";
_doaproperclose = __c.False;
 break; }
}
;
 //BA.debugLineNum = 725;BA.debugLine="If DoAProperClose = True Then";
if (_doaproperclose==__c.True) { 
 //BA.debugLineNum = 726;BA.debugLine="sb.Append(\"</\")";
_sb.Append("</");
 //BA.debugLineNum = 727;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 728;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 };
 //BA.debugLineNum = 730;BA.debugLine="sb.Append(CRLF)";
_sb.Append(__c.CRLF);
 //BA.debugLineNum = 731;BA.debugLine="Dim sout As String = sb.tostring";
_sout = _sb.ToString();
 //BA.debugLineNum = 732;BA.debugLine="sout = sout.Trim";
_sout = _sout.trim();
 //BA.debugLineNum = 733;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 734;BA.debugLine="End Sub";
return "";
}
public String  _getkeys(String _delim,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _sout = "";
 //BA.debugLineNum = 937;BA.debugLine="Sub GetKeys(Delim As String, m As Map) As String";
 //BA.debugLineNum = 938;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 939;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 940;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 941;BA.debugLine="sb.Append(strKey).Append(Delim)";
_sb.Append(_strkey).Append(_delim);
 }
};
 //BA.debugLineNum = 943;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
 //BA.debugLineNum = 944;BA.debugLine="sout = RemDelim(sout,Delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 945;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return "";
}
public String  _getstyleattribute(String _attr) throws Exception{
boolean _hasitem = false;
 //BA.debugLineNum = 150;BA.debugLine="Sub GetStyleAttribute(attr As String) As String";
 //BA.debugLineNum = 151;BA.debugLine="attr = attr.ToLowerCase";
_attr = _attr.toLowerCase();
 //BA.debugLineNum = 152;BA.debugLine="attr = RemDelim(attr,\":\")";
_attr = _remdelim(_attr,":");
 //BA.debugLineNum = 153;BA.debugLine="attr = attr.trim";
_attr = _attr.trim();
 //BA.debugLineNum = 154;BA.debugLine="Dim hasItem As Boolean = Styles.ContainsKey(attr)";
_hasitem = _styles.ContainsKey((Object)(_attr));
 //BA.debugLineNum = 155;BA.debugLine="If hasItem Then";
if (_hasitem) { 
 //BA.debugLineNum = 156;BA.debugLine="Return Styles.Get(attr)";
if (true) return BA.ObjectToString(_styles.Get((Object)(_attr)));
 }else {
 //BA.debugLineNum = 158;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _getvalues(String _delim,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _sout = "";
 //BA.debugLineNum = 949;BA.debugLine="Sub GetValues(Delim As String, m As Map) As String";
 //BA.debugLineNum = 950;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 951;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 952;BA.debugLine="For Each strKey As String In m.values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 953;BA.debugLine="sb.Append(strKey).Append(Delim)";
_sb.Append(_strkey).Append(_delim);
 }
};
 //BA.debugLineNum = 955;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
 //BA.debugLineNum = 956;BA.debugLine="sout = RemDelim(sout,Delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 957;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return "";
}
public String  _html() throws Exception{
String _sout = "";
 //BA.debugLineNum = 486;BA.debugLine="public Sub HTML As String";
 //BA.debugLineNum = 487;BA.debugLine="Dim sOut As String = ToString";
_sout = _tostring();
 //BA.debugLineNum = 488;BA.debugLine="Return sOut";
if (true) return _sout;
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _initialize(anywheresoftware.b4a.BA _ba,String _elid,String _eltag) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 609;BA.debugLine="Public Sub Initialize(elID As String, eltag As Str";
 //BA.debugLineNum = 610;BA.debugLine="IsImportant = True";
_isimportant = __c.True;
 //BA.debugLineNum = 611;BA.debugLine="SBAfter.Initialize";
_sbafter.Initialize();
 //BA.debugLineNum = 612;BA.debugLine="ID = elID.ToLowerCase";
_id = _elid.toLowerCase();
 //BA.debugLineNum = 613;BA.debugLine="properties.Initialize";
_properties.Initialize();
 //BA.debugLineNum = 614;BA.debugLine="properties.clear";
_properties.Clear();
 //BA.debugLineNum = 615;BA.debugLine="Contents.Initialize";
_contents.Initialize();
 //BA.debugLineNum = 616;BA.debugLine="Contents.clear";
_contents.Clear();
 //BA.debugLineNum = 617;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 618;BA.debugLine="Styles.clear";
_styles.Clear();
 //BA.debugLineNum = 619;BA.debugLine="classes.Initialize";
_classes.Initialize();
 //BA.debugLineNum = 620;BA.debugLine="classes.clear";
_classes.Clear();
 //BA.debugLineNum = 621;BA.debugLine="LooseAttributes.Initialize";
_looseattributes.Initialize();
 //BA.debugLineNum = 622;BA.debugLine="LooseAttributes.clear";
_looseattributes.Clear();
 //BA.debugLineNum = 623;BA.debugLine="ParentID = \"\"";
_parentid = "";
 //BA.debugLineNum = 624;BA.debugLine="DontBreak.Initialize";
_dontbreak.Initialize();
 //BA.debugLineNum = 625;BA.debugLine="DontBreak.clear";
_dontbreak.Clear();
 //BA.debugLineNum = 626;BA.debugLine="DontBreak.Add(\"li\")";
_dontbreak.Add((Object)("li"));
 //BA.debugLineNum = 627;BA.debugLine="DontBreak.Add(\"a\")";
_dontbreak.Add((Object)("a"));
 //BA.debugLineNum = 628;BA.debugLine="DontBreak.Add(\"i\")";
_dontbreak.Add((Object)("i"));
 //BA.debugLineNum = 629;BA.debugLine="DontBreak.Add(\"span\")";
_dontbreak.Add((Object)("span"));
 //BA.debugLineNum = 630;BA.debugLine="DontBreak.Add(\"img\")";
_dontbreak.Add((Object)("img"));
 //BA.debugLineNum = 631;BA.debugLine="Tag = eltag";
_tag = _eltag;
 //BA.debugLineNum = 632;BA.debugLine="Prefix = \"\"";
_prefix = "";
 //BA.debugLineNum = 633;BA.debugLine="DoAProperClose = True";
_doaproperclose = __c.True;
 //BA.debugLineNum = 634;BA.debugLine="Required = False";
_required = __c.False;
 //BA.debugLineNum = 635;BA.debugLine="Enabled = True";
_enabled = __c.True;
 //BA.debugLineNum = 636;BA.debugLine="Inline = False";
_inline = __c.False;
 //BA.debugLineNum = 637;BA.debugLine="ReadOnly = False";
_readonly = __c.False;
 //BA.debugLineNum = 638;BA.debugLine="CSSRule.Initialize";
_cssrule.Initialize();
 //BA.debugLineNum = 639;BA.debugLine="CSSRule.clear";
_cssrule.Clear();
 //BA.debugLineNum = 640;BA.debugLine="SingleQuote.Initialize";
_singlequote.Initialize();
 //BA.debugLineNum = 641;BA.debugLine="SingleQuote.clear";
_singlequote.Clear();
 //BA.debugLineNum = 642;BA.debugLine="Text = \"\"";
_text = "";
 //BA.debugLineNum = 643;BA.debugLine="TextAfter = False";
_textafter = __c.False;
 //BA.debugLineNum = 644;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
return null;
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 349;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 350;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
 //BA.debugLineNum = 351;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vm")) { 
 //BA.debugLineNum = 353;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("px")) { 
 //BA.debugLineNum = 355;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("cm")) { 
 //BA.debugLineNum = 357;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("mm")) { 
 //BA.debugLineNum = 359;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("in")) { 
 //BA.debugLineNum = 361;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pt")) { 
 //BA.debugLineNum = 363;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pc")) { 
 //BA.debugLineNum = 365;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("em")) { 
 //BA.debugLineNum = 367;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ex")) { 
 //BA.debugLineNum = 369;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ch")) { 
 //BA.debugLineNum = 371;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("rem")) { 
 //BA.debugLineNum = 373;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vw")) { 
 //BA.debugLineNum = 375;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vh")) { 
 //BA.debugLineNum = 377;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmin")) { 
 //BA.debugLineNum = 379;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmax")) { 
 //BA.debugLineNum = 381;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith(";")) { 
 //BA.debugLineNum = 383;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
 //BA.debugLineNum = 385;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
 //BA.debugLineNum = 386;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+__c.SmartStringFormatter("",(Object)(_svalue))+"px");
 //BA.debugLineNum = 387;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
 //BA.debugLineNum = 388;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return "";
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
int _xpos = 0;
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 1095;BA.debugLine="private Sub MvField(sValue As String, iPosition As";
 //BA.debugLineNum = 1096;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1097;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
 //BA.debugLineNum = 1098;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
 //BA.debugLineNum = 1099;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
_mvalues = _strparse(_delimiter,_svalue);
 //BA.debugLineNum = 1100;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 1101;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
 //BA.debugLineNum = 1102;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
 //BA.debugLineNum = 1104;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 break; }
case 1: {
 //BA.debugLineNum = 1106;BA.debugLine="Return mValues.get(tValues - 1)";
if (true) return BA.ObjectToString(_mvalues.Get((int) (_tvalues-1)));
 break; }
case 2: {
 //BA.debugLineNum = 1108;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1109;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1110;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 1111;BA.debugLine="sb.Append(mValues.Get(1))";
_sb.Append(BA.ObjectToString(_mvalues.Get((int) (1))));
 //BA.debugLineNum = 1112;BA.debugLine="For startcnt = 2 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (2) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
 //BA.debugLineNum = 1113;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
 //BA.debugLineNum = 1114;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
 //BA.debugLineNum = 1116;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
 //BA.debugLineNum = 1118;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
 //BA.debugLineNum = 1119;BA.debugLine="If iPosition <= -1 Then";
if (_iposition<=-1) { 
 //BA.debugLineNum = 1120;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
 //BA.debugLineNum = 1122;BA.debugLine="If iPosition > tValues Then";
if (_iposition>_tvalues) { 
 //BA.debugLineNum = 1123;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1125;BA.debugLine="Return mValues.get(iPosition)";
if (true) return BA.ObjectToString(_mvalues.Get(_iposition));
 break; }
}
;
 //BA.debugLineNum = 1127;BA.debugLine="End Sub";
return "";
}
public String  _mvfieldfrom(String _svalue,int _iposition,String _delimiter) throws Exception{
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
boolean _ew = false;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 867;BA.debugLine="public Sub MvFieldFrom(sValue As String, iPosition";
 //BA.debugLineNum = 868;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 869;BA.debugLine="Dim mValues As List";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 870;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 871;BA.debugLine="Dim ew As Boolean = sValue.EndsWith(Delimiter)";
_ew = _svalue.endsWith(_delimiter);
 //BA.debugLineNum = 872;BA.debugLine="If ew Then";
if (_ew) { 
 //BA.debugLineNum = 873;BA.debugLine="sValue = sValue & \" \"";
_svalue = _svalue+" ";
 };
 //BA.debugLineNum = 875;BA.debugLine="mValues = StrParse(Delimiter, sValue)";
_mvalues = _strparse(_delimiter,_svalue);
 //BA.debugLineNum = 876;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
 //BA.debugLineNum = 877;BA.debugLine="If tValues < iPosition Then";
if (_tvalues<_iposition) { 
 //BA.debugLineNum = 878;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
 //BA.debugLineNum = 880;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 881;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 882;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 883;BA.debugLine="sb.Append(mValues.get(iPosition))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_iposition)));
 //BA.debugLineNum = 884;BA.debugLine="For startcnt = iPosition + 1 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (_iposition+1) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
 //BA.debugLineNum = 885;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
 //BA.debugLineNum = 886;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
 //BA.debugLineNum = 888;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 889;BA.debugLine="End Sub";
return "";
}
public String  _open() throws Exception{
String _thisclass = "";
String _thisstyle = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _thisattr = "";
String _thoseloose = "";
 //BA.debugLineNum = 892;BA.debugLine="private Sub Open() As String";
 //BA.debugLineNum = 894;BA.debugLine="If Required = True Then SetAttrLoose(\"required\")";
if (_required==__c.True) { 
_setattrloose("required");};
 //BA.debugLineNum = 895;BA.debugLine="If Enabled = False Then SetAttrLoose(\"disabled\")";
if (_enabled==__c.False) { 
_setattrloose("disabled");};
 //BA.debugLineNum = 896;BA.debugLine="If Inline = True Then SetAttrLoose(\"inline\")";
if (_inline==__c.True) { 
_setattrloose("inline");};
 //BA.debugLineNum = 897;BA.debugLine="If ReadOnly = True Then SetAttrLoose(\"readonly\")";
if (_readonly==__c.True) { 
_setattrloose("readonly");};
 //BA.debugLineNum = 899;BA.debugLine="Dim thisClass As String = BuildClass";
_thisclass = _buildclass();
 //BA.debugLineNum = 900;BA.debugLine="thisClass = thisClass.trim";
_thisclass = _thisclass.trim();
 //BA.debugLineNum = 901;BA.debugLine="If thisClass.Length > 0 Then";
if (_thisclass.length()>0) { 
 //BA.debugLineNum = 902;BA.debugLine="AddAttribute(\"class\", thisClass)";
_addattribute("class",_thisclass);
 };
 //BA.debugLineNum = 905;BA.debugLine="Dim thisStyle As String = BuildStyle";
_thisstyle = _buildstyle();
 //BA.debugLineNum = 906;BA.debugLine="thisStyle = thisStyle.trim";
_thisstyle = _thisstyle.trim();
 //BA.debugLineNum = 907;BA.debugLine="If thisStyle.Length > 0 Then";
if (_thisstyle.length()>0) { 
 //BA.debugLineNum = 908;BA.debugLine="AddAttribute(\"style\", thisStyle)";
_addattribute("style",_thisstyle);
 };
 //BA.debugLineNum = 910;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 911;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 912;BA.debugLine="If Prefix.Length > 0 Then";
if (_prefix.length()>0) { 
 //BA.debugLineNum = 913;BA.debugLine="sb.Append(Prefix)";
_sb.Append(_prefix);
 //BA.debugLineNum = 914;BA.debugLine="sb.Append(CRLF)";
_sb.Append(__c.CRLF);
 };
 //BA.debugLineNum = 916;BA.debugLine="sb.Append(\"<\")";
_sb.Append("<");
 //BA.debugLineNum = 917;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 918;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 919;BA.debugLine="If ID.Length > 0 Then";
if (_id.length()>0) { 
 //BA.debugLineNum = 920;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
_sb.Append(_toproperty("id",_id));
 //BA.debugLineNum = 921;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 };
 //BA.debugLineNum = 924;BA.debugLine="Dim thisAttr As String = BuildAttributes";
_thisattr = _buildattributes();
 //BA.debugLineNum = 925;BA.debugLine="thisAttr = thisAttr.Trim";
_thisattr = _thisattr.trim();
 //BA.debugLineNum = 926;BA.debugLine="If thisAttr.Length > 0 Then";
if (_thisattr.length()>0) { 
 //BA.debugLineNum = 927;BA.debugLine="sb.Append(thisAttr)";
_sb.Append(_thisattr);
 };
 //BA.debugLineNum = 929;BA.debugLine="Dim thoseLoose As String = GetKeys(\" \",LooseAttri";
_thoseloose = _getkeys(" ",_looseattributes);
 //BA.debugLineNum = 930;BA.debugLine="sb.Append(\" \").Append(thoseLoose)";
_sb.Append(" ").Append(_thoseloose);
 //BA.debugLineNum = 931;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 //BA.debugLineNum = 932;BA.debugLine="sb.Append(CRLF)";
_sb.Append(__c.CRLF);
 //BA.debugLineNum = 933;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 934;BA.debugLine="End Sub";
return "";
}
public String  _pointer() throws Exception{
 //BA.debugLineNum = 492;BA.debugLine="Sub Pointer As String";
 //BA.debugLineNum = 493;BA.debugLine="Return \"cursor:pointer\"";
if (true) return "cursor:pointer";
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.Mashy.BANanoWebix.uoenowhtml _pelement) throws Exception{
 //BA.debugLineNum = 647;BA.debugLine="Sub Pop(pElement As UOENowHTML)";
 //BA.debugLineNum = 648;BA.debugLine="pElement.AddElement(Me)";
_pelement._addelement /*b4j.Mashy.BANanoWebix.uoenowhtml*/ ((b4j.Mashy.BANanoWebix.uoenowhtml)(this));
 //BA.debugLineNum = 649;BA.debugLine="End Sub";
return "";
}
public String  _remdelim(String _svalue,String _delim) throws Exception{
boolean _sw = false;
int _ldelim = 0;
String _nvalue = "";
 //BA.debugLineNum = 1050;BA.debugLine="private Sub RemDelim(sValue As String, Delim As St";
 //BA.debugLineNum = 1051;BA.debugLine="Dim sw As Boolean = sValue.EndsWith(Delim)";
_sw = _svalue.endsWith(_delim);
 //BA.debugLineNum = 1052;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 1053;BA.debugLine="Dim lDelim As Int = Delim.Length";
_ldelim = _delim.length();
 //BA.debugLineNum = 1054;BA.debugLine="Dim nValue As String = sValue";
_nvalue = _svalue;
 //BA.debugLineNum = 1055;BA.debugLine="sw = nValue.EndsWith(Delim)";
_sw = _nvalue.endsWith(_delim);
 //BA.debugLineNum = 1056;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 1057;BA.debugLine="nValue = nValue.SubString2(0, nValue.Length-lDe";
_nvalue = _nvalue.substring((int) (0),(int) (_nvalue.length()-_ldelim));
 };
 //BA.debugLineNum = 1059;BA.debugLine="Return nValue";
if (true) return _nvalue;
 }else {
 //BA.debugLineNum = 1061;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 1063;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _removeattr(String _sname) throws Exception{
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
 //BA.debugLineNum = 672;BA.debugLine="public Sub RemoveAttr(sName As String) As UOENowHT";
 //BA.debugLineNum = 673;BA.debugLine="sName = sName.ToLowerCase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 674;BA.debugLine="sName = sName.Replace(\" \",\";\")";
_sname = _sname.replace(" ",";");
 //BA.debugLineNum = 675;BA.debugLine="Dim sItems As List = StrParse(\";\",sName)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = _strparse(";",_sname);
 //BA.debugLineNum = 676;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sitems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 677;BA.debugLine="strStyle = strStyle.trim";
_strstyle = _strstyle.trim();
 //BA.debugLineNum = 678;BA.debugLine="If properties.ContainsKey(strStyle) Then";
if (_properties.ContainsKey((Object)(_strstyle))) { 
 //BA.debugLineNum = 679;BA.debugLine="properties.Remove(strStyle)";
_properties.Remove((Object)(_strstyle));
 };
 }
};
 //BA.debugLineNum = 682;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _removeattrdata(String _sdata) throws Exception{
 //BA.debugLineNum = 652;BA.debugLine="public Sub RemoveAttrData(sData As String) As UOEN";
 //BA.debugLineNum = 653;BA.debugLine="sData = $\"data-${sData}\"$";
_sdata = ("data-"+__c.SmartStringFormatter("",(Object)(_sdata))+"");
 //BA.debugLineNum = 654;BA.debugLine="RemoveAttr(sData)";
_removeattr(_sdata);
 //BA.debugLineNum = 655;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _removeattribute(String _prop) throws Exception{
 //BA.debugLineNum = 666;BA.debugLine="Sub RemoveAttribute(prop As String) As UOENowHTML";
 //BA.debugLineNum = 667;BA.debugLine="RemoveAttr(prop)";
_removeattr(_prop);
 //BA.debugLineNum = 668;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 669;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _removeattributeoncondition(boolean _bcondition,String _prop) throws Exception{
 //BA.debugLineNum = 658;BA.debugLine="Sub RemoveAttributeOnCondition(bCondition As Boole";
 //BA.debugLineNum = 659;BA.debugLine="If bCondition Then";
if (_bcondition) { 
 //BA.debugLineNum = 660;BA.debugLine="RemoveAttr(prop)";
_removeattr(_prop);
 };
 //BA.debugLineNum = 662;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 663;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _removeclass(String _classname) throws Exception{
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
 //BA.debugLineNum = 793;BA.debugLine="public Sub removeClass(className As String) As UOE";
 //BA.debugLineNum = 794;BA.debugLine="className = className.Trim";
_classname = _classname.trim();
 //BA.debugLineNum = 795;BA.debugLine="className = className.replace(\" \",\";\")";
_classname = _classname.replace(" ",";");
 //BA.debugLineNum = 796;BA.debugLine="Dim sItems As List = StrParse(\";\",className)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = _strparse(";",_classname);
 //BA.debugLineNum = 797;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sitems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 798;BA.debugLine="strStyle = strStyle.Trim";
_strstyle = _strstyle.trim();
 //BA.debugLineNum = 799;BA.debugLine="If classes.ContainsKey(strStyle) Then";
if (_classes.ContainsKey((Object)(_strstyle))) { 
 //BA.debugLineNum = 800;BA.debugLine="classes.Remove(strStyle)";
_classes.Remove((Object)(_strstyle));
 };
 }
};
 //BA.debugLineNum = 803;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 804;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _removeclassoncondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="Sub RemoveClassOnCondition(bCondition As Boolean,";
 //BA.debugLineNum = 528;BA.debugLine="If bCondition Then";
if (_bcondition) { 
 //BA.debugLineNum = 529;BA.debugLine="removeClass(sClass)";
_removeclass(_sclass);
 };
 //BA.debugLineNum = 531;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _removeclassonfalsecondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 535;BA.debugLine="Sub RemoveClassOnFalseCondition(bCondition As Bool";
 //BA.debugLineNum = 536;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 537;BA.debugLine="removeClass(sClass)";
_removeclass(_sclass);
 };
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _removestyle(String _stylename) throws Exception{
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
 //BA.debugLineNum = 686;BA.debugLine="public Sub RemoveStyle(styleName As String) As UOE";
 //BA.debugLineNum = 687;BA.debugLine="styleName = styleName.Trim";
_stylename = _stylename.trim();
 //BA.debugLineNum = 688;BA.debugLine="styleName = styleName.tolowercase";
_stylename = _stylename.toLowerCase();
 //BA.debugLineNum = 689;BA.debugLine="styleName = styleName.Replace(\" \",\";\")";
_stylename = _stylename.replace(" ",";");
 //BA.debugLineNum = 690;BA.debugLine="Dim sItems As List = StrParse(\";\",styleName)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = _strparse(";",_stylename);
 //BA.debugLineNum = 691;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group5 = _sitems;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_strstyle = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 692;BA.debugLine="strStyle = strStyle.trim";
_strstyle = _strstyle.trim();
 //BA.debugLineNum = 693;BA.debugLine="If Styles.ContainsKey(strStyle) Then";
if (_styles.ContainsKey((Object)(_strstyle))) { 
 //BA.debugLineNum = 694;BA.debugLine="Styles.Remove(strStyle)";
_styles.Remove((Object)(_strstyle));
 };
 }
};
 //BA.debugLineNum = 697;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 698;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setalt(String _svalue) throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Sub SetALT(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 433;BA.debugLine="AddAttribute(\"alt\",sValue)";
_addattribute("alt",_svalue);
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setattrdata(String _prop,String _value) throws Exception{
boolean _sw = false;
 //BA.debugLineNum = 756;BA.debugLine="Sub SetAttrData(prop As String, value As String) A";
 //BA.debugLineNum = 757;BA.debugLine="Dim sw As Boolean = prop.StartsWith(\"data-\")";
_sw = _prop.startsWith("data-");
 //BA.debugLineNum = 758;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 759;BA.debugLine="AddAttribute(prop,value)";
_addattribute(_prop,_value);
 }else {
 //BA.debugLineNum = 761;BA.debugLine="AddAttribute(\"data-\" & prop,value)";
_addattribute("data-"+_prop,_value);
 };
 //BA.debugLineNum = 763;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 764;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setattrloose(String _value) throws Exception{
 //BA.debugLineNum = 701;BA.debugLine="Sub SetAttrLoose(value As String) As UOENowHTML";
 //BA.debugLineNum = 702;BA.debugLine="AddLooseAttribute(value)";
_addlooseattribute(_value);
 //BA.debugLineNum = 703;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 704;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setcontents(String _value) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="public Sub SetContents(value As String) As UOENowH";
 //BA.debugLineNum = 164;BA.debugLine="Contents.Initialize";
_contents.Initialize();
 //BA.debugLineNum = 165;BA.debugLine="Contents.clear";
_contents.Clear();
 //BA.debugLineNum = 166;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 167;BA.debugLine="value = FormatText(value)";
_value = _formattext(_value);
 //BA.debugLineNum = 168;BA.debugLine="Contents.Add(value)";
_contents.Add((Object)(_value));
 };
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setelementtypeoncondition(boolean _bstatus,String _selementtype) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetElementTypeOnCondition(bStatus As Boolean,s";
 //BA.debugLineNum = 277;BA.debugLine="If bStatus Then";
if (_bstatus) { 
 //BA.debugLineNum = 278;BA.debugLine="Tag = sElementType";
_tag = _selementtype;
 };
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setenabled(boolean _benabled) throws Exception{
 //BA.debugLineNum = 597;BA.debugLine="Sub SetEnabled(bEnabled As Boolean) As UOENowHTML";
 //BA.debugLineNum = 598;BA.debugLine="Enabled = bEnabled";
_enabled = _benabled;
 //BA.debugLineNum = 599;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setfor(String _sfor) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetFOR(sFor As String) As UOENowHTML";
 //BA.debugLineNum = 301;BA.debugLine="AddAttribute(\"for\",sFor)";
_addattribute("for",_sfor);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetHeight(h As String) As UOENowHTML";
 //BA.debugLineNum = 41;BA.debugLine="AddAttribute(\"height\", h)";
_addattribute("height",_h);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setheightpx(String _height) throws Exception{
 //BA.debugLineNum = 445;BA.debugLine="Sub SetHeightPX(Height As String) As UOENowHTML";
 //BA.debugLineNum = 446;BA.debugLine="If Height <> \"\" Then";
if ((_height).equals("") == false) { 
 //BA.debugLineNum = 447;BA.debugLine="AddStyleAttribute(\"height\", MakePx(Height))";
_addstyleattribute("height",_makepx(_height));
 };
 //BA.debugLineNum = 449;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _sethref(String _value) throws Exception{
 //BA.debugLineNum = 501;BA.debugLine="Sub SetHREF(value As String) As UOENowHTML";
 //BA.debugLineNum = 502;BA.debugLine="AddAttribute(\"href\",value)";
_addattribute("href",_value);
 //BA.debugLineNum = 503;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setid(String _sid) throws Exception{
 //BA.debugLineNum = 566;BA.debugLine="Sub SetID(sID As String) As UOENowHTML";
 //BA.debugLineNum = 567;BA.debugLine="sID = sID.tolowercase";
_sid = _sid.toLowerCase();
 //BA.debugLineNum = 568;BA.debugLine="ID = sID";
_id = _sid;
 //BA.debugLineNum = 569;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setinline(boolean _binline) throws Exception{
 //BA.debugLineNum = 591;BA.debugLine="Sub SetInline(bInline As Boolean) As UOENowHTML";
 //BA.debugLineNum = 592;BA.debugLine="Inline = bInline";
_inline = _binline;
 //BA.debugLineNum = 593;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setliststylecircle() throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetListStyleCircle() As UOENowHTML";
 //BA.debugLineNum = 230;BA.debugLine="AddStyleAttribute(\"list-style-type\",\"circle\")";
_addstyleattribute("list-style-type","circle");
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setliststyledisk() throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetListStyleDisk() As UOENowHTML";
 //BA.debugLineNum = 235;BA.debugLine="AddStyleAttribute(\"list-style-type\",\"disk\")";
_addstyleattribute("list-style-type","disk");
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setliststylenone() throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetListStyleNone() As UOENowHTML";
 //BA.debugLineNum = 240;BA.debugLine="AddStyleAttribute(\"list-style-type\",\"none\")";
_addstyleattribute("list-style-type","none");
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setliststylesquare() throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetListStyleSquare() As UOENowHTML";
 //BA.debugLineNum = 245;BA.debugLine="AddStyleAttribute(\"list-style-type\",\"square\")";
_addstyleattribute("list-style-type","square");
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public String  _setmarginbottom(String _marginbottom) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMarginBottom(MarginBottom As String)";
 //BA.debugLineNum = 62;BA.debugLine="AddStyleAttribute(\"margin-bottom\", MakePx(MarginB";
_addstyleattribute("margin-bottom",_makepx(_marginbottom));
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _setmarginleft(String _marginleft) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetMarginLeft(MarginLeft As String)";
 //BA.debugLineNum = 70;BA.debugLine="AddStyleAttribute(\"margin-left\", MakePx(MarginLef";
_addstyleattribute("margin-left",_makepx(_marginleft));
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _setmarginright(String _marginright) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetMarginRight(MarginRight As String)";
 //BA.debugLineNum = 66;BA.debugLine="AddStyleAttribute(\"margin-right\", MakePx(MarginRi";
_addstyleattribute("margin-right",_makepx(_marginright));
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _setmargintop(String _margintop) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetMarginTop(MarginTop As String)";
 //BA.debugLineNum = 74;BA.debugLine="AddStyleAttribute(\"margin-top\", MakePx(MarginTop)";
_addstyleattribute("margin-top",_makepx(_margintop));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setmethod(String _svalue) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetMETHOD(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 189;BA.debugLine="AddAttribute(\"method\",sValue)";
_addattribute("method",_svalue);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setname(String _sname) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetNAME(sName As String) As UOENowHTML";
 //BA.debugLineNum = 313;BA.debugLine="AddAttribute(\"name\",sName)";
_addattribute("name",_sname);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public String  _setpaddingbottom(String _paddingbottom) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetPaddingBottom(PaddingBottom As String)";
 //BA.debugLineNum = 46;BA.debugLine="AddStyleAttribute(\"padding-bottom\", MakePx(Paddin";
_addstyleattribute("padding-bottom",_makepx(_paddingbottom));
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _setpaddingleft(String _paddingleft) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetPaddingLeft(PaddingLeft As String)";
 //BA.debugLineNum = 54;BA.debugLine="AddStyleAttribute(\"padding-left\", MakePx(PaddingL";
_addstyleattribute("padding-left",_makepx(_paddingleft));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _setpaddingright(String _paddingright) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetPaddingRight(PaddingRight As String)";
 //BA.debugLineNum = 50;BA.debugLine="AddStyleAttribute(\"padding-right\", MakePx(Padding";
_addstyleattribute("padding-right",_makepx(_paddingright));
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _setpaddingtop(String _paddingtop) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetPaddingTop(PaddingTop As String)";
 //BA.debugLineNum = 58;BA.debugLine="AddStyleAttribute(\"padding-top\", MakePx(PaddingTo";
_addstyleattribute("padding-top",_makepx(_paddingtop));
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setparentid(String _sparentid) throws Exception{
 //BA.debugLineNum = 579;BA.debugLine="Sub SetParentID(sParentID As String) As UOENowHTML";
 //BA.debugLineNum = 580;BA.debugLine="ParentID = sParentID";
_parentid = _sparentid;
 //BA.debugLineNum = 581;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setplaceholder(String _splaceholder) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetPlaceHolder(sPlaceholder As String) As UOEN";
 //BA.debugLineNum = 92;BA.debugLine="AddAttribute(\"placeholder\",sPlaceholder)";
_addattribute("placeholder",_splaceholder);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setprefix(String _sprefix) throws Exception{
 //BA.debugLineNum = 560;BA.debugLine="Sub SetPrefix(sPrefix As String) As UOENowHTML";
 //BA.debugLineNum = 561;BA.debugLine="Prefix = sPrefix";
_prefix = _sprefix;
 //BA.debugLineNum = 562;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setreadonly(boolean _breadonly) throws Exception{
 //BA.debugLineNum = 585;BA.debugLine="Sub SetReadOnly(bReadOnly As Boolean) As UOENowHTM";
 //BA.debugLineNum = 586;BA.debugLine="ReadOnly = bReadOnly";
_readonly = _breadonly;
 //BA.debugLineNum = 587;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public String  _setrel(String _rel) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetREL(rel As String)";
 //BA.debugLineNum = 101;BA.debugLine="AddAttribute(\"rel\", rel)";
_addattribute("rel",_rel);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setrequired(boolean _brequired) throws Exception{
 //BA.debugLineNum = 603;BA.debugLine="Sub SetRequired(bRequired As Boolean) As UOENowHTM";
 //BA.debugLineNum = 604;BA.debugLine="Required = bRequired";
_required = _brequired;
 //BA.debugLineNum = 605;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 606;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setrole(String _svalue) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetROLE(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 184;BA.debugLine="AddAttribute(\"role\",sValue)";
_addattribute("role",_svalue);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setsrc(String _svalue,boolean _static) throws Exception{
String _tmpfile = "";
 //BA.debugLineNum = 420;BA.debugLine="Sub SetSRC(sValue As String, Static As Boolean) As";
 //BA.debugLineNum = 421;BA.debugLine="Dim tmpFile As String = MvField(sValue,1,\"?\")";
_tmpfile = _mvfield(_svalue,(int) (1),"?");
 //BA.debugLineNum = 422;BA.debugLine="If Static Then";
if (_static) { 
 //BA.debugLineNum = 423;BA.debugLine="sValue = tmpFile";
_svalue = _tmpfile;
 }else {
 //BA.debugLineNum = 425;BA.debugLine="sValue = tmpFile & \"?\" & DateTime.now";
_svalue = _tmpfile+"?"+BA.NumberToString(__c.DateTime.getNow());
 };
 //BA.debugLineNum = 427;BA.debugLine="AddAttribute(\"src\",sValue)";
_addattribute("src",_svalue);
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetStyle(prop As String, val As String) As UOE";
 //BA.debugLineNum = 29;BA.debugLine="AddStyle(prop,val)";
_addstyle(_prop,_val);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _settag(String _stag) throws Exception{
 //BA.debugLineNum = 573;BA.debugLine="Sub SetTag(sTag As String) As UOENowHTML";
 //BA.debugLineNum = 574;BA.debugLine="Tag = sTag";
_tag = _stag;
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _settarget(String _svalue) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetTARGET(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 123;BA.debugLine="If sValue.Trim = \"\" Then Return Me";
if ((_svalue.trim()).equals("")) { 
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);};
 //BA.debugLineNum = 124;BA.debugLine="AddAttribute(\"target\",sValue)";
_addattribute("target",_svalue);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _settext(String _stext,boolean _bafter) throws Exception{
 //BA.debugLineNum = 553;BA.debugLine="Sub SetText(sText As String,bAfter As Boolean) As";
 //BA.debugLineNum = 554;BA.debugLine="Text = sText";
_text = _stext;
 //BA.debugLineNum = 555;BA.debugLine="TextAfter = bAfter";
_textafter = _bafter;
 //BA.debugLineNum = 556;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return null;
}
public String  _settitle(String _stitle) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetTITLE(stitle As String)";
 //BA.debugLineNum = 97;BA.debugLine="AddAttribute(\"title\", stitle)";
_addattribute("title",_stitle);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _settype(String _svalue) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetTYPE(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 318;BA.debugLine="AddAttribute(\"type\",sValue)";
_addattribute("type",_svalue);
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _settypelowercase() throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetTypeLowerCase() As UOENowHTML";
 //BA.debugLineNum = 214;BA.debugLine="AddAttribute(\"type\",\"a\")";
_addattribute("type","a");
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _settypelowercaseroman() throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetTypeLowerCaseRoman() As UOENowHTML";
 //BA.debugLineNum = 224;BA.debugLine="AddAttribute(\"type\",\"i\")";
_addattribute("type","i");
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _settypenumbers() throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetTypeNumbers() As UOENowHTML";
 //BA.debugLineNum = 204;BA.debugLine="AddAttribute(\"type\",\"1\")";
_addattribute("type","1");
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _settypeuppercase() throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetTypeUpperCase() As UOENowHTML";
 //BA.debugLineNum = 209;BA.debugLine="AddAttribute(\"type\",\"A\")";
_addattribute("type","A");
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _settypeuppercaseroman() throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetTypeUpperCaseRoman() As UOENowHTML";
 //BA.debugLineNum = 219;BA.debugLine="AddAttribute(\"type\",\"I\")";
_addattribute("type","I");
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setvalue(String _svalue) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetVALUE(sValue As String) As UOENowHTML";
 //BA.debugLineNum = 307;BA.debugLine="AddAttribute(\"value\",sValue)";
_addattribute("value",_svalue);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setwidth(Object _w) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetWidth(w As Object) As UOENowHTML";
 //BA.debugLineNum = 35;BA.debugLine="AddAttribute(\"width\", w)";
_addattribute("width",BA.ObjectToString(_w));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setwidthpx(String _width) throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Sub SetWidthPX(Width As String) As UOENowHTML";
 //BA.debugLineNum = 438;BA.debugLine="If Width <> \"\" Then";
if ((_width).equals("") == false) { 
 //BA.debugLineNum = 439;BA.debugLine="AddStyleAttribute(\"width\", MakePx(Width))";
_addstyleattribute("width",_makepx(_width));
 };
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _setzindex(String _zindex) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetZIndex(zindex As String) As UOENowHTML";
 //BA.debugLineNum = 285;BA.debugLine="AddStyleAttribute(\"z-index\",zindex)";
_addstyleattribute("z-index",_zindex);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _strparse(String _delim,String _inputstring) throws Exception{
anywheresoftware.b4a.objects.collections.List _outlist = null;
int _commaloc = 0;
String _leftside = "";
String _rightside = "";
 //BA.debugLineNum = 1163;BA.debugLine="private Sub StrParse(Delim As String, InputString";
 //BA.debugLineNum = 1164;BA.debugLine="Dim OutList As List";
_outlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1165;BA.debugLine="Dim CommaLoc As Int";
_commaloc = 0;
 //BA.debugLineNum = 1166;BA.debugLine="OutList.Initialize";
_outlist.Initialize();
 //BA.debugLineNum = 1167;BA.debugLine="OutList.clear";
_outlist.Clear();
 //BA.debugLineNum = 1168;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 //BA.debugLineNum = 1169;BA.debugLine="Do While CommaLoc >-1";
while (_commaloc>-1) {
 //BA.debugLineNum = 1170;BA.debugLine="Dim LeftSide As String";
_leftside = "";
 //BA.debugLineNum = 1171;BA.debugLine="LeftSide= InputString.SubString2(0,CommaLoc)";
_leftside = _inputstring.substring((int) (0),_commaloc);
 //BA.debugLineNum = 1172;BA.debugLine="Dim RightSide As String";
_rightside = "";
 //BA.debugLineNum = 1173;BA.debugLine="RightSide= InputString.SubString(CommaLoc+1)";
_rightside = _inputstring.substring((int) (_commaloc+1));
 //BA.debugLineNum = 1174;BA.debugLine="OutList.Add(LeftSide)";
_outlist.Add((Object)(_leftside));
 //BA.debugLineNum = 1175;BA.debugLine="InputString=RightSide";
_inputstring = _rightside;
 //BA.debugLineNum = 1176;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 }
;
 //BA.debugLineNum = 1178;BA.debugLine="OutList.Add(InputString)";
_outlist.Add((Object)(_inputstring));
 //BA.debugLineNum = 1179;BA.debugLine="Return OutList";
if (true) return _outlist;
 //BA.debugLineNum = 1180;BA.debugLine="End Sub";
return null;
}
public String  _toproperty(String _sname,String _svalue) throws Exception{
String _script = "";
 //BA.debugLineNum = 737;BA.debugLine="private Sub ToProperty(sName As String, svalue As";
 //BA.debugLineNum = 738;BA.debugLine="sName = CStr(sName)";
_sname = _cstr((Object)(_sname));
 //BA.debugLineNum = 739;BA.debugLine="svalue = CStr(svalue)";
_svalue = _cstr((Object)(_svalue));
 //BA.debugLineNum = 740;BA.debugLine="sName = sName.Replace(\"null\",\"\")";
_sname = _sname.replace("null","");
 //BA.debugLineNum = 741;BA.debugLine="sName = sName.Replace(\"undefined\",\"\")";
_sname = _sname.replace("undefined","");
 //BA.debugLineNum = 742;BA.debugLine="svalue = svalue.Replace(\"null\",\"\")";
_svalue = _svalue.replace("null","");
 //BA.debugLineNum = 743;BA.debugLine="svalue = svalue.Replace(\"undefined\",\"\")";
_svalue = _svalue.replace("undefined","");
 //BA.debugLineNum = 744;BA.debugLine="sName = sName.Trim";
_sname = _sname.trim();
 //BA.debugLineNum = 745;BA.debugLine="svalue = svalue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 746;BA.debugLine="If sName.Length > 0 Then";
if (_sname.length()>0) { 
 //BA.debugLineNum = 747;BA.debugLine="Dim script As String = $\"${sName}='${svalue}'\"$";
_script = (""+__c.SmartStringFormatter("",(Object)(_sname))+"='"+__c.SmartStringFormatter("",(Object)(_svalue))+"'");
 //BA.debugLineNum = 748;BA.debugLine="script = script.trim";
_script = _script.trim();
 //BA.debugLineNum = 749;BA.debugLine="Return script";
if (true) return _script;
 }else {
 //BA.debugLineNum = 751;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return "";
}
public String  _tosinglequoteproperty(String _sname,String _svalue) throws Exception{
String _script = "";
 //BA.debugLineNum = 987;BA.debugLine="private Sub ToSingleQuoteProperty(sName As String,";
 //BA.debugLineNum = 988;BA.debugLine="Dim script As String = $\"${sName}='${svalue}'\"$";
_script = (""+__c.SmartStringFormatter("",(Object)(_sname))+"='"+__c.SmartStringFormatter("",(Object)(_svalue))+"'");
 //BA.debugLineNum = 989;BA.debugLine="script = script.Trim";
_script = _script.trim();
 //BA.debugLineNum = 990;BA.debugLine="If script = \"=''\" Then";
if ((_script).equals("=''")) { 
 //BA.debugLineNum = 991;BA.debugLine="script = \"\"";
_script = "";
 };
 //BA.debugLineNum = 993;BA.debugLine="Return script";
if (true) return _script;
 //BA.debugLineNum = 994;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
String _imgurl = "";
String _lnk = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strcontent = "";
String _sout = "";
 //BA.debugLineNum = 1223;BA.debugLine="public Sub ToString As String";
 //BA.debugLineNum = 1224;BA.debugLine="If ParentID <> \"\" Then";
if ((_parentid).equals("") == false) { 
 //BA.debugLineNum = 1225;BA.debugLine="ID = ParentID & ID";
_id = _parentid+_id;
 };
 //BA.debugLineNum = 1227;BA.debugLine="Select Case Tag";
switch (BA.switchObjectToInt(_tag,"img","script","link")) {
case 0: 
case 1: {
 //BA.debugLineNum = 1230;BA.debugLine="Dim imgURL As String = GetAttr(\"src\")";
_imgurl = _getattr("src");
 //BA.debugLineNum = 1231;BA.debugLine="If imgURL.Length > 0 Then";
if (_imgurl.length()>0) { 
 //BA.debugLineNum = 1232;BA.debugLine="imgURL = imgURL.tolowercase";
_imgurl = _imgurl.toLowerCase();
 };
 break; }
case 2: {
 //BA.debugLineNum = 1235;BA.debugLine="Dim lnk As String = GetAttr(\"href\")";
_lnk = _getattr("href");
 //BA.debugLineNum = 1236;BA.debugLine="If lnk.Length > 0 Then";
if (_lnk.length()>0) { 
 //BA.debugLineNum = 1237;BA.debugLine="lnk = lnk.tolowercase";
_lnk = _lnk.toLowerCase();
 };
 break; }
}
;
 //BA.debugLineNum = 1240;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1241;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1242;BA.debugLine="sb.Append(Open)";
_sb.Append(_open());
 //BA.debugLineNum = 1243;BA.debugLine="If TextAfter = True Then";
if (_textafter==__c.True) { 
 //BA.debugLineNum = 1244;BA.debugLine="Contents.Add(Text)";
_contents.Add((Object)(_text));
 }else {
 //BA.debugLineNum = 1246;BA.debugLine="Contents.InsertAt(0,Text)";
_contents.InsertAt((int) (0),(Object)(_text));
 };
 //BA.debugLineNum = 1248;BA.debugLine="For Each strContent As String In Contents";
{
final anywheresoftware.b4a.BA.IterableList group24 = _contents;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_strcontent = BA.ObjectToString(group24.Get(index24));
 //BA.debugLineNum = 1249;BA.debugLine="If strContent.Length > 0 Then";
if (_strcontent.length()>0) { 
 //BA.debugLineNum = 1250;BA.debugLine="sb.Append(strContent)";
_sb.Append(_strcontent);
 };
 }
};
 //BA.debugLineNum = 1253;BA.debugLine="sb.Append(Close)";
_sb.Append(_close());
 //BA.debugLineNum = 1254;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
 //BA.debugLineNum = 1255;BA.debugLine="If DontBreak.IndexOf(Tag) <> -1 Then";
if (_dontbreak.IndexOf((Object)(_tag))!=-1) { 
 //BA.debugLineNum = 1256;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
_sout = _sout.replace(__c.CRLF,"");
 };
 //BA.debugLineNum = 1259;BA.debugLine="sout = sout & SBAfter.tostring";
_sout = _sout+_sbafter.ToString();
 //BA.debugLineNum = 1260;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
_sout = _sout.replace(__c.CRLF,"");
 //BA.debugLineNum = 1261;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 1262;BA.debugLine="End Sub";
return "";
}
public String  _tostyle(String _sname,String _value) throws Exception{
boolean _ew = false;
String _sout = "";
 //BA.debugLineNum = 853;BA.debugLine="private Sub ToStyle(sName As String, value As Stri";
 //BA.debugLineNum = 854;BA.debugLine="If sName.Length > 0 And value.Length > 0 Then";
if (_sname.length()>0 && _value.length()>0) { 
 //BA.debugLineNum = 855;BA.debugLine="Dim ew As Boolean = sName.EndsWith(\":\")";
_ew = _sname.endsWith(":");
 //BA.debugLineNum = 856;BA.debugLine="If ew Then";
if (_ew) { 
 //BA.debugLineNum = 857;BA.debugLine="sName = MvField(sName,1,\":\")";
_sname = _mvfield(_sname,(int) (1),":");
 };
 //BA.debugLineNum = 859;BA.debugLine="Dim sout As String = $\"${sName}:${value};\"$";
_sout = (""+__c.SmartStringFormatter("",(Object)(_sname))+":"+__c.SmartStringFormatter("",(Object)(_value))+";");
 //BA.debugLineNum = 860;BA.debugLine="If sout = \":;\" Then sout = \"\"";
if ((_sout).equals(":;")) { 
_sout = "";};
 //BA.debugLineNum = 861;BA.debugLine="Return sout";
if (true) return _sout;
 }else {
 //BA.debugLineNum = 863;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebix.uoenowhtml  _updateattribute(String _name,String _propvalue) throws Exception{
String _svalue = "";
 //BA.debugLineNum = 323;BA.debugLine="Sub UpdateAttribute(name As String, propValue As S";
 //BA.debugLineNum = 324;BA.debugLine="If properties.ContainsKey(name) Then";
if (_properties.ContainsKey((Object)(_name))) { 
 //BA.debugLineNum = 325;BA.debugLine="Dim svalue As String = properties.Get(name)";
_svalue = BA.ObjectToString(_properties.Get((Object)(_name)));
 //BA.debugLineNum = 326;BA.debugLine="svalue = svalue & \";\" & propValue";
_svalue = _svalue+";"+_propvalue;
 //BA.debugLineNum = 327;BA.debugLine="properties.Put(name,svalue)";
_properties.Put((Object)(_name),(Object)(_svalue));
 }else {
 //BA.debugLineNum = 329;BA.debugLine="properties.Put(name,propValue)";
_properties.Put((Object)(_name),(Object)(_propvalue));
 };
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebix.uoenowhtml)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public String  _usetheme(String _sprefix,String _themename) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub UseTheme(sPrefix As String, themeName As Strin";
 //BA.debugLineNum = 78;BA.debugLine="If themeName = \"\" Then Return";
if ((_themename).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 79;BA.debugLine="themeName = themeName.tolowercase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 80;BA.debugLine="If sPrefix <> \"\" And themeName <> \"\" Then";
if ((_sprefix).equals("") == false && (_themename).equals("") == false) { 
 //BA.debugLineNum = 81;BA.debugLine="AddClass($\"${sPrefix}-${themeName}\"$)";
_addclass((""+__c.SmartStringFormatter("",(Object)(_sprefix))+"-"+__c.SmartStringFormatter("",(Object)(_themename))+""));
 };
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
