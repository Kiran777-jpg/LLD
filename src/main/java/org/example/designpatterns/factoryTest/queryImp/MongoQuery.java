package org.example.designpatterns.factoryTest.queryImp;

import org.example.designpatterns.factoryTest.interfaces.Query;

public class MongoQuery implements Query {
    @Override
    public void executeQuery() {
        System.out.println("Mongo query executed");
    }
}
