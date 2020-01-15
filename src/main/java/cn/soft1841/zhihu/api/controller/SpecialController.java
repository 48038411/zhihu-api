package cn.soft1841.zhihu.api.controller;

import cn.soft1841.zhihu.api.common.Result;
import cn.soft1841.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 * 专题相关的控制器
 *
 * @author：Guorc
 * @create 2020-01-15 11:29
 */
//只提供接口数据，不返回视图
@RestController
@RequestMapping(value = "api/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;

    @GetMapping
    public Result getRecent(){
        return Result.success(specialService.selectRencent());
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(specialService.selectAll());
    }
}
