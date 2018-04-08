


		<!-- ヘッダー -->
		<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#custom-collapse"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button><a class="navbar-brand" href="${menteUrl}" href="/">K-SHOP</a>
				</div>
				<div id="custom-collapse">
					<sec:authorize access="hasRole('ROLE_ADMIN')">
						<ul class="nav navbar-nav">
							<li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown">ジャンル</a>
								<ul class="dropdown-menu">
									<li><a href="${f:url('/maintenance/genreLg')}">大ジャンル</a></li>
									<li><a href="${f:url('/maintenance/genreMd')}">中ジャンル</a></li>
									<li><a href="${f:url('/maintenance/genreSm')}">小ジャンル</a></li>
								</ul>
							</li>
							<li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown">商品</a>
								<ul class="dropdown-menu">
									<li><a href="${menteUrl}/goods/list">商品</a></li>
									<li><a href="${menteUrl}/goodsimage/list">商品イメージ</a></li>
									<li><a href="${menteUrl}">商品価格</a></li>
									<li><a href="${menteUrl}">セール商品</a></li>
									<li><a href="${menteUrl}">配送料</a></li>
									<li><a href="${menteUrl}">キャンペーン</a></li>
									<li><a href="${menteUrl}">キャンペーン商品</a></li>
								</ul>
							</li>
							<li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown">ユーザー</a>
								<ul class="dropdown-menu">
									<li><a href="${menteUrl}/userinfo/list">ユーザー</a></li>
									<li><a href="">配送先</a></li>
									<li><a href="">支払方法</a></li>
								</ul>
							</li>
						</ul>
					</sec:authorize>
					<ul class="nav navbar-nav navbar-right">
						<sec:authorize access="hasRole('ROLE_USER')">
							<li>
								<a href="/"><i class="fa  fa-user"></i><sec:authentication property="principal.username" />さん</a>
							</li>
						</sec:authorize>
						<sec:authorize access="!hasRole('ROLE_USER')">
							<li>
								<c:url var="loginUrl" value="/login"></c:url>
								<a href="${loginUrl}"><i class="fa  fa-sign-in"></i>login</a>
							</li>
						</sec:authorize>
						<sec:authorize access="hasRole('ROLE_USER')">
							<li>
								<a href="javascript:formLogout.submit()">
									<c:url var="logoutUrl" value="/logout"></c:url>
									<form:form id="formLogout" name="formLogout" method="post" action="${logoutUrl}">
										<i class="fa fa-sign-out"></i>logout
									</form:form>
								</a>
							</li>
						</sec:authorize>
					</ul>
				</div>
			</div>
		</nav>
