<!DOCTYPE html>

	<%@ include file="/WEB-INF/view/common/header.jsp" %>

	<body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">

		<!-- ヘッダーメニュー -->
		<%@ include file="/WEB-INF/view/common/header_menu.jsp" %>

		<!-- 画面名 -->
		<c:import url="/WEB-INF/view/common/display_title.jsp" >
			<c:param name="title" value="中ジャンル" />
			<c:param name="subTitle" value="一覧" />
		</c:import>

		<div class="container">
			<div class="row">
				<!-- 検索条件 -->
				<div class="container">
					<section class="module-extra-small">
					<s:form action="/maintenance/genreMd" styleClass="form-horizontal" method="post">
						<div class="form-group">
							<div class="col-sm-6">
								<html:text property="searchGenreLgCd" styleClass="form-control" />
							</div>
							<div class="col-sm-6">
								<html:text property="searchGenreMdCd" styleClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-6">
								<html:text property="searchGenreLgNm" styleClass="form-control" />
							</div>
							<div class="col-sm-6">
								<html:text property="searchGenreMdNm" styleClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-12">
								<s:submit styleClass="btn btn-g btn-circle" property="search">検索</s:submit>
								<s:submit styleClass="btn btn-border-d btn-circle" property="newedit">新規</s:submit>
								<html:hidden property="crud" value="insert" />
							</div>
						</div>
					</s:form>
					</section>
				</div>

				<!-- エラーメッセージ(削除チェック用) -->
				<html:errors />

				<!-- 検索結果 -->
				<div class="main">
					<section class="module-extra-small">
						<div class="container">
							<hr class="divider-w pt-20" />
							<div class="row  table-responsive">
								<div class="text-right">検索結果：<c:out value="${genreMdList.size()}" />件</div>
								<table class="table table-striped table-border checkout-table">
									<tbody>
										<tr>
											<th class="col-sm-2 text-center" style="vertical-align:middle" >大ジャンルコード</th>
											<th class="col-sm-2 text-center" style="vertical-align:middle">大ジャンル名称</th>
											<th class="col-sm-2 text-center" style="vertical-align:middle">中ジャンルコード</th>
											<th class="col-sm-2 text-center" style="vertical-align:middle">中ジャンル名称</th>
											<th class="col-sm-2 text-center" style="vertical-align:middle">表示順</th>
											<th class="col-sm-2 text-center caption-content" colspan="2" style="vertical-align:middle">編集</th>
										</tr>
										<c:forEach items="${genreMdList}" var="item">
											<tr>
												<td><h5 class="product-title font-alt"><c:out value="${item.genreLgCd}" /></h5></td>
												<td><h5 class="product-title font-alt"><c:out value="${item.genreLg.genreLgNm}" /></h5></td>
												<td><h5 class="product-title font-alt"><c:out value="${item.genreMdCd}" /></h5></td>
												<td><h5 class="product-title font-alt"><c:out value="${item.genreMdNm}" /></h5></td>
												<td><h5 class="product-title font-alt"><c:out value="${item.displayOrder}" /></h5></td>
												<td>
													<s:form action="/maintenance/genreMd" styleClass="form-horizontal" method="post">
														<s:submit styleClass="btn btn-border-d btn-circle btn-sm" property="newedit" > 編集</s:submit>
														<html:hidden property="crud" value="update" />
														<html:hidden property="genreMdCd" value="${item.genreMdCd}" />
													</s:form>
												</td>
												<td class="text-center">
													<s:form action="/maintenance/genreMd" styleClass="form-horizontal" method="post">
														<s:submit styleClass="btn btn-d btn-circle btn-sm" property="delete" > 削除</s:submit>
														<html:hidden property="genreMdCd" value="${item.genreMdCd}" />
													</s:form>
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

		<%@ include file="/WEB-INF/view/common/footer.jsp" %>

	</body>
</html>