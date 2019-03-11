<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content" id="vue_board">
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
          <tbody>
            <tr>
              <td style="text-align: center;">1</td>
              <td>리중딱 리중딱 신나는노래~~~~~~~ 나도 한번 불러보자~~~~~~~~~~~~~</td>
              <td style="text-align: center;">리중딱</td>
              <td style="text-align: center;">12-31</td>
              <td style="text-align: center;">99999</td>
              <td style="text-align: center;">3000</td>
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