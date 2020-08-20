package com.example.sprbtdmfqq0805.service.impl;


import com.example.sprbtdmfqq0805.dao.UserMapper;
import com.example.sprbtdmfqq0805.service.inter.IUrUserfavInfoDeal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UrUserfavInfoDealImpl implements IUrUserfavInfoDeal {

    @Resource
    private UserMapper userMapper;

    @Override
    public String getActInfo(String favinsId) {

        if(favinsId == null || "".equals(favinsId)){
            return "入参不能为空";
        }

        String orderLineId = userMapper.getUrUserfavInfo(favinsId).getServOrderId();
        return orderLineId;
    }
}
