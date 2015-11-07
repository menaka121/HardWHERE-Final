package com.hardwhere.factories;

import com.mongodb.MongoClient;

import java.io.IOException;
import java.net.UnknownHostException;

/**
 * Created by menaka on 11/4/15.
 */
public class DBConnectionFactory {

    private int count;

    private MongoClient client = null;
    public MongoClient createConnection() {
        synchronized (this){
            count++;
        }
        try {

            client = new MongoClient("localhost", 27017);
            System.out.println("Connection established!");

        } catch (UnknownHostException e) {
            System.out.println("Mongo client connection failed.");
            return null;
        }
        return client;
    }

}
