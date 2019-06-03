package com.zonal.regionview;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Allocate a RegionView.
        final RegionView lRegionView = new RegionView(this);
        // Add some example items to drag.
        View v1 = new AnalogClock(this);
        ImageView v2 = new ImageView(this);
        v2.setImageResource(R.mipmap.ic_launcher);
        Button v3 = new Button(this);
        v3.setText("Click");
        v3.setOnClickListener(v -> {

        });

        lRegionView.addView(v1);
        lRegionView.addView(v2);

        v1.setX(100);
        v1.setY(200);

//        lRegionView.addView(new AnalogClock(this));
//        lRegionView.addView(new AnalogClock(this));
        // Assert that we only want to drag Views within the confines of the RegionView.
        lRegionView.setWrapContent(true);
        // Assert that after we've finished scaling a View, we want to stop being able to drag it until a new drag is started.
        lRegionView.setDropOnScale(true);
        // Look at the RegionView.
        this.setContentView(lRegionView);
    }

}
