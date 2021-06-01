package service;

import pojo.User;

/**
 * @author Florence
 */
public interface UserService {
    /**
     * 添加用户
     * @param user 用户对象
     * @return
     */
    boolean addUser(User user);

    /**
     *
     * @param user 用户对象
     * @return 是否成功
     */
    boolean deleteUser(User user);

    /**
     *
     * @param user 用户对象
     * @return 是否成功
     */
    boolean editUser(User user);

    /**
     *
     * @param user 用户对象
     * @return 是否成功
     */
    User getUser(User user);
}
