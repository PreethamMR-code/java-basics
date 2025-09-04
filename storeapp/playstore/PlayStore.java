package com.xworkz.storeapp.playstore;

import com.xworkz.storeapp.addapp.AddApplication;
import com.xworkz.storeapp.valid.AppValidator;

public class PlayStore {


    AddApplication addApplication;

    public boolean isApplicationValid(AddApplication addApplication) {

        AppValidator appValidator = new AppValidator();
        boolean isValid = false;

        isValid = appValidator.isApplicationCreated(addApplication);
        if (isValid) {
            appValidator.displayDetails();
        }


        return isValid;
    }


}
