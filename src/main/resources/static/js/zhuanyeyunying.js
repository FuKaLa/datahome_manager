
//修改提交
function update() {

    // alert($("#hbk").val())
    var baseInfo=[];
    var d1={"name":"合作院校","dataUndergraduate":$("#hbk").val(),"dataVocational":$("#hgz").val()};
    var d2={"name":"运营团队","dataUndergraduate":$("#ybk").val(),"dataVocational":$("#ygz").val()};
    var d3={"name":"支撑人员","dataUndergraduate":$("#zyf").val(),"dataVocational":$("#zsj").val(),"dataOther":$("#zss").val()};
    var d4={"name":"在校学生","dataUndergraduate":$("#zbk").val(),"dataVocational":$("#zgz").val()};
    var d5={"name":"就业总人数","dataOther":$("#jyzrs").val()};
    baseInfo.push(d1);baseInfo.push(d2);baseInfo.push(d3);
    baseInfo.push(d4);baseInfo.push(d5);

    var majorRate=[];
    var da1={"majorName":"通信","employmentRate":$("#ztx").val()};
    var da2={"majorName":"物联网","employmentRate":$("#zwlw").val()};
    var da3={"majorName":"移动互联","employmentRate":$("#zydhl").val()};
    var da4={"majorName":"云计算","employmentRate":$("#zyjs").val()};
    var da5={"majorName":"智能制造","employmentRate":$("#zznzz").val()};
    majorRate.push(da1);
    majorRate.push(da2);
    majorRate.push(da3);
    majorRate.push(da4);
    majorRate.push(da5);

    var backgroundNum=[];
    var dat1={"majorName":"通信","peopleNum":$("#gtx").val()};
    var dat2={"majorName":"物联网","peopleNum":$("#gwlw").val()};
    var dat3={"majorName":"移动互联","peopleNum":$("#gydhl").val()};
    var dat4={"majorName":"云计算","peopleNum":$("#gyjs").val()};
    var dat5={"majorName":"智能制造","peopleNum":$("#gznzz").val()};
    backgroundNum.push(dat1);
    backgroundNum.push(dat2);
    backgroundNum.push(dat3);
    backgroundNum.push(dat4);
    backgroundNum.push(dat5);
    var data={
        baseInfo:baseInfo,
        majorRate:majorRate,
        backgroundNum:backgroundNum
    };
    var url="/updateMajorOpration";
    ajaxPost(data,url,function(res){
        if(res.code==0){
            alert("修改成功");
        }
    })


}