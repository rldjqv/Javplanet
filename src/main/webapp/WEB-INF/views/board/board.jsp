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
            <tr style="text-align: center;">
              <th width="5%;">#</th>
              <th width="65%;">제목</th>
              <th width="10%;">글쓴이</th>
              <th width="10%;">날짜</th>
              <th width="5%;">조회</th>
              <th width="5%;">추천</th>
            </tr>
          </thead>
          <tbody v-if="resultDatas.data != null">
            <tr v-for="datas, index in resultDatas.data.list">
              <td style="text-align: center;">{{index+1}}</td>
              <td>{{datas.title}}</td>
              <td style="text-align: center;">{{datas.memNo}}</td>
              <td style="text-align: center; font-size: 11px;">{{datas.regDate}}</td>
              <td style="text-align: center;">{{datas.viewCount}}</td>
              <td style="text-align: center;">{{datas.up}}</td>
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