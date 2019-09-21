package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixdbllist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixdbllist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixdbllist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.Mashy.BANanoWebixDemo.wixelement _dbllist = null;
public b4j.Mashy.BANanoWebixDemo.wixelement _parent = null;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addtocolumns(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub AddToColumns(P As WixElement)";
 //BA.debugLineNum = 192;BA.debugLine="P.AddColumns(Item)";
_p._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _addtoelements(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub AddToElements(P As WixElement)";
 //BA.debugLineNum = 197;BA.debugLine="P.AddElements(Item)";
_p._addelements /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public String  _addtoform(b4j.Mashy.BANanoWebixDemo.wixform _frm) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 43;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _addtorows(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub AddToRows(P As WixElement)";
 //BA.debugLineNum = 187;BA.debugLine="P.AddRows(Item)";
_p._addrows /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public DBLList As WixElement";
_dbllist = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.Mashy.BANanoWebixDemo.wixelement();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(iID As String) As WixDBLList";
 //BA.debugLineNum = 11;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="DBLList.Initialize(iID).SetView(\"dbllist\")";
_dbllist._initialize /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (ba,_iid)._setview /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("dbllist");
 //BA.debugLineNum = 13;BA.debugLine="Parent = Null";
_parent = (b4j.Mashy.BANanoWebixDemo.wixelement)(__c.Null);
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 114;BA.debugLine="Return DBLList.item";
if (true) return _dbllist._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 48;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_item());
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetAlignCenter(r As String) As WixDBLList 'ign";
 //BA.debugLineNum = 174;BA.debugLine="DBLList.setAligncenter(\"\")";
_dbllist._setaligncenter /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetAlignLeft(r As String) As WixDBLList 'ignor";
 //BA.debugLineNum = 180;BA.debugLine="DBLList.SetAlignleft(\"\")";
_dbllist._setalignleft /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetAlignRight(r As String) As WixDBLList 'igno";
 //BA.debugLineNum = 168;BA.debugLine="DBLList.setAlignright(\"\")";
_dbllist._setalignright /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("");
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setanimate(boolean _animate) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetAnimate(animate As Boolean) As WixDbllist";
 //BA.debugLineNum = 201;BA.debugLine="Dbllist.SetAttr(\"animate\", animate)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("animate",(Object)(_animate));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 18;BA.debugLine="Sub SetAttributes(m As Map) As WixDBLList";
 //BA.debugLineNum = 19;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 20;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 21;BA.debugLine="DBLList.SetAttr(k,v)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setborderless(boolean _borderless) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetBorderless(borderless As Boolean) As WixDBL";
 //BA.debugLineNum = 206;BA.debugLine="DBLList.SetAttr(\"borderless\", borderless)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("borderless",(Object)(_borderless));
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setbuttons(Object _buttons) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetButtons(buttons As Object) As WixDBLList";
 //BA.debugLineNum = 211;BA.debugLine="DBLList.SetAttr(\"buttons\", buttons)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("buttons",_buttons);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setcontainer(Object _container) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetContainer(container As Object) As WixDBLLis";
 //BA.debugLineNum = 216;BA.debugLine="DBLList.SetAttr(\"container\", container)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("container",_container);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setcss(Object _css) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetCss(css As Object) As WixDBLList";
 //BA.debugLineNum = 221;BA.debugLine="DBLList.SetAttr(\"css\", css)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("css",_css);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setdata(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetData(d As List) As WixDBLList";
 //BA.debugLineNum = 126;BA.debugLine="DBLList.SetData(d)";
_dbllist._setdata /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_d);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setdatatype(Object _datatype) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetDatatype(datatype As Object) As WixDBLList";
 //BA.debugLineNum = 226;BA.debugLine="DBLList.SetAttr(\"datatype\", datatype)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("datatype",_datatype);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setdisabled(boolean _disabled) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetDisabled(disabled As Boolean) As WixDBLList";
 //BA.debugLineNum = 231;BA.debugLine="DBLList.SetAttr(\"disabled\", disabled)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("disabled",(Object)(_disabled));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setgravity(Object _gravity) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetGravity(gravity As Object) As WixDBLList";
 //BA.debugLineNum = 236;BA.debugLine="DBLList.SetAttr(\"gravity\", gravity)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("gravity",_gravity);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setheight(Object _h) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetHeight(h As Object) As WixDBLList";
 //BA.debugLineNum = 120;BA.debugLine="DBLList.SetHeight(h)";
_dbllist._setheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _sethidden(boolean _hidden) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetHidden(hidden As Boolean) As WixDBLList";
 //BA.debugLineNum = 241;BA.debugLine="DBLList.SetAttr(\"hidden\", hidden)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("hidden",(Object)(_hidden));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetLabel(l As String) As WixDBLList";
 //BA.debugLineNum = 138;BA.debugLine="DBLList.SetLabel(l)";
_dbllist._setlabel /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_l);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setlabelalign(String _a) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetLabelAlign(a As String) As WixDBLList";
 //BA.debugLineNum = 150;BA.debugLine="DBLList.SetLabelAlign(a)";
