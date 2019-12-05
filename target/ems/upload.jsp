<%--
  Created by IntelliJ IDEA.
  User: XIXI
  Date: 2019/10/25
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<br>
    <form action="${pageContext.request.contextPath}/upload/up" method="post" enctype="multipart/form-data">
        <input type="file" name="sh"/>
        <input type="submit" value="上传"/>
    </form>

    <h1>下载</h1>
    <li>hehe.txt
         文本: <a href="${pageContext.request.contextPath}/down/Do?FileName=hehe.txt&openStyle=inline ">附件</a>
               <a href="${pageContext.request.contextPath}/down/Do?FileName=hehe.txt">在线</a></br>
    </li>
    <li>
     图片00.jpg
        <a href="${pageContext.request.contextPath}/down/Do?FileName=00.jpg&openStyle=inline ">附件</a>
        <a href="${pageContext.request.contextPath}/down/Do?FileName=00.jpg">在线</a>
    </li>
</body>
</html>
