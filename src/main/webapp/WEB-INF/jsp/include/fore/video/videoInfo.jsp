<%--
  Created by IntelliJ IDEA.
  User: lzc
  Date: 2019/4/13
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<script>
    $(function () {

        //addLink
        $(".addLink").click(function () {
            var page = "forecheckLogin";
            $.get(
                page,
                function (result) {
                    if ("success" == result) {
                        var vid_id =${v.vid_id};
                        var addpage = "fore_collect_add";
                        $.get(
                            addpage,
                            {"vid_id": vid_id},
                            function (result) {
                                if ("success" == result) {
                                    $(".addButton").html("已收藏");
                                    $(".addButton").attr("disabled", "disabled");
                                    $(".addButton").css("background-color", "lightgray")
                                    $(".addButton").css("border-color", "lightgray")
                                    $(".addButton").css("color", "black")
                                }
                                else {
                                    $(".addButton").html("已收藏过");
                                    $(".addButton").attr("disabled", "disabled");
                                    $(".addButton").css("background-color", "lightgray")
                                    $(".addButton").css("border-color", "lightgray")
                                    $(".addButton").css("color", "black")
                                }
                            }
                        );
                    }
                    else {
                        $("#loginModal").modal('show');
                    }
                }
            );
            return false;
        });

        //downloadLink
        $(".downloadLink").click(function () {
            var page = "forecheckLogin";
            $.get(
                page,
                function (result) {
                    if ("success" == result) {
                        $(".downloadButton").html("已下载");
                        $(".downloadButton").attr("disabled", "disabled");
                        $(".downloadButton").css("background-color", "lightgray")
                        $(".downloadButton").css("border-color", "lightgray")
                        $(".downloadButton").css("color", "black")
                        location.href = $(".downloadLink").attr("href");
                    }
                    else {
                        $("#loginModal").modal('show');
                    }
                }
            );
            return false;
        });

        //model.jsp.button.loginSubmitButton
        $("button.loginSubmitButton").click(function () {
            var name = $("#name").val();
            var password = $("#password").val();
            if (0 == name.length || 0 == password.length) {
                $("span.errorMessage").html("请输入账号密码");
                $("div.loginErrorMessageDiv").show();
                return false;
            }
            var page = "foreloginAjax";
            $.get(
                page,
                {"name": name, "password": password},
                function (result) {
                    if ("success" == result) {
                        location.reload();
                    }
                    else {
                        $("span.errorMessage").html("账号密码错误");
                        $("div.loginErrorMessageDiv").show();
                    }
                }
            );
            return true;
        });
    });
</script>

<div class="videoAndInfo">
    <div class="videoshow">
        <video controls width="1350px" height="700px">
            抱歉，你的浏览器不支持video标签
            <source src="videopath/${v.video_url}" type="video/mp4">
        </video>
    </div>
        <div class="buttonInfo">
            <a class="addLink" href="#">
                <button class="addButton">收藏</button>
            </a>
            <a class="downloadLink" href="fore_download?video_url=${v.video_url}">
                <button class="downloadButton">下载</button>
            </a>
        </div>
        <div class="hotInfo">热度:${v.vid_cli}</div>

    <div style="clear:both"></div>

</div>


