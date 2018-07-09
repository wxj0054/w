package w.init;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wxj on 2018/7/6.
 */
public class BeanContainer {

    //保存bean的容器类
    private static volatile Map<String, Object> container = new HashMap<>();

    /**
     * 设置bean
     * @Param: clazzName 对应的全类名
     * @Param: bean bean的实例
     * @return: void
     */
    public static void setBean(String clazzName, Object bean) {
        container.put(clazzName, bean);
    }

    /**
     * 获取bean
     * @Param: clazzName 对应的全类名
     * @return: bean的实例
     */
    public static Object getBean(String clazzName) {
        return container.get(clazzName);
    }

    /**
     * 以List的形式返回所有的bean
     * @return: 包含所有bean的List
     */
    public static List<Object> getAllBean() {
        List<Object> list = new ArrayList<>();
        container.forEach((clazzName, bean) -> list.add(bean));

        return list;
    }

}
