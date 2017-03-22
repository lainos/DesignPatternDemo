package com.yzx.abstractfactory;

import android.util.Log;

/**
 * Created by laino on 2017/3/22.
 */

public class SiChuanGFFather implements IGFFather {
    @Override
    public void suggestionToGirl() {
        // 同意了
        Log.i("SiChuanGFFather", "Agree ...");
    }
}
