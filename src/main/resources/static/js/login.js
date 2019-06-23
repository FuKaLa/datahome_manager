$(function(){
    var host="http://192.168.1.114:8080";
    var url=host+'/user/login';    
    $('#loginBtn').click(function(){
        $("#loginForm").Validform({
            tiptype:3,
            showAllError:true,
            beforeSubmit:function(){},
            callback:function(curform){
                var param={
                    userName:$('#loginname').val(),
                    password:$('#loginpassword').val(),
                    roleId:parseInt($('#status').val())
                }
                status=$('#status').val();
                $.ajax({
                    type:"get",
                    url:url,
                    data:param,
                    success:function(data){
                        if(data.code==0){
                            localStorage.setItem('userData',JSON.stringify(data.data));
                            if(status<3){
                                window.location='school/active.html'
                            }else{
                                window.location='personal_info.html'
                            }
                        }else{
                            alert(data.msg)
                        }
                    },
                    error:function(data){
                        console.log(data)
                    }
                })
                return false;
            }
        });
    })
})