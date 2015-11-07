package com.hardwhere.controller;

import com.google.gson.Gson;

/**
 * Created by menaka on 11/7/15.
 */
public class ConvertToJson {

    public String toJson(Object obj){
        Gson gson = new Gson();
        return gson.toJson(obj);

    }

}
