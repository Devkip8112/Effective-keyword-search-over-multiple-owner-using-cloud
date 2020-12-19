<%@page import="DatabaseConnectivity.Dbconn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title> EFFECTIVE KEYWORD SEARCH </title>
	<meta charset="utf-8">
	<meta name = "format-detection" content = "telephone=no" />
	<link rel="icon" href="b.jpg" type="image/x-icon">
	<link rel="stylesheet" href="css/grid.css">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/contact-form.css">

	<script src="js/jquery.js"></script>
	<script src="js/jquery-migrate-1.2.1.js"></script>
	<script src="js/script.js"></script>
	<script src="js/TMForm.js"></script>
	<script src="js/modal.js"></script>
	<script src='//maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=false'></script>
	<!--[if (gt IE 9)|!(IE)]><!-->
	<script src="js/jquery.mobile.customized.min.js"></script>
	<script src="js/wow.js"></script>
	<script>
		$(document).ready(function () {
			if ($('html').hasClass('desktop')) {
				new WOW().init();
			}
		});
	</script>
        
	<style>
             body{
                background-image: url("a.gif");
	        background-size:100% 100%;
	        background-attachment:fixed;
            }
                       .dropbtn {
               background-color: #2980b9;
               color: white;
               padding: 16px;
               font-size: 16px;
               border: none;
}

            .dropdown {
               position: relative;
               display: inline-block;
}

            .dropdown-content {
  display: none;
  position: relative;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
  }

         .dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  }
  .dropdown-content a:hover 
{background-color: #ddd;}

.dropdown:hover 
.dropdown-content {display: block;}

.dropdown:hover 
.dropbtn {background-color: #3498db;}
.aa{
    color:#d2dae2;
    font-size:60px;
    word-spacing : "10px";
    padding : "20px";
    text-shadow : 0px 0px 100px white;
    letter-spacing :"5px"; 
    font-family: Copperplate Gothic Bold;
}
        </style>
	</head>
<body>
<div class="dropdown">
                       <button class="dropbtn">Menu</button> 
                           <div class="dropdown-content">
                                <a href="cloud_page.jsp">Cloud Home</a>
										
							
							
							<a href="c_uploads.jsp">Uploaded File</a>
							<a href="c_downloads.jsp">Cloud downloads</a>
							<a href="cloud_login.jsp">Log Out</a>
                                                        
								
  </div>
</div>
 <table border='0' width="80%">
          <tr height="60px">
          <td></td>
          </tr></table><br><br><br><br>
        <div class="aa">
            <center>
            EFFECTIVE KEYWORD SEARCH OVER <br>
                  MULTIPLE OWNER USING CLOUD
            </center></div><br><br>

<!--=======content================================-->

<section id="content" >
	<div class="full-width-container block-2">
		<div class="container">
                   <div class="row">
                             <center>
                                <header>
						<h2 style="color:whitesmoke;font-family:Copperplate Gothic Bold; font-size: 30px;"><span>Cloud Downloads</span></h2>
					</header>
					
                               </center>
			   <center>
                               <table border="8" width="800px" hieght="1200px" style="text-align: center;background-color:#00e5ff">
                   
                       <tr>
                               
                           <th style="color:#660066; font-size:23px;font:bolder" >File Name</th>
                                <th style="color:#660066; font-size:23px;font:bolder">Downloaded By</th>
                             
                                
                                </tr>
                               <br></br>
                         <tr>
                                <%
                                    try {
                                                                       
HttpSession user=request.getSession();
String mail=user.getAttribute("email").toString(); 
                                        Connection con;
                                        Statement st;
                                        ResultSet rs;
                                        con = Dbconn.getConnection();
                                        st = con.createStatement();
                                        rs = st.executeQuery("select * from f_download");
               
                                        while (rs.next()) {
                                             
            %>
                                <td style="font-size:18px;font:bolder"><%=rs.getString("file_name")%></td>
                              
                                <td style="font-size:18px;font:bolder" ><%=rs.getString("down")%></td>
                                <td style="font-size:18px;font:bolder"><%=rs.getString("date")%></td>
                               </tr>
                            <%}
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            %>
                        </table>
               </center>
            
                   
                            
         
				</div>
				</div>
		</div>
</section>


<script type="text/javascript">
		google_api_map_init();
		function google_api_map_init(){
			var map;
			var coordData = new google.maps.LatLng(parseFloat(40.6894388), parseFloat(-73.9036233,10)); 

			var styleArray = [
				{"featureType":"water","stylers":[{"color":"#021019"}]},
				{"featureType":"landscape","stylers":[{"color":"#08304b"}]},
				{"featureType":"poi","elementType":"geometry","stylers":[{"color":"#0c4152"},{"lightness":5}]},
				{"featureType":"road.highway","elementType":"geometry.fill","stylers":[{"color":"#000000"}]},
				{"featureType":"road.highway","elementType":"geometry.stroke","stylers":[{"color":"#0b434f"},{"lightness":25}]},
				{"featureType":"road.arterial","elementType":"geometry.fill","stylers":[{"color":"#000000"}]},
				{"featureType":"road.arterial","elementType":"geometry.stroke","stylers":[{"color":"#0b3d51"},{"lightness":16}]},
				{"featureType":"road.local","elementType":"geometry","stylers":[{"color":"#000000"}]},
				{"elementType":"labels.text.fill","stylers":[{"color":"#ffffff"}]},
				{"elementType":"labels.text.stroke","stylers":[{"color":"#000000"},{"lightness":13}]},
				{"featureType":"transit","stylers":[{"color":"#146474"}]},
				{"featureType":"administrative","elementType":"geometry.fill","stylers":[{"color":"#000000"}]},
				{"featureType":"administrative","elementType":"geometry.stroke","stylers":[{"color":"#144b53"},{"lightness":14},{"weight":1.4}]}
				]
			 
			function initialize() { 
			  var mapOptions = { 
				zoom: 12, 
				center: coordData, 
				scrollwheel: false, 
				styles: styleArray 
			  } 
 
			  var contentString = "<div></div>"; 
			  var infowindow = new google.maps.InfoWindow({ 
				content: contentString, 
				maxWidth: 200 
			  }); 
			   
			  var map = new google.maps.Map(document.getElementById("map-canvas"), mapOptions); 


			google.maps.event.addDomListener(window, 'resize', function() {

			  map.setCenter(coordData);

			  var center = map.getCenter();
			});
		}

			google.maps.event.addDomListener(window, "load", initialize); 

		}
</script>
<!-- coded by Fred -->
</body>
</html>