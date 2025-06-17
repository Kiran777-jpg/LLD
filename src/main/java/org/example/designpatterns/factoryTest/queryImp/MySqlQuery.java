package org.example.designpatterns.factoryTest.queryImp;

import org.example.designpatterns.factoryTest.interfaces.Query;

public class MySqlQuery implements Query {
    @Override
    public void executeQuery() {
        System.out.println("Mysql query executed");
    }
}
