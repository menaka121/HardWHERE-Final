package com.hardwhere.factories;

import com.google.gson.Gson;
import com.hardwhere.controller.ConvertToJson;
import com.hardwhere.model.Business;
import com.hardwhere.model.Item;
import com.hardwhere.model.ItemType;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * Created by menaka on 11/4/15.
 *
 * Factory class for creating items.
 * Each type of item will have a separate method.
 *
 */
public class CreateItemFactory {

    public Item createItemFactory(HttpServletRequest request){

        Item item = new Item();
        item.setBusiness((Business)request.getSession().getAttribute("business"));
        item.setItemBrand(request.getParameter("itemBrand"));
        item.setItemDescription(request.getParameter("itemdescription"));
        item.setItemId(System.currentTimeMillis());
        item.setItemModel(request.getParameter("itemModel"));
        item.setItemImage(request.getParameter("itemImage"));
        item.setItemName(request.getParameter("itemName"));
        item.setItemPrice(request.getParameter("itemPrice"));
        item.setItemSize(request.getParameter("itemSize"));
        return item;
    }


    public boolean addToDB(Item item){
        DBConnectionFactory dbconn = new DBConnectionFactory();
        MongoClient client = dbconn.createConnection();
        BasicDBObject obj = (BasicDBObject) JSON.parse(new ConvertToJson().toJson(item));
        try{
            DB db = client.getDB("db");
            DBCollection coll = db.getCollection("items");
            coll.insert(obj);
            return true;
        }catch(Exception e){
            return false;
        }

        //convert the item class to json

    }



}
