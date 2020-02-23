$(function () {

    /*模态框隐藏*/
    $("#information").hide();
    $("#watch_other").hide();



    /*点击按钮移出模态框*/
    function closeModel(close,error,id) {
        let closemodel=document.getElementById(close);
        let errormodel=document.getElementById(error);
        closemodel.onclick=errormodel.onclick=function () {
            $(id).hide();
        };
    }
    var joursecretary=new Vue({
        el:"#jourSecretary",
        data:{
            /*初审稿件信息*/
            initialdata:"",

            /*作者名称*/
            authorName:"",

            /*文章标题*/
            articleTitle:"",

            /*关键字*/
            articleKeywords:"",

            /*文章摘要*/
            articleAbstract:"",

            /*提交的文章ID*/
            articleId:""
        },
        mounted:function (){
            this.query();
            $("#watch").click(function () {
                $("#watch_other").show();
            });
            /*点击按钮移出模态框*/
            //稿件信息
            closeModel("close","error","#information");
            //意见查看
            closeModel("close_wt","error_wt","#watch_other");

        },
        methods:{

            /*查询初审稿件*/
            query:function () {
                var self=this;
                $.ajax({
                    url:"/findinital",
                    type:'POST',
                    contentType: 'application/json',
                    traditional: true,
                    success:function (result) {

                        if(result.result){
                            self.initialdata=result.data;
                        }
                    }
                })
            },

            /*稿件详细数据*/
            detailinfo:function (data) {
                $("#information").show();
                var self=this;
                self.authorName=data.username;
                self.articleTitle=data.article_title;
                self.articleKeywords=data.article_keywords;
                self.articleAbstract=data.article_abstract;
            },

            /*撰写初审意见*/
            adviceforinit:function(data){
                var self=this;
                self.articleId=data.articleId;
            },

            /*提交初审意见*/
            initialsubmit:function () {
                var self=this;
                /*初审意见*/
                var advice=$("#advice").val();
                var ispass=$("input[name='optionsRadios']:checked").val();
                $.ajax({
                    url:"/initialAdvice",
                    type:'POST',
                    contentType: 'application/json',
                    traditional: true,
                    data:JSON.stringify({"advice":advice,"ispass":ispass,"articleId":self.articleId}),
                    success:function (result) {
                        if(result.result){
                            Swal.fire({
                                title:"成功！",
                                text:"提交成功",
                                type: "success",
                                cancelButtonText: '离开',
                            });
                        }
                    }
                })
            }
        }

    })


});