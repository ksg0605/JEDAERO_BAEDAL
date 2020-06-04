package com.example.bm;

public class KoreanItem {

    private int korean_profile;
    private String korean_info;
    private String korean_phone;
    private String korean_menu;

    public int getKoreanProfile(){
        return korean_profile;
    }

    public String getKoreanInfo(){
        return korean_info;
    }

    public String getKoreanPhone(){
        return korean_phone;
    }

    public String getKoreanMenu(){ return korean_menu; }

    public KoreanItem(int korean_profile, String korean_info, String korean_phone, String korean_menu){
        this.korean_profile = korean_profile;
        this.korean_info = korean_info;
        this.korean_phone = korean_phone;
        this.korean_menu = korean_menu;
    }



}
