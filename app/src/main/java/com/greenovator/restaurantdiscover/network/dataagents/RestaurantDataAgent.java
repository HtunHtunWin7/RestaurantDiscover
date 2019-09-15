package com.greenovator.restaurantdiscover.network.dataagents;

import com.greenovator.restaurantdiscover.data.model.RestaurantModel;
import com.greenovator.restaurantdiscover.data.vos.Restaurant;

import java.util.List;

public interface RestaurantDataAgent {
    void getRestaurants(GetRestaurantFromNetworkDeligate deligate);

    interface GetRestaurantFromNetworkDeligate {
        void onSuccess(List<Restaurant> restaurants);

        void onFailure(String errorMessage);
    }
}
