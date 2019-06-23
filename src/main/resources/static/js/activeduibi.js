var type ;
$(function () {
    var type = getQueryString("type");
    var text = $('.main-h5').html();
    switch (type) {
        case 'yuan':
            $('.main-h5').html("学院" + text);
            break;
        case 'school':
            $('.main-h5').html("学校" + text);
            break;
    }
    var data={
        yuan: ['电子信息', '计算机科学', '软件工程', '计算机网络', '图像分析'],
        school:['上海商学院', '复旦大学', '上海大学', '上海交通大学', '上海传媒大学']
    }
    option = {
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: data[type]
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: ['一月', '二月', '三月', '四月', '五月', '六月', '七月']
        },
        yAxis: {
            type: 'value'
        },
        series: [{
                name: data[type][0],
                type: 'line',
                stack: '总量',
                data: [120, 132, 101, 134, 90, 230, 210]
            },
            {
                name: data[type][1],
                type: 'line',
                stack: '总量',
                data: [220, 182, 191, 234, 290, 330, 310]
            },
            {
                name: data[type][2],
                type: 'line',
                stack: '总量',
                data: [150, 232, 201, 154, 190, 330, 410]
            },
            {
                
                name: data[type][3],
                type: 'line',
                stack: '总量',
                data: [320, 332, 301, 334, 390, 330, 320]
            },
            {
                name: data[type][4],
                type: 'line',
                stack: '总量',
                data: [820, 932, 901, 934, 1290, 1330, 1320]
            }
        ]
    };
    var myChart = echarts.init(document.getElementById('lineChart1'));
    myChart.setOption(option);

})

//获取URL参数
function getQueryString(name) {
    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return decodeURIComponent(r[2]);
    }
    return null;
}