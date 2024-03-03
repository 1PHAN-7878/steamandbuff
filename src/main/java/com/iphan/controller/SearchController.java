package com.iphan.controller;

import com.iphan.service.ShipinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/searchs")
public class SearchController {
    @Autowired
    ShipinService shipinService;
    @GetMapping("")
    public String showAll() throws IOException {
        String text;
        text = shipinService.getShiPinByIdFromBuff(111);
        return text;
    }
}
