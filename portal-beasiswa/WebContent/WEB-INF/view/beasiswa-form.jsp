<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


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
                    <li class="navbar-brand active"><a class="nav-link" >Input Beasiswa</a></li>
                </ul>
            </div>
		</nav>
		<div class="jumbotron jumbotron-fluid">
		  <div class="container">
		  	<form:form action="saveBeasiswa" modelAttribute="beasiswa" method="POST">
			  	<div class="col-sm-10 mx-auto">
			  		<div class="form-group row">
	                   	<label for="name" class="col-3 col-form-label">Judul</label>
	                   	<div class="col-8">
	                   		<form:input class="form-control" path="judul"/>
	                   	</div>
	               	</div>
	               	
	               	<!-- <div class="form-group row">
	                   	<label for="name" class="col-3 col-form-label">Poster</label>
	                   	<div class="col-8">
		                   	<input type="file" path="poster">
	                   	</div>
	               	</div> -->
	               	
	               	<div class="form-group row">
	                   	<label for="name" class="col-3 col-form-label">Syarat dan Ketentuan</label>
	                   	<div class="col-8">
	                   		<textarea class="form-control" rows="3" path="syaratKetentuan"></textarea>
	                   	</div>
	               	</div>
	               	
	               		<a href="/portal-beasiswa"><button type="button" class="btn btn-secondary">Back</button></a>
						<button type="submit" class="btn btn-primary">Save</button>
	               	
               	</div>
		  	
		  	</form:form>
		  </div>
		</div>
	</div>
</body>

</html>