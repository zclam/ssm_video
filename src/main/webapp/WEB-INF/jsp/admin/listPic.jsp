<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<script>
    $(function(){
        $(".addForm").submit(function(){
            if(checkEmpty("filepath","图片文件")){
                $("#filepath").value("");
                return true;
            }
            return false;
        });

    });

</script>

<title>视频图片管理</title>

<div class="workingArea">
    <ol class="breadcrumb">
        <li><a href="admin_category_list">所有分类</a></li>
        <%--<li><a href="admin_video_list?cat_id=${v.category.cat_id}">${v.category.cat_name}</a> </li>
        <li class="active">${v.vid_name}</li>--%>
        <li class="active">图片管理</li>
    </ol>

    <table class="addPictureTable" align="center">
        <tr>
            <td class="addPictureTableTD">
                <div>
                    <div class="panel panel-warning addPictureDiv">
                        <div class="panel-heading">新增视频<b class="text-primary">图片</b></div>
                        <div class="panel-body">
                            <form method="post" class="addFormSingle" action="admin_pic_add" enctype="multipart/form-data">
                                <table class="addTable">
                                    <tr>
                                        <td>请选择本地图片</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input id="filepathSingle" type="file" name="image" />
                                        </td>
                                    </tr>
                                    <tr class="submitTR">
                                        <td align="center">
                                            <%--<input type="hidden" name="pic_id" value="${p.pic_id}" />--%>
                                            <input type="hidden" name="pic_id" value="${v.vid_id}" />
                                            <button type="submit" class="btn btn-success">提  交</button>
                                        </td>
                                    </tr>
                                </table>
                            </form>
                        </div>
                    </div>
                    <table class="table table-striped table-bordered table-hover  table-condensed">
                        <thead>
                        <tr class="success">
                            <th>ID</th>
                            <th>视频图片缩略图</th>
                            <th>删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${p}" var="pi">
                            <tr>
                                <td>${pi.pic_id}</td>
                                <td>
                                    <a title="点击查看原图" href="img/video/${pi.pic_id}.jpg"><img height="50px" src="img/video/${pi.pic_id}.jpg"></a>
                                </td>
                                <td><a deleteLink="true"
                                       href="admin_pic_delete?pic_id=${pi.pic_id}"><span
                                        class="     glyphicon glyphicon-trash"></span></a></td>

                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </div>
            </td>
        </tr>
    </table>

</div>

<%@include file="../include/admin/adminFooter.jsp"%>