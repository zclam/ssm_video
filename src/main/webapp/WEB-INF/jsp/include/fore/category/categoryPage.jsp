<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<title>分类页-${c.cat_name}</title>
<div id="category">
    <div class="categoryPageDiv">
        <%@include file="sortBar.jsp"%>
        <%@include file="videosByCategory.jsp"%>
    </div>

</div>