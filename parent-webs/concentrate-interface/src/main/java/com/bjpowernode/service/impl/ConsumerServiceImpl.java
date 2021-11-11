package com.bjpowernode.service.impl;

import bean.Orde;
import com.bjpowernode.service.ConsumerService;
import com.bjpowernode.service.ProviderService;
import com.bjpowernode.service.UserProviderService;


public class ConsumerServiceImpl implements ConsumerService {
    private UserProviderService userProviderService;
    private ProviderService providerService;

    public UserProviderService getUserProviderService() {
        return userProviderService;
    }

    public void setUserProviderService(UserProviderService userProviderService) {
        this.userProviderService = userProviderService;
    }

    public ProviderService getProviderService() {
        return providerService;
    }

    public void setProviderService(ProviderService providerService) {
        this.providerService = providerService;
    }

    @Override
    public String buyGood(String id, String goodsName, Double price, Integer amount) {


        Orde order = providerService.addOrder(id, goodsName, price, amount);

        String address = userProviderService.getAddress();
        return order.toString() + address;
    }
}
