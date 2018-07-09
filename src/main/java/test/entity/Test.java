package test.entity;

import w.annotation.WAutowired;
import w.init.InitiationClazz;

/**
 * Created by wxj on 2018/7/9.
 */
public class Test {

    @WAutowired
    static A a;

    public static void main(String[] args) {
        new InitiationClazz("test");
        a.a_do();
    }

}
