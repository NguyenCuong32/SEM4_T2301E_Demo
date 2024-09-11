package org.fai.study.iasf_demo.service;

import org.fai.study.iasf_demo.entity.Subject;
import org.fai.study.iasf_demo.entity.response.ResponseEntity;

import java.util.List;

public interface ISubjectService {
    ResponseEntity getAllSubject();
    ResponseEntity saveSubject(Subject subject);
}
