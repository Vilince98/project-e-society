<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-Society-Member Complain</title>
</head>
<body>
<%@include file="member-header.jsp" %>

<!-- about breadcrumb -->
  <section class="w3l-about-breadcrumb text-left">
    <div class="breadcrumb-bg breadcrumb-bg-about py-sm-5 py-4">
      <div class="container">
        <h2 class="title">Complaint</h2>
        <ul class="breadcrumbs-custom-path mt-2">
          <li><a href="index.jsp">Home</a></li>
          <li class="active"><span class="fa fa-arrow-right mx-2" aria-hidden="true"></span>Complaint </li>
        </ul>
      </div>
    </div>
  </section>
  <!-- //about breadcrumb -->
  <!-- /Member Profile-->
  <div class="contact-form py-5" id="contact">
    <div class="container py-lg-5 py-md-4">
      
      <h3 class="hny-title mb-lg-5 mb-4">All Complaint</h3>
        <div class="contacts12-main mb-5">
        
						<table class="table"> 
						<thead> 
						<tr> 
						<th>Complaint ID</th> 
						<th>Member Name</th> 
						<th>House Number</th>
						<th>Subject</th>
						<th>Complaint Date</th>
						<th>Description</th>
						<th>Complaint Status</th>     
						</tr> 
						</thead> 
						<tbody> 
						
						
						</tbody> 
						</table> 
					</div>
            </div>
     </div>
  </div>
<%@include file="footer.jsp" %>
</body>
</html>