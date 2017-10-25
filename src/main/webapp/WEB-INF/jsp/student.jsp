<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@page isELIgnored="false" %>
<html>
<body>
<h2>${student.name}</h2>

<form action="${pageContext.request.contextPath }/my.do" method="post">
  姓名：<input type="text" name="name"/><br/>
  年龄：<input type="text" name="age"/><br/>
  <input type="submit" value="注册"/>
  
</form>

</body>
</html>
