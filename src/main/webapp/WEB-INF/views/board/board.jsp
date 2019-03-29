<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear" id="vue_board" v-if="resultDatas.data != null" v-cloak> 
    <!-- main body -->
    <div class="content">
      <div class="scrollable">
      <header class="heading">
      	<span>자유게시판</span>
      	<span class="total_cnt">총 게시글 수 : {{resultDatas.header.totalCnt}}</span>
      </header>
        <table>
          <thead>
            <tr>
              <th width="6%" class="board_seq">번호</th>
              <th width="*" class="board_title">제목</th>
              <th width="10%" class="board_userId">글쓴이</th>
              <th width="8%" class="board_regDate">날짜</th>
              <th width="6%" class="board_viewCount">조회</th>
              <th width="4%" class="board_up"><img src="/images/icon/up.png"></th>
              <th width="4%" class="board_down"><img src="/images/icon/down.png"></th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="datas, index in resultDatas.data.list">
              <td class="board_seq">{{datas.seq}}</td>
              <td class="board_title" style="text-align: left;"><a @click="{{getBoardDetail(datas.seq)}}">{{datas.title}}</a></td>
              <td class="board_userId">{{datas.userNickName}}</td>
              <td class="board_regDate">{{datas.regDate}}</td>
              <td class="board_viewCount">{{datas.viewCount}}</td>
              <td class="board_up">{{datas.up}}</td>
              <td class="board_down">{{datas.down}}</td>
            </tr>
          </tbody>
        </table>
      </div>
      <pagination :total_cnt="resultDatas.header.totalCnt"></pagination>
      <c:if test="${sessionObject != null}">
      <a class="contents_write" v-if="commonJs.isMobile == false" v-on:click="commonJs.uploadContents(category)">글쓰기</a>
      </c:if>
    </div>
    <!-- / main body -->
    <div class="clear"></div>
  </main>
</div>

<!-- start footer -->
<%@ include file="../common/footer.jsp" %>
<!-- end footer -->

<script src="/js/vue/common/vue-common.js"></script>
<script src="/js/vue/board/vue-board.js"></script>

<!-- start vue-common -->
<%-- <%@ include file="../common/vue-common.jsp" %> --%>
<!-- end vue-common -->