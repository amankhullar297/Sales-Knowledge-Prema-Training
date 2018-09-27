<%@include file="include/header.jsp"%>
<%@include file="include/orgAdminSidebar.jsp"%>

<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>
				DUMMY DATATABLES
				<!--  <small>Taken from <a href="https://datatables.net/" target="_blank">datatables.net</a></small> -->
			</h2>
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
												
												<th>Orgganisation ID</th>
                                                <th>Organisation Name</th>
                                                <th>reviews</th>
                                                
                                                <th>Date</th>
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                                
                                                <th>Orgganisation ID</th>
                                                <th>Organisation Name</th>
                                                <th>reviews</th>                                                
                                                <th>Date</th>
                                                
                                            </tr>
                                        </tfoot>
                                        <tbody>
                                            
                                                <c:forEach var="feedback" items="${feedbackList}">
												<tr>
												
												<td><c:out value="${feedback.regOrg.orgId}"></c:out></td>
												<td><c:out value="${feedback.regOrg.orgName}"></c:out></td>
												<td><c:out value="${feedback.reviews}"></c:out></td>												
												<td><c:out value="${feedback.d1}"></c:out></td>
												
												<td><form method="POST" action="PssRate">
												<input type="hidden" name="fbid" value="${feedback.fbid}"/>
												<input type="submit" value="Rate">
												</form></td>
												
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
