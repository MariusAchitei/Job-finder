package ro.javatraining.jobfinder.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ro.javatraining.jobfinder.core.dto.ErrorDto;
import ro.javatraining.jobfinder.jobApplication.api.JobApplicationNotFound;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryNotFound;

import java.util.Optional;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler({JobCategoryNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorDto> handleJobCategoryNotFound(
            final JobCategoryNotFound jobCategoryNotFound
    ) {
        final var dtoOptional = Optional.of(
                ErrorDto.builder()
                        .message(jobCategoryNotFound.getMessage())
                        .errorCode("JC_ERR_01")
                        .build()
        );
        return ResponseEntity.of(dtoOptional);
    }

    @ExceptionHandler({JobApplicationNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorDto> handleJobApplicationNotFound(
            final JobApplicationNotFound jobApplicationNotFound
    ) {
        final var dtoOptional = Optional.of(
                ErrorDto.builder()
                        .message(jobApplicationNotFound.getMessage())
                        .errorCode("JA_ERR_01")
                        .build()
        );
        return ResponseEntity.of(dtoOptional);
    }
}
