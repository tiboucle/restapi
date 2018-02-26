package com.test.restapi.model;

import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User extends Entity {
  @Pattern(regexp = "[^A-Za-z]$", message = "First Name should alphabet")
  @Size(min = 2, max = 20, message = "First Name should between 2 to 20")
  private String fFirstName;
  @Pattern(regexp = "[^A-Za-z]$", message = "First Name should alphabet")
  @Size(min = 2, max = 20, message = "Last Name should between 2 to 20")
  private String fLastName;
  private Date fDateOfBirth;
  @Pattern(regexp = "[^A-Za-z]$", message = "First Name should alphabet")
  @Size(min = 5, max = 40, message = "Last Name should between 2 to 40")
  private String fStreetAddress;
  @Pattern(regexp = "[^A-Za-z]$", message = "First Name should alphabet")
  @Size(min = 2, max = 40, message = "Last Name should between 2 to 40")
  private String fCity;
  private String fProvince;
  @Pattern(regexp = "^$|[0-9]", message = "Telephone should number")
  @Size(min = 10, max = 12, message = "Last Name should between 2 to 20")
  private String fTelephone;
  @Email(message = "Email Address wrong")
  private String fEmail;

  public String getFirstName() {
    return fFirstName;
  }

  public String getLastName() {
    return fLastName;
  }

  public Date getDateOfBirth() {
    return fDateOfBirth;
  }

  public String getStreetAddress() {
    return fStreetAddress;
  }

  public String getCity() {
    return fCity;
  }

  public String getProvince() {
    return fProvince;
  }

  public String getTelephone() {
    return fTelephone;
  }

  public String getEmail() {
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

  protected User setEmail(String aEmail) {
    fEmail = aEmail;
    return this;
  }
}
