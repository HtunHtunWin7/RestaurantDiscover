package com.greenovator.restaurantdiscover.data.model;

import android.content.Context;

import com.greenovator.restaurantdiscover.network.dataagents.RestaurantDataAgent;
import com.greenovator.restaurantdiscover.network.dataagents.RetrofitRestaurantConnectionAgent;

public abstract class BaseModel {
protected RestaurantDataAgent mDataAgent;
    BaseModel(){
        mDataAgent = RetrofitRestaurantConnectionAgent.getObjInstance();
    }
}
