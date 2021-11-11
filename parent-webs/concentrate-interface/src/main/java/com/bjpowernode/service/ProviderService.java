package com.bjpowernode.service;

import bean.Orde;


public interface ProviderService {
    Orde addOrder(String id, String goodsName, Double price, Integer amount);
}
