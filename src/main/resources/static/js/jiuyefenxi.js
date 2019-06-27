
//修改提交
function update() {

    alert($("#majorName").text());
    var name = $(".majorName").text();
    console.log(name)
    var graduateAbilitie = [];
    var d1={"ability":"技术能力","abilityValue":$("#v5").val(),"majorName":name,"type":"本科"};
    var d2={"ability":"执行力","abilityValue":$("#v6").val(),"majorName":name,"type":"本科"};
    var d3={"ability":"职业素质","abilityValue":$("#v7").val(),"majorName":name,"type":"本科"};
    var d4={"ability":"沟通能力","abilityValue":$("#v8").val(),"majorName":name,"type":"本科"};
    var d5={"ability":"学习能力","abilityValue":$("#v9").val(),"majorName":name,"type":"本科"};
    graduateAbilitie.push(d1);
    graduateAbilitie.push(d2);
    graduateAbilitie.push(d3);
    graduateAbilitie.push(d4);
    graduateAbilitie.push(d5);
    var d6={"ability":"技术能力","abilityValue":$("#v0").val(),"majorName":name,"type":"高职"};
    var d7={"ability":"执行力","abilityValue":$("#v1").val(),"majorName":name,"type":"高职"};
    var d8={"ability":"职业素质","abilityValue":$("#v2").val(),"majorName":name,"type":"高职"};
    var d9={"ability":"沟通能力","abilityValue":$("#v3").val(),"majorName":name,"type":"高职"};
    var d10={"ability":"学习能力","abilityValue":$("#v4").val(),"majorName":name,"type":"高职"};
    graduateAbilitie.push(d6);
    graduateAbilitie.push(d7);
    graduateAbilitie.push(d8);
    graduateAbilitie.push(d9);
    graduateAbilitie.push(d10);

    var employStructure = [];
    var da1={"structure":"协议就业","employment":$("#xyjy").val(),"majorName":name};
    var da2={"structure":"升学","employment":$("#sx").val(),"majorName":name};
    var da3={"structure":"灵活就业","employment":$("#lhjy").val(),"majorName":name};
    var da4={"structure":"出国（境）","employment":$("#cg").val(),"majorName":name};
    var da5={"structure":"毕业创业","employment":$("#bycy").val(),"majorName":name};
    var da6={"structure":"待就业","employment":$("#djy").val(),"majorName":name};
    employStructure.push(da1);
    employStructure.push(da2);
    employStructure.push(da3);
    employStructure.push(da4);
    employStructure.push(da5);
    employStructure.push(da6);

    var graduateSalarie = [];
    var dat1={"graduationDuration":1,"majorName":name,"averageSalary":$("#bj0").val(),"graduateSalary":$("#by0").val()};
    var dat2={"graduationDuration":2,"majorName":name,"averageSalary":$("#bj1").val(),"graduateSalary":$("#by1").val()};
    var dat3={"graduationDuration":3,"majorName":name,"averageSalary":$("#bj2").val(),"graduateSalary":$("#by2").val()};
    graduateSalarie.push(dat1);
    graduateSalarie.push(dat2);
    graduateSalarie.push(dat3);
    var data={
        majorName:$("#majorName").val(),
        undergraduateMale:$("#undergraduateMale").val(),
        undergraduateFemale:$("#undergraduateFemale").val(),
        vocationalMale:$("#vocationalMale").val(),
        vocationalFemale:$("#vocationalFemale").val(),
        graduateAbilitie:graduateAbilitie,
        employStructure:employStructure,
        graduateSalarie:graduateSalarie
    };
    var url="/updateEmployment";
    ajaxPost(data,url,function(res){
        if(res.code==0){
            alert("修改成功");
        }
    })


}
