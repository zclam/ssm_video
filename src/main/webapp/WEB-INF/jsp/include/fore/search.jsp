<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<%--<a href="${contextPath}">
    <img id="logo" src="img/site/logo.png" class="logo">
</a>--%>

<form action="foresearch" method="post" >
    <div class="searchDiv">
        <input name="keyword" type="text" placeholder="搞笑视频  vlog " value="">
        <button  type="submit" class="searchButton">搜索</button>
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