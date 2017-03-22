package com.yzx.simplefactory;

/**
 * Created by laino on 2017/3/22.
 */

public class MainClass {
    public static void main(String[] args) {
        BaseGF siChuanGirl = GFFactory.createGF(GFType.SI_CHUAN);
        siChuanGirl.eatFood();
        siChuanGirl.shopping();

        BaseGF shanDongGirl = GFFactory.createGF(GFType.SHAN_DONG);
        shanDongGirl.eatFood();
        shanDongGirl.shopping();

        BaseGF heBeiGirl = GFFactory.createGF(GFType.HE_BEI);
        heBeiGirl.eatFood();
        heBeiGirl.shopping();
    }
}
