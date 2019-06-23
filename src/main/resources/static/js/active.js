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
    echar();
})

function echar() {
    var type = getQueryString("type");
    var seriesData = {yuan:[{
            name: "软件工程",
            value: 85
        },
        {
            name: "计算机网路",
            value: 75
        },
        {
            name: "计算机科学",
            value: 78
        },
        {
            name: "图像识别",
            value: 68
        },
        {
            name: "大数据",
            value: 75
        }
    ],school: [{
            name: "电子信息学院",
            value: 85
        },
        {
            name: "外语学院",
            value: 75
        },
        {
            name: "土木工程",
            value: 78
        },
        {
            name: "车辆工程",
            value: 68
        },
        {
            name: "电子商务",
            value: 75
        }
    ]};
    lineEchars('lineChart2', seriesData[type])
}
//获取URL参数
function getQueryString(name) {
    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return decodeURIComponent(r[2]);
    }
    return null;
}