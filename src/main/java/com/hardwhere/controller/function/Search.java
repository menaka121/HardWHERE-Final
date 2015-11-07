package com.hardwhere.controller.function;

import com.hardwhere.model.Item;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ehelepola on 07/11/2015.
 */
public class Search extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String item_Type=request.getParameter("item_Type");
        String itemModel=request.getParameter("itemModel");
        String itemBrand=request.getParameter("itemBrand");



    }
    public ArrayList<Item> getSearchResult(String item_Type,String itemModel,String itemBrand){

        return null;
    }
}
