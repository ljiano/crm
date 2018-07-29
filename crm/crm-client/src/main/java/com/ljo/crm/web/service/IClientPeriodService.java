package com.ljo.crm.web.service;

import com.ljo.crm.pojo.Client;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:17
 * To change this template use File | Settings | File Templates.
 */
public interface IClientPeriodService {

    public Integer saveClientPeriod(int cId, int periodNo);

    public Integer saveClientPeriod(Client client, int periodNo);

    public List<Map> listClientPeriods(Integer oId);
}
