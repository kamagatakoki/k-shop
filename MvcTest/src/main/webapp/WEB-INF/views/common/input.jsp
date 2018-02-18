
	<!-- INPUT -->
	<div  class="form-group">
		<h5 class="col-sm-3 font-alt mb-0">${param.title}</h5>
		<spring:bind path="${param.id}">
			<div class="col-sm-9 ${status.error ? 'has-error has-feedback':''}">
				<form:input
					type="${param.type}"
					path="${param.id}"
					class="form-control has-error has-feedback"
					placeholder="${param.title}"
					readonly="${param.readOnly}"
				/>
				<form:errors path="${param.id}" cssClass="has-error help-block"></form:errors>
			</div>
		</spring:bind>
	</div>