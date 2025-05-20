package az.ingress.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Getter
public class A {
    private String message;

    public String print() {
        return message;
    }
}