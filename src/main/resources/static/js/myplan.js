$(function () {

    //初始化页面
    var tableData = [{
        id: "1",
        name: "计算机团队",
        college: "计算机系",
        school: "上海商学院",
        major: "电子信息学院",
        deadtime: "2019-8-7",
        introduce: "80"
    }]
    var tableDataCoum = [{
        field: 'name',
        title: '计划名称'
    }, {
        field: 'clazztime',
        title: '坐班答疑时间'
    },{
        field: 'studytime',
        title: '自习答疑时间'
    }, {
        field: 'college',
        title: '所属院系'
    }, {
        field: 'year',
        title: '学年',
    }, {
        field: 'term',
        title: '学期',
    }, {
        field: 'number',
        title: '职工号',
    }, {
        field: 'type',
        title: '申报类型'
    }, {
        field: 'plan',
        title: '访学计划'
    }];
    var planUrl = host + "/plan/list";
    ajaxGet({}, planUrl, true, function (res){
        initTable('tableData',res.data, tableDataCoum);
    })
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