<%@include file="include/header.jsp"%>
<%@include file="include/orgAdminSidebar.jsp"%>
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
						<h2>Select Plans</h2>
						
					</div>
					<div class="body">
						
						
						<script type="text/javascript">
							function chkplan(f){
								v=f.cbplan.value
								if (v==0)
									{
							alert("Please select plan");
							cbplan.focus();
								return false;
							}
								else
									{
									myform.action="planRenewInsert"
									myform.method="GET";
									return true;
									}
								
							}
							
							
							</script>
						<form:form id="myform" onsubmit="return chkplan(this)" modelAttribute="planHistory" >
							
							
							<div class="form-group form-float">
							
						<h1>${msg}</h1>	
							<div class="form-group form-float">
							
                                    <p>
                                        <b>Plans</b>
                                    </p>
                                    <form:select id="cbplan" class="form-control show-tick" path="plan.planId" data-live-search="true"  required="false">

									<form:option  value="0"  >-- Select plans --</form:option>
									<c:forEach  items="${planList}" var="plan" >
										<option  value="${plan.planId}">${plan.description}</option>
									</c:forEach>
								</form:select>
                                </div>
                                
                                
                                <!-- for dropdown select this div -->
                                
                                
							<button class="btn btn-primary waves-effect" type="submit">Renew</button>
							<c:if test="plan=0">
							<h3>choose any plan</h3>
					        </c:if>
					        <c:if test="plan > 0">
					        <h3>plan will be updtes</h3>
					        </c:if>
						</form:form>
						
					</div>
				</div>
			</div>
		</div>
		<!-- #END# Advanced Validation -->
	</div>
</section>
</section><%@include file="include/footer.jsp"%>