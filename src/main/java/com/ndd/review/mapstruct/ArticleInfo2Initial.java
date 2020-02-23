package com.ndd.review.mapstruct;

import com.ndd.review.controller.bean.InitialInfo;
import com.ndd.review.mapper.bean.ArticleInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author ndd
 * @version 2.x 文章信息转化为标准初审信息返回给期刊秘书
 * @date 2020/2/21 19:07
 */
@Mapper
public interface ArticleInfo2Initial {

    ArticleInfo2Initial ARTICLE_INFO_2_INITIAL= Mappers.getMapper(ArticleInfo2Initial.class);


    @Mapping(source = "articleAuthor",target = "username")

    @Mapping(source = "articleType",target = "aricleField")

    InitialInfo articleInfo2Initial(ArticleInfo articleInfo);
}
