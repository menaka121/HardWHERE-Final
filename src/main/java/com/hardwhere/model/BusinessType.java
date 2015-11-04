package com.hardwhere.model;

/**
 * Created by menaka on 11/4/15.
 */
public enum BusinessType {

    SHOP{
        /**
         * If the registered business is a shop, that is a hardware shop
         * */
    },
    SERVICE{

        /**
         * If registered as a service provider, that is a business which provides necessary services
         * Such as:
         *          Transport
         *          Draftsman
         *          etc
         * */

    },
    MATERIAL{

        /**
         * If the type is material, that means the business is a material supplying business.
         * ex:
         *      Sand
         *      Gravel
         *      Steal
         *      etc
         * */

    };

}
