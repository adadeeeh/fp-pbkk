<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/style.css">
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<!-- <div class="header"> -->
<!-- 	<h2 id="banner">Selamat Datang di Halaman Login Admin</h2> -->
<!-- </div> -->



<hr>

<ul>
  <li><a class="navbar" class="active" href="home">Home</a></li>
<!--   <li><a href="#news">News</a></li> -->
<!--   <li><a href="#contact">Contact</a></li> -->
<!--   <li><a href="#about">About</a></li> -->
</ul>

<hr>

<div class="form">

<h2 class="container">Login Form</h2>

<form action="adminPage" method = "POST">
  <div class="imgcontainer">
    <img src="resources/img/avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b class="container2">Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b class="container2">Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
        
    <button type="submit">Login</button>
    <label class="container2">
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

<!--   <div class="container2" style="background-color:#f1f1f1"> -->
<!--     <button type="button" class="cancelbtn">Cancel</button> -->
<!-- <!--     <span class="psw">Forgot <a href="#">password?</a></span> -->
<!--   </div> -->
</form>

</div>


</body>
</html>