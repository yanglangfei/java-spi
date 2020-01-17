package com.yanglf.spi.impl;

import com.yanglf.spi.IAnimal;

/**
 * @author : yanglf
 * @version : 1.0
 * @created IntelliJ IDEA.
 * @date : 2020/1/17 16:30
 * @desc :
 */
public class Human implements IAnimal {
    @Override
    public void shout() {
        System.out.println("叽哩哇啦~~~~~~~");
    }

    @Override
    public void sleep() {
        System.out.println("呼喽呼喽~~~~~~~~~~~");

    }
}
