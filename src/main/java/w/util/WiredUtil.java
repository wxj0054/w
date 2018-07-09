package w.util;

import w.annotation.WAutowired;
import w.init.BeanContainer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by wxj on 2018/7/6.
 */
public class WiredUtil {

    /**
     * 将对应的bean注入标有@WAutowired注解的对象中
     * @return: void
     */
    public static void autowiredBean() {
        for (Object obj : BeanContainer.getAllBean()) {
            if (obj.getClass().isInterface()) {
                //如果是接口则不进一步操作
                continue;
            } else {
                for (Field field : obj.getClass().getDeclaredFields()) {
                    for (Annotation annotation : field.getDeclaredAnnotations()) {
                        if (annotation instanceof WAutowired) {
                            isWAutowired(obj, field);
                        }
                    }
                }
            }
        }
    }

    /**
     * 如果字段上的注解是isWAutowired
     * @param obj 对应的实例
     * @param field 对应的字段
     * @return: void
     */
    public static void isWAutowired(Object obj, Field field) {
        Class fieldType = field.getType();

        Object bean = BeanContainer.getBean(fieldType.getName());
        //强制赋值
        field.setAccessible(true);
        try {
            field.set(obj, bean);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
