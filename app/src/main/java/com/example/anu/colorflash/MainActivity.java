package com.example.anu.colorflash;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button clickMeButton;
    private int[] colors;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.CYAN,Color.BLACK,Color.BLUE, Color.RED, Color.DKGRAY, Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.LTGRAY, Color.WHITE};
        final int colorLength = colors.length;
        windowView = findViewById(R.id.windowViewId);
        clickMeButton = (Button) findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int randomNum = r.nextInt(colorLength);
                windowView.setBackgroundColor(colors[randomNum]);
            }
        });

    }
}