package com.ljo.crm.web.service.impl;

import com.ljo.crm.dao.IClientPeriodDao;
import com.ljo.crm.enums.PeriodEnum;
import com.ljo.crm.enums.VaildEnum;
import com.ljo.crm.exception.IllegalException;
import com.ljo.crm.pojo.Client;
import com.ljo.crm.pojo.ClientPeriod;
import com.ljo.crm.web.service.IClientPeriodService;
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
 * Date: 2018/7/29
 * Time: 11:18
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional(readOnly = true)
public class ClientPeriodServiceImpl implements IClientPeriodService{

    @Autowired
    private IClientPeriodDao clientPeriodDao;

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public Integer saveClientPeriod(int cId, int periodNo) {

        //生成第一期
        ClientPeriod clientPeriod = new ClientPeriod();
        clientPeriod.setCreateTime(new Date());
        clientPeriod.setPeriodNo(periodNo);
        //clientPeriod.setPeriodName("第1期");
        clientPeriod.setcId(cId);
        clientPeriod.setRemoveFlag(VaildEnum.VAILD);
        clientPeriod.setStatus(PeriodEnum.FOLLOWING);
        if(1==1){
            throw new RuntimeException("事务回滚测试1！");
        }
        return clientPeriodDao.save(clientPeriod);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public Integer saveClientPeriod(Client client, int periodNo) {
        //生成第一期
        ClientPeriod clientPeriod = new ClientPeriod();
        clientPeriod.setCreateTime(new Date());
        clientPeriod.setPeriodNo(periodNo);
        //clientPeriod.setPeriodName("第1期");
        clientPeriod.setcId(client.getId());
        clientPeriod.setRemoveFlag(VaildEnum.VAILD);
        clientPeriod.setStatus(PeriodEnum.FOLLOWING);
        if(1==1){
            throw new RuntimeException("事务回滚测试1！");
        }
        return clientPeriodDao.save(clientPeriod);
    }

    @Override
    @Transactional(readOnly = true, rollbackFor = {Exception.class, IllegalException.class})
    public List<Map> listClientPeriods(Integer oId) {
        if(oId == null || oId <= 0){
            throw new IllegalException("获取期信息时，查询参数不合法！");
        }
        return clientPeriodDao.findUserClientPeroids(oId, null);
    }
}
