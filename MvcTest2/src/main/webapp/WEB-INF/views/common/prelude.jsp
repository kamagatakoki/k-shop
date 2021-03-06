<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<spring:url value="/resources" var="resourceUrl"></spring:url>
<spring:url value="/maintenance" var="menteUrl"></spring:url>
<spring:url value="/WEB-INF/views" var="viewUrl"></spring:url>
<%@taglib prefix="my" uri="/WEB-INF/tld/mytaglib" %>