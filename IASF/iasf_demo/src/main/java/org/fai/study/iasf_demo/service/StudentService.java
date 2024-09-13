package org.fai.study.iasf_demo.service;

import org.fai.study.iasf_demo.entity.dtos.StudentDto;
import org.fai.study.iasf_demo.repository.IStudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<StudentDto> getAllStudent() {
        try {
            var results = studentRepository.getAllStudent();
            List<StudentDto> students = results.stream()
                    .map(result -> {
                        StudentDto dto = new StudentDto();
                        dto.setId((Integer) result[0]);
                        dto.setEmail((String) result[1]);
                        dto.setFirstName((String) result[2]);
                        dto.setLastName((String) result[3]);
                        dto.setClassName((String) result[4]);
                        modelMapper.map(result, dto);
                        return dto;
                    })
                    .collect(Collectors.toList());
            return students;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
}
