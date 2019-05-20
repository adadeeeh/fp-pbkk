<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  	<meta charset="utf-8">
   	<meta http-equiv="X-UA-Compatible" content="IE=edge">
   	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<title>Portal Beasiswa</title>
</head>

<body>

	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark rounded">
            <div class="collapse navbar-collapse justify-content-md-center">
                <ul class="navbar-nav">
                    <li class="navbar-brand active"><a class="nav-link" href="/portal-beasiswa">Daftar Beasiswa</a></li>
                </ul>
            </div>
		</nav>
		<div class="jumbotron jumbotron-fluid">
		  <div class="container">		  		
		
			   	<c:url var="updateLink" value="/beasiswa/formUpdate">
			   		<c:param name="id" value="${beasiswa.id }"></c:param>
			   	</c:url>
			   	
			   	<c:url var="deleteLink" value="/beasiswa/delete">
			   		<c:param name="id" value="${beasiswa.id }"></c:param>
			   	</c:url>
			   	
			   	<h1 class="display-8">${beasiswa.judul}</h1>
<%-- 		    	<img style="width:100%" alt="${tempBeasiswa.poster}" src="${beasiswa.poster}"> --%>
		    	<p>${beasiswa.syaratKetentuan}<p>
		    	
		    	
		    	<a href="${updateLink}">Update</a>
		    	<a href="${deleteLink}"
		    		onclick="if (!(confirm('Are you sure you want to delete this?'))) return false">Delete</a> 
		    	
		    	<hr />
		  </div>
		</div>
	</div>
	
</body>

</html>