<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee-Form</title>
</head>
<body>
    <!-- If your controller returns this view, it must add model.addAttribute("employee", new Employee()) -->
    <!-- Use method (singular) and modelAttribute (singular) -->
    <form:form action="save" method="post" modelAttribute="employee">
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name"/></td>
                <td><form:errors path="name" style="color: red;"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email"/></td>
                <td><form:errors path="email" style="color: red;"/></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><form:input path="phone"/></td>
                <td><form:errors path="phone" style="color:red;"/></td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>