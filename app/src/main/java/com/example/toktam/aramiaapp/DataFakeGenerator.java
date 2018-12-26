package com.example.toktam.aramiaapp;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class DataFakeGenerator {
    public static List<DataItem> getData(Context context){
        List<DataItem> dataItemlist = new ArrayList<>();
        for (int i=1 ; i<=6 ; i++ )
        {
            DataItem dataItem = new DataItem();
            dataItem.setId(i);
            dataItem.setTitle("عنوان موضوع");
            switch (i)
            {
                case 1:
                    dataItem.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic, null));
                    break;
                case 2:
                    dataItem.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_brian_crain, null));
                    break;
                case 3:
                    dataItem.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_ghesehaye_shab, null));
                    break;
                case 4:
                    dataItem.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_khab, null));
                    break;
                case 5:
                    dataItem.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_man_o, null));
                    break;
                case 6:
                    dataItem.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic, null));
                    break;


            }//switch
            dataItemlist.add(dataItem);

        }//for

        return dataItemlist;
    }
}
