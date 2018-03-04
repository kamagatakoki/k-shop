<!DOCTYPE html>

	<%@ include file="/WEB-INF/views/common/header.jsp" %>

	<body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">

		<!-- ヘッダーメニュー -->
		<%@ include file="/WEB-INF/views/common/header_menu.jsp" %>

		<!-- 画面名 -->
		<c:import url="../common/display_title.jsp" >
			<c:param name="title" value="大ジャンル" />
			<c:param name="subTitle" value="登録・更新" />
		</c:import>

		<!-- 入力部 -->
		<div class="container">
			<div class="row">
				<section class="module-extra-small">
					<form:form modelAttribute="genreLgForm" action="newedit" class="form-horizontal" method="post">
						<c:import url="../common/input.jsp" >
							<c:param name="type" value="number" />
							<c:param name="id" value="genreLgCd" />
							<c:param name="title" value="大ジャンルコード" />
							<c:param name="readOnly" value="${genreLgForm.crud == 'update' ? 'true' : 'false'}" />
						</c:import>
						<c:import url="../common/input.jsp" >
							<c:param name="type" value="text" />
							<c:param name="id" value="genreLgNm" />
							<c:param name="title" value="大ジャンル名称" />
						</c:import>
						<c:import url="../common/input.jsp" >
							<c:param name="type" value="number" />
							<c:param name="id" value="displayOrder" />
							<c:param name="title" value="表示順" />
						</c:import>
						<div class="form-group">
							<div class="col-sm-offset-3 col-sm-9">
								<button type="submit" class="btn btn-border-d btn-circle btn-sm" name="goToBack" >戻る</button>
								<button type="submit" class="btn btn-d btn-circle btn-sm" name="regist" >登録</button>
							</div>
						</div>
						<!-- 画面モード(登録or編集) -->
						<form:input type="hidden" path="crud" />
						<!-- 前画面入力値保持 -->
						<form:input type="hidden" path="searchGenreLgCd" />
						<form:input type="hidden" path="searchGenreLgNm" />
					</form:form>
				</section>
			</div>
		</div>
	</body>

	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</html>