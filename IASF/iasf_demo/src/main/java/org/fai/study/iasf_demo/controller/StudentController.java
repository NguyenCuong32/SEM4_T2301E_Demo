package org.fai.study.iasf_demo.controller;

import org.fai.study.iasf_demo.entity.Student;
import org.fai.study.iasf_demo.entity.dtos.StudentDto;
import org.fai.study.iasf_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public List<StudentDto> getStudentList() {
        var students = studentService.getAllStudent();
        return students;
    }
}
