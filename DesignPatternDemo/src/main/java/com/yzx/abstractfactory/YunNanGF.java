package com.yzx.abstractfactory;

import android.util.Log;

import com.yzx.factory.BaseGF;

/**
 * Created by laino on 2017/3/22.
 */

class YunNanGF extends BaseGF {
    @Override
    public void eatFood() {
        Log.i("YunNanGF", "Eat 牛干巴, 炸土豆, 小锅米线, 卤米线...");
    }
}
