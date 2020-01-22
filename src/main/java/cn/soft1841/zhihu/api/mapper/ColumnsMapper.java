package cn.soft1841.zhihu.api.mapper;

import cn.soft1841.zhihu.api.entity.Columns;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ColumnsMapper {
    /**
     * 根据关注数量查询四条数据
     * @return
     */
    @Select("SELECT * FROM t_columns ORDER BY followers DESC LIMIT 0,4")
    List<Columns> selectRencent();

    /**
     * 查询所有数据
     * @return
     */
    @Select("SELECT * FROM t_columns")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = Integer.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "description",column = "description",javaType = String.class),
            @Result(property = "url",column = "url",javaType = String.class),
            @Result(property = "imageUrl",column = "image_url",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "articlesCount",column = "articles_count",javaType = Integer.class)
    })
    List<Map> selectAll();
}
