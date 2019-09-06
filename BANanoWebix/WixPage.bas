B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Dollar As BANanoObject
	Public webix As BANanoObject
	Private BANano As BANano  'ignore
	Public Page As WixElement
	Public ID As String
	Public EnumButtonTypes As WixButtonTypes
	Public EnumLayoutTypes As WixLayoutTypes
	Private hints As Map
	Private uniteFld As String
	Private ulName As String
	Private BANano As BANano  'ignore
	Public EnumWixIcons As WixIcons
	Public Views As List
	Type WixSelectedID(row As Object, ID As Object, column As Object)
End Sub

#if javascript
	function getPivotDataTable(pivot) {
		var dt = $$(pivot).$$("data");
		return dt
	}
#end if

'get datasource serialize
Sub DataSourceSerialize(ds As BANanoObject) As Object
	Dim res As Object = ds.RunMethod("serialize", Array(True)).Result
	Return res
End Sub


'get datasource pull
Sub DataSourceGetData(ds As BANanoObject) As List
	Dim res As List = ds.GetField("pull").Result
	Return res
End Sub


'get the pivot table data
Sub GetPivotDataTable(pivotName As String) As BANanoObject
	Dim dt As BANanoObject = BANano.RunJavascriptMethod("getPivotDataTable", Array(pivotName))
	Return dt
End Sub

'get datatable item
Sub DataTableGetItem(dt As BANanoObject, itemID As Map) As Map
	Dim gItem As Map = dt.RunMethod("getItem", Array(itemID)).result
	Return gItem
End Sub

'get item from datasource
Sub DataSourceGetItem(ds As BANanoObject, itemID As String) As Map
	Dim rec As Map = ds.RunMethod("getItem", Array(itemID)).result
	Return rec
End Sub

'get the wixitem
Sub GetWixElement(eID As String) As BANanoObject
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	Return itm
End Sub

'get data of an item
Sub GetDataSource(elID As String) As BANanoObject
	Dim bo As BANanoObject = GetWixElement(elID)
	Dim Data As BANanoObject = bo.GetField("data")
	Return Data
End Sub

'join list to mv string
Sub Join(delimiter As String, lst As List) As String
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub


'convert map keys to a list
Sub MapKeys2List(m As Map) As List
	Dim lst As List
	lst.Initialize
	For Each k As String In m.Keys
		lst.Add(k)
	Next
	Return lst
End Sub

'convert map keys to a list
Sub MapValues2List(m As Map) As List
	Dim lst As List
	lst.Initialize
	For Each k As String In m.values
		lst.Add(k)
	Next
	Return lst
End Sub


'rsa id to date of birth
Sub RSAIDNumber2DateOfBirth(rsaID As String) As String
	'south african id
	If rsaID.length = 13 Then
		Dim yymmdd As String = LeftString(rsaID, 6)
		Dim yy As String = LeftString(yymmdd,2)
		Dim mm As String = MidString(yymmdd,3,2)
		Dim dd As String = RightString(yymmdd,2)
		yymmdd = $"19${yy}-${mm}-${dd}"$
		Return yymmdd
	Else
		Return ""
	End If
End Sub

Public Sub YearNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "yyyy"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

'Description: Return the current system date in long format
'Tags: date, long format
Public Sub DateTimeNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "yyyy-MM-dd HH:mm"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

Sub DateAdd(mDate As String, HowManyDays As Int) As String
    Dim ConvertDate, NewDateDay As Long
    ConvertDate = DateTime.DateParse(mDate)
    NewDateDay = DateTime.Add(ConvertDate, 0, 0, HowManyDays)
    Return DateTime.Date(NewDateDay)
End Sub

Sub Age(birthDay As String) As Int
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim tDay As String = DateTime.Date(DateTime.Now)
	Dim cDay As String = DateTime.Date(DateTime.DateParse(birthDay))
	Dim aDays As Int = DateDiff(tDay, cDay)
	Dim aYears As Int = aDays / 365.25
	Return BANano.parseInt(aYears)
End Sub

Sub DateDiff(CurrentDate As String, OtherDate As String) As Int
	DateTime.DateFormat = "yyyy-MM-dd"
	
    Dim CurrDate As Long
	Dim OthDate As Long
	CurrDate = DateTime.DateParse(CurrentDate)
    OthDate = DateTime.DateParse(OtherDate)
	'
	Return (CurrDate-OthDate) / DateTime.TicksPerDay
End Sub

Sub MakeMoney(sValue As String) As String
	If sValue.Length = 0 Then Return "0.00"
	If sValue = "null" Then sValue = "0.00"
	sValue = sValue.Replace(",","")
	sValue = Val(sValue)
	If sValue = "0" Then sValue = "000"
	sValue = Round2(sValue,2)
	Return NumberFormat2(sValue, 1, 2, 2, True)
End Sub

Sub Percentage(sValue As String) As String
	If sValue = "" Then sValue = "0.00"
	If sValue.Length = 0 Then Return "0.00"
	If sValue = "null" Then sValue = "0.00"
	sValue = sValue.Replace(",","")
	sValue = Val(sValue)
	If sValue = "0" Then sValue = "0.00"
	sValue = Round2(sValue,2)
	sValue = sValue & "%"
	Return sValue
End Sub

Sub MidString(Text As String, Start As Int, lLength As Int) As String
	Return Text.SubString2(Start-1,Start+lLength-1)
End Sub

Sub MidString2(Text As String, Start As Int) As String
	Return Text.SubString(Start-1)
End Sub

Sub RightString(Text As String, lLength As Long) As String
	If lLength>Text.Length Then lLength=Text.Length
	Return Text.SubString(Text.Length-lLength)
End Sub

Sub LeftString(Text As String, lLength As Long)As String
	If lLength>Text.Length Then lLength=Text.Length
	Return Text.SubString2(0, lLength)
End Sub

Sub ReplaceString(Text As String, sFind As String, sReplaceWith As String) As String
	Return Text.Replace(sFind, sReplaceWith)
End Sub

Sub LongDate(sDate As String) As String
	If sDate.Length = 0 Then Return ""
	Try
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim dt As Long = DateTime.DateParse(sDate)
		DateTime.DateFormat = "EEEE, dd MMMM yyyy"
		Return DateTime.Date(dt)
	Catch
		Return ""
	End Try
End Sub

Sub LongDateTime(sDate As String) As String
	If sDate.Length = 0 Then Return ""
	Try
		DateTime.DateFormat = "yyyy-MM-dd HH:mm"
		Dim dt As Long = DateTime.DateParse(sDate)
		DateTime.DateFormat = "EEEE, dd MMMM yyyy HH:mm"
		Return DateTime.Date(dt)
	Catch
		Return ""
	End Try
End Sub

private Sub TrimString(strValue As String) As String
	Return strValue.trim
End Sub

Sub LCase(Text As String) As String
	Return Text.ToLowerCase
End Sub

Sub Space(HM As Int) As String
	Dim RS As String = ""
	Do While Len(RS) < HM
		RS = RS & " "
	Loop
	Return RS
End Sub

Public Sub InQuotes(sValue As String) As String
	Return QUOTE & sValue & QUOTE
End Sub

Sub ProperCase(myStr As String) As String
	Try
		If myStr.trim.length = 0 Then Return ""
		Dim x As String
		Dim j, k As Int
		myStr = myStr.tolowercase
		x = myStr.ToUpperCase.CharAt(0)
		myStr = x & myStr.SubString2(1, myStr.Length)
		For j = 1 To myStr.Length
			k = myStr.IndexOf2(" ", j + 1)
			If k = -1 Then Exit
			x = myStr.ToUpperCase.CharAt(k + 1)
			myStr = myStr.SubString2(0, k + 1) & x & myStr.SubString2(k + 2, myStr.Length)
		Next
		Return myStr
	Catch
		Return myStr
	End Try
End Sub

Public Sub CDbl(value As String) As Double
	Try
		value = value.Trim
		If value = "" Then value = "0"
		value = value.Replace(",","")
		Dim out As Double = NumberFormat2(value,0,2,2,False)
		Return out
	Catch
		Return value
	End Try
End Sub


