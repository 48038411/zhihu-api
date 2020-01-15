package cn.soft1841.zhihu.api.service.impl;

import cn.soft1841.zhihu.api.entity.Special;
import cn.soft1841.zhihu.api.mapper.SpecialMapper;
import cn.soft1841.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * SpecialService的实现类
 *
 * @author：Guorc
 * @create 2020-01-15 11:27
 */
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpecialMapper specialMapper;

    @Override
    public List<Map> selectAll() {
        return specialMapper.selectAll();
    }

    @Override
    public List<Special> selectRencent() {
        return specialMapper.selectRecent();
    }
}
