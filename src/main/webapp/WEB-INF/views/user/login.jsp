<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content" id="vue_login">
      <div class="scrollable">
      <header class="heading">로그인</header>
        <table>
		<tr>	
			<th>ID</th>
			<td><input placeholder="" type="text" required style="width:100%;" v-model="loginParam.userId"></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input placeholder="" type="password" required style="width:100%;" v-model="loginParam.password"></td>
		</tr>
		<tr>
			<th class="login" colspan="2" @click="getLogin()" style="cursor:pointer;">로그인</th>
		</tr>
        </table>
      </div>
    <!-- / main body -->
    <div class="clear"></div>
  </main>
</div>

<!-- start footer -->
<%@ include file="../common/footer.jsp" %>
<!-- end footer -->

<script src="/js/vue/common/vue-common.js"></script>
<script src="/js/vue/user/vue-login.js"></script>

<!-- start vue-common -->
<%-- <%@ include file="../common/vue-common.jsp" %> --%>
<!-- end vue-common -->