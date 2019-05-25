<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<title>视频分类</title>

<div class="workingArea">
    <h1 class="label label-info" >视频分类</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>分类名称</th>
                <th>视频管理</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cs}" var="c">

                <tr>
                    <td>${c.cat_id}</td>
                    <td>${c.cat_name}</td>
                    <td><a href="admin_video_list?cat_id=${c.cat_id}"><span class="glyphicon glyphicon-th-list"></span></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/Page.jsp" %>
    </div>


<%@include file="../include/admin/adminFooter.jsp"%>