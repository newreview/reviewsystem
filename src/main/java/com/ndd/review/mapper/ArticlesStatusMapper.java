package com.ndd.review.mapper;

import com.ndd.review.mapper.bean.ArticleStatus;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ndd
 * @version 2.x
 * @date 2020/2/21 18:30
 */
@Mapper
public interface ArticlesStatusMapper {

    /*向用户历史表中插入数据*/
    public int insertArticleStatus(ArticleStatus articleStatus);
}
