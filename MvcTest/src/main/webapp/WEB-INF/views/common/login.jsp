<!DOCTYPE html>

	<%@ include file="/WEB-INF/views/common/header.jsp" %>

	<body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">

		<section class="module bg-dark-30" data-background="${resourceUrl}/image/login-background.jpg">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3">
						<h1 class="module-title font-alt mb-0 mt-50">login</h1>
					</div>
				</div>
			</div>
		</section>

		<section class="module">
			<div class="container">
				<div class="row">
					<c:url var="loginUrl" value="/login"></c:url>
					<form:form method="post" action="${loginUrl}">
						<c:if test="${param.containsKey('error')}">
							<div class="alert alert-danger col-sm-10 col-sm-offset-1" role="alert">
								<button class="close" type="button" data-dismiss="alert" aria-hidden="true">&times;</button><i class="fa fa-exclamation-triangle"></i><strong>メールアドレスまたはパスワードが間違っています。</strong>
							</div>
						</c:if>

						<div class="col-sm-10 col-sm-offset-1 mb-sm-40">
							<h4 class="font-alt">ログイン</h4>
							<hr class="divider-w mb-10">
								<div class="form-group">
									<input class="form-control" id="email" type="text" name="email" placeholder="Email"/>
								</div>
								<div class="form-group">
									<input class="form-control" id="password" type="password" name="password" placeholder="Password"/>
								</div>
								<div class="form-group">
									<button type="submit" class="btn btn-round btn-b">Login</button>
								</div>
								<div class="form-group">テスト用ログイン</div>
								<div class="form-group">  メールアドレス：test@test.co.jp</div>
								<div class="form-group">  パスワード：test</div>
						</div>
					</form:form>
				</div>
			</div>
		</section>

		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

	</body>

</html>
