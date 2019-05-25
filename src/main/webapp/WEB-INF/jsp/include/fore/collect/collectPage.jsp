<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>




<title>我的收藏</title>
<div class="cartDiv">
    <div class="cartProductList">
        <table class="cartProductTable">
            <thead>
            <tr>
                <th class="selectAndImage" >
                    <img selectit="false" class="selectAllItem" src="img/site/cartNotSelected.png">
                    全选
                </th>
                <th width="300px">视频名称</th>
                <th>视频图片</th>
                <th></th>
                <th class="operation">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${vs}" var="v"><%--！target:从单个收藏表里，遍历收藏表里得所有视频。！problem:${collects}是收藏表集合对象； ！slution:1.controller传进来单个收藏表对象；2.controller传进来视频集合--%>
                <tr oiid="${v.vid_id}" class="cartProductItemTR">

                    <td>
                        <img selectit="false" oiid="${v.vid_id}" class="cartProductItemIfSelected" src="img/site/cartNotSelected.png">
                        <a style="display:none" href="#nowhere"><img src="img/site/cartSelected.png"></a>
                    </td>
                    <td>
                        <a  href="forevideo?vid_id=${v.vid_id}"> ${v.vid_name}</a>
                    </td>
                    <td>
                        <img class="cartProductImg"  src="img/video/${v.pic_url}">
                    </td>
                    <td>
                    </td>
                    <td><a deleteLink="true"
                           href="fore_collect_delete?vid_id=${v.vid_id}">
                        <span	class="glyphicon glyphicon-trash"></span></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../../Page.jsp" %>
    </div>
</div>
