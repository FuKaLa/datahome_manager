
//修改提交
function update() {

    alert($("#xx").val())
    var baseInfo=[];
    var d1={"name":"学校","value":$("#xx").val()};
    var d2={"name":"视频数量/个","value":$("#spsl").val()};
    var d3={"name":"教师人数","value":$("#js").val()};
    var d4={"name":"班级","value":$("#bj").val()};
    var d5={"name":"学生人数","value":$("#xs").val()};
    var d6={"name":"视频时长/h","value":$("#spsc").val()};
    var d7={"name":"视频容量/G","value":$("#sprl").val()};
    var d8={"name":"试卷数量/份","value":$("#sjsl").val()};
    var d9={"name":"课件数量/份","value":$("#kjsl").val()};
    var d10={"name":"作业数量/份","value":$("#zysl").val()};
    var d11={"name":"当日新建/维护课程数量","value":$("#drxj").val()};
    var d12={"name":"当日上传视频数量","value":$("#drscsp").val()};
    var d13={"name":"当日上传课件数量","value":$("#drsckj").val()};
    var d14={"name":"当日发布直播数量","value":$("#drfbzb").val()};
    baseInfo.push(d1);baseInfo.push(d2);baseInfo.push(d3);
    baseInfo.push(d4);baseInfo.push(d5);baseInfo.push(d6);
    baseInfo.push(d7);baseInfo.push(d8);baseInfo.push(d9);
    baseInfo.push(d10);baseInfo.push(d11);baseInfo.push(d12);
    baseInfo.push(d13);baseInfo.push(d14);

    var jpbxNum=[];
    var da1={"courseCategory":"精品课程","courseNum":$("#jpkc").val()};
    var da2={"courseCategory":"必修课程","courseNum":$("#bxkc").val()};
    jpbxNum.push(da1);
    jpbxNum.push(da2);

    var courseNum=[];
    var dat1={"majorName":"通信方向","majorCourse":$("#tx").val()};
    var dat2={"majorName":"移动互联方向","majorCourse":$("#ydhl").val()};
    var dat3={"majorName":"云计算方向","majorCourse":$("#yjs").val()};
    var dat4={"majorName":"物联网方向","majorCourse":$("#wlw").val()};
    var dat5={"majorName":"智能制造方向","majorCourse":$("#znzz").val()};
    courseNum.push(dat1);
    courseNum.push(dat2);
    courseNum.push(dat3);
    courseNum.push(dat4);
    courseNum.push(dat5);

    var digitizationNum=[];
    var data1={"name":"微课","value":$("#wk").val()};
    var data2={"name":"录播","value":$("#lb").val()};
    var data3={"name":"课件","value":$("#kj").val()};
    var data4={"name":"试卷","value":$("#sj").val()};
    var data5={"name":"问卷","value":$("#wj").val()};
    var data6={"name":"资料","value":$("#zl").val()};
    var data7={"name":"作业","value":$("#zy").val()};
    digitizationNum.push(data1);
    digitizationNum.push(data2);
    digitizationNum.push(data3);
    digitizationNum.push(data4);
    digitizationNum.push(data5);
    digitizationNum.push(data6);
    digitizationNum.push(data7);

    var data={
        baseInfo:baseInfo,
        jpbxNum:jpbxNum,
        courseNum:courseNum,
        digitizationNum:digitizationNum
    };
    var url="/updateSmartLearningTea";
    ajaxPost(data,url,function(res){
        if(res.code==0){
            alert("修改成功");
        }
    })


}








