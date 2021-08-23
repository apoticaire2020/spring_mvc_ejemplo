<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/miestilo.css">
</head>
<body>
    hola ${param.nombreAlumno}
    
    <p><br>
    
       <h2> tou  le monde</h2>
       ${mensaje}
    </p>
    
    <p>
        <img alt="foto" src="${pageContext.request.contextPath }/resources/images/house-1836070_640.jpg">
    </p>
</body>
</html>