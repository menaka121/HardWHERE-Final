package com.hardwhere.factories;

import com.hardwhere.model.Address;
import com.hardwhere.model.Person;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created by menaka on 11/4/15.
 *
 * Factory class for creating a person.
 *
 */
public class CreatePersonFactory {


    public Person createPerson(HttpServletRequest request){
        Address address = new Address(
                request.getParameter("line1"),
                request.getParameter("line2"),
                request.getParameter("line3"),
                request.getParameter("city"),
                request.getParameter("district"),
                request.getParameter("province"),
                request.getParameter("poastalCode"));

        HashMap<String, String> tp = new HashMap<String, String>();

        tp.put("Mobile", request.getParameter("mobile"));
        tp.put("Land", request.getParameter("land"));
        tp.put("Fax", request.getParameter("fax"));

        Person person = new Person(
                request.getParameter("firstName"),
                request.getParameter("lastName"),
                request.getParameter("email"),
                request.getParameter("nic"),
                tp,
                request.getParameter("userName"),
                request.getParameter("password"),
                address
                );
        return person;
    }

}
