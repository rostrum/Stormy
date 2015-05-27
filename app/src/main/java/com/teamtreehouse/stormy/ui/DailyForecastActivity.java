package com.teamtreehouse.stormy.ui;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import com.teamtreehouse.stormy.R;
import com.teamtreehouse.stormy.adapters.DayAdapter;
import com.teamtreehouse.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daly_forecast);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }

}
