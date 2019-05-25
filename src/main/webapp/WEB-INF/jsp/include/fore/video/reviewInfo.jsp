<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="reviewDiv">

    <div class="reviewStasticsDiv">
        <div class="reviewStasticsLeft">
            <div class="reviewStasticsLeftTop"></div>
            <div class="reviewStasticsLeftContent">视频评价</div>
            <div class="reviewStasticsLeftFoot"></div>
        </div>
        <div class="reviewStasticsRight">
            <div class="reviewStasticsRightEmpty"></div>
            <div class="reviewStasticsFoot"></div>
        </div>
    </div>

    <%--<c:if test="${param.showonly==true}">--%>
    <div class="reviewDivlistReviews">
        <c:forEach items="${reviews}" var="r">
            <div class="reviewDivlistReviewsEach">
                <div class="reviewContent">${r.rev_con}</div>
                <div class="reviewUserInfo">${r.user.user_name}</div>
                    <%--<c:if test="${sessionScope.user==r.user}">哈希值不一样--%>
                <c:if test="${sessionScope.user_id==r.user_id}">
                    <div class="pull-right"><a deleteLink="true"
                                               href="fore_review_delete?rev_id=${r.rev_id}">
                        <span class="glyphicon glyphicon-trash"></span></a></div>
                </c:if>
            </div>
        </c:forEach>
              <div class="pageDiv">
                   <%@include file="../../Page.jsp" %>
               </div>
    </div>
    <%--</c:if>--%>


    <div class="makeReviewDiv">
        <form method="post" action="fore_review_add">
            <div class="makeReviewText">多多发视频留言8!</div>
            <table class="makeReviewTable">
                <tr>
                    <td class="makeReviewTableFirstTD">视频评价</td>
                    <td><textarea name="content"></textarea></td>
                </tr>
            </table>
            <div class="makeReviewButtonDiv">
                <input type="hidden" name="vid_id" value="${v.vid_id}">
                <button type="submit">提交评价</button>
            </div>
        </form>
    </div>

</div>