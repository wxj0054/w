package test.entity;

/**
 * Created by wxj on 2018/7/6.
 */
public class B implements BInf {

    int age = 11;

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
