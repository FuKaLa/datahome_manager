$(function () {
    var userData = JSON.parse(localStorage.getItem('userData'));
    if(userData.roleId!=1){
        $('.school-nav').hide();
        $('.jiaowen-nav').show();
    }else{
        $('.school-nav').show();
        $('.jiaowen-nav').hide();
    }
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
    })
}