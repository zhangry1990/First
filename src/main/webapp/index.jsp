<%--
  Created by IntelliJ IDEA.
  User: zhangry
  Date: 2017/5/15
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${ctx}/login/signin">百度一下，你就知道啦</a>
<br />
<a href="${ctx}/login/chartPie">图表</a>
<br />
<a href="${ctx}/login/table">表格</a>
</body>
</html>
