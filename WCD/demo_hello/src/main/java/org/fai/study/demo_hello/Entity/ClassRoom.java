package org.fai.study.demo_hello.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "class_room")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String class_name;
    private String number_member;

    public ClassRoom() {
    }

    public ClassRoom(String class_name, int id, String number_member) {
        this.class_name = class_name;
        this.id = id;
        this.number_member = number_member;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber_member() {
        return number_member;
    }

    public void setNumber_member(String number_member) {
        this.number_member = number_member;
    }
}
