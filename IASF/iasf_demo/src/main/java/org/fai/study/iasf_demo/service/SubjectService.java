package org.fai.study.iasf_demo.service;

import org.fai.study.iasf_demo.common.CommonDefine;
import org.fai.study.iasf_demo.entity.Subject;
import org.fai.study.iasf_demo.entity.response.ResponseEntity;
import org.fai.study.iasf_demo.repository.ISubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements ISubjectService {
    @Autowired
    private ISubjectRepository subjectRepository;

    @Override
    public ResponseEntity<Subject> getAllSubject() {
        ResponseEntity<Subject> responseEntity = new ResponseEntity<Subject>();
        try {
            List<Subject> subjectList = subjectRepository.findAll();
            responseEntity.setCode(CommonDefine.SUCCESS_CODE);
            responseEntity.setMsg(CommonDefine.SUCCESS_MSG_SAVE);
            responseEntity.setData(subjectList);
            return responseEntity;
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity.setCode(CommonDefine.FAIL_CODE);
            responseEntity.setMsg(CommonDefine.FAIL_MSG_SAVE);
            return responseEntity;
        }

    }

    @Override
    public ResponseEntity saveSubject(Subject subject) {
        ResponseEntity<Subject> responseEntity = new ResponseEntity<>();
        try {
            if (subject != null) {
                subjectRepository.save(subject);
                responseEntity.setCode(CommonDefine.SUCCESS_CODE);
                responseEntity.setMsg(CommonDefine.SUCCESS_MSG);
                return responseEntity;
            }

        } catch (Exception e) {
            e.printStackTrace();
            responseEntity.setCode(CommonDefine.FAIL_CODE);
            responseEntity.setMsg(CommonDefine.FAIL_MSG);
            return responseEntity;
        }
        return responseEntity;
    }
}
