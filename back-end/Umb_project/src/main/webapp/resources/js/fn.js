
function getContextPath(){
   var hostIndex = location.href.indexOf(location.host)+location.host.length;
   var contextPath = location.href.substring(hostIndex, location.href.indexOf("/", hostIndex+1))
   return contextPath
}


function loadList(){
	$.ajax({
		url :  getContextPath()+"/userList.do",
		type : "get",
		dataType : "json",
		success : htmlView,
		error : function(){
			alert("error")
		}
	})
}

function umbList(){
	$.ajax({
		url :  getContextPath()+"/umbList.do",
		type : "get",
		dataType : "json",
		success : htmlView,
		error : function(){
			alert("error")
		}
	})
}

function goUp(umb_seq){
	$.ajax({
		url : getContextPath()+"/umbUpdate.do",
		type : "get",
		data : {"umb_seq":umb_seq},
		success : umbList,
		error : function(){alert("error")}
	})	
}

