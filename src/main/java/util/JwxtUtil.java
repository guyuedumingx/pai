package util;

import pojo.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yohoyes
 * @date 2021/6/1 22:39
 */
public class JwxtUtil {
    private static String preUrl = "http://jwxt.gduf.edu.cn/app.do?";

    public static User complementUser(User user) {
        String xh = user.getMarkNumber();
        String pwd = user.getPassword();
        login(xh,pwd);
        return null;
    }

    public static String login(String xh, String pwd) {
        Map<String, String> map = new HashMap<>();
        map.put("method", "authUser");
        map.put("xh", xh);
        map.put("pwd", pwd);
        String s = HttpUtil.doGet(preUrl, map);
        System.out.println(s);
        return null;
    }
}
