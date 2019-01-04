package com.imooc.diveinspringboot.web;

import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/my/servlet")

public class Manservant extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws  SecurityException, IOException{

        resp.getWriter().println("Hello,TimWill");

    }
}
