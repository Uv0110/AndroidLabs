package com.example.urvesh.androidlabs;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {
    protected static final String ACTIVITY_NAME = "StartActivity";
    Button startbtn;
    Button startChat;
    Button weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Log.i(ACTIVITY_NAME,"In OnCreate()");
        startbtn = (Button) findViewById(R.id.button);
        startChat = findViewById(R.id.buttonChat);
        weather = findViewById(R.id.buttonWeather);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this,ListItemsActivity.class);
                startActivity(intent);
                startActivityForResult(intent,50);
            }
        });

        startChat.setOnClickListener(e->{
            Intent intent = new Intent(StartActivity.this,ChatWindow.class);
            startActivity(intent);
        });

        weather.setOnClickListener(e->{
            Intent intent = new Intent(StartActivity.this,WeatherForecast.class);
            startActivity(intent);
        });

    }



    protected void onActivityResult(int requestCode, int responseCode){
        if(requestCode == 50){
            Log.i(ACTIVITY_NAME, "Return to StartActivity.onActivityResult");
        }
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(ACTIVITY_NAME,"In OnResume()");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(ACTIVITY_NAME,"In OnStart()");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(ACTIVITY_NAME,"In OnPause()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(ACTIVITY_NAME,"In OnStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(ACTIVITY_NAME,"In OnDestroy()");
    }
}
