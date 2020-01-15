package cn.soft1841.zhihu.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.soft1841.zhihu.api.mapper")
public class ZhihuApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuApiApplication.class, args);
    }

}
