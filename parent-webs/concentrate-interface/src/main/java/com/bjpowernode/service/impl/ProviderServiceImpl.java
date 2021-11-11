package com.bjpowernode.service.impl;

import bean.Orde;
import com.bjpowernode.service.ProviderService;


import java.util.UUID;

public class ProviderServiceImpl implements ProviderService {
    @Override
    public Orde addOrder(String id, String goodsName, Double price, Integer acmount) {
        Orde order = new Orde();
        order.setId(UUID.randomUUID().toString().replace("-", ""));
        order.setGoodsName(goodsName);
        order.setPrice(price);
        order.setAmount(acmount);
        return order;
    }
}
