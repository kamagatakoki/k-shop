
	<!-- INPUT -->
	<div  class="form-group">
		<h5 class="col-sm-3 font-alt mb-0">${param.title}</h5>
		<div class="col-sm-9 ${status.error ? 'has-error has-feedback':''}">
			<html:text
				property="${param.id}"
				value="${param.value}"
				styleClass="form-control has-error has-feedback"
				readonly="${param.readOnly}"
			/>
			<html:errors property="${param.id}"></html:errors>
		</div>
	</div>