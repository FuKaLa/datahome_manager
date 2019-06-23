var host = "http://local:8989";
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
//折线图
function lineEchars(id, data) {
    //基于准备好的DOM，初始化echarts实例
    var myChart = echarts.init(document.getElementById(id));
    var datax = [];
    for (var key in data) {
        datax.push(data[key].name);
    }

    var option = {
        color: ["#4e7ff2"],
        xAxis: {
            type: 'category',
            // axisLabel: { 
            //     rotate:45,
            // },
            boundaryGap: false,
            data: datax
        },
        yAxis: {
            type: 'value',
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: { // 坐标轴指示器，坐标轴触发有效
                type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        grid: {
            left: '30px',
            right: '30px',
            bottom: '0',
            top: '30px',
            containLabel: true
        },
        series: {
            type: "line",
            data: data
        }
    }
    //使用刚指定的配置项和数据显示图表
    myChart.setOption(option);
}

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
