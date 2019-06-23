$(function(){
    tab();
    echar();
})
function tab(){
    $('.tab-top li').click(function (e) { 
        e.preventDefault();
        console.log('123')
        var i = $(this).index();//下标第一种写法
        $(this).addClass('active').siblings().removeClass('active');
        $('.top-con .tab-box').eq(i).show().siblings().hide();
    });
}
function echar(){
    var seriesData2=[
        {
            name:"3月",
            value:85
        },
        {
            name:"4月",
            value:75
        },
        {
            name:"5月",
            value:78
        },
        {
            name:"6月",
            value:68
        },
        {
            name:"7月",
            value:75
        }
    ]
    lineEchars('lineChart1',seriesData2)
    lineEchars('lineChart2',seriesData2)
}