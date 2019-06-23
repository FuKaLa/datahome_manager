$(function () {
    var type = getQueryString("type");
    switch (type) {
        case 'yuan':
            $('.main-h5').html("院工作汇报");
            break;
        case 'xi':
            $('.main-h5').html("系工作汇报");
            break;
        case 'teacher':
            $('.main-h5').html("老师工作汇报");
            break;
    }


    //初始化页面
    var tableData = {
        "yuan": [{
            id: "1",
            name: "张爱丽",
            major: "计算机科学与技术",
            type: "月报",
        },{
            id: "2",
            name: "李寅",
            major: "计算机网络",
            type: "月报",
        },{
            id: "3",
            name: "孙美玲",
            major: "电子信息",
            type: "月报",
        }],
        "xi": [{
            id: "1",
            name: "李寅",
            major: "电子信息",
            type: "周报",
        }],
        "teacher": [{
            id: "1",
            name: "孙美玲",
            major: "计算机网络",
            type: "月报",
        }]
    }
    var tableDataCoum = [{
        field: 'major',
        title: '专业'
    }, {
        field: 'name',
        title: '教师'
    }, {
        field: 'type',
        title: '报告种类'
    }];
    initTable('tableData', tableData[type], tableDataCoum);
})
//初始化table和分页数据
function initTable(id, data, columns) {
    var obj = data;
    $('#' + id).bootstrapTable({
        data: obj,
        pageSize: 20,
        columns: columns,
        onLoadSuccess: function () {},
        onLoadError: function () {
            showTips("数据加载失败！");
        },
        // onClickRow: function (row, $element) {
        //     var id = row.id;
        //     console.log(row)
        //     EditViewById(id);
        // },

    })

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