var ipAndPort = "http://sso.huatec.com";
var token = "";
var username = "";
var password = "";
var flag = 0;

$(function() {
    checkLogin();
    $("#commit").click(function(){
        submit();
    });

    $("#password").keydown(function(event){

        if (event.keyCode === 13) {
            submit();

        }

    });

    if ($.cookie("username") !== undefined &&
        $.cookie("password") !== undefined) {
        username = $.cookie("username");
        password = $.cookie("password");
    }

    if (username !== "" && password !== "") {
        submitData();
    }
});

function submit() {

    if ($("#username").val() === "") {
        alert("请输入用户名。");
        return;

    }
    if ($("#password").val() === "") {
        alert("请输入密码。");
        return;
    }

    username = $("#username").val();
    password = $("#password").val();
    submitData();

}

function submitData() {


    $.ajax({
        type: "GET",
        url: ipAndPort+"/Login/JsonpLogin",
        async: false,
        data:{
            from:"shujia",
            loginId:username,
            password: password
        },
        dataType: "jsonp",    //jsonp方式访问
        jsonp: "callback",
        success: function(data) {

            if (data.code === 200) {
                token = data.token;

            }else {
                alert(data.msg);
                return;
            }

            if (flag === 1) {
                save(username,password)
            }
            checkUserLongin();
        }
    });


}

$(document).ready(function() {
    $(".check").click(function() {
        if(flag === 0) {
            $(".check").css("background", "url(images/btn_2.png) left center no-repeat");
            flag = 1;
        } else {
            $(".check").css("background", "url(images/btn_1.png) left center no-repeat");
            flag = 0;
        }
    })
});

function checkLogin() {

    $.ajax({
        type: "POST",
        url: ipAndPort+"/Login/JsonpLoginCheck",
        async: false,
        data:{
            from:"shujia"
        },
        dataType: "jsonp",    //jsonp方式访问
        jsonp: "callback",
        success: function(data) {

            if (data.code === 200) {
                token = data.token;
                if (token !== ""){
                    checkUserLongin();
                }
            }
        }
    });

}

function checkUserLongin () {

    $.ajax({
        type: "POST",
        url: ipAndPort + "/Token/TokenDecrypt",
        async: false,
        data: {
            from: "shujia",
            token:token
        },
        dataType: "json",    //jsonp方式访问
        success: function (data) {
            var jsonData = JSON.parse(data.data);
            var role = jsonData.dpt_list[0];
            var userId = jsonData.user_id;
            var depName = role.dpt_name;
            var depId = role.dpt_id;
            var userName = jsonData.true_name;
            var headImg = jsonData.head_img;
            var nickName = jsonData.nick_name;

            var strRole = JSON.stringify(jsonData.rol_list);
            //if (nickName === "项目经理"){
            if (strRole.indexOf('P011') > 0 || strRole.indexOf('P032') > 0) {
                // window.location = "main?userId="+userId +"&depId="+depId+"&depName="+ encodeURI(depName)+
                //     "&userName="+encodeURI(userName) +
                //     "&headImg="+headImg+"&nickName="+encodeURI(nickName);
                location.href = "/getDetailMajorOpration";
            }else {
                alert("该用户没有权限登陆")
            }
        }
    });
}

function save(username, password) {
    $.cookie("username", username, { expires: 7 });
    $.cookie("password", password, { expires: 7 });
}