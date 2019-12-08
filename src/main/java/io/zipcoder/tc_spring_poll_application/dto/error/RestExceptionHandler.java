package io.zipcoder.tc_spring_poll_application.dto.error;

import io.zipcoder.tc_spring_poll_application.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe, HttpServletRequest request) {
        ErrorDetail errorDetail = new ErrorDetail();
        errorDetail.setTitle("Resource Not Found Exception");
        errorDetail.setDetail("The id you are looking for does not exist");
        errorDetail.setDeveloperMessage("Fix it, dummy");
        errorDetail.setStatus(404);
        errorDetail.setTimeStamp(new Date().getTime());
        return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }
}
