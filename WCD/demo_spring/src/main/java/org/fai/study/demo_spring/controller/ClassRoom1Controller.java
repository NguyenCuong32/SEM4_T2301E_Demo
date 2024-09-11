package org.fai.study.demo_spring.controller;

import jakarta.validation.Valid;
import org.fai.study.demo_spring.entity.ClassRoom;
import org.fai.study.demo_spring.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/classroom")
public class ClassRoom1Controller {
    @Autowired
    private ClassRoomService classRoomService;
    @GetMapping()
    public String Index(Model model){
        List<ClassRoom> classRooms = classRoomService.getClassRooms();
        model.addAttribute("classRooms", classRooms);
        return "classroom/index";
    }
    @PostMapping("/create")
    public String Add(@Valid @ModelAttribute("classRoom") ClassRoom classRoom, BindingResult bindingResult){
        try {
            System.out.println(classRoom.toString());
            if(bindingResult.hasErrors()){
                System.out.println("Some error occured");
                return "redirect:/classroom";
            }
            else {
                classRoomService.saveClassRoom(classRoom);
                return "redirect:/classroom";
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return "redirect:/classroom";
        }
    }
}
