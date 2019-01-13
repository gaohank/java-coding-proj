package cn.gaohank.program;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@EnableJpaRepositories("cn.gaohank.program.dao")
@SpringBootApplication
public class Application {

    @PostConstruct
    private void init() {
        log.info("starting scheduler");
    }

    @PreDestroy
    private void destroy() {
        log.info("shutdown scheduler");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
