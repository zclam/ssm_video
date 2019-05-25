<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>


<script>
    function checkEmpty(id, name){
        var value = $("#"+id).val();
        if(value.length==0){
            alert(name+ "不能为空");
            $("#"+id)[0].focus();
            return false;
        }
        return true;
    }
    $(function(){

        $("#addForm").submit(function(){
            if(!checkEmpty("name","视频名称"))
                return false;
            if(!checkEmpty("videoPic","视频图片"))
                return false;
            if(!checkEmpty("videoPath","视频路径"))
                return false;
            if(!checkEmpty("videoCategory","视频类别"))
                return false;
            return true;
            return true;
        });
    });
    $(function(){
        $("a").click(function(){
            var deleteLink = $(this).attr("deleteLink");
            console.log(deleteLink);
            if("true"==deleteLink){
                var confirmDelete = confirm("确认要删除");
                if(confirmDelete)
                    return true;
                return false;

            }
        });
    })
</script>

<title>我的空间</title>
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
                        <a style="display:none" href="#"><img src="img/site/cartSelected.png"></a>
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
                           href="fore_space_delete?vid_id=${v.vid_id}">
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
    <div class="panel panel-warning addDiv">
        <div class="panel-heading">新增视频</div>
        <div class="panel-body">
            <form method="post" id="addForm" action="fore_video_add"  enctype="multipart/form-data">
                <table class="addTable">
                    <tr>
                        <td>视频名称</td>
                        <td><input  id="name" name="vid_name" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>视频图片</td>
                        <td>
                            <input id="videoPic" accept="image/*" type="file" name="image" />
                        </td>
                    </tr>
                    <tr>
                        <td>视频路径</td>
                        <td>
                            <input id="videoPath"  type="file" name="video" />
                        </td>
                    </tr>
                    <tr>
                        <td>视频类别</td>
                        <%--<td>
                            <input id="videoCategory"  type="text" name="cat_id" />
                        </td>--%>
                        <td>
                            <select id="videoCategory" name="cat_name" >

                                <c:forEach items="${cs}" var="c">
                                    <option>${c.cat_name}</option>
                                </c:forEach >

                            </select>
                        </td>
                    </tr>

                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <button   type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>

                </table>
            </form>
        </div>
    </div>
</div>

