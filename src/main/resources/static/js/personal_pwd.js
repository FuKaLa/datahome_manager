$(function () {
    
    $('#pwdBtn').click(function () {
        var url = host + "/user/updatePassword";
        var userId=JSON.parse(localStorage.getItem('userData')).id;
        $("#editpwd").Validform({
            tiptype: 3,
            showAllError: true,
            beforeSubmit: function () {},
            callback: function (curform) {
                var param = {
                    password: $('#pwd').val(),
                    userId:userId
                }
                $.ajax({
                    type: "get",
                    url: url,
                    data: param,
                    success: function (data) {
                        if (data.code == 0) {
                            alert("修改成功请重新登录");
                            window.location = 'login.html';
                        } else {
                            console.log(data)
                        }
                    },
                    error: function (data) {
                        console.log(data)
                    }
                })
                return false;
            }
        });
    })
})