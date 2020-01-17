package cn.soft1841.zhihu.api.service.impl;

import cn.soft1841.zhihu.api.entity.RoundTable;
import cn.soft1841.zhihu.api.mapper.TableMapper;
import cn.soft1841.zhihu.api.service.TableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 圆桌部分实现类
 *
 * @author：Guorc
 * @create 2020-01-17 17:46
 */
@Service
public class TableServiceImpl implements TableService {
    @Resource
    private TableMapper mapper;
    @Override
    public List<Map> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public List<RoundTable> selectRencent() {
        return mapper.selectRecent();
    }
}
