package com.dubbo.service.impl;

import com.gmall.bean.UserAddress;
import com.gmall.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@DubboService
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress addressFirst = new UserAddress(1, "测试地址1", "1", "测试收件人1", "15995902970", "Y");
        UserAddress addressSecond = new UserAddress(2, "测试地址2", "1", "测试收件人2", "15995902976", "N");
        return Arrays.asList(addressFirst, addressSecond);
    }

}
