$(function () {
    
    //初始化页面
    var tableData = [{
        id: "1",
        name: "计算机团队",
        college: "计算机系",
        school: "上海商学院",
        major: "电子信息学院",
        needNum:"10",
        updateTime: "2019-8-7",
        introduce: "80"
    }]
    var tableDataCoum = [ {
        field: 'school',
        title: '所属学校'
    }, {
        field: 'college',
        title: '所属院系'
    }, {
        field: 'major',
        title: '所属专业',
        sortable: true,
    },{
        field: 'name',
        title: '教师'
    },  {
        field: 'updateTime',
        title: '最近更新时间',
        sortable: true,
    },{
        field: 'id',
        title: ' ',
        formatter: actionFormatter
    }];

    initTable('tableData', "", tableDataCoum);
    function actionFormatter(value, row, index) {
            var id = value;
            var result = "";
            result += "<a href='javascript:;'  onclick=\"EditViewById('" + id + "')\" title='下载'>下载</a>";
            return result;
    } 
    //初始化table和分页数据
    function initTable(id, data, columns) {
        //var obj = eval("("+data+")");
        var obj = tableData;
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

})
function EditViewById(id){
    $('#myModal').modal('show')
}  