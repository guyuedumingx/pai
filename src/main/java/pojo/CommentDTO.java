package pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yohoyes
 * @date 2021/5/30 21:48
 */
@NoArgsConstructor
@Data
public class CommentDTO {
    /**
     * unionId :
     * nickName :
     * time : 1233445567
     * content :
     * likeCount : 11
     * liked : true
     */
    private User user;
    private Integer time;
    private String content;
    private Integer likeCount;
    private Boolean liked;
}
