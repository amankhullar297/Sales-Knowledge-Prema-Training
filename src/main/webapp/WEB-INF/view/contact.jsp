<%@include file="swAssets/include/header.jsp"%>

<!-- Google Maps Sections -->
<section id="google_map" class="">
	<div class="container-fullwidth">
		<!-- <div style="width:100%;height:60px;" class="ourmaps"></div> -->
	</div>
</section>

<!-- Contact form -->
<section id="message_area">
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<div class="message_top_text text-center">
					<h2>Get In Touch With Us</h2>
					<p class="description_p">We are here to help. Want to learn
						more about our services? Please get in touch, we'd love to hear
						from you!</p>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="messsage_contant">
				<div class="col-md-7 col-sm-7">
					<div class="single_message_left">
						<form action="#" id="formid">
							<!--<div class="col-lg-8 col-md-8 col-sm-10 col-lg-offset-2 col-md-offset-2 col-sm-offset-1">-->

							<div class="form-group">
								<input type="text" class="form-control" name="name"
									placeholder="first name" required="">
							</div>

							<div class="form-group">
								<input type="email" class="form-control" name="email"
									placeholder="Email" required="">
							</div>

							<div class="form-group">
								<input type="text" class="form-control" placeholder="Subject">
							</div>
							<!-- end of form-group -->

							<div class="form-group">
								<textarea class="form-control" name="message" rows="8"
									placeholder="Message"></textarea>
							</div>

							<div class="center-content">
								<input type="submit" value="Submit" class="btn btn-primary">
							</div>
							<!--</div>-->
						</form>
					</div>
				</div>

				<div class="col-md-5 col-sm-5">
					<div class="single_message_right">
						<h4>Headquarter</h4>
						<p>
							<i class="fa fa-map-marker"></i> Prema Softwares Pvt Ltd. 35-B,
							Behind Indian Coffee House, Indrapuri, Bhopal, India.</span>
						</p>

						<p>
							<i class="fa fa-phone"></i>+91-98260 72634
						</p>
						<p>
							<i class="fa fa-envelope"></i>sales@premasoftware.com
						</p>
						<p></p>
					</div>
				</div>
			</div>
			<!-- End of messsage contant-->
		</div>
	</div>
</section>


<%@include file="swAssets/include/download.jsp"%>

<%@include file="swAssets/include/footer.jsp"%>