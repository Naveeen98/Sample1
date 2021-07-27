<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 
<html>
    <head>
        <title>SELECT Operation</title>
        
    </head>
    <body>
 
        
        <form>
            <table border="1">
                <caption>Employee List</caption>
                <tr>
                    <th>Employee ID</th>
                    <th>Employee Name</th>
                    <th>Employee Email</th>
                    <th>Employee Gender</th>
                    <th>Employee Country</th>
                    <th colspan="2">Action</th>
                </tr>
              <c:forEach var="row" items="${list}">   
                    <tr>
                        <td><c:out value="${row.id}"/></td>
                           <td><c:out value="${row.name}"/></td>
                        <td><c:out value="${row.email}"/></td>
                       <td><c:out value="${row.gender}"/></td>
                       <td><c:out value="${row.country}"/></td> 
                       
                         <td><a href="updateEmp?id=<c:out value="${row.id}"/>">Update</a></td>
                          <td><a href="deleteEmp/${row.id}">Delete</a></td>   
                           
                    </tr>
                </c:forEach>
            </table>
        </form>
       
    
</body>
</html> --%>