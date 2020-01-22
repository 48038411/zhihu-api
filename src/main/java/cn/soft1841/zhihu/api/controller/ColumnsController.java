package cn.soft1841.zhihu.api.controller;

import cn.soft1841.zhihu.api.common.Result;
import cn.soft1841.zhihu.api.service.ColumnsService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 *
 * @author：Guorc
 * @create 2020-01-22 17:07
 */
@RestController
@RequestMapping(value = "/api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;
    @GetMapping
    public Result getRencent(){
        return Result.success(columnsService.getRencent());
    }
    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(columnsService.getAll());
    }
}
