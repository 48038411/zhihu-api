package cn.soft1841.zhihu.api.mapper;

import cn.soft1841.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Grc
 */
public interface SpecialMapper {
    /**
     * 查询最新数据
     * @return
     */
    @Select("SELECT * FROM t_special ORDER BY updated DESC LIMIT 0,4")
    List<Special> selectRecent();
    @Select("SELECT * FROM t_special")
    @Results({
            @Result(id = true, property = "specialId",column = "special_id",javaType = String.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "introduction",column = "introduction",javaType = String.class),
            @Result(property = "banner",column = "banner",javaType = String.class),
            @Result(property = "viewCount",column = "view_count",javaType = Integer.class),
            @Result(property = "followersCount",column = "followers_count",javaType = Integer.class),
            @Result(property = "updated",column = "updated",javaType = Date.class),
            //section类似视图，非数据库字段，many注解为多方引用，引用该包中的方法查询该column
            @Result(property = "section",column = "special_id",
                    many = @Many(select = "cn.soft1841.zhihu.api.mapper.SectionMapper.getSectionsBySpecialId")),
    })
    List<Map> selectAll();
}
