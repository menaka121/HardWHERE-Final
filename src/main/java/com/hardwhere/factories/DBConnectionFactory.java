package com.hardwhere.factories;

import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by menaka on 11/4/15.
 */
public class DBConnectionFactory {

    private int count;

    public MongoClient createConnection() throws UnknownHostException {
        synchronized (this){
            count++;
        }
        System.out.println("Connection established!");
        return new MongoClient("localhost", 27017);
    }

}
