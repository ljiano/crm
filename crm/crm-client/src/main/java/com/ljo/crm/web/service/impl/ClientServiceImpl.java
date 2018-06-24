package com.ljo.crm.web.service.impl;

import com.ljo.crm.dao.IClientDao;
import com.ljo.crm.pojo.Client;
import com.ljo.crm.util.StringUtil;
import com.ljo.crm.web.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/24
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    private IClientDao clientDao;

    @Override
    public Client findClientById(Integer id) {
        return clientDao.get(id);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveOrUpdateClient(Integer id, Map properties) {
        Client client = null;
        if(id != null){
            client = this.findClientById(id);
        }
        if(client == null){
            client = new Client();
        }
        client.setName(StringUtil.safeToString(properties.get("name"), null));
        //todo : set properties
        clientDao.saveOrUpdate(client);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Client> findClients() {
        return clientDao.findClients();
    }

    @Override
    public List<Map> findClientsByParam(Map param) {
        return null;
    }
}
