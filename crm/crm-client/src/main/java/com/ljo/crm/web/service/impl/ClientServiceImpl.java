package com.ljo.crm.web.service.impl;

import com.ljo.crm.dao.IClientDao;
import com.ljo.crm.dao.IClientPeriodDao;
import com.ljo.crm.enums.PeriodEnum;
import com.ljo.crm.enums.VaildEnum;
import com.ljo.crm.pojo.Client;
import com.ljo.crm.pojo.ClientPeriod;
import com.ljo.crm.util.StringUtil;
import com.ljo.crm.web.service.IClientPeriodService;
import com.ljo.crm.web.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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
@Transactional(readOnly = true)
public class ClientServiceImpl implements IClientService{

    @Autowired
    private IClientDao clientDao;

    @Autowired
    private IClientPeriodService clientPeriodService;

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
    public List<Client> findClients() {
        return clientDao.findClients();
    }

    @Override
    public List<Map> findClientsByParam(Map param) {
        return null;
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int saveAndSelectClient(Map client, int oId) {
        if(client == null || client.isEmpty()){
            throw new NullPointerException("企业信息为空！");
        }
        //保存客户信息并纳入客户
        Client cL = new Client();
        bindProperties(cL, client);
        cL.setManagerId(oId);
        Integer cId = clientDao.save(cL);
//        if(1==1){
//            throw new RuntimeException("事务回滚测试！");
//        }
//        return clientPeriodService.saveClientPeriod(cId, 1);
        return clientPeriodService.saveClientPeriod(cL, 1);
    }

    private void bindProperties(Client client, Map properties){
        if(client != null && properties != null){
            client.setAddress(StringUtil.safeToString(properties.get("address"), null));
            client.setName(StringUtil.safeToString(properties.get("name"), null));
            client.setClientCode(StringUtil.safeToString(properties.get("clientcode"), null));
            client.setLegal(StringUtil.safeToString(properties.get("legal"), null));
            //todo
            client.setRegistDate(new Date());
            //todo
            client.setRegistScale(0d);
        }
    }
}
