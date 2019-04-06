<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear" id="vue_board_detail" v-if="resultDatas.data != null" v-cloak> 
    <!-- main body -->
    <div class="content">
      <div class="scrollable">
      <span clas="board_detail_regDate">작성일:{{this.resultDatas.data.regDate}}</span>
	  <div class="board_detail_previous_next">
      	<a v-if="this.resultDatas.data.nextSeq != 0" class="board_detail_next" @click="getNextPage()">△다음글</a>
      	<a v-if="this.resultDatas.data.previousSeq != 0" class="board_detail_previous" @click="getPreviousPage()">▽이전글</a>
      </div>
      <header class="heading">{{this.resultDatas.data.title}}</header>
      <span class="board_detail_userNickName">글쓴이:{{this.resultDatas.data.userNickName}}</span><span class="board_detail_userIp"> | IP:{{this.resultDatas.data.userIp}}</span>
      <span class="board_detail_viewCount_up_down">조회:{{this.resultDatas.data.viewCount}} | 추천:{{this.resultDatas.data.up}} | 비추천:{{this.resultDatas.data.down}}</span>
      <hr><br>
      <div v-html="this.resultDatas.data.contents"></div>
      </div>
    </div>
    <div class="board_detail_up_down">
    	<!-- <img class="board_detail_up_img" src="/images/icon/up.png" /> -->
    	<!-- <img class="board_detail_down_img" src="/images/icon/down.png" /> -->
   		<span class="board_detail_up" @click="putUp(resultDatas.data.seq)">추천하기</span> <span class="board_detail_up_count">{{this.resultDatas.data.up}}</span>
   		<span class="board_detail_down" @click="putDown(resultDatas.data.seq)"> | 비추천하기</span> <span class="board_detail_down_count">{{this.resultDatas.data.down}}</span>
    </div>
    <div class="board_detail_bottom">
    	<a class="board_detail_replay" @click="openReply()">댓글쓰기</a>
    	<a class="board_detail_list" @click="getHistoryBack()">목록보기</a>
    </div>
    <hr>
    <div class="board_detail_reply_div" v-if="isReplyOpen">
    	<textarea class="board_detail_reply" v-model="reply"></textarea>
    	<div class="board_detail_reply_button">
	    	<button class="board_detail_reply_close" @click="openReply()">닫기</button>
	    	<button class="board_detail_reply_save" @click="postReply(resultDatas.data.seq)">저장하기</button>
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