
<%@ page pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html:html>
<head>
<title><bean:message key="welcome.title"/></title>
<html:base/>
</head>
	<body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">



		<div class="container">
			<div class="row">
				<!-- 検索条件 -->
				<div class="container">
					<section class="module-extra-small">
					<html:form action="/genrelg/select" styleClass="form-horizontal" >
						<div class="form-group">
							<div class="col-sm-12">
								<html:text property="searchGenreLgCd" styleClass="form-control" value="" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-12">
								<html:text property="searchGenreLgNm" styleClass="form-control" value="" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-12">
								<html:submit styleClass="btn btn-g btn-circle" property="search">検索</html:submit>
							</div>
						</div>
					</html:form>
					<html:form action="/genrelg/create" styleClass="form-horizontal" >
								<html:submit styleClass="btn btn-border-d btn-circle" property="newedit">新規</html:submit>
								<html:hidden property="crud" value="insert" />
					</html:form>
					</section>
				</div>

				<html:errors />

				<!-- 検索結果 -->
				<div class="main">
					<section class="module-extra-small">
						<div class="container">
							<hr class="divider-w pt-20" />
							<div class="row  table-responsive">
								<div class="text-right">検索結果：<c:out value="${genreLgList.size()}" />件</div>
								<table class="table table-striped table-border checkout-table">
									<tbody>
										<tr>
											<th class="col-sm-3 text-center" style="vertical-align:middle" >大ジャンルコード</th>
											<th class="col-sm-5 text-center" style="vertical-align:middle">大ジャンル名称</th>
											<th class="col-sm-2 text-center" style="vertical-align:middle">表示順</th>
											<th class="col-sm-2 text-center caption-content" colspan="2" style="vertical-align:middle">編集</th>
										</tr>
										<c:forEach items="${genreLgList}" var="item">
											<tr>
												<td><h5 class="product-title font-alt"><c:out value="${item.genreLgCd}" /></h5></td>
												<td><h5 class="product-title font-alt"><c:out value="${item.genreLgNm}" /></h5></td>
												<td><h5 class="product-title font-alt"><c:out value="${item.displayOrder}" /></h5></td>
												<td>
													<html:form action="/genrelg/update" styleClass="form-horizontal" method="get">
														<html:submit styleClass="btn btn-border-d btn-circle btn-sm" property="newedit" > 編集</html:submit>
														<html:hidden property="crud" value="update" />
														<html:hidden property="genreLgCd" value="${item.genreLgCd}" />
													</html:form>
												</td>
												<td class="text-center">
													<html:form action="/genrelg/delete" styleClass="form-horizontal" method="post">
														<html:submit styleClass="btn btn-d btn-circle btn-sm" property="delete" > 削除</html:submit>
														<html:hidden property="genreLgCd" value="${item.genreLgCd}" />
													</html:form>
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

</body>
</html:html>