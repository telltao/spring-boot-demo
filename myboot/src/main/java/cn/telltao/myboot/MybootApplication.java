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
@Slf4j
public class MybootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybootApplication.class, args);
        log.info("***************************************************");
        log.info("*                                                 *");
        log.info("*            PortalApplication is success!        *");
        log.info("*                                                 *");
        log.info("*                                                 *");
        log.info("***************************************************");
    }
}
