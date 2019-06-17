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
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgtoolbar _pgtoolbar = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgmultiview _pgmultiview = null;
public b4j.example.pglayouts1 _pglayouts1 = null;
public b4j.example.pglayouts2 _pglayouts2 = null;
public b4j.example.pglayouts _pglayouts = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 57;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 62;BA.debugLine="tblB.ToolBar.AddColumns(Item)";
_tblb._toolbar /*b4j.example.wixelement*/ ._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 78;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 79;BA.debugLine="Button.SetOnContent(\"onLabel\", OnLabel)";
_button._setoncontent /*b4j.example.wixelement*/ ("onLabel",_onlabel);
 //BA.debugLineNum = 80;BA.debugLine="Button.SetOnContent(\"offLabel\", OffLabel)";
_button._setoncontent /*b4j.example.wixelement*/ ("offLabel",_offlabel);
 //BA.debugLineNum = 81;BA.debugLine="Button.SetOnContent(\"offIcon\", offIcon)";
_button._setoncontent /*b4j.example.wixelement*/ ("offIcon",_officon);
 //BA.debugLineNum = 82;BA.debugLine="Button.SetOnContent(\"onIcon\", onIcon)";
_button._setoncontent /*b4j.example.wixelement*/ ("onIcon",_onicon);
 //BA.debugLineNum = 83;BA.debugLine="Button.SetOnContent(\"icon\", Icon)";
_button._setoncontent /*b4j.example.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 84;BA.debugLine="Button.SetOnContent(\"image\", ImageURL)";
_button._setoncontent /*b4j.example.wixelement*/ ("image",_imageurl);
 //BA.debugLineNum = 85;BA.debugLine="Button.TypeOf = ButtonType";
_button._typeof /*String*/  = _buttontype;
 //BA.debugLineNum = 86;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 87;BA.debugLine="Button.SetAttr(\"click\", onClick)";
_button._setattr /*b4j.example.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 89;BA.debugLine="Return Button.item";
if (true) return _button._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public String  _pop() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Pop";
 //BA.debugLineNum = 52;BA.debugLine="Parent.AddColumns(Item)";
_parent._addcolumns /*b4j.example.wixelement*/ (_item());
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixbutton  _setbatch(int _b) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetBatch(b As Int) As WixButton";
 //BA.debugLineNum = 100;BA.debugLine="Button.SetBatch(b)";
_button._setbatch /*b4j.example.wixelement*/ (_b);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetClick(e As BANanoObject) As WixButton";
 //BA.debugLineNum = 73;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetHeight(h As Int) As WixButton";
 //BA.debugLineNum = 192;BA.debugLine="Button.Height = h";
_button._height /*int*/  = _h;
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _seticon(String _icn) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetIcon(icn As String) As WixButton";
 //BA.debugLineNum = 112;BA.debugLine="Icon = icn";
_icon = _icn;
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setimage(String _img) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetImage(img As String) As WixButton";
 //BA.debugLineNum = 106;BA.debugLine="ImageURL = img";
_imageurl = _img;
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetLabel(lbl As String) As WixButton";
 //BA.debugLineNum = 131;BA.debugLine="Button.Label.Text = lbl";
_button._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _lbl;
 //BA.debugLineNum = 132;BA.debugLine="Button.value = lbl";
_button._value /*Object*/  = (Object)(_lbl);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setofficon(String _icn) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetOffIcon(icn As String) As WixButton";
 //BA.debugLineNum = 124;BA.debugLine="offIcon = icn";
_officon = _icn;
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setofflabel(String _l) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetOffLabel(l As String) As WixButton";
 //BA.debugLineNum = 34;BA.debugLine="OffLabel = l";
_offlabel = _l;
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setonicon(String _icn) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetOnIcon(icn As String) As WixButton";
 //BA.debugLineNum = 118;BA.debugLine="onIcon = icn";
_onicon = _icn;
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setonlabel(String _l) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetOnLabel(l As String) As WixButton";
 //BA.debugLineNum = 40;BA.debugLine="OnLabel = l";
_onlabel = _l;
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setparent(b4j.example.wixelement _p) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetParent(p As WixElement) As WixButton";
 //BA.debugLineNum = 94;BA.debugLine="Parent = p";
_parent = _p;
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settoggle(String _t) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetToggle(t As String) As WixButton  'ignore";
 //BA.debugLineNum = 46;BA.debugLine="Button.SetView(\"toggle\")";
_button._setview /*b4j.example.wixelement*/ ("toggle");
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypedanger(String _r) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub SetTypeDanger(r As String) As WixButton  'igno";
 //BA.debugLineNum = 168;BA.debugLine="ButtonType = \"danger\"";
_buttontype = "danger";
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeform(String _r) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetTypeForm(r As String) As WixButton  'ignore";
 //BA.debugLineNum = 174;BA.debugLine="ButtonType = \"form\"";
_buttontype = "form";
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeicon(String _r) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetTypeIcon(r As String) As WixButton  'ignore";
 //BA.debugLineNum = 156;BA.debugLine="ButtonType = \"icon\"";
_buttontype = "icon";
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeiconbutton(String _i) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetTypeIconButton(i As String) As WixButton 'i";
 //BA.debugLineNum = 138;BA.debugLine="ButtonType = \"iconButton\"";
_buttontype = "iconButton";
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeiconbuttontop(String _r) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetTypeIconButtonTop(r As String) As WixButton";
 //BA.debugLineNum = 162;BA.debugLine="ButtonType = \"iconButtonTop\"";
_buttontype = "iconButtonTop";
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeimage(String _r) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetTypeImage(r As String) As WixButton  'ignor";
 //BA.debugLineNum = 150;BA.debugLine="ButtonType = \"image\"";
_buttontype = "image";
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeimagebutton(String _r) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetTypeImageButton(r As String) As WixButton";
 //BA.debugLineNum = 144;BA.debugLine="ButtonType =  \"imageButton\"";
_buttontype = "imageButton";
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypenext(String _r) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetTypeNext(r As String) As WixButton  'ignore";
 //BA.debugLineNum = 186;BA.debugLine="ButtonType = \"next\"";
_buttontype = "next";
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _settypeprev(String _r) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetTypePrev(r As String) As WixButton  'ignore";
 //BA.debugLineNum = 180;BA.debugLine="ButtonType = \"prev\"";
_buttontype = "prev";
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetValue(v As String) As WixButton";
 //BA.debugLineNum = 67;BA.debugLine="Button.Value = v";
_button._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetWidth(w As Int) As WixButton";
 //BA.debugLineNum = 198;BA.debugLine="Button.Width = w";
_button._width /*int*/  = _w;
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
