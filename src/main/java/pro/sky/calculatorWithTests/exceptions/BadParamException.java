package pro.sky.calculatorWithTests.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadParamException extends RuntimeException {
    public BadParamException(String message) {
        super(message);
    }
}
