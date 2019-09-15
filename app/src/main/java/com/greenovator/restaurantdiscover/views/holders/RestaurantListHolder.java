package com.greenovator.restaurantdiscover.views.holders;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.greenovator.restaurantdiscover.R;
import com.greenovator.restaurantdiscover.delegate.RestaurantDeligate;

public class RestaurantListHolder extends BaseViewHolder {
    private Button btn_home,btn_sent,btn_details;
    private ImageView img_restaurant;
    private TextView txt_restaurant_name, txt_restaurant_description;

private RestaurantDeligate restaurantDeligate;
    public RestaurantListHolder(@NonNull View itemView, RestaurantDeligate deligate) {
        super(itemView);
        restaurantDeligate = deligate;
       /* btn_home = itemView.findViewById(R.id.btn_home);
        btn_sent = itemView.findViewById(R.id.btn_sent);*/
        btn_details = itemView.findViewById(R.id.btn_details);
        img_restaurant = itemView.findViewById(R.id.img_restaurant);
        txt_restaurant_description = itemView.findViewById(R.id.txt_restaurant_description);
        txt_restaurant_name = itemView.findViewById(R.id.txt_restaurant_name);

    }

    @Override
    public void bindData(Object data) {

    }
}
