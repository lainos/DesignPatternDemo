package com.yzx.abstractfactory;

/**
 * Created by laino on 2017/3/22.
 */

public class MainAbstractFactory {
    public static void main(String[] args) {
        IGFFactory yunNanGFFactory = new YunNanGFFactory();
        YunNanGF yunNanGF = yunNanGFFactory.createGF();
        yunNanGF.eatFood();
        yunNanGF.shopping();

        IGFFather yunNanGFFather = yunNanGFFactory.createGFFather();
        yunNanGFFather.suggestionToGirl();

        IGFFactory siChuanGFFactory = new SiChuanGFFactory();
        YunNanGF siChuanGF = siChuanGFFactory.createGF();
        siChuanGF.eatFood();
        siChuanGF.shopping();

        IGFFather siChuanGFFather = siChuanGFFactory.createGFFather();
        siChuanGFFather.suggestionToGirl();
    }
}
