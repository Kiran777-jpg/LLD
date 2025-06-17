package org.example.designpatterns.factoryTest;

import org.example.designpatterns.factoryTest.databaseImp.MongoDB;
import org.example.designpatterns.factoryTest.databaseImp.MySqlDB;
import org.example.designpatterns.factoryTest.interfaces.Database;
import org.example.designpatterns.factoryTest.interfaces.Query;

public class Client {
    public static void main(String[] args) {
        Database db = new MongoDB();
        Query q = db.createQuery();
        q.executeQuery();
    }
}
