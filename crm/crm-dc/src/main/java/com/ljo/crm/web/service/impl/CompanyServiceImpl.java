package com.ljo.crm.web.service.impl;

import com.ljo.crm.dao.ICompanyDao;
import com.ljo.crm.web.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/7/25
 * Time: 14:48
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private ICompanyDao companyDao;

    @Override
    public List<Map> findCompanys(Map map) {
        return companyDao.findCompanys(map);
    }

    @Override
    public Long findCountCompanys() {
        return companyDao.findCountCompanys();
    }
}
