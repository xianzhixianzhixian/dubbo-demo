package com.dubbo.service.impl;

import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import com.gmall.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    /**
     * Dubbo直连，不使用注册中心
     */
    @DubboReference(version = "1.0.0", timeout = 1000, url = "172.17.3.20:20880")
    private OrderService orderService;

    @DubboReference(version = "*", timeout = 1000, retries = 2, stub = "com.gmall.service.OrderServiceStub")
    private OrderService orderServiceStub;

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        return orderService.initOrder(userId);
    }

}
