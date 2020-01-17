package cn.soft1841.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 描述:
 * 圆桌讨论实体类
 *
 * @author：Guorc
 * @create 2020-01-17 17:30
 */
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;

}
