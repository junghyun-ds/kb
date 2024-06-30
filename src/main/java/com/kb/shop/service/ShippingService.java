package com.kb.shop.service;

import com.kb.shop.domain.ShippingInfo;
import com.kb.shop.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingService {

    @Autowired
    private ShippingRepository shippingRepository;

    public ShippingInfo saveShippingInfo(ShippingInfo shippingInfo) {
        return shippingRepository.save(shippingInfo);
    }

    public List<ShippingInfo> getAllShippingInfo() {
        return shippingRepository.findAll();
    }

    public ShippingInfo getShippingInfoById(Long id) {
        return shippingRepository.findById(id).orElse(null);
    }
}
