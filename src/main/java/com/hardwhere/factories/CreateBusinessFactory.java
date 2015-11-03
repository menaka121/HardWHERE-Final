package com.hardwhere.factories;

import com.hardwhere.model.Business;

/**
 * Created by menaka on 11/4/15.
 *
 * Factory class for creating a business
 */
public class CreateBusinessFactory {

    public Business createBusiness(){
        return new Business();
    }

}
