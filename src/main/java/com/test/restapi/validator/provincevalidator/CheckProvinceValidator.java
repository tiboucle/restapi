package com.test.restapi.validator.provincevalidator;

import com.test.restapi.model.Province;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckProvinceValidator implements ConstraintValidator<CheckProvince, String> {
  private final Province[] fProvinces = Province.values();;
  private String fMessage;

  @Override
  public void initialize(CheckProvince aCheckProvince) {
    fMessage = aCheckProvince.message();
  }

  @Override
  public boolean isValid(String aObject, ConstraintValidatorContext aConstraintContext) {
    boolean isValid = false;
    for (Province province : fProvinces) {
      if (province.toString().equalsIgnoreCase(aObject)) {
        isValid = true;
      }
    }
    if ( !isValid ) {
      aConstraintContext.disableDefaultConstraintViolation();
      aConstraintContext.buildConstraintViolationWithTemplate(fMessage).addConstraintViolation();
    }
    return isValid;
  }
}
