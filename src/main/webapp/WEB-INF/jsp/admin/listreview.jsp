<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<title>评论管理</title>

<div class="workingArea">
    <h1 class="label label-info" >评论管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>评论者</th>
                <th>评论视频</th>
                <th>评论内容</th>
                <th>评论管理</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${rs}" var="r">
                <tr>
                    <td>${r.rev_id}</td>
                    <td>${r.user.user_id}</td>
                    <td>${r.video.vid_name}</td>
                    <td>${r.rev_con}</td>
                    <td><a deleteLink="true"
                           href="admin_review_delete?rev_id=${r.rev_id}">
                        <span	class="glyphicon glyphicon-trash"></span></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div>


<%@include file="../include/admin/adminFooter.jsp"%>