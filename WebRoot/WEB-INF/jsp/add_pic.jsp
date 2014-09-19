<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'add_pic.jsp' starting page</title>
    

  </head>
  
  <body>
	<form action="add_pic_succ.test" method="post">
		pic name:<input name="picName" /><br/>
		price:<input name="price"/><br/>
		command:<input name="command"/><br/>
		<input type="submit" value="add"/>
	
	
	</form>    


  </body>
</html>
