package com.dubbo.service.impl;

import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 1、将服务提供者注册到注册中心
 * a、导入dubbo依赖以及操作zookeeper的客户端
 * b、配置服务提供者
 * 2、让服务消费者去注测中心订阅服务提供者的服务地址
 *
 * @author xianzhixianzhixian on 20200901 22:18
 */
@DubboService(version = "1.0.0", timeout = 1000)
@Service
public class OrderServiceImpl implements OrderService {

    /**
     * 单独设置接口的Dubbo配置
     *
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id：" + userId);
        //1、查询用户的收货地址
        UserAddress addressFirst = new UserAddress(1, "测试地址1", "1", "测试收件人1", "15995902970", "Y");
        UserAddress addressSecond = new UserAddress(2, "测试地址2", "1", "测试收件人2", "15995902976", "N");
        return Arrays.asList(addressFirst, addressSecond);
    }

}
