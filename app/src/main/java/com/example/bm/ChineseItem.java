package com.example.bm;

public class ChineseItem {

    private int chinese_profile;
    private String chinese_info;
    private String chinese_phone;
    private String chinese_menu;

    public int getChineseProfile(){
        return chinese_profile;
    }

    public String getChineseInfo(){
        return chinese_info;
    }

    public String getChinesePhone(){
        return chinese_phone;
    }

    public String getChinesemenu(){
        return chinese_menu;
    }


    public ChineseItem(int chinese_profile, String chinese_info, String chinese_phone, String chinese_menu){
        this.chinese_profile = chinese_profile;
        this.chinese_info = chinese_info;
        this.chinese_phone = chinese_phone;
        this.chinese_menu = chinese_menu;
    }



}