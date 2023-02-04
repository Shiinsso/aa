package com.example.saloonenavi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class SetDateS1 extends AppCompatActivity {

    private Button ConS1;

    Button LoS1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_date_s1);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.salon_alhibah_inside_6, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.salon_alhibah_inside_5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.salon_alhibah_inside_4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.salon_alhibah_inside_3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.salon_alhibah_inside_2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.salon_alhibah_inside_1, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        LoS1 = findViewById(R.id.LocationS1);

        LoS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://goo.gl/maps/gdYmbacGQhgMh9V4A");
            }
        });

        ConS1=findViewById(R.id.ConS1);
        ConS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SetDateS1.this, set_barber.class);
                startActivity(intent);
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}