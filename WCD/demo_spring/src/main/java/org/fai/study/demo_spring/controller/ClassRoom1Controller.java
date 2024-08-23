package org.fai.study.demo_spring.controller;

import org.fai.study.demo_spring.entity.ClassRoom;
import org.fai.study.demo_spring.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/classroom")
public class ClassRoom1Controller {
    @Autowired
    private ClassRoomService classRoomService;
    @GetMapping()
    public String Index(){
        List<ClassRoom> classRooms = classRoomService.getClassRooms();
        return "index";
    }
}
