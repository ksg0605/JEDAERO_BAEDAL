package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenItem {

    private int chicken_profile;
    private String chicken_info;
    private String chicken_phone;
    private String chicken_menu;

    public int getChickenProfile(){ return  chicken_profile; }

    public String getChickenInfo(){ return chicken_info; }

    public String getChickenPhone(){
        return chicken_phone;
    }

    public String getChickenMenu() { return chicken_menu; }

    public ChickenItem(int chicken_profile, String chicken_info, String chicken_phone, String chicken_menu){
        this.chicken_profile = chicken_profile;
        this.chicken_info = chicken_info;
        this.chicken_phone = chicken_phone;
        this.chicken_menu = chicken_menu;
    }



}
