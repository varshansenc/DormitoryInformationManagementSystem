/**
 * ajaxs
 */
	/*mainStu*/
	function searchStu1(){
		var str=document.getElementById("stuno").value; 	
		if(str==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		var xmlHttp=new XMLHttpRequest();
		xmlHttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xmlHttp.responseText;
			}
		}
		xmlHttp.open("POST","/w/search?stuno="+str,true);
		xmlHttp.send();
	}

	function alterStuInfo(){
		var str=document.getElementById("stuno2").value;
		var stufieldname=document.getElementById("stufieldname").value;
		var stufieldvalue=document.getElementById("stufieldvalue").value;
		if(str=="" || stufieldname=="" || stufieldvalue==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		var xmlHttp=new XMLHttpRequest();
		xmlHttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xmlHttp.responseText;
			}
		}
		xmlHttp.open("POST","/w/UpdateStuServlet?stuno="+str+"&stufieldname="+stufieldname+"&stufieldvalue="+stufieldvalue,true);
		xmlHttp.send();
	}
	
	function searchStuRecord(){
		var str=document.getElementById("stuno1").value; 	
		if(str==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		var xmlHttp=new XMLHttpRequest();
		xmlHttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xmlHttp.responseText;
			}
		}
		xmlHttp.open("POST","/w/SearchStuRecordServlet?stuno="+str,true);
		xmlHttp.send();
	}
	
	
	/*mainManage*/
	function importFile1() {
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if (this.readyState==4 && this.status==200) {
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/ImportFileServlet",true);
		xhttp.send();
	}
	function searchBuildAdm1() {
		var str=document.getElementById("buildadmno").value;
		if(str==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		var xmlHttp=new XMLHttpRequest();
		xmlHttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xmlHttp.responseText;
			}
		}
		xmlHttp.open("POST","/w/BuildSearchServlet?buildadmno="+str,true);
		xmlHttp.send();	
	}

	function alterBuildAdmInfo() {
		var str=document.getElementById("buildadmno1").value;
		var buildadmfieldname=document.getElementById("buildadmfieldname").value;
		var buildadmfieldvalue=document.getElementById("buildadmfieldvalue").value;
		if(str=="" || buildadmfieldname=="" || buildadmfieldvalue==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/BuildAdmAlterServlet?buildadmno="+str+"&buildadmfieldname="+buildadmfieldname+"&buildadmfieldvalue="+buildadmfieldvalue,true);
		xhttp.send();
	}
	
	function displayStu1() {
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/BuildAdmDisplayServlet",true);
		xhttp.send();
	}
	
	function displayAbsenceRecord1() {
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/BuildAdnDARServlet",true);
		xhttp.send();
	}
	
	function addAbsenceRecord1() {
		var xhttp=new XMLHttpRequest();
		var recordno=document.getElementById("AbsenceRecordno").value;
		var stuno=document.getElementById("stuno").value;
		var stuname=document.getElementById("stuname").value;
		var buildno=document.getElementById("buildno").value;
		var dormno=document.getElementById("dormno").value;
		var recorddate=document.getElementById("recorddate").value;
		var stutel=document.getElementById("stutel").value;
		if(recordno==null || stuno==null || stuname==null || buildno==null || dormno==null || recorddate==null || stutel==null){
			document.getElementById("answer").innerHTML="";
			return;
		}
		xhttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		var basepath="/w/BuildAdmAddAR";
		var path=basepath+"?recordno="+recordno+"&stuno="+stuno+"&stuname="+stuname+"&buildno="+buildno+
				"&dormno="+dormno+"&recorddate="+recorddate+"&stutel="+stutel;
		xhttp.open("POST",path,true);
		xhttp.send();
	}
	
	function deleteAR1() {
	    document.getElementById('light1').style.display='none';
	    document.getElementById('fade1').style.display='none';
		var str=document.getElementById("absenceRecordno1").value;
		if(str==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		var xmlHttp=new XMLHttpRequest();
		xmlHttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xmlHttp.responseText;
			}
		}
		xmlHttp.open("POST","/w/BuildDelAR?recordno="+str,true);
		xmlHttp.send();	
	}
	
	function alterAR1(){
		var str=document.getElementById("absenceRecordno2").value;
		var ARfieldname=document.getElementById("ARfieldname").value;
		var ARfieldvalue=document.getElementById("ARfieldvalue").value;
		if (str==""||ARfieldname==""||ARfieldvalue==""){
			document.getElementById("answer").innerHTML="";	
			return;
		}
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/BuildAlterARServlet?recordno="+str+"&ARfieldname="+ARfieldname+"&ARfieldvalue="+ARfieldvalue,true);
		xhttp.send();
	}
	
	
	/*mainAdmin*/
	
	function searchSysAdm1(){
		var str=document.getElementById("sysadmno").value;
		if(str==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/SysAdmSearchServlet?sysadmno="+str,true);
		xhttp.send();
	}
	function alterSysAdm1() {
		var str=document.getElementById("sysadmno1").value;
		var sysadmfieldname=document.getElementById("Sysfieldname").value;
		var sysadmfieldvalue=document.getElementById("Sysfieldvalue").value;
		if(str==""||sysadmfieldname==""||sysadmfieldvalue==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/AdminAlterServlet?sysadmno="+str+"&sysadmfieldname="+sysadmfieldname+"&sysadmfieldvalue="+sysadmfieldvalue,true);
		xhttp.send();
	}
	function addBuild1() {
		var str=document.getElementById("buildno").value;
		var buildadmno=document.getElementById("buildadmno").value;
		var buildtype=document.getElementById("buildtype").value;
		var stucount=document.getElementById("stucount").value;
		var tel=document.getElementById("tel").value;
		if(str==""||buildadmno==""||buildtype==""||stucount==""||tel==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200) {
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		var basepath="/w/AdminAddBuildServlet";
		var path=basepath+"?buildno="+str+"&buildadmno="+buildadmno+"&buildtype="+buildtype+"&stucount="+stucount+"&tel="+tel;
		xhttp.open("POST",path,true);
		xhttp.send();
	}
	function displayBuild1() {
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if (this.readyState==4 && this.status==200) {
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/AdminDisplayBuildServlet",true);
		xhttp.send();
	}
	function alterBuild1() {
		var str=document.getElementById("Buildno1").value;
		var buildfieldname=document.getElementById("Buildfieldname").value;
		var buildfieldvalue=document.getElementById("Buildfieldvalue").value;
		if (str==""||buildfieldname==""||buildfieldvalue=="") {
			document.getElementById("answer").innerHTML="";
			return;
		}
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if (this.readyState==4 && this.status==200) {
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/AdminAlterBuildServlet?buildno="+str+"&buildfieldname="+buildfieldname+"&buildfieldvalue="+buildfieldvalue,true);
		xhttp.send();
	}
	function deleteBuild1() {
		closeDialog1();
		var str=document.getElementById("buildno2").value;
		if(str==""){
			document.getElementById("answer").innerHTML="";
			return;
		}
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if (this.readyState==4 && this.status==200) {
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/AdminDeleteBuildServlet?buildno="+str,true);
		xhttp.send();
	}
	
	function alterUser1() {
		var str=document.getElementById("type1").value;
		var username=document.getElementById("username1").value;
		var pwd=document.getElementById("pwd").value;
		var type=null;
		if (str=="学生") {
			type="stu";
		}else if (str=="宿舍管理员") {
			type="buildadm";
		}else {
			type="";
		}
		alert(type+":"+username+":"+pwd);
		if (type==""||username==""||pwd=="") {
			document.getElementById("answer").innerHTML="";
			return;
		}
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if (this.readyState==4 && this.status==200) {
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/AdminAlterUserServlet?type="+type+"&username="+username+"&pwd="+pwd,true);
		xhttp.send();
	}
	
	function deleteUser1() {
		closeDialog2();
		var str=document.getElementById("type").value;
		var username=document.getElementById("username").value;
		if (str==""||username=="") {
			document.getElementById("answer").innerHTML="";
			return;
		}
		var type=null;
		if(str=="学生"){
			type="stu";
		}else if (str=="宿舍管理员") {
			type="buildadm";
		}else if(str=="系统管理员"){
			type="sysadm";
		}
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange=function(){
			if (this.readyState==4 && this.status==200) {
				document.getElementById("answer").innerHTML=xhttp.responseText;
			}
		}
		xhttp.open("POST","/w/AdminDeleteUserServlet?type="+type+"&username="+username,true);
		xhttp.send();
	}
	
