<%@include file="include/header.jsp" %>
<%@include file="include/orgAdminSidebar.jsp" %><script>

window.onload = function() {
	showSuccessMessage();
	};

</script>
<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>
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
				
			</div>
		</div>
		
		<!-- Exportable Table -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>PLAN LIST</h2>
						<ul class="header-dropdown m-r--5">
							<li class="dropdown"><a href="javascript:void(0);"
								class="dropdown-toggle" data-toggle="dropdown" role="button"
								aria-haspopup="true" aria-expanded="false"> <i
									class="material-icons"></i>
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
                                                <th>Plan Id</th>
                                                <th>Plan Description</th>
                                                <th>Plan Validity</th>
                                                <th>Plan Amount</th>
                                                <th>Plan Status</th>
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                                <th>Plan Id</th>
                                                <th>Plan Description</th>
                                                <th>Plan Validity</th>
                                                <th>Plan Amount</th>
                                                <th>Plan Status</th>
                                                </tr>
                                        </tfoot>
								<tbody>
									<c:forEach var="plan" items="${planList}">
										<tr>
											<td><c:out value="${plan.planId}"></c:out></td>
											<td><c:out value="${plan.description}"></c:out></td>
											<td><c:out value="${plan.validity}"></c:out></td>
											<td><c:out value="${plan.amount}"></c:out></td>
											<td><c:out value="${plan.status}"></c:out></td>

											

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