package com.greenovator.restaurantdiscover;

import android.app.Application;

import com.greenovator.restaurantdiscover.data.model.RestaurantModelImp;

public class RestaurantApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //RestaurantModelImp.initializeEventModel(getApplicationContext());
    }
}
