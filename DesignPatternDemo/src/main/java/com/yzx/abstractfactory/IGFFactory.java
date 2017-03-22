package com.yzx.abstractfactory;

/**
 * Created by laino on 2017/3/22.
 */

public interface IGFFactory {
    YunNanGF createGF();

    IGFFather createGFFather();
}
