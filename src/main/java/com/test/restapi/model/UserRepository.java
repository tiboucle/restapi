package com.test.restapi.model;

import com.test.restapi.Tables;
import com.test.restapi.tables.UserTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends AbstractRepository<Integer, User> {
  @Autowired
  private DSLContext fDSLContext;
  private final UserTable USER = Tables.T_USER;

  public Collection<User> findAll() {
    return null;
  }

  public User findById(int aId) {
    return null;
  }

  public User insert(User aUser) {
    return null;
  }

  public User update(User aUser) {
    return null;
  }

  public User delete(User aUser) {
    return null;
  }
}
