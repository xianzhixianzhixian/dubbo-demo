package com.dubbo.service.impl;

import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import com.gmall.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @DubboReference(version = "1.0.0", timeout = 1000)
    private OrderService orderService;

    @DubboReference(version = "*", timeout = 1000, retries = 2, stub = "com.gmall.service.OrderServiceStub")
    private OrderService orderServiceStub;

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        return orderServiceStub.initOrder(userId);
    }

}
