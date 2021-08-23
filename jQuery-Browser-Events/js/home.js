$(document).ready(function () {
    $('#akronInfoDiv').hide();
    $('#minneapolisInfoDiv').hide();
    $('#louisvilleInfoDiv').hide();
    
    $("#mainButton").on("click", function () {
        $("#mainInfoDiv").show();
        $("#akronInfoDiv").hide();
        $('#minneapolisInfoDiv').hide();
        $('#louisvilleInfoDiv').hide();

    })
    $("#akronButton").on("click", function () {
        $("#akronInfoDiv").show();
        $('#mainInfoDiv').hide();
    $('#minneapolisInfoDiv').hide();
    $('#louisvilleInfoDiv').hide();
    })
    $("#minneapolisButton").on("click", function () {
        $("#minneapolisInfoDiv").show();
        $("#akronInfoDiv").hide();
        $('#mainInfoDiv').hide();
        $('#louisvilleInfoDiv').hide();
    })

    $("#louisvilleButton").on("click", function () {
        $("#louisvilleInfoDiv").show();
        $("#minneapolisInfoDiv").hide();
        $("#akronInfoDiv").hide();
        $('#mainInfoDiv').hide();
    })



});
