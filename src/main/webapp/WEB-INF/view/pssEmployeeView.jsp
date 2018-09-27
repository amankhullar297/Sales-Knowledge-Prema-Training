<%@include file="userAssets/include/header.jsp" %>
<%@include file="userAssets/include/sidebar.jsp" %>
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
                                <h2>${result}</h2>
                                    <table id="example23" class="display nowrap table table-hover table-striped table-bordered" cellspacing="0" width="100%">
                                        <thead>
                                            <tr>
                                                <th>empName</th>
                                                <th>empAddress</th>
                                                <th>email</th>
                                                <th>mobileNo</th>
                                               
                                            </tr>
                                        </thead>
                            <tbody>
                                        <c:forEach var="psem" items="${pssemployeeList}">
                                            <tr>
                                                <td><c:out value="${psem.empName}"></c:out></td>
                                                <td><c:out value="${psem.empAddress}"></c:out></td>
                                                <td><c:out value="${psem.email}"></c:out></td>
                                                <td><c:out value="${psem.mobileNo}"></c:out></td>
                                                <td><form action="pssemployeeFind" method="post">
                                                <input type="hidden" name="id" value="${psem.empId }">
                                                <input type="submit" value="Update">
                                                </form>
                                                </td>
                                                <td>
                                                
                                                <form action="block" method="post">
                                                <c:choose>
                                                <c:when test="${psem.blockStatus=='U' }">
                                                <input type="hidden" name="id" value="${psem.empId }">
                                                
                                                <input type="hidden" name="status" value="B">
                                              
                                                <input type="submit" value="Block">
                                                </c:when>
                                                <c:otherwise>
                                                
                                                <input type="hidden" name="id" value="${psem.empId }">
                                                
                                                <input type="hidden" name="status" value="U">
                                              
                                                <input type="submit" value="unBlock">
                                                </c:otherwise>
                                                </c:choose>
                                                </form>

                                                </td>
                                                
                                            </tr>
                                        </c:forEach>
                                        </tbody>               
                                        <tfoot>
                                            <tr>
                         
                       
                         
                                 <th>empName</th>
                                                <th>empAddress</th>
                                                <th>email</th>
                                                <th>mobileNo</th>
                                            </tr>
                                        </tfoot>
                                  
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