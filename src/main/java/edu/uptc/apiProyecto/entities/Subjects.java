package edu.uptc.apiProyecto.entities;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String teacher;
    private short cedits;

    public Subjects() {
    }

    public Subjects(String name, String teacher, short cedits) {
        this.name = name;
        this.teacher = teacher;
        this.cedits = cedits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public short getCedits() {
        return cedits;
    }

    public void setCedits(short cedits) {
        this.cedits = cedits;
    }
}
