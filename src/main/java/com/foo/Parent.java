package com.foo;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Reference;

/**
 * Created by cR on 1/8/21.
 */
@Entity("parents")
public class Parent extends SuperModel {
    @Reference
    public SuperModel referenceChild;

    @Override
    public String toString() {
        return "Parent{" +
                "referenceChild=" + referenceChild +
                '}';
    }
}
