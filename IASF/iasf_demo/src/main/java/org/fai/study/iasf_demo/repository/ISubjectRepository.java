package org.fai.study.iasf_demo.repository;

import org.fai.study.iasf_demo.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepository extends JpaRepository<Subject, Long> {

}
