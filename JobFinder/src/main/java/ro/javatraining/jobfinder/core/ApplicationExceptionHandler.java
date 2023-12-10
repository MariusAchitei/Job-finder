//package ro.javatraining.jobfinder.core;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import java.util.Optional;
//
//@ControllerAdvice
//public class ApplicationExceptionHandler
//{
//    @ExceptionHandler({EventNotFound.class})
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public ResponseEntity<ErrorDto> handleEventNotFound(
//        final EventNotFound eventNotFound
//    ) {
//        final var dtoOptional = Optional.of(
//            ErrorDto.builder()
//                .message(eventNotFound.getMessage())
//                .errorCode("EV_ERR_01")
//                .build()
//        );
//
//        return ResponseEntity.of(dtoOptional);
//    }
//
//    @ExceptionHandler({TicketNotFound.class})
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public ResponseEntity<ErrorDto> handleTicketNotFound(
//        final TicketNotFound eventNotFound
//    ) {
//        final var dtoOptional = Optional.of(
//            ErrorDto.builder()
//                .message(eventNotFound.getMessage())
//                .errorCode("TI_ERR_01")
//                .build()
//        );
//
//        return ResponseEntity.of(dtoOptional);
//    }
//
//    @ExceptionHandler({AssociatedEventNotFound.class})
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<ErrorDto> handleAssociatedEventNotFound(
//        final AssociatedEventNotFound ex
//    ) {
//        final var dtoOptional = Optional.of(
//            ErrorDto.builder()
//                .message(ex.getMessage())
//                .errorCode("TI_ERR_02")
//                .build()
//        );
//
//        return ResponseEntity.of(dtoOptional);
//    }
//
//    @ExceptionHandler({EventNumberOfPlacesExceeded.class})
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<ErrorDto> handleEventNumberOfPlacesExceeded(
//        final EventNumberOfPlacesExceeded ex
//    ) {
//        final var dtoOptional = Optional.of(
//            ErrorDto.builder()
//                .message(ex.getMessage())
//                .errorCode("TI_ERR_03")
//                .build()
//        );
//
//        return ResponseEntity.of(dtoOptional);
//    }
//}
