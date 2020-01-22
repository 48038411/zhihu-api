package cn.soft1841.zhihu.api.service.impl;

import cn.soft1841.zhihu.api.entity.Columns;
import cn.soft1841.zhihu.api.mapper.ColumnsMapper;
import cn.soft1841.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 专栏的服务类
 *
 * @author：Guorc
 * @create 2020-01-22 17:06
 */
@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;
    @Override
    public List<Columns> getRencent() {
        return columnsMapper.selectRencent();
    }

    @Override
    public List<Map> getAll() {
        return columnsMapper.selectAll();
    }
}
