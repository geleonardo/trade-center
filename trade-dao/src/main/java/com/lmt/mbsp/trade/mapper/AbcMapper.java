package com.lmt.mbsp.trade.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AbcMapper {

    @Select(" select id from t_trade where 1=1 limit 1 ")
    Long testSelect();

}
