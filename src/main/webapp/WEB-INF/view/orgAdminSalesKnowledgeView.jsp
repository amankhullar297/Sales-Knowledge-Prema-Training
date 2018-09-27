
<%@include file="include/header.jsp"%>
<%@include file="include/orgAdminSidebar.jsp"%>
<script>
window.setTimeout(function() {
    $(".alert-success").fadeTo(500, 0).slideUp(500, function(){
        $(this).slideUp(); 
    });
}, 8000);
window.setTimeout(function() {
    $(".alert-danger").fadeTo(500, 0).slideUp(500, function(){
        $(this).slideUp(); 
    });
}, 5000);
</script>
<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>
				DUMMY FORM
				<!-- <small>Taken from <a href="https://jqueryvalidation.org/" target="_blank">jqueryvalidation.org</a></small> -->
			</h2>
		</div>

		<div class="body">
		<c:if test="${success!=null }">
			<div class="alert alert-success alert-dismissible" id="success-alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Well done!</strong> ${success }
				
			</div>
			</c:if>
			<c:if test="${info!=null }">
			<div class="alert alert-info alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Heads up!</strong> ${info }
				
			</div>
			</c:if>
			<!-- <div class="alert alert-warning alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Warning!</strong> Better check yourself, you're not looking
				too good.
			</div> -->
			<c:if test="${error!=null }">
			<div class="alert alert-danger alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Oh snap!</strong>${error }
				
			</div>
			</c:if>
		</div>

		<!-- Advanced Validation -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>VALIDATED FORM</h2>

					</div>
					<div class="body">
						<form:form action="adminLoad" modelAttribute="salesKnowledge" id="form_advanced_validation" method="POST">
							<div class="form-group form-float">
								<p>
									<b>Select Client</b>
								</p>
								<form:select class="form-control show-tick" path="clientCompany.clientId" data-live-search="true"  required="false">

									<form:option  value="0">-- Select client --</form:option>
									<c:forEach  items="${clientsList}" var="client" varStatus="loop">
										<form:option  value="${client.clientId}">${client.clientName}</form:option>
									</c:forEach>
								</form:select>
							</div>

							<div class="form-group form-float">
								<p>
									<b>Select Product</b>
								</p>
								<form:select class="form-control show-tick" path="product.productId" data-live-search="true" required="false">
									
									<form:option value="0">-- Select product --</form:option>
									<c:forEach items="${productsList}" var="product"
										varStatus="loop">
										<option value="${product.productId}">${product.productType}</option>
									</c:forEach>
								</form:select>
							</div>

							
							<button class="btn btn-primary waves-effect" type="submit">SEARCH</button>
						</form:form>
					</div>


				</div>
			</div>
			<!-- #END# Advanced Validation -->


			<!-- Exportable Table -->
			<c:if test="${salesKnowledgeList!=null }">
			<div class="row clearfix">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="card">
						<div class="header">
							<h2>EXPORTABLE TABLE</h2>

						</div>
						<div class="body">
							<div class="table-responsive">
							
								<table
									class="table table-bordered table-striped table-hover dataTable js-exportable">
									<thead>
										<tr>
											<th>Employee name</th>
											<th>Client Company</th>
											<th>Product</th>

											<th>Sales date</th>
											<th>Knowledge</th>
											<th>Sales status</th>
											<th>Entry date</th>
											

										</tr>
									</thead>
									<tfoot>
										<tr>
											<th>Employee name</th>
											<th>Client Company</th>
											<th>Product</th>

											<th>Sales date</th>
											<th>Knowledge</th>
											<th>Sales status</th>
											<th>Entry date</th>
											

										</tr>
									</tfoot>
									<tbody>
									
										<c:forEach var="salesKnowledge" items="${salesKnowledgeList}">
											<tr>
												<td><c:out
														value="${salesKnowledge.regEmployee.empName}"></c:out></td>
												<td><c:out
														value="${salesKnowledge.clientCompany.clientName}"></c:out></td>
												<td><c:out
														value="${salesKnowledge.product.productType}"></c:out></td>

												<td><c:out value="${salesKnowledge.salesDate}"></c:out></td>
												<td><c:out value="${salesKnowledge.knowledge}"></c:out></td>
												<td><c:out value="${salesKnowledge.saleStatus}"></c:out></td>
												<td><c:out value="${salesKnowledge.entryDate}"></c:out></td>
												

												

													</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					 </div>
				</div>
				</div>
				</c:if>
				</div>
			</div>

</section><%@include file="include/footer.jsp"%>
