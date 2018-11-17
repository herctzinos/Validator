<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
          </head>

    <body>
       <spring:form modelAttribute="userEntity" action="doLoginEmpty.htm">
            <table>
                <tr>
                    <td><spring:label path="title">title</spring:label></td>
                    <td><spring:input path="title"/></td>
                    <td><spring:errors path="title"/></td>

                </tr>
               
               
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Submit" />
                    </td>
                </tr>
            </table>
        </spring:form>  
    </body>
</html>
