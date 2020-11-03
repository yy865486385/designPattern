package com.demo.table.user;

import com.demo.entity.User;

/**
 * 访问数据库User的抽象接口
 *
 * @author Yu_Yang
 * @date 2020-11-03
 */
public interface IUser {

    User getUserById(String id);

    void insertUser(User user);

}
