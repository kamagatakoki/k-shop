<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>

<html lang="ja">
	<head>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" type="text/css" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" th:href="@{/webjars/bootstrap/3.3.7/css/bootstrap.min.css}" />
		<link rel="stylesheet" type="text/css" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" th:href="@{/webjars/bootstrap/3.3.7/css/bootstrap-theme.min.css}" />

		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js" th:src="@{/webjars/jquery/1.11.1/jquery.min.js}"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.jp}"></script>
		<!--
		Document Title
		=============================================
		-->
		<title>K-SHOP</title>
		<!--
		Favicons
		=============================================
		-->
		<link rel="apple-touch-icon" sizes="57x57" href="../../static/assets/images/favicons/apple-icon-57x57.png" th:href="@{/assets/images/favicons/apple-icon-57x57.png}" />
		<link rel="apple-touch-icon" sizes="60x60" href="../../static/assets/images/favicons/apple-icon-60x60.png" th:href="@{/assets/images/favicons/apple-icon-60x60.png}" />
		<link rel="apple-touch-icon" sizes="72x72" href="../../static/assets/images/favicons/apple-icon-72x72.png" th:href="@{/assets/images/favicons/apple-icon-72x72.png}" />
		<link rel="apple-touch-icon" sizes="76x76" href="../../static/assets/images/favicons/apple-icon-76x76.png" th:href="@{/assets/images/favicons/apple-icon-76x76.png}" />
		<link rel="apple-touch-icon" sizes="114x114" href="../../static/assets/images/favicons/apple-icon-114x114.png" th:href="@{/assets/images/favicons/apple-icon-114x114.png}" />
		<link rel="apple-touch-icon" sizes="120x120" href="../../static/assets/images/favicons/apple-icon-120x120.png" th:href="@{/assets/images/favicons/apple-icon-120x120.png}" />
		<link rel="apple-touch-icon" sizes="144x144" href="../../static/assets/images/favicons/apple-icon-144x144.png" th:href="@{/assets/images/favicons/apple-icon-144x144.png}" />
		<link rel="apple-touch-icon" sizes="152x152" href="../../static/assets/images/favicons/apple-icon-152x152.png" th:href="@{/assets/images/favicons/apple-icon-152x152.png}" />
		<link rel="apple-touch-icon" sizes="180x180" href="../../static/assets/images/favicons/apple-icon-180x180.png" th:href="@{/assets/images/favicons/apple-icon-180x180.png}" />
		<link rel="icon" type="image/png" sizes="192x192" href="../../static/assets/images/favicons/android-icon-192x192.png" th:href="@{/assets/images/favicons/android-icon-192x192.png}" />
		<link rel="icon" type="image/png" sizes="32x32" href="../../static/assets/images/favicons/favicon-32x32.png" th:href="@{/assets/images/favicons/favicon-32x32.png}" />
		<link rel="icon" type="image/png" sizes="96x96" href="../../static/assets/images/favicons/favicon-96x96.png" th:href="@{/assets/images/favicons/favicon-96x96.png}" />
		<link rel="icon" type="image/png" sizes="16x16" href="../../static/assets/images/favicons/favicon-16x16.png" th:href="@{/assets/images/favicons/favicon-16x16.png}" />
		<link rel="manifest" href="/manifest.json" />
		<meta name="msapplication-TileColor" content="#ffffff" />
		<meta name="msapplication-TileImage" content="assets/images/favicons/ms-icon-144x144.png" th:content="@{/assets/images/favicons/ms-icon-144x144.png}" />
		<meta name="theme-color" content="#ffffff" />
		<!--
		Stylesheets
		=============================================

		-->
		<!-- Default stylesheets-->
		<link href="../../static/assets/lib/bootstrap/dist/css/bootstrap.min.css" th:href="@{/assets/lib/bootstrap/dist/css/bootstrap.min.css}" rel="stylesheet" />
		<!-- Template specific stylesheets-->
		<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:400,700" rel="stylesheet" />
		<link href="https://fonts.googleapis.com/css?family=Volkhov:400i" rel="stylesheet" />
		<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet" />
		<link href="../../static/assets/lib/animate.css/animate.css" th:href="@{/assets/lib/animate.css/animate.css}" rel="stylesheet" />
		<link href="../../static/assets/lib/components-font-awesome/css/font-awesome.min.css" th:href="@{/assets/lib/components-font-awesome/css/font-awesome.min.css}" rel="stylesheet" />
		<link href="../../static/assets/lib/et-line-font/et-line-font.css" th:href="@{/assets/lib/et-line-font/et-line-font.css}" rel="stylesheet" />
		<link href="../../static/assets/lib/flexslider/flexslider.css" th:href="@{/assets/lib/flexslider/flexslider.css}" rel="stylesheet" />
		<link href="../../static/assets/lib/owl.carousel/dist/assets/owl.carousel.min.css" th:href="@{/assets/lib/owl.carousel/dist/assets/owl.carousel.min.css}" rel="stylesheet" />
		<link href="../../static/assets/lib/owl.carousel/dist/assets/owl.theme.default.min.css" th:href="@{/assets/lib/owl.carousel/dist/assets/owl.theme.default.min.css}" rel="stylesheet" />
		<link href="../../static/assets/lib/magnific-popup/dist/magnific-popup.css" th:href="@{/assets/lib/magnific-popup/dist/magnific-popup.css}" rel="stylesheet" />
		<link href="../../static/assets/lib/simple-text-rotator/simpletextrotator.css" th:href="@{/assets/lib/simple-text-rotator/simpletextrotator.css}" rel="stylesheet" />
		<!-- Main stylesheet and color file-->
		<link href="../../static/assets/css/style.css" th:href="@{/assets/css/style.css}" rel="stylesheet" />
		<link id="color-scheme" href="../../static/assets/css/colors/default.css" th:href="@{/assets/css/colors/default.css}" rel="stylesheet" />
	</head>

	<body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">
		<div class="page-loader">
			<div class="loader">Loading...</div>
		</div>

		<!-- ヘッダー -->
		<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#custom-collapse"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button><a class="navbar-brand" href="maintenance_menu.html" th:href="@{/}">K-SHOP</a>
				</div>
				<div id="custom-collapse">
					<ul class="nav navbar-nav">
						<li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown">ジャンル</a>
							<ul class="dropdown-menu">
								<li><a href="genrelg_list.html" th:href="@{/maintenance/genrelg/list}">大ジャンル</a></li>
								<li><a href="genremd_list.html" th:href="@{/maintenance/genremd/list}">中ジャンル</a></li>
								<li><a href="genresm_list.html" th:href="@{/maintenance/genresm/list}">小ジャンル</a></li>
							</ul>
						</li>
						<li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown">商品</a>
							<ul class="dropdown-menu">
								<li><a href="goods_list.html" th:href="@{/maintenance/goods/list}">商品</a></li>
								<li><a href="goodsimage_list.html" th:href="@{/maintenance/goodsimage/list}">商品イメージ</a></li>
								<li><a href="">商品価格</a></li>
								<li><a href="">セール商品</a></li>
								<li><a href="">配送料</a></li>
								<li><a href="">キャンペーン</a></li>
								<li><a href="">キャンペーン商品</a></li>
							</ul>
						</li>
						<li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown">ユーザー</a>
							<ul class="dropdown-menu">
								<li><a href="userinfo_list.html" th:href="@{/maintenance/userinfo/list}">ユーザー</a></li>
								<li><a href="">配送先</a></li>
								<li><a href="">支払方法</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</nav>

		<!-- 画面名 -->
		<section class="module bg-dark-30 home-sub-section" data-background="../../static/assets/images/maintenance_menu.png" th:attr="data-background=@{/assets/images/maintenance_menu.png}">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3">
						<div layout:fragment="title">
							Fake content
						</div>
					</div>
				</div>
			</div>
		</section>

		<div class="container">
			<section class="module-extra-small">
				<div layout:fragment="content">
					Fake content
				</div>
			</section>
		</div>

		<div class="scroll-up"><a href="#totop"><i class="fa fa-angle-double-up"></i></a></div>
		<!--
		JavaScripts
		=============================================
		-->
		<script src="../../static/assets/lib/jquery/dist/jquery.js" th:src="@{/assets/lib/jquery/dist/jquery.js}"></script>
		<script src="../../static/assets/lib/bootstrap/dist/js/bootstrap.min.js" th:src="@{/assets/lib/bootstrap/dist/js/bootstrap.min.js}"></script>
		<script src="../../static/assets/lib/wow/dist/wow.js" th:src="@{/assets/lib/wow/dist/wow.js}"></script>
		<script src="../../static/assets/lib/jquery.mb.ytplayer/dist/jquery.mb.YTPlayer.js" th:src="@{/assets/lib/jquery.mb.ytplayer/dist/jquery.mb.YTPlayer.js}"></script>
		<script src="../../static/assets/lib/isotope/dist/isotope.pkgd.js" th:src="@{/assets/lib/isotope/dist/isotope.pkgd.js}"></script>
		<script src="../../static/assets/lib/imagesloaded/imagesloaded.pkgd.js" th:src="@{/assets/lib/imagesloaded/imagesloaded.pkgd.js}"></script>
		<script src="../../static/assets/lib/flexslider/jquery.flexslider.js" th:src="@{/assets/lib/flexslider/jquery.flexslider.js}"></script>
		<script src="../../static/assets/lib/owl.carousel/dist/owl.carousel.min.js" th:src="@{/assets/lib/owl.carousel/dist/owl.carousel.min.js}"></script>
		<script src="../../static/assets/lib/smoothscroll.js" th:src="@{/assets/lib/smoothscroll.js}"></script>
		<script src="../../static/assets/lib/magnific-popup/dist/jquery.magnific-popup.js" th:src="@{/assets/lib/magnific-popup/dist/jquery.magnific-popup.js}"></script>
		<script src="../../static/assets/lib/simple-text-rotator/jquery.simple-text-rotator.min.js" th:src="@{/assets/lib/simple-text-rotator/jquery.simple-text-rotator.min.js}"></script>
		<script src="../../static/assets/js/plugins.js" th:src="@{/assets/js/plugins.js}"></script>
		<script src="../../static/assets/js/main.js" th:src="@{/assets/js/main.js}"></script>

		<div layout:fragment="js">
			Fake content
		</div>
	</body>
</html>