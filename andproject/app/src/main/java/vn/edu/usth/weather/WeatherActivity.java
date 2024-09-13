package vn.edu.usth.weather;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class WeatherActivity extends AppCompatActivity {
    private static final String Tag = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ForecastFragment forecastFragment = new ForecastFragment();
//
//        getSupportFragmentManager().beginTransaction().add(
//                R.id.main, forecastFragment).commit();
        setContentView(R.layout.activity_main);

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
    @Override
    protected void onStop() {
        Log.i(Tag, "Stop");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "Destroy");
    }