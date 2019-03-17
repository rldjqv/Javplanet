<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- start header -->
<%@ include file="../common/header.jsp" %>
<!-- end header -->

<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content" id="vue_login" style="height:550px;">
      <div class="scrollable">
      <header class="heading">Login</header>
        <table>
		<tr>	
			<th>ID</th>
			<td><input placeholder="" title="" autocomplete="off" type="text" required style="width:100%;"></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input placeholder="" title="" autocomplete="off" type="password" required style="width:100%;"></td>
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