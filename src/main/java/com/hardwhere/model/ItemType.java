package com.hardwhere.model;

/**
 * Created by menaka on 11/6/15.
 */
public enum ItemType {
    TILE{
        
         boolean item_Name = true;
         boolean item_Description = true;
         boolean item_Price = true;
         boolean item_Image = true;
         boolean item_Type = true;
         boolean item_Model = true;
         boolean item_Brand = true;
         boolean item_Size = true;
         boolean item_Thickness = true;
        
    },
    PAINT{
        boolean item_Name = true;
        boolean item_Description = true;
        boolean item_Price = true;
        boolean item_Image = true;
        boolean item_Type = true;
        boolean item_Model = true;
        boolean item_Brand = true;
        boolean item_Size = false;
        boolean item_Thickness = false;

    }
}
