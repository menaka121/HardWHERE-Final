package com.hardwhere.test;

import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * Created by Ehelepola on 06/11/2015.
 */
public class TestClass {


    public static void main(String[] args) throws UnknownHostException {

        MongoClient mongo = new MongoClient( "localhost" , 27017 );
        //Connect to database
        DB db = mongo.getDB("HardWHERE");

        //Update Database
        DBCollection collection = db.getCollection("items");

        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("item_Price", "2000");
        whereQuery.put("item_Model", "Tile");
        whereQuery.put("item_Size", "150x150");
        DBCursor cursor = collection.find(whereQuery);

        while(cursor.hasNext()) {

            BasicDBObject document = (BasicDBObject) cursor.next();
            System.out.println(document);
        }
    }
}
