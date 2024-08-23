package org.fai.study.demo_spring.service;

import org.fai.study.demo_spring.entity.ClassRoom;

import java.util.List;

public interface IClassRoomService {
    List<ClassRoom> getClassRooms();

   void saveClassRoom(ClassRoom classRoom);
}
