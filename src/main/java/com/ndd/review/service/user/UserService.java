package com.ndd.review.service.user;

import com.ndd.review.controller.bean.ArticleData;
import com.ndd.review.mapper.ArticlesStatusMapper;
import com.ndd.review.mapper.ArticleInfoMapper;
import com.ndd.review.mapper.LoginMapper;
import com.ndd.review.mapper.bean.ArticleStatus;
import com.ndd.review.mapper.bean.ArticleInfo;
import com.ndd.review.mapstruct.ArticleData2Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    @Autowired
    ArticlesStatusMapper articlesStatusMapper;
    @Autowired
    LoginMapper loginMapper;

    /*用户存入稿件信息*/
    public void insertArticle(ArticleData articleData,String userAccount){

        ArticleInfo articleInfo= ArticleData2Info.INSTANCE.articleData2Info(articleData);
        articleInfo.setArticleUserAccount(userAccount);
        /*生成随机ID*/
        String uuid= UUID.randomUUID().toString().replace("-","");
        System.out.println("生成的id为："+uuid);
        articleInfo.setArticleId(uuid);
        articleInfoMapper.insertArticleInfo(articleInfo);

        //向用户历史表（稿件状态表）中存入数据
        /*获取当前时间*/
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String date=format.format(new Date());
        ArticleStatus articleStatus =new ArticleStatus();
        articleStatus.setArticleId(uuid);
        articleStatus.setArticleTitle(articleData.getArticleTopic());
        articleStatus.setArticleStatus("初审阶段:"+date);
        articlesStatusMapper.insertArticleStatus(articleStatus);

        /*增加用户提交稿件字段信息*/
        //查找用户提交稿件ID信息
        String articleList=loginMapper.selectArticleIdByAccount(userAccount);
        String newlist=articleList+","+uuid;
        //更新数据库中用户送审稿件列表ID
        loginMapper.updateArticleListByAccount(userAccount,newlist);
    }
}
