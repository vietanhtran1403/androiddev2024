package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
public class WeatherActivity extends AppCompatActivity {
    private static final String Tag = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        ForecastFragment forecastFragment = new ForecastFragment();
//
//        getSupportFragmentManager().beginTransaction().add(
//                R.id.main, forecastFragment).commit();
        setContentView(R.layout.activity_weather);

        Log.i(Tag, "Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "Start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "Resume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "Pause");
    }
}