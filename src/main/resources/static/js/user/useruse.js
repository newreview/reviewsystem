$(function () {
    var useruse=new Vue({
        el:"#useruse",
        data:{
            article:{
                "airticle_author":"",
                "article_phone":"",
                "article_topic":"",
                "article_keywords":"",
                "article_field":"",
                "article_proxy":"",
                "article_abstract":""
            }
        },
        mounted:function () {

        },
        methods:{

            /*文章信息提交*/
            articleSubmit:function () {
                console.log("articlesubmit");
                var self=this;
                var article_author=$("#author").val();
                var article_phone=$("#phone").val();
                var article_topic=$("#topic").val();
                var article_keywords=$("#keywords").val();
                var article_field=$("#field_list option:selected").text();
                var article_proxy=$("input[name='proxy']:checked").val();
                var article_abstract=$("#abstract").val();

                console.log(article_field+","+article_proxy);
                $.ajax({
                    url:'/article/info',
                    type:'POST',
                    contentType: 'application/json',
                    traditional: true,
                    data:JSON.stringify({"article_author":article_author,"article_phone":article_phone,"article_topic":article_topic,"article_keywords":article_keywords,
                            "article_field":article_field,"article_proxy":article_proxy,"article_abstract":article_abstract}),
                    success:function (result) {
                        console.log(result);
                    }
                })
            }
        }
    });
});