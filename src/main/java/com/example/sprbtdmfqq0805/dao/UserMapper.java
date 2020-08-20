package com.example.sprbtdmfqq0805.dao;

import com.example.sprbtdmfqq0805.entity.UrUserfavInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM UR_USERFAV_INFO WHERE FAVINS_ID = #{FAVINS_ID} ")
    public UrUserfavInfo getUrUserfavInfo(String favinsId);
}
