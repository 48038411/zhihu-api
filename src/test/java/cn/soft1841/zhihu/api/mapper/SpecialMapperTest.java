package cn.soft1841.zhihu.api.mapper;

import cn.soft1841.zhihu.api.ZhihuApiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class SpecialMapperTest {
@Resource SpecialMapper mapper;
    @Test
    void selectRecent() {
    }

    @Test
    void selectAll() {
        List<Map> special = mapper.selectAll();
        special.forEach(System.out::println);
    }
}