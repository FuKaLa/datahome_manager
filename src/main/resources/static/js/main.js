var host = "http://localhost:8989";
var ipAndPort = "http://sso.huatec.com";
var userData ={};
$(function () {
    $('.nav-item>a').on('click', function () {
        if (!$('.navList').hasClass('nav-mini')) {
            if ($(this).next().css('display') == "none") {
                //展开未展开
                $('.nav-item').children('ul').slideUp(300);
                $(this).next('ul').slideDown(300);
                $(this).parent('li').addClass('nav-show').siblings('li').removeClass('nav-show');
            } else {
                //收缩已展开
                $(this).next('ul').slideUp(300);
                $('.nav-item.nav-show').removeClass('nav-show');
            }
        }
    });
    userData=JSON.parse(localStorage.getItem('userData'))
    $('.login_user').html(userData.userName);
    var roleId = userData.roleId;
    if (roleId == 6) {
        $('.teacher-box').hide();
    } else {
        $('.teacher-box').show();
    }

    $('.back_index').click(function () {
        window.location = "login.html";
    })

})

/**
 * ajax动态加载页面
 */

function load(dom, url) {
    $.ajax({
        url: url,
        dataType: "html",
        async: false,
        success: function (data) {
            dom.html('');
            dom.html(data);

        }
    })

}

function ajaxPost(param, url, callback) {
    $.ajax({
        type: "post",
        url: url,
        data: JSON.stringify(param),
        contentType: "application/json;charset-UTF-8",
        dataType: "json",
        success: callback,
        error: function (data) {
            console.log(data)
        }
    })
}

function ajaxGet(param, url, async, callback) {
    $.ajax({
        type: "get",
        url: url,
        async: async,
        data: param,
        success: callback,
        error: function (data) {
            console.log(data)
        }
    })
}
function isNull(tmp){
    if(!tmp && typeof(tmp)!="undefined" && tmp!=0){
        return "暂无信息";
    }else{
        return tmp;
    }

}

function ssoLogOut(){
    // var ipAndPort = "http://sso.huatec.com";
    $.ajax({
        url : ipAndPort + "/Login/JsonpLogout",
        data : "",
        dataType : "jsonp",
        jsonp : "callback",
        success : function(data) {
            if(null != data && "" != data && "null" !=data){
                if(200 ==data.code){
                    window.location.href="/login";
                } else{
                    alert("退出门户失败");
                }
            }
        }
    });

}
