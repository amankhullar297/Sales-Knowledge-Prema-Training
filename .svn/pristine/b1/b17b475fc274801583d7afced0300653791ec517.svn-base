<%@include file="include/header.jsp"%>
<%@include file="include/sidebar.jsp"%>
<script>

window.onload = function() {
	showSuccessMessage();
	};

</script>
<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>
				PRODUCT TABLES
				<!--  <small>Taken from <a href="https://datatables.net/" target="_blank">datatables.net</a></small> -->
			</h2>
		</div>

		<div class="body">
		<!-- 	<div class="alert alert-success alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Well done!</strong> You successfully read this important
				alert message.
			</div>
			<div class="alert alert-info alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Heads up!</strong> This alert needs your attention, but it's
				not super important.
			</div> -->
			<!-- <div class="alert alert-warning alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Warning!</strong> Better check yourself, you're not looking
				too good.
			</div> -->
			<div class="alert alert-danger alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Oh snap!</strong> Change a few things up and try submitting
				again.
			</div>
		</div>
		
		<!-- Exportable Table -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>PRODUCT TABLE</h2>
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
										<th>Product Provider</th>
										<th>Product Type</th>
										<th>Usage Type</th>
										<th>Unit Price</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>Product Provider</th>
										<th>Product Type</th>
										<th>Usage Type</th>
										<th>Unit Price</th>
									</tr>
								</tfoot>
								<tbody>
									<tr>
										<c:forEach var="product" items="${productList}">
										<tr>
										<td><c:out value="${product.productProvider}"></c:out></td>
										<td><c:out value="${product.productType}"></c:out></td>
										<td><c:out value="${product.usageType}"></c:out></td>
										<td><c:out value="${product.unitPrice}"></c:out></td>
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
