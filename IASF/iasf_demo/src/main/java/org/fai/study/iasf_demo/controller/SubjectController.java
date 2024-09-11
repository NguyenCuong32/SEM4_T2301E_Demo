package org.fai.study.iasf_demo.controller;

import org.fai.study.iasf_demo.entity.Subject;
import org.fai.study.iasf_demo.entity.response.ResponseEntity;
import org.fai.study.iasf_demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjects")
    public ResponseEntity getSubjectList() {
        var subjects = subjectService.getAllSubject();
        return subjects;
    }
}
