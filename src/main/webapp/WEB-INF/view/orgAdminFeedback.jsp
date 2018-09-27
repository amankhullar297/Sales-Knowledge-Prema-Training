<%@include file="include/header.jsp"%>
<%@include file="include/orgAdminSidebar.jsp"%>

<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>
				FEEDBACK FORM 
				<!-- <small>Taken from <a href="https://jqueryvalidation.org/" target="_blank">jqueryvalidation.org</a></small> -->
			</h2>
		</div>
		
		<!-- Advanced Validation -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<div class="header">
						<h2>VALIDATED FORM</h2>
						
					</div>
					<div class="body">
						<form:form method="GET" modelAttribute="feedback" action="feedbackInsert">
						
							
							<div class="form-group form-float">
							<p>
                                        <b>Feedback:</b>
                                    </p>
								<div class="form-line">
                                            
                                            <form:input type="text" path="reviews" class="form-control" placeholder="Enter your Feedback"/>

								</div>
							</div>
							
							<!--  
							<div class="form-group form-float">
							<p>
                                        <b>Rating out of 5</b>
                                    </p>
								<div class="form-line">
                                            
                                            <form:select path="rating" class="form-control">
										        <form:option value="1" label="1" />
										        <form:option value="2" label="2" />
										        <form:option value="3" label="3" />
										        <form:option value="4" label="4" />
										        <form:option value="5" label="5" />
										    </form:select>

								</div>
							</div>
							-->

                                        <form:hidden path="fStatus"/>
                                        <form:hidden  path="fbid"/>
                                                                            
                                     
                                        <button type="submit" class="btn btn-default" onclick="success()">Submit</button>
                         </form:form>
                         
                         <script>
							function success() {
								alert("You have entered the Feedback!");
								};
						 </script>
						
			
					</div>
				</div>
			</div>
		</div>
		<!-- #END# Advanced Validation -->

		
	</div>
</section><%@include file="include/footer.jsp"%>
