/*
 * Copyright (c) 2017 Adila All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package com.test.restapi.model;

import java.time.Instant;

public abstract class Entity {
  private int fId;
  private Instant fCreatedAt;
  private Instant fModifiedAt;

  public Entity() {
  }

  public int getId() {
    return fId;
  }

  protected Entity setId(int aId) {
    fId = aId;
    return this;
  }

  protected Instant getCreatedAt() {
    return fCreatedAt;
  }

  protected Instant getModifiedAt() {
    return fModifiedAt;
  }

  protected Entity setModifiedAt(Instant aModifiedAt) {
    fModifiedAt = aModifiedAt;
    return this;
  }

  protected Entity setCreatedAt(Instant aCreatedAt) {
    fCreatedAt = aCreatedAt;
    return this;
  }
}
