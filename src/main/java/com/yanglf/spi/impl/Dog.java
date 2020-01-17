package com.yanglf.spi.impl;

import com.yanglf.spi.IAnimal;

/**
 * @author : yanglf
 * @version : 1.0
 * @created IntelliJ IDEA.
 * @date : 2020/1/17 11:39
 * @desc :
 */
public class Dog implements IAnimal {
    @Override
    public void shout() {
        System.out.println("汪汪~~~`");
    }

    @Override
    public void sleep() {
        System.out.println("小狗嘻嘻嘻~~·~");
    }
}
