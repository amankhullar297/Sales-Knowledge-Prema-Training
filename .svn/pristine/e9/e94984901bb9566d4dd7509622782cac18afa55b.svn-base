<%@include file="include/header.jsp"%>
<%@include file="include/orgEmpSidebar.jsp"%>

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
			<div class="alert alert-success alert-dismissible">
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
				<strong>Oh snap!</strong> ${error }
				
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
						<form:form action="salesKnowledgeInsert"
							id="form_advanced_validation" modelAttribute="salesKnowledge"
							method="POST">
		<form:hidden path="salesId" name="salesId" value="${salesKnowledge.salesId }"/>

							<!-- copy text input field from here -->

							<div class="form-group form-float">
								<p>
									<b>Select Client</b>
								</p>
								<form:select class="form-control show-tick"
									data-live-search="true" path="clientCompany.clientId"
									required="true">
							
									<option value="">-- Select client --</option>
									<c:forEach items="${clientsList}" var="client" varStatus="loop">

										<c:choose>
											<c:when test="${client.clientId==clientId }">
												<form:option selected="true" value="${client.clientId }">${client.clientName}
										</form:option>

											</c:when>
											<c:otherwise>
												<form:option value="${client.clientId }">${client.clientName}</form:option>

											</c:otherwise>
										</c:choose>

									</c:forEach>
								</form:select>
							</div>

							<div class="form-group form-float">
								<p>
									<b>Select Product</b>
								</p>
								<form:select class="form-control show-tick"
									data-live-search="true" path="product.productId"
									required="true">
									<option value="">-- Select product --</option>
									<c:forEach items="${productsList}" var="product"
										varStatus="loop">
										<form:option value="${product.productId}">${product.productType}</form:option>
									</c:forEach>
								</form:select>
							</div>

							<div class="form-group form-float">
								<p>

									<b>Enter your sales knowledge here</b>
								</p>
								<div class="form-line">
									<form:textarea row="6" path="knowledge" class="form-control"
										name="text field value" maxlength="300" required="true"></form:textarea>
									<label class="form-label">sales knowledge</label>

								</div>
							</div>

							<div class="form-group form-float">
								<p>
									<b>Select Sales status</b>
								</p>
								<form:select class="form-control show-tick"
									data-live-search="true" path="saleStatus" required="true">

									<form:option value="">-- Select sales status --</form:option>
									<form:option value="Y">Sold</form:option>
									<form:option value="N">Not sold</form:option>


								</form:select>

							</div>

							<div class="form-group form-float">
								<p>
									<b>Select Sales Date</b>
								</p>
								<div class="form-line">
									<form:input type="text" class="datepicker form-control"
										path="salesDate" placeholder="Please choose a date..." required="true" />
								</div>
								<div class="help-info">YYYY-MM-DD format</div>
							</div>


							<input class="btn btn-primary waves-effect" type="submit"
								value="SUBMIT" />

						</form:form>
					</div>
				</div>
			</div>
		</div>
		<!-- #END# Advanced Validation -->

		<!-- Exportable Table -->
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
										<th></th>
										<th></th>
										<th></th>
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
										<th></th>
										<th></th>
										<th></th>
									</tr>
								</tfoot>
								<tbody>

									<c:forEach items="${salesKnowledgeList}" var="sales"
										varStatus="loop">
										<tr>
											<td><c:out value="${sales.regEmployee.empName}"></c:out></td>
											<td><c:out value="${sales.clientCompany.clientName}"></c:out></td>
											<td><c:out value="${sales.product.productProvider}"></c:out></td>
											<td><c:out value="${sales.salesDate}"></c:out></td>
											<td><c:out value="${sales.knowledge}"></c:out></td>
											<td><c:out value="${sales.saleStatus}"></c:out></td>
											<td><c:out value="${sales.knowStatus}"></c:out></td>


											<c:choose>
												<c:when test="${sales.knowStatus=='T'}">
													<td><form action="salesKnowledgeDelete" method="post">

															<input type="hidden" name="salesId"
																value="${sales.salesId }"> <input
																type="submit" value="Delete"> <input
																type="hidden" name="clientId"
																value="${sales.clientCompany.clientId}">
															<input type="hidden" name="productId"
																value="${sales.product.productId}">

														</form></td>
													<td><form action="salesKnowledgeFind" method="post">
															<input type="hidden" name="salesId"
																value="${sales.salesId }"> <input
																type="submit" value="Show details">
														</form></td>
													<td><form action="salesKnowledgeConfirm" method="post">

															<input type="hidden" name="salesId"
																value="${sales.salesId }"> <input
																type="submit" value="Confirm"> <input
																type="hidden" name="clientId"
																value="${sales.clientCompany.clientId}">
															<input type="hidden" name="productId"
																value="${sales.product.productId}">

														</form></td>
												</c:when>
												 <c:when test='${sales.knowStatus eq "L"}'>
													<td><form action="postToHive" method="post">

															<input type="hidden" name="salesId"
																value="${sales.salesId }"> <input
																type="submit" value="Post to hive"> <input
																type="hidden" name="clientId"
																value="${sales.clientCompany.clientId}">
															<input type="hidden" name="productId"
																value="${sales.product.productId}">

														</form></td>
													<td></td>
													<td></td>
												</c:when>
												<c:when test="${sales.knowStatus == 'H'}">
													<td></td>
													<td></td>
													<td></td>
												</c:when> 
												<c:otherwise>
													<td></td>
													<td></td>
													<td></td>
												</c:otherwise>

											</c:choose>


										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- #END# Exportable Table -->


	</div>
</section>
<%@include file="include/footer.jsp"%>
