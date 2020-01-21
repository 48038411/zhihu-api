package cn.soft1841.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 描述:
 * 收藏夹实体类
 *
 * @author：Guorc
 * @create 2020-01-20 10:08
 */
@Data
@Builder
public class Favorite {
    private Integer id;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Integer followers;
    private Integer totalCount;
    private String questionTitle;
    private String answerAuthorName;
    private String answerContent;
    private String voteupCount;
    private String commentCount;
}
