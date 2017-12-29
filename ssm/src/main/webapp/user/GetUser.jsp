<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试用记</title>
</head>
<body>
<form action="/user/EditUser.do" method="post">
    编号：<input type="text" id="id" name="id" value="${user.id}"><br>
    邮箱：<input type="text" id="email" name="email" value="${user.email}"><br>
    密码：<input type="text" id="password" name="password" value="${user.password}"><br>
    用户名：<input type="text" id="username" name="username" value="${user.username}"><br>
    角色：<input type="text" id="role" name="role" value="${user.role}"><br>
    状态：<input type="text" id="status" name="status" value="${user.status}"><br>
    ip：<input type="text" id="regIp" name="regIp" value="${user.regIp}"><br>
    <button type="submit">提交</button>
</form>
</body>
</html>
