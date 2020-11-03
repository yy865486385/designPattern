package com.demo.factory.impl;

import com.demo.factory.IdbFactory;
import com.demo.table.department.IDepartment;
import com.demo.table.department.impl.SqlserverDepartment;
import com.demo.table.user.IUser;
import com.demo.table.user.impl.SqlserverUser;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-11-03
 */
public class SqlServerFactory implements IdbFactory {

    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
