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
  <li><a class="navbar" class="active" href="adminPage">Home</a></li>
<!--   <li><a href="#news">News</a></li> -->
<!--   <li><a href="#contact">Contact</a></li> -->
<!--   <li><a href="#about">About</a></li> -->
</ul>

<hr>

<div class="form">

<h2 class="container">Post Beasiswa</h2>

<form action="viewBeas" method = "POST">

  <div class="container">
    <label for="judul"><b class="container2">Judul Beasiswa</b></label>
    <input type="text" placeholder="Masukkan Judul" name="tittle" required>

    <label for="deskripsi"><b class="container2">Deskripsi</b></label>
    <input type="text" placeholder="Masukkan Deskripsi" name="desk" required>
        
    <button type="submit">Post</button>
  </div>

<!--   <div class="container2" style="background-color:#f1f1f1"> -->
<!--     <button type="button" class="cancelbtn">Cancel</button> -->
<!-- <!--     <span class="psw">Forgot <a href="#">password?</a></span> -->
<!--   </div> -->
</form>

</div>


</body>
</html>