<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<title>视频管理</title>


<div class="workingArea">

	<ol class="breadcrumb">
		<li><a href="admin_category_list">所有分类</a></li>
		<li><a href="admin_video_list?cat_id=${c.cat_id}">${c.cat_name}</a></li>
		<li class="active">视频管理</li>
	</ol>

	<div class="listDataTableDiv">
		<table
				class="table table-striped table-bordered table-hover  table-condensed">
			<thead>
			<tr class="success">
				<th>视频名称</th>
				<th>图片</th>
				<th>视频</th>
				<th>上传时间</th>
				<th width="100px">删除</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${vs}" var="v">
				<tr>

					<td>${v.vid_name}</td>
					<td><img height="40px" src="img/video/${v.pic_url}"></td>
					<td>
						<video controls  width="300px" height="100px" preload="none">
							抱歉，你的浏览器不支持播放此视频
							<source src="videopath/${v.video_url}" type="video/mp4">
						</video>
					</td>
					<td><fmt:formatDate value="${v.vid_time}" pattern = "yyyy-MM-dd HH:mm:ss"/></td>
					<td><a deleteLink="true"
						   href="admin_video_delete?vid_id=${v.vid_id}">
						<span	class="glyphicon glyphicon-trash"></span></a></td>

				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>

	<div class="pageDiv">
		<%@include file="../include/Page.jsp"%>
	</div>

<%@include file="uploader.jsp"%>

<%@include file="../include/admin/adminFooter.jsp"%>
