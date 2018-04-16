<!DOCTYPE html>

	<%@ include file="/WEB-INF/views/common/header.jsp" %>

	<body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">

		<!-- ヘッダーメニュー -->
		<%@ include file="/WEB-INF/views/common/header_menu.jsp" %>

		<!-- 画面名 -->
		<c:import url="/WEB-INF/views/common/display_title.jsp" >
			<c:param name="title" value="大ジャンル" />
			<c:param name="subTitle" value="一覧" />
		</c:import>

		<my:SampleTag name="aaa" />

		<div class="container">
			<div class="row">
				<!-- 検索条件 -->
				<div class="container">
					<section class="module-extra-small">
					<form:form modelAttribute="genreLgForm" action="list" class="form-horizontal" method="post">
						<div class="form-group">
							<div class="col-sm-12">
								<form:input path="searchGenreLgCd" class="form-control" placeholder="大ジャンルコード" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-12">
								<form:input path="searchGenreLgNm" class="form-control" placeholder="大ジャンル名称" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-12">
								<form:button class="btn btn-g btn-circle" name="search">検索</form:button>
								<form:button class="btn btn-border-d btn-circle" name="new">新規</form:button>
								<form:hidden path="crud" value="insert" />
							</div>
						</div>
					</form:form>
					</section>
				</div>

				<!-- エラーメッセージ(削除チェック用) -->
				<spring:hasBindErrors name="genreLgForm">
					<c:forEach items="${errors.allErrors}" var="error">
						<div class="alert alert-danger">
							<spring:message message="${error}"></spring:message>
						</div>
					</c:forEach>
				</spring:hasBindErrors>

				<!-- 検索結果 -->
				<div class="main">
					<section class="module-extra-small">
						<div class="container">
							<hr class="divider-w pt-20" />
							<div class="row  table-responsive">
								<div class="text-right">検索結果：<c:out value="${itemsSize}" />件</div>
								<table class="table table-striped table-border checkout-table">
									<tbody>
										<tr>
											<th class="col-sm-3 text-center" style="vertical-align:middle" >大ジャンルコード</th>
											<th class="col-sm-5 text-center" style="vertical-align:middle">大ジャンル名称</th>
											<th class="col-sm-2 text-center" style="vertical-align:middle">表示順</th>
											<th class="col-sm-2 text-center caption-content" colspan="2" style="vertical-align:middle">編集</th>
										</tr>
										<c:forEach items="${items}" var="item">
											<tr>
												<td><h5 class="product-title font-alt"><c:out value="${item.genreLgCd}" /></h5></td>
												<td><h5 class="product-title font-alt"><c:out value="${item.genreLgNm}" /></h5></td>
												<td><h5 class="product-title font-alt"><c:out value="${item.displayOrder}" /></h5></td>
												<td>
													<form:form action="newedit" class="form-horizontal" method="get">
														<button class="btn btn-border-d btn-circle btn-sm" type="submit" name="edit" ><i class="fa fa-cog fa-spin"></i> 編集</button>
														<input type="hidden" name="crud" value="update" />
														<input type="hidden" name="genreLgCd" value="${item.genreLgCd}" />
													</form:form>
												</td>
												<td class="text-center">
													<form:form action="list" class="form-horizontal" method="post">
														<button class="btn btn-d btn-circle btn-sm" type="submit" name="delete" ><i class="fa fa-times"></i> 削除</button>
														<input type="hidden" name="genreLgCd" value="${item.genreLgCd}" />
													</form:form>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</section>
				</div>
			</div>
		</div>

		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

	</body>
</html>