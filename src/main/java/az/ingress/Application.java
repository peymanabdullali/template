package az.ingress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("1. JVM başladı → main() metodu işə düşdü");
        ConfigurableApplicationContext run = run(Application.class, args);
//        System.out.println(run.getApplicationStartup());
//        System.out.println(run.getBeanFactory());
//        System.out.println(run.getEnvironment());
//        System.out.println(run.getApplicationName());
//        System.out.println(run.getAutowireCapableBeanFactory());
//        System.out.println(run.getBeanDefinitionCount());
//        System.out.println(run.getClassLoader());
//        System.out.println(run.getId());
//        System.out.println(run.getDisplayName());
//        System.out.println("----------------------------");
//        for (String beanDefinitionName : run.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }
//        System.out.println("----------------------------");
//        System.out.println(run.getApplicationStartup());
//        run.close();
    }
    }
