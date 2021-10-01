package com.antique.muzi.portal.service;

import com.antique.muzi.mbg.model.CmsOrderMaternityHotels;

import java.util.List;

/**
 * @Author songxuyang
 * @Date 2021/7/2 16:47
 * @Version 1.0
 */
public interface CmsOrderHotelsService {
    int order();

    int checkOrderById() ;

    int cancelOrder();

    List<CmsOrderMaternityHotels> getAllOrder();
}
