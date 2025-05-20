package az.ingress.beans;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Primary
public class B {
    public A a;

    public B(@Qualifier("message2") A a) {
        System.out.println("B beani yaranmasi basladi");
        this.a = a;
    }

    @PostConstruct
    public void m() {
        System.out.println("b beani yarandi bitti");
    }

    public String print() {
        return a.getMessage();
    }
}
