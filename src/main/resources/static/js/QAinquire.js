var teamId, 
userId=JSON.parse(localStorage.getItem('userData')).id,
roleId=JSON.parse(localStorage.getItem('userData')).roleId;
$(function(){
    initTeam();
    teamId = $('#teamList').val();
    if(!isNull(teamId)){
        initTeamMembers(teamId);
        getTeamChatRecord(teamId);
        send();
    }else{
        $('#speakNone').show();
        $('#speakCon').hide();
    }
})
function initTeam(){//加入团队
    var teamUrl=host+'/team/getJoinList?userId='+userId;
    $.ajax({
        type: "get",
        url: teamUrl,
        async:false,
        success:function(response){
            if(response.code==0){
                $('#teamList').html(' ');
                var data=response.data;
                for(var key in data){
                    $('#teamList').append('<option value="'+data[key].id+'">'+data[key].name+'</option>')
                }
            }
        },
        error:function(response){
            console.log(response);
        }
    })
    
}
function initTeamMembers(id){//团队成员
    var teamMembersUrl=host+'/chat/getTeamMembers?teamId='+id;
    $.ajax({
        type: "get",
        url: teamMembersUrl,
        success:function(response){
            if(response.code==0){
                $('#membersUl').html(' ');
                var data=response.data;
                for(var key in data){
                    $('#membersUl').append('<li>'+data[key].userName+'<span>'+data[key].roleName+'</span></li>')
                }
            }
        },
        error:function(response){
            console.log(response);
        }
    })
}
function getTeamChatRecord(id){//聊天记录
    
    var chatRecordUrl=host+'/chat/getTeamChatRecord?teamId='+id;
    $.ajax({
        type: "get",
        url: chatRecordUrl,
        success:function(response){
            if(response.code==0){
                var data=response.data;
                if(data.length==0){
                    $('#speakNone').show();
                    $('#speakCon').hide();
                }else{
                    $('#speakNone').hide();
                    $('#speakCon').show();
                    $('#speakConDetail').html(' ');
                    for(var key in data){
                        var name =(data[key].userId==userId?data[key].username:'我')
                        $('#speakConDetail').append('<dl class="speak-detail-con">'+
                        '<dt class="speak-detail-user '+(data[key].userId==userId?'':'text-right')+' clearfix">'+
                            '<span class="speak-detail-name">'+name+'</span>'+
                            '<p class="speak-detail-time gray">'+data[key].createtime+'</p>'+
                        '</dt>'+
                        '<dd class="gray">'+
                            '<i class="speak-live-ico"></i>'+
                            data[key].context+
                        '</dd>'+
                    '</dl>')
                    }
                }
            }
        },
        error:function(response){
            console.log(response);
        }
    })
}
function send(){
    $('#speakBtn').click(function(){
        console.log($('#speak').val());
        var sendUrl=host+'/chat/save'
        var params={
            teamId:teamId,
            userId:userId,
            roleId:roleId,
            context:$('#speak').val()
        };
        $.ajax({
            type: "post",
            data:JSON.stringify(params),
            dataType:"json",
            contentType: "application/json;charset-UTF-8",
            url: sendUrl,
            success:function(response){
                if(response.code==0){
                    getTeamChatRecord(teamId);
                }
            },
            error:function(response){
                console.log(response);
            }
        })
        return false;
    })
}
function isNull(tmp){
    if(!tmp && typeof(tmp)!="undefined" && tmp!=0){
        return true;
    }else{
        return false;
    }
}