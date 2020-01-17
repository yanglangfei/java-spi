package com.yanglf.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author : yanglf
 * @version : 1.0
 * @created IntelliJ IDEA.
 * @date : 2020/1/17 11:40
 * @desc :
 */
public class Main {

    public static void main(String []args){

        f1();
        f2();
    }

    private static void f2() {
        ServiceLoader<IAnimal> shouts = ServiceLoader.load(IAnimal.class);
        for (IAnimal animal : shouts) {
            animal.sleep();
        }
    }

    private static void f1() {
        ServiceLoader<IAnimal> shouts = ServiceLoader.load(IAnimal.class);
        for (IAnimal shout : shouts) {
            shout.shout();
        }
    }
}
