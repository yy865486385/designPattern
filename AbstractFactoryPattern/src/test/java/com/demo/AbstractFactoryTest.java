package com.demo;

import com.demo.entity.Department;
import com.demo.entity.User;
import com.demo.factory.IdbFactory;
import com.demo.factory.impl.OracleFactory;
import com.demo.factory.impl.SqlServerFactory;
import com.demo.table.department.IDepartment;
import com.demo.table.user.IUser;
import org.junit.Test;

/**
 * 抽象工厂模式测试
 *
 * @author Yu_Yang
 * @date 2020-11-03
 */
public class AbstractFactoryTest {

    @Test
    public void test(){
//      IdbFactory idbFactory = new OracleFactory();
        IdbFactory idbFactory = new SqlServerFactory();// 只需要切换这2句就可以切换数据库访问。


        IUser user = idbFactory.createUser();
        IDepartment department = idbFactory.createDepartment();

        user.insertUser(new User());
        user.getUserById("id");
        department.insertDept(new Department());
        department.getDeptById("id");
    }
}
