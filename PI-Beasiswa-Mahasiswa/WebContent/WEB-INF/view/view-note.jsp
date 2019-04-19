<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/notestyle.css">
<link rel="stylesheet" href="resources/css/style.css">
<script src="resources/js/listedNotes.js"></script>
<meta charset="ISO-8859-1">
<title>Your Note Page</title>
</head>
<body>


<!-- <div  class="header"> -->
<!--   <h2>Your Note</h2> -->
<!-- <!--   <input type="submit" onclick="newElement()" class="addBtn" value="Submit"/> -->
<!--   	<span onclick="newElement()" class="addBtn"></span>Add</span> -->
<!-- </div> -->

<div id="myDIV" class="header">
  <h2>Your Note</h2>
  <div>
	<input id="myInput" value="${listed }" >
  </div>
  <buton onclick="newElement()" id="butn" class="addBtn">Add</button>
</div>

<h1>My Note :</h1> 
<br/>
<ul id="myUL">

</ul>
<br/>
<br/>
<br/>

	<a href="addNotes">
		<div class="button1">
			Add a New Note
		</div>
	</a>

</body>
</html>