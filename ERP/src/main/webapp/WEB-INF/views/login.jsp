<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> login </title>
<style>
	#divPage{width:600px; text-align:center; margin:auto; margin-top:300px;} 
	#tblLogin{margin-left:17%; margin-right:17%; width:60%; height:100px; padding-left:3%; padding-right:3%;}
	#btn {margin-left:30%; margin-top:20px;}
	input {height:25px;}
</style>
</head>
<body>
<h2> [login] </h2>

	<div id="divPage">
	<form name="form">
		<table id="tblLogin">
			<tr>
				<td width=100> ID </td>
				<td width=200> <input type="text" placeholder="ENTER ID" size=20 name="id" value="id"> </td>
			</tr>
			<tr>
				<td width=100> PASSWORD </td>
				<td width=200> <input type="password" placeholder="ENTER PASSWORD" size=20 name="pw" value="pw"> </td>
			</tr>
		</table>
	</form>
		<div id="btn">
			<img src="http://placehold.it/80x40" id="btnLogin">
		</div>
	</div>
</body>
<script>
	$("#btnLogin").on("click", function() {
		var id = $(form.id).val();
		var pw = $(form.pw).val();
		alert(id +"/"+ pw);
	});
</script>
</html>