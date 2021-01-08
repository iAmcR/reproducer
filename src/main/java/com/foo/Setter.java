package com.foo;

/**
 * Created by cR on 1/7/21.
 */
public class Setter {
    public static void main(String[] args) {
        MyEntity myEntity = new MyEntity();
        Parent parent = new Parent();
        parent.referenceChild = DB.datastore.save(myEntity);
        DB.datastore.save(parent);
    }
}
