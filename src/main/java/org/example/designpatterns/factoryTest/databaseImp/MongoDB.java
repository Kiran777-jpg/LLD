package org.example.designpatterns.factoryTest.databaseImp;

import org.example.designpatterns.factoryTest.interfaces.Database;
import org.example.designpatterns.factoryTest.interfaces.Query;
import org.example.designpatterns.factoryTest.queryImp.MongoQuery;

public class MongoDB implements Database {
    @Override
    public Query createQuery() {
        return new MongoQuery();
    }
}
