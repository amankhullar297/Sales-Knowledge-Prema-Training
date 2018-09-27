<%@include file="include/header.jsp"%>
<%@include file="include/orgAdminSidebar.jsp"%>

<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>
				DUMMY FORM 
				<!-- <small>Taken from <a href="https://jqueryvalidation.org/" target="_blank">jqueryvalidation.org</a></small> -->
			</h2>
		</div>
		
		<div class="body">
			<div class="alert alert-success alert-dismissible">
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
			</div>
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
		
		<!-- Advanced Validation -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>VALIDATED FORM</h2>
						
					</div>
					<div class="body">
						<form:form modelAttribute="orgemployee"  action="orgemployeeInsert" method="POST">
							
							
							
							
							<div class="form-group form-float">
							<p> <b>Employee Name</b></p>      
								<div class="form-line">			
									<form:input path="empName" type="text" class="form-control" required="true" disabled="true"/>
									<form:input path="empId" value="${orgemployee.empId }" type="hidden" class="form-control" required="true"/>
									<label class="form-label">Enter name here...</label>
								</div>			
							</div>
							
							<br><br>
							
							<div class="form-group form-float">
							<p>
                                        <b>Employee Address</b>
                                    </p>
                                    
								<div class="form-line">
							
									<form:input path="empAddress" type="text" class="form-control" required="true"/>
									<label class="form-label">Enter address here...</label>
								</div>
								
							</div>
							
							<br><br>
							
							<div class="form-group form-float">
							<p>
                                        <b>Mobile Number</b>
                                    </p>
                                    
								<div class="form-line">
							
									<form:input path="mobileNo" type="text" class="form-control" minlength="8" maxlength="10" required="required"/>
									<label class="form-label">Text Input Field</label>
								</div>
								
							</div>
							
							<br><br>
							
						
							<div class="form-group form-float">
							<p>
                                        <b>Email</b>
                                    </p>
								<div class="form-line">
									<form:input path="email" type="email" class="form-control"  required="true"/>
									<label class="form-label">Email</label>
								</div>
							</div>
							
						
							<div class="form-group form-float">
							<p>
                                        <b>Password
                                        </b>
                                    </p>
								<div class="form-line">
									<form:input path="pwd" type="password" class="form-control"  required="true"/>
									<label class="form-label">Password</label>
								</div>
							</div>
							
							
						<div class="form-group form-float">
                                    <p>
                                        <b>Role</b>
                                    </p>
                                    <form:select path="role" class="form-control show-tick" data-live-search="true">
                                        <option value="E">E</option>
                                        <option value="A">A</option>
                                    </form:select>
                                </div>
                                
                                <div class="form-group form-float">
                                    <p>
                                        <b>Password Status</b>
                                    </p>
                                    <form:select path="pwdStatus" class="form-control show-tick" data-live-search="true">
                                        <option value="E">F</option>
                                        <option value="A">A</option>
                                    </form:select>
                                </div>
                                
                            <div>
                                
                <p> <b>Date Of Expiry</b> </p>
                       
                        <div class="body">
                            <div class="row clearfix">
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <div class="form-line">
                                            <form:input path="doj" type="text" class="datepicker form-control" placeholder="Please choose a date..."/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                       </div>
                      </div>        
                                
                                
                                <div class="form-group">
								<input type="checkbox" id="checkbox" name="checkbox" required/> 
								<label for="checkbox">I have read and accept the terms</label>
							</div>
						
							<button class="btn btn-primary waves-effect" type="submit">SUBMIT</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
		<!-- #END# Advanced Validation -->
		
</div>
</section>
<%@include file="include/footer.jsp"%>
