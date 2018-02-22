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
    Result<Record> result = fDSLContext.selectFrom(USER).fetch();
    List<User> res = new ArrayList<>();
    for (Record record : result) {
      if (record != null) {
        res.add(getUser(record));
      }
    }

    return res;
  }

  private User getUser(Record aRecord) {
    User user = new User();
    user
        .setFirstName(aRecord.get(USER.FIRST_NAME))
        .setId(aRecord.get(USER.ID));
    return user;
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
