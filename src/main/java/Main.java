import test.entity.A;
import w.init.BeanContainer;
import w.init.InitiationClazz;

public class Main {

    public static void main(String[] args) {
        new InitiationClazz("test");

        A a = (A) BeanContainer.getBean("test.entity.A");

        System.out.println("=============================");

        System.out.println(a.name);
        a.b.hello();
        //System.out.println(a.b);
    }
}
