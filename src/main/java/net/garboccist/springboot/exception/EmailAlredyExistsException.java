package net.garboccist.springboot.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAlredyExistsException extends RuntimeException{
    private String message;

    public EmailAlredyExistsException(String message) {
        super(message);
        this.message = message;
    }

}
