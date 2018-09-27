<%@include file="userAssets/include/header.jsp" %>
<%@include file="userAssets/include/pssAdminSidebar.jsp" %>
<%@include file="Validation.jsp" %>
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
                    <div class="col-lg-6">
                        <div class="card">
                        <script language="javascript">
                       
                        function chkmob(f){
                        	 var v=$('#mobileNo').val();
                        	if (v.length < 10 || v.length > 10) {
                        	alert("Enter 10 digit mobile number");
                        	
                        	
                        	return false;
                        }
                        	else
                        		{
                        		/* f.action="pssemployeeInsert";
                        		f.method="post"; */
                        		return true;
                        		}
                        }
                        </script>
                            <div class="card-title">
                                <h4>Basic Form</h4>

                            </div>
                            <div class="card-body">
                                <div class="basic-form">
                                     <form:form modelAttribute="pssemployee" action="pssemployeeInsert" onsubmit="return chkmob(this)" method="post">
                                     <form:hidden path="empId"/>
                                     
                                     
                                    <div class="form-group">
                                            <label>empName</label>
                                            <form:input type="text" onkeypress="return onlyAlphabets(event,this)" class="form-control" path="empName" placeholder="empName"/>
                                        </div>
                                        <div class="form-group">
                                            <label>empAddress</label>
                                            <form:input type="text" class="form-control" path="empAddress" placeholder="empAddress"/>
                                         </div>
                                         <div class="form-group">
                                            <label>mobileno</label>
                                            <form:input type="number" class="form-control" id="mobileNo" path="mobileNo" placeholder="mobileNo"/>
                                        </div>
                                        <div class="form-group">
                                            <label>email</label>
                                            <form:input type="email" class="form-control" path="email" placeholder="Email"/>
                                        </div>
                                        <div class="form-group">
                                            <label>pwd</label>
                                            <form:input type="password" class="form-control" path="pwd" placeholder="Password"/>
                                        </div>
                                        <div class="checkbox">
                                            <label>
													<input type="checkbox" required> Check me out
												</label>
                                        </div>
                                        <button type="submit" class="btn btn-default">Submit</button>
                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>
                   
  <%@include file="userAssets/include/footer.jsp"%>