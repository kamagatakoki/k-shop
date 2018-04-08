<!DOCTYPE html>

	<%@ include file="/WEB-INF/view/common/header.jsp" %>

	<body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">

		<!-- ヘッダーメニュー -->
		<%@ include file="/WEB-INF/view/common/header_menu.jsp" %>

		<!-- 画面名 -->
		<c:import url="../common/display_title.jsp" >
			<c:param name="title" value="中ジャンル" />
			<c:param name="subTitle" value="登録・更新" />
		</c:import>

		<!-- 入力部 -->
		<div class="container">
			<div class="row">
				<section class="module-extra-small">
					<s:form action="/maintenance/genreMd" styleClass="form-horizontal" method="post">
						<div  class="form-group">
							<h5 class="col-sm-3 font-alt mb-0">大ジャンルコード</h5>
							<div class="col-sm-9 ${status.error ? 'has-error has-feedback':''}">
								<html:select property="genreLgCd">
									<html:options collection="genreLgList" property="genreLgCd" labelProperty="genreLgNm" />
								</html:select>
							</div>
						</div>
						<c:import url="../common/input.jsp" >
							<c:param name="id" value="genreMdCd" />
							<c:param name="title" value="中ジャンルコード" />
							<c:param name="value" value="${genreMdCd}" />
							<c:param name="readOnly" value="${crud == 'update' ? 'true' : 'false'}" />
						</c:import>
						<c:import url="../common/input.jsp" >
							<c:param name="id" value="genreMdNm" />
							<c:param name="title" value="中ジャンル名称" />
							<c:param name="value" value="${genreMdNm}" />
						</c:import>
						<c:import url="../common/input.jsp" >
							<c:param name="id" value="displayOrder" />
							<c:param name="title" value="表示順" />
							<c:param name="value" value="${displayOrder}" />
						</c:import>
						<div class="form-group">
							<div class="col-sm-offset-3 col-sm-9">
								<s:submit styleClass="btn btn-border-d btn-circle btn-sm" property="goToBack" >戻る</s:submit>
								<c:if test="${crud == 'insert' }">
									<s:submit styleClass="btn btn-d btn-circle btn-sm" property="insert" >登録</s:submit>
								</c:if>
								<c:if test="${crud == 'update' }">
									<s:submit styleClass="btn btn-d btn-circle btn-sm" property="update" >登録</s:submit>
								</c:if>
							</div>
						</div>
						<!-- 画面モード(登録or編集) -->
						<<html:hidden property="crud" value="${crud}" />
						<!-- 前画面入力値保持 -->
						<html:hidden property="searchGenreLgCd" value="${searchGenreLgCd}" />
						<html:hidden property="searchGenreMdCd" value="${searchGenreMdCd}" />
						<html:hidden property="searchGenreLgNm" value="${searchGenreLgNm}" />
						<html:hidden property="searchGenreMdNm" value="${searchGenreMdNm}" />
					</s:form>
				</section>
			</div>
		</div>
	</body>

	<%@ include file="/WEB-INF/view/common/footer.jsp" %>
</html>