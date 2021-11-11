package com.bjpowernode.consumer.controller;

import com.bjpowernode.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/buy")
    @ResponseBody
    public String buy(String goodsName,Double price,Integer amount){
        String content = consumerService.buyGood("123", "宝马", 100d, 2);
        return content;
    }

}
