package com.demo.table.user.impl;

import com.demo.entity.User;
import com.demo.table.user.IUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户访问Sqlserver的user
 *
 * @author Yu_Yang
 * @date 2020-11-03
 */
public class SqlserverUser implements IUser {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public User getUserById(String id) {
        logger.info("根据ID获取Sqlserver的用户。");
        return null;
    }

    @Override
    public void insertUser(User user) {
        logger.info("向sqlserver中添加一个用户。");
    }
}
