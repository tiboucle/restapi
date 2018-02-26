package com.test.restapi.controller.validation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class InvalidFieldHandler extends ResponseEntityExceptionHandler {

  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException aException, HttpHeaders headers, HttpStatus status, WebRequest request) {
    List<InvalidField> list = new ArrayList<>();
    for (ObjectError objectError : aException.getBindingResult().getAllErrors()) {
      list.add(new InvalidField(objectError.getDefaultMessage()));
    }

    InvalidFieldResponse invalidFieldResponse = new InvalidFieldResponse(new Date(), "Validation Failed", list);
    return new ResponseEntity<>(invalidFieldResponse, HttpStatus.BAD_REQUEST);
  }
}