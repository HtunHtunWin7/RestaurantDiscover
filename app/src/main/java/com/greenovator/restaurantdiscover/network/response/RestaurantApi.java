package com.greenovator.restaurantdiscover.network.response;

import com.greenovator.restaurantdiscover.utils.RestaurantConstants;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestaurantApi {

    @GET(RestaurantConstants.GET_RESPONSE)
    Call<RestaurantResponse> getAllRestaurants();

}
