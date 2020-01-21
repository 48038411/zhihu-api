package cn.soft1841.zhihu.api.service;

import cn.soft1841.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

public interface FavoriteService {
    /**
     * 获取最近数据
     * @return
     */
    List<Favorite> getRencent();

    /**
     * 获得全部数据
     * @return
     */
    List<Map> getAll();
}
