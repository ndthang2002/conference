package com.pluralsight.exception;

import org.jboss.jandex.ModuleInfo.ExportedPackageInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ApiExceptionHandler {
  
@ExceptionHandler(IndexOutOfBoundsException.class)
@ResponseStatus(value = HttpStatus.BAD_REQUEST)

public ErrorMessage TodoException(Exception ex , WebRequest request) {
  return new ErrorMessage(10100,"doi tuong ko ton tai");
}


@ExceptionHandler(Exception.class)
@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
public ErrorMessage handleAllException(Exception ex, WebRequest request) {
  return new ErrorMessage(10000,ex.getMessage());
  
  
}
}
