<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
<div class="categoryMenu">
		<c:forEach items="${cs}" var="c">
			<div cat_id="${c.cat_id}" class="eachCategory">
				<span class="glyphicon glyphicon-link"></span>
				<a href="forecategory?cat_id=${c.cat_id}">
					${c.cat_name}
				</a>
			</div>
		</c:forEach>
	</div>  