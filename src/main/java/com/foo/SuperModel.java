package com.foo;

import dev.morphia.annotations.Id;
import org.bson.types.ObjectId;

/**
 * Created by cR on 1/7/21.
 */
public abstract class SuperModel {
    @Id
    public ObjectId id;
}
