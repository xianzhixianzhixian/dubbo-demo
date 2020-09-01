package com.dubbo.service.impl;

import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1、将服务提供者注册到注册中心
 *  a、导入dubbo依赖以及操作zookeeper的客户端
 *  b、配置服务提供者
 * 2、让服务消费者去注测中心订阅服务提供者的服务地址
 *
 * @author xianzhixianzhixian on 20200901 22:18
 */

@DubboService
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id：" + userId);
        //1、查询用户的收货地址
//        List<UserAddress> addressList = userService.getUserAddressList(userId);
//        return addressList;
        return null;
    }

}
