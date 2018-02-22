package com.test.restapi.controller;

import com.test.restapi.model.User;
import com.test.restapi.service.UserService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
  @Autowired
  private UserService fUserService;

  @RequestMapping(method = RequestMethod.GET)
  public Collection<User> findAll() {
    return fUserService.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public User findById(@PathVariable("id") int id) {
    return fUserService.findById(id);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public User insert(@RequestBody User aUser) {
    return fUserService.insert(aUser);
  }

  @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  public User update(@RequestBody User aUser) {
    return fUserService.update(aUser);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public User delete(@PathVariable int aId) {
    User user = fUserService.findById(aId);
    return fUserService.delete(user);
  }
}
