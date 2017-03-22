package com.yzx.factory;

import com.yzx.simplefactory.SiChuanGF;

/**
 * Created by laino on 2017/3/22.
 */

public class SiChuanGFFactory implements IGFFactory {
    @Override
    public BaseGF createGF() {
        return new SiChuanGF();
    }
}
