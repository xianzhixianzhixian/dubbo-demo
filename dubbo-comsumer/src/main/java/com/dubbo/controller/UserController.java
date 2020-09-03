package com.dubbo.controller;

import com.dubbo.service.impl.UserServiceImpl;
import com.gmall.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/getUserAddressList")
    public List<UserAddress> getUserAddressList(String userId) {
        return userService.getUserAddressList(userId);
    }

    @GetMapping("/getUserAddressListStub")
    public List<UserAddress> getUserAddressListStub(String userId) {
        return userService.getUserAddressList(userId);
    }

}
