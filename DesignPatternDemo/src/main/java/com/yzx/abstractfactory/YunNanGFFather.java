package com.yzx.abstractfactory;

import android.util.Log;

/**
 * Created by laino on 2017/3/22.
 */

public class YunNanGFFather implements IGFFather {
    @Override
    public void suggestionToGirl() {
        // 不发表意见...
        Log.i("YunNanGFFather", "Silence ...");
    }
}
