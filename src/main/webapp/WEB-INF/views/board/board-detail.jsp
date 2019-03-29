<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content" id="vue_board_detail" style="min-height: 680px;" v-cloak>
      <div class="scrollable" v-if="resultDatas.data != null">
      <span clas="board_detail_regDate">{{this.resultDatas.data.regDate}}</span>
      <header class="heading">{{this.resultDatas.data.title}}</header>
      <hr>
	      <div v-html="this.resultDatas.data.contents">
	      </div>
      </div>
    </div>
    <!-- / main body -->
    <div class="clear"></div>
  </main>
</div>

<!-- start footer -->
<%@ include file="../common/footer.jsp" %>
<!-- end footer -->

<script src="/js/vue/common/vue-common.js"></script>
<script src="/js/vue/board/vue-board-detail.js"></script>

<!-- start vue-common -->
<%-- <%@ include file="../common/vue-common.jsp" %> --%>
<!-- end vue-common -->