package ca.kgb.helloworldv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
    }
    public void doMagic2(View view) {
        System.out.println("Hello world!!");

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
