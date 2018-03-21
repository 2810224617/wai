<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1px">
<tr>
<td>eid</td>
<td>ename</td>
<td>dname</td>
<td>操作</td>
</tr>

<c:forEach items="${el}" var="emp">
<tr>
<td>${emp.eid}</td>
<td>${emp.ename}</td>
<td>${emp.dept.dname}</td>
<td><a href="deleteEmp?eid=${emp.eid}">删除</a>
<a href="emplist?eid=${emp.eid}">修改</a>
</td>
</tr>
</c:forEach>
</table>

</body>

<form action="indexEmp">
姓名:<input type="text" name="ename"/>
<select name="dept.did">
<option value="">--请选择--</option>
<c:forEach items="${dl}" var="dept">
<option value="${dept.did}">${dept.dname}</option>
</c:forEach>
</select>
<input type="submit" value="添加"/>
</form>

<form action="update">
Id:<input readonly="readonly" type="text" name="eid" value="${e.eid}"/>
姓名:<input type="text" name="ename" value="${e.ename }"/>
<select name="dept.did">
<option value="">--请选择--</option>
<c:forEach items="${dl}" var="dept">
<option value="${dept.did}" ${dept.did==e.dept.did?"selected":"" }>${dept.dname}</option>
</c:forEach>
</select>
<input type="submit" value="修改" > 
</form>




</html>