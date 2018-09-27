<%@include file="userAssets/include/header.jsp" %>
<%@include file="userAssets/include/pssAdminSidebar.jsp" %>
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
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Data Export</h4>
                                <h6 class="card-subtitle">Export data to Copy, CSV, Excel, PDF & Print</h6>
                                <div class="table-responsive m-t-40">
                                    <table id="example23" class="display nowrap table table-hover table-striped table-bordered" cellspacing="0" width="100%">
                                        <thead>
                                            <tr>
                                                <th>Employee Name</th>
                                                <th>Feedback</th>
                                                <th>Rating</th>
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                                <th>Employee Name</th>
                                                 <th>Feedback</th>
                                                <th>Rating</th>
                                               
                                           </tr>
                                        </tfoot>
                                        <tbody>
                                         <c:forEach var ="rate" items ="${PssRateList }" ></c:forEach>   <tr>
                                                <td><c:out value="${rate.emp.empId}"></c:out></td>
                                                <td><c:out value="${rate.feedback.reviews}"></c:out></td>
                                                 <td><c:out value="${rate.rating}"></c:out></td>
                                                </tr>
                                    
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                     
                     
                    </div>
                </div>
                <!-- End PAge Content -->
            </div>
            <!-- End Container fluid  -->
            <!-- footer -->
            <footer class="footer"> � 2018 All rights reserved. Template designed by <a href="https://colorlib.com">Colorlib</a></footer>
            <!-- End footer -->
        </div>
        <!-- End Page wrapper  -->
    </div>
    <!-- End Wrapper -->
   <%@include file="userAssets/include/footer.jsp"%>