package com.demo.factory;

import com.demo.table.department.IDepartment;
import com.demo.table.user.IUser;

/**
 * 创建DB的抽象工厂接口
 *
 * @author Yu_Yang
 * @date 2020-11-03
 */
public interface IdbFactory {

    IUser createUser();

    IDepartment createDepartment();
}
