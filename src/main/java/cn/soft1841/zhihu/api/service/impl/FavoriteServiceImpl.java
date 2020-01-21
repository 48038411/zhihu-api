package cn.soft1841.zhihu.api.service.impl;

import cn.soft1841.zhihu.api.entity.Favorite;
import cn.soft1841.zhihu.api.mapper.FavoriteMapper;
import cn.soft1841.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 收藏夹服务实现类
 *
 * @author：Guorc
 * @create 2020-01-20 18:59
 */
@Service
public class FavoriteServiceImpl implements FavoriteService{
    @Resource
    private FavoriteMapper favoriteMapper;

    @Override
    public List<Favorite> getRencent() {
        return favoriteMapper.selectRencent();
    }

    @Override
    public List<Map> getAll() {
        return favoriteMapper.selectAll();
    }
}
