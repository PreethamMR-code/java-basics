package com.in.google.register;

public class Registration {
    private String fName;
    private String lName;
    private String email;
    private String gender;
    private String dob;
    private String pwd;
    private String cpwd;


    public String getFname(){
        return fName;
    }
    public void setFname(String fName){
      this.fName = fName;
    }

    public String getLname(){
        return lName;
    }
    public void setLname(String lName){
        this.lName = lName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

    public String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }

    public String getCpwd(){
        return cpwd;
    }
    public void setCpwd(String cpwd){
        this.cpwd = cpwd;
    }


}
