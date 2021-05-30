package pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @author yohoyes
 * @date 2021/5/30 21:43
 */
@NoArgsConstructor
@Data
public class DetailDTO {
    /**
     * id : 1
     * content : guang jin pai is a google things
     * title : guang jin pai
     * time : 1533106010
     * seeCount : 101
     * seen : false
     * likeCount : 11
     * liked : false
     * user : {"unionId":"asdfasdk1341r32asfda","avatar":"/pages/2.png"}
     * comment : [{"unionId":"","nickName":"","time":1233445567,"content":"","likeCount":11,"liked":true}]
     */

    private Integer id;
    private String content;
    private String title;
    private Integer time;
    private Integer seeCount;
    private Boolean seen;
    private Integer likeCount;
    private Boolean liked;
    private UserDTO user;
    private List<CommentDTO> comment;
}
