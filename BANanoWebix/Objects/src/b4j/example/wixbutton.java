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
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 22;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 27;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Button As WixElement";
_button = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private onClick As BANanoObject";
_onclick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Private ButtonType As String";
_buttontype = "";
 //BA.debugLineNum = 7;BA.debugLine="Private ImageURL As String";
_imageurl = "";
 //BA.debugLineNum = 8;BA.debugLine="Private Icon As String";
_icon = "";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixbutton  _initialize(anywheresoftware.b4a.BA _ba,String _bid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(bID As String) As WixButton";
 //BA.debugLineNum = 13;BA.debugLine="ID = bID.ToLowerCase";
_id = _bid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Button.Initialize(ID).SetView(\"button\")";
_button._initialize /*b4j.example.wixelement*/ (ba,_id)._setview /*b4j.example.wixelement*/ ("button");
 //BA.debugLineNum = 15;BA.debugLine="onClick = Null";
_onclick = (com.ab.banano.BANanoObject)(__c.Null);
 //BA.debugLineNum = 16;BA.debugLine="Icon = \"\"";
_icon = "";
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _isdanger(String _r) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub IsDanger(r As String) As WixButton";
 //BA.debugLineNum = 98;BA.debugLine="ButtonType = \"danger\"";
_buttontype = "danger";
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _isform(String _r) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub IsForm(r As String) As WixButton";
 //BA.debugLineNum = 104;BA.debugLine="ButtonType = \"form\"";
_buttontype = "form";
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _isicon(String _r) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub IsIcon(r As String) As WixButton";
 //BA.debugLineNum = 86;BA.debugLine="ButtonType = \"icon\"";
_buttontype = "icon";
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _isiconbuttontop(String _r) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub IsIconButtonTop(r As String) As WixButton";
 //BA.debugLineNum = 92;BA.debugLine="ButtonType = \"iconButtonTop\"";
_buttontype = "iconButtonTop";
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _isimage(String _r) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub IsImage(r As String) As WixButton";
 //BA.debugLineNum = 80;BA.debugLine="ButtonType = \"image\"";
_buttontype = "image";
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _isimagebutton(String _r) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub IsImageButton(r As String) As WixButton";
 //BA.debugLineNum = 74;BA.debugLine="ButtonType =  \"imageButton\"";
_buttontype = "imageButton";
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _isnext(String _r) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub IsNext(r As String) As WixButton";
 //BA.debugLineNum = 116;BA.debugLine="ButtonType = \"next\"";
_buttontype = "next";
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _isprev(String _r) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub IsPrev(r As String) As WixButton";
 //BA.debugLineNum = 110;BA.debugLine="ButtonType = \"prev\"";
_buttontype = "prev";
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 44;BA.debugLine="Button.SetOnContent(\"icon\", Icon)";
_button._setoncontent /*String*/ ("icon",_icon);
 //BA.debugLineNum = 45;BA.debugLine="Button.SetOnContent(\"image\", ImageURL)";
_button._setoncontent /*String*/ ("image",_imageurl);
 //BA.debugLineNum = 46;BA.debugLine="Button.TypeOf = ButtonType";
_button._typeof /*String*/  = _buttontype;
 //BA.debugLineNum = 47;BA.debugLine="If onClick <> Null Then";
if (_onclick!= null) { 
 //BA.debugLineNum = 48;BA.debugLine="Button.SetAttr(\"click\", onClick)";
_button._setattr /*b4j.example.wixelement*/ ("click",(Object)(_onclick));
 };
 //BA.debugLineNum = 50;BA.debugLine="Return Button.item";
if (true) return _button._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setclick(com.ab.banano.BANanoObject _e) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetClick(e As BANanoObject) As WixButton";
 //BA.debugLineNum = 38;BA.debugLine="onClick = e";
_onclick = _e;
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetHeight(h As Int) As WixButton";
 //BA.debugLineNum = 122;BA.debugLine="Button.Height = h";
_button._height /*int*/  = _h;
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _seticon(String _icn) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetIcon(icn As String) As WixButton";
 //BA.debugLineNum = 61;BA.debugLine="Icon = icn";
_icon = _icn;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setimage(String _img) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetImage(img As String) As WixButton";
 //BA.debugLineNum = 55;BA.debugLine="ImageURL = img";
_imageurl = _img;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetLabel(lbl As String) As WixButton";
 //BA.debugLineNum = 67;BA.debugLine="Button.Label.Text = lbl";
_button._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _lbl;
 //BA.debugLineNum = 68;BA.debugLine="Button.value = lbl";
_button._value /*Object*/  = (Object)(_lbl);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setvalue(String _v) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetValue(v As String) As WixButton";
 //BA.debugLineNum = 32;BA.debugLine="Button.Value = v";
_button._value /*Object*/  = (Object)(_v);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixbutton  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetWidth(w As Int) As WixButton";
 //BA.debugLineNum = 128;BA.debugLine="Button.Width = w";
_button._width /*int*/  = _w;
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.wixbutton)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
