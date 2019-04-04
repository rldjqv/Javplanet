<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!-- start header -->
<!DOCTYPE html>
<html>
<head>
<title>키배닷컴</title>
<meta charset="utf-8">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="title" id="meta_title" content="">
<meta name="description" id="meta_title" content="">
<meta name="keywords" id="meta_keywords" content="">

<link href="/layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<link href="/layout/styles/custom.css" rel="stylesheet" type="text/css" media="all">

<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<script>
  (adsbygoogle = window.adsbygoogle || []).push({
    google_ad_client: "ca-pub-3323076458154442",
    enable_page_level_ads: true
  });
</script>
</head>

<body id="top">
<div class="wrapper row0">
  <div id="topbar" class="hoc clear"> 
    <div class="fl_left">
      <ul>
        <li><i class="fa fa-phone"></i> +00 (123) 456 7890</li>
        <li><i class="fa fa-envelope-o"></i> info@domain.com</li>
      </ul>
    </div>
    <div class="fl_right">
      <ul>
        <li><a href="/"><i class="fa fa-lg fa-home"></i></a></li>
        <c:if test="${sessionObject == null}">
        <li><a href="/user/login">Login</a></li>
        <li><a href="/user/register">Register</a></li>
        </c:if>
        <c:if test="${sessionObject != null}">
        <li><a href="#" onclick="logout()">Logout</a></li>
        </c:if>
      </ul>
    </div>
  </div>
</div>
<div class="wrapper row1">
  <header id="header" class="hoc clear"> 
    <h1><a href="/">키배닷컴</a></h1>
    <p></p>
  </header>
</div>
<div class="wrapper row4">
  <nav id="mainav" class="hoc clear"> 
    <ul class="clear">
      <li class="menu"><a href="/best">베스트</a></li>
      <li class="menu"><a href="/enter">연예인</a></li>
      <li class="menu"><a href="/celeb">인물</a></li>
      <li class="menu"><a href="/ggol">은꼴</a></li>
      <li class="menu"><a href="/gif">움짤</a></li>
      <li class="menu"><a href="/sports">스포츠</a></li>
      <li class="menu"><a href="/game">게임</a></li>
      <li class="menu"><a href="/issue">인터넷이슈</a></li>
      <li class="menu"><a href="/board?currentPage=1">자유게시판</a></li>
      <!-- <li class="menu"><a href="#">자유게시판</a></li> -->
      
<!--       <li><a class="drop" href="#">Pages</a>
        <ul>
          <li><a href="/gallery">Gallery</a></li>
          <li><a href="/full-width">Full Width</a></li>
        </ul>
      </li> -->
<!--        <li><a class="drop" href="#">게시판</a>
        <ul>
          <li><a href="/board">자유게시판</a></li>
          <li><a class="drop" href="#">Level 2 + Drop</a>
            <ul>
              <li><a href="#">Level 3</a></li>
              <li><a href="#">Level 3</a></li>
              <li><a href="#">Level 3</a></li>
            </ul>
          </li>
          <li><a href="/board">썰게시판</a></li>
        </ul>
      </li> -->
    </ul>
  </nav>
</div>
<!-- end header -->