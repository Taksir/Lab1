package com.example.lab1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1 = null;
    private Button button2 = null;
    private Button button3 = null;
    private TextView myTextView = null;
    private ImageView camImage = null;

    private boolean flag1 = true;
    private boolean flag2 = true;

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
////        Bitmap bmp = (Bitmap) data.getExtras().get("data");
////        camImage.setImageBitmap(bmp);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        myTextView = (TextView) findViewById(R.id.tv1);
        camImage = (ImageView) findViewById(R.id.iv1);
    }

    public void clickFirst(View view) {
        Log.v("clk1", "First button was clicked");
        if(flag1) {
            button1.setBackgroundResource(R.drawable.kick);
            button1.setTextColor(Color.RED);
        }
        else {
            button1.setBackgroundColor(Color.parseColor("#00FFFF"));
            button1.setTextColor(Color.BLACK);
        }
        flag1 = !flag1;
        if (flag1 == flag2){
            myTextView.setText("Same Image!");
            Toast.makeText(getBaseContext(),(String)"Same Image!",
                    Toast.LENGTH_SHORT).show();
        }
        else{
            myTextView.setText("Different Image!");
            Toast.makeText(getBaseContext(),(String)"Different Image!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void clickSecond(View view) {
        Log.v("clk2", "Second button was clicked");
        if(flag2) {
            button2.setBackgroundResource(R.drawable.kick);
            button2.setTextColor(Color.RED);
        }
        else{
            button2.setBackgroundColor(Color.parseColor("#00FFFF"));
            button2.setTextColor(Color.BLACK);
        }
        flag2 = !flag2;
        if (flag1 == flag2){
            myTextView.setText("Same Image!");
            Toast.makeText(getBaseContext(),(String)"Same Image!",
                    Toast.LENGTH_SHORT).show();
        }
        else{
            myTextView.setText("Different Image!");
            Toast.makeText(getBaseContext(),(String)"Different Image!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void clickThird(View view) {
        Log.v("clk3", "Snap button was clicked");
        Intent shutter = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        Log.v("debug1", "Camera will start now.");
//        startActivityForResult(shutter, 123);
//        onActivityResult(123, 234, shutter);
    }
}