package cn.soft1841.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;
/**
 * @author Grc
 * @description 实体类
 * @create 2020-01-15
 */
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
