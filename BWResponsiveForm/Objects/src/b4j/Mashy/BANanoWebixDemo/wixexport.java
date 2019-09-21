package b4j.Mashy.BANanoWebixDemo;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wixexport extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.Mashy.BANanoWebixDemo", "b4j.Mashy.BANanoWebixDemo.wixexport", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.Mashy.BANanoWebixDemo.wixexport.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _filename = "";
public String _name = "";
public boolean _filterhtml = false;
public anywheresoftware.b4a.objects.collections.List _columns = null;
public anywheresoftware.b4a.objects.collections.List _ignore = null;
public com.ab.banano.BANanoObject _wix = null;
public boolean _rawvalues = false;
public boolean _spans = false;
public boolean _download = false;
public boolean _styles = false;
public Object _heights = null;
public boolean _header = false;
public boolean _footer = false;
public b4j.Mashy.BANanoWebixDemo.main _main = null;
public b4j.Mashy.BANanoWebixDemo.modsidebar _modsidebar = null;
public b4j.Mashy.BANanoWebixDemo.pgindex _pgindex = null;
public b4j.Mashy.BANanoWebixDemo.modarchivi _modarchivi = null;
public b4j.Mashy.BANanoWebixDemo.modclient _modclient = null;
public b4j.Mashy.BANanoWebixDemo.modwebix _modwebix = null;
public String  _addcolumn(String _colid,String _colheader,int _colwidth,String _exportformat,String _template,String _exporttype) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
com.ab.banano.BANanoObject _tmp = null;
 //BA.debugLineNum = 38;BA.debugLine="Sub AddColumn(colid As String, colheader As String";
 //BA.debugLineNum = 39;BA.debugLine="Dim col As Map = CreateMap()";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col = __c.createMap(new Object[] {});
 //BA.debugLineNum = 40;BA.debugLine="col.Put(\"id\", colid)";
_col.Put((Object)("id"),(Object)(_colid));
 //BA.debugLineNum = 41;BA.debugLine="col.Put(\"header\", colheader)";
_col.Put((Object)("header"),(Object)(_colheader));
 //BA.debugLineNum = 42;BA.debugLine="If colwidth > 0 Then col.Put(\"width\", colwidth)";
if (_colwidth>0) { 
_col.Put((Object)("width"),(Object)(_colwidth));};
 //BA.debugLineNum = 43;BA.debugLine="If template.Length > 0 Then";
if (_template.length()>0) { 
 //BA.debugLineNum = 44;BA.debugLine="Dim tmp As BANanoObject = wix.RunMethod(\"templat";
_tmp = _wix.RunMethod("template",(Object)(_template));
 //BA.debugLineNum = 45;BA.debugLine="col.Put(\"template\", tmp)";
_col.Put((Object)("template"),(Object)(_tmp));
 };
 //BA.debugLineNum = 47;BA.debugLine="If exportType.Length > 0 Then col.put(\"exportType";
if (_exporttype.length()>0) { 
_col.Put((Object)("exportType"),(Object)(_exporttype));};
 //BA.debugLineNum = 48;BA.debugLine="If exportFormat.Length > 0 Then";
if (_exportformat.length()>0) { 
 //BA.debugLineNum = 49;BA.debugLine="col.put(\"exportFormat\", exportFormat)";
_col.Put((Object)("exportFormat"),(Object)(_exportformat));
 };
 //BA.debugLineNum = 51;BA.debugLine="columns.Add(col)";
_columns.Add((Object)(_col.getObject()));
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public filename As String";
_filename = "";
 //BA.debugLineNum = 4;BA.debugLine="Public name As String";
_name = "";
 //BA.debugLineNum = 5;BA.debugLine="Public filterHTML As Boolean";
_filterhtml = false;
 //BA.debugLineNum = 6;BA.debugLine="Private columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private ignore As List";
_ignore = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private wix As BANanoObject";
_wix = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 9;BA.debugLine="Public rawValues As Boolean";
_rawvalues = false;
 //BA.debugLineNum = 10;BA.debugLine="Public spans As Boolean";
_spans = false;
 //BA.debugLineNum = 11;BA.debugLine="Public download As Boolean";
_download = false;
 //BA.debugLineNum = 12;BA.debugLine="Public styles As Boolean";
_styles = false;
 //BA.debugLineNum = 13;BA.debugLine="Public heights As Object";
_heights = new Object();
 //BA.debugLineNum = 14;BA.debugLine="Public header As Boolean";
_header = false;
 //BA.debugLineNum = 15;BA.debugLine="Public footer As Boolean";
_footer = false;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _exportoptions() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ignoremap = null;
String _col = "";
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 55;BA.debugLine="Sub ExportOptions As Map";
 //BA.debugLineNum = 56;BA.debugLine="Dim ignoreMap As Map = CreateMap()";
