<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/font-awesome.min.css">
<title>구현</title>

<style type="text/css">
	.login-section {
		display: flex;
		justify-content: center;
		margin-top: 200px;
	}
	
	.card-body {
		display: flex;
		flex-direction: column;
		align-items: center;
	}
	
	.card-body>*{
		width: 500px;
	}
	
	.main-form{
		margin-top: 20px;
	}
	
	#userContent{
		height: 140px;
	}
	
	
</style>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<div class="body-wrap">
	<div class="head-section">
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		  <div class="container-fluid">
		    <a class="navbar-brand" href="#">NEWB</a>
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		
		    <div class="collapse navbar-collapse" id="navbarColor01">
		      <ul class="navbar-nav me-auto">
		        <li class="nav-item">
		          <a class="nav-link active" href="/">Home
		            <span class="visually-hidden">(current)</span>
		          </a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="#">GH</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="#">DS</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="#">MS</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="#">WB</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
	</div>
	<div class="login-section">
		<div class="login-div">
			<div class="card border-primary mb-3" style="width: 700px; height: 500px;">
			  <div class="card-header">Main</div>
			  <div class="card-body">
			  	<div class="main-form">
			  		<div class="form-group">
			          <a>${userId}</a>
				      <label for="exampleTextarea" class="form-label mt-4">Notepad</label>
				      <textarea class="form-control" id="userContent" rows="3" readonly style="resize: none; height: 170px;"></textarea>
				    </div>
				    <div class="form-group" id="input-form">
					  <label class="col-form-label mt-4" for="inputDefault">Input</label>
					  <input type="text" class="form-control" id="userInput">
					</div>
			  	</div>
			    <button type="button" id="main-btn" class="btn btn-primary" style="margin-top: 15px;">SUBMIT</button>
			  </div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
$(document).on('click', "#main-btn", function(e){
	
	var url = new URL(location.href);
	var input = $("#userInput").val();
	var id = url.searchParams.get('userId');
	
	   var params = {
	      userId: id,
	      userInput: input
	   }
	   
	   $.ajax({
	      url: '/mainProg',
	      type: 'POST',
	      data: params,
	      success: function(res){
	         alert("success");
	         location.href = '/main?userId=' + id;
	      },
	      error: function(XMLHttpRequest, textStatus, errorThrown){
	         alert('회원가입 실패');
	      }
	   });
	
	
});
</script>
</body>
</html>

