<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" %>



    <div id="thelist">
        <table class="table" border="1" cellpadding="0" cellspacing="0" width="100%">
            <tr>

                <th>视频名称</th>
                <th>大小</th>
                <th class="file-pro">进度</th>
                <th class="file-status">状态</th>
                <th width="20%">操作</th>
            </tr>
        </table>

        <span id="picker">选择视频</span>
        <input  type="hidden" id="cat_id" value="${c.cat_id}">
        <input id="uploadBtn" type="button" value="开始上传"<%-- class="btn btn-default"--%>style="float: right">
    </div>



    <script src="js/upload.js" type="text/javascript"></script>


