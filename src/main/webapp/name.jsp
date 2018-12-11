<%--DRILL 1 (Name Page)--%>
<%--A user goes to the url "/name" and is given a "name" page.
On the "name" page, the user sees a form prompting them to enter their first name.
After submitting their name, the user is redirected to a page that says in an
h1: "Well, howdy, TheUserNameGoesHere!"--%>
<%--- use a POST request on the form--%>
<%--- use one servlet and two JSPs.--%>
<%--- don't worry about styling.--%>
<%--- the request dispatcher will be used for both the doGet and doPost methods of the servlet--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>name</title>
</head>
    <body>

<h1>name here</h1>

<form action="/name" method="POST">
    <input type="text" name="name" placeholder="name">
    <button type="submit">Submit</button>
</form>

    </body>
</html>