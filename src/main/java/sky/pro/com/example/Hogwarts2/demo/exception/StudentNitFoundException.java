package sky.pro.com.example.Hogwarts2.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNitFoundException extends RuntimeException{
    public StudentNitFoundException(String message) {
        super(message);
    }

    public StudentNitFoundException(String message, Throwable cause) {
        super(message,cause);
    }

}
