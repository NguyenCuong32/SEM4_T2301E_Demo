package org.fai.study.demo_spring.repository;

import org.fai.study.demo_spring.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassRoomRepository extends JpaRepository<ClassRoom, Long> {
}
