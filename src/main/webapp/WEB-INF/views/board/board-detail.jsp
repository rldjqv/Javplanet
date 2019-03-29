<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear" id="vue_board_detail"> 
    <!-- main body -->
    <div class="content" v-if="resultDatas.data != null" v-cloak>
      <div class="scrollable">
      <span clas="board_detail_regDate">작성일:{{this.resultDatas.data.regDate}}</span>
      <header class="heading">{{this.resultDatas.data.title}}</header>
      <span class="board_detail_userNickName">글쓴이:{{this.resultDatas.data.userNickName}} ({{this.resultDatas.data.userIp}})</span>
      <span class="board_detail_viewCount_up_down">조회수:{{this.resultDatas.data.viewCount}} | 추천수:{{this.resultDatas.data.up}} | 비추천수:{{this.resultDatas.data.down}}</span>
      <hr><br>
      <div v-html="this.resultDatas.data.contents"></div>
      </div>
    </div>
    <div class="board_detail_up_down" v-if="resultDatas.data != null" v-cloak>
    <img class="board_detail_up_img" src="/images/icon/up.png" />
    <img class="board_detail_down_img" src="/images/icon/down.png" />
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