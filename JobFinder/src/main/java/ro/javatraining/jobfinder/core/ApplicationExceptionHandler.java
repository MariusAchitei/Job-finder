package ro.javatraining.jobfinder.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ro.javatraining.jobfinder.core.dto.ErrorDto;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryNotFound;

import java.util.Optional;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler({JobCategoryNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorDto> handleEventNotFound(
            final JobCategoryNotFound jobCategoryNotFound
    ) {
        final var dtoOptional = Optional.of(
                ErrorDto.builder()
                        .message(jobCategoryNotFound.getMessage())
                        .errorCode("EV_ERR_01")
                        .build()
        );
        return ResponseEntity.of(dtoOptional);
    }
}
