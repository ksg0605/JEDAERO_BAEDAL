package com.example.bm;

public class SnackBarItem {

    private int snackbar_profile;
    private String snackbar_info;
    private String snackbar_phone;
    private String snackbar_menu;

    public int getSnackBarProfile(){
        return snackbar_profile;
    }

    public String getSnackBarInfo(){
        return snackbar_info;
    }

    public String getSnackBarPhone(){
        return snackbar_phone;
    }

    public String getSnackBarMenu(){
        return snackbar_menu;
    }

    public SnackBarItem(int snackbar_profile, String snackbar_info, String snackbar_phone, String snackbar_menu){
        this.snackbar_profile = snackbar_profile;
        this.snackbar_info = snackbar_info;
        this.snackbar_phone = snackbar_phone;
        this.snackbar_menu = snackbar_menu;
    }



}