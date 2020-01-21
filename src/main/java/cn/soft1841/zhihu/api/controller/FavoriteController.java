package cn.soft1841.zhihu.api.controller;

import cn.soft1841.zhihu.api.common.Result;
import cn.soft1841.zhihu.api.service.FavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 * 收藏夹服务控制器
 *
 * @author：Guorc
 * @create 2020-01-20 19:00
 */
@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteService favoriteService;
    @GetMapping
    public Result getRencent(){
        return Result.success(favoriteService.getRencent());
    }
    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(favoriteService.getAll());
    }
}
