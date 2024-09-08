package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {
    private static final String WA = "WeatherActivity";
    ForecastFragment forecastFragment = new ForecastFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportFragmentManager().beginTransaction().add(
                R.id.activity_weather, forecastFragment).commit();

        setContentView(R.layout.fragment_forecast);
        getSupportFragmentManager().beginTransaction().add(R.id.main1,forecastFragment).commit();
        Log.i(WA,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(WA, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(WA, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(WA, "onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(WA, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(WA, "onDestroy");
    }
}


