<?php
$host = 'localhost';

$user = 'web_tues';
$pswd = 'Biotech14@biotech';
$dbName = 'saiyedas_WEB_Assignment6';

$conn = mysqli_connect($host, $user, $pswd, $dbName);

if(empty($conn))
{
    die("connection Failed".mysqli_connect_error());
}

?>