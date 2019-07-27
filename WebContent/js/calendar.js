var dat = new Date();
var nianD = dat.getFullYear();  
var yueD = dat.getMonth();
var tianD = dat.getDate();     
add();     
function add() {   
	document.getElementById('date').innerHTML = "";       
	var nian = dat.getFullYear();
	var yue = dat.getMonth(); 
	var tian = dat.getDate();
	var arr = ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"];   
	document.getElementById('nian').innerText = nian;   
	document.getElementById('yue').innerText = arr[yue];       
	var setDat = new Date(nian, yue + 1, 1 - 1);
	var setTian = setDat.getDate();
	var setZhou = new Date(nian, yue, 1).getDay();
	for(var i = 0; i < setZhou; i++) {
		var li = document.createElement('li');    
		document.getElementById('date').appendChild(li);   
	}       
	for(var i = 1; i <= setTian; i++) {
		var li = document.createElement('li');    
		li.innerText = i;    
		if(nian == nianD && yue == yueD && i == tianD) {    
			li.className = "active";    
		} else {    
			li.className = "hover";    
		}        
		document.getElementById('date').appendChild(li);   
	}       
}      
document.getElementById("next").onclick = function() {   
	dat.setMonth(dat.getMonth() + 1);
	add();
};   
document.getElementById("prev").onclick = function() {   
	dat.setMonth(dat.getMonth() - 1);
	add();   
};