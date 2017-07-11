$('#auser').click(function(){
   $('#content').load('pages/user.html');
   $('#content').attr('src','pages/user.html');
 });

$('#assort').click(function(){
	   $('#content').load('pages/assort.html');
	   $('#content').attr('src','pages/assort.html');
	 });

$('#business').click(function(){
	   $('#content').load('pages/business.html');
	   $('#content').attr('src','pages/business.html');
	 });

$('#orders').click(function(){
	   $('#content').load('pages/orders.html');
	   $('#content').attr('src','pages/orders.html');
	 });

$('#setting').click(function(){
	   $('#content').load('pages/setting.html');
	   $('#content').attr('src','pages/setting.html');
	 });




function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
    }

	
	$("#dropdown-campus").empty();//移除子元素
	