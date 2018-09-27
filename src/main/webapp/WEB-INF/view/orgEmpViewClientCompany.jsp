<%@include file="include/header.jsp"%>
<%@include file="include/orgEmpSidebar.jsp"%>


<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>
				View Client Company 
				<!-- <small>Taken from <a href="https://jqueryvalidation.org/" target="_blank">jqueryvalidation.org</a></small> -->
			</h2>
		</div>
		
		<div class="body">
			<!--  <div class="alert alert-success alert-dismissible" id="success-alert">
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
			</div>-->
			<!-- <div class="alert alert-warning alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Warning!</strong> Better check yourself, you're not looking
				too good.
			</div> -->
			<!--  <div class="alert alert-danger alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Oh snap!</strong> Change a few things up and try submitting
				again.
			</div>-->
		</div>
			
		<!-- #END# Advanced Validation -->
		
		<!-- Exportable Table -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                                Client Company Table
                            </h2>
                       
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover dataTable js-exportable">
                                    <thead>
                                        <tr>
                                            <th>Client Company Name</th>
                                            <th>Company Address</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                      <c:forEach var="ClientCompany" items="${ClientCompanyList}">
									<tr>
										<td><c:out value="${ClientCompany.clientName}"></c:out></td>
										<td><c:out value="${ClientCompany.clientAddress}"></c:out></td>
										
										
									</tr>
									</c:forEach>
                                     </tbody>
                                </table>
                            </div>
                            <h2>${msg}</h2>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Exportable Table -->
		
	</div>
</section><%@include file="include/footer.jsp"%>