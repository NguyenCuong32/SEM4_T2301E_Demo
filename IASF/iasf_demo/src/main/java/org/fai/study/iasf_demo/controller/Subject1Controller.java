package org.fai.study.iasf_demo.controller;

import org.fai.study.iasf_demo.common.CommonDefine;
import org.fai.study.iasf_demo.entity.Subject;
import org.fai.study.iasf_demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subject")
public class Subject1Controller {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("")
    public String Index(Model model) {
        var subjects = subjectService.getAllSubject();
        if (subjects != null && subjects.getCode() == CommonDefine.SUCCESS_CODE) {
            var data = subjects.getData();
            model.addAttribute("subjects", data);
            return "subjects/index";
        } else {
            return "redirect:/subject";
        }

    }

    @PostMapping("/add")
    public String Add(@ModelAttribute Subject subject) {
        try {
            if (subject != null) {
                subjectService.saveSubject(subject);
                return "redirect:/subject";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/subject";
        }
        return "redirect:/subject";
    }
}
