package com.thingrem.adforest.helper;

import android.view.View;

import com.thingrem.adforest.modelsList.catSubCatlistModel;

public interface CatSubCatOnclicklinstener {
    void onItemClick(catSubCatlistModel item);

    void onItemTouch(catSubCatlistModel item);

    void addToFavClick(View v, String position);

}
