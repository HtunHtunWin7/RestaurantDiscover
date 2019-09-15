package com.greenovator.restaurantdiscover.data.model;

import com.greenovator.restaurantdiscover.data.vos.Restaurant;

import java.util.List;

public interface RestaurantModel {
    void getRestaurants(GetRestaurantFromNetworkDeligate deligate);

    interface GetRestaurantFromNetworkDeligate{
        void onSuccess(List<Restaurant> restaurants);
        void onFailure(String errorMessage);
    }
}