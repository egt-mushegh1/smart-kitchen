package am.smartkitchen.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"am.smartkitchen.common.*", "am.smartkitchen.rest.*"})
@EnableJpaRepositories(basePackages = {"am.smartkitchen.common.repository"})
@EntityScan({"am.smartkitchen.common.entity"})
@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

}
