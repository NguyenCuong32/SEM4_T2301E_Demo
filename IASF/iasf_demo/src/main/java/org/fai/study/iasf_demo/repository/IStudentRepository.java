package org.fai.study.iasf_demo.repository;

import org.fai.study.iasf_demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
    @Query(value = "CALL SP_GET_ALL_STUDENTS()", nativeQuery = true)
    List<Object[]> getAllStudent();
}
