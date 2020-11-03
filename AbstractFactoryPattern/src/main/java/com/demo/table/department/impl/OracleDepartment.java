package com.demo.table.department.impl;

import com.demo.entity.Department;
import com.demo.table.department.IDepartment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户访问Oracle的Department
 *
 * @author Yu_Yang
 * @date 2020-11-03
 */
public class OracleDepartment implements IDepartment {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Department getDeptById(String id) {
        logger.info("根据ID获取Oracle中的部门。");
        return null;
    }

    @Override
    public void insertDept(Department department) {
        logger.info("向Oracle中添加部门。");
    }
}