Sub ProjectDays(sDays As String) As String
	Try
		sDays = sDays.trim
		If sDays = "" Then sDays = "0"
		sDays = sDays.Replace(",","")
		sDays = NumberFormat2(sDays,0,0,0,True)
		Return sDays & " Dys"
	Catch
		Return "0 Dys"
	End Try
End Sub

Sub ProjectDate(sDate As String) As String
	If sDate.Length = 0 Then Return ""
	Try
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim dt As Long = DateTime.DateParse(sDate)
		DateTime.DateFormat = "dd-MMM-yyyy, EEE"
		Return DateTime.Date(dt)
	Catch
		Return ""
	End Try
End Sub

Sub FormatFileSize(Bytes As Float) As String
	Try
		Private Unit() As String = Array As String(" Byte", " KB", " MB", " GB", " TB", " PB", " EB", " ZB", " YB")
		If Bytes = 0 Then
			Return "0 Bytes"
		Else
			Private Po, Si As Double
			Private I As Int
			Bytes = Abs(Bytes)
			I = Floor(Logarithm(Bytes, 1024))
			Po = Power(1024, I)
			Si = Bytes / Po
			Return NumberFormat(Si, 1, 3) & Unit(I)
		End If
	Catch
		Return "0 Bytes"
	End Try
End Sub

Sub InStrRev(value As String, search As String) As Long
	Return value.LastIndexOf(search) + 1
End Sub

'get the length of the string
Sub Len(Text As String) As Int
	Return Text.Length
End Sub

Sub PadRight(Value As String, MaxLen As Int, PadChar As String) As String
	Dim intOrdNoLen As Int = Len(Value)
	Dim i As Int
	For i = 1 To (MaxLen - intOrdNoLen) Step 1
		Value = PadChar & Value
	Next
	Return Value
End Sub

Sub JSONValues2LowerCase(sJSON As String, props As List) As String
	'convert json to map
	Dim jmap As Map = Json2Map(sJSON)
	MapValues2LowerCase(jmap, props)
	Dim nJSON As String = Map2Json(jmap)
	Return nJSON
End Sub

'convert map values to lowercase
Sub MapValues2LowerCase(m As Map, props As List)
	For Each prop As String In props
		If m.ContainsKey(prop) Then
			Dim v As String = m.GetDefault(prop,"")
			v = v.tolowercase
			m.Put(prop,v)
		End If
	Next
End Sub

Sub NumberSuffix(N As Double) As String
	If N < 0 Then
		Return "-" & NumberSuffix(-N)
	End If
	Dim Suffix() As String = Array As String("", "k", "M", "B", "T")
	Dim Thousands As Int = 0
	Do While N >= 1000 And Thousands < Suffix.Length - 1
		Thousands = Thousands + 1
		N = N / 1000
	Loop
	If Thousands = 0 Then
		Return NumberFormat2(N, 1, 2, 2, False)
	End If
 
	Dim MaxDecimalPlaces As Int = 0
	Do While MaxDecimalPlaces < 5 
		Dim RelativeError As Double = Abs(N - Round2(N, MaxDecimalPlaces)) / N
		If RelativeError < 0.007 Then
			Exit
		End If
		MaxDecimalPlaces = MaxDecimalPlaces + 1
	Loop
	Return NumberFormat2(N, 1, 0, MaxDecimalPlaces, False) & Suffix(Thousands)
End Sub


Sub GetNextID(rsl As List) As String
	Dim nextid As Int
	Dim strid As String
	
	If rsl.Size = 0 Then
		nextid = 0
	Else
		Dim nr As Map = rsl.Get(0)
		Dim ni As String = nr.Getdefault("id","0")
		nextid = BANano.parseInt(ni)
	End If
	nextid = nextid + 1
	strid = CStr(nextid)
	Return strid
End Sub

'sum list of maps property
Sub SumListOfMapsProperty(lst As List, prop As String) As Double
	Dim tsum As Double = 0
	For Each rec As Map In lst
		Dim propv As String = rec.GetDefault(prop,"0")
		tsum = tsum + BANano.parseFloat(propv)
	Next
	Return tsum
End Sub


#if css
	.status{
		position:relative;
		top:-25px;
		left:25px;
		font-size:10px !important;
		text-shadow: -1px 0 #ffffff, 0 1px #ffffff, 1px 0 #ffffff, 0 -1px #ffffff;
	}
	
	.yellow{
	color: #FDBF4C;
}
.green{
	color: #55CD97;
}
.blue{
	color: #1CA1C1;
}
.webix_view.form_photo > div{
	padding:0px;
}
#End If

'update the original prop names of a property bag
Sub SetActual(original As Map, actual As Map) As Map
	Dim nmap As Map = CreateMap()
	For Each mk As String In original.Keys
		Dim mv As Object = original.Get(mk)
		If actual.ContainsKey(mk) Then
			Dim ak As String = actual.Get(mk)
			nmap.Put(ak,mv)
		Else
			nmap.Put(mk,mv)		
		End If
	Next
	Return nmap
End Sub


Sub InStr(Text As String, sFind As String) As Int
	Return Text.tolowercase.IndexOf(sFind.tolowercase)
End Sub

Sub Iconv(oldMap As Map, lst As List)
	For Each lstv As String In lst
		Dim mv As String = oldMap.Get(lstv)
		mv = Val(mv)
		oldMap.Put(lstv, mv)			
	Next
End Sub

