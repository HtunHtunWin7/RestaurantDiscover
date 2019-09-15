package com.greenovator.restaurantdiscover.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.greenovator.restaurantdiscover.data.model.RestaurantModelImp;

public class BaseActivity extends AppCompatActivity {
    protected RestaurantModelImp restaurantModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        restaurantModel = RestaurantModelImp.getObjInstance();
    }
}
