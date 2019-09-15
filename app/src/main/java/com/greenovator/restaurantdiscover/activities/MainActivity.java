package com.greenovator.restaurantdiscover.activities;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.greenovator.restaurantdiscover.R;
import com.greenovator.restaurantdiscover.adapters.RestaurantAdapter;
import com.greenovator.restaurantdiscover.data.model.RestaurantModel;
import com.greenovator.restaurantdiscover.data.vos.Restaurant;
import com.greenovator.restaurantdiscover.delegate.RestaurantDeligate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends BaseActivity {
    private RestaurantDeligate deligate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final RestaurantAdapter adapter = new RestaurantAdapter(deligate);
        recyclerView.setAdapter(adapter);
        restaurantModel.getRestaurants(new RestaurantModel.GetRestaurantFromNetworkDeligate() {
            @Override
            public void onSuccess(List<Restaurant> restaurants) {
                adapter.setNewData(restaurants);
            }

            @Override
            public void onFailure(String errorMessage) {

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
