$(function(){
    var planUrl = host + "/plan/list";
    ajaxGet({}, planUrl, true, function (res){
        if(res.code==0){
            var data= res.data;
            for(var key in data)
            {
                 $('#plan').append("<option value='"+data[key].id+"'>"+data[key].name+"</option>")
                
            }
        }   
        
    })
    $('#createTeam').click(function (e) { 
        var url=host+"/team/save";
        var param={
            name:$('#firstname').val(),
            deadtime:$('#deadtime').val(),
            planId:$('#teamCount').val(),
            teamCount: $('#teamCount').val()
        }
        ajaxPost(param,url,function(res){
            if(res.code==0){
                alert("创建成功");
            }
        })
    });
})