_dbllist._setlabelalign /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_a);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setlabelbottomleft(Object _labelbottomleft) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetLabelBottomLeft(labelBottomLeft As Object)";
 //BA.debugLineNum = 246;BA.debugLine="DBLList.SetAttr(\"labelBottomLeft\", labelBottomLeft";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelBottomLeft",_labelbottomleft);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setlabelbottomright(Object _labelbottomright) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetLabelBottomRight(labelBottomRight As Object";
 //BA.debugLineNum = 251;BA.debugLine="DBLList.SetAttr(\"labelBottomRight\", labelBottomRig";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelBottomRight",_labelbottomright);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setlabelleft(Object _labelleft) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetLabelLeft(labelLeft As Object) As WixDBLLis";
 //BA.debugLineNum = 256;BA.debugLine="DBLList.SetAttr(\"labelLeft\", labelLeft)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelLeft",_labelleft);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setlabelposition(String _p) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetLabelPosition(p As String) As WixDBLList";
 //BA.debugLineNum = 156;BA.debugLine="DBLList.SetLabelPosition(p)";
_dbllist._setlabelposition /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_p);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setlabelright(Object _labelright) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetLabelRight(labelRight As Object) As WixDBLL";
 //BA.debugLineNum = 261;BA.debugLine="DBLList.SetAttr(\"labelRight\", labelRight)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("labelRight",_labelright);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setlabelwidth(int _w) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetLabelWidth(w As Int) As WixDBLList";
 //BA.debugLineNum = 162;BA.debugLine="DBLList.SetLabelWidth(w)";
_dbllist._setlabelwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setlist(Object _list) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetList(list As Object) As WixDBLList";
 //BA.debugLineNum = 266;BA.debugLine="DBLList.SetAttr(\"list\", list)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("list",_list);
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 103;BA.debugLine="Sub SetMap(m As Map) As WixDBLList";
 //BA.debugLineNum = 104;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 105;BA.debugLine="Dim strVal As String = m.Get(strKey)";
_strval = BA.ObjectToString(_m.Get((Object)(_strkey)));
 //BA.debugLineNum = 106;BA.debugLine="DBLList.SetAttr(strKey,	strVal)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_strkey,(Object)(_strval));
 }
};
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setmaxheight(Object _maxheight) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetMaxHeight(maxHeight As Object) As WixDBLLis";
 //BA.debugLineNum = 271;BA.debugLine="DBLList.SetAttr(\"maxHeight\", maxHeight)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxHeight",_maxheight);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setmaxwidth(Object _maxwidth) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetMaxWidth(maxWidth As Object) As WixDBLList";
 //BA.debugLineNum = 276;BA.debugLine="DBLList.SetAttr(\"maxWidth\", maxWidth)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("maxWidth",_maxwidth);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setminheight(int _h) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetMinHeight(h As Int) As WixDBLList";
 //BA.debugLineNum = 92;BA.debugLine="DBLList.SetMinHeight(h)";
_dbllist._setminheight /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_h);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setminwidth(int _w) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetMinWidth(w As Int) As WixDBLList";
 //BA.debugLineNum = 86;BA.debugLine="DBLList.SetMinWidth(w)";
