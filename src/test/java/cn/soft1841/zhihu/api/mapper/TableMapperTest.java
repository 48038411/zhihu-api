package cn.soft1841.zhihu.api.mapper;

import cn.soft1841.zhihu.api.ZhihuApiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class TableMapperTest {
    @Resource
    private TableMapper mapper;
    @Test
    void selectAll() {
        List<Map> list = mapper.selectAll();
        list.forEach(System.out::println);
    }
}