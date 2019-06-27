
//修改提交
function update() {

    // alert($("#xx").val())
    var baseInfo=[];
    var d1={"name":"学校","value":$("#xx").val()};
    var d2={"name":"教师人数","value":$("#js").val()};
    var d3={"name":"班级","value":$("#bj").val()};
    var d4={"name":"学生人数","value":$("#xs").val()};
    var d5={"name":"当日总点击量","value":$("#drzdjl").val()};
    var d6={"name":"课程点击量","value":$("#kcdjl").val()};
    var d7={"name":"录播视频点击量","value":$("#lbspdjl").val()};
    var d8={"name":"微课视频点击量","value":$("#wkspdjl").val()};
    var d9={"name":"课件点击量","value":$("#kjdjl").val()};
    var d10={"name":"学生平均上线率","value":$("#xspjsxl").val()};
    var d11={"name":"通信","value":$("#tx").val()};
    var d12={"name":"移动互联","value":$("#ydhl").val()};
    var d13={"name":"云计算","value":$("#yjs").val()};
    var d14={"name":"物联网","value":$("#wlw").val()};
    var d15={"name":"智能制造","value":$("#znzz").val()};
    baseInfo.push(d1);baseInfo.push(d2);baseInfo.push(d3);
    baseInfo.push(d4);baseInfo.push(d5);baseInfo.push(d6);
    baseInfo.push(d7);baseInfo.push(d8);baseInfo.push(d9);
    baseInfo.push(d10);baseInfo.push(d11);baseInfo.push(d12);
    baseInfo.push(d13);baseInfo.push(d14);baseInfo.push(d15);

    var loginNum=[];
    var da1={"loginType":"app","loginNum":$("#app").val()};
    var da2={"loginType":"pc","loginNum":$("#pc").val()};
    loginNum.push(da1);
    loginNum.push(da2);

    var data={
        baseInfo:baseInfo,
        loginNum:loginNum
    };
    var url="/updateSmartLearningStu";
    ajaxPost(data,url,function(res){
        if(res.code==0){
            alert("修改成功");
        }
    })


}