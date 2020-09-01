package com.gmall.service;

import com.gmall.bean.UserAddress;

import java.util.List;

/**
 * 订单Service
 *
 * @author xianzhixianzhixian on 20200901 17:23
 */
public interface OrderService {

    /**
     * 初始化订单
     *
     * @param userId
     */
    List<UserAddress> initOrder(String userId);

}
