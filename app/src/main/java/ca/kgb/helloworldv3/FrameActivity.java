package ca.kgb.helloworldv3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by admin on 7/20/2016.
 */
public class FrameActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
    }

    public void doMagic3(View view) {
        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }
}
