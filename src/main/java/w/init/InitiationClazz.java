package w.init;

import w.util.InstanceUtil;
import w.util.WiredUtil;

/**
 * Created by wxj on 2018/7/6.
 */
public class InitiationClazz {

    /**
     * 初始化类的构造函数
     * @return: void
     */
    public InitiationClazz(String rootPackageName) {
        //将扫描到的bean放入IOC容器
        InstanceUtil.instance(rootPackageName);
        //根据注解自动注入bean
        WiredUtil.autowiredBean();
    }

}
