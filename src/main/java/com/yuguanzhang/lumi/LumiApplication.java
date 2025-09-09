package com.yuguanzhang.lumi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@EnableJpaAuditing //자동 createAt 설정하려고 추가했음
public class LumiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LumiApplication.class, args);
    }

}
