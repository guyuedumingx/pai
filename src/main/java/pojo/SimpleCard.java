package pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/5/30 21:49
 */
@NoArgsConstructor
@Data
public class SimpleCard {
    /**
     * id : 1
     * content : guang jin pai is a google things
     * title : guang jin pai
     * seeCount : 101
     * user : {"unionId":"asdfasdk1341r32asfda","avatar":"/pages/2.png"}
     * images : [""]
     */

    private Integer id;
    private String content;
    private String title;
    private Integer seeCount;
    private User user;
    private String image;
}
