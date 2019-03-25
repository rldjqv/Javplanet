<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content" id="vue_register">
      <div class="scrollable">
      <header class="heading">회원가입</header>
        <table>
		<tr>	
			<th>아이디 *</th>
			<td v-if="!this.isCheckUserId"><input class="register_form" placeholder="" type="text" required v-model="registerParam.userId"></td>
			<td v-if="this.isCheckUserId"><input class="register_form" placeholder="" type="text" readonly v-model="registerParam.userId"></td>
			<td v-if="!this.isCheckUserId" @click="getUserIdCheck()">중복체크</td>
		</tr>
		<tr>
			<th>패스워드 *</th>
			<td><input class="register_form" placeholder="" type="password" required v-model="registerParam.password"></td>
			<td>{{getIsCheckPasswordValid}}</td>
		</tr>
		<tr>
			<th>패스워드확인 *</th>
			<td><input class="register_form" placeholder="" type="password" required v-model="passwordConfirm"></td>
			<td>{{getIsCheckPasswordConfirm}}</td>
		</tr>
		<tr>
			<th>닉네임 *</th>
			<td v-if="!this.isCheckUserNickName"><input class="register_form" placeholder="" type="text" required v-model="registerParam.userNickName"></td>
			<td v-if="this.isCheckUserNickName"><input class="register_form" placeholder="" type="text" readonly v-model="registerParam.userNickName"></td>
			<td v-if="!this.isCheckUserNickName" @click="getUserNickNameCheck()">중복체크</td>
		</tr>
		<tr>
			<th class="login" colspan="2" @click="postUserRegister()" style="cursor:pointer;">회원가입</th>
			<th class="login" @click="setFormReset()" style="cursor:pointer;">리셋</th>
		</tr>
        </table>
    <!-- / main body -->
    <div class="clear"></div>
  </main>
</div>

<!-- start footer -->
<%@ include file="../common/footer.jsp" %>
<!-- end footer -->

<script src="/js/vue/common/vue-common.js"></script>
<script src="/js/vue/user/vue-register.js"></script>

<!-- start vue-common -->
<%-- <%@ include file="../common/vue-common.jsp" %> --%>
<!-- end vue-common -->