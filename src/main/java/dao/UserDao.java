package dao;

import pojo.User;

import java.util.List;

/**
 * @author Florence
 */

public interface UserDao {
    /**
     * 获取所有用户
     * @return 用户列表
     */
    List<User> getAllUsers();

    boolean add(User user);

    int update(User user);

    int delete(String openId);

    User getUserById(String openId);
}
