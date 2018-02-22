package com.test.restapi.model;

import java.util.Date;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User extends Entity {
  private String fFirstName;
  private String fLastName;
  private Date fDateOfBirth;
  private String fStreetAddress;
  private String fCity;
  private String fProvince;
  private String fTelephone;
  private String fEmail;

  protected String getFirstName() {
    return fFirstName;
  }

  protected String getLastName() {
    return fLastName;
  }

  protected Date getDateOfBirth() {
    return fDateOfBirth;
  }

  protected String getStreetAddress() {
    return fStreetAddress;
  }

  protected String getCity() {
    return fCity;
  }

  protected String getProvince() {
    return fProvince;
  }

  protected String getTelephone() {
    return fTelephone;
  }

  protected String getEmail() {
    return fEmail;
  }

  protected User setFirstName(String aFirstName) {
    fFirstName = aFirstName;
    return this;
  }

  protected User setLastName(String aLastName) {
    fLastName = aLastName;
    return this;
  }

  protected User setDateOfBirth(Date aDateOfBirth) {
    fDateOfBirth = aDateOfBirth;
    return this;
  }

  protected User setStreetAddress(String aStreetAddress) {
    fStreetAddress = aStreetAddress;
    return this;
  }

  protected User setCity(String aCity) {
    fCity = aCity;
    return this;
  }

  protected User setProvince(String aProvince) {
    fProvince = aProvince;
    return this;
  }

  protected User setTelephone(String aTelephone) {
    fTelephone = aTelephone;
    return this;
  }
  void setEmail(String aEmail) {
    fEmail = aEmail;
  }
}
