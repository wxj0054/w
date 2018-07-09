package test.entity;

import w.annotation.WAutowired;

/**
 * Created by wxj on 2018/7/6.
 */
public class A {

    public String name = "a";

    @WAutowired
    public BInf b;

}
