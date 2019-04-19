<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/notestyle.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 	<form action="noteLists" method="GET"> -->
<!-- 		<input type="text" name="myNotes" placeholder="Add a Note?" /> -->
		
<!-- 		<input type="submit" /> -->
	
<!-- 	</form> -->
<div  class="header">
  <h2>My To Do List</h2>
  <form action="noteLists" method="GET">
  <input type="text" id="myInput" name="myNotes" placeholder="Add a Note...">
  <input type="submit" class="addBtn" value="Submit"/>
<!--   	<span onclick="newElement()" class="addBtn"></span>Add</span> -->
  </form>
</div>
</body>
</html>