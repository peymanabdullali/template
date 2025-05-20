package az.ingress.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {
    @Bean
    public A message1() {
        System.out.println("message 1 created");
        return new A("message1");

    }

    @Bean
    @Primary
    public A message2() {
        System.out.println("message 2 created");
        return new A("message2");
    }

}
