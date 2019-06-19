package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixbuttontypes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.wixbuttontypes", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wixbuttontypes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _buttonbase = "";
public String _buttondanger = "";
public String _buttonform = "";
public String _buttonprev = "";
public String _buttonnext = "";
public String _buttonimage = "";
public String _buttoniconbutton = "";
public String _buttoniconbuttontop = "";
public String _buttonimagebutton = "";
public String _buttonicon = "";
public b4j.example.main _main = null;
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
public b4j.example.pgdatatable _pgdatatable = null;
public b4j.example.pglayout _pglayout = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public ButtonBase As String = \"\"";
_buttonbase = "";
 //BA.debugLineNum = 3;BA.debugLine="Public ButtonDanger As String = \"danger\"";
_buttondanger = "danger";
 //BA.debugLineNum = 4;BA.debugLine="Public ButtonForm As String = \"form\"";
_buttonform = "form";
 //BA.debugLineNum = 5;BA.debugLine="Public ButtonPrev As String = \"prev\"";
_buttonprev = "prev";
 //BA.debugLineNum = 6;BA.debugLine="Public ButtonNext As String = \"next\"";
_buttonnext = "next";
 //BA.debugLineNum = 7;BA.debugLine="Public ButtonImage As String = \"image\"";
_buttonimage = "image";
 //BA.debugLineNum = 8;BA.debugLine="Public ButtonIconButton As String = \"iconButton\"";
_buttoniconbutton = "iconButton";
 //BA.debugLineNum = 9;BA.debugLine="Public ButtonIconButtonTop As String = \"iconButto";
_buttoniconbuttontop = "iconButtonTop";
 //BA.debugLineNum = 10;BA.debugLine="Public ButtonImageButton As String = \"imageButton";
_buttonimagebutton = "imageButton";
 //BA.debugLineNum = 11;BA.debugLine="Public ButtonIcon As String = \"icon\"";
_buttonicon = "icon";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
