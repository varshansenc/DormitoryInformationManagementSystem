/**
 * 公共js
 */
/*cloud*/
$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  
});  
/*index*/
function regeste(){
	document.getElementsByName("oper")[0].value="regeste";
}

/*main**/
function openDialog(){
    document.getElementById('light').style.display='block';
    document.getElementById('fade').style.display='block';
}
function closeDialog(){
    document.getElementById('light').style.display='none';
    document.getElementById('fade').style.display='none';
}
 
/*delete*/
function openDialog1(){
    document.getElementById('light1').style.display='block';
    document.getElementById('fade1').style.display='block';
}
function closeDialog1(){
    document.getElementById('light1').style.display='none';
    document.getElementById('fade1').style.display='none';
}

/*delete*/
function openDialog2(){
    document.getElementById('light2').style.display='block';
    document.getElementById('fade2').style.display='block';
}
function closeDialog2(){
    document.getElementById('light2').style.display='none';
    document.getElementById('fade2').style.display='none';
}
