<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<div class="searchVideos">

    <c:forEach items="${vs}" var="v">
        <div class="videoUnit">
            <a href="forevideo?vid_id=${v.vid_id}">
                <img class="videoImage" src="img/video/${v.pic_url}">
            </a>
            <span class="productPrice"></span>
            <a class="videoLink" href="forevideo?vid_id=${v.vid_id}">
                    ${fn:substring(v.vid_name, 0, 10)}
            </a>
            <div class="videoInfo">
                <span class="click ">点击量：<span class="clickNumber">${v.vid_cli}</span></span>
            </div>

        </div>
    </c:forEach>
    <c:if test="${empty vs}">
        <div class="noMatch">没有满足条件的视频
        </div>
    </c:if>
    <c:set var="keyword" value="null" scope="request" />
    <div style="clear:both"></div>
</div>