_ignoremap = new anywheresoftware.b4a.objects.collections.Map();
_ignoremap = __c.createMap(new Object[] {});
 //BA.debugLineNum = 57;BA.debugLine="For Each col As String In ignore";
{
final anywheresoftware.b4a.BA.IterableList group2 = _ignore;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_col = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 58;BA.debugLine="ignoreMap.Put(col, True)";
_ignoremap.Put((Object)(_col),(Object)(__c.True));
 }
};
 //BA.debugLineNum = 61;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 62;BA.debugLine="opt.Put(\"filename\", filename)";
_opt.Put((Object)("filename"),(Object)(_filename));
 //BA.debugLineNum = 63;BA.debugLine="opt.Put(\"name\", name)";
_opt.Put((Object)("name"),(Object)(_name));
 //BA.debugLineNum = 64;BA.debugLine="If filterHTML = True Then opt.Put(\"filterHTML\", f";
if (_filterhtml==__c.True) { 
_opt.Put((Object)("filterHTML"),(Object)(_filterhtml));};
 //BA.debugLineNum = 66;BA.debugLine="If columns.Size > 0 Then opt.Put(\"columns\", colum";
if (_columns.getSize()>0) { 
_opt.Put((Object)("columns"),(Object)(_columns.getObject()));};
 //BA.debugLineNum = 67;BA.debugLine="If rawValues Then opt.Put(\"rawValues\", rawValues)";
if (_rawvalues) { 
_opt.Put((Object)("rawValues"),(Object)(_rawvalues));};
 //BA.debugLineNum = 68;BA.debugLine="If spans = True Then opt.Put(\"spans\", spans)";
if (_spans==__c.True) { 
_opt.Put((Object)("spans"),(Object)(_spans));};
 //BA.debugLineNum = 69;BA.debugLine="If ignoreMap.Size > 0 Then opt.Put(\"ignore\", igno";
if (_ignoremap.getSize()>0) { 
_opt.Put((Object)("ignore"),(Object)(_ignoremap.getObject()));};
 //BA.debugLineNum = 70;BA.debugLine="If columns.Size > 0 Then opt.Put(\"columns\", colum";
if (_columns.getSize()>0) { 
_opt.Put((Object)("columns"),(Object)(_columns.getObject()));};
 //BA.debugLineNum = 71;BA.debugLine="opt.Put(\"download\", download)";
_opt.Put((Object)("download"),(Object)(_download));
 //BA.debugLineNum = 72;BA.debugLine="If styles = True Then opt.Put(\"styles\", styles)";
if (_styles==__c.True) { 
_opt.Put((Object)("styles"),(Object)(_styles));};
 //BA.debugLineNum = 73;BA.debugLine="If heights = True Then opt.Put(\"heights\", heights";
if ((_heights).equals((Object)(__c.True))) { 
_opt.Put((Object)("heights"),_heights);};
 //BA.debugLineNum = 74;BA.debugLine="If header = False Then opt.Put(\"header\", header)";
if (_header==__c.False) { 
_opt.Put((Object)("header"),(Object)(_header));};
 //BA.debugLineNum = 75;BA.debugLine="If footer = False Then opt.Put(\"footer\", footer)";
if (_footer==__c.False) { 
_opt.Put((Object)("footer"),(Object)(_footer));};
 //BA.debugLineNum = 76;BA.debugLine="Return opt";
if (true) return _opt;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4j.Mashy.BANanoWebixDemo.wixpage _page) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize(Page As WixPage)";
 //BA.debugLineNum = 28;BA.debugLine="wix = Page.webix";
_wix = _page._webix /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 29;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="ignore.Initialize";
_ignore.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="download = True";
_download = __c.True;
 //BA.debugLineNum = 32;BA.debugLine="heights = False";
_heights = (Object)(__c.False);
 //BA.debugLineNum = 33;BA.debugLine="header = True";
_header = __c.True;
 //BA.debugLineNum = 34;BA.debugLine="footer = True";
_footer = __c.True;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public b4j.Mashy.BANanoWebixDemo.wixexport  _setignore(anywheresoftware.b4a.objects.collections.List _ig) throws Exception{
String _col = "";
 //BA.debugLineNum = 19;BA.debugLine="Sub SetIgnore(ig As List) As WixExport";
 //BA.debugLineNum = 20;BA.debugLine="For Each col As String In ig";
{
final anywheresoftware.b4a.BA.IterableList group1 = _ig;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 21;BA.debugLine="ignore.Add(col)";
_ignore.Add((Object)(_col));
 }
};
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.Mashy.BANanoWebixDemo.wixexport)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
