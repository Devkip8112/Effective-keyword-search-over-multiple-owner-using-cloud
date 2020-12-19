<!DOCTYPE html>
<html lang="en">
	<head>
	<title>EFFECTIVE KEYWORD SEARCH</title>
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
    color:whitesmoke;
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
                                <a href="index.html">Home</a>
                                <a href="#">Employee</a>
                                     <a href="user_login.jsp">Login</a>
                                     <a href="register.jsp">Register</a>
                       
          
                       <a href="authority_login.jsp">Team Leader</a>
                       <a href="trustee_login.jsp">Manager</a>
                       <a href="cloud_login.jsp">Cloud</a>
  </div>
</div>
        <table border='0' width="80%">
          <tr height="60px">
          <td></td>
          </tr></table><br><br>
        <div class="aa">
            <center>
            EFFECTIVE KEYWORD SEARCH OVER <br>
                  MULTIPLE OWNER USING CLOUD
                   </center></div>
          <br><br><br>



<section>
	
    <center>     <fieldset style="background-color:cornflowerblue;border-radius: 9px;height: 350px;margin-top: 10px;">
                                 <br>
          <center>
        <h1 style="font: monospace;font-size: 35px;font-weight: bold;color:black">Manager Login</h1><br><br>
            <form action="trustee_login" name="" method="post" > 
<label style="font-size: 20px;margin-left:30px;">Manager-ID:</label> <br><input type="text" id="id"  style="height: 30px; width:250px; " name="name"required style="margin-left: 45px;" placeholder="Enter Trustee ID "/><br><br>
 <label style="font-size: 20px;margin-left:25px">Password:</label>    <br>  <input type="password"  id="id"name="pass" style="height: 30px; width:255px; " required style="margin-left:60px;" placeholder="Enter password"/><br><br>
<input type="submit"  value="Submit"style="border-radius: 12px;height: 38px;width: 93px;background-color:slateblue"/>

<input type="reset" value="Reset" style="border-radius: 12px;height: 38px;width: 83px;background-color:slateblue"></input><br></br>
     
  
      
            
		</form>
          </center>
        </fieldset></center>
                
                                       
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