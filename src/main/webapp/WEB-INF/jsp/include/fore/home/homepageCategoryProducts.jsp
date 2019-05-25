<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<c:if test="${empty param.categorycount}">
    <c:set var="categorycount" scope="page" value="100"/>
</c:if>

<c:if test="${!empty param.categorycount}">
    <c:set var="categorycount" scope="page" value="${param.categorycount}"/>
</c:if>

<div class="homepageCategoryProducts">
    <c:forEach items="${cs}" var="c" varStatus="stc">
        <c:if test="${stc.count<=4}">
            <div class="eachHomepageCategoryProducts">
                <div class="left-mark"></div>
                <span class="categoryTitle">${c.cat_name}</span>
                <br>
                <c:forEach items="${c.videos}" var="v" varStatus="st">
                    <c:if test="${st.count<=5}">
                        <div class="productItem" >
                            <a href="forevideo?vid_id=${v.vid_id}"><img width="100px" src="img/video/${v.pic_url}"></a>
                            <a class="productItemDescLink" href="forevideo?vid_id=${v.vid_id}">
                                <span class="productItemDesc">
                                ${fn:substring(v.vid_name, 0, 20)}
                                </span>
                            </a>
                            <span class="productPrice">
                                <%--<fmt:formatNumber type="number" value="${p.promotePrice}" minFractionDigits="2"/>--%>
                            </span>
                        </div>
                    </c:if>
                </c:forEach>
                <div style="clear:both"></div>
            </div>
        </c:if>
    </c:forEach>



</div>