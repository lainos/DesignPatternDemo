package com.yzx.buildpattern;

/**
 * Build 模式的demo
 * Created by laino on 2017/3/22.
 */

public class BuildPattern {

    // Build 模式的使用
    public BuildPattern() {
        Computer computer = new Computer.Builder()
                .setCpu("Intel Core i7")
                .setMotherboard("GIGABYTE Z97")
                .setDisplayCard("GTX Titan")
                .setRam("32G")
                .setDisk("2TB")
                .setPower("1000W")
                .create();
    }


}
