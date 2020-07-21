package cn.itcast.service;

import org.apache.ibatis.annotations.Param;

public interface AccountService {

    //转账
    public void transfer(@Param("inName") String inName,@Param("outName") String outName,@Param("money") double money);

}
