<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content" id="vue_best"> 
      <div id="gallery">
        <figure>
          <header class="heading">베스트</header> ${_contextPath}
          <ul class="nospace clear">
            <li class="one_quarter first">
            	<a href="#"><img src="/images/demo/gallery/591822_271770_4427_org.jpg" alt=""></a>
            	<span class="image_font" style="font-size:11px;">조회수 : 100 | 추천수 : 100 | 댓글 : 3</span>
            </li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/267299_328696_2458.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/591822_271771_4450_org.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/591822_271772_4513_org.jpg" alt=""></a></li>
            <li class="one_quarter first"><a href="#"><img src="/images/demo/gallery/591822_271772_4513_org.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/img_20190305195630_ce27196c.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/1VGH08DAR8_1.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/201903051710770173_5c7e2f1c752b7_1024x.jpg" alt=""></a></li>
          </ul>
        </figure>
      </div>
      
<!--       <form th:action="@{/api/image/upload}" method="post" enctype="multipart/form-data" class="col m8 s12 offset-m2">
      	<div class="input-field col s6">
      		<input multiple="multiple" type="file" name="files"/>
   		</div>
	    <div class="input-field col s6">
	        <button class="btn indigo waves-effect waves-light"
	            type="submit" name="save">
	            Submit<i class="mdi-content-send right"></i>
	        </button>
	    </div>
	  </form> -->

      <nav class="pagination">
        <ul>
          <li><a href="#">&laquo; Previous</a></li>
          <li><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><strong>&hellip;</strong></li>
          <li><a href="#">6</a></li>
          <li class="current"><strong>7</strong></li>
          <li><a href="#">8</a></li>
          <li><a href="#">9</a></li>
          <li><strong>&hellip;</strong></li>
          <li><a href="#">14</a></li>
          <li><a href="#">15</a></li>
          <li><a href="#">Next &raquo;</a></li>
        </ul>
      </nav>
    </div>
    <!-- / main body -->
    <div class="clear"></div>
  </main>
</div>

<!-- start footer -->
<%@ include file="../common/footer.jsp" %>
<!-- end footer -->
<script src="/js/vue/best/best.js"></script>