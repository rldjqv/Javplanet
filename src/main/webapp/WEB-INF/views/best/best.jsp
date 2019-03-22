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
            	<a href="#"><img src="/images/demo/1.jpg" alt=""></a>
            	<span class="image_font" style="font-size:11px;">제목은 몇글자까지 보여야 할까요오오오</span>
            </li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/2.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/3.PNG" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/4.PNG" alt=""></a></li>
            
            <li class="one_quarter first"><a href="#"><img src="/images/demo/4.PNG" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/3.PNG" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/2.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/1.jpg" alt=""></a></li>
            
            <li class="one_quarter first"><a href="#"><img src="/images/demo/3.PNG" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/4.PNG" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/1.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/2.jpg" alt=""></a></li>
            
            <li class="one_quarter first"><a href="#"><img src="/images/demo/2.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/1.jpg" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/4.PNG" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/3.PNG" alt=""></a></li>
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