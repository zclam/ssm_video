<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>


<script>
function showProductsAsideCategorys(cat_id){
	$("div.eachCategory[cat_id="+cat_id+"]").css("background-color","white");
	$("div.eachCategory[cat_id="+cat_id+"] a").css("color","#87CEFA");
	$("div.productsAsideCategorys[cat_id="+cat_id+"]").show();
}


function hideProductsAsideCategorys(cat_id){
	$("div.eachCategory[cat_id="+cat_id+"]").css("background-color","#e2e2e3");
	$("div.eachCategory[cat_id="+cat_id+"] a").css("color","#000");
	$("div.productsAsideCategorys[cat_id="+cat_id+"]").hide();
}
$(function(){
    $("div.eachCategory").mouseenter(function(){
        var cat_id = $(this).attr("cat_id");
        showProductsAsideCategorys(cat_id);
    });
    $("div.eachCategory").mouseleave(function(){
        var cat_id = $(this).attr("cat_id");
        hideProductsAsideCategorys(cat_id);
    });
    $("div.productsAsideCategorys").mouseenter(function(){
    	var cat_id = $(this).attr("cat_id");
    	showProductsAsideCategorys(cat_id);
    });
    $("div.productsAsideCategorys").mouseleave(function(){
    	var cat_id = $(this).attr("cat_id");
    	hideProductsAsideCategorys(cat_id);
    });
	
	$("div.rightMenu span").mouseenter(function(){
		var left = $(this).position().left;
		var top = $(this).position().top;
		var width = $(this).css("width");
		var destLeft = parseInt(left) + parseInt(width)/2;
		$("img#catear").css("left",destLeft);
		$("img#catear").css("top",top-20);
		$("img#catear").fadeIn(500);
				
	});
	$("div.rightMenu span").mouseleave(function(){
		$("img#catear").hide();
	});
	
	var left = $("div#carousel-of-product").offset().left;
	$("div.categoryMenu").css("left",left-20);
	$("div.categoryWithCarousel div.head").css("margin-left",left);
	$("div.productsAsideCategorys").css("left",left-20);
	
	
});
</script>

<img src="img/site/catear.png" id="catear" class="catear"/>
	
<div class="categoryWithCarousel">


<div class="headbar show1">
	<div class="head ">
	
		<span style="margin-left:10px" class="glyphicon glyphicon-th-list"></span>
		<span style="margin-left:10px" >视频分类</span>
		
	</div>
	
	<div class="rightMenu">

		<c:forEach items="${cs}" var="c" varStatus="st">
			<c:if test="${st.count<=6}">
				<span>
				<a href="forecategory?cat_id=${c.cat_id}">
					${c.cat_name}
				</a></span>			
			</c:if>
		</c:forEach>
	</div>
	
</div>

	
<div style="position: relative">
	<%@include file="categoryMenu.jsp" %>
</div>





<%@include file="carousel.jsp" %>

<div class="carouselBackgroundDiv">
</div>

</div>





