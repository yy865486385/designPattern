package com.demo.factory.impl;

import com.demo.factory.IdbFactory;
import com.demo.table.department.IDepartment;
import com.demo.table.department.impl.OracleDepartment;
import com.demo.table.user.IUser;
import com.demo.table.user.impl.OracleUser;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-11-03
 */
public class OracleFactory implements IdbFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
}
