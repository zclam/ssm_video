<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:if test="${empty param.categorycount}">
    <c:set var="categorycount" scope="page" value="0"/>
</c:if>

<c:if test="${!empty param.categorycount}">
    <c:set var="categorycount" scope="page" value="${param.categorycount}"/>
</c:if>

<div class="categoryVideos">
    <c:forEach items="${c.videos}" var="v" varStatus="stc">
        <%-- <c:if test="${stc.count<=categorycount}">--%>
        <c:if test="${!empty c}">
            <div class="videoUnit">
                <div class="videoUnitFrame">
                    <a href="forevideo?vid_id=${v.vid_id}">
                        <img class="videoImage" src="img/video/${v.pic_url}">
                    </a>
                    <a class="videoLink" href="forevideo?vid_id=${v.vid_id}">
                            ${fn:substring(v.vid_name, 0, 10)}
                    </a>
                    <div class="show1 videoInfo">
                        <span class="click ">点击量：  <span class="clickNumber">${v.vid_cli}</span></span>
                    </div>
                </div>
            </div>
        </c:if>
    </c:forEach>
    <c:if test="${empty c.videos}">
        <div class="noMatch">该分类暂时还没有视频分享，欢迎来分享吧</div>
    </c:if>

    <div style="clear:both"></div>
</div>
