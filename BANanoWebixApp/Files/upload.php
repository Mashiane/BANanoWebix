<?php
header("Access-Control-Allow-Origin: *");
ini_set('max_execution_time',120);
if (isset($_FILES['upload'])) {
    // Example:
    if(move_uploaded_file($_FILES['upload']['tmp_name'], "../assets/" . $_FILES['upload']['name'])){
        echo '{ "status": "success" }';
    } else {
        echo '{ "status": "error" }';
    }
    exit;
} else {
    echo '{ "status": "error" }';
}
?>