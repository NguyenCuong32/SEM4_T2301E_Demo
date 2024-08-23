package org.fai.study.demo_spring.controller;

import org.fai.study.demo_spring.entity.ClassRoom;
import org.fai.study.demo_spring.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;
    @GetMapping("/classrooms")
    public List<ClassRoom> classRoomList() {
        return classRoomService.getClassRooms();
    }
    @PostMapping("/classroom")
    public ResponseEntity classRoom(@RequestBody ClassRoom classRoom) {
        try {
            classRoomService.saveClassRoom(classRoom);
            return ResponseEntity.ok(classRoom);
        }
        catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity) ResponseEntity.noContent();
        }
    }
}
