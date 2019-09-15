package com.greenovator.restaurantdiscover.network.response;

import com.google.gson.annotations.SerializedName;
import com.greenovator.restaurantdiscover.data.vos.Restaurant;

import java.util.List;

public class RestaurantResponse {
    @SerializedName("message")
    private String message;
    @SerializedName("code")
    private int code;
    @SerializedName("data")
    private List<Restaurant> restaurantLists;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Restaurant> getRestaurantLists() {
        return restaurantLists;
    }

    public void setRestaurantLists(List<Restaurant> restaurantLists) {
        this.restaurantLists = restaurantLists;
    }
}
