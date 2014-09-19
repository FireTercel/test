<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>add employee</title>
    

  </head>
  
  <body>
    <form action="" method="post">
    	emp no:<input name="empNo"/><br/>
    	name:<input name="name"/> <br/>
    	phone:<input name="phone"/> <br/>
    	hire date:<input name="hireDate"/><br/>
    	department:<select name="dept">
    		<c:forEach items="${deptList}" var="dept">
    			<option value="${dept}">${dept}</option>
    		</c:forEach>
    	</select>
    	<input type="submit" value="add"/>
    
    
    </form>
  </body>
</html>
