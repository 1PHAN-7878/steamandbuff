package com.iphan.controller;

import com.iphan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class SearchController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String showAll(@RequestParam("name") String id) throws IOException {
    //        781598 test name
        String text;
        text = productService.getProductById(id);
        return text;
    }

    @GetMapping("/hello")
    public String hello(){
        return "123";
    }
}
