<%--
  Created by IntelliJ IDEA.
  User: zhangry
  Date: 2017/5/15
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="../css/login.signin.css" />
    <title>用户登录/注册</title>
    <style type="text/css">
        .login {
            background-color: #444 !important;
        }

        .login .content {
            background-color:#fff;
            width: 360px;
            margin: 0 auto;
            margin-bottom: 0px;
            padding: 30px;
            padding-top: 20px;
            padding-bottom: 15px;
        }
    </style>
</head>
<body class="login">
<div class="content">
    <form action="http://localhost:8080/demo/base/signin" method="get">
        <h3>用户登录</h3>
        <div>
            <label>用户名</label>
            <div>
                <i></i>
                <input type="text" name="username" id="username" placeholder="用户名" />
            </div>
        </div>
        <div>
            <label>密码</label>
            <div class="input-icon">
                <i></i>
                <input type="password" name="password" id="password" size="25" placeholder="密码" />
            </div>
        </div>
        <div>
            <label>
                <input type="checkbox" name="remember" value="1"/> 记住我 </label>
            <button type="submit" id="loginBut">
                登录 <i></i>
            </button>
        </div>
    </form>
</div>
</body>
</html>
