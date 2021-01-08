package com.foo;

import dev.morphia.annotations.Entity;

@Entity("my_entities")
public class MyEntity extends SuperModel {


    public String str = "what's going on?";

    @Override
    public String toString() {
        return "MyEntity{" +
                "id=" + id +
                ", str='" + str + '\'' +
                '}';
    }
}
