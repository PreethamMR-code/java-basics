package com.in.google.validation;

import com.in.google.register.Registration;

public class GoogleValid {

    Registration register;

    public boolean isUSerCreated(Registration register){

        boolean FnameValid =false;
        boolean LnameValid =false;
        boolean EmailValid = false;
        boolean GenderValid  =false;
        boolean dobValid = false;
        boolean pwdValid =false;
        boolean cpwdValid =false;


        boolean UserIsCreated= false;


        if(register.getFname() != null){
            FnameValid = true;
        }
        else
        {
            System.out.println("fname is not valid");
        }

        if(register.getLname() != null){
            LnameValid = true;
        }
        else
        {
            System.out.println("fname is not valid");
        }

        if(register.getEmail() != null){
            EmailValid = true;
        }
        else
        {
            System.out.println("email is not valid");
        }

        if(register.getGender() != null){
            GenderValid = true;
        }
        else
        {
            System.out.println("Gender is not valid");
        }

        if(register.getFname() != null){
            FnameValid = true;
        }
        else
        {
            System.out.println("fname is not valid");
        }

        if(register.getDob() != null){
            dobValid = true;
        }
        else
        {
            System.out.println("the dob is not valid");
        }

        if(register.getPwd() != null){
            pwdValid = true;
        }
        else
        {
            System.out.println("the pwd is not valid");
        }

        if(register.getCpwd() != null){
            cpwdValid = true;
        }
        else
        {
            System.out.println("the cpwd is not valid");
        }



        if(FnameValid && LnameValid && EmailValid  && GenderValid && dobValid && pwdValid && cpwdValid){
            UserIsCreated =true;
            this.register=register;
        }
        return UserIsCreated;
    }


}
