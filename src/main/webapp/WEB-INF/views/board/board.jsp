<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content" id="vue_board" v-cloak>
      <div class="scrollable">
      <header class="heading">자유게시판</header>
        <table v-if="resultDatas.data != null">
          <thead>
            <tr>
              <th width="6%;" class="board_seq">번호</th>
              <th width="*;" class="board_title">제목</th>
              <th width="10%;" class="board_userId">글쓴이</th>
              <th width="8%;" class="board_regDate">날짜</th>
              <th width="6%;" class="board_viewCount">조회</th>
              <th width="6%;" class="board_up">UP</th>
              <th width="6%;" class="board_down">DOWN</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="datas, index in resultDatas.data.list">
              <td class="board_seq">{{datas.seq}}</td>
              <td class="board_title" style="text-align: left;"><a v-on:click="{{getBoardDetail(datas.seq)}}">{{datas.title}}</a></td>
              <td class="board_userId">{{datas.userId}}</td>
              <td class="board_regDate">{{datas.regDate}}</td>
              <td class="board_viewCount">{{datas.viewCount}}</td>
              <td class="board_up">{{datas.up}}</td>
              <td class="board_down">{{datas.down}}</td>
            </tr>
          </tbody>
        </table>
      </div>
      <nav class="pagination">
        <ul>
          <li><a href="#">&laquo;</a></li>
          <li><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li class="current"><strong>5</strong></li>
          <li><a href="#">6</a></li>
          <li><a href="#">7</a></li>
          <li><a href="#">8</a></li>
          <li><a href="#">9</a></li>
          <li><a href="#">10</a></li>
          <li><a href="#">&raquo;</a></li>
          <a class="contents_write" v-if="commonJs.isMobile == false" v-on:click="commonJs.uploadContents('board')">글쓰기</a>
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

<script src="/js/vue/common/vue-common.js"></script>
<script src="/js/vue/board/vue-board.js"></script>

<!-- start vue-common -->
<%-- <%@ include file="../common/vue-common.jsp" %> --%>
<!-- end vue-common -->