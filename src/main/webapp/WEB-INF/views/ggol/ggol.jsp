<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content" id="vue_ggol"> 
      <div id="gallery">
        <figure>
          <header class="heading">은꼴</header>
          <ul class="nospace clear">
            <li class="one_quarter first">
            	<a href="#"><img src="/images/demo/gallery/wsyoo.png" alt=""></a>
            	<span class="image_font" style="font-size:11px;">조회수 : 100 | 추천수 : 100 | 댓글 : 3</span>
            </li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/wsyoo.png" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/01.png" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/320x320.png" alt=""></a></li>
            <li class="one_quarter first"><a href="#"><img src="/images/demo/480x400.png" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/500x280.png" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/wsyoo.png" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/wsyoo.png" alt=""></a></li>
            <li class="one_quarter first"><a href="#"><img src="/images/demo/gallery/wsyoo.png" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/wsyoo.png" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/wsyoo.png" alt=""></a></li>
            <li class="one_quarter"><a href="#"><img src="/images/demo/gallery/wsyoo.png" alt=""></a></li>
          </ul>
        </figure>
      </div>
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

<!-- start vue-common -->
<%@ include file="../common/vue-common.jsp" %>
<!-- end vue-common -->