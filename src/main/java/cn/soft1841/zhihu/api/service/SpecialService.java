package cn.soft1841.zhihu.api.service;

import cn.soft1841.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @author Guorc
 */
public interface SpecialService {
    /**
     * 查询所有专题
     * @return
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     * @return
     */
    List<Special> selectRencent();
}
