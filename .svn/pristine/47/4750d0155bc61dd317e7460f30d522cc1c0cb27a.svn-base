<%@include file="include/header.jsp"%>
<%@include file="include/orgAdminSidebar.jsp"%>
<script>

window.onload = function() {
	showSuccessMessage();
	};

</script>
<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>
				DUMMY DATATABLES
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
			</div>
		 <div class="alert alert-danger alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Oh snap!</strong> Change a few things up and try submitting
				again.
			</div> -->
		</div> 
		
		<!-- Exportable Table -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>EXPORTABLE TABLE</h2>
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
									    <th>Employee Id</th>
									    <th>Organization Id</th>
										<th>Employee Name</th>
										<th>Employee Address</th>
										<th>Mobile Number</th>
										<th>Email</th>
										<th>Password</th>
										<th>Role</th>
										<th>Block Status</th>
										<th>Password Status</th>
										<th>DOJ</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>Employee Id</th>
									    <th>Organization Id</th>
										<th>Employee Name</th>
										<th>Employee Address</th>
										<th>Mobile Number</th>
										<th>Email</th>
										<th>Password</th>
										<th>Role</th>
										<th>Block Status</th>
										<th>Password Status</th>
										<th>DOJ</th>
									</tr>
								</tfoot>
								<tbody>
									<c:forEach var="orgemployee" items="${orgEmployeeList}">
                                            <tr>
                                            <td><c:out value="${orgemployee.empId}"></c:out></td>
                                            <td><c:out value="${orgemployee.organization.orgId}"></c:out></td>
											<td><c:out value="${orgemployee.empName}"></c:out></td>
											<td><c:out value="${orgemployee.empAddress}"></c:out></td>		
											<td><c:out value="${orgemployee.mobileNo}"></c:out></td>
											<td><c:out value="${orgemployee.email}"></c:out></td>
											<td><c:out value="${orgemployee.pwd}"></c:out></td>
											<td><c:out value="${orgemployee.role}"></c:out></td>
											<td><c:out value="${orgemployee.blockStatus}"></c:out></td>
											<td><c:out value="${orgemployee.pwdStatus}"></c:out></td>
											<td><c:out value="${orgemployee.doj}"></c:out></td>
											
											<td><form action="orgemployeeFind" method="post">
                                                <input type="hidden" name="id" value="${orgemployee.empId }">
                                                <input type="submit" value="Update">
                                                </form>
                                                </td>

							<td>
								 <c:choose>
										<c:when test="${orgemployee.blockStatus!='B'}">
									<form action="orgemployeeBlock" method="post">
									<input type="hidden" name="id" value="${orgemployee.empId}">
									<input type="hidden" name="status" value="B">
									<input type="submit" value="Block">
											
                                    </form>
                                    </c:when>
                                    <c:otherwise>
                                    <form action="orgemployeeBlock" method="post">
									<input type="hidden" name="id" value="${orgemployee.empId}">
									<input type="hidden" name="status" value="U">
									
											<input type="submit" value="unBlock">
                                    </form>
                                    </c:otherwise>
                                    </c:choose>
                            
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
	</div>
</section>
<%@include file="include/footer.jsp"%>
