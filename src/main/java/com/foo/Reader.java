package com.foo;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by cR on 1/7/21.
 */
public class Reader {
    public static void main(String[] args) {
        List<Parent> parents = DB.datastore.find(Parent.class)
        .iterator()
        .toList();
        Logger logger = Logger.getLogger(Reader.class.getName());
        logger.info(parents.toString());
    }
}
