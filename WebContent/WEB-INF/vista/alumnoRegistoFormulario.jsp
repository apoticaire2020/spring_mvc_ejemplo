<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <form:form action="procesarFormulario" modelAttribute="alumno" >
  
    Nombre : <form:input path="nombre"/>
    
    <br/><br/>
    
    Appelido : <form:input path="appelido"/>
  <br/><br/>
   asignaturas optativas:<br>
   
     <form:select path="optativa" multiple="true" >
       <form:option value="designo" label="desino"/>
       <form:option value="karate" label="karate"/>
       <form:option value="tecwando" label="tecwando"/>
       <form:option value="boxe" label="boxe"/>
     </form:select>
    
    <br/><br/>
    
    <input type="submit" value="enviar"/>
  
  </form:form>

</body>
</html>