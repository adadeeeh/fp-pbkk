<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Beasiswa</title>
</head>

<body>

	<div id="wrapper">
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
	</div>

</body>

</html>