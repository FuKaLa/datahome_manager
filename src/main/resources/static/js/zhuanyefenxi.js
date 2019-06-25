
//修改提交
function update() {

    var str = $("#setupTime").val();
// 转换日期格式
    str = str.replace(/-/g, '/'); // "2010/08/01";
// 创建日期对象
    var date = new Date(str);
// 加一天
//     date.setDate(date.getDate() + 1);

    alert($("#undergraduate").val())
    var majorBasic=[];
    var d1={"majorName":$("#majorName").val(),
        "majorBook":$("#majorBook").val(),
        "majorTeacher":$("#majorTeacher").val(),
        "majorCourse":$("#majorCourse").val(),
        "majorCourseHour":$("#majorCourseHour").val(),
        "majorSatisfaction":$("#majorSatisfaction").val(),
        "undergraduate":$("#undergraduate").val(),
        "vocational":$("#vocational").val(),
        "setupTime":date,
        "majorStudent":$("#majorStudent").val()
    };
    majorBasic.push(d1);

    var data={
        majorBasic:majorBasic
    };
    var url="/updateMajorAnalysis";
    ajaxPost(data,url,function(res){
        if(res.code==0){
            alert("修改成功");
        }
    })


}