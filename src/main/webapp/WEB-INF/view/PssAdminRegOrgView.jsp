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
                                    <table id="example23" class="display nowrap table table-hover table-striped table-bordered" cellspacing="0" width="100%">
                                        <thead>
                                            <tr>
                                                <th>Organisation Name</th>
                                                <th>Organisation Address</th>
                                                <th>Organisation Email</th>
                                                <th>Organisation Contactno.</th>
                                                <th>Organisation Plan</th>
                                                <th>Organisation Date</th>
                                                <th>Organisation Status</th>
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                                <th>Organisation Name</th>
                                                <th>Organisation Address</th>
                                                <th>Organisation Email</th>
                                                <th>Organisation Contactno.</th>
                                                <th>Organisation Plan</th>
                                                <th>Organisation Date</th>
                                                <th>Organisation Status</th>
                                            </tr>
                                        </tfoot>
                                        <tbody>
                                        <c:forEach var="RegOrg" items="${RegOrgStatusViewList}">
                                            <tr>
											<td><c:out value="${RegOrg.orgName}"></c:out></td>
											<td><c:out value="${RegOrg.orgAddress}"></c:out></td>
											<td><c:out value="${RegOrg. email}"></c:out></td>
											<td><c:out value="${RegOrg.contactNo}"></c:out></td>
											<td><c:out value="${RegOrg.plan.description}"></c:out></td>
											<td><c:out value="${RegOrg.date}"></c:out></td>
									<td>
									<c:set var="main" value="${RegOrg.blockStatus}"/>
								 <c:choose>
										<c:when test="${fn:contains(main,'U')}">
									<form action="RegOrgblock" method="post">
									<input type="hidden" name="regOrg" value="${RegOrg.orgId}">
									<input type="hidden" name="status" value="B">
									
											<button type="submit" class="btn btn-default">Block</button>
                                    </form>
                                    </c:when>
                                    <c:otherwise>
                                    <form action="RegOrgblock" method="post">
									<input type="hidden" name="regOrg" value="${RegOrg.orgId}">
									<input type="hidden" name="status" value="U">
									
											<button type="submit" class="btn btn-default">Unblock</button>
                                    </form>
                                    </c:otherwise>
                                    </c:choose>
                            
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