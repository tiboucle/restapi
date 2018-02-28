package com.test.restapi.validator;

public class InvalidField {
  private String fMessage;

  public InvalidField(String aMessage) {
    fMessage = aMessage;
  }

  public String getMessage() {
    return fMessage;
  }
}
