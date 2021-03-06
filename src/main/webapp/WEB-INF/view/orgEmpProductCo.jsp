<%@include file="include/header.jsp"%>
<%@include file="include/orgEmpSidebar.jsp"%>
<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>PRODUCT COMPETITOR LIST</h2>
		</div>
		<!-- Advanced Validation -->

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
						<table class="table table-bordered table-striped table-hover dataTable js-exportable">
							<thead>
								<tr>
									<th>PRODUCT</th>
									<th>COMPANY NAME</th>
									<th>PRODUCT TYPE</th>
									<th>PRODUCT PROVIDER</th>

								</tr>
							</thead>
							<tfoot>
								<tr>
									<th>PRODUCT</th>
									<th>COMPANY NAME</th>
									<th>PRODUCT TYPE</th>
									<th>PRODUCT PROVIDER</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="pc" items="${competitorList}">
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