<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	
	<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.1.1.min.js"></script>


 <script type="text/javascript">                                         
 function getFriends(){
/* 	 var url="http://localhost:8080/hang-out/friendlist";
	 var data='{"userId":"1"}';
	  */
	 var url="http://localhost:8080/hang-out/searchUsers";
	 var data='{"emails":["dnsw@gmail.com","dnsw2@gmail.com","dnsw1@gmail.com"]}';
	
	 $.ajax({
		 headers: { 
		        'Accept': 'application/json',
		        'Content-Type': 'application/json' 
		    },
		 type: "POST",
		 url: url,
		 data: data,
		 success: function(res){
			 for ( var int = 0; int < res.length; int++) {
					$("#fndList").append("\n");
					$("#fndList").append(res[int].displayName);
					 	
			}
		 },
		 dataType: "json"
		 });
 }                                    
 </script> 
</head>
<body onload="getFriends()">
<h1>
	Hello world!  
</h1>
<div id="fndList"></div>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
