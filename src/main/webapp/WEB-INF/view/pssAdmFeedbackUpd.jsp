<%@include file="userAssets/include/header.jsp" %>
<%@include file="userAssets/include/pssAdminSidebar.jsp" %>
        <!-- End Left Sidebar  -->
        <!-- Page wrapper  -->
        <div class="page-wrapper">
            <!-- Bread crumb -->
            <div class="row page-titles">
                <div class="col-md-5 align-self-center">
                    <h3 class="text-primary">Dashboard</h3> </div>
                <div class="col-md-7 align-self-center">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>
                        <li class="breadcrumb-item active">Dashboard</li>
                    </ol>
                </div>
            </div>
            <!-- End Bread crumb -->
            <!-- Container fluid  -->
            <div class="container-fluid">
                <!-- Start Page Content -->
               

                <!-- /# row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-title">
                                <h4>Basic Elements</h4>

                            </div>
                            <div class="card-body">
                                <div class="basic-elements">
                                     <form:form method="GET" modelAttribute="feedback" action="feedbackUpdate">
                                        <div class="row">
                                            <div class="col-lg-6">
											<div class="form-group">
                                            <label>Organisation ID</label>
                                            <form:input type="number" path="regOrg.orgId" class="form-control" placeholder="Organisation ID"/>
                                        </div>
                                        <div class="form-group">
                                            <label>Review:</label>
                                            <form:input type="text" path="reviews" class="form-control" placeholder="Reviews"/>
                                        </div>
                                        <div class="form-group">
                                            <label>Rating out of 5</label>
                                            <form:input type="number" path="rating" class="form-control" placeholder="Reviews"/>
                                        </div>
                                        <div class="form-group">
                                            <label>Status</label>
                                        	                                       	
                                        	<form:select class="form-control" path="fStatus">
										        <form:option value="H" label="H" />
										        <form:option value="D" label="D" />
										    </form:select>
                                        	
                                        	
                                        </div>
                                        <form:hidden  path="fbid"/>
                                        <button type="submit" class="btn btn-default">Update</button>
                                    </form:form>
                                    </div>
                                    </div>
			
                                            </div>

                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /# row -->

                <!-- End PAge Content -->
            </div>
            <!-- End Container fluid  -->
            <!-- footer -->
            <footer class="footer"> © 2018 All rights reserved. Template designed by <a href="https://colorlib.com">Colorlib</a></footer>
            <!-- End footer -->
        </div>
        <!-- End Page wrapper  -->
    </div>
    <!-- End Wrapper -->
  <%@include file="userAssets/include/footer.jsp"%>