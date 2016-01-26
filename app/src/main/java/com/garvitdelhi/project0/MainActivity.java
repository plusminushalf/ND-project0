package com.garvitdelhi.project0;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view) {
        Context context = getApplicationContext();
        String text = "This button will open ";
        int duration = Toast.LENGTH_SHORT;
        switch(view.getId()) {
            case R.id.button:
                text += "Spotify Streamer";
                break;
            case R.id.button2:
                text += "Football Scores";
                break;
            case R.id.button3:
                text += "Library";
                break;
            case R.id.button4:
                text += "Build It Bigger";
                break;
            case R.id.button5:
                text += "XYZ Reader";
                break;
            case R.id.button6:
                text += "Capstone";
                break;
        }
        text += " App!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
