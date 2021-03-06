<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Article Form</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/article/saveArticle" var="saveURL" />
  <h2>Employee</h2>
  <form:form modelAttribute="articleForm" method="post" action="${saveURL }" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>Name</label>
    <form:input path="name" cssClass="form-control" id="name" />
   </div>
   <div class="form-group">
    <label>Email</label>
    <form:input path="email" cssClass="form-control" id="email" />
   </div>
   <div class="form-group">
    <label>Gender</label>
    <form:input path="gender" cssClass="form-control" id="gender" />
   </div>
   <div class="form-group">
    <label>Country</label>
    <form:input path="country" cssClass="form-control" id="country" />
   </div>
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
  
 </div>
</body>
</html>