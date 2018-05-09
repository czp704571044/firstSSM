$(function(){
	 $("menu-header1 ul li:first").hover(function() {
	 	$("menu-header1 ul li a:not(:first)").css("display","block");
	 }, function() {
	    $("menu-header1 ul li a:not(:first)").css("display","none");	
	 },200);
	});