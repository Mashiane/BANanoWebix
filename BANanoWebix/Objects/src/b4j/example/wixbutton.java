package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _button = null;
public com.ab.banano.BANanoObject _onclick = null;
public String _buttontype = "";
public String _imageurl = "";
public String _icon = "";
public b4j.example.wixelement _parent = null;
public String _onlabel = "";
public String _offlabel = "";
public String _onicon = "";
public String _officon = "";
public b4j.example.main _main = null;
public b4j.example.pgvideo _pgvideo = null;
public b4j.example.pgtabbar _pgtabbar = null;
public b4j.example.pgtree _pgtree = null;
public b4j.example.pgmenu _pgmenu = null;
public b4j.example.pglist _pglist = null;
public b4j.example.pgdataview _pgdataview = null;
public b4j.example.pgdatatable1 _pgdatatable1 = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pgcharts _pgcharts = null;
public b4j.example.pgdataentry _pgdataentry = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgtoolbar _pgtoolbar = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pgunitlist _pgunitlist = null;
public b4j.example.pgpropertysheet _pgpropertysheet = null;
public b4j.example.pgtreetable _pgtreetable = null;
public b4j.example.pgsidebar _pgsidebar = null;
public b4j.example.pgcomments _pgcomments = null;
public b4j.example.pggrouplist _pggrouplist = null;
public b4j.example.pgcontext _pgcontext = null;
public b4j.example.pggooglemap _pggooglemap = null;
public b4j.example.pguploader1 _pguploader1 = null;
public b4j.example.pguploader2 _pguploader2 = null;
public b4j.example.pguploader3 _pguploader3 = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 76;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 81;BA.debugLine="tblB.ToolBar.AddColumns(Item)";
_tblb._toolbar /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Button As WixElement";
_button = new b4j.example.wixelement();
 //BA.debugLineNum = 6;BA.debugLine="Private onClick As BANanoObject";
_onclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 7;BA.debugLine="Private ButtonType As String";
_buttontype = "";
 //BA.debugLineNum = 8;BA.debugLine="Private ImageURL As String";
_imageurl = "";
 //BA.debugLineNum = 9;BA.debugLine="Private Icon As String";
_icon = "";
 //BA.debugLineNum = 10;BA.debugLine="Public Parent As WixElement";
_parent = new b4j.example.wixelement();
 //BA.debugLineNum = 11;BA.debugLine="Private OnLabel As String";
_onlabel = "";
 //BA.debugLineNum = 12;BA.debugLine="Private OffLabel As String";
_offlabel = "";
 //BA.debugLineNum = 13;BA.debugLine="Private onIcon As String";
_onicon = "";
 //BA.debugLineNum = 14;BA.debugLine="Private offIcon As String";
_officon = "";
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixbutton  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(bID As String) As WixButton";
 //BA.debugLineNum = 19;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="Button.Initialize(ID).SetView(\"button\")";
_button._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("button");
 //BA.debugLineNum = 21;BA.debugLine="onClick = Null";
_onclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 22;BA.debugLine="Icon = \"\"";
_icon = "";
 //BA.debugLineNum = 23;BA.debugLine="Parent = Null";
_parent = (b4j.example.wixelement)(__c.Null);
 //BA.debugLineNum = 24;BA.debugLine="OffLabel = \"\"";
_offlabel = "";
 //BA.debugLineNum = 25;BA.debugLine="OnLabel = \"\"";
_onlabel = "";
 //BA.debugLineNum = 26;BA.debugLine="ImageURL = \"\"";
_imageurl = "";
 //BA.debugLineNum = 27;BA.debugLine="offIcon = \"\"";
_officon = "";
 //BA.debugLineNum = 28;BA.debugLine="onIcon = \"\"";
_onicon = "";
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 98;BA.debugLine="Button.SetOnContent(\"onLabel\", OnLabel)";
_button._setoncontent /*b4j.example.wixelement*/ ("onLabel",_onlabel);
 //BA.debugLineNum = 99;BA.debugLine="Button.SetOnContent(\"offLabel\", OffLabel)";
_button._setoncontent /*b4j.example.wixelement*/ ("offLabel",_offlabel);
 //BA.debugLineNum = 100;BA.debugLine="Button.SetOnContent(\"offIcon\", offIcon)";
_button._setoncontent /*b4j.example.wixelement*/ ("offIcon",_officon);
 //BA.debugLineNum = 101;BA.debugLine="Button.SetOnContent(\"onIcon\", onIcon)";
_button._setoncontent /*b4j.example.wixelement*/ ("onIcon",_onicon);
 //BA.debugLineNum = 102;BA.debugLine="Button.SetOnContent(\"icon\", Icon)";
_button._setoncontent /*b4j.example.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 103;BA.debugLine="Button.SetOnContent(\"image\", ImageURL)";
_button._setoncontent /*b4j.example.wixelement*/ ("image",_imageurl);
 //BA.debugLineNum = 104;BA.debugLine="Button.TypeOf = ButtonType";
_button._typeof /*String*/  = _buttontype;
 //BA.debugLineNum = 105;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 106;BA.debugLine="Button.SetAttr(\"click\", onClick)";
