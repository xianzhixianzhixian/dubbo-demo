package com.dubbo.service.impl;

import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import com.gmall.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @DubboReference(version = "1.0.0", timeout = 1000)
    private OrderService orderService;

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        return orderService.initOrder(userId);
    }

}
