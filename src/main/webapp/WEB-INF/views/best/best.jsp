<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content" id="vue_best" v-cloak> 
      <div id="gallery">
        <figure>
          <header class="heading">베스트</header>
          <ul class="nospace clear">
            <li class="one_quarter first">
            	<a href="#"><img src="/images/demo/gallery/591822_271770_4427_org.jpg" alt=""></a>
            	<span class="image_font" style="font-size:11px;">제목은 몇글자까지 보여야 할까요오오오</span>
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
      <pagination v-bind:category="category"></pagination>
    </div>
    <!-- / main body -->
    <div class="clear"></div>
  </main>
</div>

<!-- start footer -->
<%@ include file="../common/footer.jsp" %>
<!-- end footer -->

<script src="/js/vue/common/vue-common.js"></script>
<script src="/js/vue/best/vue-best.js"></script>

<!-- start vue-common -->
<%-- <%@ include file="../common/vue-common.jsp" %> --%>
<!-- end vue-common -->