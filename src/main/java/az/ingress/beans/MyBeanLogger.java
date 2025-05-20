package az.ingress.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class MyBeanLogger {

    public MyBeanLogger() {
        System.out.println("5. MyBeanLogger yaradıldı (Bean lifecycle başladı)");
    }

    @PostConstruct
    public void init() {
        System.out.println("6. @PostConstruct: MyBeanLogger konfiqurasiya edildi");
    }

    @Bean
    public MyBeanLogger test() {
        System.out.println("5. MyBeanLogger konfiqurasiya edildi");
        return new MyBeanLogger();
    }
}
