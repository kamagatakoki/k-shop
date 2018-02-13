<!DOCTYPE html>
	<%@ include file="/WEB-INF/views/common/header.jsp" %>

	<body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">

		<!-- ヘッダーメニュー -->
		<%@ include file="/WEB-INF/views/common/header_menu.jsp" %>

		<!-- 画面名 -->
		<c:import url="/WEB-INF/views/common/display_title.jsp" >
			<c:param name="title" value="大ジャンル" />
			<c:param name="subTitle" value="登録・更新" />
		</c:import>

		<!-- 入力部 -->
		<div layout:fragment="content">
			<form:form modelAttribute="genreLgForm" action="newedit" class="form-horizontal" method="post">
				<ul>
					<li th:each="error : ${#fields.detailedErrors()}" class="err" th:text="${error.message}" />
				</ul>
				<div class="form-group" th:classappend="${#fields.hasErrors('genreLgCd')}? 'has-error has-feedback'" >
					<h5 class="col-sm-3 font-alt mb-0">大ジャンルコード</h5>
					<div class="col-sm-9">
						<input type="number" th:field="*{genreLgCd}" class="form-control" value="10" placeholder="大ジャンルコード" th:readonly="*{(crud eq 'update') ? 'readonly' : 'false'}" />
						<span th:if="${#fields.hasErrors('genreLgCd')}" th:errors="*{genreLgCd}" class="help-block">error!</span>
					</div>
				</div>
				<div class="form-group" th:classappend="${#fields.hasErrors('genreLgNm')}? 'has-error has-feedback'">
					<h5 class="col-sm-3 font-alt mb-0">大ジャンル名称</h5>
					<div class="col-sm-9">
						<input type="text" th:field="*{genreLgNm}" class="form-control" placeholder="大ジャンル名称" />
						<span th:if="${#fields.hasErrors('genreLgNm')}" th:errors="*{genreLgNm}" class="help-block">error!</span>
					</div>
				</div>
				<div class="form-group" th:classappend="${#fields.hasErrors('displayOrder')}? 'has-error has-feedback'">
					<h5 class="col-sm-3 font-alt mb-0">表示順</h5>
					<div class="col-sm-9">
						<input type="number" th:field="*{displayOrder}" class="form-control" placeholder="表示順" />
						<span th:if="${#fields.hasErrors('displayOrder')}" th:errors="*{displayOrder}" class="help-block">error!</span>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-3 col-sm-9">
						<button type="submit" class="btn btn-border-d btn-circle btn-sm" name="goToBack" >戻る</button>
						<button type="submit" class="btn btn-d btn-circle btn-sm" name="regist" >登録</button>
					</div>
				</div>
				<!-- 画面モード(登録or編集) -->
				<input type="hidden" th:field="*{crud}" />
				<!-- 前画面入力値保持 -->
				<input type="hidden" name="searchGenreLgCd" th:value="*{searchGenreLgCd}" />
				<input type="hidden" name="searchGenreLgNm" th:value="*{searchGenreLgNm}" />
			</form>
		</div>
	<div layout:fragment="js"></div>
</html>