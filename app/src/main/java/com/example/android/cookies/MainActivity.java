package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);
// Find a reference to the TextView in the layout. Change the text.
        displayMessage("I'm so full");
    }


    // TODO: Find a reference to the TextView in the layout. Change the text.

    private void displayMessage(String message) {
        TextView status_text_view = (TextView) findViewById(R.id.status_text_view);
        status_text_view.setText(message);
    }

}