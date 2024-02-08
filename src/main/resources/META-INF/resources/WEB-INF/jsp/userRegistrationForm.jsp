<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>User Registration Form</title>
    <div style="text-align: center; color: deeppink;"><h2><b>User Registration Form</b></h2></div>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<form name="userRegistrationForm" action="saveUser" method="post">
<body>
    <table style="margin-left: auto; margin-right: auto; background-color: lavender;">
        <tr>
            <td><b>First Name :</b></td>
            <td><input type="text" name="firstName" placeholder="Enter First Name" width="800px" required=true></td>
        </tr>
        <tr>
            <td><b>Last Name :</b></td>
            <td><input type="text" name="lastName" placeholder="Enter Last Name" width="800px" required=true></td>
        </tr>
        <tr>
            <td><b>Date Of Birth :</b></td>
            <td><input type="text" name="dateOfBirth" placeholder="Enter Your Birth Date" width="800px" required=true></td>
        </tr>
        <tr>
            <td><b>Email :</b></td>
            <td><input type="text" name="email" placeholder="Enter Your Email" width="800px" required=true></td>
        </tr>
        <tr>
            <td><b>Password :</b></td>
            <td><input type="password" name="password" placeholder="Enter Your Password" width="800px" required=true></td>
        </tr>
    </table> 
    <div style="text-align: center;"><button type="submit" name="submitbtn"><b>Submit</b></button></div>
    <div style="text-align: center; color: green;"><b>${message}</b></div>
</body>
</form>
</html>