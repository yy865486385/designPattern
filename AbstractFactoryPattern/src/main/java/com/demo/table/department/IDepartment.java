package com.demo.table.department;

import com.demo.entity.Department;
import com.demo.table.user.IUser;

/**
 * 访问数据库Department的抽象接口
 *
 * @author Yu_Yang
 * @date 2020-11-03
 */
public interface IDepartment {

    Department getDeptById(String id);

    void insertDept(Department department);
}
