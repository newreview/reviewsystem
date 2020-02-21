package com.ndd.review.mapstruct;

import com.ndd.review.controller.bean.ArticleData;
import com.ndd.review.mapper.bean.ArticleInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


/**
 * @author ndd
 * @version 2.x
 * @date 2020/2/21 13:56
 */
@Mapper
public interface ArticleData2Info {

    ArticleData2Info INSTANCE= Mappers.getMapper(ArticleData2Info.class);

    @Mappings({
            /*文章代理*/
            @Mapping(source = "articleData.articleProxy",target = "articleAgent"),

            /*文章类型*/
            @Mapping(source = "articleData.articleField",target = "articleType")
    })
   ArticleInfo articleData2Info(ArticleData articleData);
}
