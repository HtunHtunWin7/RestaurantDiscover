package com.greenovator.restaurantdiscover.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.greenovator.restaurantdiscover.R;
import com.greenovator.restaurantdiscover.views.holders.BaseViewHolder;
import com.greenovator.restaurantdiscover.views.holders.RestaurantListHolder;
import com.greenovator.restaurantdiscover.delegate.RestaurantDeligate;

public class RestaurantAdapter extends BaseRecyclerAdapter {
    private RestaurantDeligate restaurantDeligate;

    public RestaurantAdapter(RestaurantDeligate deligate) {
        this.restaurantDeligate = deligate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_lists, parent, false);
        return new RestaurantListHolder(view, restaurantDeligate);
    }

}
