package com.group.flatline;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageAdapter extends PagerAdapter {
    Context mContext;

    ImageAdapter(Context context){
        this.mContext = context;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ImageView) object);
    }

    private final int[] sliderImageId = new int[]{
            R.drawable.quote1, R.drawable.quote2, R.drawable.quote3,R.drawable.quote4, R.drawable.quote5, R.drawable.quote6
    };

    @NonNull
    @Override
    public  Object instantiateItem(@NonNull ViewGroup container, int position){
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object){
        ((ViewPager) container).removeView((ImageView) object);
    }
    @Override
    public int getCount(){
        return sliderImageId.length;
    }
}

