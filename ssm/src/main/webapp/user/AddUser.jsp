<%--
  Created by IntelliJ IDEA.
  User: yuanhongguo
  Date: 2017/12/25
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增用户</title>
</head>
<body>
<form action="/user/AddUser.do" method="post">
    ${requestScope.user.username }<br>
    ${requestScope.msg }<br>
    邮箱：<input type="text" id="email" name="email" value="yuan@qq.com"><br>
    密码：<input type="text" id="password" name="password" value="521521"><br>
    用户名：<input type="text" id="username" name="username" value="yhg"><br>
    角色：<input type="text" id="role" name="role" value="管理员"><br>
    状态：<input type="text" id="status" name="status" value="1"><br>
    ip：<input type="text" id="regIp" name="regIp" value="127.0.0.1"><br>
    <button type="submit">提交</button>
</form>
</body>
</html>
