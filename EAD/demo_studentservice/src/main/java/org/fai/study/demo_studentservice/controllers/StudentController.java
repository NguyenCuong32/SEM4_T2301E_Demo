package org.fai.study.demo_studentservice.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private HttpServletRequest request;
    @GetMapping()
    public String GetStudent(){
        int serverPort = request.getServerPort();
        return "Server port: " + serverPort;
    }
}
