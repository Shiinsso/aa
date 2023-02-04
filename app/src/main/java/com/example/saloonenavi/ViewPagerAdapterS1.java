package com.example.saloonenavi;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapterS1 extends FragmentStateAdapter {
    public ViewPagerAdapterS1(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle){
        super(fragmentManager, lifecycle);

    }
    @NonNull
    @Override
    public Fragment createFragment(int position){
        switch (position){
            case 0:
                return new FragmentServices();
            case 1:
                return new FragmentInformation();

        }
        return new FragmentServices();
    }
    @Override
    public int getItemCount(){
        return 2;
    }
}