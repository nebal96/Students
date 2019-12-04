package com.example.students;


public class Student {
    String name;
    String lvl;
    String avg;
    String id;

    public Student(String name, String lvl, String avg, String id) {
        this.name = name;
        this.lvl = lvl;
        this.avg = avg;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
