package com.test.restapi.model;

import com.test.restapi.Tables;
import com.test.restapi.tables.UserTable;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
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
    List<User> users = new ArrayList<>();
    for (Record record : result) {
      users.add(getEntity(record));
    }
    return users;
  }

  public User findById(int aId) {
    Record record = fDSLContext.selectFrom(USER).where(USER.ID.eq(aId)).fetchOne();
    return getEntity(record);
  }

  public User insert(User aUser) {
    Record record = createRecord(aUser, false);
    fDSLContext.insertInto(USER).set(record).execute();
    return aUser;
  }

  public User update(User aUser) {
    Record record = createRecord(aUser, true);
    fDSLContext.update(USER).set(record).where(USER.ID.eq(aUser.getId())).execute();
    return aUser;
  }

  public User delete(User aUser) {
    fDSLContext.delete(USER).where(USER.ID.eq(aUser.getId())).execute();
    return aUser;
  }

  private User getEntity(Record aRecord) {
    User user = new User();
    user
        .setFirstName(aRecord.get(USER.FIRST_NAME))
        .setLastName(aRecord.get(USER.LAST_NAME))
        .setDateOfBirth(aRecord.get(USER.DATE_OF_BIRTH) == null ? null : aRecord.get(USER.DATE_OF_BIRTH))
        .setStreetAddress(aRecord.get(USER.STREET_ADDRESS))
        .setCity(aRecord.get(USER.CITY))
        .setProvince(aRecord.get(USER.PROVINCE))
        .setTelephone(aRecord.get(USER.TELEPHONE))
        .setEmail(aRecord.get(USER.EMAIL))
        .setId(aRecord.get(USER.ID))
        .setModifiedAt(aRecord.get(USER.MODIFIED_AT) == null ? null : Date.from(aRecord.get(USER.MODIFIED_AT).toInstant()));

    return user;
  }


  private Record createRecord(User aUser, boolean aUpdate) {
    Record record = USER.newRecord();
    record.set(USER.FIRST_NAME, aUser.getFirstName());
    record.set(USER.LAST_NAME, aUser.getLastName());
    record.set(USER.DATE_OF_BIRTH, new Date(aUser.getDateOfBirth().getTime()));
    record.set(USER.STREET_ADDRESS, aUser.getStreetAddress());
    record.set(USER.CITY, aUser.getCity());
    record.set(USER.PROVINCE, aUser.getProvince());
    record.set(USER.TELEPHONE, aUser.getTelephone());
    record.set(USER.EMAIL, aUser.getEmail());
    if (aUpdate) {
      record.set(USER.MODIFIED_AT, Timestamp.from(Instant.now()));
    }

    return record;
  }
}
