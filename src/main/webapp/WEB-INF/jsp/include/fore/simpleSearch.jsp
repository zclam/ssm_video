<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" isELIgnored="false"%>
<div >

	<form action="foresearch" method="post" >
		<div class="simpleSearchDiv pull-right">
			<input type="text" placeholder="自然 动漫" value="${param.keyword}" name="keyword" >
  		    <button class="searchButton" type="submit">搜索</button>
			<div class="searchBelow">
				<c:forEach items="${cs}" var="c" varStatus="st">
					<c:if test="${st.count>=1 and st.count<=4}">
                    <span>
                        <a href="forecategory?cat_id=${c.cat_id}">
								${c.cat_name}
						</a>
                        <c:if test="${st.count!=4}">
							<span>|</span>
						</c:if>
                    </span>
					</c:if>
				</c:forEach>
			</div>
		</div>
	</form>
	<div style="clear:both"></div>
</div>