package com.yzx.abstractfactory;

/**
 * Created by laino on 2017/3/22.
 */

public class YunNanGFFactory implements IGFFactory {
    @Override
    public YunNanGF createGF() {
        return new YunNanGF();
    }

    @Override
    public IGFFather createGFFather() {
        return new YunNanGFFather();
    }
}
