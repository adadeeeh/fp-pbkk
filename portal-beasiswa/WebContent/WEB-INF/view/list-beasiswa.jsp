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
		  	<c:forEach var="tempBeasiswa" items="${beasiswas}">
		    	<h1 class="display-8">${tempBeasiswa.judul}</h1>
		    	<img style="width:100%" alt="${tempBeasiswa.poster}" src="${tempBeasiswa.poster}">
		    </c:forEach>
    		<!-- <a href="hobbit/showForm"><button type="button" class="btn btn-success">Register Hobbit</button></a> -->
		  </div>
		</div>
	</div>
	<%-- <div id="wrapper">
		<div id="header">
			<h2>Daftar beasiswa</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="contetnt">
		
			<table>
				<tr>
					<th>Judul</th>
					<th>Poster</th>
					<th>Syarat dan Ketentuan</th>
				</tr>
		
				<c:forEach var="tempBeasiswa" items="${beasiswas}">
					
					<tr>
						<td>${tempBeasiswa.judul}</td>
						<td>${tempBeasiswa.poster}</td>
						<td>${tempBeasiswa.syaratKetentuan}</td>
					</tr>
					
				</c:forEach>
			</table>
		
		</div>
	</div> --%>

</body>

</html>