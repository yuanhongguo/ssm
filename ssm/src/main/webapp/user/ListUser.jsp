<%--
  Created by IntelliJ IDEA.
  User: yuanhongguo
  Date: 2017/12/26
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>


<c:forEach items="${requestScope.users.list}" var="alarm">
    编号：  ${alarm.id}<br>
    用户邮箱：${alarm.email}<br>
    用户名：${alarm.username}<br>
    <a href="/user/GetUser.do?userid=${alarm.id}">编辑</a> <a href="/user/AddUser.jsp">添加</a> <a
        href="/user/DeleteUser.do?id=${alarm.id}">删除</a><br>
    --------------------------<br>
</c:forEach>
${requestScope.pageHtml}
</body>
</html>
