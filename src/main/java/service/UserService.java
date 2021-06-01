package service;

import pojo.User;
import pojo.UserDTO;

/**
 * @author Florence
 */
public interface UserService {
    /**
     * 添加用户
     * @param user 用户对象
     * @return
     */
    boolean addUser(UserDTO user);

    /**
     *
     * @param user 用户对象
     * @return 是否成功
     */
    boolean deleteUser(UserDTO user);

    /**
     *
     * @param user 用户对象
     * @return 是否成功
     */
    boolean editUser(UserDTO user);

    /**
     *
     * @param user 用户对象
     * @return 是否成功
     */
    UserDTO getUser(UserDTO user);
}
