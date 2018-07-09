package w.util;

import java.util.List;

/**
 * Created by wxj on 2018/7/6.
 */
public class PathUtil {

    /**
     * 获取当前项目名
     * @return: 项目名
     */
    public static String getProjectName() {
        return System.getProperty("user.dir").substring(System.getProperty("user.dir").lastIndexOf('\\')+1);
    }

    /**
     * 获取全类名
     * @Param: list 由含有 项目名+全类名 的字符串所组成的List
     * @return: void
     */
    public static void getQualifiedClazzName(List<String> list) {
        String projectName = getProjectName();
        for (int i=0; i<list.size(); i++) {
            String str = list.get(i);
            //如果运行的项目不是Maven项目则需要进一步处理
            if (str.indexOf(projectName) != -1) {
                list.set(i, str.substring(str.lastIndexOf(projectName)+projectName.length()+1));
            }
        }
    }

}
