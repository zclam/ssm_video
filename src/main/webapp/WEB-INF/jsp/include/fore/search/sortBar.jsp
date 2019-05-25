<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="categorySortBar">

    <table class="categorySortBarTable categorySortTable">
        <tr>
            <td <c:if test="${'click'==param.sort}">class="grayColumn"</c:if> ><a href="?cat_id=${c.cat_id}&sort=click">人气<span class="glyphicon glyphicon-arrow-down"></span></a></td>
            <td <c:if test="${'date'==param.sort}">class="grayColumn"</c:if>><a href="?cat_id=${c.cat_id}&sort=date">最近<span class="glyphicon glyphicon-arrow-down"></span></a></td>
        </tr>
    </table>

</div>