$(document).ready(function () {
    $('H1').addClass('text-center');
    $('H2').addClass('text-center');
    $(".myBannerHeading").removeClass('page-header');
    $(".myBannerHeading").addClass('page-header');
   
    $("#yellowHeading").text("Yellow Team");
   $("#blueTeamList").css('color','blue');
   $("#redTeamList").css('color','red');
   $("#orangeTeamList").css('color','orange');
   $("#yellowTeamList").css('color','yellow');
   $('#yellowTeamList').append('<li>Joseph Banks</li>')
   $('#yellowTeamList').append('<li>Simon Jones</li>');
   $("H1").hide();
 
   $('#footerPlaceholder').remove();
   $('#footer').append('<p>Name: Divya Email: divya.deverapally@gmail.com</p>');


$('#footer').css('font-family' , "Courier");
$('#footer').css('font-size' , "24px");



});