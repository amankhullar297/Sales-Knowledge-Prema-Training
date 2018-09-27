<%@include file="include/header.jsp"%>
<%@include file="include/orgEmpSidebar.jsp"%>
    <section class="content">
	<div class="container-fluid">
		
		
		<div class="body">
			
			<!-- <div class="alert alert-warning alert-dismissible">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Warning!</strong> Better check yourself, you're not looking
				too good.
			</div> -->
			
		</div>
		
		<!-- Advanced Validation -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>RATING FORM</h2>
						
					</div>
					<div class="body">
						<form:form id="form_advanced_validation" modelAttribute="knowledgeRate" method="POST" action="KnowledgeRateInsert">
							
							<!-- copy text input field from here -->
							
							
							
							
							<div class="form-group form-float">
							<p>
                                    </p>
								<div>
									<form:input type="hidden" class="form-control" path="salesKnowledge.salesId" value="${salesKnowledges.salesId }" />
									<form:input type="hidden" class="form-control" path="knowId" value="${knowledgeRate.knowId }" />
									
								</div>
							
							</div>
							
							
							
							<!-- copy text input field from here -->
							
							
						<!-- 	for date select from here -->
							
							

								
							
							
							<!-- 	for date select from here -->
							
							
							
			
							
							
							<!-- for dropdown select this div -->
							
							
							
							<div class="form-group form-float">
                                    <p>
                                        <b>Rating</b>
                                    </p>
								<form:select class="form-control show-tick" path="rating"
									data-live-search="true" placeholder="Rating">
									
									<c:set var="x" value="${knowledgeRate.rating}"></c:set>
									<c:forEach var="i" begin="1" end="5">
											<c:choose>
										<c:when test="${x==i}">
											<option value="${i}" selected>${i}</option>

										</c:when>
										<c:otherwise>
										<option value="${i }">${i }</option>
										</c:otherwise>
										</c:choose>
									</c:forEach>

								</form:select>
							</div>
                                
                                
                                <!-- for dropdown select this div -->
                                
                                
							<button class="btn btn-primary waves-effect" type="submit">SUBMIT</button>
							
						</form:form>
						
					</div>
				</div>
			</div>
		</div>
		<c:if  test="${not empty show}">
		<script>

window.onload = function() {
	showSuccessMessage();
	};

</script>
</c:if>
		
		<!-- #END# Advanced Validation -->
	</div>
	
</section>
</section>
<section class="content">
	<div class="container-fluid">

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
			<!-- <div class="alert alert-danger alert-dismissible">
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
						<h2>RATING TABLE</h2>
						
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
										<th>KnowId</th>
										<th>Rating</th>
										<th>Rate Status</th>
										<th>Date</th>
										<th>Update</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>KnowId</th>
										<th>Rating</th>
										<th>Rate Status</th>
										<th>Date</th>
										<th>Update</th>
									</tr>
								</tfoot>
								<tbody>
								 <c:forEach var="KnowledgeRate" items="${knowledgeRateList}">
                                            <tr>
											<td><c:out value="${KnowledgeRate.knowId}"></c:out></td>
											<%-- <td><c:out value="${KnowledgeRate.salesKnowledge.salesId}"></c:out></td> --%>
											<!-- <td><c:out value="${KnowledgeRate.orgEmployee.empId}"></c:out></td>   -->
											<td><c:out value="${KnowledgeRate.rating}"></c:out></td>
											<td><c:out value="${KnowledgeRate.rateStatus}"></c:out></td>
											<td><c:out value="${KnowledgeRate.knowDate}"></c:out></td>
									<td>
									<input type="hidden" name="KnowledgeRate" value="${KnowledgeRate.knowId}">
									<c:set var="main" value="${KnowledgeRate.rateStatus}"/>
									 <c:choose>
										<c:when test="${fn:contains(main,'L')}">
									<form  method="post" action="KnowledgeRateUpdate">
												<input type="hidden" name="knowId" value="${KnowledgeRate.knowId }">
												<input type="hidden" name="salesId" value="${KnowledgeRate.salesKnowledge.salesId}">
												<input type="hidden" class="form-control" name="salesId" value="${salesKnowledges.salesId }" />
												<input type="submit" value="Update Now">
												 </form>
                                    </c:when>
                                    </c:choose>
									
									
									
									
			<%--									<form  method="post" action="KnowledgeRateConfirm">
												<input type="hidden" name="knowId" value="${KnowledgeRate.knowId }">
												<input type="hidden" name="salesId" value="${KnowledgeRate.salesKnowledge.salesId}">
												<input type="submit" value="Confirm">
												</form> --%>
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