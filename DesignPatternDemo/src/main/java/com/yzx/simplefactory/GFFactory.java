package com.yzx.simplefactory;

/**
 * Created by laino on 2017/3/22.
 */

public class GFFactory {
    public static BaseGF createGF(GFType gFType) {
        switch (gFType) {
            case SI_CHUAN:
                return new SiChuanGF();
            case SHAN_DONG:
                return new ShanDongGF();
            default:
            case HE_BEI:
                return new HeBeiGF();
        }
    }
}