'extract all numeric values from a string
Public Sub Val(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		If value = "" Then value = "0"
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("0123456789.-", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub

Public Sub Alpha(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		If value = "" Then value = ""
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub


'convert list of maps to key,value pairs
Sub List2KeyValues(lst As List, mapvalues As List) As List
	Return List2IDValue(lst, mapvalues)
End Sub

'convest list of maps to id & value
Sub List2IDValue(lst As List, mapValues As List) As List
	Dim mv1 As String = mapValues.get(0)
	Dim mv2 As String = mapValues.get(1)
	Dim nlst As List
	nlst.initialize
	For Each dict As Map In lst
		Dim mk As String = dict.get(mv1)
		Dim mv As String = dict.get(mv2)
		Dim nm As Map = CreateMap()
		nm.Put("id", mk)
		nm.put("value", mv)
		nlst.Add(nm)
	Next
	Return nlst
End Sub

Sub List2ArrayVariable(lst As List) As String
	If lst.Size = 0 Then
		Return $""""$
	End If
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	fld = $""${fld}""$
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		fld = $""${fld}""$
		sb.Append(",").Append(fld)
	Next
	Return sb.ToString
End Sub


'remove the delimiter from stringbuilder
Sub RemDelim(sValue As String, Delim As String) As String
	Dim sw As Boolean = sValue.EndsWith(Delim)
	If sw Then
		Dim lDelim As Int = Delim.Length
		Dim nValue As String = sValue
		sw = nValue.EndsWith(Delim)
		If sw Then
			nValue = nValue.SubString2(0, nValue.Length-lDelim)
		End If
		Return nValue
	Else
		Return sValue
	End If
End Sub

Sub SetTemplate(elid As String, lbl As String)
	elid = elid.tolowercase
	Define(elid, CreateMap("template":lbl))
	Refresh(elid)
End Sub

Sub SetLabel(elid As String, lbl As String)
	elid = elid.tolowercase 
	Define(elid, CreateMap("label":lbl))
	Refresh(elid)
End Sub

'set multiple labels using a map
Sub SetLabelMulti(kv As Map)
	For Each k As String In kv.Keys
		Dim v As String = kv.Get(k)
		SetLabel(k,v)
	Next
End Sub

'set values multi
Sub SetValueMulti(kv As Map)
	For Each k As String In kv.Keys
		Dim v As String = kv.Get(k)
		SetValue(k,v)
	Next
End Sub

'set an error
Sub Error(sTitle As String, sMessage As String)
	Dim ae As WixMessageBox
	ae.Initialize("").SetTypeAlertError(True).SetTitle(sTitle).SetText(sMessage)
	Alert(ae.Item)
End Sub

'set a warning
Sub Warn(sTitle As String, sMessage As String)
	Dim ae As WixMessageBox
	ae.Initialize("").SetTypeAlertWarning(True).SetTitle(sTitle).SetText(sMessage)
	Alert(ae.Item)
End Sub

'set inform
Sub Inform(sTitle As String, sMessage As String)
	Dim ae As WixMessageBox
	ae.Initialize("").SetTitle(sTitle).SetText(sMessage)
	Alert(ae.Item)
End Sub

'create message box
Sub MsgBox(msgid As String) As WixMessageBox
	msgid = msgid.tolowercase
	Dim msg As WixMessageBox
	msg.Initialize(msgid)
	Return msg 
End Sub

'save text to a file
Sub SaveText2File(content As String, fileName As String)
	Dim fc As List
	fc.Initialize
	fc.Add(content)
	Dim blob As BANanoObject
	blob.Initialize2("Blob",Array(fc, CreateMap("type": "text/plain;charset=utf-8")))
	BANano.RunJavascriptMethod("saveAs",Array(blob,fileName))
End Sub

Sub MvField(sValue As String, iPosition As Int, Delimiter As String) As String
	If sValue.Length = 0 Then Return ""
	Dim xPos As Int
	xPos = sValue.IndexOf(Delimiter)
	If xPos = -1 Then Return sValue
	Dim mValues() As String
	Dim tValues As Int
	If sValue.EndsWith(Delimiter) Then sValue = sValue & " "
	mValues = BANano.Split(Delimiter, sValue)
	tValues = mValues.Length -1
	Select Case iPosition
		Case -1
			Return mValues(tValues)
		Case -2
			Return mValues(tValues - 1)
		Case -3
			Dim sb As StringBuilder
			sb.Initialize
			Dim startcnt As Int
			For startcnt = 1 To tValues
				sb.Append(mValues(startcnt)).append(Delimiter)
			Next
			sb.Remove(sb.Length-Delimiter.Length,sb.Length)
			Return sb.tostring
		Case Else
			iPosition = iPosition - 1
			If iPosition <= -1 Then Return mValues(tValues)
			If iPosition > tValues Then Return ""
			Return mValues(iPosition)
	End Select
End Sub


'this will also set the extra folder name
Sub SetAppName(aName As String) As WixPage
	Dim extraFolder As String = $"http://localhost/${aName}/extras"$
	SetExtrasFolder(extraFolder)
	Return Me
End Sub

'set values using json
Sub SetValuesJSON(t As String, j As String)
	t = t.ToLowerCase
	Dim mm As Map = Json2Map(j)
	SetValues(t,mm)
End Sub

Sub MvCount(strMV As String, Delimiter As String) As Int
	Dim spValues() As String = BANano.Split(Delimiter,strMV)
	Return spValues.Length
End Sub

'add item
Sub AddNode(treeID As String, parentID As String, meID As String, mValue As String, mhref As String, mIcon As String, badge As String, target As String, mOpen As Boolean) As WixPage
	treeID = treeID.ToLowerCase
	parentID = parentID.tolowercase
	meID = meID.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", meID)
	mitem.Put("value", mValue)
	mitem.Put("href", mhref)
	mitem.Put("badge", badge)
	mitem.Put("target", target)
	mitem.Put("icon", mIcon)
	mitem.Put("open", mOpen)
	mitem.Put("parentid", parentID)
	If parentID = "" Then
		Dollar.Selector(treeID).RunMethod("add", Array(mitem,1))
	Else
		Dollar.Selector(treeID).RunMethod("add", Array(mitem,-1,parentID))
	End If
	Return Me
End Sub

Sub AddToTree(treeID As String, child As WixElement)
	If child.ParentID = "" Then
		Dollar.Selector(treeID).RunMethod("add", Array(child,1))
	Else
		Dollar.Selector(treeID).RunMethod("add", Array(child,-1,child.parentID))
	End If
End Sub


'convert a map to a json string using BANanoJSONGenerator
Sub Map2Json(mp As Map) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize(mp)
	Return JSON.ToString
End Sub

Sub Map2JsonPretty(mp As Map) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize(mp)
	Return JSON.ToPrettyString(4)
End Sub


'convert a json string to a map
Sub Json2Map(strJSON As String) As Map
	Dim json As BANanoJSONParser
	Dim Map1 As Map
	Map1.Initialize
	Map1.clear
	Try
		If strJSON.length > 0 Then
			json.Initialize(strJSON)
			Map1 = json.NextObject
		End If
		Return Map1
	Catch
		Return Map1
	End Try
End Sub


'convert a list to json
Sub List2Json(mp As List) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize2(mp)
	Return JSON.ToString
End Sub

' convert a json string to a list
Sub Json2List(strValue As String) As List
	Dim lst As List
	lst.Initialize
	lst.clear
	If strValue.Length = 0 Then
		Return lst
	End If
	Try
		Dim parser As BANanoJSONParser
		parser.Initialize(strValue)
		Return parser.NextArray
	Catch
		Return lst
	End Try
End Sub

'initialize the page and empty the page '#body' element
Public Sub Initialize(pgID As String, pgContainer As String) As WixPage
	hints.Initialize 
	Dollar.Initialize("$$")
	ID = pgID.tolowercase
	webix.Initialize("webix")
	Page.Initialize(ID)
	'init other stuff
	EnumButtonTypes.Initialize
	EnumLayoutTypes.Initialize  
	EnumWixIcons.Initialize
	SetContainer(pgContainer)
	BuildViews
	'
	Dim inValue As Object
	webix.GetField("rules").SetField("isNumberOrBlank", BANano.CallBack(Me,"isNumberOrBlank", Array(inValue)))
	webix.GetField("rules").SetField("isEmailOrBlank", BANano.CallBack(Me,"isEmailOrBlank", Array(inValue)))
	Return Me
End Sub

'object values to list
Sub objectAsArray(inObject As Map) As List
	Dim lst As List
	lst.Initialize
	For Each skey As String In inObject.Keys
		Dim sval As Object = inObject.Get(skey)
		lst.Add(sval)
	Next
	Return lst
End Sub

Sub isNumberOrBlank(inValue As Object) As Boolean
	If inValue = "" Then Return True
	Dim bValue As Boolean = webix.GetField("rules").RunMethod("isNumber", Array(inValue))
	Return bValue
End Sub

Sub isEmailOrBlank(inValue As Object) As Boolean
	If inValue = "" Then Return True
	Dim bValue As Boolean = webix.GetField("rules").RunMethod("isEmail", Array(inValue))
	Return bValue
End Sub

Sub BuildViews
	Views.Initialize
	Views.Add("")
	Views.AddAll(Array("textarea","spacer","form","window","accordion","tabview","datatable","text","hint","property","toolbar"))
	Views.AddAll(Array("icon","button","segmented","tree","fieldset","suggest","forminput","pager","sidebar","switch","checkbox"))
	Views.AddAll(Array("list","dataview","layout","tabbar","menu","carousel","sidemenu","comments","contextmenu","unitlist"))
	Views.AddAll(Array("context","chart","multiview","combo","radio","richselect","counter","colorpicker","datepicker","label"))
	Views.AddAll(Array("resizer","select","search","slider","richtext","dbllist","treetable","popup","iframe","grouplist"))
	Views.AddAll(Array("google-map","uploader","video","template","scrollview","flexlayout","toggle","row","column"))
	Views.AddAll(Array("geochart","calendar","image"))
	Views.Sort(True)
End Sub

'set extras folder
Sub SetExtrasFolder(fld As String) As WixPage
	'set extras folder for offline export
	webix.GetField("env").SetField("cdn", fld)
	Return Me
End Sub

'set locale
Sub SetLocale(locale As String) As WixPage
	Dim i18n As BANanoObject = webix.GetField("i18n")
	i18n.RunMethod("setLocale", Array(locale))
	Return Me
End Sub

'own date format
'"%Y-%m-%d"
'"%m/%d/%y"
'"%M %y"
'"W:%W %D"
Sub DateToStr(f As String) As Object
	Dim df As BANanoObject = webix.GetField("Date")
	Dim df1 As Object = df.RunMethod("dateToStr", Array(f)).result
	Return df1
End Sub

'current locale date format
Sub LocateDateFormat() As Object   'ignore
	Dim df As Object = webix.GetField("i18n").GetField("dateFormatStr").Result
	Return df
End Sub

'current locate long date format
Sub LocaleLongDateFormat() As Object   'ignore
	Dim df As Object = webix.GetField("i18n").GetField("longDateFormatStr").Result
	Return df
End Sub

'current locate number format
Sub LocaleNumberFormat(r As Boolean) As Object   'ignore
	Dim df As Object = webix.GetField("i18n").GetField("numberFormat").Result
	Return df
End Sub

'current locale price format
Sub LongPriceFormat(r As Boolean) As Object   'ignore
	Dim df As Object = webix.GetField("i18n").GetField("priceFormat").Result
	Return df
End Sub

'set reponsive
Sub SetResponsive(b As Object) As WixPage
	Page.SetResponsive(b)
	Return Me
End Sub

'set reponsivecell
Sub SetResponsiveCell(b As Object) As WixPage
	Page.SetResponsiveCell(b)
	Return Me
End Sub


'set min width
Sub SetMinWidth(w As Int) As WixPage
	Page.SetMinWidth(w)
	Return Me
End Sub

'set minheight
Sub SetMinHeight(h As Int) As WixPage
	Page.SetMinHeight(h)
	Return Me
End Sub

'add rows
Sub AddWixRows(lst As List)
	For Each i As WixRow In lst
		AddRow(i)
	Next
End Sub

'set scroll
Sub SetScroll(b As Object) As WixPage
	Page.SetAttr("scroll", b)
	Return Me
End Sub

'set gravity
Sub SetGravity(g As Int) As WixPage
	Page.SetGravity(g)
	Return Me
End Sub

'set view
Sub SetView(v As String) As WixPage
	Page.SetView(v)
	Return Me
End Sub

'add rows cells
Sub AddRowsCells(mCells As List) As WixPage
	Dim opt As Map = CreateMap()
	opt.Put("cells", mCells)
	AddRows(opt)
	Return Me
End Sub

'set uniteby should be an existing field
Sub SetUniteBy(ulID As String, fldName As String)
	ulID = ulID.tolowercase
	fldName = fldName.tolowercase
	uniteFld = fldName
	ulName = ulID
	'define unite by
	Dim obj As Map
	Dim cb As BANanoObject = BANano.CallBack(Me, "uniteby", Array(obj))
	Dim opt As Map = CreateMap()
	opt.Put("uniteBy", cb)
	Define(ulName, opt)
	Refresh(ulName)
End Sub

private Sub uniteby(obj As Map) As String
	Dim stitle As String = obj.Get(uniteFld)
	Dim ub As String = stitle.SubString2(0,1)
	Return ub
End Sub


'set height
Sub SetHeight(h As Object) As WixPage
	Page.setHeight(h)
	Return Me
End Sub

'set width
Sub SetWidth(w As Object) As WixPage
	Page.SetWidth(w)
	Return Me
End Sub

'set css
Sub SetStyle(prop As String, sval As String) As WixPage
	Page.SetStyle(prop,sval)
	Return Me
End Sub

'set the container of the page
Sub SetContainer(contID As String) As WixPage
	contID = contID.tolowercase
	Dim sKey As String = "#" & contID
	Page.SetContainer(contID)
	BANano.GetElement(sKey).empty
	Return Me
End Sub

'define to update properties
Sub Define(eID As String, properties As Map)
	eID = eID.ToLowerCase
	Dollar.Selector(eID).RunMethod("define",Array(properties))
End Sub

Sub GetColumnConfig(eID As String, colID As String) As BANanoObject
	eID = eID.ToLowerCase
	colID = colID.tolowercase
	'get the grid
	Dim grd As BANanoObject = Dollar.Selector(eID)
	Dim colDef As BANanoObject = grd.RunMethod("getColumnConfig", Array(colID))
	Return colDef
End Sub

'set a progress bar to an element
Sub SetProgressBar(eid As String, pbdef As WixProgressBar)
	eid = eid.tolowercase
	Dim pb As BANanoObject = webix.GetField("ProgressBar")
	Dim itm As BANanoObject = Dollar.Selector(eid)
	webix.RunMethod("extend", Array(itm, pb))'
	itm.RunMethod("showProgress", pbdef.Item)
End Sub

'unset the progress bar
Sub UnsetProgressBar(eid As String)
	eid = eid.ToLowerCase
	Dollar.Selector(eid).RunMethod("hideProgress",Null)
End Sub

'get the banano object of the element
Sub GetElementByID(eid As String) As BANanoObject
	eid = eid.tolowercase
	Dim bo As BANanoObject = Dollar.Selector(eid)
	Return bo
End Sub

'update the column header for the data table
Sub SetDataColumnHeaderText(grd As String, colid As String, pos As Int, text As String)
	'update the column configuration
	Dim bo As BANanoObject = GetColumnConfig(grd, colid)
	Dim headers As List = bo.GetField("header").Result
	Dim hdr1 As Map = headers.Get(pos)
	hdr1.Put("text", text)
	bo.SetField("header", headers)
End Sub

'update the column header for the data table
Sub SetDataColumnHeaderTextMulti(grd As String, pos As Int, textMap As Map)
	For Each k As String In textMap.Keys
		Dim v As String = textMap.Get(k)
		SetDataColumnHeaderText(grd, k, pos, v)
	Next
End Sub

'update a data column property
Sub SetDataColumn(grd As String, colid As String, props As Map)
	grd = grd.ToLowerCase
	colid = colid.tolowercase
	Dim colDef As BANanoObject = GetColumnConfig(grd,colid)
	For Each mk As String In props.Keys
		Dim mv As Object = props.Get(mk)
		colDef.SetField(mk, mv)
	Next
End Sub

'get the webix app
Sub GetWebix As BANanoObject
	Return webix
End Sub

'run after pageui to add popups to propertybag
Sub RegisterTypePopUp(eID As String)
	eID = eID.ToLowerCase
	Dim p As Map = CreateMap()
	p.Put("editor", "popup")
	Dollar.Selector(eID).RunMethod("registerType",Array("popup", p))
End Sub

'update properties
Sub Update(eid As String, propertyMap As Map)
	eid = eid.tolowercase
	Define(eid, propertyMap)
	Refresh(eid)
End Sub

'update a single property
Sub UpdateProperty(eID As String, prop As String, sval As String)
	eID = eID.tolowercase
	Dim pv As Map = CreateMap()
	pv.Put(prop, sval)
	Define(eID, pv)
	Refresh(eID)
End Sub

'select a node to a tree
Sub SelectItem(treeID As String, nodeID As String)
	treeID = treeID.ToLowerCase
	nodeID = nodeID.tolowercase
	Dollar.Selector(treeID).RunMethod("select", Array(nodeID))
End Sub

'collapse an item
Sub Collapse(nodeID As String)
	nodeID = nodeID.tolowercase
	Dollar.Selector(nodeID).RunMethod("collapse", Null)
End Sub

Sub EditRow(dt As String, rowid As String)
	dt = dt.tolowercase
	rowid = CStr(rowid)
	Dollar.Selector(dt).RunMethod("editRow", Array(rowid))
End Sub

Sub FocusEditor(dt As String, colid As String)
	dt = dt.tolowercase
	colid = CStr(colid)
	colid = colid.tolowercase
	Dollar.Selector(dt).RunMethod("focusEditor", Array(colid))
End Sub

Sub AddNotSelected(lst As List)
	Dim q As String = "$"
	Dim k1 As String = q & "empty"
	Dim opt As Map = CreateMap()
	opt.Put("id", k1)
	opt.Put("value", "-- Not selected --")
	opt.Put(k1, True)
	lst.InsertAt(0, opt)
End Sub

Sub Back(nodeID As String)
	nodeID = nodeID.tolowercase
	Dollar.Selector(nodeID).RunMethod("back", Null)
End Sub

'open a tree node
Sub Open(treeID As String, nodeID As String)
	treeID = treeID.tolowercase
	nodeID = nodeID.tolowercase
	Dollar.Selector(treeID).RunMethod("open", Array(nodeID, True))
End Sub

'close a tree node
Sub Close(treeID As String, nodeID As String)
	treeID = treeID.tolowercase
	nodeID = nodeID.tolowercase
	Dollar.Selector(treeID).RunMethod("close", Array(nodeID))
End Sub


'close a tree node
Sub CloseAll(treeID As String)
	treeID = treeID.tolowercase
	Dollar.Selector(treeID).RunMethod("closeAll", Null)
End Sub


'close a tree node
Sub OpenAll(treeID As String)
	treeID = treeID.tolowercase
	Dollar.Selector(treeID).RunMethod("openAll", Null)
End Sub


'call after the ux is rendered
Sub SetData(eID As String, data As List)
	eID = eID.tolowercase
	Define(eID, CreateMap("data":data))
	Refresh(eID)
End Sub

Sub SetBody(eID As String, data As Object)
	eID = eID.tolowercase
	Define(eID, CreateMap("body":data))
	Refresh(eID)
End Sub

'call after the ux is rendered
Sub SetBadge(eID As String, badge As Object)
	eID = eID.tolowercase
	Define(eID, CreateMap("badge":badge))
	Refresh(eID)
End Sub

Sub SetOptions(eID As String, data As List)
	eID = eID.tolowercase
	Define(eID, CreateMap("options":data))
	Refresh(eID)
End Sub

Sub SetSuggest(eID As String, data As List)
	eID = eID.tolowercase
	Define(eID, CreateMap("suggest":data))
	Refresh(eID)
End Sub


Sub RefreshColumns(nodeID As String)
	nodeID = nodeID.tolowercase
	Dollar.Selector(nodeID).RunMethod("refreshColumns", Null)
End Sub

'focus an item
Sub Focus(nodeID As String)
	nodeID = nodeID.tolowercase
	Dollar.Selector(nodeID).RunMethod("focus", Null)
End Sub

Sub addCSS(eID As String, css2add As String)
	eID = eID.tolowercase
	'get the node
	Dim node As BANanoObject = getNode(eID)
	webix.GetField("html").RunMethod("addCss", Array(node, css2add))
End Sub

Sub getNode(eID As String) As BANanoObject
	eID = eID.ToLowerCase
	Dim bo As BANanoObject = Dollar.Selector(eID).RunMethod("getNode", Null)
	Return bo
End Sub

'expand an item
Sub Expand(nodeID As String)
	nodeID = nodeID.tolowercase
	Dollar.Selector(nodeID).RunMethod("expand", Null)
End Sub

'clear the datatable
Sub ClearDataTable(d As Int)
	ClearAll(d)
End Sub

Sub LoadDataTable(d As String, autoConfig As Boolean, data As List)
	Define(d, CreateMap("autoConfig":autoConfig,"data":data))
	Refresh(d)
End Sub

'set a hint for input element
Sub SetHint(eID As String, sHint As String)
	eID = eID.tolowercase
	hints.Put(eID,sHint)
End Sub

Sub OnItemDblClick(eid As String, cb As BANanoObject)
	eid = eid.tolowercase
	Dollar.Selector(eid).RunMethod("attachEvent",Array("onItemDblClick",cb))
End Sub

'attach an event to a bananoobject
Sub OnItemDblClickBO(bo As BANanoObject, module As Object, methodName As String, params As List)
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, params)
	bo.RunMethod("attachEvent",Array("onItemDblClick", cb))
End Sub

Sub OnKeyPress(eid As String, cb As BANanoObject)
	eid = eid.tolowercase
	Dollar.Selector(eid).RunMethod("attachEvent",Array("onKeyPress",cb))
End Sub

Sub onBeforeDrop(eid As String, cb As BANanoObject)
	eid = eid.tolowercase
	Dollar.Selector(eid).RunMethod("attachEvent",Array("onBeforeDrop",cb))
End Sub

Sub OnBeforeLoad(eid As String, cb As BANanoObject)
	eid = eid.ToLowerCase
	Dollar.Selector(eid).RunMethod("attachEvent",Array("onBeforeLoad",cb))
End Sub

Sub OnAfterLoad(eid As String, cb As BANanoObject)
	eid = eid.ToLowerCase
	Dollar.Selector(eid).RunMethod("attachEvent",Array("onAfterLoad",cb))
End Sub

'check existence of an object
Sub ViewExists(eid As String) As Boolean
	eid = eid.ToLowerCase
	Dim bHas As Boolean = Dollar.Selector(eid).RunMethod("exists",Null).result
	Return bHas
End Sub


Sub ShowOverlay(eid As String, msg As Object)
	eid = eid.ToLowerCase
	Dollar.Selector(eid).RunMethod("showOverlay",Array(msg))
End Sub

Sub HideOverlay(eid As String)
	eid = eid.ToLowerCase
	Dollar.Selector(eid).RunMethod("hideOverlay",Null)
End Sub

Sub Print(eid As String, options As WixPrint)
	eid = eid.ToLowerCase
	Dim bo As BANanoObject = Dollar.Selector(eid)
	webix.RunMethod("print", Array(bo, options.Item))
End Sub


'attach events after page is created
Sub OnChange(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onChange",cb))
End Sub

'attach events after page is created
Sub OnEnter(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onEnter",cb))
End Sub

'attach events after page is created
Sub OnLiveEdit(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onLiveEdit",cb))
End Sub

'attach events after page is created
Sub OnTimedKeyPress(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onTimedKeyPress",cb))
End Sub

'attach event onAfterTabClick for segment button
Sub OnAfterTabClick(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterTabClick",cb))
End Sub

'attach events after page is created
Sub OnCheck(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onCheck",cb))
End Sub


'attach events after page is created
Sub OnSelectChange(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onSelectChange",cb))
End Sub


'add resizer
Sub AddResizerToColumns(s As String)   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddColumns(r.Item)
End Sub

Sub AddColumnsResizer(s As String)   'ignore
	Dim r As WixResizer
	r.Initialize("")
	AddColumns(r.Item)
End Sub

'add a spacer to the rows
Sub AddRowsSpacer()
	Dim s As WixElement
	s.Initialize("").SetView("spacer")
	AddRows(s.item)
End Sub

'add a spacer to the columns
Sub AddColumnsSpacer()
	Dim s As WixElement
	s.Initialize("").SetView("spacer")
	AddColumns(s.item)
End Sub

'Refresh
Sub Refresh(eID As String)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("refresh",Null)
End Sub

'replace
Sub ReplaceView(config As Map, parentid As String, childid As String)
	parentid = parentid.ToLowerCase
	childid = childid.tolowercase
	'get the parent
	Dim parent As BANanoObject = Dollar.Selector(parentid)
	'get the child
	Dim child As BANanoObject = Dollar.Selector(childid)
	'run the replace
	webix.RunMethod("ui", Array(config,parent,child))
End Sub

'freeze row
Sub FreezeRow(dtID As String, r As Int)
	dtID = dtID.ToLowerCase
	Dollar.Selector(dtID).RunMethod("freezeRow", Array(r))
End Sub

'moveBottom
Sub MoveBottom(dtID As String, r As Int)
	dtID = dtID.ToLowerCase
	Dollar.Selector(dtID).RunMethod("moveBottom", Array(r))
End Sub

'moveTop
Sub MoveTop(dtID As String, r As Int)
	dtID = dtID.ToLowerCase
	Dollar.Selector(dtID).RunMethod("moveTop", Array(r))
End Sub

'move
Sub Move(dtID As String, r As Int)
	dtID = dtID.ToLowerCase
	Dollar.Selector(dtID).RunMethod("move", Array(r))
End Sub

'set header title of the page
Sub SetHeader(sTitle As String) As WixPage
	'create a header to add to the page
	Dim hdr As WixHeader
	hdr.Initialize("hdr")
	hdr.Header.SetTemplate(sTitle)
	hdr.Header.AddToRows(Page)
	Return Me
End Sub

'set type
Sub SetType(t As String) As WixPage
	Page.SetType(t)
	Return Me
End Sub


'make clean layout
Sub SetTypeClean(a As String) As WixPage  'ignore
	SetType("clean")
	Return Me
End Sub

'make line layout
Sub SetTypeLine(a As String) As WixPage   'ignore
	SetType("line")
	Return Me
End Sub

'make wide layout
Sub SetTypeWide(a As String) As WixPage   'ignore
	SetType("wide")
	Return Me
End Sub

'make space layout
Sub SetTypeSpace(a As String) As WixPage   'ignore
	SetType("space")
	Return Me
End Sub

'make a head layout
Sub SetTypeHead(a As String) As WixPage   'ignore
	SetType("head")
	Return Me
End Sub

'make form layout
Sub SetTypeForm(a As String) As WixPage  'ignore
	SetType("form")
	Return Me
End Sub

'use a map object
Sub SetMap(m As Map) As WixPage
	For Each strKey As String In m.Keys
		Dim strVal As String = m.Get(strKey)
		Page.SetAttr(strKey, strVal)
	Next
	Return Me
End Sub


'add row items
Sub AddRowItems(items As List)
	For Each m As Map In items
		AddRows(m)
	Next
End Sub

'add a row
Sub AddRow(r As WixRow)
	Page.AddRow(r)
End Sub

'add item to a row
Sub AddRows(itm As Map)
	Page.AddRows(itm)
End Sub

'return item
Sub Item As Map
	Return Page.item
End Sub

'add item to a column
Sub AddColumns(itm As Map)
	Page.AddColumns(itm)
End Sub

'set the item value
Sub SetValue(itm As String, value As String)
	itm = itm.ToLowerCase
	Dollar.Selector(itm).RunMethod("setValue",Array(value))
End Sub

'get toolbar height
Sub GetToolBarHeight(itm As String) As Int
	itm = itm.ToLowerCase
	Dim hfld As String = "$" & "height"
	Dim res As Int = Dollar.Selector(itm).GetField(hfld)
	Return res
End Sub

Sub SetSideMenuState(toolbar As String, sidemenu As String)
	toolbar = toolbar.tolowercase
	sidemenu = sidemenu.tolowercase
	Dim th As Int = GetToolBarHeight(toolbar)
	Dim state As BANanoObject = Dollar.Selector(sidemenu).GetField("state")
	'
	Dim sh As Int = state.GetField("height")
	sh = sh - th
	state.SetField("top", th)
	state.setfield("height", sh)
End Sub

'get an item value
Sub GetValue(itm As String) As String
	itm = itm.ToLowerCase
	Dim res As String
	res = Dollar.Selector(itm).RunMethod("getValue",Null).result
	res = CStr(res)
	res = res.trim
	Return res
End Sub

'set the form values
Sub SetValues(itm As String, values As Map)
	itm = itm.ToLowerCase
	Dollar.Selector(itm).RunMethod("setValues",Array(values))
End Sub

'get the form values all trimmed
Sub GetValues(itm As String) As Map
	itm = itm.ToLowerCase
	Dim res As Map
	res = Dollar.Selector(itm).RunMethod("getValues",Null).result
	For Each mk As String In res.Keys
		Dim mv As String = res.GetDefault(mk,"")
		mv = CStr(mv)
		mv = mv.trim
		res.Put(mk, mv)
	Next
	Return res
End Sub

'hide an element
Sub Hide(itmID As String)
	itmID = itmID.ToLowerCase
	Dollar.Selector(itmID).RunMethod("hide","")
End Sub

'show an element
Sub Show(itmID As String)
	itmID = itmID.ToLowerCase
	Dollar.Selector(itmID).RunMethod("show","")
End Sub

'enable an element
Sub Enable(itmID As String)
	itmID = itmID.ToLowerCase
	Dollar.Selector(itmID).RunMethod("enable","")
End Sub

'disable an element
Sub Disable(itmID As String)
	itmID = itmID.ToLowerCase
	Dollar.Selector(itmID).RunMethod("disable","")
End Sub

'enable disable element
Sub EnableDisable(itmID As String, bVal As Boolean)
	If bVal Then 
		Enable(itmID)
	Else
		Disable(itmID)
	End If
End Sub

'render the page UX
Sub UI()
	webix.RunMethod("ui",Array(Page.item))
	'add hints
	For Each sHint As String In hints.Keys
		Dim sValue As String = hints.Get(sHint)
		SetBottomText(sHint, sValue)
	Next
End Sub

Sub UIFullScreen
	webix.GetField("ui").RunMethod("fullScreen",Null)
End Sub

'resize top level ui elements
Sub UIResize
	webix.GetField("ui").RunMethod("resize", Null)
End Sub

'set to full screen an element
Sub FullScreen(i As Object) 
	webix.GetField("fullscreen").RunMethod("set", Array(i))
End Sub

Sub ExitFullScreen
	webix.GetField("fullscreen").RunMethod("exit",Null)
End Sub

'message user
Sub Message(msg As String)
	webix.RunMethod("message", Array(msg))
End Sub

'message error
Sub Message_Error(msg As String)
	Dim opt As Map = CreateMap()
	opt.Put("text", msg)
	opt.Put("type", "error")
	webix.RunMethod("message", Array(opt))
End Sub

'message success
Sub Message_Success(msg As String)
	Dim opt As Map = CreateMap()
	opt.Put("text", msg)
	opt.Put("type", "success")
	webix.RunMethod("message", Array(opt))
End Sub

'message debug
Sub Message_Debug(Msg As String)
	Dim opt As Map = CreateMap()
	opt.Put("text", Msg)
	opt.Put("type", "debug")
	webix.RunMethod("message", Array(opt))
End Sub

'aler user, create with wixmessagebox
Sub Alert(Msg As Object)
	webix.RunMethod("alert", Array(Msg))
End Sub

'create with wixmessagebox
Sub Confirm1(Msg As Object)
	webix.RunMethod("confirm", Array(Msg))
End Sub

'create with wixmessagebox
Sub ModalBox(Msg As Map)
	webix.RunMethod("modalbox", Array(Msg))
End Sub

'show an error message
Sub ToastError(Text As String)
	Dim Msg As Map = CreateMap()
	Msg.put("type","error")
	Msg.put("text", Text)
	webix.RunMethod("message", Array(Msg))
End Sub

'confirm dialog
Sub Confirm(CallBack As BANanoObject, stitle As String, stext As String)
	Dim opt As Map = CreateMap()
	opt.Put("title", stitle)
	opt.Put("text", stext)
	opt.Put("callback", CallBack)
	webix.RunMethod("confirm", opt)
End Sub

'clear the form
Sub Clear(itm As String)
	itm = itm.tolowercase
	Dollar.Selector(itm).RunMethod("clear",Null)
End Sub

'sub clearValidation use with clear form
Sub ClearValidation(elID As String)
	elID = elID.ToLowerCase
	Dollar.Selector(elID).RunMethod("clearValidation", Null)
End Sub

'add a record to the list
Sub Add(listID As String, record As Map)
	listID = listID.tolowercase
	Dollar.Selector(listID).RunMethod("add",Array(record))
End Sub

Sub CStr(o As Object) As String
	Return "" & o
End Sub

Sub EnableMulti(m As List)
	For Each a As String In m
		Enable(a)
	Next
End Sub

Sub DisableMulti(m As List)
	For Each a As String In m
		Disable(a)
	Next
End Sub

Sub HideMulti(m As List)
	For Each a As String In m
		Hide(a)
	Next
End Sub

Sub ShowMulti(m As List)
	For Each a As String In m
		Show(a)
	Next
End Sub

'update item
Sub UpdateItem(ownerID As String, recID As String, recData As Map)
	ownerID = CStr(ownerID)
	recID = CStr(recID)
	ownerID = ownerID.ToLowerCase
	Dollar.Selector(ownerID).RunMethod("updateItem",Array(recID, recData))
End Sub

'get an item
Sub GetItem(listID As String, recordID As String) As Map
	listID = CStr(listID)
	recordID = CStr(recordID)
	listID = listID.ToLowerCase
	Dim values As Map = Dollar.Selector(listID).RunMethod("getItem",Array(recordID)).Result
	Return values
End Sub

'get an item
Sub GetMarker(listID As String, recordID As String) As Map
	Dim mKey As String = "$" & "marker"
	listID = listID.ToLowerCase
	recordID = recordID.tolowercase
	Dim values As Map = Dollar.Selector(listID).RunMethod("getItem",Array(recordID)).Result
	values.Remove(mKey)
	Return values
End Sub

Sub OnAfterFileAdd(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterFileAdd",cb))
End Sub


Sub OnBeforeFileAdd(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onBeforeFileAdd",cb))
End Sub


Sub OnUploadComplete(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onUploadComplete",cb))
End Sub

Sub onFileUploadError(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onFileUploadError",cb))
End Sub

Sub GetRowIDFromContext(bo As BANanoObject) As String
	Dim context As Map = bo.GetField("context").Result
	Dim rowid As String = context.Get("rowid")
	rowid = CStr(rowid)
	Return rowid
End Sub

Sub onFileUpload(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onFileUpload",cb))
End Sub

'on after select event
Sub OnAfterSelect(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterSelect",cb))
End Sub

Sub OnItemClick(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onItemClick",cb))
End Sub

Sub OnItemClickBO(bo As BANanoObject, module As Object, methodName As String, params As List)
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, params)
	bo.RunMethod("attachEvent",Array("onItemClick",cb))
End Sub

Sub OnAfterEditStart(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterEditStart",cb))
End Sub

Sub OnAfterEditStop(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterEditStop",cb))
End Sub


Sub OnClick(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onClick",cb))
End Sub

Sub OnMenuItemClick(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onMenuItemClick",cb))
End Sub


'on after unselect event
Sub OnAfterUnSelect(eID As String, cb As BANanoObject)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("attachEvent",Array("onAfterUnSelect",cb))
End Sub


'serialize all data
Sub Serialize(eID As String) As List
	eID = eID.ToLowerCase
	Dim res As List = Dollar.Selector(eID).RunMethod("serialize",Array(True)).result
	Return res
End Sub

'remove an item from a list
Sub Remove(listID As String, recID As String)
	listID = listID.tolowercase
	If recID = "" Then Return
	Dollar.Selector(listID).RunMethod("remove",Array(recID))
End Sub

'get the selected item column, row and id
private Sub GetWixSelectedID(listID As String) As WixSelectedID
	listID = listID.tolowercase
	Dim si As Map = Dollar.Selector(listID).RunMethod("getSelectedId",Null).Result
	'
	Dim sio As WixSelectedID
	sio.Initialize
	sio.column = si.Get("column")
	sio.row = si.Get("row")
	sio.id = si.Get("id")
	Return sio
End Sub

'stringify
Sub Stringify(o As Object) As Object
	Dim res As Object = webix.RunMethod("stringify", Array(o)).result
	Return res
End Sub

'execute string
Sub Exec(s As Object) As BANanoObject
	Dim res As Object = webix.RunMethod("exec", Array(s)).result
	Return res
End Sub

'get the selected item column, row and id
Sub GetSelectedID(listID As String) As Object
	listID = listID.tolowercase
	Dim si As String = Dollar.Selector(listID).RunMethod("getSelectedId",Null).Result
	Return si
End Sub

'get the selected item
Sub GetSelected(listID As String) As Object
	listID = CStr(listID)
	listID = listID.tolowercase
	Dim recID As String = Dollar.Selector(listID).RunMethod("getSelected",Null).Result
	Return recID
End Sub

'get the selected item
Sub GetSelectedItem(listID As String, bMulti As Boolean) As List
	listID = listID.tolowercase
	Dim recID As List = Dollar.Selector(listID).RunMethod("getSelectedItem",Array(bMulti)).Result
	Return recID
End Sub

'get the selected item
Sub Exists(listID As String, eID As String) As Object
	listID = listID.tolowercase
	eID = eID.tolowercase
	Dim recID As String = Dollar.Selector(listID).RunMethod("exists",Array(eID)).Result
	Return recID
End Sub

'show an item by scrolling to it
Sub ShowItem(listID As String, eID As String)
	eID = CStr(eID)
	listID = listID.tolowercase
	eID = eID.tolowercase
	Dollar.Selector(listID).RunMethod("showItem",Array(eID))
End Sub

'show / hide a batch
Sub ShowBatch(listID As String, b As Boolean)
	listID = listID.tolowercase
	Dollar.Selector(listID).RunMethod("showBatch",Array(b))
End Sub

Sub SelectDate(eid As String, eDate As String, bShow As Boolean)
	eid = eid.tolowercase
	Dollar.Selector(eid).RunMethod("selectDate",Array(eDate, bShow))
End Sub

'show calendar based on the date
Sub ShowCalendar(eid As String, eDate As String)
	eid = eid.tolowercase
	Dollar.Selector(eid).RunMethod("showCalendar",Array(eDate))
End Sub

Sub GetSelectedDate(eid As String) As Object
	eid = eid.tolowercase
	Dim res As Object = Dollar.Selector(eid).RunMethod("getSelectedDate",Null)
	Return res
End Sub

Sub GetVisibleDate(eid As String) As Object
	eid = eid.tolowercase
	Dim res As Object = Dollar.Selector(eid).RunMethod("getVisibleDate",Null)
	Return res
End Sub


'get dirty values
Sub GetDirtyValues(frmID As String) As Map
	frmID = frmID.ToLowerCase
	Dim rec As Map = CreateMap()
	rec = Dollar.Selector(frmID).RunMethod("getDirtyValues",Null).Result
	Return rec
End Sub

'get clean values
Sub GetCleanValues(frmID As String) As Map
	frmID = frmID.ToLowerCase
	Dim rec As Map = CreateMap()
	rec = Dollar.Selector(frmID).RunMethod("getCleanValues",Null).Result
	Return rec
End Sub

'set hint
Sub SetBottomText(eID As String, eText As String)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("setBottomText",Array(eText))
End Sub

'add a view
Sub AddView(parentid As String, itm As Map)
	parentid = parentid.tolowercase
	Dim bo As BANanoObject = UX(itm)
	Dim prt As BANanoObject = Dollar.Selector(parentid)
	prt.RunMethod("addView",Array(bo))
End Sub


'add a view
Sub RemoveView(parentid As String, childid As String)
	parentid = parentid.tolowercase
	childid = childid.tolowercase
	Dollar.Selector(parentid).RunMethod("removeView",Array(childid))
End Sub

'Start hint
Sub StartHint(h As WixHint)
	'webix.ui(hint).start();
	Dim oh As BANanoObject = UX(h.Item)
	oh.RunMethod("start", Null)
End Sub

'adjust
Sub Adjust(eID As String)
	eID = eID.ToLowerCase
	Dollar.Selector(eID).RunMethod("adjust",Null)
End Sub

'resize
Sub Resize(eID As String)
	eID = eID.ToLowerCase
	Dollar.Selector(eID).RunMethod("resize",Null)
End Sub

'clear all
Sub ClearAll(eID As String)
	eID = eID.ToLowerCase
	Dollar.Selector(eID).RunMethod("clearAll",Null)
End Sub

'get view from element
Sub View(eID As String) As BANanoObject
	Dim v As String = "$" & "view"
	eID = eID.ToLowerCase
	Dim res As BANanoObject = Dollar.Selector(eID).GetField(v)
	Return res
End Sub

'add a drop zone
Sub AddDropZone(uploader As String, eID As String)
	uploader = uploader.tolowercase
	eID = eID.ToLowerCase
	Dim iView As BANanoObject = View(eID)
	Dollar.Selector(uploader).RunMethod("addDropZone",Array(iView))
End Sub



'parse data, typeOf 'json' (default), 'xml', 'csv', 'jsarray'
Sub Parse(eID As String, data As List, typeOf As String)
	eID = eID.tolowercase
	Dollar.Selector(eID).RunMethod("parse",Array(data, typeOf))
End Sub

'bind a form to a datatable
Sub Bind(frmID As String, datTableID As String)
	frmID = frmID.ToLowerCase
	datTableID = datTableID.ToLowerCase
	Dollar.Selector(frmID).RunMethod("bind",Array(datTableID))
End Sub

Sub BOBind(frmID As String, datTableID As String)
	frmID = frmID.ToLowerCase
	datTableID = datTableID.tolowercase
	'
	Dim target As BANanoObject = Dollar.Selector(datTableID)
	Dollar.Selector(frmID).RunMethod("bind",Array(target))
End Sub


'save the form when a form is bound
Sub Save(frmID As String)
	frmID = frmID.tolowercase
	Dollar.Selector(frmID).RunMethod("save",Null)
End Sub

'open the file dialog
Sub FileDialog(frmID As String, opt As Map)
	frmID = frmID.tolowercase
	Dollar.Selector(frmID).RunMethod("fileDialog",Array(opt))
End Sub

'toggle
Sub Toggle(sbID As String)
	sbID = sbID.tolowercase
	Dollar.Selector(sbID).RunMethod("toggle",Null)
End Sub

'validate
Sub Validate(sbID As String) As Boolean
	sbID = sbID.tolowercase
	Dim res As Boolean = Dollar.Selector(sbID).RunMethod("validate",Null).Result
	Return res
End Sub

'set full screen
Sub WindowFullScreen(wID As String)
	wID = wID.ToLowerCase
	Define(wID, CreateMap("fullscreen":True,"top":0,"left":0))
	Resize(wID)
End Sub

'export element to png
Sub Export2PNG(eID As String)
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	'set options
	Dim opt As Map = CreateMap("filename": eID)
	'execute the stuff
	webix.RunMethod("toPNG", Array(itm, opt))
End Sub

'export element to excel
Sub Export2Excel(eID As String)
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	'set options
	Dim opt As Map = CreateMap("filename": eID)
	'execute the stuff
	webix.RunMethod("toExcel", Array(itm, opt))
End Sub

'export element to excel with options
Sub Export2ExcelOptions(eID As String, options As Map)
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	'execute the stuff
	webix.RunMethod("toExcel", Array(itm, options))
End Sub


'export element to pdf
Sub Export2PDF(eID As String)
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	'set options
	Dim opt As Map = CreateMap("filename": eID)
	'execute the stuff
	webix.RunMethod("toPDF", Array(itm, opt))
End Sub

'export element to csv
Sub Export2CSV(eID As String)
	eID = eID.ToLowerCase
	'select the item
	Dim itm As BANanoObject = Dollar.Selector(eID)
	'set options
	Dim opt As Map = CreateMap("filename": eID)
	'execute the stuff
	webix.RunMethod("toCSV", Array(itm, opt))
End Sub

'set popup
Sub ShowPopUp(sTemplate As String, height As Int, width As Int, position As String)
	Dim p As WixPopUp
	p.Initialize("popupi").SetHeight(height).SetWidth(width).SetPosition(position).SetTemplate(sTemplate)
	Dim pp As BANanoObject = webix.RunMethod("ui",p.item)
	pp.RunMethod("show", Null) 
End Sub

'return ui element from map
Sub BOUI(m As Map) As BANanoObject
	Dim res As BANanoObject = webix.RunMethod("ui", Array(m))
	Return res
End Sub

'return ui element from map
Sub UX(m As Map) As BANanoObject
	Dim res As BANanoObject = webix.RunMethod("ui", Array(m))
	Return res
End Sub

'show an element
Sub BOShow(itm As BANanoObject)
	itm.RunMethod("show", Null)
End Sub

'show an element
Sub BOHide(itm As BANanoObject)
	itm.RunMethod("hide", Null)
End Sub

'Close an element
Sub BOClose(itm As BANanoObject)
	itm.RunMethod("close", Null)
End Sub

'is visible
Sub BOIsVisible(itm As BANanoObject) As Boolean
	Dim res As Boolean = itm.RunMethod("isVisible", Null).result
	Return res
End Sub


'add context
Sub AddContext(ctx As WixContext) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub

'add context menu
Sub AddContextMenu(ctx As WixContextMenu) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub

'add popup menu
Sub AddPopUp(ctx As WixPopUp) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub

'add a window
Sub AddWindow(ctx As WixWindow) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub

'add a messagebox
Sub AddMessageBox(ctx As WixMessageBox) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub


'add a side menu
Sub AddSideMenu(ctx As WixSideMenu) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub


'set name
Sub SetName(n As String) As WixPage
	Page.SetName(n)
	Return Me
End Sub

'add uploader
Sub AddUploader(ctx As WixUploader) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub

'add suggestion
Sub AddSuggestion(ctx As WixSuggest) As BANanoObject
	Dim ctxUX As BANanoObject = UX(ctx.Item)
	Return ctxUX
End Sub

'add toolbar
Sub AddToolBar(tbl As WixToolBar)
	Page.AddRows(tbl.item)
End Sub

'add to parent rows
Sub AddToRows(P As WixElement)
	P.AddRows(Item)
End Sub

'add to parent columns
Sub AddToColumns(P As WixElement)
	P.AddColumns(Item)
End Sub

'add to parent elements
Sub AddToElements(P As WixElement)
	P.AddElements(Item)
End Sub

'delay execution of code
Sub Delay(milliseconds As Int, cb As BANanoObject)
	webix.RunMethod("delay",Array(cb,milliseconds))
End Sub

Sub DePrefix(target As Map) As Map
	Dim nm As Map = CreateMap()
	For Each mk As String In target.Keys
		Dim mv As Object = target.Get(mk)
		Dim mk1 As String = MvField(mk,2,"_")
		nm.Put(mk1,mv)
	Next
	Return nm
End Sub

Sub Pad(Value As String, MaxLen As Int, PadChar As String, right As Boolean) As String
	Dim  intOrdNoLen As Int = Value.Length
	Dim i As Int
	For i = 1 To (MaxLen - intOrdNoLen) Step 1
		If right Then
			Value =  Value & PadChar
		Else
			Value = PadChar & Value
		End If
	Next
	Return Value
End Sub

Sub CLng(o As Object) As Long
	Return Floor(o)
End Sub

Sub CInt(o As Object) As Int
	Return Floor(o)
End Sub

Sub GetFileParentPath(Path As String) As String
	Dim Path1 As String
	Dim L As Int
	If Path = "/" Then
		Return "/"
	End If
	L = Path.LastIndexOf("/")
	If L = Path.Length - 1 Then
		'Strip the last slash
		Path1 = Path.SubString2(0,L)
	Else
		Path1 = Path
	End If
	L = Path.LastIndexOf("/")
	If L = 0 Then
		L = 1
	End If
	Return Path1.SubString2(0,L)
End Sub

Sub GetFileExt(FullPath As String) As String
	Return FullPath.SubString(FullPath.LastIndexOf(".")+1)
End Sub

Sub SetPrefix(prefix As String, target As Map) As Map
	Dim nm As Map = CreateMap()
	For Each mk As String In target.Keys
		Dim mv As Object = target.Get(mk)
		Dim mk1 As String = prefix & "_" & mk
		nm.Put(mk1,mv)
	Next
	Return nm
End Sub

Sub LongDateTimeToday() As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim dt As Long = DateTime.now
	DateTime.DateFormat = "EEEE, dd MMMM yyyy, HH:mm"
	Return DateTime.Date(dt)
End Sub

public Sub AfterTodayRG(dVariance As Long) As String
	If dVariance <= 0 Then
		Return "./assets/green.png"
	else if dVariance > 0 Then
		Return "./assets/red.png"
	Else
		Return "./assets/gray.png"
	End If
End Sub


Public Sub ProgressRAG(dVariance As Double) As String
	If dVariance < 0 Then
		Return "./assets/red.png"
	else if dVariance > 0 Then
		Return "./assets/green.png"
	else if dVariance = 0 Then
		Return "./assets/orange.png"
	Else
		Return "./assets/gray.png"
	End If
End Sub


Public Sub ExpectedRAG(dValue As Double) As String
	If dValue = 0 Then
		Return "./assets/orange.png"
	else if dValue > 0 Then
		Return "./assets/red.png"
	else if dValue < 0 Then
		Return "./assets/green.png"
	Else
		Return "./assets/red.png"
	End If
End Sub

Public Sub ExpenditureRAG(dVariance As Double) As String
	If dVariance > 0 Then
		Return "./assets/green.png"
	else if dVariance < 0 Then
		Return "./assets/red.png"
	else if dVariance = 0 Then
		Return "./assets/orange.png"
	Else
		Return "./assets/gray.png"
	End If
End Sub

Public Sub PriorityRAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/green.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/red.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub RAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/red.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/green.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub GAR(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/green.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/red.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub StatusRAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/red.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/green.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub FaceRAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/sadface.png"
		Case 1
			Return "./assets/neutralface.png"
		Case 2
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub FaceRG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/sadface.png"
		Case 1
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub FaceRG1(dValue As Int) As String
	Select Case dValue
		Case 1
			Return "./assets/sadface.png"
		Case 0
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub FaceDone(dValue As Int) As String
	Select Case dValue
		Case 100
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub ProgressStatus(dValue As Int) As Int
	Select Case dValue
		Case 100
			Return 1
		Case Else
			Return 0
	End Select
End Sub

Public Sub StatusRG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/red.png"
		Case 1
			Return "./assets/green.png"
		Case Else
			Return "./assets/red.png"
	End Select
End Sub