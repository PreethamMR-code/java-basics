package com.xworkz.storeapp.valid;

import com.xworkz.storeapp.addapp.AddApplication;

public class AppValidator {

    AddApplication addApplication;

    public boolean isApplicationCreated(AddApplication addApplication) {

        this.addApplication = addApplication;

        boolean AppNameValid = false;
        boolean VersionValid= false;
        boolean updatedOnValid =false;
        boolean updateSizeValid =false;
        boolean offeredByValid =false;
        boolean releasedOnValid =false;


        boolean AppIsCreated = false;


        if (addApplication.getAppName() != null && !addApplication.getAppName().isEmpty()) {

            AppNameValid = true;
        } else {
            System.out.println("app name is not valid");
        }

        if(addApplication.getVersion() !=null && !addApplication.getVersion().isEmpty()){
            VersionValid =true;
        }
        else {
            System.out.println("version not valid");
        }
        if(addApplication.getUpdatedOn() !=null && !addApplication.getUpdatedOn().isEmpty()){
            updatedOnValid =true;
        }
        else {
            System.out.println("updated on  not valid");
        }

        if(addApplication.getUpdateSize() !=null && !addApplication.getUpdateSize().isEmpty()){
            updateSizeValid =true;
        }
        else {
            System.out.println("update size not valid");
        }
        if(addApplication.getOfferedBy() !=null && !addApplication.getOfferedBy().isEmpty()){
            offeredByValid =true;
        }
        else {
            System.out.println("offered by not valid");
        }
        if(addApplication.getReleasedOn() !=null && !addApplication.getReleasedOn().isEmpty()){
            releasedOnValid =true;
        }
        else {
            System.out.println("released not valid");
        }


        if (AppNameValid && VersionValid && updatedOnValid && updateSizeValid && offeredByValid && releasedOnValid) {
            AppIsCreated = true;
        }
        return AppIsCreated;
    }

    public void displayDetails() {
        System.out.println("the app name is:" + addApplication.getAppName());
        System.out.println("the app name is:" + addApplication.getVersion());
        System.out.println("the app name is:" + addApplication.getUpdatedOn());
        System.out.println("the app name is:" + addApplication.getUpdateSize());
        System.out.println("the app name is:" + addApplication.getOfferedBy());
        System.out.println("the app name is:" + addApplication.getReleasedOn());

    }
}

