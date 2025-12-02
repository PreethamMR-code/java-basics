package com.in.google;

import com.in.google.register.Registration;
import com.in.google.validation.GoogleValid;

public class GoogleRunner {
    public static void main(String[] args) {

        Registration reg = new Registration();


        reg.setFname("virat");
        reg.setLname("kohli");
        reg.setEmail("virat@gmail");
        reg.setGender("male");
        reg.setDob("10-10-1985");
        reg.setPwd("12345");
        reg.setCpwd("12345");

        GoogleValid val = new GoogleValid();

        boolean google = val.isUSerCreated(reg);
        System.out.println("user is created:" + google);

    if(google) {


        System.out.println("the first name is:" + reg.getFname());
        System.out.println("the last name is:" + reg.getLname());
        System.out.println("the email  is:" + reg.getEmail());
        System.out.println("the gender  is:" + reg.getGender());
        System.out.println("the dob is:" + reg.getDob());
        System.out.println("the password is:" + reg.getPwd());
        System.out.println("the confirmpassword is:" + reg.getCpwd());
    }
    else
    {
        System.out.println("result is not valid");
    }

    }

}
