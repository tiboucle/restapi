/*
 * Copyright (c) 2017 Adila All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package com.test.restapi.model;

import java.util.Date;

public abstract class Entity {
  private int fId;
  private Date fCreatedAt;
  private Date fModifiedAt;

  public Entity() {
  }

  public int getId() {
    return fId;
  }

  public Date getCreatedAt() {
    return fCreatedAt;
  }

  public Date getModifiedAt() {
    return fModifiedAt;
  }

  protected Entity setId(int aId) {
    fId = aId;
    return this;
  }

  protected Entity setModifiedAt(Date aModifiedAt) {
    fModifiedAt = aModifiedAt;
    return this;
  }

  protected Entity setCreatedAt(Date aCreatedAt) {
    fCreatedAt = aCreatedAt;
    return this;
  }
}
