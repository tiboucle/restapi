package com.test.restapi.validator;

import java.util.Date;
import java.util.List;

public class InvalidFieldResponse {
  private final Date fTimestamp;
  private final String fMessage;
  private final List<InvalidField> fList;

  public InvalidFieldResponse(Date aTimestamp, String aValidationMessage, List<InvalidField> aList) {
    fTimestamp = aTimestamp;
    fMessage = aValidationMessage;
    fList = aList;
  }

  public Date getTimestamp() {
    return fTimestamp;
  }

  public String getMessage() {
    return fMessage;
  }

  public List<InvalidField> getDetails() {
    return fList;
  }
}