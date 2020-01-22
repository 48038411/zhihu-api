package cn.soft1841.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 描述:
 * 专栏实体类
 *
 * @author：Guorc
 * @create 2020-01-22 16:56
 */
@Data
@Builder
public class Columns {
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;
}
