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
        <table>
          <thead>
            <tr>
              <th width="5%;">번호</th>
              <th width="*;">제목</th>
              <th width="10%;">글쓴이</th>
              <th width="8%;">날짜</th>
              <th width="5%;">조회</th>
              <th width="5%;">UP</th>
              <th width="6%;">DOWN</th>
            </tr>
          </thead>
          <tbody v-if="resultDatas.data != null">
            <tr v-for="datas, index in resultDatas.data.list">
              <td>{{datas.seq}}</td>
              <td style="text-align: left;" v-on:click="{{getBoardDetail(datas.seq)}}"><a>{{datas.title}}</a></td>
              <td>{{datas.userId}}</td>
              <td style="font-size: 13px;">{{datas.regDate}}</td>
              <td>{{datas.viewCount}}</td>
              <td>{{datas.up}}</td>
              <td>{{datas.down}}</td>
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