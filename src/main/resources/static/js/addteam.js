$(function () {
    
    //初始化页面
    var tableData = [{
        id: "1",
        name: "计算机团队",
        college: "计算机系",
        school: "上海商学院",
        major: "电子信息学院",
        needNum:"10",
        deadtime: "2019-8-7",
        introduce: "80"
    }]
    var tableDataCoum = [{
        field: 'name',
        title: '团队名称'
    }, {
        field: 'school',
        title: '所属学校'
    }, {
        field: 'college',
        title: '所属院系'
    }, {
        field: 'major',
        title: '所属专业',
        sortable: true,
    }, {
        field: 'needNum',
        title: '所需人数',
        sortable: true,
    }, {
        field: 'deadtime',
        title: '结束时间',
        sortable: true,
    },{
        field: 'id',
        title: ' ',
        formatter: actionFormatter
    }];
    var teamUrl = host + "/team/getNotJoinList";
    ajaxGet({offset:1,limit:99999}, teamUrl, true, function (res){
        initTable('tableData',res.data, tableDataCoum);
    })
})

function actionFormatter(value, row, index) {
    var id = value;
    var result = "";
    result += "<a href='javascript:;' class='btn btn-primary' onclick=\"EditViewById('" + id + "')\" title='加入'>加入</a>";
    return result;
} 
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
function EditViewById(id){
    var joinUrl=host+"/team/join";
    var param={
        teamId:id,
        userId:userData.id,
        roleId:userData.roleId,
    }
    ajaxGet(param,joinUrl,true,function(res){
        if(res.code==0){
            alert("恭喜加入成功！");
        }else{
            alert(res.msg);
        }
    })
    $('#myModal').modal('show')
}  