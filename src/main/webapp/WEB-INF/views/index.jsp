<%--
  Created by IntelliJ IDEA.
  User: chopp
  Date: 7/18/2019
  Time: 10:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form method="get" action="calculate" >
      <input type="text" name="firstNum" value="${firstNum}">
      <input type="text" name="secondNum" value="${secondNum}">
      <input type="submit" name="operator" value="+">
      <input type="submit" name="operator" value="-">
      <input type="submit" name="operator" value="*">
      <input type="submit" name="operator" value="/">
    </form>
  <p>Result:${result}</p>
  </body>
</html>
