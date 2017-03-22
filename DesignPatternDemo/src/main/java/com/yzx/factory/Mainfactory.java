package com.yzx.factory;

/**
 * Created by laino on 2017/3/22.
 */

public class Mainfactory {
    public static void main(String[] args) {
        IGFFactory yunNanGFFactory = new YunNanGFFactory();
        BaseGF yunNanGF = yunNanGFFactory.createGF();
        yunNanGF.eatFood();
        yunNanGF.shopping();

        IGFFactory siChuanGFFactory = new SiChuanGFFactory();
        BaseGF siChuanGF = siChuanGFFactory.createGF();
        siChuanGF.eatFood();
        siChuanGF.shopping();
    }
}
