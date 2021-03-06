﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.51
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private pg As WixPage
	Public myForm As WixForm
	Public BANano As BANano
	
End Sub


Public Sub Init(pgContainer As String)
	pg.Initialize("wp", pgContainer).SetHeader("Lesson 10: List (pgList)").SetResponsive("master")
	'
	Dim R1 As WixRow
	R1.Initialize("R1").SetHeight(10)
	pg.AddRow(R1)
	'
	Dim R2 As WixRow
	R2.Initialize("R2")
	'
	R2.AddColumnsSpacer(10)
	' 
	Private pgr As WixPager
	pgr.Initialize("moviepager").SetAnimate(True).SetSize(10)
	R2.AddColumnsItem(pgr.Item)
	'
	R2.AddColumnsSpacer("")
	'
	pg.AddRow(R2)
	'
	Dim R3 As WixRow
	R3.Initialize("R3")
	'
	R3.AddColumnsSpacer(10)
	'
	'lets create dummy data
	Dim dummy As UOENowData
	dummy.Initialize
	Dim structure As Map = CreateMap()
	structure.Put("id", "id")
	structure.Put("rank", "id")
	structure.Put("title", "name")
	structure.Put("year", "year")
	Dim big_film_set As List = dummy.GetRecordsWithStructure(structure, 50)
	'
	Dim fList As WixList
	fList.Initialize("fList").SetWidth(500).SetHeight(360).SetBorderLess(False)
	fList.SetTemplate("#rank#. #title# (#year#)").SetSelect(True)
	fList.SetScroll(False).SetPager("moviepager").SetData(big_film_set)
	'
	R3.AddColumnsItem(fList.item)
	'
	pg.AddRow(R3)
	'  
	pg.ui
	'attach the select event
	Dim recID As String
	pg.OnAfterSelect("fList", BANano.CallBack(Me, "movie_selected",Array(recID)))

End Sub

Sub movie_selected(recID As String)
	'get the record from the list
	Dim record As Map = pg.GetItem("fList", recID)
	pg.Message(BANano.ToJson(record))
End Sub