package dao;

import pojo.Comment;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/6/1 22:18
 */
public interface CommentDao {

    List<Comment> getCommentByCardId(String cardId);

    Comment getCommentById(String id);

    int update(Comment comment);

    int delete(String id);

    /**
     * @return 主键
     */
    String add(Comment comment);
}
