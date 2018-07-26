package com.ljo.crm.web.service;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/7/25
 * Time: 14:48
 * To change this template use File | Settings | File Templates.
 */
public interface ICompanyService {

    public List<Map> findCompanys(Map map);

    public Long findCountCompanys();
}
