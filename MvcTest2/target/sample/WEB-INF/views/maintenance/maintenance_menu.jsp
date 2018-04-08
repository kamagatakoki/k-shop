<!DOCTYPE html>
<html lang="ja" dir="ltr" xmlns:th="http://www.thymeleaf.org" xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout" layout:decorator="common/layout_maintenance">

	<!-- ヘッダー -->
	<%@ include file="/WEB-INF/views/common/header.jsp" %>

	<body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">
		<div class="page-loader">
			<div class="loader">Loading...</div>
		</div>

		<!-- ヘッダーメニュー -->
		<%@ include file="/WEB-INF/views/common/header_menu.jsp" %>

		<section class="home-section home-full-height bg-dark-30" id="home" data-background="${resourceUrl}/assets/images/maintenance_menu.png">
			<div class="titan-caption">
				<div class="caption-content">
					<div class="font-alt mb-30 titan-title-size-1">K-shop</div>
					<div class="font-alt mb-40 titan-title-size-4">Master Maintenance</div>
				</div>
			</div>
		</section>

		<%@ include file="/WEB-INF/views/common/footer.jsp" %>

	</body>
</html>