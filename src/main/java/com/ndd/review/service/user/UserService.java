package com.ndd.review.service.user;

import com.ndd.review.controller.bean.ArticleData;
import com.ndd.review.mapper.ArticleInfoMapper;
import com.ndd.review.mapper.bean.ArticleInfo;
import com.ndd.review.mapstruct.ArticleData2Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author ndd
 * @version 2.x
 * @date 2020/2/21 14:11
 */
@Service
public class UserService {
    @Autowired
    ArticleInfoMapper articleInfoMapper;

    /*用户存入稿件信息*/
    public void insertArticle(ArticleData articleData,String userAccount){

        ArticleInfo articleInfo= ArticleData2Info.INSTANCE.articleData2Info(articleData);
        articleInfo.setArticleUserAccount(userAccount);
        /*生成随机ID*/
        String uuid= UUID.randomUUID().toString().replace("-","");
        System.out.println("生成的id为："+uuid);
        articleInfo.setArticleId(uuid);
        articleInfoMapper.insertArticleInfo(articleInfo);
    }
}
