package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {
    private static final String WA = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i(WA, "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(WA, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(WA, "onResume called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(WA, "onPause called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(WA, "onStop called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(WA, "onDestroy called");
    }
}


