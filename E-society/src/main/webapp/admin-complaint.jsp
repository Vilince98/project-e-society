<%@page import="dao.ComplaintDao"%>
<%@page import="model.Complaint"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="admin-header.jsp" %>    

<!-- main content start-->
		<div id="page-wrapper">
			<div class="main-page">
				<div class="tables">
					<h2 class="title1">All Society Complaint</h2>
					
					
					<%System.out.println("List Of Approve Complaint");%>
					
					<div class="bs-example widget-shadow" data-example-id="contextual-table"> 
						<h4>Society Complaint Data:</h4>
						<table class="table"> 
						<thead> 
						<tr> 
						<th>Complaint ID</th> 
						<th>Member ID</th> 
						<th>House number</th> 
						<th>Subject</th>
						<th>Complaint Date</th>
						<th>Description</th>
						<th>Complaint Status</th>
						    
						</tr> 
						</thead> 
						<tbody> 
						<%List<Complaint> list = ComplaintDao.approveListOfComplaint(); %>
						<%for(Complaint c : list){ %>
						<tr class="active"> 
						<th scope="row"><%=c.getCid() %></th> 
						<td><%=c.getMid() %></td> 
						<td><%=c.getH_no() %></td> 
						<td><%=c.getSubject() %></td>
						<td><%=c.getCdate() %></td>
						<td><%=c.getDescription() %></td>
						<td>
							<a href="admin-solve-complaint.jsp">Solved</a>
						</td>						
						</tr> 
						<%} %>
						</tbody> 
						</table> 
					</div>
					
				</div>
			</div>
		</div>
		
		
	
	<!-- side nav js -->
	<script src='admin/assets/js/SidebarNav.min.js' type='text/javascript'></script>
	<script>
      $('.sidebar-menu').SidebarNav()
    </script>
	<!-- //side nav js -->
	
	<!-- Classie --><!-- for toggle left push menu script -->
		<script src="admin/assets/js/classie.js"></script>
		<script>
			var menuLeft = document.getElementById( 'cbp-spmenu-s1' ),
				showLeftPush = document.getElementById( 'showLeftPush' ),
				body = document.body;
				
			showLeftPush.onclick = function() {
				classie.toggle( this, 'active' );
				classie.toggle( body, 'cbp-spmenu-push-toright' );
				classie.toggle( menuLeft, 'cbp-spmenu-open' );
				disableOther( 'showLeftPush' );
			};
			
			function disableOther( button ) {
				if( button !== 'showLeftPush' ) {
					classie.toggle( showLeftPush, 'disabled' );
				}
			}
		</script>
	<!-- //Classie --><!-- //for toggle left push menu script -->
	
	<!--scrolling js-->
	<script src="admin/assets/js/jquery.nicescroll.js"></script>
	<script src="admin/assets/js/scripts.js"></script>
	<!--//scrolling js-->
	
	<!-- Bootstrap Core JavaScript -->
	<script src="admin/assets/js/bootstrap.js"> </script>

<%@include file="admin-footer.jsp" %>