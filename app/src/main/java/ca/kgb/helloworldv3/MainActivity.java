package ca.kgb.helloworldv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMagic(View view) {
        System.out.println("Hello world!!");

        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }
    public void doMagic1(View view) {
        System.out.println("Hello world!!");

        Intent intent = new Intent(this, FrameActivity.class);
        startActivity(intent);
    }
}
