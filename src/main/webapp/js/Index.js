$(function(){
	//控制搜索按钮
	$("#buttonOfSearch").click(function(){
		var data=$("#input").val();
		$.ajax({
			type:"post",
			url:/item/search.do,
			data:"data",
			dataType:"json",
			success:function(data){
				alert("data");
			}
		})
	})
	});