package com.example.bm;

public class PizzaItem {

    private int pizza_profile;
    private String pizza_info;
    private String pizza_phone;
    private String pizza_menu;

    public int getPizzaProfile(){
        return pizza_profile;
    }

    public String getPizzaInfo(){
        return pizza_info;
    }

    public String getPizzaPhone(){
        return pizza_phone;
    }

    public String getPizzaMenu(){
        return pizza_menu;
    }

    public PizzaItem(int pizza_profile, String pizza_info, String pizza_phone, String pizza_menu){
        this.pizza_profile = pizza_profile;
        this.pizza_info = pizza_info;
        this.pizza_phone = pizza_phone;
        this.pizza_menu = pizza_menu;

    }



}
