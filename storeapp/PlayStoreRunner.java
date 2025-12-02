package com.xworkz.storeapp;

import com.xworkz.storeapp.addapp.AddApplication;
import com.xworkz.storeapp.playstore.PlayStore;

public class PlayStoreRunner {
    public static void main(String[] args) {
        AddApplication addApplication = new AddApplication();
        addApplication.setAppName("sdf");
        addApplication.setVersion("asd");
        addApplication.setUpdatedOn("1-1-2025");
        addApplication.setUpdateSize("200");
        addApplication.setOfferedBy("meta");
        addApplication.setReleasedOn("1-1-2024");

        PlayStore playStore = new PlayStore();
        playStore.isApplicationValid(addApplication);
    }
}
