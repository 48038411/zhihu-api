package cn.soft1841.zhihu.api.mapper;

import cn.soft1841.zhihu.api.entity.RoundTable;
import cn.soft1841.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Guorc
 * @createTime 2020 01-17
 */
public interface TableMapper {
    /**
     * 查询最新数据
     * @return
     */
    @Select("SELECT * FROM t_round_table  LIMIT 0,4")
    List<RoundTable> selectRecent();
    /**
     * 查询所有圆桌
     * @return
     */
    @Select("SELECT * FROM t_round_table")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = Integer.class),
            @Result(property = "name",column = "name",javaType = String.class),
            @Result(property = "banner",column = "banner",javaType = String.class),
            @Result(property = "urlToken",column = "url_token",javaType = String.class),
            @Result(property = "visitsCount",column = "visits_count",javaType = Integer.class),
            @Result(property = "includeCount",column = "include_count",javaType = Integer.class)
    })
    List<Map> selectAll();
}
