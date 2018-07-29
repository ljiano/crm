package com.ljo.crm.dao;

import com.ljo.crm.pojo.Client;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:15
 * To change this template use File | Settings | File Templates.
 */
public interface IClientDao extends BaseDao<Client, Integer>{

    public List<Client> findClients();

    public List<Map> findClientsByParam(Map param);

    public List<Client> findUserClients(int oId, Map param);

}
