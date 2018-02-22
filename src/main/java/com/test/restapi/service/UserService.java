package com.test.restapi.service;

import com.test.restapi.model.User;
import com.test.restapi.model.UserRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private UserRepository fUserRepository;

  public Collection<User> findAll() {
    return fUserRepository.findAll();
  }

  public User findById(int aId) {
    return fUserRepository.findById(aId);
  }

  public User insert(User aUser) {
    return fUserRepository.insert(aUser);
  }

  public User update(User aUser) {
    return fUserRepository.update(aUser);
  }

  public User delete(User aUser) {
    return fUserRepository.delete(aUser);
  }
}
