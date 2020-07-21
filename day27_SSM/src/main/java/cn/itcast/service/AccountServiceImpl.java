package cn.itcast.service;

import cn.itcast.mapper.AccountMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Service         : 被Spring所管理
 * @Transactional   : 代表该类的所有方法都使用事务
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountMapper mapper;

    @Test
    public void transfer(String inName,String outName,double money){
        //转入
        mapper.transferIn(inName,money);
        //模拟转账出错
        //int i = 1/0;
        //转出
        mapper.transferOut(outName,money);
    }
}
