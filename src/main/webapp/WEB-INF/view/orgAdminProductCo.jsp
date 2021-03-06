

<%@include file="include/header.jsp"%>
<%@include file="include/orgAdminSidebar.jsp"%>
<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>Welcome</h2>
		</div>
		<!-- Advanced Validation -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>INSERT/UPDATE DETAILS</h2>

					</div>
					<div class="body">
					<c:if test="${result!=null}">
			<div class="alert alert-success alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong></strong> ${result}
				
			</div>
			</c:if>
						<form:form method="post" action="productCompetitorInsert" modelAttribute="productCompetitor" id="form_advanced_validation">
						
							<div class="form-group form-float">
								<p>
									<b></b>
								</p>
								<div class="form-line">
								<label class="form-label">PRODUCT:</label><br/><br/>
									<form:select class="form-control show-tick" data-live-search="true" path="product.productId" required="true">
										<option value="">--SELECT--</option>
										<c:forEach items="${productList}" var="products" varStatus="loop">
										<c:if test="${products.productStatus == 'A'}">
											<form:option value="${products.productId}">${products.productType}</form:option>
											</c:if>
										</c:forEach>
										
									</form:select>
										
								
								</div>
								<div class="help-info">ENTER YOUR PRODUCT TYPE</div>
							</div>
							<div class="form-group form-float">
								<p>
									<b></b>
								</p>
								<div class="form-line">
									<form:input type="text" class="form-control" path="compName" required="true" id="compName"/>
										<span><form:errors path="compName"></form:errors></span>
									<label class="form-label">COMPANY NAME:</label>
								</div>
								<div class="help-info">ENTER COMPANY NAME</div>
							</div>
							<div class="form-group form-float">
								<p>
									<b></b>
								</p>
								<div class="form-line">
									<form:input type="text" class="form-control" path="productType" required="true"/>
									<label class="form-label">PRODUCT TYPE OF COMPETITOR:</label>
								</div>
								<div class="help-info">ENTER PRODUCT TYPE</div>
							</div> 
							   <div class="form-group form-float">
								<p>
									<b></b>
								</p>
								<div class="form-line">
									<form:input type="text" class="form-control"
										path="productProvider" required="true"/>
									<label class="form-label">PRODUCT PROVIDER:</label>
								</div>
								<div class="help-info">ENTER PRODUCT PROVIDER</div>
							</div> 
						<div class="form-group form-float">
							<div class="form-line">
							<label class="form-label">STATUS:</label>
							<br/>
								<form:select class="form-control show-tick"
									data-live-search="true" path="status" required="true">
									<form:option value="active"> ACTIVE</form:option>
									<form:option value="delete"> DELETE</form:option>
								</form:select>
								
							</div>
							</div>
							<div class="form-group form-float">
								<p>
									<b></b>
								</p>
								<!-- copy text input field from here -->








								<!-- copy text input field from here -->


								<!-- 	for date select from here -->




								<!-- 	for date select from here -->





								<!-- for dropdown select this div -->

								<!-- 

							<div class="form-group form-float">
								<p>
									<b>Select with Search Bar</b>
								</p>
								<select class="form-control show-tick" data-live-search="true">
									<option>Hot Dog, Fries and a Soda</option>
									<option>Burger, Shake and a Smile</option>
									<option>Sugar, Spice and all things nice</option>
									<option>svgsvwv a Soda</option>
									<option>gsbebhetSmile</option>
									<option>eqihfiqgs nice</option>
									<option>sfhfida</option>
									<option>worfhowqmile</option>
									<option>qhofhqeoghis nice</option>
								</select>
							</div>-->


								<!-- for dropdown select this div -->
							</div>

							<form:hidden path="compId" />
							<button class="btn btn-primary waves-effect" type="submit">INSERT/UPDATE</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>

		<!-- #END# Task Info -->

	</div>


	<!-- Exportable Table -->

	<div class="row clearfix">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="card">
				<div class="header">
					<h2>COMPETITOR LIST</h2>
					<ul class="header-dropdown m-r--5">
						<li class="dropdown"><a href="javascript:void(0);"
							class="dropdown-toggle" data-toggle="dropdown" role="button"
							aria-haspopup="true" aria-expanded="false"> <i
								class="material-icons">more_vert</i>
						</a>
							<ul class="dropdown-menu pull-right">
								<li><a href="javascript:void(0);">Action</a></li>
								<li><a href="javascript:void(0);">Another action</a></li>
								<li><a href="javascript:void(0);">Something else here</a></li>
							</ul></li>
					</ul>
				</div>
				<div class="body">
					<div class="table-responsive">
						<table
							class="table table-bordered table-striped table-hover dataTable js-exportable">
							<thead>
								<tr>
									<th> PRODUCT</th>
									<th>COMPANY NAME</th>
									<th>PRODUCT TYPE</th>
									<th>PRODUCT PROVIDER</th>
									<th>STATUS</th>
									<th>DELETE</th>
									<th>DETAILS</th>

								</tr>
							</thead>
							<tfoot>
								<tr>
									<th> PRODUCT</th>
									<th>COMPANY NAME</th>
									<th>PRODUCT TYPE</th>
									<th>PRODUCT PROVIDER</th>
									<th>STATUS</th>
									<th>DELETE</th>
									<th>DETAILS</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="pc" items="${competitorList}" varStatus="loop">
									<tr>
										<td>										
										<c:out value="${pc.product.productType}">
											</c:out></td>
										<td><c:out value="${pc.compName}">
											</c:out></td>
										<td><c:out value="${pc.productType}">
											</c:out></td>
										<td><c:out value="${pc.productProvider}">
											</c:out></td>
										<td><c:out value="${pc.status}">
											</c:out></td>
										<td>
											<form action="productCompetitorDelete" method="post">
												<input type="hidden" name="compId" value="${pc.compId}">

												<input type="submit" value="DELETE">
											</form>
										</td>
										<td>
											<form action="productCompetitorFindByCompId" method="post">
												<input type="hidden" name="compId" value="${pc.compId}">
												<input type="submit" value="UPDATE">
											</form>
										</td>
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
</section>
<%@include file="include/footer.jsp"%>