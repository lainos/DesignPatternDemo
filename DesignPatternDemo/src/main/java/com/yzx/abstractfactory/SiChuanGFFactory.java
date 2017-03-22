package com.yzx.abstractfactory;

/**
 * Created by laino on 2017/3/22.
 */

public class SiChuanGFFactory implements IGFFactory {
    @Override
    public YunNanGF createGF() {
        return new SiChuanGF();
    }

    @Override
    public IGFFather createGFFather() {
        return new SiChuanGFFather();
    }
}
