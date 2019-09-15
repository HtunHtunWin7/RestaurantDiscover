package com.greenovator.restaurantdiscover.data.vos;

import com.google.gson.annotations.SerializedName;

public class Menu {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String menu_name;
    @SerializedName("price")
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
