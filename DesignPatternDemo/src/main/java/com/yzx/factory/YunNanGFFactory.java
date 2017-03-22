package com.yzx.factory;

/**
 * Created by laino on 2017/3/22.
 */

public class YunNanGFFactory implements IGFFactory {
    @Override
    public BaseGF createGF() {
        return new YunNanGF();
    }
}
