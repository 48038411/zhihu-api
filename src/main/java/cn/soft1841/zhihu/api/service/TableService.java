package cn.soft1841.zhihu.api.service;

import cn.soft1841.zhihu.api.entity.RoundTable;

import java.util.List;
import java.util.Map;

public interface TableService {
    /**
     * 查询所有圆桌
     * @return
     */
    List<Map> selectAll();

    /**
     * 查询最近四条数据
     * @return
     */
    List<RoundTable> selectRencent();
}
