package com.ndd.review.mapper;

import com.ndd.review.mapper.bean.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ndd
 * @version 2.x 稿件信息表（初审表）
 * @date 2020/2/21 14:25
 */
@Mapper
public interface ArticleInfoMapper {

    /*向数据库中插入数据*/
    public int insertArticleInfo(ArticleInfo articleInfo);
}
