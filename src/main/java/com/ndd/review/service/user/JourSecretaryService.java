package com.ndd.review.service.user;

import com.ndd.review.controller.bean.InitialInfo;
import com.ndd.review.mapper.ArticleInfoMapper;
import com.ndd.review.mapper.bean.ArticleInfo;
import com.ndd.review.mapstruct.ArticleInfo2Initial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ndd
 * @version 2.x 期刊秘书
 * @date 2020/2/21 19:00
 */
@Service
public class JourSecretaryService {

    @Autowired
    ArticleInfoMapper articleInfoMapper;

    /*查看初审稿件*/
    public List<InitialInfo> queryInitial(){
        List<ArticleInfo> list=articleInfoMapper.seleteArticleInfo();
        List<InitialInfo> initiallist=new ArrayList<>();
        for(ArticleInfo articleInfo:list){
            initiallist.add(ArticleInfo2Initial.ARTICLE_INFO_2_INITIAL.articleInfo2Initial(articleInfo));
        }
        return initiallist;
    }
}
