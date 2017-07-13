<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome</title>
    </head>
    <body>
       <form:form id="urlform" modelAttribute="url" action="createTiny" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="originalURL">Original URL:</form:label>
                        </td>
                        <td>
                            <form:input path="originalURL" name="originalURL" id="originalURL" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="tiny" name="tiny">Shorten URL</form:button>
                        </td>
                    </tr>
                </table>
            </form:form>
            <table align="center">
             <c:forEach items="${tinyurlst}" var="suf">
				    <tr>
				    	<td><a href="${pageContext.servletContext.contextPath}${suf.shortURL}"><c:out value="${suf.shortURL}"/></a></td>
				    </tr>
				</c:forEach>
            </table>
    </body>
    </html>