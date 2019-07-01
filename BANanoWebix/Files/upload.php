<?php 
header("Access-Control-Allow-Origin: *")
$file = $_FILES['uploader']; //getting a file object
 
$file['name']; //name of the uploaded file 
$file['tmp_name']; //name of the file in the temporary storage
$destination = realpath('./assets'); //define folder
$filename = $destination."/".preg_replace("|[\\\/]|", "", $file["name"]); //set destination
move_uploaded_file($file["tmp_name"], $filename); //move files
?>