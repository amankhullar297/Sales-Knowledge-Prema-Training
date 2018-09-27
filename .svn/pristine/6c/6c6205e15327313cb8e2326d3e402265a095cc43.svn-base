<%@include file="userAssets/include/header.jsp" %>
<%@include file="userAssets/include/pssAdminSidebar.jsp" %>
        <!-- End Left Sidebar  -->
        <!-- Page wrapper  -->
        <div class="page-wrapper">
            <!-- Bread crumb -->
            <div class="row page-titles">
                <div class="col-md-5 align-self-center">
                    <h3 class="text-primary">RATING FORM</h3> </div>
                <div class="col-md-7 align-self-center">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>
                        <li class="breadcrumb-item active">RATING FORM</li>
                    </ol>
                </div>
            </div>
            <!-- End Bread crumb -->
            <!-- Container fluid  -->
            <div class="container-fluid">
                <!-- Start Page Content -->
               
                <!-- /# row -->
                <div class="row">
                    <div class="col-lg-6">
                        <div class="card">
                            <div class="card-title">
                                <h4>Rating Form</h4>

                            </div>
                            <div class="card-body">
                                <div class="basic-form">
							<form:form modelAttribute="pssrate" action="PssRateInsert" method="POST">
								<form:input type="hidden" path="feedback.fbid" value="${feedbackData.fbid}" />
								<%-- <input type="hidden" name="empId" value="${feedback.regOrg.orgId}"> --%>
								<form:hidden path="feedback.fbid" value="${feedbackData.fbid}"/>
<!-- 								<forhidden path="emp.empId"/>
 -->								<div class="form-group form-float">
									<p>
										<b>Reviews</b>
									</p>
									<div class="form-line">
										<input type="text" class="form-control" name="email" value="${feedback.reviews}" disabled>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">Rating</label>
									<div class="col-sm-10">
										<form:select path="rating" name="rate" class="form-control" required="true">
											<option value="">---Rating---</option>
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
										</form:select>
									</div>
								</div>


								<button class="btn btn-primary waves-effect" type="submit">SUBMIT</button>
							</form:form>
						</div>
                            </div>
                        </div>
                    </div>
                  
  <%@include file="userAssets/include/footer.jsp"%>