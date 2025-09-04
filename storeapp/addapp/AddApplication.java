package com.xworkz.storeapp.addapp;

public class AddApplication {

    private String appName;
    private String version;
    private String updatedOn;
    private String updateSize;
    private String offeredBy;
    private String releasedOn;


    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getAppName() {
        return appName;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    public String getVersion() {
        return version;
    }

    public void setUpdatedOn(String updatedOn){
        this.updatedOn=updatedOn;
    }
    public String getUpdatedOn(){
        return updatedOn;
    }

    public void setUpdateSize(String updateSize){

        this.updateSize=updateSize;
    }
    public String getUpdateSize(){
        return updateSize;
    }
    public void setOfferedBy(String offeredBy){
        this.offeredBy=offeredBy;
    }
    public String getOfferedBy(){
        return offeredBy;
    }

    public void setReleasedOn(String releasedOn) {
        this.releasedOn = releasedOn;
    }

    public String getReleasedOn() {
        return releasedOn;
    }
}

