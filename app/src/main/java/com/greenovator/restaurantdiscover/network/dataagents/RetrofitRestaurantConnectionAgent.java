package com.greenovator.restaurantdiscover.network.dataagents;

import com.greenovator.restaurantdiscover.data.model.RestaurantModel;
import com.greenovator.restaurantdiscover.data.vos.Restaurant;
import com.greenovator.restaurantdiscover.network.response.RestaurantApi;
import com.greenovator.restaurantdiscover.network.response.RestaurantResponse;
import com.greenovator.restaurantdiscover.utils.RestaurantConstants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitRestaurantConnectionAgent implements RestaurantDataAgent {
private RestaurantApi mRestaurantApi;
private static RetrofitRestaurantConnectionAgent objInstance;

    private RetrofitRestaurantConnectionAgent() {
        final OkHttpClient mHttppClient = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RestaurantConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(mHttppClient)
                .build();
        mRestaurantApi = retrofit.create(RestaurantApi.class);
    }

    public static RetrofitRestaurantConnectionAgent getObjInstance() {
        if (objInstance ==null)
            objInstance = new RetrofitRestaurantConnectionAgent();
        return objInstance;
    }

    @Override
    public void getRestaurants(final GetRestaurantFromNetworkDeligate deligate) {
        Call<RestaurantResponse> restaurantResponseCall = mRestaurantApi.getAllRestaurants();
        restaurantResponseCall.enqueue(new Callback<RestaurantResponse>() {
            @Override
            public void onResponse(Call<RestaurantResponse> call, Response<RestaurantResponse> response) {
                RestaurantResponse mresponse = response.body();
                deligate.onSuccess(mresponse.getRestaurantLists());
            }

            @Override
            public void onFailure(Call<RestaurantResponse> call, Throwable t) {
                deligate.onFailure(t.getLocalizedMessage());
            }
        });
    }
}
