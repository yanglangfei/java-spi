package com.yanglf.spi.impl;

import com.yanglf.spi.IAnimal;

/**
 * @author : yanglf
 * @version : 1.0
 * @created IntelliJ IDEA.
 * @date : 2020/1/17 12:38
 * @desc :
 */
public class Bird implements IAnimal {
    @Override
    public void shout() {
        System.out.println("叽叽喳喳~~~~");
    }

    @Override
    public void sleep() {
        System.out.println("小鸟噜噜~~·~");
    }
}
