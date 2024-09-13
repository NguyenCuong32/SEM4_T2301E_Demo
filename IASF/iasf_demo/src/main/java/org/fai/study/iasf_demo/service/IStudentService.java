package org.fai.study.iasf_demo.service;

import org.fai.study.iasf_demo.entity.Student;
import org.fai.study.iasf_demo.entity.dtos.StudentDto;

import java.util.List;

public interface IStudentService {
    List<StudentDto> getAllStudent();
}
