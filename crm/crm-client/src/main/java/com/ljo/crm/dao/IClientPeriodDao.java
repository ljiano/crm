package com.ljo.crm.dao;

import com.ljo.crm.pojo.ClientPeriod;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:17
 * To change this template use File | Settings | File Templates.
 */
public interface IClientPeriodDao extends BaseDao<ClientPeriod, Integer> {

    public List<Map> findUserClientPeroids(int oId, Map param);
}
