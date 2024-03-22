package com.iphan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController

public class ForwardController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public void hello(HttpServletRequest req, HttpServletResponse rsp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/html/home.html");

        requestDispatcher.forward(req, rsp);

    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public void forward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/html/find.html");

        requestDispatcher.forward(request, response);
    }
}
