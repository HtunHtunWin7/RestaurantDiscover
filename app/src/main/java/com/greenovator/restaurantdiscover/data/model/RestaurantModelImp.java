package com.greenovator.restaurantdiscover.data.model;

import android.content.Context;

import com.greenovator.restaurantdiscover.R;
import com.greenovator.restaurantdiscover.data.vos.Restaurant;
import com.greenovator.restaurantdiscover.network.dataagents.RestaurantDataAgent;
import com.greenovator.restaurantdiscover.utils.RestaurantConstants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantModelImp extends BaseModel implements RestaurantModel {
    private static RestaurantModelImp objInstance;
    private Map<Integer, Restaurant> restaurantDataResposistory;
    private Context context;

    RestaurantModelImp() {
        this.restaurantDataResposistory = new HashMap<>();
    }


    public static RestaurantModelImp getObjInstance() {

        if (objInstance == null)
            objInstance = new RestaurantModelImp();
            //throw new RuntimeException(RestaurantConstants.RESTAURANT_MODEL_NOT_INITIALIZE);
        return objInstance;
    }

    public static void initializeEventModel(Context context) {
        objInstance = new RestaurantModelImp();
    }

    @Override
    public void getRestaurants(final GetRestaurantFromNetworkDeligate deligate) {
        mDataAgent.getRestaurants(new RestaurantDataAgent.GetRestaurantFromNetworkDeligate() {
            @Override
            public void onSuccess(List<Restaurant> restaurants) {
                for (Restaurant restaurant: restaurants)
                    restaurantDataResposistory.put(restaurant.getId(),restaurant);
                deligate.onSuccess(restaurants);
            }

            @Override
            public void onFailure(String errorMessage) {
                deligate.onFailure(errorMessage);
            }
        });
    }
}
