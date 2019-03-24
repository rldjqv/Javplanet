$(document).ready(function() {


});

function logout () {
	$.ajax({
	    url: "/api/user/logout", 
	    type: "GET"
	})
	.done(function(response) {
		alert("로그아웃 되었습니다.");
		window.location.href = "/";
	})
	.fail(function(xhr, status, errorThrown) {
	})
}