_dbllist._setminwidth /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_w);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setname(String _n) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetName(n As String) As WixDBLList";
 //BA.debugLineNum = 67;BA.debugLine="DBLList.SetName(n)";
_dbllist._setname /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_n);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setpadding(Object _padding) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetPadding(padding As Object) As WixDBLList";
 //BA.debugLineNum = 281;BA.debugLine="DBLList.SetAttr(\"padding\", padding)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("padding",_padding);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setpaddingx(Object _paddingx) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetPaddingX(paddingX As Object) As WixDBLList";
 //BA.debugLineNum = 286;BA.debugLine="DBLList.SetAttr(\"paddingX\", paddingX)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingX",_paddingx);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setpaddingy(Object _paddingy) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetPaddingY(paddingY As Object) As WixDBLList";
 //BA.debugLineNum = 291;BA.debugLine="DBLList.SetAttr(\"paddingY\", paddingY)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("paddingY",_paddingy);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setparent(b4j.Mashy.BANanoWebixDemo.wixelement _p) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetParent(p As WixElement) As WixDBLList";
 //BA.debugLineNum = 53;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetRequired(b As Boolean) As WixDBLList";
 //BA.debugLineNum = 144;BA.debugLine="DBLList.SetRequired(b)";
_dbllist._setrequired /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setresponsive(Object _b) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetResponsive(b As Object) As WixDBLList";
 //BA.debugLineNum = 73;BA.debugLine="DBLList.SetResponsive(b)";
_dbllist._setresponsive /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setresponsivecell(Object _b) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetResponsiveCell(b As Object) As WixDBLList";
 //BA.debugLineNum = 79;BA.debugLine="DBLList.SetResponsiveCell(b)";
_dbllist._setresponsivecell /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_b);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setstyle(String _prop,String _sval) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetStyle(prop As String, sval As String) As Wi";
 //BA.debugLineNum = 36;BA.debugLine="DBLList.SetStyle(prop,sval)";
_dbllist._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_prop,_sval);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetStyles(m As Map) As WixDBLList";
 //BA.debugLineNum = 27;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 28;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 29;BA.debugLine="DBLList.SetStyle(k,v)";
_dbllist._setstyle /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_k,_v);
 }
};
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _settemplatehtml(b4j.Mashy.BANanoWebixDemo.uoenowhtml _h) throws Exception{
String _os = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub SetTemplateHTML(h As UOENowHTML) As WixDBLList";
 //BA.debugLineNum = 59;BA.debugLine="h.SetImportant(False)";
_h._setimportant /*b4j.Mashy.BANanoWebixDemo.uoenowhtml*/ (__c.False);
 //BA.debugLineNum = 60;BA.debugLine="Dim os As String = h.HTML";
_os = _h._html /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="DBLList.SetTemplate(os)";
_dbllist._settemplate /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ((Object)(_os));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetTooltip(tt As String) As WixDBLList";
 //BA.debugLineNum = 98;BA.debugLine="DBLList.SetTooltip(tt)";
_dbllist._settooltip /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_tt);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _settype(Object _stype) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetType(sType As Object) As WixDBLList";
 //BA.debugLineNum = 296;BA.debugLine="DBLList.SetAttr(\"type\", sType)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("type",_stype);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _seturl(Object _url) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetUrl(url As Object) As WixDBLList";
 //BA.debugLineNum = 301;BA.debugLine="DBLList.SetAttr(\"url\", url)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("url",_url);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetValue(v As String) As WixDBLList";
 //BA.debugLineNum = 132;BA.debugLine="DBLList.SetValue(v)";
_dbllist._setvalue /*b4j.Mashy.BANanoWebixDemo.wixelement*/ (_v);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.Mashy.BANanoWebixDemo.wixdbllist  _setwidth(Object _width) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetWidth(width As Object) As WixDBLList";
 //BA.debugLineNum = 306;BA.debugLine="DBLList.SetAttr(\"width\", width)";
_dbllist._setattr /*b4j.Mashy.BANanoWebixDemo.wixelement*/ ("width",_width);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixdbllist)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
