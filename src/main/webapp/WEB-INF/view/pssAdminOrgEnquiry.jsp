<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>wapik Multiparpus Template</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="swAssets/fonts/stylesheet.css">
        <link rel="stylesheet" href="swAssets/css/font-awesome.min.css">

        <link rel="stylesheet" href="swAssets/css/bootstrap.min.css">
        <!--        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">-->



        <link rel="stylesheet" href="swAssets/css/customicon.css">
        <link rel="stylesheet" href="swAssets/css/linearicons.css">
        <link rel="stylesheet" href="swAssets/css/animate.css">

        <!--For Plugins external css-->
        <link rel="stylesheet" href="swAssets/css/plugins.css" />
        <!--Theme custom css -->
        <link rel="stylesheet" href="swAssets/css/style.css">
        <!--Theme Responsive css-->
        <link rel="stylesheet" href="swAssets/css/responsive.css" />

        <script src="swAssets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
        
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    </head>
    <body>
        <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
		<div class='preloader'><div class='loaded'>&nbsp;</div></div>
        <header id="header" class="navbar-fixed-top">
            <div class="container">
                <div class="main_menu wow fadeInDown" data-wow-duration="2s">	
                    <nav class="navbar navbar-default">
                        <div class="container-fluid">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                                <a class="navbar-brand our_logo" href="#">PSS Knowledge Management</a>
                                <div class="call_us">
                                    <i class="fa fa-phone"></i>
                                   +91-8989468996
                                </div>	  
                            </div>

                            <!-- Collect the nav links, forms, and other content for toggling -->
                            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                                <ul class="nav navbar-nav navbar-right">
                                    <li><a href="index.jsp">HOme</a></li>
                                    <li><a href="aboutus.jsp">About Us</a></li>
                                    <li><a href="pricing.jsp">Pricing</a></li>
                                    <li><a href="#Enquiry" class="nav navbar-nav navbar-right">Enquiry</a></li>
                                    <li><a href="contact.jsp">Contact Us</a></li>
                                    <li><a href="loginSignup.jsp" style="background:#6FB048;color:#fff;border-radius:2px;padding:5px 10px;margin-top:10px;">Login / SignUp</a></li>
                                </ul>
                            </div><!-- /.navbar-collapse -->
                        </div><!-- /.container-fluid -->
                    </nav>

                </div>
            </div>
        </header>
        <!--Home page style-->
        
        
         <!-- Sections -->
        <section id="bener" class="">
            <div class="bener_overlay">
                <div class="container">
                    <div class="bener_content">
                        <h2>Welcome to PSS Knowledge Management</h2>
                        <!-- <p>Welcome to the Wapik Welcome to the WapikWelcome to the WapikWelcome to the Wapik</p> -->
                        <a href="" class="btn btn-md">Learn More</a>
                    </div>
                </div> <!-- /container -->
            </div>
        </section>
       <c:if test="${result!=null }">
       			<c:if test="${result=='Exception Occured'}">
       			<h1> Please Check Credentials</h1>
       			</c:if>
       			<c:if test="${result=='Illegal Email'}">
       			<h1> Email Already Exists</h1>
       			</c:if>
       			<c:if test="${result=='enquiry inserted'}">
       			<h1>Successfully Inserted</h1>
       			</c:if>
       </c:if>

        <section id="our_features">
            <div class="container">
                <div  class="features_top text-center">
                    <h2 class="title_border">Insert Enquiry</h2>
                    <div class="separator" ></div>
                   
                </div>

                <div class="features_contant">
                    <div class="row">
                    
                        <form:form method="get" modelAttribute="orgEnq" action="orgEnqInsert">
                                        <div class="row">
                                            <div class="col-lg-6">
                                               
                                                <div class="form-group">
                                                    <label>Email</label>
                                                    <form:input id="example-email" class="form-control" type="email" path="email" placeholder="Email" required="true" name="example-email"/>
                                                </div>
                                                <div class="form-group">
                                                    <label>Name</label>
                                                    <form:input class="form-control" type="Name" path="orgName" placeholder="Name" required="true"/>
                                                </div>
                                                <div class="form-group">
                                                    <label>Address</label>
                                                    <form:input class="form-control" rows="3" path="orgAddress" placeholder="Address" required="true"/>
                                                </div>
                                               <div class="form-group">
                                            <label>Contact</label>
                                            <form:input type="number" class="form-control" path="contactNo" placeholder="Contact" required="true"/>
                                        </div>
                                         <div class="form-group">
                                                    <label>Plan</label>
                                                    
                                                    <form:select class="form-control"  data-live-search="true" path="planId.planId" required="true">
                                                    <c:forEach var="plan" items="${planList}">
                                                    <option value="${plan.planId}" >${plan.description}</option>
                                                    </c:forEach>
                                                    </form:select>
                                                    
                                                    <%-- <form:select class="form-control" path="plan.planId" data-live-search="true" required="false">
                                                    <form:option value="0"> Plan </form:option>
                                                    <c:forEach items="${planList}" var="plan" varStatus="loop">
                                                    
                                                    <option value="${plan.planId}" >${plan.planName}</option> 
                                                    </c:forEach>
                                                    
														</form:select> --%>
                                                </div>
   
                                                    <div class="form-group">
                                            <div align="center" class="col-sm-offset-2 col-sm-10">
                                                <button  type="submit" class="btn btn-default">Submit</button>
                                            </div>
                                            </div>
                                            
                                                
                                                                                       
                                            </div>
                                        </div>
                                        </form:form>

                    </div>
                </div>
            </div>
        </section>

        <section id="looking">
            <div class="container">
                <div class="looking_top text-center">
                    <h2>Looking for the perfect template to use?</h2>
                    <div class="separator"></div>
                    <p>Donec id elit non mi porta gravida at eget metus.</p>

                </div>

                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <div class="single_looking_img">
                            <img src="swAssets/img/iphone1.png" alt="" />
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <div class="single_looking">
                            <h2>Responsive Ready</h2>
                            <p>Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Aenean lacinia bibendum nulla sed consectetur. Maecenas sed diam eget risus varius blandit sit amet non magna. Vestibulum id ligula porta felis euismod semper.</p>
                            <p><i class="fa fa-check-circle-o"></i>Integer posuere erat a ante venenatis dapibus posuere velit aliquet.</p>
                            <p><i class="fa fa-check-circle-o"></i>Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section><!-- End Looking Section -->

        <section id="testimonial">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <div class="single_testimonial">
                            <p>This theme is beautiful, elegant and easy to customize. I’ve been able to build an amazing site in just a minute. Thank you very much for creating this impressive template!</p>
                            <span class="test_author">Valeria Boltneva</span>

                            <span class="test_author2">Director of Acme.Inc</span>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <div class="single_testimonial_img">
                            <img src="swAssets/img/test.png" alt="" />
                        </div>
                    </div>
                </div>
            </div>
        </section><!-- End Testmonial Section -->

        <section id="build" class="build sections">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <div class="build_contant">
                            <h2>Built with High Attention to Details</h2>
                            <p>Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Aenean lacinia bibendum nulla sed consectetur. Maecenas sed diam eget risus varius blandit sit amet non magna. Vestibulum id ligula porta felis euismod semper. Integer posuere erat a ante venenatis dapibus posuere velit aliquet. Donec id elit non mi porta gravida at eget metus.</p>
                        </div>
                    </div>

                    <div class="col-md-6 col-sm-6">
                        <div class="build_img_rigth">
                            <img src="swAssets/img/build.png" alt="" />
                        </div>
                    </div>
                </div>
            </div>
        </section><!-- End Build Section -->



        <section id="pricing" class="text-center">
            <div class="container">
                <div class="row">
                    <div class="pricing_top">
                        <h2>Pricing & Plan</h2>
                        <div class="separator"></div>
                        <p>Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.
                            Donec id elit non mi porta gravida at eget metus.</p>
                    </div>

					<div class="pricing_tabel_contant">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="col-md-4 col-sm-4">
                                <div class="single_pricing">
                                    <div class="top_text">
                                        <span>Basic</span>
                                        <sub>$ 199</sub>
                                        <sup>/month</sup>
                                    </div>
                                    <ul>
                                        <li>Justo Fringilla</li>
                                        <li>Mollis Sit Nullam</li>
                                        <li>Ultricies Purus Amet</li>
                                        <li>Cras Inceptos</li>
                                    </ul>
                                    <a href="" class="btn btn-primary btn-sm">Select Plan</a>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-4">
                                <div class="single_pricing">
                                    <div class="top_text">
                                        <span>Basic</span>
                                        <sub>$ 399</sub>
                                        <sup>/month</sup>
                                    </div>
                                    <ul>
                                        <li>Justo Fringilla</li>
                                        <li>Mollis Sit Nullam</li>
                                        <li>Ultricies Purus Amet</li>
                                        <li>Cras Inceptos</li>
                                    </ul>
                                    <a href="" class="btn btn-primary btn-sm">Select Plan</a>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-4">
                                <div class="single_pricing">
                                    <div class="top_text">
                                        <span>Basic</span>
                                        <sub>$ 699</sub>
                                        <sup>/month</sup>
                                    </div>
                                    <ul>
                                        <li>Justo Fringilla</li>
                                        <li>Mollis Sit Nullam</li>
                                        <li>Ultricies Purus Amet</li>
                                        <li>Cras Inceptos</li>
                                    </ul>
                                    <a href="" class="btn btn-primary btn-sm">Select Plan</a>
                                </div>
                            </div>
                        </div>
                    </div>




                </div>

            </div>
        </section><!-- End pricing Section -->

        <section id="plans">
            <div class="container">
                <div class="plans_top text-center">
                    <h2>Included with all Plans</h2>
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-xs-6">
                        <div class="single_plans">
                            <ul>
                                <li><i class="fa fa-check-circle-o"></i>Maecenas faucibus mollis interdum</li>
                                <li><i class="fa fa-check-circle-o"></i>Cras justo odio, dapibus ac facilisis</li>
                                <li><i class="fa fa-check-circle-o"></i>Fringilla Mattis</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-6">
                        <div class="single_plans">
                            <ul>
                                <li><i class="fa fa-check-circle-o"></i>Maecenas faucibus mollis interdum</li>
                                <li><i class="fa fa-check-circle-o"></i>Cras justo odio, dapibus ac facilisis</li>
                                <li><i class="fa fa-check-circle-o"></i>Fringilla Mattis</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-6">
                        <div class="single_plans">
                            <ul>
                                <li><i class="fa fa-check-circle-o"></i>Maecenas faucibus mollis interdum</li>
                                <li><i class="fa fa-check-circle-o"></i>Cras justo odio, dapibus ac facilisis</li>
                                <li><i class="fa fa-check-circle-o"></i>Fringilla Mattis</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section><!-- End Plans Section -->

        <section id="healp" class="text-center">
            <div class="container">
                <div class="healp_contant">
                    <i class="fa fa-life-ring"></i>
                    <h2>Need Help?</h2>
                    <div class="separator"></div>
                    <p>Contact our Customer Support that is always ready to help you with any possible questions, problems or information.</p>
                    <a href="">support@wapik.com</a>
                </div>
            </div>
        </section><!-- End Healp Section -->
        
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
                            <div class="card-title">              

  <div class="row">

                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /# column --> 
                    
 <%@include file="swAssets/include/download.jsp"%>
<%@include file="swAssets/include/footer.jsp"%>