_button._setattr /*b4j.example.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 108;BA.debugLine="Return Button.item";
if (true) return _button._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 71;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixbutton  _setaligncenter(String _r) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetAlignCenter(r As String) As WixButton 'igno";
 //BA.debugLineNum = 230;BA.debugLine="Button.setAligncenter(\"\")";
_button._setaligncenter /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setalignleft(String _r) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetAlignLeft(r As String) As WixButton 'ignore";
 //BA.debugLineNum = 236;BA.debugLine="Button.SetAlignleft(\"\")";
_button._setalignleft /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setalignright(String _r) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetAlignRight(r As String) As WixButton 'ignor";
 //BA.debugLineNum = 224;BA.debugLine="Button.setAlignright(\"\")";
_button._setalignright /*b4j.example.wixelement*/ ("");
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetBatch(b As Int) As WixButton";
 //BA.debugLineNum = 119;BA.debugLine="Button.SetBatch(b)";
_button._setbatch /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetClick(e As BANanoObject) As WixButton";
 //BA.debugLineNum = 92;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetHeight(h As Int) As WixButton";
 //BA.debugLineNum = 211;BA.debugLine="Button.Height = h";
_button._height /*int*/  = _h;
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _seticon(String _icn) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetIcon(icn As String) As WixButton";
 //BA.debugLineNum = 131;BA.debugLine="Icon = icn";
_icon = _icn;
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setimage(String _img) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetImage(img As String) As WixButton";
 //BA.debugLineNum = 125;BA.debugLine="ImageURL = img";
_imageurl = _img;
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setinputwidth(int _w) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetInputWidth(w As Int) As WixButton";
 //BA.debugLineNum = 34;BA.debugLine="Button.SetInputWidth(w)";
_button._setinputwidth /*b4j.example.wixelement*/ (_w);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetLabel(lbl As String) As WixButton";
 //BA.debugLineNum = 150;BA.debugLine="Button.Label.Text = lbl";
_button._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _lbl;
 //BA.debugLineNum = 151;BA.debugLine="Button.value = lbl";
_button._value /*Object*/  = (Object)(_lbl);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setofficon(String _icn) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetOffIcon(icn As String) As WixButton";
 //BA.debugLineNum = 143;BA.debugLine="offIcon = icn";
_officon = _icn;
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setofflabel(String _l) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetOffLabel(l As String) As WixButton";
 //BA.debugLineNum = 53;BA.debugLine="OffLabel = l";
_offlabel = _l;
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setonicon(String _icn) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetOnIcon(icn As String) As WixButton";
 //BA.debugLineNum = 137;BA.debugLine="onIcon = icn";
_onicon = _icn;
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setonlabel(String _l) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetOnLabel(l As String) As WixButton";
 //BA.debugLineNum = 59;BA.debugLine="OnLabel = l";
_onlabel = _l;
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setparent(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetParent(p As WixElement) As WixButton";
 //BA.debugLineNum = 113;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setstyle(String _prop,String _val) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetStyle(prop As String, val As String) As Wix";
 //BA.debugLineNum = 46;BA.debugLine="Button.SetStyle(prop,val)";
_button._setstyle /*b4j.example.wixelement*/ (_prop,_val);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settoggle(String _t) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetToggle(t As String) As WixButton  'ignore";
 //BA.debugLineNum = 65;BA.debugLine="Button.SetView(\"toggle\")";
_button._setview /*b4j.example.wixelement*/ ("toggle");
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settooltip(String _tt) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetTooltip(tt As String) As WixButton";
 //BA.debugLineNum = 40;BA.debugLine="Button.SetProperty(\"tooltip\", tt)";
_button._setproperty /*b4j.example.wixelement*/ ("tooltip",(Object)(_tt));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypedanger(String _r) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetTypeDanger(r As String) As WixButton  'igno";
 //BA.debugLineNum = 187;BA.debugLine="ButtonType = \"danger\"";
_buttontype = "danger";
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeform(String _r) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetTypeForm(r As String) As WixButton  'ignore";
 //BA.debugLineNum = 193;BA.debugLine="ButtonType = \"form\"";
_buttontype = "form";
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeicon(String _r) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetTypeIcon(r As String) As WixButton  'ignore";
 //BA.debugLineNum = 175;BA.debugLine="ButtonType = \"icon\"";
_buttontype = "icon";
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeiconbutton(String _i) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetTypeIconButton(i As String) As WixButton 'i";
 //BA.debugLineNum = 157;BA.debugLine="ButtonType = \"iconButton\"";
_buttontype = "iconButton";
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeiconbuttontop(String _r) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetTypeIconButtonTop(r As String) As WixButton";
 //BA.debugLineNum = 181;BA.debugLine="ButtonType = \"iconButtonTop\"";
_buttontype = "iconButtonTop";
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeimage(String _r) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetTypeImage(r As String) As WixButton  'ignor";
 //BA.debugLineNum = 169;BA.debugLine="ButtonType = \"image\"";
_buttontype = "image";
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeimagebutton(String _r) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub SetTypeImageButton(r As String) As WixButton";
 //BA.debugLineNum = 163;BA.debugLine="ButtonType =  \"imageButton\"";
_buttontype = "imageButton";
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypenext(String _r) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetTypeNext(r As String) As WixButton  'ignore";
 //BA.debugLineNum = 205;BA.debugLine="ButtonType = \"next\"";
_buttontype = "next";
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeprev(String _r) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetTypePrev(r As String) As WixButton  'ignore";
 //BA.debugLineNum = 199;BA.debugLine="ButtonType = \"prev\"";
_buttontype = "prev";
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetValue(v As String) As WixButton";
 //BA.debugLineNum = 86;BA.debugLine="Button.Value = v";
_button._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetWidth(w As Int) As WixButton";
 //BA.debugLineNum = 217;BA.debugLine="Button.Width = w";
_button._width /*int*/  = _w;
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
