package org.fai.study.demo_spring.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "class_room")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_class;
    @NotNull
    private String className;
    @NotNull
//    @Size(min = 1, max = 100)
    private Integer number_member;

    public ClassRoom() {
    }

    public ClassRoom(String className, int id, Integer number_member) {
        this.className = className;
        this.id_class = id;
        this.number_member = number_member;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getId() {
        return id_class;
    }

    public void setId(int id) {
        this.id_class = id;
    }

    public Integer getNumber_member() {
        return number_member;
    }

    public void setNumber_member(Integer number_member) {
        this.number_member = number_member;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "className='" + className + '\'' +
                ", id_class=" + id_class +
                ", number_member=" + number_member +
                '}';
    }
}
