package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixtoggle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixtoggle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixtoggle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.wixelement _toggle = null;
public String _onlabel = "";
public String _offlabel = "";
public String _buttontype = "";
public String _imageurl = "";
public String _icon = "";
public String _onicon = "";
public String _officon = "";
public b4j.example.main _main = null;
public b4j.example.pgforms1 _pgforms1 = null;
public b4j.example.pgforms _pgforms = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public b4j.example.pglayouts _pglayouts = null;
public String  _addtoform(b4j.example.wixform _frm) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub AddToForm(frm As WixForm)";
 //BA.debugLineNum = 31;BA.debugLine="frm.AddItem(Item)";
_frm._additem /*String*/ (_item());
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _addtotoolbar(b4j.example.wixtoolbar _tblb) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub AddToToolbar(tblB As WixToolBar)";
 //BA.debugLineNum = 37;BA.debugLine="tblB.AddItem(Item)";
_tblb._additem /*b4j.example.wixtoolbar*/ (_item());
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public Toggle As WixElement";
_toggle = new b4j.example.wixelement();
 //BA.debugLineNum = 5;BA.debugLine="Private OnLabel As String";
_onlabel = "";
 //BA.debugLineNum = 6;BA.debugLine="Private OffLabel As String";
_offlabel = "";
 //BA.debugLineNum = 7;BA.debugLine="Private ButtonType As String";
_buttontype = "";
 //BA.debugLineNum = 8;BA.debugLine="Private ImageURL As String";
_imageurl = "";
 //BA.debugLineNum = 9;BA.debugLine="Private Icon As String";
_icon = "";
 //BA.debugLineNum = 10;BA.debugLine="Private onIcon As String";
_onicon = "";
 //BA.debugLineNum = 11;BA.debugLine="Private offIcon As String";
_officon = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.wixtoggle  _initialize(anywheresoftware.b4a.BA _ba,String _iid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(iID As String) As WixToggle";
 //BA.debugLineNum = 16;BA.debugLine="ID = iID.tolowercase";
_id = _iid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Toggle.Initialize(iID).SetView(\"toggle\")";
_toggle._initialize /*b4j.example.wixelement*/ (ba,_iid)._setview /*b4j.example.wixelement*/ ("toggle");
 //BA.debugLineNum = 18;BA.debugLine="Toggle.Value = False";
_toggle._value /*Object*/  = (Object)(__c.False);
 //BA.debugLineNum = 19;BA.debugLine="OffLabel = \"\"";
_offlabel = "";
 //BA.debugLineNum = 20;BA.debugLine="OnLabel = \"\"";
_onlabel = "";
 //BA.debugLineNum = 21;BA.debugLine="Icon = \"\"";
_icon = "";
 //BA.debugLineNum = 22;BA.debugLine="ImageURL = \"\"";
_imageurl = "";
 //BA.debugLineNum = 23;BA.debugLine="offIcon = \"\"";
_officon = "";
 //BA.debugLineNum = 24;BA.debugLine="onIcon = \"\"";
_onicon = "";
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _isicon(String _r) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub IsIcon(r As String) As WixToggle";
 //BA.debugLineNum = 96;BA.debugLine="ButtonType = \"icon\"";
_buttontype = "icon";
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _isiconbuttontop(String _r) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub IsIconButtonTop(r As String) As WixToggle";
 //BA.debugLineNum = 102;BA.debugLine="ButtonType = \"iconButtonTop\"";
_buttontype = "iconButtonTop";
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _isimage(String _r) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub IsImage(r As String) As WixToggle";
 //BA.debugLineNum = 90;BA.debugLine="ButtonType = \"image\"";
_buttontype = "image";
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _isimagebutton(String _r) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub IsImageButton(r As String) As WixToggle";
 //BA.debugLineNum = 84;BA.debugLine="ButtonType =  \"imageButton\"";
_buttontype = "imageButton";
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _item() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub Item As Map";
 //BA.debugLineNum = 120;BA.debugLine="Toggle.SetOnContent(\"icon\", Icon)";
_toggle._setoncontent /*b4j.example.wixelement*/ ("icon",_icon);
 //BA.debugLineNum = 121;BA.debugLine="Toggle.SetOnContent(\"image\", ImageURL)";
_toggle._setoncontent /*b4j.example.wixelement*/ ("image",_imageurl);
 //BA.debugLineNum = 122;BA.debugLine="Toggle.TypeOf = ButtonType";
_toggle._typeof /*String*/  = _buttontype;
 //BA.debugLineNum = 123;BA.debugLine="Toggle.SetOnContent(\"onLabel\", OnLabel)";
_toggle._setoncontent /*b4j.example.wixelement*/ ("onLabel",_onlabel);
 //BA.debugLineNum = 124;BA.debugLine="Toggle.SetOnContent(\"offLabel\", OffLabel)";
_toggle._setoncontent /*b4j.example.wixelement*/ ("offLabel",_offlabel);
 //BA.debugLineNum = 125;BA.debugLine="Toggle.SetOnContent(\"offIcon\", offIcon)";
_toggle._setoncontent /*b4j.example.wixelement*/ ("offIcon",_officon);
 //BA.debugLineNum = 126;BA.debugLine="Toggle.SetOnContent(\"onIcon\", onIcon)";
_toggle._setoncontent /*b4j.example.wixelement*/ ("onIcon",_onicon);
 //BA.debugLineNum = 127;BA.debugLine="Return Toggle.item";
if (true) return _toggle._item /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetHeight(h As Int) As WixToggle";
 //BA.debugLineNum = 108;BA.debugLine="Toggle.Height = h";
_toggle._height /*int*/  = _h;
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _seticon(String _icn) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetIcon(icn As String) As WixToggle";
 //BA.debugLineNum = 60;BA.debugLine="Icon = icn";
_icon = _icn;
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setimage(String _img) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetImage(img As String) As WixToggle";
 //BA.debugLineNum = 54;BA.debugLine="ImageURL = img";
_imageurl = _img;
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetLabel(lbl As String) As WixToggle";
 //BA.debugLineNum = 78;BA.debugLine="Toggle.Label.Text = lbl";
_toggle._label /*b4j.example.wixelement._labeltype*/ .Text /*String*/  = _lbl;
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setofficon(String _icn) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetOffIcon(icn As String) As WixToggle";
 //BA.debugLineNum = 72;BA.debugLine="offIcon = icn";
_officon = _icn;
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setofflabel(String _l) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetOffLabel(l As String) As WixToggle";
 //BA.debugLineNum = 42;BA.debugLine="OffLabel = l";
_offlabel = _l;
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setonicon(String _icn) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetOnIcon(icn As String) As WixToggle";
 //BA.debugLineNum = 66;BA.debugLine="onIcon = icn";
_onicon = _icn;
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setonlabel(String _l) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetOnLabel(l As String) As WixToggle";
 //BA.debugLineNum = 48;BA.debugLine="OnLabel = l";
_onlabel = _l;
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.wixtoggle  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetWidth(w As Int) As WixToggle";
 //BA.debugLineNum = 114;BA.debugLine="Toggle.Width = w";
_toggle._width /*int*/  = _w;
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.wixtoggle)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
