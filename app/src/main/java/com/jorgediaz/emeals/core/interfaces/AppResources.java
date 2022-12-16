package com.jorgediaz.emeals.core.interfaces;

public interface AppResources {

    String getString(int resId);

    String getString(int resId, Object... others);

    int getColor(int resId);

    int parseColor(String color);
}
