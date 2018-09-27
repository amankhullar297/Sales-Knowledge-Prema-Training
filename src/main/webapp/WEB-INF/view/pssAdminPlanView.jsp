<%@include file="userAssets/include/header.jsp" %>
<%@include file="userAssets/include/sidebar.jsp" %>

        <!-- Page wrapper  -->
        <div class="page-wrapper">
            
            <!-- Container fluid  -->
            <div class="container-fluid">
                <!-- Start Page Content -->
                <!-- /# row -->
                <div class="row">
                   
                    <!-- /# column -->
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-title">
                                <h4>Add Plan</h4>

                            </div>
                            <div class="card-body">
                                <div class="horizontal-form-elements">
                                    <form:form action="planInsert" method="post" modelAttribute="plan"  class="form-horizontal">
                                       <div class="form-group form-float">
							<p>
                                        <b>Description</b>
                                    </p>
								<div class="form-line">
									<form:input type="text" class="form-control" name="minmaxlength" path="description" maxlength="50"  required="true"/> <label
										class="form-label"></label>
								</div>
								<div class="help-info"></div>
							</div>
							<div class="form-group form-float">
							<p>
                                        <b>Validity</b>
                                    </p>
								<div class="form-line">
									<form:input type="number" class="form-control" path="validity"
										max="99999999999" min="1" required="true"/> <label class="form-label"></label>
								</div>
								<div class="help-info"></div>
							</div>
							<div class="form-group form-float">
							<p>
                                        <b>Amount</b>
                                    </p>
								<div class="form-line">
									<form:input type="number" class="form-control" path="amount"
										max="99999999999" min="1" required="true"/> <label class="form-label"></label>
								</div>
								<div class="help-info"></div>
							</div>
						
                                <div class="status">
                                    <p>
                                        <b>Status</b>
                                    </p>
                                    <form:select path="status" class="form-control show-tick">
                                        <option value="A">A</option>
                                        <option value="I">I</option>
                                       
                                    </form:select>

                                </div>
								
												
												<button class="btn btn-primary waves-effect" type="submit">SUBMIT</button>
												<form:hidden path="planId"/>
								</form:form>		
								 <c:if test="${result!=null }">
       			
       			<h1>${result}</h1>
       			       			
       			</c:if>
       			
   
										
                                        
                    <!-- /# column -->
                
                <!-- /# row -->
                <!-- Bread crumb -->
            <div class="row page-titles">
                
                <div class="col-md-7 align-self-center">
                    <ol class="breadcrumb">
                      
                    </ol>
                </div>
            </div>
            <!-- End Bread crumb -->
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="table-responsive m-t-40">
                                    <table id="example23" class="display nowrap table table-hover table-striped table-bordered" cellspacing="0" width="100%">
                                    <div class="col-md-5 align-self-center">
                    <h3 class="text-primary">PLAN LIST</h3> </div>
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
										
										<td>
										<form method="post" action="planUpdate">
										<input type="hidden" name="planId" value="${plan.planId}" path="planId"/>
										<input type="submit" value="Update">
										</form></td>
										<td>
										<c:if test="${plan.status =='A'}">
										<form method="post" action="planDelete">
										<input type="hidden" name="planId" value="${plan.planId}" path="planId"/>
										<input type="submit" value="Delete">
										</form>
										</c:if></td>
										</tr>
										</c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                     
                     
                    </div>
                </div>
                <!-- End PAge Content -->
            
             
                                        </div>
                                        </div>
                                    
                                            
                                        </div>
                                </div>
                            </div>
                        </div>
                        <!-- /# card -->
                    </div>
            <!-- End Container fluid  -->
            <!-- footer -->
            <footer class="footer"> � 2018 All rights reserved. Template designed by <a href="https://colorlib.com">Colorlib</a></footer>
            <!-- End footer -->
        
        <!-- End Page wrapper  -->
    <!-- End Wrapper -->
   <%@include file="userAssets/include/footer.jsp"%>