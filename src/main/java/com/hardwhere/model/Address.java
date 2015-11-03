package com.hardwhere.model;

/**
 * Created by menaka on 11/3/15.
 *
 * Consider address as a conceptual class
 *
 */
public class Address {

    private String line1;
    private String line2;
    private String line3;
    private String city;
    private String district;
    private String province;
    private String poastalCode;

    public Address(String line1,
                   String line2,
                   String line3,
                   String city,
                   String district,
                   String province,
                   String poastalCode){
        this.city = city;
        this.district = district;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.poastalCode = poastalCode;
        this.province = province;
    }



    @Override
    public String toString(){
        return this.line1+",\n"+
                this.line2+",\n"+
                this.line3+",\n"+
                this.city+",\n"+
                this.poastalCode+",\n"+
                this.province+",\n"+
                this.district;
    }

}
