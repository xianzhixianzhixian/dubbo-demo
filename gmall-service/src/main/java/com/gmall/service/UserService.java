package com.gmall.service;

import com.gmall.bean.UserAddress;

import java.util.List;

/**
 * 用户Service
 *
 * @author xianzhixianzhixian on 20200901 17:23
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     *
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);

}
