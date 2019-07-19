B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
Sub Class_Globals
	Private config As Map
	Private getValue As Object
	Private setValue As Object
	Private D As String = "$"
	Private BANano As BANano
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize() As WixPhoto
	Dim opt As Map = CreateMap()
	opt.Put("name", "photo")
	opt.Put("getValue", BANano.CallBack(Me, "getv", Null))
	opt.Put("$init", BANano.CallBack(Me,"init", Array(config)))
	Return Me
End Sub

Sub init(conf As Map)

End Sub	

Sub getv As Object
	Dim val As Object = config.Get("value")
	Return val	
End Sub

	
webix.protoUI({
	name:"photo",
	getValue(){
		Return this.config.value;
	},
	setValue(value){
		this.setHTML("<img style='height:260px;' webix_tooltip='The image of the Client' src='data/images/"+value+".jpg'>");
		this.config.value = value;
	}
},
webix.ui.template);

