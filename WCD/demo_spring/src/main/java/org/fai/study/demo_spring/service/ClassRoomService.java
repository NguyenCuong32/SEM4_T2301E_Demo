package org.fai.study.demo_spring.service;

import org.fai.study.demo_spring.entity.ClassRoom;
import org.fai.study.demo_spring.repository.IClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClassRoomService implements IClassRoomService {
    @Autowired
    IClassRoomRepository classRoomRepository;
    @Override
    public List<ClassRoom> getClassRooms() {
        var classRooms = classRoomRepository.findAll();
        return classRooms;
    }

    @Override
    public void saveClassRoom(ClassRoom classRoom) {
        classRoomRepository.save(classRoom);
    }

    @Override
    public void removeClassRoom(ClassRoom classRoom) {
        classRoomRepository.delete(classRoom);
    }
}
