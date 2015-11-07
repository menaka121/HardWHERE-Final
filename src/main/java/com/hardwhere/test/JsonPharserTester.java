package com.hardwhere.test;

import com.google.gson.Gson;
import com.hardwhere.factories.DBConnectionFactory;
import com.hardwhere.model.Address;
import com.hardwhere.model.Person;
import com.mongodb.*;
import com.mongodb.util.JSON;

import java.util.HashMap;

/**
 * Created by menaka on 11/4/15.
 */
public class JsonPharserTester {

    //create a new person object and parse to json and retrieve it.


    public static void main(String[] args) {

        Address ad = new Address("smanala", "galdola", "Kotapola", "kotapola", "", "", "");
        HashMap<String, String> pb = new HashMap<String, String>();
        pb.put("Land", "041510005");
        pb.put("Mobile", "0718851183");

        HashMap<String, String> pb2 = new HashMap<String, String>();
        pb2.put("Land", "0415100035");
        pb2.put("Mobile", "0718851183");
        Person p = new Person("sss", "j", "menaka@wso2.comsdkjfhdsfk", "143343432v", pb2, "menalka", "menadsadasdlka123", ad);
        Person p3 = new Person("Menak12a", "j", "menaka@sfdsf.com", "143343432v", pb, "menalka", "menalka123", ad);
        Person p9 = new Person("Menaka34", "j", "menaka@qwewq.com", "143343432v", pb2, "menalka", "menalka123", ad);
        Person p0 = new Person("Menaka232", "j", "menaka@qeqwe.com", "143343432v", pb2, "menalka", "menalka123", ad);


        //Converting the person object to a json string
        Gson gson = new Gson();
        String json = gson.toJson(p);

        System.out.println(json);

        System.out.println("==================================================");
        //Retrieve it back
        System.out.println("Getting data back");
        Person p2 = gson.fromJson(json, Person.class);


        System.out.println("Telephone numbers : Data structure = HashMap");
        System.out.println(p2.getTelephoneNumber());


        System.out.println("Mobile number only:");
        System.out.println(p2.getTelephoneNumber().get("Mobile"));


        System.out.println("Address: Address class ");
        System.out.println(p2.getAddress());

        try {
            MongoClient c = new DBConnectionFactory().createConnection();
            BasicDBObject object = (BasicDBObject) JSON.parse(json);

//            BasicDBObject obj = (BasicDBObject)JSON.parse(gson.toJson(emp));

            DB db = c.getDB("db");
            DBCollection col = db.getCollection("test");

            col.insert(object);
            col.insert((BasicDBObject)JSON.parse(gson.toJson(p)));
            col.insert((BasicDBObject)JSON.parse(gson.toJson(p9)));
            col.insert((BasicDBObject)JSON.parse(gson.toJson(p3)));
            col.insert((BasicDBObject)JSON.parse(gson.toJson(p0)));

//            col.insert((BasicDBObject)JSON.parse(gson.toJson(p0)));

            System.out.println("Collection inserted.");


            DBCollection coll = db.getCollection("test");
            BasicDBObject basicDBObject =new BasicDBObject();
            basicDBObject.put("firstName", "sss");
            basicDBObject.put("password", "menadsadasdlka123");
//            obj.put(basicDBObject);
//            obj.put();
            DBCursor cr = coll.find(basicDBObject);
            Person p4 = null;
            System.out.println(cr.hasNext());
            DBObject dbo = null;
            while(cr.hasNext()){
                dbo = cr.next();
                p4 = (new Gson()).fromJson(dbo.toString(), Person.class);
            }
            System.out.println(p4.getTelephoneNumber());


        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson g = new Gson();


    }
}
