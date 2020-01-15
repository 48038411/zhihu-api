package cn.soft1841.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
/**
 * @author Grc
 * @description 实体类
 * @create 2020-01-15
 */
@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}
