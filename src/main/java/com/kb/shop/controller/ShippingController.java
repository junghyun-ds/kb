package com.kb.shop.controller;

import com.kb.shop.domain.ShippingInfo;
import com.kb.shop.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @Autowired
    private ShippingService shippingService;

    @PostMapping("/add")
    public ShippingInfo addShippingInfo(@RequestBody ShippingInfo shippingInfo) {
        return shippingService.saveShippingInfo(shippingInfo);
    }

    @GetMapping("/all")
    public List<ShippingInfo> getAllShippingInfo() {
        return shippingService.getAllShippingInfo();
    }

    @GetMapping("/{id}")
    public ShippingInfo getShippingInfoById(@PathVariable Long id) {
        return shippingService.getShippingInfoById(id);
    }
}
