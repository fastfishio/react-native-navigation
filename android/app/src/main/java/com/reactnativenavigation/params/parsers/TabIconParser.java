package com.reactnativenavigation.params.parsers;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.reactnativenavigation.react.ImageLoader;

class TabIconParser extends Parser {

    private Bundle params;

    TabIconParser(Bundle params) {
        this.params = params;
    }

    public Drawable parse(String key) {
        Drawable tabIcon = null;
        if (hasKey(params, key)) {
            tabIcon = ImageLoader.loadImage(params.getString(key));
        }
        return tabIcon;
    }
}
