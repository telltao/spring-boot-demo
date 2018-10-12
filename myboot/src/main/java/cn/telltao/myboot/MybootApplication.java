package cn.telltao.myboot;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@ComponentScan(basePackages={
        "cn.telltao.myboot.controller",
        "cn.telltao.myboot.entity",
        "cn.telltao.myboot.mapper",
        "cn.telltao.myboot.service",
})
//使用此注解 输出日志  idea要装lombock插件  链接 https://blog.csdn.net/zhglance/article/details/54931430
@Slf4j
public class MybootApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MybootApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        log.info("***************************************************");
        log.info("*                                                 *");
        log.info("*            PortalApplication is success!        *");
        log.info("*                                                 *");
        log.info("***************************************************");
    }
}
