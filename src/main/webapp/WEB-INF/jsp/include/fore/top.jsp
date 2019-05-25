<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<nav class="top">
    <a href="${contextPath}">
        <span style="color:#21c427;margin:0px" class=" glyphicon glyphicon-home redColor"></span>
        视频分享首页
    </a>

    <c:if test="${!empty user}">
        <a href="adminLoginPage">后台</a>
        <a href="#">${user.user_name}</a>
        <a href="forelogout">退出</a>
    </c:if>

    <c:if test="${empty user}">
        <a href="adminLoginPage">后台</a>
        <a href="loginPage">登录</a>
        <a href="registerPage">注册</a>
    </c:if>


    <span class="pull-right">
            <a href="fore_space_list">
            <span style="color:#21c427;margin:0px" class=" glyphicon glyphicon-th-list"></span>
            我的空间</a>
    </span>
    <span class="pull-right">
            <a href="fore_collect_list">
            <span style="color:#21c427;margin:0px" class=" glyphicon glyphicon-th-list"></span>
            我的收藏</a>
    </span>

</nav>