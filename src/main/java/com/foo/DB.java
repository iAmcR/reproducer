package com.foo;

import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;

/**
 * Created by cR on 1/8/21.
 */
public class DB {
    public static Datastore datastore = Morphia.createDatastore(MongoClients.create(), "reproducer-db");

    static {
        datastore.getMapper().map(Parent.class, MyEntity.class);
    }

}
