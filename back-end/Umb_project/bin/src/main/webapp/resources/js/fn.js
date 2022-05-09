
/*경로 /myapp1/ 부분 추출*/
function getContextPath(){
   var hostIndex = location.href.indexOf(location.host)+location.host.length;
   var contextPath = location.href.substring(hostIndex, location.href.indexOf("/", hostIndex+1))
   return contextPath
}


function loadList(){
	$.ajax({
		url :  getContextPath()+"/boardList.do",
		type : "get",
		dataType : "json",
		success : htmlView, // 소괄호 안적어도돼!~
		error : function(){
			alert("error")
		}
	})
}


function updateCt(idx){
	//textarea값 가져올 때 val()
	var content= $('#c'+idx).val()
	$.ajax({
		url :  "/myapp1/boardContentUpdate.do",
		type : "post",
		data : {"idx" : idx, 'content' : content},
		success : loadList, // 다시 리스트(수정된 값 반영한) 보여지도록,
		error : function(){
			alert("error")
		}
	})
}

function contentView(idx){
	if($('#cv'+idx).css('display') == 'none'){
	   $("#cv"+idx).css("display", "table-row")
	}
	else{
		$("#cv"+idx).css("display", "none")
	}
}

function goView(){ // 다 가져오는건
	/* var result = '<form class="form-horizontal" action="" method="post"> <div class="form-group"> <label class="control-label col-sm-2" for="title">제목:</label> <div class="col-sm-10"> <input type="text" class="form-control" id="title" name="title" placeholder="Enter title"> </div> </div> <div class="form-group"> <label class="control-label col-sm-2" for="content">내용:</label> <div class="col-sm-10"> <textarea rows="10" class="form-control" name="content"></textarea> </div> </div> <div class="form-group"> <label class="control-label col-sm-2" for="writer">작성자:</label> <div class="col-sm-10"> <input type="text" class="form-control" id="writer" name="writer" placeholder="Enter writer"> </div> </div> </div> </div> <div class="form-group"> <div class="col-sm-offset-2 col-sm-10"> <button type="submit" class="btn btn-success btn-sm">등록</button> <button type="reset" class="btn btn-warning btn-sm">취소</button> </div> </div> </form>' */
	if($('#wform').css('display') == 'none'){
		   $('#wform').css('display','block')
		}
	else{
		   $('#wform').css('display','none')
		}
	
	if($('#list').css('display') == 'none'){
		   $('#list').css('display','block')
		}
	else{
		   $('#list').css('display','none')
		}
}

function goInsert(){
	/* $("#title").val("")
	$("#content").val("")
	$("#writer").val("") */
	/* $("#init").trigger("click") 
	$("#wform").css("display","none") */
	//.serialize() 메서드는 표준 URL 인코딩 표기법으로 텍스트 문자열을 생성	
	var fData = $("#frm").serialize()
	   /* alert(fData)    */
	$.ajax({
		url :  "/myapp1/boardInsert.do",
		type : "post",
		data : fData,
		success : loadList, // 다시 리스트(수정된 값 반영한) 보여지도록,
		error : function(){
			alert("error")
		}
	})
}
 
function goUpdate(idx){
	var title = $("#t"+idx).text()
	var tInput = "<input id='nt"+idx+"' type='text' class='form-control'>"
	$("#t"+idx).html(tInput)
	
	var writer = $("#w"+idx).text()
	var wInput = "<input id='nw"+idx+"' type='text' class='form-control'>"
	$("#w"+idx).html(wInput)
	
	var newBtn = "<button class='btn btn-info btn-sm' onclick='goUpdate1("+idx+")'>수정하기</button>"
		$("#u"+idx).html(newBtn)
}

function goUpdate1(idx){
	var title = $("#nt"+idx).val()
	var writer = $("#nw"+idx).val()
	
	$.ajax({
		url :  "/myapp1/boardUpdateTW.do",
		type : "post",
		data : {"idx":idx, "title":title, "writer":writer},
		success : loadList, // 다시 리스트(수정된 값 반영한) 보여지도록,
		error : function(){alert("error")}
	})
}

function goDel(idx){
	$.ajax({
		url : "/myapp1/boardDelete.do",
		type : "get",
		data : {"idx":idx},
		success : loadList,
		error : function(){alert("error")}
	})	
}

function logout(){
	location.href = getContextPath()+"/logout.do"
}