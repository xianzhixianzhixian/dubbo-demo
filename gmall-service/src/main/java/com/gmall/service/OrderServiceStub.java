package com.gmall.service;

import com.gmall.bean.UserAddress;

import java.util.List;

/**
 * Dubbo本地存根功能的实现
 *
 * @author xianzhixianzhixian on 20200903 10:04
 */
public class OrderServiceStub implements OrderService {

    private final OrderService orderService;

    /**
     * 构造函数传入UserService真正的远程代理对象
     *
     * @param orderService
     */
    public OrderServiceStub(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("本地存根UserServiceStub代码调用");
        if (!"".equals(userId) && userId != null) {
            //调用远程方法
            return orderService.initOrder(userId);
        }
        return null;
    }
}
