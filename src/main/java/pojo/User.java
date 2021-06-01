package pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yohoyes
 * @date 2021/5/30 21:50
 */
@NoArgsConstructor
@Data
public class User {
    /**
     * unionId : asdfasdk1341r32asfda
     * avatar : /pages/2.png
     * help: https://developers.weixin.qq.com/miniprogram/dev/api/open-api/user-info/UserInfo.html
     */
    private String openId;
    private String avatarUrl;
    private int gender;
    private String country;
    private String province;
    private String city;
    private String language;
    /**
     * 教务系统学号
     */
    private String markNumber;
    /**
     * 教务系统密码
     */
    private String password;
}