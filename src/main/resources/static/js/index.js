//顶部菜单栏跳转页面事件
function aClick(obj){
    var url=$(obj).attr("data-url");
    $.ajax({
        url:url,
        type:"get",
        dataType:"text",
        success:function (res) {
            $("#content_body").html(res);
        }
    })
}
function load(){
    $.ajax({
        url:"page/consolePage/console.html",
        type:"get",
        dataType:"text",
        success:function(res){
            $("#content_body").html(res);
        }
    })
}