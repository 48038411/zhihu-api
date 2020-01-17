package cn.soft1841.zhihu.api.controller;

import cn.soft1841.zhihu.api.common.Result;
import cn.soft1841.zhihu.api.service.TableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 * 圆桌部分的逻辑处理部分
 *
 * @author：Guorc
 * @create 2020-01-17 17:47
 */
@RestController
@RequestMapping(value = "api/roundtable")
public class TableController {
    @Resource
    private TableService tableService;
    @GetMapping
    public Result getAll(){
        return Result.success(tableService.selectAll());
    }
    @GetMapping(value = "/recent")
    public Result getRencent(){
        return Result.success(tableService.selectRencent());
    }
}
