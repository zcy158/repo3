package cn.itcast.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    //转入方法
    public void transferIn(@Param("inName") String inName, @Param("money") double money);

    //转出方法
    public void transferOut(@Param("outName") String outName, @Param("money") double money);
}
